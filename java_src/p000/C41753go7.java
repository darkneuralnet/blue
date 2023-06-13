package p000;
/* renamed from: go7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41753go7 {

    /* renamed from: b */
    public final String f84294b;

    /* renamed from: a */
    public final String f84293a = "722550545529";

    /* renamed from: c */
    public final String f84295c = "82c62205f0ef0ea96608a8";

    public C41753go7(String str, String str2, String str3) {
        this.f84294b = str2;
    }

    /* renamed from: a */
    public final String m37462a() {
        return this.f84294b;
    }

    /* renamed from: b */
    public final String m37461b() {
        String str = this.f84293a;
        String str2 = this.f84295c;
        StringBuilder sb = new StringBuilder(str.length() + 11 + str2.length());
        sb.append("1:");
        sb.append(str);
        sb.append(":android:");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: c */
    public final String m37460c() {
        return this.f84293a;
    }
}
