.class public final LYX5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXX5;


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "LWX5;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;

.field public final d:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYX5;->a:LEb5;

    new-instance v0, LYX5$a;

    invoke-direct {v0, p0, p1}, LYX5$a;-><init>(LYX5;LEb5;)V

    iput-object v0, p0, LYX5;->b:Lcf1;

    new-instance v0, LYX5$b;

    invoke-direct {v0, p0, p1}, LYX5$b;-><init>(LYX5;LEb5;)V

    iput-object v0, p0, LYX5;->c:Lgz5;

    new-instance v0, LYX5$c;

    invoke-direct {v0, p0, p1}, LYX5$c;-><init>(LYX5;LEb5;)V

    iput-object v0, p0, LYX5;->d:Lgz5;

    return-void
.end method

.method public static h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(LTC6;)V
    .locals 0

    invoke-static {p0, p1}, LXX5$a;->b(LXX5;LTC6;)V

    return-void
.end method

.method public b(Ljava/lang/String;I)LWX5;
    .locals 5

    const-string v0, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"

    const/4 v1, 0x2

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    const/4 v2, 0x1

    if-nez p1, :cond_0

    invoke-virtual {v0, v2}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v2, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    int-to-long p1, p2

    invoke-virtual {v0, v1, p1, p2}, LHb5;->S0(IJ)V

    iget-object p1, p0, LYX5;->a:LEb5;

    invoke-virtual {p1}, LEb5;->b()V

    iget-object p1, p0, LYX5;->a:LEb5;

    const/4 p2, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, p2, v1}, LIF0;->c(LEb5;LpV5;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    const-string p2, "work_spec_id"

    invoke-static {p1, p2}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result p2

    const-string v2, "generation"

    invoke-static {p1, v2}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v2

    const-string v3, "system_id"

    invoke-static {p1, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1, p2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result p2

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    new-instance v3, LWX5;

    invoke-direct {v3, v1, p2, v2}, LWX5;-><init>(Ljava/lang/String;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v3

    :cond_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, LHb5;->release()V

    return-object v1

    :catchall_0
    move-exception p2

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, LHb5;->release()V

    throw p2
.end method

.method public c()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    iget-object v2, p0, LYX5;->a:LEb5;

    invoke-virtual {v2}, LEb5;->b()V

    iget-object v2, p0, LYX5;->a:LEb5;

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3}, LIF0;->c(LEb5;LpV5;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v5, v3

    goto :goto_1

    :cond_0
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    :goto_1
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, LHb5;->release()V

    return-object v4

    :catchall_0
    move-exception v1

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, LHb5;->release()V

    throw v1
.end method

.method public d(LTC6;)LWX5;
    .locals 0

    invoke-static {p0, p1}, LXX5$a;->a(LXX5;LTC6;)LWX5;

    move-result-object p1

    return-object p1
.end method

.method public e(LWX5;)V
    .locals 1

    iget-object v0, p0, LYX5;->a:LEb5;

    invoke-virtual {v0}, LEb5;->b()V

    iget-object v0, p0, LYX5;->a:LEb5;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    iget-object v0, p0, LYX5;->b:Lcf1;

    invoke-virtual {v0, p1}, Lcf1;->k(Ljava/lang/Object;)V

    iget-object p1, p0, LYX5;->a:LEb5;

    invoke-virtual {p1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LYX5;->a:LEb5;

    invoke-virtual {p1}, LEb5;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LYX5;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    throw p1
.end method

.method public f(Ljava/lang/String;I)V
    .locals 3

    iget-object v0, p0, LYX5;->a:LEb5;

    invoke-virtual {v0}, LEb5;->b()V

    iget-object v0, p0, LYX5;->c:Lgz5;

    invoke-virtual {v0}, Lgz5;->b()LqV5;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    invoke-interface {v0, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1, p1}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    const/4 p1, 0x2

    int-to-long v1, p2

    invoke-interface {v0, p1, v1, v2}, LoV5;->S0(IJ)V

    iget-object p1, p0, LYX5;->a:LEb5;

    invoke-virtual {p1}, LEb5;->c()V

    :try_start_0
    invoke-interface {v0}, LqV5;->M()I

    iget-object p1, p0, LYX5;->a:LEb5;

    invoke-virtual {p1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LYX5;->a:LEb5;

    invoke-virtual {p1}, LEb5;->g()V

    iget-object p1, p0, LYX5;->c:Lgz5;

    invoke-virtual {p1, v0}, Lgz5;->h(LqV5;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, LYX5;->a:LEb5;

    invoke-virtual {p2}, LEb5;->g()V

    iget-object p2, p0, LYX5;->c:Lgz5;

    invoke-virtual {p2, v0}, Lgz5;->h(LqV5;)V

    throw p1
.end method

.method public g(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, LYX5;->a:LEb5;

    invoke-virtual {v0}, LEb5;->b()V

    iget-object v0, p0, LYX5;->d:Lgz5;

    invoke-virtual {v0}, Lgz5;->b()LqV5;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    invoke-interface {v0, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1, p1}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, LYX5;->a:LEb5;

    invoke-virtual {p1}, LEb5;->c()V

    :try_start_0
    invoke-interface {v0}, LqV5;->M()I

    iget-object p1, p0, LYX5;->a:LEb5;

    invoke-virtual {p1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LYX5;->a:LEb5;

    invoke-virtual {p1}, LEb5;->g()V

    iget-object p1, p0, LYX5;->d:Lgz5;

    invoke-virtual {p1, v0}, Lgz5;->h(LqV5;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object v1, p0, LYX5;->a:LEb5;

    invoke-virtual {v1}, LEb5;->g()V

    iget-object v1, p0, LYX5;->d:Lgz5;

    invoke-virtual {v1, v0}, Lgz5;->h(LqV5;)V

    throw p1
.end method
