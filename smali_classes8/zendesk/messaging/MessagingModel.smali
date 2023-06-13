.class Lzendesk/messaging/MessagingModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/messaging/MessagingApi;
.implements Lzendesk/messaging/EventListener;
.implements Lzendesk/messaging/Engine$UpdateObserver;


# static fields
.field private static final DEFAULT_ATTACHMENT_SETTINGS:Lzendesk/messaging/AttachmentSettings;

.field private static final DEFAULT_INPUT_STATE_UPDATE:Lzendesk/messaging/Update;

.field private static final DEFAULT_MENU_ITEMS:Lzendesk/messaging/Update;


# instance fields
.field private final configurations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldx0;",
            ">;"
        }
    .end annotation
.end field

.field private final conversationLog:Lzendesk/messaging/MessagingConversationLog;

.field private currentEngine:Lzendesk/messaging/Engine;

.field private final defaultAgentDetails:Lzendesk/messaging/AgentDetails;

.field private final engineItems:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lzendesk/messaging/Engine;",
            "Ljava/util/List<",
            "Lzendesk/messaging/MessagingItem;",
            ">;>;"
        }
    .end annotation
.end field

.field private final engines:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lzendesk/messaging/Engine;",
            ">;"
        }
    .end annotation
.end field

.field private final liveAttachmentSettings:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Lzendesk/messaging/AttachmentSettings;",
            ">;"
        }
    .end annotation
.end field

.field private final liveComposerEnabled:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final liveComposerHint:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final liveConnection:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Lzendesk/messaging/ConnectionState;",
            ">;"
        }
    .end annotation
.end field

.field private final liveDialogUpdates:Lzendesk/messaging/SingleLiveEvent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzendesk/messaging/SingleLiveEvent<",
            "Lzendesk/messaging/DialogContent;",
            ">;"
        }
    .end annotation
.end field

.field private final liveInterfaceUpdates:Lzendesk/messaging/SingleLiveEvent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzendesk/messaging/SingleLiveEvent<",
            "Lzendesk/messaging/Banner;",
            ">;"
        }
    .end annotation
.end field

.field private final liveKeyboardInputType:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final liveMenuItems:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Ljava/util/List<",
            "Lzendesk/messaging/MenuItem;",
            ">;>;"
        }
    .end annotation
.end field

.field private final liveMessagingItems:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Ljava/util/List<",
            "Lzendesk/messaging/MessagingItem;",
            ">;>;"
        }
    .end annotation
.end field

.field private final liveNavigationUpdates:Lzendesk/messaging/SingleLiveEvent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzendesk/messaging/SingleLiveEvent<",
            "Lzendesk/messaging/Update$Action$Navigation;",
            ">;"
        }
    .end annotation
.end field

