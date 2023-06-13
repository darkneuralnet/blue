.class public LaD6;
.super LZC6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LaD6$a;
    }
.end annotation


# static fields
.field public static final k:Ljava/lang/String;

.field public static l:LaD6;

.field public static m:LaD6;

.field public static final n:Ljava/lang/Object;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Landroidx/work/a;

.field public c:Landroidx/work/impl/WorkDatabase;

.field public d:LmZ5;

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lxm5;",
            ">;"
        }
    .end annotation
.end field

.field public f:Li74;

.field public g:LTZ3;

.field public h:Z

.field public i:Landroid/content/BroadcastReceiver$PendingResult;

.field public final j:Ll66;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkManagerImpl"

    invoke-static {v0}, LBx2;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LaD6;->k:Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, LaD6;->l:LaD6;

    sput-object v0, LaD6;->m:LaD6;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LaD6;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;LmZ5;)V
    .locals 2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lwf4;->workmanager_test_configuration:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    invoke-direct {p0, p1, p2, p3, v0}, LaD6;-><init>(Landroid/content/Context;Landroidx/work/a;LmZ5;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;LmZ5;Landroidx/work/impl/WorkDatabase;)V
    .locals 9

    invoke-direct {p0}, LZC6;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, LBx2$a;

    invoke-virtual {p2}, Landroidx/work/a;->j()I

    move-result v2

    invoke-direct {v1, v2}, LBx2$a;-><init>(I)V

    invoke-static {v1}, LBx2;->h(LBx2;)V

    new-instance v1, Ll66;

    invoke-direct {v1, v0, p3}, Ll66;-><init>(Landroid/content/Context;LmZ5;)V

    iput-object v1, p0, LaD6;->j:Ll66;

    invoke-virtual {p0, v0, p2, v1}, LaD6;->k(Landroid/content/Context;Landroidx/work/a;Ll66;)Ljava/util/List;

    move-result-object v0

    new-instance v8, Li74;

    move-object v2, v8

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, v0

    invoke-direct/range {v2 .. v7}, Li74;-><init>(Landroid/content/Context;Landroidx/work/a;LmZ5;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    move-object v2, p0

    invoke-virtual/range {v2 .. v8}, LaD6;->w(Landroid/content/Context;Landroidx/work/a;LmZ5;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Li74;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;LmZ5;Z)V
    .locals 2

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-interface {p3}, LmZ5;->c()LRs5;

    move-result-object v1

    invoke-static {v0, v1, p4}, Landroidx/work/impl/WorkDatabase;->C(Landroid/content/Context;Ljava/util/concurrent/Executor;Z)Landroidx/work/impl/WorkDatabase;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, LaD6;-><init>(Landroid/content/Context;Landroidx/work/a;LmZ5;Landroidx/work/impl/WorkDatabase;)V

    return-void
.end method

.method public static i(Landroid/content/Context;Landroidx/work/a;)V
    .locals 4

    sget-object v0, LaD6;->n:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LaD6;->l:LaD6;

    if-eqz v1, :cond_1

    sget-object v2, LaD6;->m:LaD6;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    if-nez v1, :cond_3

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sget-object v1, LaD6;->m:LaD6;

    if-nez v1, :cond_2

    new-instance v1, LaD6;

    new-instance v2, LbD6;

    invoke-virtual {p1}, Landroidx/work/a;->m()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-direct {v2, v3}, LbD6;-><init>(Ljava/util/concurrent/Executor;)V

    invoke-direct {v1, p0, p1, v2}, LaD6;-><init>(Landroid/content/Context;Landroidx/work/a;LmZ5;)V

    sput-object v1, LaD6;->m:LaD6;

    :cond_2
    sget-object p0, LaD6;->m:LaD6;

    sput-object p0, LaD6;->l:LaD6;

    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static o()LaD6;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, LaD6;->n:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LaD6;->l:LaD6;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    sget-object v1, LaD6;->m:LaD6;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static p(Landroid/content/Context;)LaD6;
    .locals 2

    sget-object v0, LaD6;->n:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, LaD6;->o()LaD6;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    instance-of v1, p0, Landroidx/work/a$c;

    if-eqz v1, :cond_0

    move-object v1, p0

    check-cast v1, Landroidx/work/a$c;

    invoke-interface {v1}, Landroidx/work/a$c;->a()Landroidx/work/a;

    move-result-object v1

    invoke-static {p0, v1}, LaD6;->i(Landroid/content/Context;Landroidx/work/a;)V

    invoke-static {p0}, LaD6;->p(Landroid/content/Context;)LaD6;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v1, "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public A(LiP5;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LaD6;->B(LiP5;Landroidx/work/WorkerParameters$a;)V

    return-void
.end method

.method public B(LiP5;Landroidx/work/WorkerParameters$a;)V
    .locals 2

    iget-object v0, p0, LaD6;->d:LmZ5;

    new-instance v1, LlP5;

    invoke-direct {v1, p0, p1, p2}, LlP5;-><init>(LaD6;LiP5;Landroidx/work/WorkerParameters$a;)V

    invoke-interface {v0, v1}, LmZ5;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public C(LTC6;)V
    .locals 3

    iget-object v0, p0, LaD6;->d:LmZ5;

    new-instance v1, LXQ5;

    new-instance v2, LiP5;

    invoke-direct {v2, p1}, LiP5;-><init>(LTC6;)V

    const/4 p1, 0x1

    invoke-direct {v1, p0, v2, p1}, LXQ5;-><init>(LaD6;LiP5;Z)V

    invoke-interface {v0, v1}, LmZ5;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public D(LiP5;)V
    .locals 3

    iget-object v0, p0, LaD6;->d:LmZ5;

    new-instance v1, LXQ5;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, LXQ5;-><init>(LaD6;LiP5;Z)V

    invoke-interface {v0, v1}, LmZ5;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Ljava/util/List;)LIC6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LFh3;",
            ">;)",
            "LIC6;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, LJC6;

    invoke-direct {v0, p0, p1}, LJC6;-><init>(LaD6;Ljava/util/List;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "beginWith needs at least one OneTimeWorkRequest."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Ljava/lang/String;)LXh3;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p1, p0, v0}, LTc0;->c(Ljava/lang/String;LaD6;Z)LTc0;

    move-result-object p1

    iget-object v0, p0, LaD6;->d:LmZ5;

    invoke-interface {v0, p1}, LmZ5;->a(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, LTc0;->d()LXh3;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/util/List;)LXh3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "LEG6;",
            ">;)",
            "LXh3;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, LJC6;

    invoke-direct {v0, p0, p1}, LJC6;-><init>(LaD6;Ljava/util/List;)V

    invoke-virtual {v0}, LJC6;->a()LXh3;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "enqueue needs at least one WorkRequest."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Ljava/lang/String;Lei1;LpQ3;)LXh3;
    .locals 1

    sget-object v0, Lei1;->d:Lei1;

    if-ne p2, v0, :cond_0

    invoke-static {p0, p1, p3}, LUG6;->c(LaD6;Ljava/lang/String;LEG6;)LXh3;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LaD6;->l(Ljava/lang/String;Lei1;LpQ3;)LJC6;

    move-result-object p1

    invoke-virtual {p1}, LJC6;->a()LXh3;

    move-result-object p1

    return-object p1
