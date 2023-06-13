package p000;
/* renamed from: ay2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC38273ay2 {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true),
    NATIVE_ONLY(true, true, false, false, false, true),
    KATANA_ONLY(false, true, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false),
    WEB_VIEW_ONLY(false, false, true, false, false, false),
    DIALOG_ONLY(false, true, true, false, true, true),
    DEVICE_AUTH(false, false, false, true, false, false);
    

    /* renamed from: b */
    public final boolean f56697b;

    /* renamed from: c */
    public final boolean f56698c;

    /* renamed from: d */
    public final boolean f56699d;

    /* renamed from: e */
    public final boolean f56700e;

    /* renamed from: f */
    public final boolean f56701f;

    /* renamed from: g */
    public final boolean f56702g;

    EnumC38273ay2(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f56697b = z;
        this.f56698c = z2;
        this.f56699d = z3;
        this.f56700e = z4;
        this.f56701f = z5;
        this.f56702g = z6;
    }

    /* renamed from: a */
    public boolean m65194a() {
        return this.f56701f;
    }

    /* renamed from: b */
    public boolean m65193b() {
        return this.f56700e;
    }

    /* renamed from: c */
    public boolean m65192c() {
        return this.f56702g;
    }

    /* renamed from: d */
    public boolean m65191d() {
        return this.f56697b;
    }

    /* renamed from: e */
    public boolean m65190e() {
        return this.f56698c;
    }

    /* renamed from: f */
    public boolean m65189f() {
        return this.f56699d;
    }
}
