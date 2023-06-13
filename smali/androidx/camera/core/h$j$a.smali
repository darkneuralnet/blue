.class public Landroidx/camera/core/h$j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCA1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/h$j;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LCA1<",
        "Landroidx/camera/core/i;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Landroidx/camera/core/h$i;

.field public final synthetic b:Landroidx/camera/core/h$j;


# direct methods
.method public constructor <init>(Landroidx/camera/core/h$j;Landroidx/camera/core/h$i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/camera/core/h$j$a;->b:Landroidx/camera/core/h$j;

    iput-object p2, p0, Landroidx/camera/core/h$j$a;->a:Landroidx/camera/core/h$i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/core/i;)V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/h$j$a;->b:Landroidx/camera/core/h$j;

    iget-object v0, v0, Landroidx/camera/core/h$j;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p1}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LjB5;

    invoke-direct {v1, p1}, LjB5;-><init>(Landroidx/camera/core/i;)V

    iget-object p1, p0, Landroidx/camera/core/h$j$a;->b:Landroidx/camera/core/h$j;

    invoke-virtual {v1, p1}, Landroidx/camera/core/d;->a(Landroidx/camera/core/d$a;)V

    iget-object p1, p0, Landroidx/camera/core/h$j$a;->b:Landroidx/camera/core/h$j;

    iget v2, p1, Landroidx/camera/core/h$j;->d:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p1, Landroidx/camera/core/h$j;->d:I

    iget-object p1, p0, Landroidx/camera/core/h$j$a;->a:Landroidx/camera/core/h$i;

    invoke-virtual {p1, v1}, Landroidx/camera/core/h$i;->c(Landroidx/camera/core/i;)V

    iget-object p1, p0, Landroidx/camera/core/h$j$a;->b:Landroidx/camera/core/h$j;

    const/4 v1, 0x0

    iput-object v1, p1, Landroidx/camera/core/h$j;->b:Landroidx/camera/core/h$i;

    iput-object v1, p1, Landroidx/camera/core/h$j;->c:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-virtual {p1}, Landroidx/camera/core/h$j;->b()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 4

    iget-object v0, p0, Landroidx/camera/core/h$j$a;->b:Landroidx/camera/core/h$j;

    iget-object v0, v0, Landroidx/camera/core/h$j;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Landroidx/camera/core/h$j$a;->a:Landroidx/camera/core/h$i;

    invoke-static {p1}, Landroidx/camera/core/h;->p0(Ljava/lang/Throwable;)I

    move-result v2

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    const-string v3, "Unknown error"

    :goto_0
    invoke-virtual {v1, v2, v3, p1}, Landroidx/camera/core/h$i;->f(ILjava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    iget-object p1, p0, Landroidx/camera/core/h$j$a;->b:Landroidx/camera/core/h$j;

    const/4 v1, 0x0

    iput-object v1, p1, Landroidx/camera/core/h$j;->b:Landroidx/camera/core/h$i;

    iput-object v1, p1, Landroidx/camera/core/h$j;->c:Lcom/google/common/util/concurrent/ListenableFuture;

    invoke-virtual {p1}, Landroidx/camera/core/h$j;->b()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroidx/camera/core/i;

    invoke-virtual {p0, p1}, Landroidx/camera/core/h$j$a;->a(Landroidx/camera/core/i;)V

    return-void
.end method
