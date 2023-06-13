.class public final LNG6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMG6;


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "LLG6;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNG6;->a:LEb5;

    new-instance v0, LNG6$a;

    invoke-direct {v0, p0, p1}, LNG6$a;-><init>(LNG6;LEb5;)V

    iput-object v0, p0, LNG6;->b:Lcf1;

    new-instance v0, LNG6$b;

    invoke-direct {v0, p0, p1}, LNG6$b;-><init>(LNG6;LEb5;)V

    iput-object v0, p0, LNG6;->c:Lgz5;

    return-void
.end method

.method public static e()Ljava/util/List;
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
.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, LNG6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->b()V

    iget-object v0, p0, LNG6;->c:Lgz5;

    invoke-virtual {v0}, Lgz5;->b()LqV5;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    invoke-interface {v0, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1, p1}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, LNG6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->c()V

    :try_start_0
    invoke-interface {v0}, LqV5;->M()I

    iget-object p1, p0, LNG6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LNG6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->g()V

    iget-object p1, p0, LNG6;->c:Lgz5;

    invoke-virtual {p1, v0}, Lgz5;->h(LqV5;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object v1, p0, LNG6;->a:LEb5;

    invoke-virtual {v1}, LEb5;->g()V

    iget-object v1, p0, LNG6;->c:Lgz5;

    invoke-virtual {v1, v0}, Lgz5;->h(LqV5;)V

    throw p1
.end method

.method public b(LLG6;)V
    .locals 1

    iget-object v0, p0, LNG6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->b()V

    iget-object v0, p0, LNG6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    iget-object v0, p0, LNG6;->b:Lcf1;

    invoke-virtual {v0, p1}, Lcf1;->k(Ljava/lang/Object;)V

    iget-object p1, p0, LNG6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LNG6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LNG6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    throw p1
.end method

.method public c(Ljava/lang/String;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0, p1, p2}, LMG6$a;->a(LMG6;Ljava/lang/String;Ljava/util/Set;)V

    return-void
.end method

.method public d(Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, LNG6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->b()V

    iget-object p1, p0, LNG6;->a:LEb5;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, LIF0;->c(LEb5;LpV5;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v4, v2

    goto :goto_2

    :cond_1
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    :goto_2
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, LHb5;->release()V

    return-object v3

    :catchall_0
    move-exception v1

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, LHb5;->release()V

    throw v1
.end method
