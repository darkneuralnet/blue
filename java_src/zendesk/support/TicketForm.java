package zendesk.support;

import java.util.List;
/* loaded from: classes8.dex */
public class TicketForm {

    /* renamed from: id */
    private long f121962id;
    private String name;
    private List<TicketField> ticketFields;

    public TicketForm(long j, String str, List<TicketField> list) {
        this.f121962id = j;
        this.name = str;
        this.ticketFields = C43505jm0.m29954c(list);
    }

    public long getId() {
        return this.f121962id;
    }

    public String getName() {
        return this.name;
    }

    public List<TicketField> getTicketFields() {
        return C43505jm0.m29954c(this.ticketFields);
    }
}
