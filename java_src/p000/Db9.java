package p000;
/* renamed from: Db9 */
/* loaded from: classes5.dex */
public final class Db9 {

    /* renamed from: b */
    public final String f6031b;

    /* renamed from: a */
    public final String f6030a = "722550545529";

    /* renamed from: c */
    public final String f6032c = "82c62205f0ef0ea96608a8";

    public Db9(String str, String str2, String str3) {
        this.f6031b = str2;
    }

    /* renamed from: a */
    public final String m110117a() {
        return this.f6031b;
    }

    /* renamed from: b */
    public final String m110116b() {
        String str = this.f6030a;
        String str2 = this.f6032c;
        StringBuilder sb = new StringBuilder(str.length() + 11 + str2.length());
        sb.append("1:");
        sb.append(str);
        sb.append(":android:");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: c */
    public final String m110115c() {
        return this.f6030a;
    }
}
