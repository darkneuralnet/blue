package p000;
/* renamed from: zb0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC52881zb0 implements InterfaceC46640p31 {
    SHARE_CAMERA_EFFECT(20170417);
    

    /* renamed from: b */
    public int f121566b;

    EnumC52881zb0(int i) {
        this.f121566b = i;
    }

    @Override // p000.InterfaceC46640p31
    /* renamed from: a */
    public int mo1063a() {
        return this.f121566b;
    }

    @Override // p000.InterfaceC46640p31
    public String getAction() {
        return "com.facebook.platform.action.request.CAMERA_EFFECT";
    }
}
