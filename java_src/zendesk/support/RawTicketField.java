package zendesk.support;

import java.util.Date;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class RawTicketField {
    private long accountId;
    @InterfaceC41208ft5("isActive")
    private boolean active;
    @InterfaceC41208ft5("isCollapsedForAgents")
    private boolean collapsedForAgents;
    private Date createdAt;
    private List<RawTicketFieldOption> customFieldOptions;
    private String defaultContentKey;
    private String description;
    @InterfaceC41208ft5("isEditableInPortal")
    private boolean editableInPortal;
    @InterfaceC41208ft5("isExportable")
    private boolean exportable;

    /* renamed from: id */
    private long f121952id;
    private int position;
    private String regexpForValidation;
    @InterfaceC41208ft5("isRequired")
    private boolean required;
    @InterfaceC41208ft5("isRequiredInPortal")
    private boolean requiredInPortal;
    private long subTypeId;
    private List<RawTicketFieldSystemOption> systemFieldOptions;
    private String tag;
    private String title;
    private String titleInPortal;
    private TicketFieldType type;
    private Date updatedAt;
    @InterfaceC41208ft5("isVisibleInPortal")
    private boolean visibleInPortal;

    public List<RawTicketFieldOption> getCustomFieldOptions() {
        return C43505jm0.m29954c(this.customFieldOptions);
    }

    public String getDescription() {
        return this.description;
    }

    public long getId() {
        return this.f121952id;
    }

    public String getRegexpForValidation() {
        return this.regexpForValidation;
    }

    public List<RawTicketFieldSystemOption> getSystemFieldOptions() {
        return C43505jm0.m29954c(this.systemFieldOptions);
    }

    public String getTitle() {
        return this.title;
    }

    public String getTitleInPortal() {
        return this.titleInPortal;
    }

    public TicketFieldType getType() {
        return this.type;
    }
}
