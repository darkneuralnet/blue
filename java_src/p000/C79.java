package p000;
/* renamed from: C79 */
/* loaded from: classes5.dex */
public enum C79 implements InterfaceC38308b18 {
    TYPE_UNKNOWN(0),
    TYPE_CONTACT_INFO(1),
    TYPE_EMAIL(2),
    TYPE_ISBN(3),
    TYPE_PHONE(4),
    TYPE_PRODUCT(5),
    TYPE_SMS(6),
    TYPE_TEXT(7),
    TYPE_URL(8),
    TYPE_WIFI(9),
    TYPE_GEO(10),
    TYPE_CALENDAR_EVENT(11),
    TYPE_DRIVER_LICENSE(12);
    

    /* renamed from: b */
    public final int f3487b;

    C79(int i) {
        this.f3487b = i;
    }

    @Override // p000.InterfaceC38308b18
    public final int zza() {
        return this.f3487b;
    }
}
