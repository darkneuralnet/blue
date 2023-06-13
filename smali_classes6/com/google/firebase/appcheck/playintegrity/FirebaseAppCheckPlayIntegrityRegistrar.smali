.class public Lcom/google/firebase/appcheck/playintegrity/FirebaseAppCheckPlayIntegrityRegistrar;
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

.method public static synthetic a(Lyb4;Lyb4;LOs0;)LxW3;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/firebase/appcheck/playintegrity/FirebaseAppCheckPlayIntegrityRegistrar;->b(Lyb4;Lyb4;LOs0;)LxW3;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lyb4;Lyb4;LOs0;)LxW3;
    .locals 2

    new-instance v0, LxW3;

    const-class v1, LAm1;

    invoke-interface {p2, v1}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LAm1;

    invoke-interface {p2, p0}, LOs0;->c(Lyb4;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/Executor;

    invoke-interface {p2, p1}, LOs0;->c(Lyb4;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, p0, p1}, LxW3;-><init>(LAm1;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 6
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

    const-class v2, LUW;

    invoke-static {v2, v1}, Lyb4;->a(Ljava/lang/Class;Ljava/lang/Class;)Lyb4;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [LEs0;

    const-class v3, LxW3;

    invoke-static {v3}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v3

    const-string v4, "fire-app-check-play-integrity"

    invoke-virtual {v3, v4}, LEs0$b;->h(Ljava/lang/String;)LEs0$b;

    move-result-object v3

    const-class v5, LAm1;

    invoke-static {v5}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v5

    invoke-virtual {v3, v5}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v3

    invoke-static {v0}, Lk01;->j(Lyb4;)Lk01;

    move-result-object v5

    invoke-virtual {v3, v5}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v3

    invoke-static {v1}, Lk01;->j(Lyb4;)Lk01;

    move-result-object v5

    invoke-virtual {v3, v5}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v3

    new-instance v5, LDm1;

    invoke-direct {v5, v0, v1}, LDm1;-><init>(Lyb4;Lyb4;)V

    invoke-virtual {v3, v5}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v0

    invoke-virtual {v0}, LEs0$b;->d()LEs0;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const-string v0, "17.0.0"

    invoke-static {v4, v0}, Lvq2;->b(Ljava/lang/String;Ljava/lang/String;)LEs0;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v2, v1

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
