.class public Lzendesk/support/request/RequestActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/support/request/RequestActivity$RefreshRequestActionHandler;,
        Lzendesk/support/request/RequestActivity$MoveUpWithSnackbarBehaviour;
    }
.end annotation


# static fields
.field static final DEBUG:Z = false

.field static final LOG_TAG:Ljava/lang/String; = "RequestActivity"

.field private static final SAVED_STATE:Ljava/lang/String; = "saved_state"


# instance fields
.field private accessibilityHerald:Lzendesk/support/request/RequestAccessibilityHerald;

.field actionHandlerRegistry:Lzendesk/core/ActionHandlerRegistry;

.field af:Lzendesk/support/request/ActionFactory;

.field headlessComponentListener:Lzendesk/support/request/HeadlessComponentListener;

.field picasso:LiT3;

.field private refreshActionHandler:Lzendesk/support/request/RequestActivity$RefreshRequestActionHandler;

.field private requestComponent:Lzendesk/support/request/RequestComponent;

.field private requestRouter:Lzendesk/support/request/ComponentRequestRouter;

.field store:Lzendesk/support/suas/Store;

.field private subscription:Lzendesk/support/suas/Subscription;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method public static synthetic access$001(Lzendesk/support/request/RequestActivity;)V
    .locals 0

    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    return-void
.end method

