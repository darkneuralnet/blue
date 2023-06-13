package zendesk.messaging.p061ui;

import androidx.appcompat.app.AppCompatActivity;
import zendesk.belvedere.C31098b;
import zendesk.messaging.BelvedereMediaHolder;
import zendesk.messaging.MessagingViewModel;
import zendesk.messaging.TypingEventDispatcher;
/* renamed from: zendesk.messaging.ui.MessagingComposer_Factory */
/* loaded from: classes8.dex */
public final class MessagingComposer_Factory implements InterfaceC48812sj1<MessagingComposer> {
    private final Y94<AppCompatActivity> appCompatActivityProvider;
    private final Y94<BelvedereMediaHolder> belvedereMediaHolderProvider;
    private final Y94<C31098b> imageStreamProvider;
    private final Y94<InputBoxAttachmentClickListener> inputBoxAttachmentClickListenerProvider;
    private final Y94<InputBoxConsumer> inputBoxConsumerProvider;
    private final Y94<MessagingViewModel> messagingViewModelProvider;
    private final Y94<TypingEventDispatcher> typingEventDispatcherProvider;

    public MessagingComposer_Factory(Y94<AppCompatActivity> y94, Y94<MessagingViewModel> y942, Y94<C31098b> y943, Y94<BelvedereMediaHolder> y944, Y94<InputBoxConsumer> y945, Y94<InputBoxAttachmentClickListener> y946, Y94<TypingEventDispatcher> y947) {
        this.appCompatActivityProvider = y94;
        this.messagingViewModelProvider = y942;
        this.imageStreamProvider = y943;
        this.belvedereMediaHolderProvider = y944;
        this.inputBoxConsumerProvider = y945;
        this.inputBoxAttachmentClickListenerProvider = y946;
        this.typingEventDispatcherProvider = y947;
    }

    public static MessagingComposer_Factory create(Y94<AppCompatActivity> y94, Y94<MessagingViewModel> y942, Y94<C31098b> y943, Y94<BelvedereMediaHolder> y944, Y94<InputBoxConsumer> y945, Y94<InputBoxAttachmentClickListener> y946, Y94<TypingEventDispatcher> y947) {
        return new MessagingComposer_Factory(y94, y942, y943, y944, y945, y946, y947);
    }

    public static MessagingComposer newInstance(AppCompatActivity appCompatActivity, MessagingViewModel messagingViewModel, C31098b c31098b, BelvedereMediaHolder belvedereMediaHolder, InputBoxConsumer inputBoxConsumer, Object obj, TypingEventDispatcher typingEventDispatcher) {
        return new MessagingComposer(appCompatActivity, messagingViewModel, c31098b, belvedereMediaHolder, inputBoxConsumer, (InputBoxAttachmentClickListener) obj, typingEventDispatcher);
    }

    @Override // p000.Y94
    public MessagingComposer get() {
        return newInstance(this.appCompatActivityProvider.get(), this.messagingViewModelProvider.get(), this.imageStreamProvider.get(), this.belvedereMediaHolderProvider.get(), this.inputBoxConsumerProvider.get(), this.inputBoxAttachmentClickListenerProvider.get(), this.typingEventDispatcherProvider.get());
    }
}
