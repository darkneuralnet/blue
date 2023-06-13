package zendesk.support;
/* loaded from: classes8.dex */
public class TicketFieldOption {

    /* renamed from: id */
    private long f121961id;
    private boolean isDefault;
    private String name;
    private String value;

    public TicketFieldOption(long j, String str, String str2, boolean z) {
        this.f121961id = j;
        this.name = str;
        this.value = str2;
        this.isDefault = z;
    }

    public static TicketFieldOption create(RawTicketFieldOption rawTicketFieldOption) {
        return new TicketFieldOption(rawTicketFieldOption.getId(), rawTicketFieldOption.getName(), rawTicketFieldOption.getValue(), rawTicketFieldOption.isDefault());
    }

    public long getId() {
        return this.f121961id;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public boolean isDefault() {
        return this.isDefault;
    }
}
