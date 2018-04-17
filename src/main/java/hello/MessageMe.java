package hello;

import org.springframework.data.annotation.Id;

public class MessageMe {

    @Id private long id;
    private String content;
    private String sender;

    public MessageMe(long id, String content, String sender) {
        this.id = id;
        this.content = content;
        this.sender = sender;
    }

    public MessageMe(String content, String sender) {
        this.content = content;
        this.sender = sender;
    }

    public MessageMe() {
    }

    public long getId(){return id;}

    public String getSender(){return sender;}

    public String getContent(){return content;}

    public void setSender(String sender){this.sender=sender;}

    public void setContent(String content){this.content=content;}
}
