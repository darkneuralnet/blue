.class public LKU0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LTh;


# static fields
.field public static final f:Ljava/lang/String; = "KU0"


# instance fields
.field public final a:Lz73;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:LPN4;

.field public final e:Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LAm1;LX94;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 1
    .param p3    # Ljava/util/concurrent/Executor;
        .annotation build LVq2;
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/Executor;
        .annotation build LYv;
        .end annotation
    .end param
    .param p5    # Ljava/util/concurrent/Executor;
        .annotation build LUW;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAm1;",
            "LX94<",
            "Lp62;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lz73;

    invoke-direct {v0, p1}, Lz73;-><init>(LAm1;)V

    iput-object v0, p0, LKU0;->a:Lz73;

    iput-object p3, p0, LKU0;->b:Ljava/util/concurrent/Executor;

    iput-object p5, p0, LKU0;->c:Ljava/util/concurrent/Executor;

    new-instance p3, LPN4;

    invoke-direct {p3}, LPN4;-><init>()V

    iput-object p3, p0, LKU0;->d:LPN4;

    invoke-interface {p2}, LX94;->get()Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, LX94;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lp62;

    invoke-interface {p2}, Lp62;->a()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    invoke-static {p1, p4}, LKU0;->e(LAm1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {p2}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    :goto_1
    iput-object p1, p0, LKU0;->e:Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public static synthetic a(LKU0;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-direct {p0, p1}, LKU0;->h(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LAm1;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-static {p0, p1}, LKU0;->f(LAm1;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method

.method public static synthetic c(LXh;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-static {p0}, LKU0;->i(LXh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LKU0;Lsh1;)LXh;
    .locals 0

    invoke-direct {p0, p1}, LKU0;->g(Lsh1;)LXh;

    move-result-object p0

    return-object p0
.end method

.method public static e(LAm1;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAm1;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    new-instance v1, LGU0;

    invoke-direct {v1, p0, v0}, LGU0;-><init>(LAm1;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(LAm1;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 3

    new-instance v0, LcR5;

    invoke-virtual {p0}, LAm1;->j()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, LAm1;->n()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, LcR5;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0}, LcR5;->a()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, LcR5;->b(Ljava/lang/String;)V

    :cond_0
    sget-object v0, LKU0;->f:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Enter this debug secret into the allow list in the Firebase Console for your project: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic g(Lsh1;)LXh;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LKU0;->a:Lz73;

    invoke-virtual {p1}, Lsh1;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "UTF-8"

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    const/4 v1, 0x2

    iget-object v2, p0, LKU0;->d:LPN4;

    invoke-virtual {v0, p1, v1, v2}, Lz73;->b([BILPN4;)LXh;

    move-result-object p1

    return-object p1
.end method

.method private synthetic h(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v0, Lsh1;

    invoke-direct {v0, p1}, Lsh1;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, LKU0;->c:Ljava/util/concurrent/Executor;

    new-instance v1, LJU0;

    invoke-direct {v1, p0, v0}, LJU0;-><init>(LKU0;Lsh1;)V

    invoke-static {p1, v1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic i(LXh;)Lcom/google/android/gms/tasks/Task;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {p0}, LpW0;->c(LXh;)LpW0;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getToken()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "LVh;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LKU0;->e:Lcom/google/android/gms/tasks/Task;

    iget-object v1, p0, LKU0;->b:Ljava/util/concurrent/Executor;

    new-instance v2, LHU0;

    invoke-direct {v2, p0}, LHU0;-><init>(LKU0;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, LKU0;->b:Ljava/util/concurrent/Executor;

    new-instance v2, LIU0;

    invoke-direct {v2}, LIU0;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
