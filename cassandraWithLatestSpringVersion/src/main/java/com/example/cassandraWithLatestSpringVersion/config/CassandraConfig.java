package com.example.cassandraWithLatestSpringVersion.config;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.internal.core.type.codec.CustomCodec;

@Configuration
public class CassandraConfig  {
	
	@Value("${cassandra.contact-points}")
	private String cassandrContactPoints;

	@Value("${cassandra.port}")
	private int cassandraPort;

	@Value("${cassandra.username}")
	private String cassandraUserName;

	@Value("${cassandra.password}")
	private String cassandraPassword;

	@Value("${cassandra.region}")
	private String casssandraRegion;

	@Value("${cassandra.keyspace-name}")
	private String cassandrNamesapace;
	
	@Bean
	public CqlSession sessionBuilder() throws UnknownHostException {
		InetAddress addrOne = InetAddress.getByName(cassandrContactPoints);
		InetSocketAddress addrSocOne = new InetSocketAddress(addrOne,cassandraPort);

	CqlSession sessionOne = CqlSession.builder().withAuthCredentials(cassandraUserName, cassandraPassword).
			addContactPoint(addrSocOne).
			withLocalDatacenter(casssandraRegion).
			withKeyspace(cassandrNamesapace).build();

	return sessionOne;
	}
	
	
	
}
