.class Lzendesk/support/request/ComponentRequestRouter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/support/suas/Listener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/support/request/ComponentRequestRouter$RequestScreen;,
        Lzendesk/support/request/ComponentRequestRouter$RequestRouterSelector;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lzendesk/support/suas/Listener<",
        "Lzendesk/support/request/ComponentRequestRouter$RequestScreen;",
        ">;"
    }
.end annotation


# instance fields
.field private final activity:Landroidx/appcompat/app/AppCompatActivity;

.field private final component:Lzendesk/support/request/RequestComponent;

.field private currentScreen:Lzendesk/support/request/RequestView;

.field private final disabledView:Lzendesk/support/request/RequestViewConversationsDisabled;

.field private final enabledView:Lzendesk/support/request/RequestViewConversationsEnabled;

.field private final isCleanStart:Z

.field private final loadingView:Lzendesk/support/request/RequestViewLoading;

.field private final root:Landroid/view/ViewGroup;

.field private final screen:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lzendesk/support/request/ComponentRequestRouter$RequestScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/AppCompatActivity;Landroid/view/ViewGroup;Lzendesk/support/request/RequestViewConversationsDisabled;Lzendesk/support/request/RequestViewConversationsEnabled;Lzendesk/support/request/RequestViewLoading;Lzendesk/support/request/RequestComponent;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/request/ComponentRequestRouter;->activity:Landroidx/appcompat/app/AppCompatActivity;

    iput-object p2, p0, Lzendesk/support/request/ComponentRequestRouter;->root:Landroid/view/ViewGroup;

    iput-object p3, p0, Lzendesk/support/request/ComponentRequestRouter;->disabledView:Lzendesk/support/request/RequestViewConversationsDisabled;

    iput-object p4, p0, Lzendesk/support/request/ComponentRequestRouter;->enabledView:Lzendesk/support/request/RequestViewConversationsEnabled;

    iput-object p5, p0, Lzendesk/support/request/ComponentRequestRouter;->loadingView:Lzendesk/support/request/RequestViewLoading;

    iput-object p6, p0, Lzendesk/support/request/ComponentRequestRouter;->component:Lzendesk/support/request/RequestComponent;

    iput-boolean p7, p0, Lzendesk/support/request/ComponentRequestRouter;->isCleanStart:Z

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lzendesk/support/request/ComponentRequestRouter;->screen:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static create(Landroidx/appcompat/app/AppCompatActivity;ZLzendesk/support/request/RequestComponent;)Lzendesk/support/request/ComponentRequestRouter;
    .locals 9

    new-instance v8, Lzendesk/support/request/ComponentRequestRouter;

    sget v0, LPg4;->activity_request_root:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/ViewGroup;

    sget v0, LPg4;->activity_request_conversation_disabled:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lzendesk/support/request/RequestViewConversationsDisabled;

    sget v0, LPg4;->activity_request_conversation:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lzendesk/support/request/RequestViewConversationsEnabled;

    sget v0, LPg4;->activity_request_loading:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lzendesk/support/request/RequestViewLoading;

    move-object v0, v8

    move-object v1, p0

    move-object v6, p2

    move v7, p1

    invoke-direct/range {v0 .. v7}, Lzendesk/support/request/ComponentRequestRouter;-><init>(Landroidx/appcompat/app/AppCompatActivity;Landroid/view/ViewGroup;Lzendesk/support/request/RequestViewConversationsDisabled;Lzendesk/support/request/RequestViewConversationsEnabled;Lzendesk/support/request/RequestViewLoading;Lzendesk/support/request/RequestComponent;Z)V

    return-object v8
.end method

