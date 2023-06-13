package zendesk.support;
/* loaded from: classes8.dex */
class RawTicketFieldOption {

    /* renamed from: id */
    private long f121953id;
    @InterfaceC41208ft5("default")
    private boolean isDefault;
    private String name;
    private String rawName;
    private String value;

    public static TicketFieldOption create(RawTicketFieldOption rawTicketFieldOption) {
        return new TicketFieldOption(rawTicketFieldOption.getId(), rawTicketFieldOption.getName(), rawTicketFieldOption.getValue(), rawTicketFieldOption.isDefault());
    }

    public long getId() {
        return this.f121953id;
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
