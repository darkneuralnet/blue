package zendesk.support;

import java.util.Date;
import java.util.List;
/* loaded from: classes8.dex */
class RawTicketForm {
    private Date createdAt;
    private boolean endUserVisible;

    /* renamed from: id */
    private long f121954id;
    private boolean inAllBrands;
    private boolean inAllOrganizations;
    @InterfaceC41208ft5("active")
    private boolean isActive;
    @InterfaceC41208ft5("default")
    private boolean isDefault;
    private String name;
    private int position;
    private String rawDisplayName;
    private String rawName;
    private List<Long> restrictedBrandIds;
    private List<Long> restrictedOrganizationIds;
    private List<Long> ticketFieldIds;
    private Date updatedAt;
    private String url;

    public static TicketForm create(RawTicketForm rawTicketForm, List<TicketField> list) {
        return new TicketForm(rawTicketForm.getId(), rawTicketForm.getName(), list);
    }

    public long getId() {
        return this.f121954id;
    }

    public String getName() {
        return this.name;
    }

    public List<Long> getTicketFieldIds() {
        return C43505jm0.m29954c(this.ticketFieldIds);
    }
}