.method private bindComponents(Z)Lzendesk/support/suas/Subscription;
    .locals 5

    invoke-direct {p0}, Lzendesk/support/request/RequestActivity;->bindToolbar()Lzendesk/support/request/ComponentToolbar;

    move-result-object v0

    iget-object v1, p0, Lzendesk/support/request/RequestActivity;->store:Lzendesk/support/suas/Store;

    iget-object v2, p0, Lzendesk/support/request/RequestActivity;->af:Lzendesk/support/request/ActionFactory;

    invoke-static {p0, v1, v2}, Lzendesk/support/request/ComponentError;->create(Landroid/app/Activity;Lzendesk/support/suas/Dispatcher;Lzendesk/support/request/ActionFactory;)Lzendesk/support/request/ComponentError;

    move-result-object v1

    iget-object v2, p0, Lzendesk/support/request/RequestActivity;->requestComponent:Lzendesk/support/request/RequestComponent;

    invoke-static {p0, p1, v2}, Lzendesk/support/request/ComponentRequestRouter;->create(Landroidx/appcompat/app/AppCompatActivity;ZLzendesk/support/request/RequestComponent;)Lzendesk/support/request/ComponentRequestRouter;

    move-result-object p1

    iput-object p1, p0, Lzendesk/support/request/RequestActivity;->requestRouter:Lzendesk/support/request/ComponentRequestRouter;

    invoke-static {p0}, Lzendesk/support/request/RequestAccessibilityHerald;->create(Lzendesk/support/request/RequestActivity;)Lzendesk/support/request/RequestAccessibilityHerald;

    move-result-object p1

    iput-object p1, p0, Lzendesk/support/request/RequestActivity;->accessibilityHerald:Lzendesk/support/request/RequestAccessibilityHerald;

    iget-object p1, p0, Lzendesk/support/request/RequestActivity;->store:Lzendesk/support/suas/Store;

    invoke-virtual {v0}, Lzendesk/support/request/ComponentToolbar;->getToolbarSelector()Lzendesk/support/request/ComponentToolbar$ToolbarSelector;

    move-result-object v2

    invoke-interface {p1, v2, v0}, Lzendesk/support/suas/Store;->addListener(Lzendesk/support/suas/StateSelector;Lzendesk/support/suas/Listener;)Lzendesk/support/suas/Subscription;

    move-result-object p1

    iget-object v0, p0, Lzendesk/support/request/RequestActivity;->store:Lzendesk/support/suas/Store;

    iget-object v2, p0, Lzendesk/support/request/RequestActivity;->requestRouter:Lzendesk/support/request/ComponentRequestRouter;

    invoke-virtual {v2}, Lzendesk/support/request/ComponentRequestRouter;->getSelector()Lzendesk/support/suas/StateSelector;

    move-result-object v2

    iget-object v3, p0, Lzendesk/support/request/RequestActivity;->requestRouter:Lzendesk/support/request/ComponentRequestRouter;

    invoke-interface {v0, v2, v3}, Lzendesk/support/suas/Store;->addListener(Lzendesk/support/suas/StateSelector;Lzendesk/support/suas/Listener;)Lzendesk/support/suas/Subscription;

    move-result-object v0

    iget-object v2, p0, Lzendesk/support/request/RequestActivity;->store:Lzendesk/support/suas/Store;

    invoke-static {}, Lzendesk/support/request/ComponentError;->getSelector()Lzendesk/support/suas/StateSelector;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Lzendesk/support/suas/Store;->addListener(Lzendesk/support/suas/StateSelector;Lzendesk/support/suas/Listener;)Lzendesk/support/suas/Subscription;

    move-result-object v1

    iget-object v2, p0, Lzendesk/support/request/RequestActivity;->store:Lzendesk/support/suas/Store;

    iget-object v3, p0, Lzendesk/support/request/RequestActivity;->accessibilityHerald:Lzendesk/support/request/RequestAccessibilityHerald;

    invoke-interface {v2, v3}, Lzendesk/support/suas/Store;->addActionListener(Lzendesk/support/suas/Listener;)Lzendesk/support/suas/Subscription;

    move-result-object v2

    const/4 v3, 0x4

    new-array v3, v3, [Lzendesk/support/suas/Subscription;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 p1, 0x1

    aput-object v0, v3, p1

    const/4 p1, 0x2

    aput-object v1, v3, p1

    const/4 p1, 0x3

    aput-object v2, v3, p1

    invoke-static {v3}, Lzendesk/support/suas/CombinedSubscription;->from([Lzendesk/support/suas/Subscription;)Lzendesk/support/suas/Subscription;

    move-result-object p1

    return-object p1
.end method

.method private bindToolbar()Lzendesk/support/request/ComponentToolbar;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "PrivateResource"
        }
    .end annotation

    sget v0, LPg4;->activity_request_toolbar:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    sget v1, LPg4;->activity_request_progressbar:I

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lzendesk/support/request/ViewAlmostRealProgressBar;

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    new-instance v2, Lzendesk/support/request/RequestActivity$3;

    invoke-direct {v2, p0}, Lzendesk/support/request/RequestActivity$3;-><init>(Lzendesk/support/request/RequestActivity;)V

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v2, LPg4;->activity_request_compat_toolbar_shadow:I

    invoke-virtual {p0, v2}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    new-instance v2, Lzendesk/support/request/ComponentToolbar;

    iget-object v3, p0, Lzendesk/support/request/RequestActivity;->picasso:LiT3;

    invoke-direct {v2, v3, v0, v1}, Lzendesk/support/request/ComponentToolbar;-><init>(LiT3;Landroidx/appcompat/widget/Toolbar;Lzendesk/support/request/ViewAlmostRealProgressBar;)V

    return-object v2
.end method

.method public static builder()Lzendesk/support/request/RequestConfiguration$Builder;
    .locals 1

    new-instance v0, Lzendesk/support/request/RequestConfiguration$Builder;

    invoke-direct {v0}, Lzendesk/support/request/RequestConfiguration$Builder;-><init>()V

    return-object v0
.end method

.method private initViews()V
    .locals 2

    sget v0, LPg4;->activity_request_root:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;

    new-instance v1, Lzendesk/support/request/RequestActivity$MoveUpWithSnackbarBehaviour;

    invoke-direct {v1}, Lzendesk/support/request/RequestActivity$MoveUpWithSnackbarBehaviour;-><init>()V

    invoke-virtual {v0, v1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$e;->q(Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;)V

    return-void
.end method

.method private initializeStoreAndDependencies(Landroid/os/Bundle;Lzendesk/support/request/RequestConfiguration;)Z
    .locals 0

    invoke-direct {p0, p2}, Lzendesk/support/request/RequestActivity;->injectDependencies(Lzendesk/support/request/RequestConfiguration;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-direct {p0, p1}, Lzendesk/support/request/RequestActivity;->restoreState(Landroid/os/Bundle;)Lzendesk/support/suas/State;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lzendesk/support/request/RequestActivity;->store:Lzendesk/support/suas/Store;

    invoke-interface {p2, p1}, Lzendesk/support/suas/Store;->reset(Lzendesk/support/suas/State;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method private injectDependencies(Lzendesk/support/request/RequestConfiguration;)Z
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-static {v0}, Lzendesk/support/request/HeadlessFragment;->getData(Landroidx/fragment/app/FragmentManager;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzendesk/support/request/RequestComponent;

    iput-object v0, p0, Lzendesk/support/request/RequestActivity;->requestComponent:Lzendesk/support/request/RequestComponent;

    if-nez v0, :cond_0

    sget-object v0, Lzendesk/support/SdkDependencyProvider;->INSTANCE:Lzendesk/support/SdkDependencyProvider;

    invoke-virtual {v0}, Lzendesk/support/SdkDependencyProvider;->provideSupportSdkComponent()Lzendesk/support/SupportSdkComponent;

    move-result-object v0

    new-instance v1, Lzendesk/support/request/RequestModule;

    invoke-direct {v1, p1}, Lzendesk/support/request/RequestModule;-><init>(Ldx0;)V

    invoke-interface {v0, v1}, Lzendesk/support/SupportSdkComponent;->plus(Lzendesk/support/request/RequestModule;)Lzendesk/support/request/RequestComponent;

    move-result-object p1

    iput-object p1, p0, Lzendesk/support/request/RequestActivity;->requestComponent:Lzendesk/support/request/RequestComponent;

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p1

    iget-object v0, p0, Lzendesk/support/request/RequestActivity;->requestComponent:Lzendesk/support/request/RequestComponent;

    invoke-static {p1, v0}, Lzendesk/support/request/HeadlessFragment;->install(Landroidx/fragment/app/FragmentManager;Ljava/lang/Object;)V

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    iget-object v0, p0, Lzendesk/support/request/RequestActivity;->requestComponent:Lzendesk/support/request/RequestComponent;

    invoke-interface {v0, p0}, Lzendesk/support/request/RequestComponent;->inject(Lzendesk/support/request/RequestActivity;)V

    return p1
.end method

.method private restoreState(Landroid/os/Bundle;)Lzendesk/support/suas/State;
    .locals 2

    if-eqz p1, :cond_0

    const-string v0, "saved_state"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lzendesk/support/suas/State;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public onBackPressed()V
    .locals 3

    iget-object v0, p0, Lzendesk/support/request/RequestActivity;->requestRouter:Lzendesk/support/request/ComponentRequestRouter;

    invoke-virtual {v0}, Lzendesk/support/request/ComponentRequestRouter;->getCurrentScreen()Lzendesk/support/request/RequestView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lzendesk/support/request/RequestView;->hasUnsavedInput()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    sget v1, Lgl4;->request_dialog_title_unsaved_changes:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->p(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    sget v1, Lgl4;->request_dialog_body_unsaved_changes:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->g(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    sget v1, Lgl4;->request_dialog_button_label_delete:I

    new-instance v2, Lzendesk/support/request/RequestActivity$2;

    invoke-direct {v2, p0}, Lzendesk/support/request/RequestActivity$2;-><init>(Lzendesk/support/request/RequestActivity;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->m(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    sget v1, Lgl4;->request_dialog_button_label_cancel:I

    new-instance v2, Lzendesk/support/request/RequestActivity$1;

    invoke-direct {v2, p0}, Lzendesk/support/request/RequestActivity$1;-><init>(Lzendesk/support/request/RequestActivity;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->i(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->s()Landroidx/appcompat/app/b;

    goto :goto_0

    :cond_0
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget v1, Lyl4;->ZendeskActivityDefaultTheme:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    sget v0, Lzk4;->zs_activity_request:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    invoke-static {p0}, Lzendesk/belvedere/BelvedereUi;->b(Landroidx/appcompat/app/AppCompatActivity;)Lzendesk/belvedere/b;

    invoke-direct {p0}, Lzendesk/support/request/RequestActivity;->initViews()V

    sget-object v0, Lzendesk/support/SdkDependencyProvider;->INSTANCE:Lzendesk/support/SdkDependencyProvider;

    invoke-virtual {v0}, Lzendesk/support/SdkDependencyProvider;->isInitialized()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "RequestActivity"

    if-nez v0, :cond_0

    const-string p1, "Zendesk is not initialized or no identity was set. Make sure Zendesk.INSTANCE.init(...), Zendesk.INSTANCE.setIdentity(...), Support.INSTANCE.init(...) was called "

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {v2, p1, v0}, LIx2;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-class v3, Lzendesk/support/request/RequestConfiguration;

    invoke-static {v0, v3}, LEx0;->e(Landroid/os/Bundle;Ljava/lang/Class;)Ldx0;

    move-result-object v0

    check-cast v0, Lzendesk/support/request/RequestConfiguration;

    if-nez v0, :cond_1

    const-string p1, "No configuration found. Please use RequestActivity.builder()"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {v2, p1, v0}, LIx2;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_1
    new-instance v1, Lzendesk/support/request/RequestActivity$RefreshRequestActionHandler;

    invoke-virtual {v0}, Lzendesk/support/request/RequestConfiguration;->getRequestId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lzendesk/support/request/RequestActivity$RefreshRequestActionHandler;-><init>(Lzendesk/support/request/RequestActivity;Ljava/lang/String;)V

    iput-object v1, p0, Lzendesk/support/request/RequestActivity;->refreshActionHandler:Lzendesk/support/request/RequestActivity$RefreshRequestActionHandler;

    invoke-direct {p0, p1, v0}, Lzendesk/support/request/RequestActivity;->initializeStoreAndDependencies(Landroid/os/Bundle;Lzendesk/support/request/RequestConfiguration;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object v1, p0, Lzendesk/support/request/RequestActivity;->headlessComponentListener:Lzendesk/support/request/HeadlessComponentListener;

    iget-object v2, p0, Lzendesk/support/request/RequestActivity;->store:Lzendesk/support/suas/Store;

    invoke-virtual {v1, v2}, Lzendesk/support/request/HeadlessComponentListener;->startListening(Lzendesk/support/suas/Store;)V

    iget-object v1, p0, Lzendesk/support/request/RequestActivity;->store:Lzendesk/support/suas/Store;

    iget-object v2, p0, Lzendesk/support/request/RequestActivity;->af:Lzendesk/support/request/ActionFactory;

    invoke-virtual {v2, v0}, Lzendesk/support/request/ActionFactory;->installStartConfigAsync(Lzendesk/support/request/RequestConfiguration;)Lzendesk/support/suas/Action;

    move-result-object v0

    invoke-interface {v1, v0}, Lzendesk/support/suas/Store;->dispatch(Lzendesk/support/suas/Action;)V

    iget-object v0, p0, Lzendesk/support/request/RequestActivity;->store:Lzendesk/support/suas/Store;

    iget-object v1, p0, Lzendesk/support/request/RequestActivity;->af:Lzendesk/support/request/ActionFactory;

    invoke-virtual {v1}, Lzendesk/support/request/ActionFactory;->loadSettingsAsync()Lzendesk/support/suas/Action;

    move-result-object v1

    invoke-interface {v0, v1}, Lzendesk/support/suas/Store;->dispatch(Lzendesk/support/suas/Action;)V

    :cond_2
    invoke-direct {p0, p1}, Lzendesk/support/request/RequestActivity;->bindComponents(Z)Lzendesk/support/suas/Subscription;

    move-result-object p1

    iput-object p1, p0, Lzendesk/support/request/RequestActivity;->subscription:Lzendesk/support/suas/Subscription;

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    iget-object v0, p0, Lzendesk/support/request/RequestActivity;->requestRouter:Lzendesk/support/request/ComponentRequestRouter;

    invoke-virtual {v0}, Lzendesk/support/request/ComponentRequestRouter;->getCurrentScreen()Lzendesk/support/request/RequestView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lzendesk/support/request/RequestView;->inflateMenu(Landroid/view/MenuInflater;Landroid/view/Menu;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lzendesk/support/request/RequestActivity;->requestRouter:Lzendesk/support/request/ComponentRequestRouter;

    invoke-virtual {v0}, Lzendesk/support/request/ComponentRequestRouter;->getCurrentScreen()Lzendesk/support/request/RequestView;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lzendesk/support/request/RequestView;->onOptionsItemClicked(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onPause()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    iget-object v0, p0, Lzendesk/support/request/RequestActivity;->store:Lzendesk/support/suas/Store;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lzendesk/support/request/RequestActivity;->af:Lzendesk/support/request/ActionFactory;

    invoke-virtual {v1}, Lzendesk/support/request/ActionFactory;->androidOnPause()Lzendesk/support/suas/Action;

    move-result-object v1

    invoke-interface {v0, v1}, Lzendesk/support/suas/Store;->dispatch(Lzendesk/support/suas/Action;)V

    :cond_0
    iget-object v0, p0, Lzendesk/support/request/RequestActivity;->subscription:Lzendesk/support/suas/Subscription;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lzendesk/support/suas/Subscription;->removeListener()V

    :cond_1
    iget-object v0, p0, Lzendesk/support/request/RequestActivity;->actionHandlerRegistry:Lzendesk/core/ActionHandlerRegistry;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lzendesk/support/request/RequestActivity;->refreshActionHandler:Lzendesk/support/request/RequestActivity$RefreshRequestActionHandler;

    invoke-interface {v0, v1}, Lzendesk/core/ActionHandlerRegistry;->remove(Lzendesk/core/ActionHandler;)V

    :cond_2
    return-void
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    iget-object v0, p0, Lzendesk/support/request/RequestActivity;->store:Lzendesk/support/suas/Store;

    iget-object v1, p0, Lzendesk/support/request/RequestActivity;->af:Lzendesk/support/request/ActionFactory;

    invoke-virtual {v1}, Lzendesk/support/request/ActionFactory;->androidOnResume()Lzendesk/support/suas/Action;

    move-result-object v1

    invoke-interface {v0, v1}, Lzendesk/support/suas/Store;->dispatch(Lzendesk/support/suas/Action;)V

    iget-object v0, p0, Lzendesk/support/request/RequestActivity;->subscription:Lzendesk/support/suas/Subscription;

    invoke-interface {v0}, Lzendesk/support/suas/Subscription;->addListener()V

    iget-object v0, p0, Lzendesk/support/request/RequestActivity;->subscription:Lzendesk/support/suas/Subscription;

    invoke-interface {v0}, Lzendesk/support/suas/Subscription;->informWithCurrentState()V

    iget-object v0, p0, Lzendesk/support/request/RequestActivity;->actionHandlerRegistry:Lzendesk/core/ActionHandlerRegistry;

    iget-object v1, p0, Lzendesk/support/request/RequestActivity;->refreshActionHandler:Lzendesk/support/request/RequestActivity$RefreshRequestActionHandler;

    invoke-interface {v0, v1}, Lzendesk/core/ActionHandlerRegistry;->add(Lzendesk/core/ActionHandler;)V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lzendesk/support/request/RequestActivity;->store:Lzendesk/support/suas/Store;

    invoke-interface {v0}, Lzendesk/support/suas/Store;->getState()Lzendesk/support/suas/State;

    move-result-object v0

    const-string v1, "saved_state"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method
