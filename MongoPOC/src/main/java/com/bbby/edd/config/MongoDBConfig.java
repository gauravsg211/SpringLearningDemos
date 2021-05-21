package com.bbby.edd.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;

@Configuration
@EnableMongoRepositories(basePackages = "com.concretepage.repository")
public class MongoDBConfig 
{
	@Value("${spring.data.mongodb.database}")
	private String databaseName;
	
//	@Value("${spring.data.mongodb.host}")
//	private String hostIp;
//	
//	@Value("#{new Integer('${spring.data.mongodb.port}')}")
//	private int port;
	
//	@Value("${spring.data.mongodb.username}")
//	private String dbUser;
//	
//	@Value("${spring.data.mongodb.password}")
//	private String dbPassword;
	
	@Value("${spring.data.mongodb.uri}")
	private String url;
	
	public String getDatabaseName() {
		return databaseName;
	}
	@Bean
	public MongoClient mongoClient() 
	{
//		ServerAddress address = new ServerAddress(hostIp, port);
//		MongoCredential credential = MongoCredential.createCredential(dbUser, getDatabaseName(), dbPassword.toCharArray());
//		MongoClientOptions options = new MongoClientOptions.Builder().build();
		
		
		//when connecting to mongo atlas
		MongoClientURI uri = new MongoClientURI(
			    "mongodb+srv://gaurav:gauRAV1234@cluster0.9cqhs.mongodb.net/sampleDatabase?retryWrites=true&w=majority");
			MongoClient mongoClient = new MongoClient(uri);
			
        
		return mongoClient;
	}
	
	@Bean
	public MongoDbFactory mongoDbFactory() {
		MongoDbFactory factory = new SimpleMongoDbFactory(mongoClient(), getDatabaseName());
		return factory;
	}
	
	@Bean
	public MongoTemplate mongoTemplate() {
		MongoTemplate template = new MongoTemplate(mongoDbFactory());
		return template;
	}
	
	
} 
