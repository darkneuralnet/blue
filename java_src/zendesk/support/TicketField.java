package zendesk.support;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes8.dex */
public class TicketField {
    private String description;

    /* renamed from: id */
    private long f121960id;
    private String regexpForValidation;
    private List<TicketFieldOption> ticketFieldOptions;
    private List<TicketFieldSystemOption> ticketFieldSystemOptions;
    private String title;
    private String titleInPortal;
    private TicketFieldType type;

    public TicketField(long j, TicketFieldType ticketFieldType, String str, String str2, String str3, String str4, List<TicketFieldOption> list, List<TicketFieldSystemOption> list2) {
        this.f121960id = j;
        this.type = ticketFieldType;
        this.title = str;
        this.titleInPortal = str2;
        this.description = str3;
        this.regexpForValidation = str4;
        this.ticketFieldOptions = list;
        this.ticketFieldSystemOptions = list2;
    }

    public static TicketField create(RawTicketField rawTicketField) {
        TicketFieldType ticketFieldType;
        ArrayList arrayList = new ArrayList();
        for (RawTicketFieldOption rawTicketFieldOption : rawTicketField.getCustomFieldOptions()) {
            arrayList.add(TicketFieldOption.create(rawTicketFieldOption));
        }
        ArrayList arrayList2 = new ArrayList();
        for (RawTicketFieldSystemOption rawTicketFieldSystemOption : rawTicketField.getSystemFieldOptions()) {
            arrayList2.add(TicketFieldSystemOption.create(rawTicketFieldSystemOption));
        }
        if (rawTicketField.getType() != null) {
            ticketFieldType = rawTicketField.getType();
        } else {
            ticketFieldType = TicketFieldType.Unknown;
        }
        return new TicketField(rawTicketField.getId(), ticketFieldType, rawTicketField.getTitle(), rawTicketField.getTitleInPortal(), rawTicketField.getDescription(), rawTicketField.getRegexpForValidation(), arrayList, arrayList2);
    }

    public String getDescription() {
        return this.description;
    }

    public long getId() {
        return this.f121960id;
    }

    public String getRegexpForValidation() {
        return this.regexpForValidation;
    }

    public List<TicketFieldOption> getTicketFieldOptions() {
        return C43505jm0.m29954c(this.ticketFieldOptions);
    }

    public List<TicketFieldSystemOption> getTicketFieldSystemOptions() {
        return C43505jm0.m29954c(this.ticketFieldSystemOptions);
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
