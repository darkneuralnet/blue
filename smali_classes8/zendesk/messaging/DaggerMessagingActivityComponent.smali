.class final Lzendesk/messaging/DaggerMessagingActivityComponent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/messaging/MessagingActivityComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/messaging/DaggerMessagingActivityComponent$zendesk_messaging_MessagingComponent_belvedere;,
        Lzendesk/messaging/DaggerMessagingActivityComponent$zendesk_messaging_MessagingComponent_belvedereMediaHolder;,
        Lzendesk/messaging/DaggerMessagingActivityComponent$zendesk_messaging_MessagingComponent_picasso;,
        Lzendesk/messaging/DaggerMessagingActivityComponent$zendesk_messaging_MessagingComponent_messagingViewModel;,
        Lzendesk/messaging/DaggerMessagingActivityComponent$zendesk_messaging_MessagingComponent_resources;,
        Lzendesk/messaging/DaggerMessagingActivityComponent$Builder;
    }
.end annotation


# instance fields
.field private activityProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroidx/appcompat/app/AppCompatActivity;",
            ">;"
        }
    .end annotation
.end field

.field private avatarStateRendererProvider:LY94;

.field private belvedereMediaHolderProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/BelvedereMediaHolder;",
            ">;"
        }
    .end annotation
.end field

.field private belvedereMediaResolverCallbackProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/BelvedereMediaResolverCallback;",
            ">;"
        }
    .end annotation
.end field

.field private belvedereProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/belvedere/a;",
            ">;"
        }
    .end annotation
.end field

.field private belvedereUiProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/belvedere/b;",
            ">;"
        }
    .end annotation
.end field

.field private dateProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/components/DateProvider;",
            ">;"
        }
    .end annotation
.end field

.field private eventFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/EventFactory;",
            ">;"
        }
    .end annotation
.end field

.field private handlerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field

.field private inputBoxAttachmentClickListenerProvider:LY94;

.field private inputBoxConsumerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/ui/InputBoxConsumer;",
            ">;"
        }
    .end annotation
.end field

.field private final messagingActivityComponent:Lzendesk/messaging/DaggerMessagingActivityComponent;

.field private messagingCellFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/ui/MessagingCellFactory;",
            ">;"
        }
    .end annotation
.end field

.field private messagingCellPropsFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/ui/MessagingCellPropsFactory;",
            ">;"
        }
    .end annotation
.end field

.field private final messagingComponent:Lzendesk/messaging/MessagingComponent;

.field private messagingComponentProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/MessagingComponent;",
            ">;"
        }
    .end annotation
.end field

.field private messagingComposerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/ui/MessagingComposer;",
            ">;"
        }
    .end annotation
.end field

.field private messagingDialogProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/MessagingDialog;",
            ">;"
        }
    .end annotation
.end field

.field private messagingViewModelProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/MessagingViewModel;",
            ">;"
        }
    .end annotation
.end field

.field private multilineResponseOptionsEnabledProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private picassoProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LiT3;",
            ">;"
        }
    .end annotation
.end field

.field private resourcesProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/res/Resources;",
            ">;"
        }
    .end annotation
.end field

.field private typingEventDispatcherProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/TypingEventDispatcher;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lzendesk/messaging/MessagingComponent;Landroidx/appcompat/app/AppCompatActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->messagingActivityComponent:Lzendesk/messaging/DaggerMessagingActivityComponent;

    iput-object p1, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->messagingComponent:Lzendesk/messaging/MessagingComponent;

    invoke-direct {p0, p1, p2}, Lzendesk/messaging/DaggerMessagingActivityComponent;->initialize(Lzendesk/messaging/MessagingComponent;Landroidx/appcompat/app/AppCompatActivity;)V

    return-void
.end method

