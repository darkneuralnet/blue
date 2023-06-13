package p000;
/* renamed from: EI4 */
/* loaded from: classes5.dex */
public interface EI4 {

    /* renamed from: EI4$a */
    /* loaded from: classes5.dex */
    public enum EnumC1777a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        

        /* renamed from: b */
        public final boolean f7218b;

        EnumC1777a(boolean z) {
            this.f7218b = z;
        }

        /* renamed from: a */
        public boolean m109232a() {
            return this.f7218b;
        }
    }

    /* renamed from: a */
    boolean mo20678a();

    /* renamed from: b */
    boolean mo20677b(InterfaceC45599nI4 interfaceC45599nI4);

    /* renamed from: c */
    boolean mo20676c(InterfaceC45599nI4 interfaceC45599nI4);

    /* renamed from: d */
    void mo20675d(InterfaceC45599nI4 interfaceC45599nI4);

    /* renamed from: g */
    boolean mo20672g(InterfaceC45599nI4 interfaceC45599nI4);

    EI4 getRoot();

    /* renamed from: h */
    void mo20671h(InterfaceC45599nI4 interfaceC45599nI4);
}
