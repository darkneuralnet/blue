.class public final LcO6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final k:LhK6;


# instance fields
.field public final a:LHK6;

.field public final b:LoM6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoM6<",
            "LfP6;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LBK6;

.field public final d:LSO6;

.field public final e:LpM6;

.field public final f:LxL6;

.field public final g:LlL6;

.field public final h:LoM6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LoM6<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final i:LPJ6;

.field public final j:Landroid/os/Handler;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LhK6;

    const-string v1, "AssetPackManager"

    invoke-direct {v0, v1}, LhK6;-><init>(Ljava/lang/String;)V

    sput-object v0, LcO6;->k:LhK6;

    return-void
.end method

.method public constructor <init>(LHK6;LoM6;LBK6;LSO6;LpM6;LxL6;LlL6;LoM6;LPJ6;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHK6;",
            "LoM6<",
            "LfP6;",
            ">;",
            "LBK6;",
            "LSO6;",
            "LpM6;",
            "LxL6;",
            "LlL6;",
            "LoM6<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "LPJ6;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, LcO6;->j:Landroid/os/Handler;

    iput-object p1, p0, LcO6;->a:LHK6;

    iput-object p2, p0, LcO6;->b:LoM6;

    iput-object p3, p0, LcO6;->c:LBK6;

    iput-object p4, p0, LcO6;->d:LSO6;

    iput-object p5, p0, LcO6;->e:LpM6;

    iput-object p6, p0, LcO6;->f:LxL6;

    iput-object p7, p0, LcO6;->g:LlL6;

    iput-object p8, p0, LcO6;->h:LoM6;

    iput-object p9, p0, LcO6;->i:LPJ6;

    return-void
.end method

.method public static final synthetic d(Ljava/lang/Exception;)V
    .locals 3

    sget-object v0, LcO6;->k:LhK6;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "Could not sync active asset packs. %s"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p0, v1}, LhK6;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(LcO6;)LlL6;
    .locals 0

    iget-object p0, p0, LcO6;->g:LlL6;

    return-object p0
.end method


# virtual methods
.method public final a(Z)V
    .locals 2

    iget-object v0, p0, LcO6;->c:LBK6;

    invoke-virtual {v0}, LVK6;->e()Z

    move-result v0

    iget-object v1, p0, LcO6;->c:LBK6;

    invoke-virtual {v1, p1}, LVK6;->c(Z)V

    if-eqz p1, :cond_0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LcO6;->f()V

    :cond_0
    return-void
.end method

.method public final synthetic b()V
    .locals 1

    iget-object v0, p0, LcO6;->a:LHK6;

    invoke-virtual {v0}, LHK6;->I()V

    iget-object v0, p0, LcO6;->a:LHK6;

    invoke-virtual {v0}, LHK6;->F()V

    iget-object v0, p0, LcO6;->a:LHK6;

    invoke-virtual {v0}, LHK6;->J()V

    return-void
.end method

.method public final synthetic c()V
    .locals 3

    iget-object v0, p0, LcO6;->b:LoM6;

    invoke-interface {v0}, LoM6;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LfP6;

    iget-object v1, p0, LcO6;->a:LHK6;

    invoke-virtual {v1}, LHK6;->q()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, LfP6;->d(Ljava/util/Map;)LXY5;

    move-result-object v0

    iget-object v1, p0, LcO6;->h:LoM6;

    invoke-interface {v1}, LoM6;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    iget-object v2, p0, LcO6;->a:LHK6;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, LBN6;->a(LHK6;)Lnh3;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LXY5;->c(Ljava/util/concurrent/Executor;Lnh3;)LXY5;

    iget-object v1, p0, LcO6;->h:LoM6;

    invoke-interface {v1}, LoM6;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    sget-object v2, LCN6;->a:LOg3;

    invoke-virtual {v0, v1, v2}, LXY5;->b(Ljava/util/concurrent/Executor;LOg3;)LXY5;

    return-void
.end method

.method public final f()V
    .locals 3

    iget-object v0, p0, LcO6;->h:LoM6;

    invoke-interface {v0}, LoM6;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    new-instance v1, LnN6;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, LnN6;-><init>(LcO6;[B)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
