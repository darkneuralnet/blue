.class public final Lzendesk/messaging/MessagingActivity_MembersInjector;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lzendesk/messaging/MessagingActivity;",
        ">;"
    }
.end annotation


# direct methods
.method public static injectEventFactory(Lzendesk/messaging/MessagingActivity;Lzendesk/messaging/EventFactory;)V
    .locals 0

    iput-object p1, p0, Lzendesk/messaging/MessagingActivity;->eventFactory:Lzendesk/messaging/EventFactory;

    return-void
.end method

.method public static injectMessagingCellFactory(Lzendesk/messaging/MessagingActivity;Lzendesk/messaging/ui/MessagingCellFactory;)V
    .locals 0

    iput-object p1, p0, Lzendesk/messaging/MessagingActivity;->messagingCellFactory:Lzendesk/messaging/ui/MessagingCellFactory;

    return-void
.end method

.method public static injectMessagingComposer(Lzendesk/messaging/MessagingActivity;Lzendesk/messaging/ui/MessagingComposer;)V
    .locals 0

    iput-object p1, p0, Lzendesk/messaging/MessagingActivity;->messagingComposer:Lzendesk/messaging/ui/MessagingComposer;

    return-void
.end method

.method public static injectMessagingDialog(Lzendesk/messaging/MessagingActivity;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/messaging/MessagingDialog;

    iput-object p1, p0, Lzendesk/messaging/MessagingActivity;->messagingDialog:Lzendesk/messaging/MessagingDialog;

    return-void
.end method

.method public static injectPicasso(Lzendesk/messaging/MessagingActivity;LiT3;)V
    .locals 0

    iput-object p1, p0, Lzendesk/messaging/MessagingActivity;->picasso:LiT3;

    return-void
.end method

.method public static injectViewModel(Lzendesk/messaging/MessagingActivity;Lzendesk/messaging/MessagingViewModel;)V
    .locals 0

    iput-object p1, p0, Lzendesk/messaging/MessagingActivity;->viewModel:Lzendesk/messaging/MessagingViewModel;

    return-void
.end method