.method public synthetic constructor <init>(Lzendesk/messaging/MessagingComponent;Landroidx/appcompat/app/AppCompatActivity;Lzendesk/messaging/DaggerMessagingActivityComponent$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lzendesk/messaging/DaggerMessagingActivityComponent;-><init>(Lzendesk/messaging/MessagingComponent;Landroidx/appcompat/app/AppCompatActivity;)V

    return-void
.end method

.method public static builder()Lzendesk/messaging/MessagingActivityComponent$Builder;
    .locals 2

    new-instance v0, Lzendesk/messaging/DaggerMessagingActivityComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzendesk/messaging/DaggerMessagingActivityComponent$Builder;-><init>(Lzendesk/messaging/DaggerMessagingActivityComponent$1;)V

    return-object v0
.end method

.method private initialize(Lzendesk/messaging/MessagingComponent;Landroidx/appcompat/app/AppCompatActivity;)V
    .locals 8

    new-instance v0, Lzendesk/messaging/DaggerMessagingActivityComponent$zendesk_messaging_MessagingComponent_resources;

    invoke-direct {v0, p1}, Lzendesk/messaging/DaggerMessagingActivityComponent$zendesk_messaging_MessagingComponent_resources;-><init>(Lzendesk/messaging/MessagingComponent;)V

    iput-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->resourcesProvider:LY94;

    invoke-static {v0}, Lzendesk/messaging/ui/MessagingCellPropsFactory_Factory;->create(LY94;)Lzendesk/messaging/ui/MessagingCellPropsFactory_Factory;

    move-result-object v0

    invoke-static {v0}, LV51;->b(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->messagingCellPropsFactoryProvider:LY94;

    invoke-static {}, Lzendesk/messaging/MessagingActivityModule_DateProviderFactory;->create()Lzendesk/messaging/MessagingActivityModule_DateProviderFactory;

    move-result-object v0

    invoke-static {v0}, LV51;->b(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->dateProvider:LY94;

    new-instance v0, Lzendesk/messaging/DaggerMessagingActivityComponent$zendesk_messaging_MessagingComponent_messagingViewModel;

    invoke-direct {v0, p1}, Lzendesk/messaging/DaggerMessagingActivityComponent$zendesk_messaging_MessagingComponent_messagingViewModel;-><init>(Lzendesk/messaging/MessagingComponent;)V

    iput-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->messagingViewModelProvider:LY94;

    iget-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->dateProvider:LY94;

    invoke-static {v0}, Lzendesk/messaging/EventFactory_Factory;->create(LY94;)Lzendesk/messaging/EventFactory_Factory;

    move-result-object v0

    invoke-static {v0}, LV51;->b(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->eventFactoryProvider:LY94;

    new-instance v0, Lzendesk/messaging/DaggerMessagingActivityComponent$zendesk_messaging_MessagingComponent_picasso;

    invoke-direct {v0, p1}, Lzendesk/messaging/DaggerMessagingActivityComponent$zendesk_messaging_MessagingComponent_picasso;-><init>(Lzendesk/messaging/MessagingComponent;)V

    iput-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->picassoProvider:LY94;

    invoke-static {v0}, Lzendesk/messaging/ui/AvatarStateRenderer_Factory;->create(LY94;)Lzendesk/messaging/ui/AvatarStateRenderer_Factory;

    move-result-object v0

    invoke-static {v0}, LV51;->b(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->avatarStateRendererProvider:LY94;

    invoke-static {p1}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object v0

    iput-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->messagingComponentProvider:LY94;

    invoke-static {v0}, Lzendesk/messaging/MessagingActivityModule_MultilineResponseOptionsEnabledFactory;->create(LY94;)Lzendesk/messaging/MessagingActivityModule_MultilineResponseOptionsEnabledFactory;

    move-result-object v0

    invoke-static {v0}, LV51;->b(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->multilineResponseOptionsEnabledProvider:LY94;

    iget-object v1, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->messagingCellPropsFactoryProvider:LY94;

    iget-object v2, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->dateProvider:LY94;

    iget-object v3, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->messagingViewModelProvider:LY94;

    iget-object v4, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->eventFactoryProvider:LY94;

    iget-object v5, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->avatarStateRendererProvider:LY94;

    invoke-static {}, Lzendesk/messaging/ui/AvatarStateFactory_Factory;->create()Lzendesk/messaging/ui/AvatarStateFactory_Factory;

    move-result-object v6

    iget-object v7, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->multilineResponseOptionsEnabledProvider:LY94;

    invoke-static/range {v1 .. v7}, Lzendesk/messaging/ui/MessagingCellFactory_Factory;->create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lzendesk/messaging/ui/MessagingCellFactory_Factory;

    move-result-object v0

    invoke-static {v0}, LV51;->b(LY94;)LY94;

    move-result-object v0

    iput-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->messagingCellFactoryProvider:LY94;

    invoke-static {p2}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p2

    iput-object p2, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->activityProvider:LY94;

    invoke-static {p2}, Lzendesk/messaging/MessagingActivityModule_BelvedereUiFactory;->create(LY94;)Lzendesk/messaging/MessagingActivityModule_BelvedereUiFactory;

    move-result-object p2

    invoke-static {p2}, LV51;->b(LY94;)LY94;

    move-result-object p2

    iput-object p2, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->belvedereUiProvider:LY94;

    new-instance p2, Lzendesk/messaging/DaggerMessagingActivityComponent$zendesk_messaging_MessagingComponent_belvedereMediaHolder;

    invoke-direct {p2, p1}, Lzendesk/messaging/DaggerMessagingActivityComponent$zendesk_messaging_MessagingComponent_belvedereMediaHolder;-><init>(Lzendesk/messaging/MessagingComponent;)V

    iput-object p2, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->belvedereMediaHolderProvider:LY94;

    new-instance p2, Lzendesk/messaging/DaggerMessagingActivityComponent$zendesk_messaging_MessagingComponent_belvedere;

    invoke-direct {p2, p1}, Lzendesk/messaging/DaggerMessagingActivityComponent$zendesk_messaging_MessagingComponent_belvedere;-><init>(Lzendesk/messaging/MessagingComponent;)V

    iput-object p2, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->belvedereProvider:LY94;

    iget-object p1, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->messagingViewModelProvider:LY94;

    iget-object p2, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->eventFactoryProvider:LY94;

    invoke-static {p1, p2}, Lzendesk/messaging/BelvedereMediaResolverCallback_Factory;->create(LY94;LY94;)Lzendesk/messaging/BelvedereMediaResolverCallback_Factory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object v5

    iput-object v5, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->belvedereMediaResolverCallbackProvider:LY94;

    iget-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->messagingViewModelProvider:LY94;

    iget-object v1, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->eventFactoryProvider:LY94;

    iget-object v2, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->belvedereUiProvider:LY94;

    iget-object v3, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->belvedereProvider:LY94;

    iget-object v4, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->belvedereMediaHolderProvider:LY94;

    invoke-static/range {v0 .. v5}, Lzendesk/messaging/ui/InputBoxConsumer_Factory;->create(LY94;LY94;LY94;LY94;LY94;LY94;)Lzendesk/messaging/ui/InputBoxConsumer_Factory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->inputBoxConsumerProvider:LY94;

    iget-object p1, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->activityProvider:LY94;

    iget-object p2, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->belvedereUiProvider:LY94;

    iget-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->belvedereMediaHolderProvider:LY94;

    invoke-static {p1, p2, v0}, Lzendesk/messaging/ui/InputBoxAttachmentClickListener_Factory;->create(LY94;LY94;LY94;)Lzendesk/messaging/ui/InputBoxAttachmentClickListener_Factory;

    move-result-object p1

    iput-object p1, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->inputBoxAttachmentClickListenerProvider:LY94;

    invoke-static {}, Lzendesk/messaging/MessagingActivityModule_HandlerFactory;->create()Lzendesk/messaging/MessagingActivityModule_HandlerFactory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->handlerProvider:LY94;

    iget-object p2, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->messagingViewModelProvider:LY94;

    iget-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->eventFactoryProvider:LY94;

    invoke-static {p2, p1, v0}, Lzendesk/messaging/TypingEventDispatcher_Factory;->create(LY94;LY94;LY94;)Lzendesk/messaging/TypingEventDispatcher_Factory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object v6

    iput-object v6, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->typingEventDispatcherProvider:LY94;

    iget-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->activityProvider:LY94;

    iget-object v1, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->messagingViewModelProvider:LY94;

    iget-object v2, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->belvedereUiProvider:LY94;

    iget-object v3, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->belvedereMediaHolderProvider:LY94;

    iget-object v4, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->inputBoxConsumerProvider:LY94;

    iget-object v5, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->inputBoxAttachmentClickListenerProvider:LY94;

    invoke-static/range {v0 .. v6}, Lzendesk/messaging/ui/MessagingComposer_Factory;->create(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)Lzendesk/messaging/ui/MessagingComposer_Factory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->messagingComposerProvider:LY94;

    iget-object p1, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->activityProvider:LY94;

    iget-object p2, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->messagingViewModelProvider:LY94;

    iget-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->dateProvider:LY94;

    invoke-static {p1, p2, v0}, Lzendesk/messaging/MessagingDialog_Factory;->create(LY94;LY94;LY94;)Lzendesk/messaging/MessagingDialog_Factory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->messagingDialogProvider:LY94;

    return-void
.end method

.method private injectMessagingActivity(Lzendesk/messaging/MessagingActivity;)Lzendesk/messaging/MessagingActivity;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->messagingComponent:Lzendesk/messaging/MessagingComponent;

    invoke-interface {v0}, Lzendesk/messaging/MessagingComponent;->messagingViewModel()Lzendesk/messaging/MessagingViewModel;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/messaging/MessagingViewModel;

    invoke-static {p1, v0}, Lzendesk/messaging/MessagingActivity_MembersInjector;->injectViewModel(Lzendesk/messaging/MessagingActivity;Lzendesk/messaging/MessagingViewModel;)V

    iget-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->messagingCellFactoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/messaging/ui/MessagingCellFactory;

    invoke-static {p1, v0}, Lzendesk/messaging/MessagingActivity_MembersInjector;->injectMessagingCellFactory(Lzendesk/messaging/MessagingActivity;Lzendesk/messaging/ui/MessagingCellFactory;)V

    iget-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->messagingComponent:Lzendesk/messaging/MessagingComponent;

    invoke-interface {v0}, Lzendesk/messaging/MessagingComponent;->picasso()LiT3;

    move-result-object v0

    invoke-static {v0}, LxZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LiT3;

    invoke-static {p1, v0}, Lzendesk/messaging/MessagingActivity_MembersInjector;->injectPicasso(Lzendesk/messaging/MessagingActivity;LiT3;)V

    iget-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->eventFactoryProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/messaging/EventFactory;

    invoke-static {p1, v0}, Lzendesk/messaging/MessagingActivity_MembersInjector;->injectEventFactory(Lzendesk/messaging/MessagingActivity;Lzendesk/messaging/EventFactory;)V

    iget-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->messagingComposerProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/messaging/ui/MessagingComposer;

    invoke-static {p1, v0}, Lzendesk/messaging/MessagingActivity_MembersInjector;->injectMessagingComposer(Lzendesk/messaging/MessagingActivity;Lzendesk/messaging/ui/MessagingComposer;)V

    iget-object v0, p0, Lzendesk/messaging/DaggerMessagingActivityComponent;->messagingDialogProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Lzendesk/messaging/MessagingActivity_MembersInjector;->injectMessagingDialog(Lzendesk/messaging/MessagingActivity;Ljava/lang/Object;)V

    return-object p1
.end method


# virtual methods
.method public inject(Lzendesk/messaging/MessagingActivity;)V
    .locals 0

    invoke-direct {p0, p1}, Lzendesk/messaging/DaggerMessagingActivityComponent;->injectMessagingActivity(Lzendesk/messaging/MessagingActivity;)Lzendesk/messaging/MessagingActivity;

    return-void
.end method