.end method

.method public g(Ljava/lang/String;Lfi1;Ljava/util/List;)LXh3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lfi1;",
            "Ljava/util/List<",
            "LFh3;",
            ">;)",
            "LXh3;"
        }
    .end annotation

    new-instance v0, LJC6;

    invoke-direct {v0, p0, p1, p2, p3}, LJC6;-><init>(LaD6;Ljava/lang/String;Lfi1;Ljava/util/List;)V

    invoke-virtual {v0}, LJC6;->a()LXh3;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/util/UUID;)LXh3;
    .locals 1

    invoke-static {p1, p0}, LTc0;->b(Ljava/util/UUID;LaD6;)LTc0;

    move-result-object p1

    iget-object v0, p0, LaD6;->d:LmZ5;

    invoke-interface {v0, p1}, LmZ5;->a(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, LTc0;->d()LXh3;

    move-result-object p1

    return-object p1
.end method

.method public k(Landroid/content/Context;Landroidx/work/a;Ll66;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/work/a;",
            "Ll66;",
            ")",
            "Ljava/util/List<",
            "Lxm5;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Lxm5;

    const/4 v1, 0x0

    invoke-static {p1, p0}, LEm5;->a(Landroid/content/Context;LaD6;)Lxm5;

    move-result-object v2

    aput-object v2, v0, v1

    new-instance v1, LbE1;

    invoke-direct {v1, p1, p2, p3, p0}, LbE1;-><init>(Landroid/content/Context;Landroidx/work/a;Ll66;LaD6;)V

    const/4 p1, 0x1

    aput-object v1, v0, p1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public l(Ljava/lang/String;Lei1;LpQ3;)LJC6;
    .locals 1

    sget-object v0, Lei1;->c:Lei1;

    if-ne p2, v0, :cond_0

    sget-object p2, Lfi1;->c:Lfi1;

    goto :goto_0

    :cond_0
    sget-object p2, Lfi1;->b:Lfi1;

    :goto_0
    new-instance v0, LJC6;

    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-direct {v0, p0, p1, p2, p3}, LJC6;-><init>(LaD6;Ljava/lang/String;Lfi1;Ljava/util/List;)V

    return-object v0
.end method

.method public m()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, LaD6;->a:Landroid/content/Context;

    return-object v0
.end method

.method public n()Landroidx/work/a;
    .locals 1

    iget-object v0, p0, LaD6;->b:Landroidx/work/a;

    return-object v0
.end method

.method public q()LTZ3;
    .locals 1

    iget-object v0, p0, LaD6;->g:LTZ3;

    return-object v0
.end method

.method public r()Li74;
    .locals 1

    iget-object v0, p0, LaD6;->f:Li74;

    return-object v0
.end method

.method public s()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lxm5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LaD6;->e:Ljava/util/List;

    return-object v0
.end method

.method public t()Ll66;
    .locals 1

    iget-object v0, p0, LaD6;->j:Ll66;

    return-object v0
.end method

.method public u()Landroidx/work/impl/WorkDatabase;
    .locals 1

    iget-object v0, p0, LaD6;->c:Landroidx/work/impl/WorkDatabase;

    return-object v0
.end method

.method public v()LmZ5;
    .locals 1

    iget-object v0, p0, LaD6;->d:LmZ5;

    return-object v0
.end method

.method public final w(Landroid/content/Context;Landroidx/work/a;LmZ5;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Li74;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/work/a;",
            "LmZ5;",
            "Landroidx/work/impl/WorkDatabase;",
            "Ljava/util/List<",
            "Lxm5;",
            ">;",
            "Li74;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LaD6;->a:Landroid/content/Context;

    iput-object p2, p0, LaD6;->b:Landroidx/work/a;

    iput-object p3, p0, LaD6;->d:LmZ5;

    iput-object p4, p0, LaD6;->c:Landroidx/work/impl/WorkDatabase;

    iput-object p5, p0, LaD6;->e:Ljava/util/List;

    iput-object p6, p0, LaD6;->f:Li74;

    new-instance p2, LTZ3;

    invoke-direct {p2, p4}, LTZ3;-><init>(Landroidx/work/impl/WorkDatabase;)V

    iput-object p2, p0, LaD6;->g:LTZ3;

    const/4 p2, 0x0

    iput-boolean p2, p0, LaD6;->h:Z

    invoke-static {p1}, LaD6$a;->a(Landroid/content/Context;)Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, LaD6;->d:LmZ5;

    new-instance p3, Landroidx/work/impl/utils/ForceStopRunnable;

    invoke-direct {p3, p1, p0}, Landroidx/work/impl/utils/ForceStopRunnable;-><init>(Landroid/content/Context;LaD6;)V

    invoke-interface {p2, p3}, LmZ5;->a(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot initialize WorkManager in direct boot mode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public x()V
    .locals 2

    sget-object v0, LaD6;->n:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, LaD6;->h:Z

    iget-object v1, p0, LaD6;->i:Landroid/content/BroadcastReceiver$PendingResult;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    const/4 v1, 0x0

    iput-object v1, p0, LaD6;->i:Landroid/content/BroadcastReceiver$PendingResult;

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public y()V
    .locals 3

    invoke-virtual {p0}, LaD6;->m()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LgY5;->a(Landroid/content/Context;)V

    invoke-virtual {p0}, LaD6;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->I()LIG6;

    move-result-object v0

    invoke-interface {v0}, LIG6;->n()I

    invoke-virtual {p0}, LaD6;->n()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {p0}, LaD6;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    invoke-virtual {p0}, LaD6;->s()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v1, v2}, LEm5;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    return-void
.end method

.method public z(Landroid/content/BroadcastReceiver$PendingResult;)V
    .locals 2

    sget-object v0, LaD6;->n:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LaD6;->i:Landroid/content/BroadcastReceiver$PendingResult;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    :cond_0
    iput-object p1, p0, LaD6;->i:Landroid/content/BroadcastReceiver$PendingResult;

    iget-boolean v1, p0, LaD6;->h:Z

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    const/4 p1, 0x0

    iput-object p1, p0, LaD6;->i:Landroid/content/BroadcastReceiver$PendingResult;

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
