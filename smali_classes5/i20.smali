.class public Li20;
.super LwZ1;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "StaticFieldLeak"
    }
.end annotation


# static fields
.field public static final G:Ljava/lang/String;

.field public static volatile H:Li20;


# instance fields
.field public A:Lcom/appboy/events/IEventSubscriber;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/appboy/events/IEventSubscriber<",
            "Leq5;",
            ">;"
        }
    .end annotation
.end field

.field public B:Ljava/lang/Integer;

.field public C:LX10;

.field public D:LHO1;

.field public E:LwO1;

.field public F:LwO1;

.field public final v:LGO1;

.field public final w:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final x:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack<",
            "LwO1;",
            ">;"
        }
    .end annotation
.end field

.field public final y:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "LwO1;",
            "LlZ1;",
            ">;"
        }
    .end annotation
.end field

.field public z:Lcom/appboy/events/IEventSubscriber;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/appboy/events/IEventSubscriber<",
            "LlZ1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Li20;

    invoke-static {v0}, Lk20;->n(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Li20;->G:Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Li20;->H:Li20;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LwZ1;-><init>()V

    new-instance v0, LGX0;

    invoke-direct {v0}, LGX0;-><init>()V

    iput-object v0, p0, Li20;->v:LGO1;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Li20;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Li20;->x:Ljava/util/Stack;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Li20;->y:Ljava/util/Map;

    return-void
.end method

.method public static synthetic l(Li20;Leq5;)V
    .locals 0

    invoke-direct {p0, p1}, Li20;->w(Leq5;)V

    return-void
.end method

.method public static synthetic m(Li20;)V
    .locals 0

    invoke-direct {p0}, Li20;->v()V

    return-void
.end method

.method public static synthetic n(Li20;LlZ1;)V
    .locals 0

    invoke-direct {p0, p1}, Li20;->u(LlZ1;)V

    return-void
.end method

.method public static s()Li20;
    .locals 2

    sget-object v0, Li20;->H:Li20;

    if-nez v0, :cond_1

    const-class v0, Li20;

    monitor-enter v0

    :try_start_0
    sget-object v1, Li20;->H:Li20;

    if-nez v1, :cond_0

    new-instance v1, Li20;

    invoke-direct {v1}, Li20;-><init>()V

    sput-object v1, Li20;->H:Li20;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Li20;->H:Li20;

    return-object v0
.end method

.method private synthetic u(LlZ1;)V
    .locals 2

    invoke-virtual {p1}, LlZ1;->a()LwO1;

    move-result-object v0

    iget-object v1, p0, Li20;->y:Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Li20;->o(LwO1;)V

    return-void
.end method

.method private synthetic v()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Li20;->D:LHO1;

    if-eqz v0, :cond_0

    iget-object v0, p0, LwZ1;->c:Landroid/app/Activity;

    if-eqz v0, :cond_0

    sget-object v0, Li20;->G:Ljava/lang/String;

    const-string v1, "Page has finished loading. Opening in-app message view wrapper."

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Li20;->D:LHO1;

    iget-object v1, p0, LwZ1;->c:Landroid/app/Activity;

    invoke-interface {v0, v1}, LHO1;->c(Landroid/app/Activity;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Li20;->G:Ljava/lang/String;

    const-string v2, "Failed to open view wrapper in page finished listener"

    invoke-static {v1, v2, v0}, Lk20;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method private synthetic w(Leq5;)V
    .locals 0

    iget-object p1, p0, Li20;->x:Ljava/util/Stack;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->clear()V

    const/4 p1, 0x0

    iput-object p1, p0, Li20;->E:LwO1;

    iput-object p1, p0, Li20;->F:LwO1;

    return-void
.end method


# virtual methods
.method public A(Landroid/app/Activity;)V
    .locals 3

    if-nez p1, :cond_0

    sget-object p1, Li20;->G:Ljava/lang/String;

    const-string v0, "Null Activity passed to unregisterInAppMessageManager."

    invoke-static {p1, v0}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object v0, Li20;->G:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unregistering InAppMessageManager from activity: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lk20;->w(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object p1, p0, Li20;->D:LHO1;

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    invoke-interface {p1}, LHO1;->a()Landroid/view/View;

    move-result-object p1

    instance-of v1, p1, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;

    if-eqz v1, :cond_1

    sget-object v1, Li20;->G:Ljava/lang/String;

    const-string v2, "In-app message view includes HTML. Removing the page finished listener."

    invoke-static {v1, v2}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;

    invoke-virtual {v1, v0}, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->setHtmlPageFinishedListener(LpP1;)V

    :cond_1
    invoke-static {p1}, LWt6;->j(Landroid/view/View;)V

    iget-object p1, p0, Li20;->D:LHO1;

    invoke-interface {p1}, LHO1;->d()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Li20;->v:LGO1;

    iget-object v1, p0, Li20;->D:LHO1;

    invoke-interface {v1}, LHO1;->b()LwO1;

    move-result-object v1

    invoke-interface {p1, v1}, LGO1;->c(LwO1;)V

    iput-object v0, p0, Li20;->E:LwO1;

    goto :goto_1

    :cond_2
    iget-object p1, p0, Li20;->D:LHO1;

    invoke-interface {p1}, LHO1;->b()LwO1;

    move-result-object p1

    iput-object p1, p0, Li20;->E:LwO1;

    :goto_1
    iput-object v0, p0, Li20;->D:LHO1;

    goto :goto_2

    :cond_3
    iput-object v0, p0, Li20;->E:LwO1;

    :goto_2
    iput-object v0, p0, LwZ1;->c:Landroid/app/Activity;

    iget-object p1, p0, Li20;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public B(LwO1;)Z
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InlinedApi"
        }
    .end annotation

    iget-object v0, p0, LwZ1;->c:Landroid/app/Activity;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    sget-object p1, Li20;->G:Ljava/lang/String;

    const-string v0, "Cannot verify orientation status with null Activity."

    invoke-static {p1, v0}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    invoke-static {v0}, LWt6;->i(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Li20;->G:Ljava/lang/String;

    const-string v0, "Running on tablet. In-app message can be displayed in any orientation."

    invoke-static {p1, v0}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_1
    invoke-interface {p1}, LwO1;->F()LCy3;

    move-result-object p1

    if-nez p1, :cond_2

    sget-object p1, Li20;->G:Ljava/lang/String;

    const-string v0, "No orientation specified. In-app message can be displayed in any orientation."

    invoke-static {p1, v0}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_2
    sget-object v0, LCy3;->d:LCy3;

    if-ne p1, v0, :cond_3

    sget-object p1, Li20;->G:Ljava/lang/String;

    const-string v0, "Any orientation specified. In-app message can be displayed in any orientation."

    invoke-static {p1, v0}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_3
    iget-object v0, p0, LwZ1;->c:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    invoke-static {v0, p1}, LWt6;->f(ILCy3;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Li20;->B:Ljava/lang/Integer;

    if-nez p1, :cond_4

    sget-object p1, Li20;->G:Ljava/lang/String;

    const-string v0, "Requesting orientation lock."

    invoke-static {p1, v0}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, LwZ1;->c:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getRequestedOrientation()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Li20;->B:Ljava/lang/Integer;

    iget-object p1, p0, LwZ1;->c:Landroid/app/Activity;

    const/16 v0, 0xe

    invoke-static {p1, v0}, LWt6;->k(Landroid/app/Activity;I)V

    :cond_4
    return v1

    :cond_5
    const/4 p1, 0x0

    return p1
.end method

.method public o(LwO1;)V
    .locals 1

    iget-object v0, p0, Li20;->x:Ljava/util/Stack;

    invoke-virtual {v0, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Li20;->y()Z

    return-void
.end method

.method public final p()Lcom/appboy/events/IEventSubscriber;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/appboy/events/IEventSubscriber<",
            "LlZ1;",
            ">;"
        }
    .end annotation

    new-instance v0, Lh20;

    invoke-direct {v0, p0}, Lh20;-><init>(Li20;)V

    return-object v0
.end method

.method public q(LwO1;Z)V
    .locals 12

    sget-object v0, Li20;->G:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Attempting to display in-app message with payload: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LaP1;->forJsonPut()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/json/JSONObject;

    invoke-static {v2}, LAj2;->i(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lk20;->w(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Li20;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-nez v1, :cond_0

    const-string p2, "A in-app message is currently being displayed. Adding in-app message back on the stack."

    invoke-static {v0, p2}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Li20;->x:Ljava/util/Stack;

    invoke-virtual {p2, p1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    :try_start_0
    iget-object v1, p0, LwZ1;->c:Landroid/app/Activity;

    if-eqz v1, :cond_e

    if-nez p2, :cond_3

    invoke-interface {p1}, LwO1;->o0()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long p2, v1, v3

    if-lez p2, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    cmp-long p2, v3, v1

    if-gtz p2, :cond_1

    goto :goto_0

    :cond_1
    new-instance p2, Ljava/lang/Exception;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "In-app message is expired. Doing nothing. Expiration: $"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ". Current time: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    const-string p2, "Expiration timestamp not defined. Continuing."

    invoke-static {v0, p2}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const-string p2, "Not checking expiration status for carry-over in-app message."

    invoke-static {v0, p2}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0, p1}, Li20;->B(LwO1;)Z

    move-result p2

    if-eqz p2, :cond_d

    invoke-interface {p1}, LwO1;->isControl()Z

    move-result p2

    if-eqz p2, :cond_4

    const-string p2, "Not displaying control in-app message. Logging impression and ending display execution."

    invoke-static {v0, p2}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, LwO1;->logImpression()Z

    invoke-virtual {p0}, Li20;->z()V

    return-void

    :cond_4
    invoke-static {p1}, LS10;->a(LwO1;)Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p2, p0, LwZ1;->c:Landroid/app/Activity;

    invoke-static {p2}, LdR3;->e(Landroid/app/Activity;)Z

    move-result p2

    if-nez p2, :cond_6

    iget-object p2, p0, Li20;->y:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LlZ1;

    const-string v1, "Cannot show message containing a Braze Actions Push Prompt due to existing push prompt status."

    invoke-static {v0, v1}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_5

    const-string v1, "Will attempt to perform any fallback actions."

    invoke-static {v0, v1}, Lk20;->p(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LwZ1;->c:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/appboy/BrazeInternal;->retryInAppMessage(Landroid/content/Context;LlZ1;)V

    :cond_5
    invoke-virtual {p0}, Li20;->z()V

    return-void

    :cond_6
    invoke-virtual {p0, p1}, LwZ1;->j(LwO1;)LFO1;

    move-result-object p2

    if-eqz p2, :cond_c

    iget-object v1, p0, LwZ1;->c:Landroid/app/Activity;

    invoke-interface {p2, v1, p1}, LFO1;->a(Landroid/app/Activity;LwO1;)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_b

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_a

    invoke-virtual {p0}, LwZ1;->h()LxO1;

    move-result-object v1

    invoke-interface {v1, p1}, LxO1;->a(LwO1;)Landroid/view/animation/Animation;

    move-result-object v7

    invoke-virtual {p0}, LwZ1;->h()LxO1;

    move-result-object v1

    invoke-interface {v1, p1}, LxO1;->b(LwO1;)Landroid/view/animation/Animation;

    move-result-object v8

    invoke-virtual {p0}, LwZ1;->k()LIO1;

    move-result-object v2

    instance-of v1, p2, LBO1;

    if-eqz v1, :cond_7

    const-string v1, "Creating view wrapper for immersive in-app message."

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, p2

    check-cast v1, LBO1;

    move-object v3, p1

    check-cast v3, LsZ1;

    invoke-virtual {v3}, LsZ1;->M()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    iget-object v5, p0, Li20;->v:LGO1;

    iget-object v6, p0, Li20;->C:LX10;

    invoke-interface {v1}, LEO1;->getMessageClickableView()Landroid/view/View;

    move-result-object v9

    invoke-interface {v1, v3}, LBO1;->getMessageButtonViews(I)Ljava/util/List;

    move-result-object v10

    invoke-interface {v1}, LBO1;->getMessageCloseButtonView()Landroid/view/View;

    move-result-object v11

    move-object v3, p2

    move-object v4, p1

    invoke-interface/range {v2 .. v11}, LIO1;->b(Landroid/view/View;LwO1;LGO1;LX10;Landroid/view/animation/Animation;Landroid/view/animation/Animation;Landroid/view/View;Ljava/util/List;Landroid/view/View;)LHO1;

    move-result-object v1

    iput-object v1, p0, Li20;->D:LHO1;

    goto :goto_1

    :cond_7
    instance-of v1, p2, LEO1;

    if-eqz v1, :cond_8

    const-string v1, "Creating view wrapper for base in-app message."

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    move-object v1, p2

    check-cast v1, LEO1;

    iget-object v5, p0, Li20;->v:LGO1;

    iget-object v6, p0, Li20;->C:LX10;

    invoke-interface {v1}, LEO1;->getMessageClickableView()Landroid/view/View;

    move-result-object v9

    move-object v3, p2

    move-object v4, p1

    invoke-interface/range {v2 .. v9}, LIO1;->a(Landroid/view/View;LwO1;LGO1;LX10;Landroid/view/animation/Animation;Landroid/view/animation/Animation;Landroid/view/View;)LHO1;

    move-result-object v1

    iput-object v1, p0, Li20;->D:LHO1;

    goto :goto_1

    :cond_8
    const-string v1, "Creating view wrapper for in-app message."

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, p0, Li20;->v:LGO1;

    iget-object v6, p0, Li20;->C:LX10;

    move-object v3, p2

    move-object v4, p1

    move-object v9, p2

    invoke-interface/range {v2 .. v9}, LIO1;->a(Landroid/view/View;LwO1;LGO1;LX10;Landroid/view/animation/Animation;Landroid/view/animation/Animation;Landroid/view/View;)LHO1;

    move-result-object v1

    iput-object v1, p0, Li20;->D:LHO1;

    :goto_1
    instance-of v1, p2, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;

    if-eqz v1, :cond_9

    const-string v1, "In-app message view includes HTML. Delaying display until the content has finished loading."

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    check-cast p2, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;

    new-instance v0, Lg20;

    invoke-direct {v0, p0}, Lg20;-><init>(Li20;)V

    invoke-virtual {p2, v0}, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->setHtmlPageFinishedListener(LpP1;)V

    goto :goto_2

    :cond_9
    iget-object p2, p0, Li20;->D:LHO1;

    iget-object v0, p0, LwZ1;->c:Landroid/app/Activity;

    invoke-interface {p2, v0}, LHO1;->c(Landroid/app/Activity;)V

    goto :goto_2

    :cond_a
    sget-object p2, LmZ1;->e:LmZ1;

    invoke-interface {p1, p2}, LwO1;->T(LmZ1;)Z

    new-instance p2, Ljava/lang/Exception;

    const-string v0, "The in-app message view returned from the IInAppMessageViewFactory already has a parent. This is a sign that the view is being reused. The IInAppMessageViewFactory method createInAppMessageViewmust return a new view without a parent. The in-app message will not be displayed and will not be put back on the stack."

    invoke-direct {p2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_b
    sget-object p2, LmZ1;->e:LmZ1;

    invoke-interface {p1, p2}, LwO1;->T(LmZ1;)Z

    new-instance p2, Ljava/lang/Exception;

    const-string v0, "The in-app message view returned from the IInAppMessageViewFactory was null. The in-app message will not be displayed and will not be put back on the stack."

    invoke-direct {p2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_c
    sget-object p2, LmZ1;->e:LmZ1;

    invoke-interface {p1, p2}, LwO1;->T(LmZ1;)Z

    new-instance p2, Ljava/lang/Exception;

    const-string v0, "ViewFactory from getInAppMessageViewFactory was null."

    invoke-direct {p2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_d
    new-instance p2, Ljava/lang/Exception;

    const-string v0, "Current orientation did not match specified orientation for in-app message. Doing nothing."

    invoke-direct {p2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_e
    iput-object p1, p0, Li20;->E:LwO1;

    new-instance p2, Ljava/lang/Exception;

    const-string v0, "No Activity is currently registered to receive in-app messages. Registering in-app message as carry-over in-app message. It will automatically be displayed when the next Activity registers to receive in-app messages."

    invoke-direct {p2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p2

    sget-object v0, Li20;->G:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not display in-app message with payload: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LaP1;->forJsonPut()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/json/JSONObject;

    invoke-static {p1}, LAj2;->i(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, p2}, Lk20;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Li20;->z()V

    :goto_2
    return-void
.end method

.method public r(Landroid/content/Context;)V
    .locals 4

    iget-object v0, p0, Li20;->z:Lcom/appboy/events/IEventSubscriber;

    if-eqz v0, :cond_0

    sget-object v0, Li20;->G:Ljava/lang/String;

    const-string v1, "Removing existing in-app message event subscriber before subscribing a new one."

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v0

    iget-object v1, p0, Li20;->z:Lcom/appboy/events/IEventSubscriber;

    const-class v2, LlZ1;

    invoke-virtual {v0, v1, v2}, Lcom/appboy/Appboy;->removeSingleSubscription(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)V

    :cond_0
    sget-object v0, Li20;->G:Ljava/lang/String;

    const-string v1, "Subscribing in-app message event subscriber"

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Li20;->p()Lcom/appboy/events/IEventSubscriber;

    move-result-object v1

    iput-object v1, p0, Li20;->z:Lcom/appboy/events/IEventSubscriber;

    invoke-static {p1}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v1

    iget-object v2, p0, Li20;->z:Lcom/appboy/events/IEventSubscriber;

    invoke-virtual {v1, v2}, Lcom/appboy/Appboy;->subscribeToNewInAppMessages(Lcom/appboy/events/IEventSubscriber;)V

    iget-object v1, p0, Li20;->A:Lcom/appboy/events/IEventSubscriber;

    const-class v2, Leq5;

    if-eqz v1, :cond_1

    const-string v1, "Removing existing sdk data wipe event subscriber before subscribing a new one."

    invoke-static {v0, v1}, Lk20;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v1

    iget-object v3, p0, Li20;->A:Lcom/appboy/events/IEventSubscriber;

    invoke-virtual {v1, v3, v2}, Lcom/appboy/Appboy;->removeSingleSubscription(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)V

    :cond_1
    const-string v1, "Subscribing sdk data wipe subscriber"

    invoke-static {v0, v1}, Lk20;->w(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lf20;

    invoke-direct {v0, p0}, Lf20;-><init>(Li20;)V

    iput-object v0, p0, Li20;->A:Lcom/appboy/events/IEventSubscriber;

    invoke-static {p1}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object p1

    iget-object v0, p0, Li20;->A:Lcom/appboy/events/IEventSubscriber;

    invoke-virtual {p1, v0, v2}, Lcom/appboy/Appboy;->addSingleSynchronousSubscription(Lcom/appboy/events/IEventSubscriber;Ljava/lang/Class;)V

    return-void
.end method

.method public t(Z)V
    .locals 3

    iget-object v0, p0, Li20;->D:LHO1;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    iget-object p1, p0, Li20;->v:LGO1;

    invoke-interface {v0}, LHO1;->a()Landroid/view/View;

    move-result-object v1

    invoke-interface {v0}, LHO1;->b()LwO1;

    move-result-object v2

    invoke-interface {p1, v1, v2}, LGO1;->e(Landroid/view/View;LwO1;)V

    :cond_0
    invoke-interface {v0}, LHO1;->close()V

    :cond_1
    return-void
.end method

.method public x(Landroid/app/Activity;)V
    .locals 3

    if-nez p1, :cond_0

    sget-object p1, Li20;->G:Ljava/lang/String;

    const-string v0, "Null Activity passed to registerInAppMessageManager. Doing nothing"

    invoke-static {p1, v0}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object v0, Li20;->G:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Registering InAppMessageManager with activity: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/app/Activity;->getLocalClassName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lk20;->w(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, LwZ1;->c:Landroid/app/Activity;

    iget-object v1, p0, LwZ1;->d:Landroid/content/Context;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LwZ1;->d:Landroid/content/Context;

    :cond_1
    iget-object p1, p0, Li20;->C:LX10;

    if-nez p1, :cond_2

    new-instance p1, LX10;

    iget-object v1, p0, LwZ1;->d:Landroid/content/Context;

    invoke-direct {p1, v1}, LX10;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Li20;->C:LX10;

    :cond_2
    iget-object p1, p0, Li20;->E:LwO1;

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-string p1, "Requesting display of carryover in-app message."

    invoke-static {v0, p1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Li20;->E:LwO1;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LwO1;->j0(Z)V

    iget-object p1, p0, Li20;->E:LwO1;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Li20;->q(LwO1;Z)V

    iput-object v1, p0, Li20;->E:LwO1;

    goto :goto_0

    :cond_3
    iget-object p1, p0, Li20;->F:LwO1;

    if-eqz p1, :cond_4

    const-string p1, "Adding previously unregistered in-app message."

    invoke-static {v0, p1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Li20;->F:LwO1;

    invoke-virtual {p0, p1}, Li20;->o(LwO1;)V

    iput-object v1, p0, Li20;->F:LwO1;

    :cond_4
    :goto_0
    iget-object p1, p0, LwZ1;->d:Landroid/content/Context;

    invoke-virtual {p0, p1}, Li20;->r(Landroid/content/Context;)V

    return-void
.end method

.method public y()Z
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, LwZ1;->c:Landroid/app/Activity;

    if-nez v1, :cond_1

    iget-object v1, p0, Li20;->x:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->empty()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Li20;->G:Ljava/lang/String;

    const-string v2, "No activity is currently registered to receive in-app messages. Saving in-app message as unregistered in-app message. It will automatically be displayed when the next activity registers to receive in-app messages."

    invoke-static {v1, v2}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Li20;->x:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LwO1;

    iput-object v1, p0, Li20;->F:LwO1;

    goto :goto_0

    :cond_0
    sget-object v1, Li20;->G:Ljava/lang/String;

    const-string v2, "No activity is currently registered to receive in-app messages and the in-app message stack is empty. Doing nothing."

    invoke-static {v1, v2}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return v0

    :cond_1
    iget-object v1, p0, Li20;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Li20;->G:Ljava/lang/String;

    const-string v2, "A in-app message is currently being displayed. Ignoring request to display in-app message."

    invoke-static {v1, v2}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :cond_2
    iget-object v1, p0, Li20;->x:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Li20;->G:Ljava/lang/String;

    const-string v2, "The in-app message stack is empty. No in-app message will be displayed."

    invoke-static {v1, v2}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :cond_3
    iget-object v1, p0, Li20;->x:Ljava/util/Stack;

    invoke-virtual {v1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LwO1;

    invoke-interface {v1}, LwO1;->isControl()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {p0}, LwZ1;->i()LCO1;

    move-result-object v2

    invoke-interface {v2, v1}, LCO1;->h(LwO1;)LAZ1;

    move-result-object v2

    goto :goto_1

    :cond_4
    sget-object v2, Li20;->G:Ljava/lang/String;

    const-string v3, "Using the control in-app message manager listener."

    invoke-static {v2, v3}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, LwZ1;->c()LCO1;

    move-result-object v2

    invoke-interface {v2, v1}, LCO1;->h(LwO1;)LAZ1;

    move-result-object v2

    :goto_1
    sget-object v3, Li20$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_7

    const/4 v3, 0x2

    if-eq v2, v3, :cond_6

    const/4 v1, 0x3

    if-eq v2, v1, :cond_5

    sget-object v1, Li20;->G:Ljava/lang/String;

    const-string v2, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned null instead of a InAppMessageOperation. Ignoring the in-app message. Please check the IInAppMessageStackBehaviour implementation."

    invoke-static {v1, v2}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :cond_5
    sget-object v1, Li20;->G:Ljava/lang/String;

    const-string v2, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISCARD. The in-app message will not be displayed and will not be put back on the stack."

    invoke-static {v1, v2}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :cond_6
    sget-object v2, Li20;->G:Ljava/lang/String;

    const-string v3, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack."

    invoke-static {v2, v3}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Li20;->x:Ljava/util/Stack;

    invoke-virtual {v2, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    return v0

    :cond_7
    sget-object v2, Li20;->G:Ljava/lang/String;

    const-string v4, "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_NOW. The in-app message will be displayed."

    invoke-static {v2, v4}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Law;->g(LwO1;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v3

    :catch_0
    move-exception v1

    sget-object v2, Li20;->G:Ljava/lang/String;

    const-string v3, "Error running requestDisplayInAppMessage"

    invoke-static {v2, v3, v1}, Lk20;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0
.end method

.method public z()V
    .locals 4

    sget-object v0, Li20;->G:Ljava/lang/String;

    const-string v1, "Resetting after in-app message close."

    invoke-static {v0, v1}, Lk20;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    iput-object v1, p0, Li20;->D:LHO1;

    iget-object v2, p0, Li20;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v2, p0, LwZ1;->c:Landroid/app/Activity;

    if-eqz v2, :cond_0

    iget-object v2, p0, Li20;->B:Ljava/lang/Integer;

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Setting requested orientation to original orientation "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Li20;->B:Ljava/lang/Integer;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LwZ1;->c:Landroid/app/Activity;

    iget-object v2, p0, Li20;->B:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-static {v0, v2}, LWt6;->k(Landroid/app/Activity;I)V

    iput-object v1, p0, Li20;->B:Ljava/lang/Integer;

    :cond_0
    return-void
.end method
