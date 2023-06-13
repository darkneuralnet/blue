.class public Lcom/google/firebase/appcheck/FirebaseAppCheckRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lyb4;Lyb4;Lyb4;Lyb4;LOs0;)LBm1;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/firebase/appcheck/FirebaseAppCheckRegistrar;->b(Lyb4;Lyb4;Lyb4;Lyb4;LOs0;)LBm1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lyb4;Lyb4;Lyb4;Lyb4;LOs0;)LBm1;
    .locals 8

    new-instance v7, LhX0;

    const-class v0, LAm1;

    invoke-interface {p4, v0}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LAm1;

    const-class v0, LuI1;

    invoke-interface {p4, v0}, LOs0;->d(Ljava/lang/Class;)LX94;

    move-result-object v2

    invoke-interface {p4, p0}, LOs0;->c(Lyb4;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Ljava/util/concurrent/Executor;

    invoke-interface {p4, p1}, LOs0;->c(Lyb4;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Ljava/util/concurrent/Executor;

    invoke-interface {p4, p2}, LOs0;->c(Lyb4;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Ljava/util/concurrent/Executor;

    invoke-interface {p4, p3}, LOs0;->c(Lyb4;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Ljava/util/concurrent/ScheduledExecutorService;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LhX0;-><init>(LAm1;LX94;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    return-object v7
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LEs0<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Lyd6;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Lyb4;->a(Ljava/lang/Class;Ljava/lang/Class;)Lyb4;

    move-result-object v0

    const-class v2, LVq2;

    invoke-static {v2, v1}, Lyb4;->a(Ljava/lang/Class;Ljava/lang/Class;)Lyb4;

    move-result-object v2

    const-class v3, LYv;

    invoke-static {v3, v1}, Lyb4;->a(Ljava/lang/Class;Ljava/lang/Class;)Lyb4;

    move-result-object v1

    const-class v3, LUW;

    const-class v4, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v3, v4}, Lyb4;->a(Ljava/lang/Class;Ljava/lang/Class;)Lyb4;

    move-result-object v3

    const/4 v4, 0x3

    new-array v4, v4, [LEs0;

    const/4 v5, 0x1

    new-array v6, v5, [Ljava/lang/Class;

    const-class v7, LB62;

    const/4 v8, 0x0

    aput-object v7, v6, v8

    const-class v7, LBm1;

    invoke-static {v7, v6}, LEs0;->f(Ljava/lang/Class;[Ljava/lang/Class;)LEs0$b;

    move-result-object v6

    const-string v7, "fire-app-check"

    invoke-virtual {v6, v7}, LEs0$b;->h(Ljava/lang/String;)LEs0$b;

    move-result-object v6

    const-class v9, LAm1;

    invoke-static {v9}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v9

    invoke-virtual {v6, v9}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v6

    invoke-static {v0}, Lk01;->j(Lyb4;)Lk01;

    move-result-object v9

    invoke-virtual {v6, v9}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v6

    invoke-static {v2}, Lk01;->j(Lyb4;)Lk01;

    move-result-object v9

    invoke-virtual {v6, v9}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v6

    invoke-static {v1}, Lk01;->j(Lyb4;)Lk01;

    move-result-object v9

    invoke-virtual {v6, v9}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v6

    invoke-static {v3}, Lk01;->j(Lyb4;)Lk01;

    move-result-object v9

    invoke-virtual {v6, v9}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v6

    const-class v9, LuI1;

    invoke-static {v9}, Lk01;->i(Ljava/lang/Class;)Lk01;

    move-result-object v9

    invoke-virtual {v6, v9}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v6

    new-instance v9, LEm1;

    invoke-direct {v9, v0, v2, v1, v3}, LEm1;-><init>(Lyb4;Lyb4;Lyb4;Lyb4;)V

    invoke-virtual {v6, v9}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v0

    invoke-virtual {v0}, LEs0$b;->c()LEs0$b;

    move-result-object v0

    invoke-virtual {v0}, LEs0$b;->d()LEs0;

    move-result-object v0

    aput-object v0, v4, v8

    invoke-static {}, LtI1;->a()LEs0;

    move-result-object v0

    aput-object v0, v4, v5

    const-string v0, "17.0.0"

    invoke-static {v7, v0}, Lvq2;->b(Ljava/lang/String;Ljava/lang/String;)LEs0;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v4, v1

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
