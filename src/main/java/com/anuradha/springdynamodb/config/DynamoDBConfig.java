package com.anuradha.springdynamodb.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class DynamoDBConfig {

    private final AwsProperties awsProperties;

    @Bean
    public DynamoDBMapper dynamoDBMapper() {
        return new DynamoDBMapper(amazonDynamoDB());
    }

    public AmazonDynamoDB amazonDynamoDB() {
        return AmazonDynamoDBClientBuilder.standard().
                withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(awsProperties.getEndpoint(), awsProperties.getRegion())).
                withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(awsProperties.getAccessKey(), awsProperties.getSecretKey()))).
                build();
    }
}
