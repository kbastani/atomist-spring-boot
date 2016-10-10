package com.demo;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@EnableNeo4jRepositories("com.demo.domain")
public class GraphConfiguration extends Neo4jConfiguration {
    @Override
    public SessionFactory getSessionFactory() {
        return new SessionFactory("com.demo.domain");
    }
}
