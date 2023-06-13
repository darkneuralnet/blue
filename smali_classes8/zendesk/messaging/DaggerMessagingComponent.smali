.class final Lzendesk/messaging/DaggerMessagingComponent;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/messaging/MessagingComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/messaging/DaggerMessagingComponent$Builder;
    }
.end annotation


# instance fields
.field private appContextProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private belvedereMediaHolderProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/BelvedereMediaHolder;",
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

.field private enginesProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ljava/util/List<",
            "Lzendesk/messaging/Engine;",
            ">;>;"
        }
    .end annotation
.end field

.field private final messagingComponent:Lzendesk/messaging/DaggerMessagingComponent;

.field private final messagingConfiguration:Lzendesk/messaging/MessagingConfiguration;

.field private messagingConfigurationProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/MessagingConfiguration;",
            ">;"
        }
    .end annotation
.end field

.field private messagingConversationLogProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/MessagingConversationLog;",
            ">;"
        }
    .end annotation
.end field

.field private messagingEventSerializerProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/MessagingEventSerializer;",
            ">;"
        }
    .end annotation
.end field

.field private messagingModelProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/MessagingModel;",
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

.field private timestampFactoryProvider:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lzendesk/messaging/TimestampFactory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/content/Context;Ljava/util/List;Lzendesk/messaging/MessagingConfiguration;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lzendesk/messaging/Engine;",
            ">;",
            "Lzendesk/messaging/MessagingConfiguration;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lzendesk/messaging/DaggerMessagingComponent;->messagingComponent:Lzendesk/messaging/DaggerMessagingComponent;

    iput-object p3, p0, Lzendesk/messaging/DaggerMessagingComponent;->messagingConfiguration:Lzendesk/messaging/MessagingConfiguration;

    invoke-direct {p0, p1, p2, p3}, Lzendesk/messaging/DaggerMessagingComponent;->initialize(Landroid/content/Context;Ljava/util/List;Lzendesk/messaging/MessagingConfiguration;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/util/List;Lzendesk/messaging/MessagingConfiguration;Lzendesk/messaging/DaggerMessagingComponent$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lzendesk/messaging/DaggerMessagingComponent;-><init>(Landroid/content/Context;Ljava/util/List;Lzendesk/messaging/MessagingConfiguration;)V

    return-void
.end method

.method public static builder()Lzendesk/messaging/MessagingComponent$Builder;
    .locals 2

    new-instance v0, Lzendesk/messaging/DaggerMessagingComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzendesk/messaging/DaggerMessagingComponent$Builder;-><init>(Lzendesk/messaging/DaggerMessagingComponent$1;)V

    return-object v0
.end method

.method private initialize(Landroid/content/Context;Ljava/util/List;Lzendesk/messaging/MessagingConfiguration;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lzendesk/messaging/Engine;",
            ">;",
            "Lzendesk/messaging/MessagingConfiguration;",
            ")V"
        }
    .end annotation

    invoke-static {p1}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p1

    iput-object p1, p0, Lzendesk/messaging/DaggerMessagingComponent;->appContextProvider:LY94;

    invoke-static {p1}, Lzendesk/messaging/MessagingModule_PicassoFactory;->create(LY94;)Lzendesk/messaging/MessagingModule_PicassoFactory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lzendesk/messaging/DaggerMessagingComponent;->picassoProvider:LY94;

    iget-object p1, p0, Lzendesk/messaging/DaggerMessagingComponent;->appContextProvider:LY94;

    invoke-static {p1}, Lzendesk/messaging/MessagingModule_ResourcesFactory;->create(LY94;)Lzendesk/messaging/MessagingModule_ResourcesFactory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lzendesk/messaging/DaggerMessagingComponent;->resourcesProvider:LY94;

    invoke-static {p2}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p1

    iput-object p1, p0, Lzendesk/messaging/DaggerMessagingComponent;->enginesProvider:LY94;

    invoke-static {p3}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p1

    iput-object p1, p0, Lzendesk/messaging/DaggerMessagingComponent;->messagingConfigurationProvider:LY94;

    iget-object p1, p0, Lzendesk/messaging/DaggerMessagingComponent;->appContextProvider:LY94;

    invoke-static {p1}, Lzendesk/messaging/TimestampFactory_Factory;->create(LY94;)Lzendesk/messaging/TimestampFactory_Factory;

    move-result-object p1

    iput-object p1, p0, Lzendesk/messaging/DaggerMessagingComponent;->timestampFactoryProvider:LY94;

    iget-object p2, p0, Lzendesk/messaging/DaggerMessagingComponent;->appContextProvider:LY94;

    invoke-static {p2, p1}, Lzendesk/messaging/MessagingEventSerializer_Factory;->create(LY94;LY94;)Lzendesk/messaging/MessagingEventSerializer_Factory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lzendesk/messaging/DaggerMessagingComponent;->messagingEventSerializerProvider:LY94;

    invoke-static {p1}, Lzendesk/messaging/MessagingConversationLog_Factory;->create(LY94;)Lzendesk/messaging/MessagingConversationLog_Factory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lzendesk/messaging/DaggerMessagingComponent;->messagingConversationLogProvider:LY94;

    iget-object p2, p0, Lzendesk/messaging/DaggerMessagingComponent;->resourcesProvider:LY94;

    iget-object p3, p0, Lzendesk/messaging/DaggerMessagingComponent;->enginesProvider:LY94;

    iget-object v0, p0, Lzendesk/messaging/DaggerMessagingComponent;->messagingConfigurationProvider:LY94;

    invoke-static {p2, p3, v0, p1}, Lzendesk/messaging/MessagingModel_Factory;->create(LY94;LY94;LY94;LY94;)Lzendesk/messaging/MessagingModel_Factory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lzendesk/messaging/DaggerMessagingComponent;->messagingModelProvider:LY94;

    invoke-static {p1}, Lzendesk/messaging/MessagingViewModel_Factory;->create(LY94;)Lzendesk/messaging/MessagingViewModel_Factory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lzendesk/messaging/DaggerMessagingComponent;->messagingViewModelProvider:LY94;

    iget-object p1, p0, Lzendesk/messaging/DaggerMessagingComponent;->appContextProvider:LY94;

    invoke-static {p1}, Lzendesk/messaging/MessagingModule_BelvedereFactory;->create(LY94;)Lzendesk/messaging/MessagingModule_BelvedereFactory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lzendesk/messaging/DaggerMessagingComponent;->belvedereProvider:LY94;

    invoke-static {}, Lzendesk/messaging/BelvedereMediaHolder_Factory;->create()Lzendesk/messaging/BelvedereMediaHolder_Factory;

    move-result-object p1

    invoke-static {p1}, LV51;->b(LY94;)LY94;

    move-result-object p1

    iput-object p1, p0, Lzendesk/messaging/DaggerMessagingComponent;->belvedereMediaHolderProvider:LY94;

    return-void
.end method


# virtual methods
.method public belvedere()Lzendesk/belvedere/a;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/DaggerMessagingComponent;->belvedereProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/belvedere/a;

    return-object v0
.end method

.method public belvedereMediaHolder()Lzendesk/messaging/BelvedereMediaHolder;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/DaggerMessagingComponent;->belvedereMediaHolderProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/messaging/BelvedereMediaHolder;

    return-object v0
.end method

.method public messagingConfiguration()Lzendesk/messaging/MessagingConfiguration;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/DaggerMessagingComponent;->messagingConfiguration:Lzendesk/messaging/MessagingConfiguration;

    return-object v0
.end method

.method public messagingViewModel()Lzendesk/messaging/MessagingViewModel;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/DaggerMessagingComponent;->messagingViewModelProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/messaging/MessagingViewModel;

    return-object v0
.end method

.method public picasso()LiT3;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/DaggerMessagingComponent;->picassoProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LiT3;

    return-object v0
.end method

.method public resources()Landroid/content/res/Resources;
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/DaggerMessagingComponent;->resourcesProvider:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/res/Resources;

    return-object v0
.end method
