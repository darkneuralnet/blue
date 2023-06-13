package zendesk.messaging;

import dagger.MembersInjector;
import zendesk.messaging.p061ui.MessagingCellFactory;
import zendesk.messaging.p061ui.MessagingComposer;
/* loaded from: classes8.dex */
public final class MessagingActivity_MembersInjector implements MembersInjector<MessagingActivity> {
    public static void injectEventFactory(MessagingActivity messagingActivity, EventFactory eventFactory) {
        messagingActivity.eventFactory = eventFactory;
    }

    public static void injectMessagingCellFactory(MessagingActivity messagingActivity, MessagingCellFactory messagingCellFactory) {
        messagingActivity.messagingCellFactory = messagingCellFactory;
    }

    public static void injectMessagingComposer(MessagingActivity messagingActivity, MessagingComposer messagingComposer) {
        messagingActivity.messagingComposer = messagingComposer;
    }

    public static void injectMessagingDialog(MessagingActivity messagingActivity, Object obj) {
        messagingActivity.messagingDialog = (MessagingDialog) obj;
    }

    public static void injectPicasso(MessagingActivity messagingActivity, C42732iT3 c42732iT3) {
        messagingActivity.picasso = c42732iT3;
    }

    public static void injectViewModel(MessagingActivity messagingActivity, MessagingViewModel messagingViewModel) {
        messagingActivity.viewModel = messagingViewModel;
    }
}
