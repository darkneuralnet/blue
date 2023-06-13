package zendesk.core;

import java.util.Date;
import java.util.List;
/* loaded from: classes8.dex */
public class UserField {
    private Boolean active;
    private Date createdAt;
    private List<UserFieldOption> customFieldOptions;
    private String description;

    /* renamed from: id */
    private Long f121912id;
    private String key;
    private Long position;
    private String rawDescription;
    private String rawTitle;
    private String regexpForValidation;
    private Boolean system;
    private String title;
    private Date updatedAt;
    private String url;
    @InterfaceC41208ft5("type")
    private UserFieldType userFieldType;

    /* loaded from: classes8.dex */
    public enum UserFieldType {
        Integer,
        Decimal,
        Checkbox,
        Date,
        Text,
        Textarea,
        Dropdown,
        Regexp
    }

    public Date getCreatedAt() {
        if (this.createdAt == null) {
            return null;
        }
        return new Date(this.createdAt.getTime());
    }

    public String getDescription() {
        return this.description;
    }

    public Long getId() {
        return this.f121912id;
    }

    public String getKey() {
        return this.key;
    }

    public Long getPosition() {
        return this.position;
    }

    public String getRawDescription() {
        return this.rawDescription;
    }

    public String getRawTitle() {
        return this.rawTitle;
    }

    public String getRegexpForValidation() {
        return this.regexpForValidation;
    }

    public String getTitle() {
        return this.title;
    }

    public Date getUpdatedAt() {
        if (this.updatedAt == null) {
            return null;
        }
        return new Date(this.updatedAt.getTime());
    }

    public String getUrl() {
        return this.url;
    }

    public List<UserFieldOption> getUserFieldOptions() {
        return C43505jm0.m29954c(this.customFieldOptions);
    }

    public UserFieldType getUserFieldType() {
        return this.userFieldType;
    }

    public boolean isActive() {
        Boolean bool = this.active;
        return bool != null && bool.booleanValue();
    }

    public boolean isSystem() {
        Boolean bool = this.system;
        return bool != null && bool.booleanValue();
    }
}
