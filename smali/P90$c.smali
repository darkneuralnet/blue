.class public LP90$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP90;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final i:J

.field public static final j:J


# instance fields
.field public final a:I

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lr90;

.field public final d:LzA3;

.field public final e:Z

.field public f:J

.field public final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LP90$d;",
            ">;"
        }
    .end annotation
.end field

.field public final h:LP90$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v1

    sput-wide v1, LP90$c;->i:J

    const-wide/16 v1, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, LP90$c;->j:J

    return-void
.end method

.method public constructor <init>(ILjava/util/concurrent/Executor;Lr90;ZLzA3;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-wide v0, LP90$c;->i:J

    iput-wide v0, p0, LP90$c;->f:J

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LP90$c;->g:Ljava/util/List;

    new-instance v0, LP90$c$a;

    invoke-direct {v0, p0}, LP90$c$a;-><init>(LP90$c;)V

    iput-object v0, p0, LP90$c;->h:LP90$d;

    iput p1, p0, LP90$c;->a:I

    iput-object p2, p0, LP90$c;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, LP90$c;->c:Lr90;

    iput-boolean p4, p0, LP90$c;->e:Z

    iput-object p5, p0, LP90$c;->d:LzA3;

    return-void
.end method

.method public static synthetic a(LP90$c;Landroidx/camera/core/impl/d$a;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, LP90$c;->n(Landroidx/camera/core/impl/d$a;LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LP90$c;Ljava/lang/Boolean;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    invoke-direct {p0, p1}, LP90$c;->l(Ljava/lang/Boolean;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LP90$c;Ljava/util/List;ILandroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LP90$c;->m(Ljava/util/List;ILandroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LP90$c;ILandroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    invoke-direct {p0, p1, p2}, LP90$c;->j(ILandroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    invoke-static {p0}, LP90$c;->k(Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p0

    return p0
.end method

.method private synthetic j(ILandroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-static {p1, p2}, LP90;->b(ILandroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-wide v0, LP90$c;->j:J

    invoke-virtual {p0, v0, v1}, LP90$c;->o(J)V

    :cond_0
    iget-object p1, p0, LP90$c;->h:LP90$d;

    invoke-interface {p1, p2}, LP90$d;->a(Landroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic k(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, LP90;->a(Landroid/hardware/camera2/TotalCaptureResult;Z)Z

    move-result p0

    return p0
.end method

.method private synthetic l(Ljava/lang/Boolean;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-wide v0, p0, LP90$c;->f:J

    iget-object p1, p0, LP90$c;->c:Lr90;

    new-instance v2, LV90;

    invoke-direct {v2}, LV90;-><init>()V

    invoke-static {v0, v1, p1, v2}, LP90;->f(JLr90;LP90$e$a;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    invoke-static {p1}, LIA1;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method private synthetic m(Ljava/util/List;ILandroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, LP90$c;->p(Ljava/util/List;I)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method private synthetic n(Landroidx/camera/core/impl/d$a;LO80$a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    new-instance v0, LP90$c$b;

    invoke-direct {v0, p0, p2}, LP90$c$b;-><init>(LP90$c;LO80$a;)V

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/d$a;->c(Lpa0;)V

    const-string p1, "submitStillCapture"

    return-object p1
.end method


# virtual methods
.method public f(LP90$d;)V
    .locals 1

    iget-object v0, p0, LP90$c;->g:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final g(Landroidx/camera/core/impl/d$a;)V
    .locals 3

    new-instance v0, Lja0$a;

    invoke-direct {v0}, Lja0$a;-><init>()V

    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lja0$a;->e(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lja0$a;

    invoke-virtual {v0}, Lja0$a;->a()Lja0;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/d$a;->e(Landroidx/camera/core/impl/f;)V

    return-void
.end method

.method public final h(Landroidx/camera/core/impl/d$a;Landroidx/camera/core/impl/d;)V
    .locals 3

    iget v0, p0, LP90$c;->a:I

    const/4 v1, 0x3

    const/4 v2, -0x1

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, LP90$c;->e:Z

    if-nez v0, :cond_0

    const/4 p2, 0x4

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Landroidx/camera/core/impl/d;->h()I

    move-result v0

    if-eq v0, v2, :cond_2

    invoke-virtual {p2}, Landroidx/camera/core/impl/d;->h()I

    move-result p2

    const/4 v0, 0x5

    if-ne p2, v0, :cond_1

    goto :goto_0

    :cond_1
    move p2, v2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p2, 0x2

    :goto_1
    if-eq p2, v2, :cond_3

    invoke-virtual {p1, p2}, Landroidx/camera/core/impl/d$a;->s(I)V

    :cond_3
    return-void
.end method

.method public i(Ljava/util/List;I)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d;",
            ">;I)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, LIA1;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    iget-object v2, p0, LP90$c;->g:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v1, p0, LP90$c;->h:LP90$d;

    invoke-interface {v1}, LP90$d;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    const-wide/16 v1, 0x0

    iget-object v3, p0, LP90$c;->c:Lr90;

    invoke-static {v1, v2, v3, v0}, LP90;->f(JLr90;LP90$e$a;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {v0}, LIA1;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v0

    :goto_0
    invoke-static {v0}, LDA1;->a(Lcom/google/common/util/concurrent/ListenableFuture;)LDA1;

    move-result-object v0

    new-instance v1, LQ90;

    invoke-direct {v1, p0, p2}, LQ90;-><init>(LP90$c;I)V

    iget-object v2, p0, LP90$c;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, v2}, LDA1;->e(Lfp;Ljava/util/concurrent/Executor;)LDA1;

    move-result-object v0

    new-instance v1, LR90;

    invoke-direct {v1, p0}, LR90;-><init>(LP90$c;)V

    iget-object v2, p0, LP90$c;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, v2}, LDA1;->e(Lfp;Ljava/util/concurrent/Executor;)LDA1;

    move-result-object v1

    :cond_1
    invoke-static {v1}, LDA1;->a(Lcom/google/common/util/concurrent/ListenableFuture;)LDA1;

    move-result-object v0

    new-instance v1, LS90;

    invoke-direct {v1, p0, p1, p2}, LS90;-><init>(LP90$c;Ljava/util/List;I)V

    iget-object p1, p0, LP90$c;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, p1}, LDA1;->e(Lfp;Ljava/util/concurrent/Executor;)LDA1;

    move-result-object p1

    iget-object p2, p0, LP90$c;->h:LP90$d;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LT90;

    invoke-direct {v0, p2}, LT90;-><init>(LP90$d;)V

    iget-object p2, p0, LP90$c;->b:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0, p2}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object p1
.end method

.method public final o(J)V
    .locals 0

    iput-wide p1, p0, LP90$c;->f:J

    return-void
.end method

.method public p(Ljava/util/List;I)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/d;",
            ">;I)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/util/List<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/d;

    invoke-static {v2}, Landroidx/camera/core/impl/d$a;->k(Landroidx/camera/core/impl/d;)Landroidx/camera/core/impl/d$a;

    move-result-object v3

    invoke-virtual {v2}, Landroidx/camera/core/impl/d;->h()I

    move-result v4

    const/4 v5, 0x5

    if-ne v4, v5, :cond_1

    iget-object v4, p0, LP90$c;->c:Lr90;

    invoke-virtual {v4}, Lr90;->N()LsJ6;

    move-result-object v4

    invoke-interface {v4}, LsJ6;->g()Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v4, p0, LP90$c;->c:Lr90;

    invoke-virtual {v4}, Lr90;->N()LsJ6;

    move-result-object v4

    invoke-interface {v4}, LsJ6;->b()Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v4, p0, LP90$c;->c:Lr90;

    invoke-virtual {v4}, Lr90;->N()LsJ6;

    move-result-object v4

    invoke-interface {v4}, LsJ6;->e()Landroidx/camera/core/i;

    move-result-object v4

    if-eqz v4, :cond_0

    iget-object v5, p0, LP90$c;->c:Lr90;

    invoke-virtual {v5}, Lr90;->N()LsJ6;

    move-result-object v5

    invoke-interface {v5, v4}, LsJ6;->f(Landroidx/camera/core/i;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_1

    invoke-interface {v4}, Landroidx/camera/core/i;->i1()LwX1;

    move-result-object v4

    invoke-static {v4}, Lza0;->a(LwX1;)Lxa0;

    move-result-object v4

    goto :goto_2

    :cond_1
    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_2

    invoke-virtual {v3, v4}, Landroidx/camera/core/impl/d$a;->p(Lxa0;)V

    goto :goto_3

    :cond_2
    invoke-virtual {p0, v3, v2}, LP90$c;->h(Landroidx/camera/core/impl/d$a;Landroidx/camera/core/impl/d;)V

    :goto_3
    iget-object v2, p0, LP90$c;->d:LzA3;

    invoke-virtual {v2, p2}, LzA3;->c(I)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0, v3}, LP90$c;->g(Landroidx/camera/core/impl/d$a;)V

    :cond_3
    new-instance v2, LU90;

    invoke-direct {v2, p0, v3}, LU90;-><init>(LP90$c;Landroidx/camera/core/impl/d$a;)V

    invoke-static {v2}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Landroidx/camera/core/impl/d$a;->h()Landroidx/camera/core/impl/d;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    iget-object p1, p0, LP90$c;->c:Lr90;

    invoke-virtual {p1, v1}, Lr90;->k0(Ljava/util/List;)V

    invoke-static {v0}, LIA1;->c(Ljava/util/Collection;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
