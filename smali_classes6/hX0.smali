.class public LhX0;
.super LBm1;
.source "SourceFile"


# instance fields
.field public final a:LAm1;

.field public final b:LX94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LX94<",
            "LuI1;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LWh;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LBm1$a;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LbR5;

.field public final f:Lr56;

.field public final g:Ljava/util/concurrent/Executor;

.field public final h:Ljava/util/concurrent/Executor;

.field public final i:Ljava/util/concurrent/Executor;

.field public final j:Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final k:LYk0;

.field public l:LUh;

.field public m:LTh;

.field public n:LVh;


# direct methods
.method public constructor <init>(LAm1;LX94;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 2
    .param p3    # Ljava/util/concurrent/Executor;
        .annotation build Lyd6;
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/Executor;
        .annotation build LVq2;
        .end annotation
    .end param
    .param p5    # Ljava/util/concurrent/Executor;
        .annotation build LYv;
        .end annotation
    .end param
    .param p6    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation build LUW;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAm1;",
            "LX94<",
            "LuI1;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, LBm1;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LhX0;->a:LAm1;

    iput-object p2, p0, LhX0;->b:LX94;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, LhX0;->c:Ljava/util/List;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, LhX0;->d:Ljava/util/List;

    new-instance p2, LbR5;

    invoke-virtual {p1}, LAm1;->j()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, LAm1;->n()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v0, v1}, LbR5;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object p2, p0, LhX0;->e:LbR5;

    new-instance p2, Lr56;

    invoke-virtual {p1}, LAm1;->j()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1, p0, p4, p6}, Lr56;-><init>(Landroid/content/Context;LhX0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    iput-object p2, p0, LhX0;->f:Lr56;

    iput-object p3, p0, LhX0;->g:Ljava/util/concurrent/Executor;

    iput-object p4, p0, LhX0;->h:Ljava/util/concurrent/Executor;

    iput-object p5, p0, LhX0;->i:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, p5}, LhX0;->s(Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    iput-object p1, p0, LhX0;->j:Lcom/google/android/gms/tasks/Task;

    new-instance p1, LYk0$a;

    invoke-direct {p1}, LYk0$a;-><init>()V

    iput-object p1, p0, LhX0;->k:LYk0;

    return-void
.end method

.method public static synthetic g(LhX0;LVh;)V
    .locals 0

    invoke-direct {p0, p1}, LhX0;->r(LVh;)V

    return-void
.end method

.method public static synthetic h(LhX0;ZLcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-direct {p0, p1, p2}, LhX0;->p(ZLcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(LhX0;LVh;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-direct {p0, p1}, LhX0;->o(LVh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(LhX0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0, p1}, LhX0;->q(Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method private synthetic o(LVh;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0, p1}, LhX0;->u(LVh;)V

    iget-object v0, p0, LhX0;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBm1$a;

    invoke-interface {v1, p1}, LBm1$a;->a(LVh;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, LqW0;->a(LVh;)LqW0;

    move-result-object v0

    iget-object v1, p0, LhX0;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LWh;

    invoke-interface {v2, v0}, LWh;->a(LYh;)V

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method private synthetic p(ZLcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    if-nez p1, :cond_0

    invoke-virtual {p0}, LhX0;->m()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LhX0;->n:LVh;

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, LhX0;->m:LTh;

    if-nez p1, :cond_1

    new-instance p1, Lcom/google/firebase/FirebaseException;

    const-string p2, "No AppCheckProvider installed."

    invoke-direct {p1, p2}, Lcom/google/firebase/FirebaseException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p0}, LhX0;->k()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method private synthetic q(Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    iget-object v0, p0, LhX0;->e:LbR5;

    invoke-virtual {v0}, LbR5;->d()LVh;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, LhX0;->t(LVh;)V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic r(LVh;)V
    .locals 1

    iget-object v0, p0, LhX0;->e:LbR5;

    invoke-virtual {v0, p1}, LbR5;->e(LVh;)V

    return-void
.end method


# virtual methods
.method public a(LBm1$a;)V
    .locals 3

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LhX0;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LhX0;->f:Lr56;

    iget-object v1, p0, LhX0;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v2, p0, LhX0;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lr56;->e(I)V

    invoke-virtual {p0}, LhX0;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LhX0;->n:LVh;

    invoke-interface {p1, v0}, LBm1$a;->a(LVh;)V

    :cond_0
    return-void
.end method

.method public b(Z)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/android/gms/tasks/Task<",
            "LVh;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LhX0;->j:Lcom/google/android/gms/tasks/Task;

    iget-object v1, p0, LhX0;->h:Ljava/util/concurrent/Executor;

    new-instance v2, LdX0;

    invoke-direct {v2, p0, p1}, LdX0;-><init>(LhX0;Z)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->continueWithTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public e(LUh;)V
    .locals 1

    iget-object v0, p0, LhX0;->a:LAm1;

    invoke-virtual {v0}, LAm1;->s()Z

    move-result v0

    invoke-virtual {p0, p1, v0}, LhX0;->n(LUh;Z)V

    return-void
.end method

.method public f(Z)V
    .locals 1

    iget-object v0, p0, LhX0;->f:Lr56;

    invoke-virtual {v0, p1}, Lr56;->f(Z)V

    return-void
.end method

.method public k()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "LVh;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LhX0;->m:LTh;

    invoke-interface {v0}, LTh;->getToken()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, LhX0;->g:Ljava/util/concurrent/Executor;

    new-instance v2, LfX0;

    invoke-direct {v2, p0}, LfX0;-><init>(LhX0;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public l()LX94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LX94<",
            "LuI1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LhX0;->b:LX94;

    return-object v0
.end method

.method public final m()Z
    .locals 4

    iget-object v0, p0, LhX0;->n:LVh;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LVh;->a()J

    move-result-wide v0

    iget-object v2, p0, LhX0;->k:LYk0;

    invoke-interface {v2}, LYk0;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x493e0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public n(LUh;Z)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LhX0;->l:LUh;

    iget-object v0, p0, LhX0;->a:LAm1;

    invoke-interface {p1, v0}, LUh;->a(LAm1;)LTh;

    move-result-object p1

    iput-object p1, p0, LhX0;->m:LTh;

    iget-object p1, p0, LhX0;->f:Lr56;

    invoke-virtual {p1, p2}, Lr56;->f(Z)V

    return-void
.end method

.method public final s(Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    new-instance v1, LeX0;

    invoke-direct {v1, p0, v0}, LeX0;-><init>(LhX0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public t(LVh;)V
    .locals 0

    iput-object p1, p0, LhX0;->n:LVh;

    return-void
.end method

.method public final u(LVh;)V
    .locals 2

    iget-object v0, p0, LhX0;->i:Ljava/util/concurrent/Executor;

    new-instance v1, LgX0;

    invoke-direct {v1, p0, p1}, LgX0;-><init>(LhX0;LVh;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {p0, p1}, LhX0;->t(LVh;)V

    iget-object v0, p0, LhX0;->f:Lr56;

    invoke-virtual {v0, p1}, Lr56;->d(LVh;)V

    return-void
.end method
