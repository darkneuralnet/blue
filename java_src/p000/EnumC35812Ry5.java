package p000;
/* renamed from: Ry5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC35812Ry5 implements InterfaceC46640p31 {
    SHARE_STORY_ASSET(20170417);
    

    /* renamed from: b */
    public int f32981b;

    EnumC35812Ry5(int i) {
        this.f32981b = i;
    }

    @Override // p000.InterfaceC46640p31
    /* renamed from: a */
    public int mo1063a() {
        return this.f32981b;
    }

    @Override // p000.InterfaceC46640p31
    public String getAction() {
        return "com.facebook.platform.action.request.SHARE_STORY";
    }
}