.field private final liveTyping:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Lzendesk/messaging/Typing;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lzendesk/messaging/AttachmentSettings;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lzendesk/messaging/AttachmentSettings;-><init>(JZ)V

    sput-object v0, Lzendesk/messaging/MessagingModel;->DEFAULT_ATTACHMENT_SETTINGS:Lzendesk/messaging/AttachmentSettings;

    new-instance v1, Lzendesk/messaging/Update$State$UpdateInputFieldState;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const v4, 0x20001

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, ""

    invoke-direct {v1, v5, v2, v0, v4}, Lzendesk/messaging/Update$State$UpdateInputFieldState;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Lzendesk/messaging/AttachmentSettings;Ljava/lang/Integer;)V

    sput-object v1, Lzendesk/messaging/MessagingModel;->DEFAULT_INPUT_STATE_UPDATE:Lzendesk/messaging/Update;

    new-instance v0, Lzendesk/messaging/Update$ApplyMenuItems;

    new-array v1, v3, [Lzendesk/messaging/MenuItem;

    invoke-direct {v0, v1}, Lzendesk/messaging/Update$ApplyMenuItems;-><init>([Lzendesk/messaging/MenuItem;)V

    sput-object v0, Lzendesk/messaging/MessagingModel;->DEFAULT_MENU_ITEMS:Lzendesk/messaging/Update;

    return-void
.end method

.method public constructor <init>(Landroid/content/res/Resources;Ljava/util/List;Lzendesk/messaging/MessagingConfiguration;Lzendesk/messaging/MessagingConversationLog;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources;",
            "Ljava/util/List<",
            "Lzendesk/messaging/Engine;",
            ">;",
            "Lzendesk/messaging/MessagingConfiguration;",
            "Lzendesk/messaging/MessagingConversationLog;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lzendesk/messaging/MessagingModel;->engines:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/messaging/Engine;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lzendesk/messaging/MessagingModel;->engines:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lzendesk/messaging/MessagingModel;->conversationLog:Lzendesk/messaging/MessagingConversationLog;

    invoke-virtual {p3}, Lzendesk/messaging/MessagingConfiguration;->getConfigurations()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lzendesk/messaging/MessagingModel;->configurations:Ljava/util/List;

    invoke-virtual {p3, p1}, Lzendesk/messaging/MessagingConfiguration;->getBotAgentDetails(Landroid/content/res/Resources;)Lzendesk/messaging/AgentDetails;

    move-result-object p1

    iput-object p1, p0, Lzendesk/messaging/MessagingModel;->defaultAgentDetails:Lzendesk/messaging/AgentDetails;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingModel;->engineItems:Ljava/util/Map;

    new-instance p1, LuX2;

    invoke-direct {p1}, LuX2;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingModel;->liveMessagingItems:LuX2;

    new-instance p1, LuX2;

    invoke-direct {p1}, LuX2;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingModel;->liveMenuItems:LuX2;

    new-instance p1, LuX2;

    invoke-direct {p1}, LuX2;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingModel;->liveTyping:LuX2;

    new-instance p1, LuX2;

    invoke-direct {p1}, LuX2;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingModel;->liveConnection:LuX2;

    new-instance p1, LuX2;

    invoke-direct {p1}, LuX2;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingModel;->liveComposerHint:LuX2;

    new-instance p1, LuX2;

    invoke-direct {p1}, LuX2;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingModel;->liveKeyboardInputType:LuX2;

    new-instance p1, LuX2;

    invoke-direct {p1}, LuX2;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingModel;->liveComposerEnabled:LuX2;

    new-instance p1, LuX2;

    invoke-direct {p1}, LuX2;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingModel;->liveAttachmentSettings:LuX2;

    new-instance p1, Lzendesk/messaging/SingleLiveEvent;

    invoke-direct {p1}, Lzendesk/messaging/SingleLiveEvent;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingModel;->liveNavigationUpdates:Lzendesk/messaging/SingleLiveEvent;

    new-instance p1, Lzendesk/messaging/SingleLiveEvent;

    invoke-direct {p1}, Lzendesk/messaging/SingleLiveEvent;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingModel;->liveInterfaceUpdates:Lzendesk/messaging/SingleLiveEvent;

    new-instance p1, Lzendesk/messaging/SingleLiveEvent;

    invoke-direct {p1}, Lzendesk/messaging/SingleLiveEvent;-><init>()V

    iput-object p1, p0, Lzendesk/messaging/MessagingModel;->liveDialogUpdates:Lzendesk/messaging/SingleLiveEvent;

    return-void
.end method

.method private startEngine(Lzendesk/messaging/Engine;)V
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->currentEngine:Lzendesk/messaging/Engine;

    if-eqz v0, :cond_0

    if-eq v0, p1, :cond_0

    invoke-direct {p0, v0}, Lzendesk/messaging/MessagingModel;->stopEngine(Lzendesk/messaging/Engine;)V

    :cond_0
    iput-object p1, p0, Lzendesk/messaging/MessagingModel;->currentEngine:Lzendesk/messaging/Engine;

    invoke-interface {p1, p0}, Lzendesk/messaging/Engine;->registerObserver(Lzendesk/messaging/Engine$UpdateObserver;)Z

    sget-object v0, Lzendesk/messaging/MessagingModel;->DEFAULT_INPUT_STATE_UPDATE:Lzendesk/messaging/Update;

    invoke-virtual {p0, v0}, Lzendesk/messaging/MessagingModel;->update(Lzendesk/messaging/Update;)V

    sget-object v0, Lzendesk/messaging/MessagingModel;->DEFAULT_MENU_ITEMS:Lzendesk/messaging/Update;

    invoke-virtual {p0, v0}, Lzendesk/messaging/MessagingModel;->update(Lzendesk/messaging/Update;)V

    invoke-interface {p1, p0}, Lzendesk/messaging/Engine;->start(Lzendesk/messaging/MessagingApi;)V

    return-void
.end method

.method private startInitialEngine(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzendesk/messaging/Engine;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Ljm0;->g(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lzendesk/messaging/Engine;

    invoke-direct {p0, p1}, Lzendesk/messaging/MessagingModel;->startEngine(Lzendesk/messaging/Engine;)V

    return-void

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lzendesk/messaging/ObservableCounter;

    new-instance v2, Lzendesk/messaging/MessagingModel$1;

    invoke-direct {v2, p0, v0, p1}, Lzendesk/messaging/MessagingModel$1;-><init>(Lzendesk/messaging/MessagingModel;Ljava/util/List;Ljava/util/List;)V

    invoke-direct {v1, v2}, Lzendesk/messaging/ObservableCounter;-><init>(Lzendesk/messaging/ObservableCounter$OnCountCompletedListener;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Lzendesk/messaging/ObservableCounter;->increment(I)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzendesk/messaging/Engine;

    new-instance v3, Lzendesk/messaging/MessagingModel$2;

    invoke-direct {v3, p0, v0, v1}, Lzendesk/messaging/MessagingModel$2;-><init>(Lzendesk/messaging/MessagingModel;Ljava/util/List;Lzendesk/messaging/ObservableCounter;)V

    invoke-interface {v2, v3}, Lzendesk/messaging/Engine;->isConversationOngoing(Lzendesk/messaging/Engine$ConversationOnGoingCallback;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method private stopEngine(Lzendesk/messaging/Engine;)V
    .locals 0

    invoke-interface {p1}, Lzendesk/messaging/Engine;->stop()V

    invoke-interface {p1, p0}, Lzendesk/messaging/Engine;->unregisterObserver(Lzendesk/messaging/Engine$UpdateObserver;)Z

    return-void
.end method


# virtual methods
.method public getLiveAttachmentSettings()LuX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LuX2<",
            "Lzendesk/messaging/AttachmentSettings;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->liveAttachmentSettings:LuX2;

    return-object v0
.end method

.method public getLiveComposerEnabled()LuX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LuX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->liveComposerEnabled:LuX2;

    return-object v0
.end method

.method public getLiveComposerHint()LuX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LuX2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->liveComposerHint:LuX2;

    return-object v0
.end method

.method public getLiveConnection()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Lzendesk/messaging/ConnectionState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->liveConnection:LuX2;

    return-object v0
.end method

.method public getLiveDialogUpdates()Lzendesk/messaging/SingleLiveEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lzendesk/messaging/SingleLiveEvent<",
            "Lzendesk/messaging/DialogContent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->liveDialogUpdates:Lzendesk/messaging/SingleLiveEvent;

    return-object v0
.end method

.method public getLiveInterfaceUpdates()Lzendesk/messaging/SingleLiveEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lzendesk/messaging/SingleLiveEvent<",
            "Lzendesk/messaging/Banner;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->liveInterfaceUpdates:Lzendesk/messaging/SingleLiveEvent;

    return-object v0
.end method

.method public getLiveKeyboardInputType()LuX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LuX2<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->liveKeyboardInputType:LuX2;

    return-object v0
.end method

.method public getLiveMenuItems()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/util/List<",
            "Lzendesk/messaging/MenuItem;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->liveMenuItems:LuX2;

    return-object v0
.end method

.method public getLiveMessagingItems()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/util/List<",
            "Lzendesk/messaging/MessagingItem;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->liveMessagingItems:LuX2;

    return-object v0
.end method

.method public getLiveNavigationUpdates()Lzendesk/messaging/SingleLiveEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lzendesk/messaging/SingleLiveEvent<",
            "Lzendesk/messaging/Update$Action$Navigation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->liveNavigationUpdates:Lzendesk/messaging/SingleLiveEvent;

    return-object v0
.end method

.method public getLiveTyping()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Lzendesk/messaging/Typing;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->liveTyping:LuX2;

    return-object v0
.end method

.method public onEvent(Lzendesk/messaging/Event;)V
    .locals 4

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->conversationLog:Lzendesk/messaging/MessagingConversationLog;

    invoke-virtual {v0, p1}, Lzendesk/messaging/MessagingConversationLog;->addEvent(Lzendesk/messaging/Event;)V

    invoke-virtual {p1}, Lzendesk/messaging/Event;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "transfer_option_clicked"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    check-cast p1, Lzendesk/messaging/Event$EngineSelection;

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->engines:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzendesk/messaging/Engine;

    invoke-virtual {p1}, Lzendesk/messaging/Event$EngineSelection;->getSelectedEngine()Lzendesk/messaging/Engine$TransferOptionDescription;

    move-result-object v2

    invoke-virtual {v2}, Lzendesk/messaging/Engine$TransferOptionDescription;->getEngineId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Lzendesk/messaging/Engine;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-direct {p0, v1}, Lzendesk/messaging/MessagingModel;->startEngine(Lzendesk/messaging/Engine;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->currentEngine:Lzendesk/messaging/Engine;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lzendesk/messaging/Engine;->onEvent(Lzendesk/messaging/Event;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public start()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lzendesk/messaging/Update$State$UpdateInputFieldState;->updateInputFieldEnabled(Z)Lzendesk/messaging/Update$State$UpdateInputFieldState;

    move-result-object v0

    invoke-virtual {p0, v0}, Lzendesk/messaging/MessagingModel;->update(Lzendesk/messaging/Update;)V

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->engines:Ljava/util/List;

    invoke-direct {p0, v0}, Lzendesk/messaging/MessagingModel;->startInitialEngine(Ljava/util/List;)V

    return-void
.end method

.method public stop()V
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->currentEngine:Lzendesk/messaging/Engine;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lzendesk/messaging/Engine;->stop()V

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->currentEngine:Lzendesk/messaging/Engine;

    invoke-interface {v0, p0}, Lzendesk/messaging/Engine;->unregisterObserver(Lzendesk/messaging/Engine$UpdateObserver;)Z

    :cond_0
    return-void
.end method

.method public update(Lzendesk/messaging/Update;)V
    .locals 14

    invoke-virtual {p1}, Lzendesk/messaging/Update;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, -0x1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "navigation"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v4, 0x8

    goto/16 :goto_0

    :sswitch_1
    const-string v1, "update_connection_state"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x7

    goto :goto_0

    :sswitch_2
    const-string v1, "show_typing"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x6

    goto :goto_0

    :sswitch_3
    const-string v1, "apply_menu_items"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v4, 0x5

    goto :goto_0

    :sswitch_4
    const-string v1, "show_dialog"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v4, 0x4

    goto :goto_0

    :sswitch_5
    const-string v1, "hide_typing"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v4, 0x3

    goto :goto_0

    :sswitch_6
    const-string v1, "show_banner"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_7
    const-string v1, "apply_messaging_items"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    move v4, v2

    goto :goto_0

    :sswitch_8
    const-string v1, "update_input_field_state"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    move v4, v3

    :goto_0
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    check-cast p1, Lzendesk/messaging/Update$Action$Navigation;

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->liveNavigationUpdates:Lzendesk/messaging/SingleLiveEvent;

    invoke-virtual {v0, p1}, LuX2;->postValue(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_1
    check-cast p1, Lzendesk/messaging/Update$State$UpdateConnectionState;

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->liveConnection:LuX2;

    invoke-virtual {p1}, Lzendesk/messaging/Update$State$UpdateConnectionState;->getConnectionState()Lzendesk/messaging/ConnectionState;

    move-result-object p1

    invoke-virtual {v0, p1}, LuX2;->postValue(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_2
    check-cast p1, Lzendesk/messaging/Update$State$ShowTyping;

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->liveTyping:LuX2;

    new-instance v1, Lzendesk/messaging/Typing;

    invoke-virtual {p1}, Lzendesk/messaging/Update$State$ShowTyping;->getAgentDetails()Lzendesk/messaging/AgentDetails;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lzendesk/messaging/Typing;-><init>(ZLzendesk/messaging/AgentDetails;)V

    invoke-virtual {v0, v1}, LuX2;->postValue(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_3
    check-cast p1, Lzendesk/messaging/Update$ApplyMenuItems;

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->liveMenuItems:LuX2;

    invoke-virtual {p1}, Lzendesk/messaging/Update$ApplyMenuItems;->getMenuItems()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, LuX2;->postValue(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_4
    check-cast p1, Lzendesk/messaging/Update$ShowDialog;

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->liveDialogUpdates:Lzendesk/messaging/SingleLiveEvent;

    invoke-virtual {p1}, Lzendesk/messaging/Update$ShowDialog;->getDialogContent()Lzendesk/messaging/DialogContent;

    move-result-object p1

    invoke-virtual {v0, p1}, LuX2;->postValue(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_5
    iget-object p1, p0, Lzendesk/messaging/MessagingModel;->liveTyping:LuX2;

    new-instance v0, Lzendesk/messaging/Typing;

    invoke-direct {v0, v3}, Lzendesk/messaging/Typing;-><init>(Z)V

    invoke-virtual {p1, v0}, LuX2;->postValue(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_6
    check-cast p1, Lzendesk/messaging/Update$ShowBanner;

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->liveInterfaceUpdates:Lzendesk/messaging/SingleLiveEvent;

    invoke-virtual {p1}, Lzendesk/messaging/Update$ShowBanner;->getBanner()Lzendesk/messaging/Banner;

    move-result-object p1

    invoke-virtual {v0, p1}, LuX2;->postValue(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_7
    check-cast p1, Lzendesk/messaging/Update$State$ApplyMessagingItems;

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->engineItems:Ljava/util/Map;

    iget-object v1, p0, Lzendesk/messaging/MessagingModel;->currentEngine:Lzendesk/messaging/Engine;

    invoke-virtual {p1}, Lzendesk/messaging/Update$State$ApplyMessagingItems;->getMessagingItems()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->engineItems:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lzendesk/messaging/MessagingItem;

    instance-of v6, v5, Lzendesk/messaging/MessagingItem$TransferResponse;

    if-eqz v6, :cond_b

    new-instance v6, Lzendesk/messaging/MessagingItem$TransferResponse;

    invoke-virtual {v5}, Lzendesk/messaging/MessagingItem;->getTimestamp()Ljava/util/Date;

    move-result-object v8

    invoke-virtual {v5}, Lzendesk/messaging/MessagingItem;->getId()Ljava/lang/String;

    move-result-object v9

    check-cast v5, Lzendesk/messaging/MessagingItem$TransferResponse;

    invoke-virtual {v5}, Lzendesk/messaging/MessagingItem$Response;->getAgentDetails()Lzendesk/messaging/AgentDetails;

    move-result-object v10

    invoke-virtual {v5}, Lzendesk/messaging/MessagingItem$TransferResponse;->getMessage()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5}, Lzendesk/messaging/MessagingItem$TransferResponse;->getEngineOptions()Ljava/util/List;

    move-result-object v12

    iget-object v5, p0, Lzendesk/messaging/MessagingModel;->currentEngine:Lzendesk/messaging/Engine;

    if-eqz v5, :cond_a

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lzendesk/messaging/Engine;

    iget-object v7, p0, Lzendesk/messaging/MessagingModel;->currentEngine:Lzendesk/messaging/Engine;

    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    move v13, v2

    goto :goto_2

    :cond_a
    move v13, v3

    :goto_2
    move-object v7, v6

    invoke-direct/range {v7 .. v13}, Lzendesk/messaging/MessagingItem$TransferResponse;-><init>(Ljava/util/Date;Ljava/lang/String;Lzendesk/messaging/AgentDetails;Ljava/lang/String;Ljava/util/List;Z)V

    move-object v5, v6

    :cond_b
    invoke-interface {p1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_c
    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->liveMessagingItems:LuX2;

    invoke-virtual {v0, p1}, LuX2;->postValue(Ljava/lang/Object;)V

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->conversationLog:Lzendesk/messaging/MessagingConversationLog;

    invoke-virtual {v0, p1}, Lzendesk/messaging/MessagingConversationLog;->setMessagingItems(Ljava/util/List;)V

    goto :goto_3

    :pswitch_8
    check-cast p1, Lzendesk/messaging/Update$State$UpdateInputFieldState;

    invoke-virtual {p1}, Lzendesk/messaging/Update$State$UpdateInputFieldState;->getHint()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_d

    iget-object v1, p0, Lzendesk/messaging/MessagingModel;->liveComposerHint:LuX2;

    invoke-virtual {v1, v0}, LuX2;->postValue(Ljava/lang/Object;)V

    :cond_d
    invoke-virtual {p1}, Lzendesk/messaging/Update$State$UpdateInputFieldState;->isEnabled()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_e

    iget-object v1, p0, Lzendesk/messaging/MessagingModel;->liveComposerEnabled:LuX2;

    invoke-virtual {v1, v0}, LuX2;->postValue(Ljava/lang/Object;)V

    :cond_e
    invoke-virtual {p1}, Lzendesk/messaging/Update$State$UpdateInputFieldState;->getAttachmentSettings()Lzendesk/messaging/AttachmentSettings;

    move-result-object v0

    if-eqz v0, :cond_f

    iget-object v1, p0, Lzendesk/messaging/MessagingModel;->liveAttachmentSettings:LuX2;

    invoke-virtual {v1, v0}, LuX2;->postValue(Ljava/lang/Object;)V

    :cond_f
    invoke-virtual {p1}, Lzendesk/messaging/Update$State$UpdateInputFieldState;->getInputType()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_10

    iget-object v0, p0, Lzendesk/messaging/MessagingModel;->liveKeyboardInputType:LuX2;

    invoke-virtual {v0, p1}, LuX2;->postValue(Ljava/lang/Object;)V

    goto :goto_3

    :cond_10
    iget-object p1, p0, Lzendesk/messaging/MessagingModel;->liveKeyboardInputType:LuX2;

    const v0, 0x20001

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, LuX2;->postValue(Ljava/lang/Object;)V

    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5ae021df -> :sswitch_8
        -0x1562940c -> :sswitch_7
        0x21fbaae -> :sswitch_6
        0x3d9d714 -> :sswitch_5
        0x5f438ca -> :sswitch_4
        0x16c19e51 -> :sswitch_3
        0x222a00f9 -> :sswitch_2
        0x69473ca6 -> :sswitch_1
        0x6f060a14 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
