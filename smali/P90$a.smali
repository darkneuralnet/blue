.class public LP90$a;
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
    name = "a"
.end annotation


# instance fields
.field public final a:Lr90;

.field public final b:LzA3;

.field public final c:I

.field public d:Z


# direct methods
.method public constructor <init>(Lr90;ILzA3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LP90$a;->d:Z

    iput-object p1, p0, LP90$a;->a:Lr90;

    iput p2, p0, LP90$a;->c:I

    iput-object p3, p0, LP90$a;->b:LzA3;

    return-void
.end method

.method public static synthetic d(LP90$a;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LP90$a;->f(LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, LP90$a;->g(Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private synthetic f(LO80$a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LP90$a;->a:Lr90;

    invoke-virtual {v0}, Lr90;->B()LLv1;

    move-result-object v0

    invoke-virtual {v0, p1}, LLv1;->Q(LO80$a;)V

    iget-object p1, p0, LP90$a;->b:LzA3;

    invoke-virtual {p1}, LzA3;->b()V

    const-string p1, "AePreCapture"

    return-object p1
.end method

.method public static synthetic g(Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 0

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

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

    iget v0, p0, LP90$a;->c:I

    invoke-static {v0, p1}, LP90;->b(ILandroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "Camera2CapturePipeline"

    const-string v0, "Trigger AE"

    invoke-static {p1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, LP90$a;->d:Z

    new-instance p1, LN90;

    invoke-direct {p1, p0}, LN90;-><init>(LP90$a;)V

    invoke-static {p1}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    invoke-static {p1}, LDA1;->a(Lcom/google/common/util/concurrent/ListenableFuture;)LDA1;

    move-result-object p1

    new-instance v0, LO90;

    invoke-direct {v0}, LO90;-><init>()V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, LDA1;->d(LxA1;Ljava/util/concurrent/Executor;)LDA1;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, LIA1;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public b()Z
    .locals 1

    iget v0, p0, LP90$a;->c:I

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

    iget-boolean v0, p0, LP90$a;->d:Z

    if-eqz v0, :cond_0

    const-string v0, "Camera2CapturePipeline"

    const-string v1, "cancel TriggerAePreCapture"

    invoke-static {v0, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LP90$a;->a:Lr90;

    invoke-virtual {v0}, Lr90;->B()LLv1;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, LLv1;->j(ZZ)V

    iget-object v0, p0, LP90$a;->b:LzA3;

    invoke-virtual {v0}, LzA3;->a()V

    :cond_0
    return-void
.end method
