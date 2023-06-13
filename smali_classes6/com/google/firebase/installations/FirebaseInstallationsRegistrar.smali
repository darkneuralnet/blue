.class public Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-installations"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LOs0;)LSm1;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;->lambda$getComponents$0(LOs0;)LSm1;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(LOs0;)LSm1;
    .locals 6

    new-instance v0, Lcom/google/firebase/installations/a;

    const-class v1, LAm1;

    invoke-interface {p0, v1}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LAm1;

    const-class v2, LuI1;

    invoke-interface {p0, v2}, LOs0;->d(Ljava/lang/Class;)LX94;

    move-result-object v2

    const-class v3, LYv;

    const-class v4, Ljava/util/concurrent/ExecutorService;

    invoke-static {v3, v4}, Lyb4;->a(Ljava/lang/Class;Ljava/lang/Class;)Lyb4;

    move-result-object v3

    invoke-interface {p0, v3}, LOs0;->c(Lyb4;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ExecutorService;

    const-class v4, LUW;

    const-class v5, Ljava/util/concurrent/Executor;

    invoke-static {v4, v5}, Lyb4;->a(Ljava/lang/Class;Ljava/lang/Class;)Lyb4;

    move-result-object v4

    invoke-interface {p0, v4}, LOs0;->c(Lyb4;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/Executor;

    invoke-static {p0}, LMm1;->b(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/firebase/installations/a;-><init>(LAm1;LX94;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LEs0<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x3

    new-array v0, v0, [LEs0;

    const-class v1, LSm1;

    invoke-static {v1}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v1

    const-string v2, "fire-installations"

    invoke-virtual {v1, v2}, LEs0$b;->h(Ljava/lang/String;)LEs0$b;

    move-result-object v1

    const-class v3, LAm1;

    invoke-static {v3}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v3

    invoke-virtual {v1, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    const-class v3, LuI1;

    invoke-static {v3}, Lk01;->i(Ljava/lang/Class;)Lk01;

    move-result-object v3

    invoke-virtual {v1, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    const-class v3, LYv;

    const-class v4, Ljava/util/concurrent/ExecutorService;

    invoke-static {v3, v4}, Lyb4;->a(Ljava/lang/Class;Ljava/lang/Class;)Lyb4;

    move-result-object v3

    invoke-static {v3}, Lk01;->j(Lyb4;)Lk01;

    move-result-object v3

    invoke-virtual {v1, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    const-class v3, LUW;

    const-class v4, Ljava/util/concurrent/Executor;

    invoke-static {v3, v4}, Lyb4;->a(Ljava/lang/Class;Ljava/lang/Class;)Lyb4;

    move-result-object v3

    invoke-static {v3}, Lk01;->j(Lyb4;)Lk01;

    move-result-object v3

    invoke-virtual {v1, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    new-instance v3, LTm1;

    invoke-direct {v3}, LTm1;-><init>()V

    invoke-virtual {v1, v3}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v1

    invoke-virtual {v1}, LEs0$b;->d()LEs0;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const/4 v1, 0x1

    invoke-static {}, LtI1;->a()LEs0;

    move-result-object v3

    aput-object v3, v0, v1

    const-string v1, "17.1.3"

    invoke-static {v2, v1}, Lvq2;->b(Ljava/lang/String;Ljava/lang/String;)LEs0;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
