package zendesk.messaging;

import androidx.appcompat.app.AppCompatActivity;
import zendesk.messaging.components.DateProvider;
/* loaded from: classes8.dex */
public final class MessagingDialog_Factory implements InterfaceC48812sj1<MessagingDialog> {
    private final Y94<AppCompatActivity> appCompatActivityProvider;
    private final Y94<DateProvider> dateProvider;
    private final Y94<MessagingViewModel> messagingViewModelProvider;

    public MessagingDialog_Factory(Y94<AppCompatActivity> y94, Y94<MessagingViewModel> y942, Y94<DateProvider> y943) {
        this.appCompatActivityProvider = y94;
        this.messagingViewModelProvider = y942;
        this.dateProvider = y943;
    }

    public static MessagingDialog_Factory create(Y94<AppCompatActivity> y94, Y94<MessagingViewModel> y942, Y94<DateProvider> y943) {
        return new MessagingDialog_Factory(y94, y942, y943);
    }

    public static MessagingDialog newInstance(AppCompatActivity appCompatActivity, MessagingViewModel messagingViewModel, DateProvider dateProvider) {
        return new MessagingDialog(appCompatActivity, messagingViewModel, dateProvider);
    }

    @Override // p000.Y94
    public MessagingDialog get() {
        return newInstance(this.appCompatActivityProvider.get(), this.messagingViewModelProvider.get(), this.dateProvider.get());
    }
}
