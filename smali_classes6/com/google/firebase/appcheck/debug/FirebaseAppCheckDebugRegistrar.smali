.class public Lcom/google/firebase/appcheck/debug/FirebaseAppCheckDebugRegistrar;
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

.method public static synthetic a(Lyb4;Lyb4;Lyb4;LOs0;)LKU0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/google/firebase/appcheck/debug/FirebaseAppCheckDebugRegistrar;->b(Lyb4;Lyb4;Lyb4;LOs0;)LKU0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lyb4;Lyb4;Lyb4;LOs0;)LKU0;
    .locals 7

    new-instance v6, LKU0;

    const-class v0, LAm1;

    invoke-interface {p3, v0}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LAm1;

    const-class v0, Lp62;

    invoke-interface {p3, v0}, LOs0;->d(Ljava/lang/Class;)LX94;

    move-result-object v2

    invoke-interface {p3, p0}, LOs0;->c(Lyb4;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Ljava/util/concurrent/Executor;

    invoke-interface {p3, p1}, LOs0;->c(Lyb4;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Ljava/util/concurrent/Executor;

    invoke-interface {p3, p2}, LOs0;->c(Lyb4;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Ljava/util/concurrent/Executor;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LKU0;-><init>(LAm1;LX94;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    return-object v6
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LEs0<",
            "*>;>;"
        }
    .end annotation

    const-class v0, LVq2;

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Lyb4;->a(Ljava/lang/Class;Ljava/lang/Class;)Lyb4;

    move-result-object v0

    const-class v2, LYv;

    invoke-static {v2, v1}, Lyb4;->a(Ljava/lang/Class;Ljava/lang/Class;)Lyb4;

    move-result-object v2

    const-class v3, LUW;

    invoke-static {v3, v1}, Lyb4;->a(Ljava/lang/Class;Ljava/lang/Class;)Lyb4;

    move-result-object v1

    const/4 v3, 0x2

    new-array v3, v3, [LEs0;

    const-class v4, LKU0;

    invoke-static {v4}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v4

    const-string v5, "fire-app-check-debug"

    invoke-virtual {v4, v5}, LEs0$b;->h(Ljava/lang/String;)LEs0$b;

    move-result-object v4

    const-class v6, LAm1;

    invoke-static {v6}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v6

    invoke-virtual {v4, v6}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v4

    const-class v6, Lp62;

    invoke-static {v6}, Lk01;->i(Ljava/lang/Class;)Lk01;

    move-result-object v6

    invoke-virtual {v4, v6}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v4

    invoke-static {v0}, Lk01;->j(Lyb4;)Lk01;

    move-result-object v6

    invoke-virtual {v4, v6}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v4

    invoke-static {v2}, Lk01;->j(Lyb4;)Lk01;

    move-result-object v6

    invoke-virtual {v4, v6}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v4

    invoke-static {v1}, Lk01;->j(Lyb4;)Lk01;

    move-result-object v6

    invoke-virtual {v4, v6}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v4

    new-instance v6, LCm1;

    invoke-direct {v6, v0, v2, v1}, LCm1;-><init>(Lyb4;Lyb4;Lyb4;)V

    invoke-virtual {v4, v6}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v0

    invoke-virtual {v0}, LEs0$b;->d()LEs0;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v3, v1

    const-string v0, "17.0.0"

    invoke-static {v5, v0}, Lvq2;->b(Ljava/lang/String;Ljava/lang/String;)LEs0;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v3, v1

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
