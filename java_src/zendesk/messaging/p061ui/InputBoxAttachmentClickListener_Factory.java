package zendesk.messaging.p061ui;

import androidx.appcompat.app.AppCompatActivity;
import zendesk.belvedere.C31098b;
import zendesk.messaging.BelvedereMediaHolder;
/* renamed from: zendesk.messaging.ui.InputBoxAttachmentClickListener_Factory */
/* loaded from: classes8.dex */
public final class InputBoxAttachmentClickListener_Factory implements InterfaceC48812sj1<InputBoxAttachmentClickListener> {
    private final Y94<AppCompatActivity> activityProvider;
    private final Y94<BelvedereMediaHolder> belvedereMediaHolderProvider;
    private final Y94<C31098b> imageStreamProvider;

    public InputBoxAttachmentClickListener_Factory(Y94<AppCompatActivity> y94, Y94<C31098b> y942, Y94<BelvedereMediaHolder> y943) {
        this.activityProvider = y94;
        this.imageStreamProvider = y942;
        this.belvedereMediaHolderProvider = y943;
    }

    public static InputBoxAttachmentClickListener_Factory create(Y94<AppCompatActivity> y94, Y94<C31098b> y942, Y94<BelvedereMediaHolder> y943) {
        return new InputBoxAttachmentClickListener_Factory(y94, y942, y943);
    }

    public static InputBoxAttachmentClickListener newInstance(AppCompatActivity appCompatActivity, C31098b c31098b, BelvedereMediaHolder belvedereMediaHolder) {
        return new InputBoxAttachmentClickListener(appCompatActivity, c31098b, belvedereMediaHolder);
    }

    @Override // p000.Y94
    public InputBoxAttachmentClickListener get() {
        return newInstance(this.activityProvider.get(), this.imageStreamProvider.get(), this.belvedereMediaHolderProvider.get());
    }
}
