.class public final LrM6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LwM6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LwM6<",
        "LpM6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LwM6;

.field public final b:LwM6;

.field public final c:LwM6;

.field public final d:LwM6;

.field public final synthetic e:I


# direct methods
.method public constructor <init>(LwM6;LwM6;LwM6;LwM6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LwM6<",
            "LHK6;",
            ">;",
            "LwM6<",
            "LfP6;",
            ">;",
            "LwM6<",
            "LxL6;",
            ">;",
            "LwM6<",
            "Ljava/util/concurrent/Executor;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    iput v0, p0, LrM6;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LrM6;->a:LwM6;

    iput-object p2, p0, LrM6;->b:LwM6;

    iput-object p3, p0, LrM6;->c:LwM6;

    iput-object p4, p0, LrM6;->d:LwM6;

    return-void
.end method

.method public constructor <init>(LwM6;LwM6;LwM6;LwM6;[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LwM6<",
            "LHK6;",
            ">;",
            "LwM6<",
            "LfP6;",
            ">;",
            "LwM6<",
            "LBK6;",
            ">;",
            "LwM6<",
            "LxL6;",
            ">;[B)V"
        }
    .end annotation

    const/4 p5, 0x1

    iput p5, p0, LrM6;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LrM6;->a:LwM6;

    iput-object p2, p0, LrM6;->b:LwM6;

    iput-object p3, p0, LrM6;->c:LwM6;

    iput-object p4, p0, LrM6;->d:LwM6;

    return-void
.end method

.method public constructor <init>(LwM6;LwM6;LwM6;LwM6;[C)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LwM6<",
            "LpM6;",
            ">;",
            "LwM6<",
            "LHK6;",
            ">;",
            "LwM6<",
            "LhL6;",
            ">;",
            "LwM6<",
            "LPJ6;",
            ">;[C)V"
        }
    .end annotation

    const/4 p5, 0x2

    iput p5, p0, LrM6;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LrM6;->c:LwM6;

    iput-object p2, p0, LrM6;->b:LwM6;

    iput-object p3, p0, LrM6;->a:LwM6;

    iput-object p4, p0, LrM6;->d:LwM6;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 5

    iget v0, p0, LrM6;->e:I

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, LrM6;->c:LwM6;

    invoke-interface {v0}, LwM6;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LrM6;->b:LwM6;

    invoke-interface {v1}, LwM6;->a()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LrM6;->a:LwM6;

    invoke-interface {v2}, LwM6;->a()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, LrM6;->d:LwM6;

    invoke-interface {v3}, LwM6;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LPJ6;

    new-instance v4, LvM6;

    check-cast v0, LpM6;

    check-cast v1, LHK6;

    check-cast v2, LhL6;

    invoke-direct {v4, v0, v1, v2, v3}, LvM6;-><init>(LpM6;LHK6;LhL6;LPJ6;)V

    return-object v4

    :cond_0
    iget-object v0, p0, LrM6;->a:LwM6;

    invoke-interface {v0}, LwM6;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LrM6;->b:LwM6;

    invoke-static {v1}, LsM6;->c(LwM6;)LoM6;

    move-result-object v1

    iget-object v2, p0, LrM6;->c:LwM6;

    invoke-static {v2}, LsM6;->c(LwM6;)LoM6;

    move-result-object v2

    iget-object v3, p0, LrM6;->d:LwM6;

    invoke-interface {v3}, LwM6;->a()Ljava/lang/Object;

    move-result-object v3

    new-instance v4, LsL6;

    check-cast v0, LHK6;

    check-cast v3, LxL6;

    invoke-direct {v4, v0, v1, v2, v3}, LsL6;-><init>(LHK6;LoM6;LoM6;LxL6;)V

    return-object v4

    :cond_1
    iget-object v0, p0, LrM6;->a:LwM6;

    invoke-interface {v0}, LwM6;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LrM6;->b:LwM6;

    invoke-static {v1}, LsM6;->c(LwM6;)LoM6;

    move-result-object v1

    iget-object v2, p0, LrM6;->c:LwM6;

    invoke-interface {v2}, LwM6;->a()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, LrM6;->d:LwM6;

    invoke-static {v3}, LsM6;->c(LwM6;)LoM6;

    move-result-object v3

    new-instance v4, LpM6;

    check-cast v0, LHK6;

    check-cast v2, LxL6;

    invoke-direct {v4, v0, v1, v2, v3}, LpM6;-><init>(LHK6;LoM6;LxL6;LoM6;)V

    return-object v4
.end method
