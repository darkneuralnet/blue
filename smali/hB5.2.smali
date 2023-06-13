.class public LhB5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lf74;

.field public b:Le74$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LhB5;Lf74;)V
    .locals 0

    invoke-virtual {p0, p1}, LhB5;->e(Lf74;)V

    return-void
.end method

.method public static synthetic b(LhB5;Landroidx/camera/core/i;)V
    .locals 0

    invoke-virtual {p0, p1}, LhB5;->c(Landroidx/camera/core/i;)V

    return-void
.end method


# virtual methods
.method public final c(Landroidx/camera/core/i;)V
    .locals 4

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, LhB5;->a:Lf74;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, LHZ3;->i(Z)V

    invoke-interface {p1}, Landroidx/camera/core/i;->i1()LwX1;

    move-result-object v0

    invoke-interface {v0}, LwX1;->b()LxY5;

    move-result-object v0

    iget-object v3, p0, LhB5;->a:Lf74;

    invoke-virtual {v3}, Lf74;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, LxY5;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v3, p0, LhB5;->a:Lf74;

    invoke-virtual {v3}, Lf74;->g()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v0, v3, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    invoke-static {v1}, LHZ3;->i(Z)V

    iget-object v0, p0, LhB5;->b:Le74$a;

    invoke-virtual {v0}, Le74$a;->a()Ls91;

    move-result-object v0

    iget-object v1, p0, LhB5;->a:Lf74;

    invoke-static {v1, p1}, Le74$b;->c(Lf74;Landroidx/camera/core/i;)Le74$b;

    move-result-object p1

    invoke-virtual {v0, p1}, Ls91;->accept(Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-object p1, p0, LhB5;->a:Lf74;

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public final e(Lf74;)V
    .locals 4

    invoke-static {}, LO36;->a()V

    invoke-virtual {p1}, Lf74;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v3, "Cannot handle multi-image capture."

    invoke-static {v0, v3}, LHZ3;->j(ZLjava/lang/String;)V

    iget-object v0, p0, LhB5;->a:Lf74;

    if-nez v0, :cond_1

    move v1, v2

    :cond_1
    const-string v0, "Already has an existing request."

    invoke-static {v1, v0}, LHZ3;->j(ZLjava/lang/String;)V

    iput-object p1, p0, LhB5;->a:Lf74;

    invoke-virtual {p1}, Lf74;->a()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    new-instance v1, LhB5$a;

    invoke-direct {v1, p0, p1}, LhB5$a;-><init>(LhB5;Lf74;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {v0, v1, p1}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public f(Llf0$c;)Le74$a;
    .locals 2

    invoke-virtual {p1}, Llf0$c;->b()Ls91;

    move-result-object v0

    new-instance v1, LfB5;

    invoke-direct {v1, p0}, LfB5;-><init>(LhB5;)V

    invoke-virtual {v0, v1}, Ls91;->a(Lrz0;)V

    invoke-virtual {p1}, Llf0$c;->c()Ls91;

    move-result-object v0

    new-instance v1, LgB5;

    invoke-direct {v1, p0}, LgB5;-><init>(LhB5;)V

    invoke-virtual {v0, v1}, Ls91;->a(Lrz0;)V

    invoke-virtual {p1}, Llf0$c;->a()I

    move-result p1

    invoke-static {p1}, Le74$a;->c(I)Le74$a;

    move-result-object p1

    iput-object p1, p0, LhB5;->b:Le74$a;

    return-object p1
.end method
