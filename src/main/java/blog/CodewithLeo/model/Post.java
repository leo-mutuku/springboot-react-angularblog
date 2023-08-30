package blog.CodewithLeo.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.Instant;

@Entity
@Table
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @NotBlank
    private String title;
    @Lob
    @Column
    @NotBlank
    private String content;
    @Column
    private Instant createdOn;
    @Column
    private Instant updatedOn;
    @Column
    private String username;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Instant getCreatedOn() {
        return createdOn;
    }

    public Instant getUpdatedOn() {
        return updatedOn;
    }

    public String getUsername() {
        return username;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    public void setUpdatedOn(Instant updatedOn) {
        this.updatedOn = updatedOn;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
