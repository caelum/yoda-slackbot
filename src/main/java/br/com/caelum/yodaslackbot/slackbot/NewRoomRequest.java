package br.com.caelum.yodaslackbot.slackbot;

public class NewRoomRequest {

    private String token;
    private String channel_name;
    private String user_name;
    private String response_url;
    private String text;

    public void setToken(String token) {
        this.token = token;
    }

    public void setChannel_name(String channel_name) {
        this.channel_name = channel_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setResponse_url(String response_url) {
        this.response_url = response_url;
    }

    public String getToken() {
        return token;
    }

    public String getChannel_name() {
        return channel_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getText() {
        return text;
    }

    public String getResponse_url() {
        return response_url;
    }
}
