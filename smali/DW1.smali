.class public final LDW1;
.super Landroidx/camera/core/f;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/f;-><init>()V

    return-void
.end method


# virtual methods
.method public d(LKX1;)Landroidx/camera/core/i;
    .locals 0

    invoke-interface {p1}, LKX1;->e()Landroidx/camera/core/i;

    move-result-object p1

    return-object p1
.end method

.method public g()V
    .locals 0

    return-void
.end method

.method public o(Landroidx/camera/core/i;)V
    .locals 2

    invoke-virtual {p0, p1}, Landroidx/camera/core/f;->e(Landroidx/camera/core/i;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    new-instance v1, LDW1$a;

    invoke-direct {v1, p0, p1}, LDW1$a;-><init>(LDW1;Landroidx/camera/core/i;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {v0, v1, p1}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    return-void
.end method
