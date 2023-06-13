.class public LRC6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final h:Ljava/lang/String;


# instance fields
.field public final b:Lew5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lew5<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Landroid/content/Context;

.field public final d:LHG6;

.field public final e:Landroidx/work/c;

.field public final f:Lsx1;

.field public final g:LmZ5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkForegroundRunnable"

    invoke-static {v0}, LBx2;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LRC6;->h:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LHG6;Landroidx/work/c;Lsx1;LmZ5;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "LambdaLast"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lew5;->t()Lew5;

    move-result-object v0

    iput-object v0, p0, LRC6;->b:Lew5;

    iput-object p1, p0, LRC6;->c:Landroid/content/Context;

    iput-object p2, p0, LRC6;->d:LHG6;

    iput-object p3, p0, LRC6;->e:Landroidx/work/c;

    iput-object p4, p0, LRC6;->f:Lsx1;

    iput-object p5, p0, LRC6;->g:LmZ5;

    return-void
.end method

.method public static synthetic a(LRC6;Lew5;)V
    .locals 0

    invoke-direct {p0, p1}, LRC6;->c(Lew5;)V

    return-void
.end method

.method private synthetic c(Lew5;)V
    .locals 1

    iget-object v0, p0, LRC6;->b:Lew5;

    invoke-virtual {v0}, Lw0;->isCancelled()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LRC6;->e:Landroidx/work/c;

    invoke-virtual {v0}, Landroidx/work/c;->d()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    invoke-virtual {p1, v0}, Lew5;->r(Lcom/google/common/util/concurrent/ListenableFuture;)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lw0;->cancel(Z)Z

    :goto_0
    return-void
.end method


# virtual methods
.method public b()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LRC6;->b:Lew5;

    return-object v0
.end method

.method public run()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnsafeExperimentalUsageError"
        }
    .end annotation

    iget-object v0, p0, LRC6;->d:LHG6;

    iget-boolean v0, v0, LHG6;->q:Z

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lew5;->t()Lew5;

    move-result-object v0

    iget-object v1, p0, LRC6;->g:LmZ5;

    invoke-interface {v1}, LmZ5;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, LQC6;

    invoke-direct {v2, p0, v0}, LQC6;-><init>(LRC6;Lew5;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    new-instance v1, LRC6$a;

    invoke-direct {v1, p0, v0}, LRC6$a;-><init>(LRC6;Lew5;)V

    iget-object v2, p0, LRC6;->g:LmZ5;

    invoke-interface {v2}, LmZ5;->b()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lw0;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, LRC6;->b:Lew5;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lew5;->p(Ljava/lang/Object;)Z

    return-void
.end method
