package zendesk.messaging.p061ui;

import android.content.res.Resources;
/* renamed from: zendesk.messaging.ui.MessagingCellPropsFactory_Factory */
/* loaded from: classes8.dex */
public final class MessagingCellPropsFactory_Factory implements InterfaceC48812sj1<MessagingCellPropsFactory> {
    private final Y94<Resources> resourcesProvider;

    public MessagingCellPropsFactory_Factory(Y94<Resources> y94) {
        this.resourcesProvider = y94;
    }

    public static MessagingCellPropsFactory_Factory create(Y94<Resources> y94) {
        return new MessagingCellPropsFactory_Factory(y94);
    }

    public static MessagingCellPropsFactory newInstance(Resources resources) {
        return new MessagingCellPropsFactory(resources);
    }

    @Override // p000.Y94
    public MessagingCellPropsFactory get() {
        return newInstance(this.resourcesProvider.get());
    }
}
