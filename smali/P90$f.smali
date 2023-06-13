.class public LP90$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP90$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP90;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# static fields
.field public static final e:J


# instance fields
.field public final a:Lr90;

.field public final b:I

.field public c:Z

.field public final d:Ljava/util/concurrent/Executor;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x2

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, LP90$f;->e:J

    return-void
.end method

.method public constructor <init>(Lr90;ILjava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LP90$f;->c:Z

    iput-object p1, p0, LP90$f;->a:Lr90;

    iput p2, p0, LP90$f;->b:I

    iput-object p3, p0, LP90$f;->d:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic d(LP90$f;Ljava/lang/Void;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    invoke-direct {p0, p1}, LP90$f;->j(Ljava/lang/Void;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LP90$f;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LP90$f;->h(LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroid/hardware/camera2/TotalCaptureResult;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, LP90$f;->k(Landroid/hardware/camera2/TotalCaptureResult;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    invoke-static {p0}, LP90$f;->i(Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p0

    return p0
.end method

.method private synthetic h(LO80$a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LP90$f;->a:Lr90;

    invoke-virtual {v0}, Lr90;->K()LU56;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, LU56;->e(LO80$a;Z)V

    const-string p1, "TorchOn"

    return-object p1
.end method

.method public static synthetic i(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, LP90;->a(Landroid/hardware/camera2/TotalCaptureResult;Z)Z

    move-result p0

    return p0
.end method

.method private synthetic j(Ljava/lang/Void;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    sget-wide v0, LP90$f;->e:J

    iget-object p1, p0, LP90$f;->a:Lr90;

    new-instance v2, Lba0;

    invoke-direct {v2}, Lba0;-><init>()V

    invoke-static {v0, v1, p1, v2}, LP90;->f(JLr90;LP90$e$a;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic k(Landroid/hardware/camera2/TotalCaptureResult;)Ljava/lang/Boolean;
    .locals 0

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0
.end method


# virtual methods
.method public a(Landroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/camera2/TotalCaptureResult;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget v0, p0, LP90$f;->b:I

    invoke-static {v0, p1}, LP90;->b(ILandroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LP90$f;->a:Lr90;

    invoke-virtual {p1}, Lr90;->S()Z

    move-result p1

    const-string v0, "Camera2CapturePipeline"

    if-eqz p1, :cond_0

    const-string p1, "Torch already on, not turn on"

    invoke-static {v0, p1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p1, "Turn on torch"

    invoke-static {v0, p1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, LP90$f;->c:Z

    new-instance p1, LY90;

    invoke-direct {p1, p0}, LY90;-><init>(LP90$f;)V

    invoke-static {p1}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    invoke-static {p1}, LDA1;->a(Lcom/google/common/util/concurrent/ListenableFuture;)LDA1;

    move-result-object p1

    new-instance v0, LZ90;

    invoke-direct {v0, p0}, LZ90;-><init>(LP90$f;)V

    iget-object v1, p0, LP90$f;->d:Ljava/util/concurrent/Executor;

    invoke-virtual {p1, v0, v1}, LDA1;->e(Lfp;Ljava/util/concurrent/Executor;)LDA1;

    move-result-object p1

    new-instance v0, Laa0;

    invoke-direct {v0}, Laa0;-><init>()V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, LDA1;->d(LxA1;Ljava/util/concurrent/Executor;)LDA1;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, LIA1;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public b()Z
    .locals 1

    iget v0, p0, LP90$f;->b:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()V
    .locals 3

    iget-boolean v0, p0, LP90$f;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LP90$f;->a:Lr90;

    invoke-virtual {v0}, Lr90;->K()LU56;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, LU56;->e(LO80$a;Z)V

    const-string v0, "Camera2CapturePipeline"

    const-string v1, "Turn off torch"

    invoke-static {v0, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
