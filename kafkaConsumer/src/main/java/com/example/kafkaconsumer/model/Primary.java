package com.example.kafkaconsumer.model;

import lombok.Data;
import java.io.Serializable;

@Data
public class Primary implements Serializable {
	private static final long serialVersionUID = 1L;
    private String traceId;
    private String orderNumber;
    private Secondary customerInformation;
    private String requestType;

}
