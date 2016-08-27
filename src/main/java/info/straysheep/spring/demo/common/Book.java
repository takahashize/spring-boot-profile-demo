package info.straysheep.spring.demo.common;

public class Book {
    private String name;
    private String body;

    public Book() {

    }

    public Book(String name, String body) {
        this.name = name;
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

}
