package p000;
/* renamed from: Ly5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC34408Ly5 implements InterfaceC46640p31 {
    SHARE_DIALOG(20130618),
    PHOTOS(20140204),
    VIDEO(20141028),
    MULTIMEDIA(20160327),
    HASHTAG(20160327),
    LINK_SHARE_QUOTES(20160327);
    

    /* renamed from: b */
    public int f22364b;

    EnumC34408Ly5(int i) {
        this.f22364b = i;
    }

    @Override // p000.InterfaceC46640p31
    /* renamed from: a */
    public int mo1063a() {
        return this.f22364b;
    }

    @Override // p000.InterfaceC46640p31
    public String getAction() {
        return "com.facebook.platform.action.request.FEED_DIALOG";
    }
}
