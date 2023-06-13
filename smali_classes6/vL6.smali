.class public final LvL6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LwM6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LwM6<",
        "LuL6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LwM6;

.field public final b:LwM6;

.field public final c:LwM6;

.field public final d:LwM6;

.field public final e:LwM6;

.field public final f:LwM6;

.field public final g:LwM6;

.field public final h:LwM6;

.field public final synthetic i:I


# direct methods
.method public constructor <init>(LwM6;LwM6;LwM6;LwM6;LwM6;LwM6;LwM6;LwM6;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LwM6<",
            "LpM6;",
            ">;",
            "LwM6<",
            "LfP6;",
            ">;",
            "LwM6<",
            "LsL6;",
            ">;",
            "LwM6<",
            "LdN6;",
            ">;",
            "LwM6<",
            "LFM6;",
            ">;",
            "LwM6<",
            "LKM6;",
            ">;",
            "LwM6<",
            "LOM6;",
            ">;",
            "LwM6<",
            "LvM6;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    iput v0, p0, LvL6;->i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LvL6;->a:LwM6;

    iput-object p2, p0, LvL6;->b:LwM6;

    iput-object p3, p0, LvL6;->c:LwM6;

    iput-object p4, p0, LvL6;->d:LwM6;

    iput-object p5, p0, LvL6;->e:LwM6;

    iput-object p6, p0, LvL6;->f:LwM6;

    iput-object p7, p0, LvL6;->g:LwM6;

    iput-object p8, p0, LvL6;->h:LwM6;

    return-void
.end method

.method public constructor <init>(LwM6;LwM6;LwM6;LwM6;LwM6;LwM6;LwM6;LwM6;[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LwM6<",
            "Landroid/content/Context;",
            ">;",
            "LwM6<",
            "LpM6;",
            ">;",
            "LwM6<",
            "LuL6;",
            ">;",
            "LwM6<",
            "LfP6;",
            ">;",
            "LwM6<",
            "LxL6;",
            ">;",
            "LwM6<",
            "LlL6;",
            ">;",
            "LwM6<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "LwM6<",
            "Ljava/util/concurrent/Executor;",
            ">;[B)V"
        }
    .end annotation

    const/4 p9, 0x1

    iput p9, p0, LvL6;->i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LvL6;->a:LwM6;

    iput-object p2, p0, LvL6;->g:LwM6;

    iput-object p3, p0, LvL6;->h:LwM6;

    iput-object p4, p0, LvL6;->b:LwM6;

    iput-object p5, p0, LvL6;->e:LwM6;

    iput-object p6, p0, LvL6;->f:LwM6;

    iput-object p7, p0, LvL6;->c:LwM6;

    iput-object p8, p0, LvL6;->d:LwM6;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 14

    iget v0, p0, LvL6;->i:I

    if-eqz v0, :cond_0

    iget-object v0, p0, LvL6;->a:LwM6;

    check-cast v0, LTO6;

    invoke-virtual {v0}, LTO6;->b()Landroid/content/Context;

    move-result-object v2

    iget-object v0, p0, LvL6;->g:LwM6;

    invoke-interface {v0}, LwM6;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LvL6;->h:LwM6;

    invoke-interface {v1}, LwM6;->a()Ljava/lang/Object;

    move-result-object v1

    iget-object v3, p0, LvL6;->b:LwM6;

    invoke-static {v3}, LsM6;->c(LwM6;)LoM6;

    move-result-object v5

    iget-object v3, p0, LvL6;->e:LwM6;

    invoke-interface {v3}, LwM6;->a()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, LvL6;->f:LwM6;

    invoke-interface {v4}, LwM6;->a()Ljava/lang/Object;

    move-result-object v4

    iget-object v6, p0, LvL6;->c:LwM6;

    invoke-static {v6}, LsM6;->c(LwM6;)LoM6;

    move-result-object v8

    iget-object v6, p0, LvL6;->d:LwM6;

    invoke-static {v6}, LsM6;->c(LwM6;)LoM6;

    move-result-object v9

    new-instance v10, LBK6;

    check-cast v0, LpM6;

    move-object v6, v1

    check-cast v6, LuL6;

    move-object v7, v3

    check-cast v7, LxL6;

    move-object v11, v4

    check-cast v11, LlL6;

    move-object v1, v10

    move-object v3, v0

    move-object v4, v6

    move-object v6, v7

    move-object v7, v11

    invoke-direct/range {v1 .. v9}, LBK6;-><init>(Landroid/content/Context;LpM6;LuL6;LoM6;LxL6;LlL6;LoM6;LoM6;)V

    return-object v10

    :cond_0
    iget-object v0, p0, LvL6;->a:LwM6;

    invoke-interface {v0}, LwM6;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LvL6;->b:LwM6;

    invoke-static {v1}, LsM6;->c(LwM6;)LoM6;

    move-result-object v4

    iget-object v1, p0, LvL6;->c:LwM6;

    invoke-interface {v1}, LwM6;->a()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LvL6;->d:LwM6;

    invoke-interface {v2}, LwM6;->a()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, LvL6;->e:LwM6;

    invoke-interface {v3}, LwM6;->a()Ljava/lang/Object;

    move-result-object v3

    iget-object v5, p0, LvL6;->f:LwM6;

    invoke-interface {v5}, LwM6;->a()Ljava/lang/Object;

    move-result-object v5

    iget-object v6, p0, LvL6;->g:LwM6;

    invoke-interface {v6}, LwM6;->a()Ljava/lang/Object;

    move-result-object v6

    iget-object v7, p0, LvL6;->h:LwM6;

    invoke-interface {v7}, LwM6;->a()Ljava/lang/Object;

    move-result-object v7

    new-instance v11, LuL6;

    check-cast v0, LpM6;

    check-cast v1, LsL6;

    move-object v8, v2

    check-cast v8, LdN6;

    move-object v9, v3

    check-cast v9, LFM6;

    move-object v10, v5

    check-cast v10, LKM6;

    move-object v12, v6

    check-cast v12, LOM6;

    move-object v13, v7

    check-cast v13, LvM6;

    move-object v2, v11

    move-object v3, v0

    move-object v5, v1

    move-object v6, v8

    move-object v7, v9

    move-object v8, v10

    move-object v9, v12

    move-object v10, v13

    invoke-direct/range {v2 .. v10}, LuL6;-><init>(LpM6;LoM6;LsL6;LdN6;LFM6;LKM6;LOM6;LvM6;)V

    return-object v11
.end method
