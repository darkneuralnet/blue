.class public LxW3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LTh;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LS52;

.field public final c:Lz73;

.field public final d:Ljava/util/concurrent/Executor;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:LPN4;


# direct methods
.method public constructor <init>(LAm1;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 8
    .param p2    # Ljava/util/concurrent/Executor;
        .annotation build LVq2;
        .end annotation
    .end param
    .param p3    # Ljava/util/concurrent/Executor;
        .annotation build LUW;
        .end annotation
    .end param

    invoke-virtual {p1}, LAm1;->m()Lpn1;

    move-result-object v0

    invoke-virtual {v0}, Lpn1;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, LAm1;->j()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LU52;->a(Landroid/content/Context;)LS52;

    move-result-object v3

    new-instance v4, Lz73;

    invoke-direct {v4, p1}, Lz73;-><init>(LAm1;)V

    new-instance v7, LPN4;

    invoke-direct {v7}, LPN4;-><init>()V

    move-object v1, p0

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v7}, LxW3;-><init>(Ljava/lang/String;LS52;Lz73;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;LPN4;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LS52;Lz73;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;LPN4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LxW3;->a:Ljava/lang/String;

    iput-object p2, p0, LxW3;->b:LS52;

    iput-object p3, p0, LxW3;->c:Lz73;

    iput-object p4, p0, LxW3;->d:Ljava/util/concurrent/Executor;

    iput-object p5, p0, LxW3;->e:Ljava/util/concurrent/Executor;

    iput-object p6, p0, LxW3;->f:LPN4;

    return-void
.end method

.method public static synthetic a(LxW3;LW52;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-direct {p0, p1}, LxW3;->j(LW52;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LxW3;LkB1;)LlB1;
    .locals 0

    invoke-direct {p0, p1}, LxW3;->g(LkB1;)LlB1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LxW3;Lth1;)LXh;
    .locals 0

    invoke-direct {p0, p1}, LxW3;->i(Lth1;)LXh;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LxW3;LlB1;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-direct {p0, p1}, LxW3;->h(LlB1;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LXh;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-static {p0}, LxW3;->k(LXh;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method private synthetic g(LkB1;)LlB1;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LxW3;->c:Lz73;

    invoke-virtual {p1}, LkB1;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "UTF-8"

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    iget-object v1, p0, LxW3;->f:LPN4;

    invoke-virtual {v0, p1, v1}, Lz73;->c([BLPN4;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LlB1;->a(Ljava/lang/String;)LlB1;

    move-result-object p1

    return-object p1
.end method

.method private synthetic h(LlB1;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LxW3;->b:LS52;

    invoke-static {}, LV52;->a()LV52$a;

    move-result-object v1

    iget-object v2, p0, LxW3;->a:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LV52$a;->b(J)LV52$a;

    move-result-object v1

    invoke-virtual {p1}, LlB1;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, LV52$a;->c(Ljava/lang/String;)LV52$a;

    move-result-object p1

    invoke-virtual {p1}, LV52$a;->a()LV52;

    move-result-object p1

    invoke-interface {v0, p1}, LS52;->a(LV52;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method private synthetic i(Lth1;)LXh;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LxW3;->c:Lz73;

    invoke-virtual {p1}, Lth1;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "UTF-8"

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    const/4 v1, 0x3

    iget-object v2, p0, LxW3;->f:LPN4;

    invoke-virtual {v0, p1, v1, v2}, Lz73;->b([BILPN4;)LXh;

    move-result-object p1

    return-object p1
.end method

.method private synthetic j(LW52;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v0, Lth1;

    invoke-virtual {p1}, LW52;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lth1;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, LxW3;->e:Ljava/util/concurrent/Executor;

    new-instance v1, LwW3;

    invoke-direct {v1, p0, v0}, LwW3;-><init>(LxW3;Lth1;)V

    invoke-static {p1, v1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic k(LXh;)Lcom/google/android/gms/tasks/Task;
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
.method public final f()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "LW52;",
            ">;"
        }
    .end annotation

    new-instance v0, LkB1;

    invoke-direct {v0}, LkB1;-><init>()V

    iget-object v1, p0, LxW3;->e:Ljava/util/concurrent/Executor;

    new-instance v2, LuW3;

    invoke-direct {v2, p0, v0}, LuW3;-><init>(LxW3;LkB1;)V

    invoke-static {v1, v2}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, LxW3;->d:Ljava/util/concurrent/Executor;

    new-instance v2, LvW3;

    invoke-direct {v2, p0}, LvW3;-><init>(LxW3;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

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

    invoke-virtual {p0}, LxW3;->f()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, LxW3;->d:Ljava/util/concurrent/Executor;

    new-instance v2, LsW3;

    invoke-direct {v2, p0}, LsW3;-><init>(LxW3;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, LxW3;->d:Ljava/util/concurrent/Executor;

    new-instance v2, LtW3;

    invoke-direct {v2}, LtW3;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
