.class public final LLM6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LwM6;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LwM6<",
        "LKM6;",
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

.field public final synthetic g:I


# direct methods
.method public constructor <init>(LwM6;LwM6;LwM6;LwM6;LwM6;LwM6;)V
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
            "LpM6;",
            ">;",
            "LwM6<",
            "Ljava/util/concurrent/Executor;",
            ">;",
            "LwM6<",
            "LxL6;",
            ">;",
            "LwM6<",
            "LPJ6;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    iput v0, p0, LLM6;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLM6;->a:LwM6;

    iput-object p2, p0, LLM6;->b:LwM6;

    iput-object p3, p0, LLM6;->c:LwM6;

    iput-object p4, p0, LLM6;->d:LwM6;

    iput-object p5, p0, LLM6;->e:LwM6;

    iput-object p6, p0, LLM6;->f:LwM6;

    return-void
.end method

.method public constructor <init>(LwM6;LwM6;LwM6;LwM6;LwM6;LwM6;[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LwM6<",
            "Ljava/lang/String;",
            ">;",
            "LwM6<",
            "LBK6;",
            ">;",
            "LwM6<",
            "LxL6;",
            ">;",
            "LwM6<",
            "Landroid/content/Context;",
            ">;",
            "LwM6<",
            "LMM6;",
            ">;",
            "LwM6<",
            "Ljava/util/concurrent/Executor;",
            ">;[B)V"
        }
    .end annotation

    const/4 p7, 0x1

    iput p7, p0, LLM6;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLM6;->f:LwM6;

    iput-object p2, p0, LLM6;->b:LwM6;

    iput-object p3, p0, LLM6;->e:LwM6;

    iput-object p4, p0, LLM6;->d:LwM6;

    iput-object p5, p0, LLM6;->c:LwM6;

    iput-object p6, p0, LLM6;->a:LwM6;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 12

    iget v0, p0, LLM6;->g:I

    if-eqz v0, :cond_1

    iget-object v0, p0, LLM6;->f:LwM6;

    invoke-interface {v0}, LwM6;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, LLM6;->b:LwM6;

    invoke-interface {v1}, LwM6;->a()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LLM6;->e:LwM6;

    invoke-interface {v2}, LwM6;->a()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, LLM6;->d:LwM6;

    check-cast v3, LTO6;

    invoke-virtual {v3}, LTO6;->b()Landroid/content/Context;

    move-result-object v8

    iget-object v3, p0, LLM6;->c:LwM6;

    invoke-interface {v3}, LwM6;->a()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, LLM6;->a:LwM6;

    invoke-static {v4}, LsM6;->c(LwM6;)LoM6;

    move-result-object v10

    new-instance v11, LAM6;

    move-object v6, v1

    check-cast v6, LBK6;

    move-object v7, v2

    check-cast v7, LxL6;

    move-object v9, v3

    check-cast v9, LMM6;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v2, Ljava/io/File;

    invoke-virtual {v8, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-direct {v2, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v5, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v8, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    move-object v5, v0

    :goto_0
    move-object v4, v11

    invoke-direct/range {v4 .. v10}, LAM6;-><init>(Ljava/io/File;LBK6;LxL6;Landroid/content/Context;LMM6;LoM6;)V

    return-object v11

    :cond_1
    iget-object v0, p0, LLM6;->a:LwM6;

    invoke-interface {v0}, LwM6;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LLM6;->b:LwM6;

    invoke-static {v1}, LsM6;->c(LwM6;)LoM6;

    move-result-object v4

    iget-object v1, p0, LLM6;->c:LwM6;

    invoke-interface {v1}, LwM6;->a()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LLM6;->d:LwM6;

    invoke-static {v2}, LsM6;->c(LwM6;)LoM6;

    move-result-object v6

    iget-object v2, p0, LLM6;->e:LwM6;

    invoke-interface {v2}, LwM6;->a()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, LLM6;->f:LwM6;

    invoke-interface {v3}, LwM6;->a()Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, LPJ6;

    new-instance v9, LKM6;

    move-object v3, v0

    check-cast v3, LHK6;

    move-object v5, v1

    check-cast v5, LpM6;

    move-object v7, v2

    check-cast v7, LxL6;

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, LKM6;-><init>(LHK6;LoM6;LpM6;LoM6;LxL6;LPJ6;)V

    return-object v9
.end method