.method private varargs displayView(Landroid/view/View;[Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lzendesk/support/request/ComponentRequestRouter;->root:Landroid/view/ViewGroup;

    new-instance v1, Landroidx/transition/Fade;

    invoke-direct {v1}, Landroidx/transition/Fade;-><init>()V

    invoke-static {v0, v1}, Landroidx/transition/c;->b(Landroid/view/ViewGroup;Landroidx/transition/Transition;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    array-length p1, p2

    :goto_0
    if-ge v0, p1, :cond_0

    aget-object v1, p2, v0

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lzendesk/support/request/ComponentRequestRouter;->activity:Landroidx/appcompat/app/AppCompatActivity;

    invoke-virtual {p1}, Landroidx/appcompat/app/AppCompatActivity;->invalidateOptionsMenu()V

    iget-object p1, p0, Lzendesk/support/request/ComponentRequestRouter;->root:Landroid/view/ViewGroup;

    invoke-static {p1}, Landroidx/transition/c;->d(Landroid/view/ViewGroup;)V

    return-void
.end method


# virtual methods
.method public getCurrentScreen()Lzendesk/support/request/RequestView;
    .locals 1

    iget-object v0, p0, Lzendesk/support/request/ComponentRequestRouter;->currentScreen:Lzendesk/support/request/RequestView;

    return-object v0
.end method

.method public getSelector()Lzendesk/support/suas/StateSelector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lzendesk/support/suas/StateSelector<",
            "Lzendesk/support/request/ComponentRequestRouter$RequestScreen;",
            ">;"
        }
    .end annotation

    new-instance v0, Lzendesk/support/request/ComponentRequestRouter$RequestRouterSelector;

    invoke-direct {v0}, Lzendesk/support/request/ComponentRequestRouter$RequestRouterSelector;-><init>()V

    return-object v0
.end method

.method public bridge synthetic update(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzendesk/support/request/ComponentRequestRouter$RequestScreen;

    invoke-virtual {p0, p1}, Lzendesk/support/request/ComponentRequestRouter;->update(Lzendesk/support/request/ComponentRequestRouter$RequestScreen;)V

    return-void
.end method

.method public update(Lzendesk/support/request/ComponentRequestRouter$RequestScreen;)V
    .locals 5

    iget-object v0, p0, Lzendesk/support/request/ComponentRequestRouter;->screen:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    sget-object v0, Lzendesk/support/request/ComponentRequestRouter$1;->$SwitchMap$zendesk$support$request$ComponentRequestRouter$RequestScreen:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const-string v0, "RequestActivity"

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq p1, v2, :cond_4

    if-eq p1, v1, :cond_3

    const/4 v4, 0x3

    if-eq p1, v4, :cond_2

    const/4 v1, 0x4

    if-eq p1, v1, :cond_1

    goto :goto_0

    :cond_1
    const-string p1, "Installing screen: \'Finish\'"

    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, LIx2;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lzendesk/support/request/ComponentRequestRouter;->activity:Landroidx/appcompat/app/AppCompatActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_2
    const-string p1, "Installing screen: \'Conversations Enabled Screen\'"

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v0, p1, v4}, LIx2;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lzendesk/support/request/ComponentRequestRouter;->enabledView:Lzendesk/support/request/RequestViewConversationsEnabled;

    iput-object p1, p0, Lzendesk/support/request/ComponentRequestRouter;->currentScreen:Lzendesk/support/request/RequestView;

    new-array v0, v1, [Landroid/view/View;

    iget-object v1, p0, Lzendesk/support/request/ComponentRequestRouter;->disabledView:Lzendesk/support/request/RequestViewConversationsDisabled;

    aput-object v1, v0, v3

    iget-object v1, p0, Lzendesk/support/request/ComponentRequestRouter;->loadingView:Lzendesk/support/request/RequestViewLoading;

    aput-object v1, v0, v2

    invoke-direct {p0, p1, v0}, Lzendesk/support/request/ComponentRequestRouter;->displayView(Landroid/view/View;[Landroid/view/View;)V

    iget-object p1, p0, Lzendesk/support/request/ComponentRequestRouter;->enabledView:Lzendesk/support/request/RequestViewConversationsEnabled;

    iget-object v0, p0, Lzendesk/support/request/ComponentRequestRouter;->component:Lzendesk/support/request/RequestComponent;

    iget-boolean v1, p0, Lzendesk/support/request/ComponentRequestRouter;->isCleanStart:Z

    invoke-virtual {p1, v0, v1}, Lzendesk/support/request/RequestViewConversationsEnabled;->init(Lzendesk/support/request/RequestComponent;Z)V

    goto :goto_0

    :cond_3
    const-string p1, "Installing screen: \'Conversations Disabled Screen\'"

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v0, p1, v4}, LIx2;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lzendesk/support/request/ComponentRequestRouter;->disabledView:Lzendesk/support/request/RequestViewConversationsDisabled;

    iput-object p1, p0, Lzendesk/support/request/ComponentRequestRouter;->currentScreen:Lzendesk/support/request/RequestView;

    new-array v0, v1, [Landroid/view/View;

    iget-object v1, p0, Lzendesk/support/request/ComponentRequestRouter;->enabledView:Lzendesk/support/request/RequestViewConversationsEnabled;

    aput-object v1, v0, v3

    iget-object v1, p0, Lzendesk/support/request/ComponentRequestRouter;->loadingView:Lzendesk/support/request/RequestViewLoading;

    aput-object v1, v0, v2

    invoke-direct {p0, p1, v0}, Lzendesk/support/request/ComponentRequestRouter;->displayView(Landroid/view/View;[Landroid/view/View;)V

    iget-object p1, p0, Lzendesk/support/request/ComponentRequestRouter;->disabledView:Lzendesk/support/request/RequestViewConversationsDisabled;

    iget-object v0, p0, Lzendesk/support/request/ComponentRequestRouter;->component:Lzendesk/support/request/RequestComponent;

    invoke-virtual {p1, v0}, Lzendesk/support/request/RequestViewConversationsDisabled;->init(Lzendesk/support/request/RequestComponent;)V

    goto :goto_0

    :cond_4
    const-string p1, "Installing screen: \'Loading Screen\'"

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v0, p1, v4}, LIx2;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lzendesk/support/request/ComponentRequestRouter;->loadingView:Lzendesk/support/request/RequestViewLoading;

    iput-object p1, p0, Lzendesk/support/request/ComponentRequestRouter;->currentScreen:Lzendesk/support/request/RequestView;

    new-array v0, v1, [Landroid/view/View;

    iget-object v1, p0, Lzendesk/support/request/ComponentRequestRouter;->disabledView:Lzendesk/support/request/RequestViewConversationsDisabled;

    aput-object v1, v0, v3

    iget-object v1, p0, Lzendesk/support/request/ComponentRequestRouter;->enabledView:Lzendesk/support/request/RequestViewConversationsEnabled;

    aput-object v1, v0, v2

    invoke-direct {p0, p1, v0}, Lzendesk/support/request/ComponentRequestRouter;->displayView(Landroid/view/View;[Landroid/view/View;)V

    :goto_0
    return-void
.end method
