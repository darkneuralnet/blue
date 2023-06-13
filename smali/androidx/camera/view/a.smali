.class public final Landroidx/camera/view/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZd3$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LZd3$a<",
        "LLb0$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LKb0;

.field public final b:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Landroidx/camera/view/PreviewView$h;",
            ">;"
        }
    .end annotation
.end field

.field public c:Landroidx/camera/view/PreviewView$h;

.field public final d:Landroidx/camera/view/c;

.field public e:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public f:Z


# direct methods
.method public constructor <init>(LKb0;LuX2;Landroidx/camera/view/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LKb0;",
            "LuX2<",
            "Landroidx/camera/view/PreviewView$h;",
            ">;",
            "Landroidx/camera/view/c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/camera/view/a;->f:Z

    iput-object p1, p0, Landroidx/camera/view/a;->a:LKb0;

    iput-object p2, p0, Landroidx/camera/view/a;->b:LuX2;

    iput-object p3, p0, Landroidx/camera/view/a;->d:Landroidx/camera/view/c;

    monitor-enter p0

    :try_start_0
    invoke-virtual {p2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/camera/view/PreviewView$h;

    iput-object p1, p0, Landroidx/camera/view/a;->c:Landroidx/camera/view/PreviewView$h;

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static synthetic b(Landroidx/camera/view/a;Ljava/lang/Void;)Ljava/lang/Void;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/view/a;->h(Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/camera/view/a;LJb0;Ljava/util/List;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/view/a;->i(LJb0;Ljava/util/List;LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/camera/view/a;Ljava/lang/Void;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/view/a;->g(Ljava/lang/Void;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0

    return-object p0
.end method

.method private synthetic g(Ljava/lang/Void;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object p1, p0, Landroidx/camera/view/a;->d:Landroidx/camera/view/c;

    invoke-virtual {p1}, Landroidx/camera/view/c;->h()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method private synthetic h(Ljava/lang/Void;)Ljava/lang/Void;
    .locals 0

    sget-object p1, Landroidx/camera/view/PreviewView$h;->c:Landroidx/camera/view/PreviewView$h;

    invoke-virtual {p0, p1}, Landroidx/camera/view/a;->l(Landroidx/camera/view/PreviewView$h;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic i(LJb0;Ljava/util/List;LO80$a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v0, Landroidx/camera/view/a$b;

    invoke-direct {v0, p0, p3, p1}, Landroidx/camera/view/a$b;-><init>(Landroidx/camera/view/a;LO80$a;LJb0;)V

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    check-cast p1, LKb0;

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object p2

    invoke-interface {p1, p2, v0}, LKb0;->c(Ljava/util/concurrent/Executor;Lpa0;)V

    const-string p1, "waitForCaptureResult"

    return-object p1
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LLb0$a;

    invoke-virtual {p0, p1}, Landroidx/camera/view/a;->j(LLb0$a;)V

    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/view/a;->e:Lcom/google/common/util/concurrent/ListenableFuture;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/camera/view/a;->e:Lcom/google/common/util/concurrent/ListenableFuture;

    :cond_0
    return-void
.end method

.method public f()V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/view/a;->e()V

    return-void
.end method

.method public j(LLb0$a;)V
    .locals 1

    sget-object v0, LLb0$a;->g:LLb0$a;

    if-eq p1, v0, :cond_2

    sget-object v0, LLb0$a;->h:LLb0$a;

    if-eq p1, v0, :cond_2

    sget-object v0, LLb0$a;->i:LLb0$a;

    if-eq p1, v0, :cond_2

    sget-object v0, LLb0$a;->j:LLb0$a;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, LLb0$a;->d:LLb0$a;

    if-eq p1, v0, :cond_1

    sget-object v0, LLb0$a;->e:LLb0$a;

    if-eq p1, v0, :cond_1

    sget-object v0, LLb0$a;->c:LLb0$a;

    if-ne p1, v0, :cond_3

    :cond_1
    iget-boolean p1, p0, Landroidx/camera/view/a;->f:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Landroidx/camera/view/a;->a:LKb0;

    invoke-virtual {p0, p1}, Landroidx/camera/view/a;->k(LJb0;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/camera/view/a;->f:Z

    goto :goto_1

    :cond_2
    :goto_0
    sget-object p1, Landroidx/camera/view/PreviewView$h;->b:Landroidx/camera/view/PreviewView$h;

    invoke-virtual {p0, p1}, Landroidx/camera/view/a;->l(Landroidx/camera/view/PreviewView$h;)V

    iget-boolean p1, p0, Landroidx/camera/view/a;->f:Z

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/camera/view/a;->f:Z

    invoke-virtual {p0}, Landroidx/camera/view/a;->e()V

    :cond_3
    :goto_1
    return-void
.end method

.method public final k(LJb0;)V
    .locals 4

    sget-object v0, Landroidx/camera/view/PreviewView$h;->b:Landroidx/camera/view/PreviewView$h;

    invoke-virtual {p0, v0}, Landroidx/camera/view/a;->l(Landroidx/camera/view/PreviewView$h;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, p1, v0}, Landroidx/camera/view/a;->m(LJb0;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    invoke-static {v1}, LDA1;->a(Lcom/google/common/util/concurrent/ListenableFuture;)LDA1;

    move-result-object v1

    new-instance v2, Ld24;

    invoke-direct {v2, p0}, Ld24;-><init>(Landroidx/camera/view/a;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, LDA1;->e(Lfp;Ljava/util/concurrent/Executor;)LDA1;

    move-result-object v1

    new-instance v2, Le24;

    invoke-direct {v2, p0}, Le24;-><init>(Landroidx/camera/view/a;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, LDA1;->d(LxA1;Ljava/util/concurrent/Executor;)LDA1;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/view/a;->e:Lcom/google/common/util/concurrent/ListenableFuture;

    new-instance v2, Landroidx/camera/view/a$a;

    invoke-direct {v2, p0, v0, p1}, Landroidx/camera/view/a$a;-><init>(Landroidx/camera/view/a;Ljava/util/List;LJb0;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {v1, v2, p1}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public l(Landroidx/camera/view/PreviewView$h;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroidx/camera/view/a;->c:Landroidx/camera/view/PreviewView$h;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    iput-object p1, p0, Landroidx/camera/view/a;->c:Landroidx/camera/view/PreviewView$h;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "StreamStateObserver"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Update Preview stream state to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/view/a;->b:LuX2;

    invoke-virtual {v0, p1}, LuX2;->postValue(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final m(LJb0;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJb0;",
            "Ljava/util/List<",
            "Lpa0;",
            ">;)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lf24;

    invoke-direct {v0, p0, p1, p2}, Lf24;-><init>(Landroidx/camera/view/a;LJb0;Ljava/util/List;)V

    invoke-static {v0}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/view/a;->f()V

    sget-object p1, Landroidx/camera/view/PreviewView$h;->b:Landroidx/camera/view/PreviewView$h;

    invoke-virtual {p0, p1}, Landroidx/camera/view/a;->l(Landroidx/camera/view/PreviewView$h;)V

    return-void
.end method
