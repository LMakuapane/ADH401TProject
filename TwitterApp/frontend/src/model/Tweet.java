package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.print.attribute.standard.DateTimeAtCreation;

@ManagedBean(name="tweet")
@SessionScoped
public class Tweet {
	
	
	private String property;
	private String TweetBody;
	private DateTimeAtCreation TimeStamp;

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
	
	public DateTimeAtCreation getTimeStamp() {
		return TimeStamp;
	}
	public void setTimeStamp(DateTimeAtCreation timeStamp) {
		TimeStamp = timeStamp;
	}
	public TweetEntity getEntity()
	{
		TweetEntity tweetentity = new TweetEntity();
		tweetentity.setProperty(property);
		tweetentity.setTimeStamp(TimeStamp);
		tweetentity.setTweetBody(TweetBody);
		return tweetentity;
	}

}
