.class public final LTL1;
.super LSL1;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/HibernationSessionVehicle;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lbf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbf1<",
            "Lco/bird/android/model/persistence/HibernationSessionVehicle;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lgz5;

.field public final e:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, LSL1;-><init>()V

    iput-object p1, p0, LTL1;->a:LEb5;

    new-instance v0, LTL1$a;

    invoke-direct {v0, p0, p1}, LTL1$a;-><init>(LTL1;LEb5;)V

    iput-object v0, p0, LTL1;->b:Lcf1;

    new-instance v0, LTL1$b;

    invoke-direct {v0, p0, p1}, LTL1$b;-><init>(LTL1;LEb5;)V

    iput-object v0, p0, LTL1;->c:Lbf1;

    new-instance v0, LTL1$c;

    invoke-direct {v0, p0, p1}, LTL1$c;-><init>(LTL1;LEb5;)V

    iput-object v0, p0, LTL1;->d:Lgz5;

    new-instance v0, LTL1$d;

    invoke-direct {v0, p0, p1}, LTL1$d;-><init>(LTL1;LEb5;)V

    iput-object v0, p0, LTL1;->e:Lgz5;

    return-void
.end method

.method public static bridge synthetic h(LTL1;)LEb5;
    .locals 0

    iget-object p0, p0, LTL1;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic i(LTL1;)Lgz5;
    .locals 0

    iget-object p0, p0, LTL1;->e:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic j(LTL1;)Lgz5;
    .locals 0

    iget-object p0, p0, LTL1;->d:Lgz5;

    return-object p0
.end method

.method public static synthetic k(LTL1;Ljava/util/List;)V
    .locals 0

    invoke-super {p0, p1}, LSL1;->g(Ljava/util/List;)V

    return-void
.end method

.method public static l()Ljava/util/List;
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
.method public a()Lio/reactivex/c;
    .locals 1

    new-instance v0, LTL1$f;

    invoke-direct {v0, p0}, LTL1$f;-><init>(LTL1;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public b()Lio/reactivex/c;
    .locals 1

    new-instance v0, LTL1$e;

    invoke-direct {v0, p0}, LTL1$e;-><init>(LTL1;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public c()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/HibernationSessionVehicle;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT `hibernation`.`bird_id` AS `bird_id`, `hibernation`.`category` AS `category`, `hibernation`.`title` AS `title`, `hibernation`.`retry_message` AS `retry_message`, `hibernation`.`info_message` AS `info_message` FROM `hibernation`"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    iget-object v2, p0, LTL1;->a:LEb5;

    const-string v3, "hibernation"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, LTL1$g;

    invoke-direct {v4, p0, v0}, LTL1$g;-><init>(LTL1;LHb5;)V

    invoke-static {v2, v1, v3, v4}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, LiS5;->b()Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "SELECT `bird_id` FROM `hibernation` WHERE rowid in ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v0, v1}, LiS5;->a(Ljava/lang/StringBuilder;I)V

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    add-int/2addr v1, v2

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    if-nez v3, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v0, v1, v3, v4}, LHb5;->S0(IJ)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, LTL1;->a:LEb5;

    invoke-virtual {p1}, LEb5;->b()V

    iget-object p1, p0, LTL1;->a:LEb5;

    const/4 v1, 0x0

    invoke-static {p1, v0, v2, v1}, LIF0;->c(LEb5;LpV5;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    :goto_2
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p1, v2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_2

    move-object v4, v1

    goto :goto_3

    :cond_2
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    :goto_3
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_3
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, LHb5;->release()V

    return-object v3

    :catchall_0
    move-exception v1

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, LHb5;->release()V

    throw v1
.end method

.method public e(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/HibernationSessionVehicle;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LTL1;->a:LEb5;

    invoke-virtual {v0}, LEb5;->b()V

    iget-object v0, p0, LTL1;->a:LEb5;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    iget-object v0, p0, LTL1;->b:Lcf1;

    invoke-virtual {v0, p1}, Lcf1;->n(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, LTL1;->a:LEb5;

    invoke-virtual {v0}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LTL1;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, LTL1;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    throw p1
.end method

.method public f(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/HibernationSessionVehicle;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LTL1;->a:LEb5;

    invoke-virtual {v0}, LEb5;->b()V

    iget-object v0, p0, LTL1;->a:LEb5;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    iget-object v0, p0, LTL1;->c:Lbf1;

    invoke-virtual {v0, p1}, Lbf1;->k(Ljava/lang/Iterable;)I

    iget-object p1, p0, LTL1;->a:LEb5;

    invoke-virtual {p1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LTL1;->a:LEb5;

    invoke-virtual {p1}, LEb5;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LTL1;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    throw p1
.end method

.method public g(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/HibernationSessionVehicle;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LTL1;->a:LEb5;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    invoke-static {p0, p1}, LTL1;->k(LTL1;Ljava/util/List;)V

    iget-object p1, p0, LTL1;->a:LEb5;

    invoke-virtual {p1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LTL1;->a:LEb5;

    invoke-virtual {p1}, LEb5;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LTL1;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    throw p1
.end method
