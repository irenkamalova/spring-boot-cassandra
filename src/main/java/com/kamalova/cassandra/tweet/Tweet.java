package com.kamalova.cassandra.tweet;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("tweets")
public class Tweet {

  @PrimaryKey
  @Column("id")
  private String id;

  @Column("text")
  private String text;

  public Tweet(String id, String text) {
    this.id = id;
    this.text = text;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return "Tweet{" +
            "id='" + id + '\'' +
            ", text='" + text + '\'' +
            '}';
  }
}
