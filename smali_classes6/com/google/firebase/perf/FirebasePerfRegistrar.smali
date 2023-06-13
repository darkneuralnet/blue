.class public Lcom/google/firebase/perf/FirebasePerfRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final EARLY_LIBRARY_NAME:Ljava/lang/String; = "fire-perf-early"

.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-perf"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LOs0;)Lxn1;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/perf/FirebasePerfRegistrar;->providesFirebasePerformance(LOs0;)Lxn1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lyb4;LOs0;)Lrn1;
    .locals 0

    invoke-static {p0, p1}, Lcom/google/firebase/perf/FirebasePerfRegistrar;->lambda$getComponents$0(Lyb4;LOs0;)Lrn1;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lyb4;LOs0;)Lrn1;
    .locals 3

    new-instance v0, Lrn1;

    const-class v1, LAm1;

    invoke-interface {p1, v1}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LAm1;

    const-class v2, LpP5;

    invoke-interface {p1, v2}, LOs0;->d(Ljava/lang/Class;)LX94;

    move-result-object v2

    invoke-interface {v2}, LX94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LpP5;

    invoke-interface {p1, p0}, LOs0;->c(Lyb4;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/Executor;

    invoke-direct {v0, v1, v2, p0}, Lrn1;-><init>(LAm1;LpP5;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method private static providesFirebasePerformance(LOs0;)Lxn1;
    .locals 6

    const-class v0, Lrn1;

    invoke-interface {p0, v0}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    invoke-static {}, LjJ0;->b()LjJ0$b;

    move-result-object v0

    new-instance v1, LAn1;

    const-class v2, LAm1;

    invoke-interface {p0, v2}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LAm1;

    const-class v3, LSm1;

    invoke-interface {p0, v3}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LSm1;

    const-class v4, LUv4;

    invoke-interface {p0, v4}, LOs0;->d(Ljava/lang/Class;)LX94;

    move-result-object v4

    const-class v5, LU96;

    invoke-interface {p0, v5}, LOs0;->d(Ljava/lang/Class;)LX94;

    move-result-object p0

    invoke-direct {v1, v2, v3, v4, p0}, LAn1;-><init>(LAm1;LSm1;LX94;LX94;)V

    invoke-virtual {v0, v1}, LjJ0$b;->b(LAn1;)LjJ0$b;

    move-result-object p0

    invoke-virtual {p0}, LjJ0$b;->a()Lyn1;

    move-result-object p0

    invoke-interface {p0}, Lyn1;->a()Lxn1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 7
    .annotation build Landroidx/annotation/Keep;
    .end annotation

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

    const/4 v1, 0x3

    new-array v1, v1, [LEs0;

    const-class v2, Lxn1;

    invoke-static {v2}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v2

    const-string v3, "fire-perf"

    invoke-virtual {v2, v3}, LEs0$b;->h(Ljava/lang/String;)LEs0$b;

    move-result-object v2

    const-class v4, LAm1;

    invoke-static {v4}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v5

    invoke-virtual {v2, v5}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v2

    const-class v5, LUv4;

    invoke-static {v5}, Lk01;->l(Ljava/lang/Class;)Lk01;

    move-result-object v5

    invoke-virtual {v2, v5}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v2

    const-class v5, LSm1;

    invoke-static {v5}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v5

    invoke-virtual {v2, v5}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v2

    const-class v5, LU96;

    invoke-static {v5}, Lk01;->l(Ljava/lang/Class;)Lk01;

    move-result-object v5

    invoke-virtual {v2, v5}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v2

    const-class v5, Lrn1;

    invoke-static {v5}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v6

    invoke-virtual {v2, v6}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v2

    new-instance v6, Lun1;

    invoke-direct {v6}, Lun1;-><init>()V

    invoke-virtual {v2, v6}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v2

    invoke-virtual {v2}, LEs0$b;->d()LEs0;

    move-result-object v2

    const/4 v6, 0x0

    aput-object v2, v1, v6

    invoke-static {v5}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v2

    const-string v5, "fire-perf-early"

    invoke-virtual {v2, v5}, LEs0$b;->h(Ljava/lang/String;)LEs0$b;

    move-result-object v2

    invoke-static {v4}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v4

    invoke-virtual {v2, v4}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v2

    const-class v4, LpP5;

    invoke-static {v4}, Lk01;->i(Ljava/lang/Class;)Lk01;

    move-result-object v4

    invoke-virtual {v2, v4}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v2

    invoke-static {v0}, Lk01;->j(Lyb4;)Lk01;

    move-result-object v4

    invoke-virtual {v2, v4}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v2

    invoke-virtual {v2}, LEs0$b;->e()LEs0$b;

    move-result-object v2

    new-instance v4, Lvn1;

    invoke-direct {v4, v0}, Lvn1;-><init>(Lyb4;)V

    invoke-virtual {v2, v4}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v0

    invoke-virtual {v0}, LEs0$b;->d()LEs0;

    move-result-object v0

    const/4 v2, 0x1

    aput-object v0, v1, v2

    const-string v0, "20.3.2"

    invoke-static {v3, v0}, Lvq2;->b(Ljava/lang/String;Ljava/lang/String;)LEs0;

    move-result-object v0

    const/4 v2, 0x2

    aput-object v0, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
