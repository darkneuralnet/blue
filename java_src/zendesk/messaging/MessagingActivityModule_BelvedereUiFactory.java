package zendesk.messaging;

import androidx.appcompat.app.AppCompatActivity;
import zendesk.belvedere.C31098b;
/* loaded from: classes8.dex */
public final class MessagingActivityModule_BelvedereUiFactory implements InterfaceC48812sj1<C31098b> {
    private final Y94<AppCompatActivity> activityProvider;

    public MessagingActivityModule_BelvedereUiFactory(Y94<AppCompatActivity> y94) {
        this.activityProvider = y94;
    }

    public static C31098b belvedereUi(AppCompatActivity appCompatActivity) {
        return (C31098b) C51679xZ3.m5002e(MessagingActivityModule.belvedereUi(appCompatActivity));
    }

    public static MessagingActivityModule_BelvedereUiFactory create(Y94<AppCompatActivity> y94) {
        return new MessagingActivityModule_BelvedereUiFactory(y94);
    }

    @Override // p000.Y94
    public C31098b get() {
        return belvedereUi(this.activityProvider.get());
    }
}
