package org.mengleyao.forwardtogether.springbootstudy1.domain.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 书本实体类(测试安全配置)
 *
 * @author zhangmeng0725
 */
@Component
@ConfigurationProperties(prefix = "book")
@PropertySource("classpath:properties/book.properties")
public class BookEntity {
    /**
     * 书名
     */
    private String name;
    /**
     * 作者
     */
    private String author;
    /**
     * 价格
     */
    private Float price;

    public BookEntity() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
