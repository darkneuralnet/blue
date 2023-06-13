.class public final Lr56;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LSY0;

.field public final b:LYk0;

.field public volatile c:Z

.field public volatile d:I

.field public volatile e:J

.field public volatile f:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;LSY0;LYk0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lr56;->a:LSY0;

    iput-object p3, p0, Lr56;->b:LYk0;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lr56;->e:J

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    invoke-static {p1}, Lcom/google/android/gms/common/api/internal/BackgroundDetector;->initialize(Landroid/app/Application;)V

    invoke-static {}, Lcom/google/android/gms/common/api/internal/BackgroundDetector;->getInstance()Lcom/google/android/gms/common/api/internal/BackgroundDetector;

    move-result-object p1

    new-instance v0, Lr56$a;

    invoke-direct {v0, p0, p2, p3}, Lr56$a;-><init>(Lr56;LSY0;LYk0;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/internal/BackgroundDetector;->addListener(Lcom/google/android/gms/common/api/internal/BackgroundDetector$BackgroundStateChangeListener;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LhX0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1
    .param p3    # Ljava/util/concurrent/Executor;
        .annotation build LVq2;
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation build LUW;
        .end annotation
    .end param

    invoke-static {p1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    new-instance v0, LSY0;

    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LhX0;

    invoke-direct {v0, p2, p3, p4}, LSY0;-><init>(LhX0;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V

    new-instance p2, LYk0$a;

    invoke-direct {p2}, LYk0$a;-><init>()V

    invoke-direct {p0, p1, v0, p2}, Lr56;-><init>(Landroid/content/Context;LSY0;LYk0;)V

    return-void
.end method

.method public static synthetic a(Lr56;Z)Z
    .locals 0

    iput-boolean p1, p0, Lr56;->c:Z

    return p1
.end method

.method public static synthetic b(Lr56;)Z
    .locals 0

    invoke-virtual {p0}, Lr56;->g()Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lr56;)J
    .locals 2

    iget-wide v0, p0, Lr56;->e:J

    return-wide v0
.end method


# virtual methods
.method public d(LVh;)V
    .locals 6

    instance-of v0, p1, LpW0;

    if-eqz v0, :cond_0

    check-cast p1, LpW0;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LVh;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LpW0;->d(Ljava/lang/String;)LpW0;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, LpW0;->h()J

    move-result-wide v0

    invoke-virtual {p1}, LpW0;->f()J

    move-result-wide v2

    long-to-double v2, v2

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v2, v4

    double-to-long v2, v2

    add-long/2addr v0, v2

    const-wide/32 v2, 0x493e0

    add-long/2addr v0, v2

    iput-wide v0, p0, Lr56;->e:J

    iget-wide v0, p0, Lr56;->e:J

    invoke-virtual {p1}, LpW0;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    invoke-virtual {p1}, LpW0;->a()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lr56;->e:J

    :cond_1
    invoke-virtual {p0}, Lr56;->g()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lr56;->a:LSY0;

    iget-wide v0, p0, Lr56;->e:J

    iget-object v2, p0, Lr56;->b:LYk0;

    invoke-interface {v2}, LYk0;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, LSY0;->g(J)V

    :cond_2
    return-void
.end method

.method public e(I)V
    .locals 5

    iget v0, p0, Lr56;->d:I

    if-nez v0, :cond_0

    if-lez p1, :cond_0

    iput p1, p0, Lr56;->d:I

    invoke-virtual {p0}, Lr56;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lr56;->a:LSY0;

    iget-wide v1, p0, Lr56;->e:J

    iget-object v3, p0, Lr56;->b:LYk0;

    invoke-interface {v3}, LYk0;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, LSY0;->g(J)V

    goto :goto_0

    :cond_0
    iget v0, p0, Lr56;->d:I

    if-lez v0, :cond_1

    if-nez p1, :cond_1

    iget-object v0, p0, Lr56;->a:LSY0;

    invoke-virtual {v0}, LSY0;->c()V

    :cond_1
    :goto_0
    iput p1, p0, Lr56;->d:I

    return-void
.end method

.method public f(Z)V
    .locals 0

    iput-boolean p1, p0, Lr56;->f:Z

    return-void
.end method

.method public final g()Z
    .locals 4

    iget-boolean v0, p0, Lr56;->f:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lr56;->c:Z

    if-nez v0, :cond_0

    iget v0, p0, Lr56;->d:I

    if-lez v0, :cond_0

    iget-wide v0, p0, Lr56;->e:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
