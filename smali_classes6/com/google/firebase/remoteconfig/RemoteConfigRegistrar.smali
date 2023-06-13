.class public Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-rc"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lyb4;LOs0;)LUv4;
    .locals 0

    invoke-static {p0, p1}, Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;->lambda$getComponents$0(Lyb4;LOs0;)LUv4;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Lyb4;LOs0;)LUv4;
    .locals 8

    new-instance v7, LUv4;

    const-class v0, Landroid/content/Context;

    invoke-interface {p1, v0}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    invoke-interface {p1, p0}, LOs0;->c(Lyb4;)Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    const-class p0, LAm1;

    invoke-interface {p1, p0}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, LAm1;

    const-class p0, LSm1;

    invoke-interface {p1, p0}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, LSm1;

    const-class p0, Lx1;

    invoke-interface {p1, p0}, LOs0;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lx1;

    const-string v0, "frc"

    invoke-virtual {p0, v0}, Lx1;->b(Ljava/lang/String;)Lvm1;

    move-result-object v5

    const-class p0, Lba;

    invoke-interface {p1, p0}, LOs0;->d(Ljava/lang/Class;)LX94;

    move-result-object v6

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LUv4;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;LAm1;LSm1;Lvm1;LX94;)V

    return-object v7
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

    const-class v0, LUW;

    const-class v1, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0, v1}, Lyb4;->a(Ljava/lang/Class;Ljava/lang/Class;)Lyb4;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [LEs0;

    const-class v2, LUv4;

    invoke-static {v2}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v2

    const-string v3, "fire-rc"

    invoke-virtual {v2, v3}, LEs0$b;->h(Ljava/lang/String;)LEs0$b;

    move-result-object v2

    const-class v4, Landroid/content/Context;

    invoke-static {v4}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v4

    invoke-virtual {v2, v4}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v2

    invoke-static {v0}, Lk01;->j(Lyb4;)Lk01;

    move-result-object v4

    invoke-virtual {v2, v4}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v2

    const-class v4, LAm1;

    invoke-static {v4}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v4

    invoke-virtual {v2, v4}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v2

    const-class v4, LSm1;

    invoke-static {v4}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v4

    invoke-virtual {v2, v4}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v2

    const-class v4, Lx1;

    invoke-static {v4}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v4

    invoke-virtual {v2, v4}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v2

    const-class v4, Lba;

    invoke-static {v4}, Lk01;->i(Ljava/lang/Class;)Lk01;

    move-result-object v4

    invoke-virtual {v2, v4}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v2

    new-instance v4, LXv4;

    invoke-direct {v4, v0}, LXv4;-><init>(Lyb4;)V

    invoke-virtual {v2, v4}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v0

    invoke-virtual {v0}, LEs0$b;->e()LEs0$b;

    move-result-object v0

    invoke-virtual {v0}, LEs0$b;->d()LEs0;

    move-result-object v0

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "21.4.0"

    invoke-static {v3, v0}, Lvq2;->b(Ljava/lang/String;Ljava/lang/String;)LEs0;

    move-result-object v0

    const/4 v2, 0x1

    aput-object v0, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
