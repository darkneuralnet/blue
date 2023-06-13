.class public final LkO6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LwM6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LwM6<",
        "LcO6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LwM6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LwM6<",
            "LHK6;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LwM6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LwM6<",
            "LfP6;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LwM6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LwM6<",
            "LBK6;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LwM6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LwM6<",
            "LSO6;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LwM6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LwM6<",
            "LpM6;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LwM6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LwM6<",
            "LxL6;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LwM6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LwM6<",
            "LlL6;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LwM6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LwM6<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public final i:LwM6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LwM6<",
            "LPJ6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LwM6;LwM6;LwM6;LwM6;LwM6;LwM6;LwM6;LwM6;LwM6;)V
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
            "LSO6;",
            ">;",
            "LwM6<",
            "LpM6;",
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
            "LPJ6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LkO6;->a:LwM6;

    iput-object p2, p0, LkO6;->b:LwM6;

    iput-object p3, p0, LkO6;->c:LwM6;

    iput-object p4, p0, LkO6;->d:LwM6;

    iput-object p5, p0, LkO6;->e:LwM6;

    iput-object p6, p0, LkO6;->f:LwM6;

    iput-object p7, p0, LkO6;->g:LwM6;

    iput-object p8, p0, LkO6;->h:LwM6;

    iput-object p9, p0, LkO6;->i:LwM6;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, LkO6;->a:LwM6;

    invoke-interface {v0}, LwM6;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LkO6;->b:LwM6;

    invoke-static {v1}, LsM6;->c(LwM6;)LoM6;

    move-result-object v4

    iget-object v1, p0, LkO6;->c:LwM6;

    invoke-interface {v1}, LwM6;->a()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LkO6;->d:LwM6;

    invoke-interface {v2}, LwM6;->a()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, LSO6;

    iget-object v2, p0, LkO6;->e:LwM6;

    invoke-interface {v2}, LwM6;->a()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, LkO6;->f:LwM6;

    invoke-interface {v3}, LwM6;->a()Ljava/lang/Object;

    move-result-object v3

    iget-object v5, p0, LkO6;->g:LwM6;

    invoke-interface {v5}, LwM6;->a()Ljava/lang/Object;

    move-result-object v5

    iget-object v7, p0, LkO6;->h:LwM6;

    invoke-static {v7}, LsM6;->c(LwM6;)LoM6;

    move-result-object v10

    iget-object v7, p0, LkO6;->i:LwM6;

    invoke-interface {v7}, LwM6;->a()Ljava/lang/Object;

    move-result-object v7

    move-object v11, v7

    check-cast v11, LPJ6;

    new-instance v12, LcO6;

    check-cast v0, LHK6;

    check-cast v1, LBK6;

    move-object v7, v2

    check-cast v7, LpM6;

    move-object v8, v3

    check-cast v8, LxL6;

    move-object v9, v5

    check-cast v9, LlL6;

    move-object v2, v12

    move-object v3, v0

    move-object v5, v1

    invoke-direct/range {v2 .. v11}, LcO6;-><init>(LHK6;LoM6;LBK6;LSO6;LpM6;LxL6;LlL6;LoM6;LPJ6;)V

    return-object v12
.end method
