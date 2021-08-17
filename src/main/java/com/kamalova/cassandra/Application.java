package com.kamalova.cassandra;

import com.kamalova.cassandra.tweet.Tweet;
import com.kamalova.cassandra.tweet.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.UUID;

@SpringBootApplication
public class Application implements CommandLineRunner {

  @Autowired private TweetRepository tweetRepository;

  public static void main(final String args[]) {
    SpringApplication.run(Application.class);
  }

  @Override
  public void run(String... args) {
    tweetRepository.deleteAll();
    final Tweet tweet0 = new Tweet(UUID.randomUUID().toString(), "Google released new design for icons in 2020!");
    final Tweet tweet1 = new Tweet(UUID.randomUUID().toString(), "Apple released new OS in 2020!");
    final Tweet tweet2 = new Tweet(UUID.randomUUID().toString(), "Google release new searching features!" );
    tweetRepository.insert(Arrays.asList(tweet0, tweet1, tweet2));
    tweetRepository.findAll().forEach(System.out::println);
  }
}
