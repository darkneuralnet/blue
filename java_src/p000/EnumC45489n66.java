package p000;
/* renamed from: n66  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC45489n66 {
    SwitchToBrowser("switchaway", "browser"),
    SwitchToWallet("switchaway", "wallet"),
    Cancel("switchback", "cancel"),
    Return("switchback", "return"),
    Error("switchback", "cancel", true);
    

    /* renamed from: b */
    public final String f99456b;

    /* renamed from: c */
    public final String f99457c;

    /* renamed from: d */
    public final boolean f99458d;

    EnumC45489n66(String str, String str2, boolean z) {
        this.f99456b = str;
        this.f99457c = str2;
        this.f99458d = z;
    }

    /* renamed from: a */
    public String m24326a() {
        return this.f99456b + ":" + this.f99457c;
    }

    /* renamed from: b */
    public boolean m24325b() {
        return this.f99458d;
    }

    EnumC45489n66(String str, String str2) {
        this(str, str2, false);
    }
}
