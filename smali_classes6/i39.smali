.class public final Li39;
.super Lc39;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lc39;-><init>(Lv39$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Lv39$a;)V
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lc39;-><init>(Lv39$a;)V

    return-void
.end method


# virtual methods
.method public final a(Ln39;Ln39;)V
    .locals 0

    iput-object p2, p1, Ln39;->b:Ln39;

    return-void
.end method

.method public final b(Ln39;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, Ln39;->a:Ljava/lang/Thread;

    return-void
.end method

.method public final c(Lv39;Lf39;Lf39;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv39<",
            "*>;",
            "Lf39;",
            "Lf39;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lv39;->k(Lv39;)Lf39;

    move-result-object v0

    if-ne v0, p2, :cond_0

    invoke-static {p1, p3}, Lv39;->l(Lv39;Lf39;)Lf39;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final d(Lv39;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv39<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lv39;->p(Lv39;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p2, :cond_0

    invoke-static {p1, p3}, Lv39;->q(Lv39;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final e(Lv39;Ln39;Ln39;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv39<",
            "*>;",
            "Ln39;",
            "Ln39;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    invoke-static {p1}, Lv39;->m(Lv39;)Ln39;

    move-result-object v0

    if-ne v0, p2, :cond_0

    invoke-static {p1, p3}, Lv39;->n(Lv39;Ln39;)Ln39;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
