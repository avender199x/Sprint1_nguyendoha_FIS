package Model;

import java.time.LocalDateTime;

public abstract class AbstractEntity {
    private Long id;
    private int version;
    private LocalDateTime createAt;
    private LocalDateTime modifiedAt;

    public AbstractEntity(Long id, int version) {
        this.id = id;
        this.version = version;
        this.createAt = LocalDateTime.now();
        this.modifiedAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
