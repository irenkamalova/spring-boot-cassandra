package com.kamalova.cassandra.tweet;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends CassandraRepository<Tweet, String> {}
