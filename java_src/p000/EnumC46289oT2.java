package p000;
/* renamed from: oT2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC46289oT2 implements InterfaceC46640p31 {
    MESSAGE_DIALOG(20140204),
    PHOTOS(20140324),
    VIDEO(20141218),
    MESSENGER_GENERIC_TEMPLATE(20171115),
    MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE(20171115),
    MESSENGER_MEDIA_TEMPLATE(20171115);
    

    /* renamed from: b */
    public int f102046b;

    EnumC46289oT2(int i) {
        this.f102046b = i;
    }

    @Override // p000.InterfaceC46640p31
    /* renamed from: a */
    public int mo1063a() {
        return this.f102046b;
    }

    @Override // p000.InterfaceC46640p31
    public String getAction() {
        return "com.facebook.platform.action.request.MESSAGE_DIALOG";
    }
}
