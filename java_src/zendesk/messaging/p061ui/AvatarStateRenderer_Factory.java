package zendesk.messaging.p061ui;
/* renamed from: zendesk.messaging.ui.AvatarStateRenderer_Factory */
/* loaded from: classes8.dex */
public final class AvatarStateRenderer_Factory implements InterfaceC48812sj1<AvatarStateRenderer> {
    private final Y94<C42732iT3> picassoProvider;

    public AvatarStateRenderer_Factory(Y94<C42732iT3> y94) {
        this.picassoProvider = y94;
    }

    public static AvatarStateRenderer_Factory create(Y94<C42732iT3> y94) {
        return new AvatarStateRenderer_Factory(y94);
    }

    public static AvatarStateRenderer newInstance(C42732iT3 c42732iT3) {
        return new AvatarStateRenderer(c42732iT3);
    }

    @Override // p000.Y94
    public AvatarStateRenderer get() {
        return newInstance(this.picassoProvider.get());
    }
}
