package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.print.attribute.standard.DateTimeAtCreation;

@Entity(name="tweet")
public class TweetEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String property;
	private String TweetBody;
	private DateTimeAtCreation TimeStamp;
	public DateTimeAtCreation getTimeStamp() {
		return TimeStamp;
	}
	public void setTimeStamp(DateTimeAtCreation timeStamp) {
		TimeStamp = timeStamp;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public String getTweetBody() {
		return TweetBody;
	}
	public void setTweetBody(String tweetBody) {
		TweetBody = tweetBody;
	}
	

}
