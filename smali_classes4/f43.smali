.class public final Lf43;
.super Le43;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/NestMarker;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/NestMarker;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lbf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbf1<",
            "Lco/bird/android/model/persistence/NestMarker;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lbf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbf1<",
            "Lco/bird/android/model/persistence/NestMarker;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, Le43;-><init>()V

    iput-object p1, p0, Lf43;->a:LEb5;

    new-instance v0, Lf43$b;

    invoke-direct {v0, p0, p1}, Lf43$b;-><init>(Lf43;LEb5;)V

    iput-object v0, p0, Lf43;->b:Lcf1;

    new-instance v0, Lf43$c;

    invoke-direct {v0, p0, p1}, Lf43$c;-><init>(Lf43;LEb5;)V

    iput-object v0, p0, Lf43;->c:Lcf1;

    new-instance v0, Lf43$d;

    invoke-direct {v0, p0, p1}, Lf43$d;-><init>(Lf43;LEb5;)V

    iput-object v0, p0, Lf43;->d:Lbf1;

    new-instance v0, Lf43$e;

    invoke-direct {v0, p0, p1}, Lf43$e;-><init>(Lf43;LEb5;)V

    iput-object v0, p0, Lf43;->e:Lbf1;

    new-instance v0, Lf43$f;

    invoke-direct {v0, p0, p1}, Lf43$f;-><init>(Lf43;LEb5;)V

    iput-object v0, p0, Lf43;->f:Lgz5;

    return-void
.end method

.method public static A()Ljava/util/List;
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

.method public static bridge synthetic k(Lf43;)LEb5;
    .locals 0

    iget-object p0, p0, Lf43;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic l(Lf43;)Lgz5;
    .locals 0

    iget-object p0, p0, Lf43;->f:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic m(Lf43;Lco/bird/android/model/constant/NestIcon;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lf43;->s(Lco/bird/android/model/constant/NestIcon;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic n(Lf43;Ljava/lang/String;)Lco/bird/android/model/constant/NestIcon;
    .locals 0

    invoke-virtual {p0, p1}, Lf43;->t(Ljava/lang/String;)Lco/bird/android/model/constant/NestIcon;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic o(Lf43;Lco/bird/android/model/constant/NestProminence;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lf43;->u(Lco/bird/android/model/constant/NestProminence;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic p(Lf43;Ljava/lang/String;)Lco/bird/android/model/constant/NestProminence;
    .locals 0

    invoke-virtual {p0, p1}, Lf43;->v(Ljava/lang/String;)Lco/bird/android/model/constant/NestProminence;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic q(Lf43;Lco/bird/android/model/constant/NestViewState;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lf43;->w(Lco/bird/android/model/constant/NestViewState;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic r(Lf43;Ljava/lang/String;)Lco/bird/android/model/constant/NestViewState;
    .locals 0

    invoke-virtual {p0, p1}, Lf43;->x(Ljava/lang/String;)Lco/bird/android/model/constant/NestViewState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lf43;Ljava/util/List;)V
    .locals 0

    invoke-super {p0, p1}, Le43;->j(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic z(Lf43;Ljava/util/List;)V
    .locals 0

    invoke-super {p0, p1}, Le43;->h(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public a()Lio/reactivex/c;
    .locals 1

    new-instance v0, Lf43$g;

    invoke-direct {v0, p0}, Lf43$g;-><init>(Lf43;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/util/List;)Ljava/util/List;
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

    const-string v1, "SELECT `id` from nest_markers WHERE rowid in ("

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
    iget-object p1, p0, Lf43;->a:LEb5;

    invoke-virtual {p1}, LEb5;->b()V

    iget-object p1, p0, Lf43;->a:LEb5;

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

.method public varargs c([Lco/bird/android/model/persistence/NestMarker;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lco/bird/android/model/persistence/NestMarker;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lf43;->a:LEb5;

    invoke-virtual {v0}, LEb5;->b()V

    iget-object v0, p0, Lf43;->a:LEb5;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    iget-object v0, p0, Lf43;->c:Lcf1;

    invoke-virtual {v0, p1}, Lcf1;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lf43;->a:LEb5;

    invoke-virtual {v0}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lf43;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lf43;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    throw p1
.end method

.method public d()Lio/reactivex/k;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/k<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/NestMarker;",
            ">;>;"
        }
    .end annotation

    const-string v0, "SELECT `nest_markers`.`id` AS `id`, `nest_markers`.`location` AS `location`, `nest_markers`.`capacity` AS `capacity`, `nest_markers`.`state` AS `state`, `nest_markers`.`icon` AS `icon`, `nest_markers`.`secondary_icon` AS `secondary_icon`, `nest_markers`.`secondary_icon_color` AS `secondary_icon_color`, `nest_markers`.`secondary_icon_background_color` AS `secondary_icon_background_color`, `nest_markers`.`prominence` AS `prominence`, `nest_markers`.`updated_at` AS `updated_at`, `nest_markers`.`available_space_details` AS `available_space_details` FROM nest_markers"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    iget-object v1, p0, Lf43;->a:LEb5;

    const-string v2, "nest_markers"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lf43$h;

    invoke-direct {v3, p0, v0}, Lf43$h;-><init>(Lf43;LHb5;)V

    const/4 v0, 0x1

    invoke-static {v1, v0, v2, v3}, LZe5;->a(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/k;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/NestMarker;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "SELECT `nest_markers`.`id` AS `id`, `nest_markers`.`location` AS `location`, `nest_markers`.`capacity` AS `capacity`, `nest_markers`.`state` AS `state`, `nest_markers`.`icon` AS `icon`, `nest_markers`.`secondary_icon` AS `secondary_icon`, `nest_markers`.`secondary_icon_color` AS `secondary_icon_color`, `nest_markers`.`secondary_icon_background_color` AS `secondary_icon_background_color`, `nest_markers`.`prominence` AS `prominence`, `nest_markers`.`updated_at` AS `updated_at`, `nest_markers`.`available_space_details` AS `available_space_details` FROM nest_markers"

    const/4 v2, 0x0

    invoke-static {v0, v2}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v3

    iget-object v0, v1, Lf43;->a:LEb5;

    invoke-virtual {v0}, LEb5;->b()V

    iget-object v0, v1, Lf43;->a:LEb5;

    const/4 v4, 0x0

    invoke-static {v0, v3, v2, v4}, LIF0;->c(LEb5;LpV5;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v5

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v5}, Landroid/database/Cursor;->getCount()I

    move-result v6

    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v5, v2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_0

    move-object v8, v4

    goto :goto_1

    :cond_0
    invoke-interface {v5, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    move-object v8, v6

    :goto_1
    const/4 v6, 0x1

    invoke-interface {v5, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_1

    move-object v6, v4

    goto :goto_2

    :cond_1
    invoke-interface {v5, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_2
    invoke-static {v6}, Lco/bird/android/persistence/common/impl/Converters;->d(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/Coordinate;

    move-result-object v9

    const/4 v6, 0x2

    invoke-interface {v5, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v10

    const/4 v6, 0x3

    invoke-interface {v5, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lf43;->x(Ljava/lang/String;)Lco/bird/android/model/constant/NestViewState;

    move-result-object v11

    const/4 v6, 0x4

    invoke-interface {v5, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lf43;->t(Ljava/lang/String;)Lco/bird/android/model/constant/NestIcon;

    move-result-object v12

    const/4 v6, 0x5

    invoke-interface {v5, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_2

    move-object v6, v4

    goto :goto_3

    :cond_2
    invoke-interface {v5, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_3
    invoke-static {v6}, Lco/bird/android/persistence/common/impl/Converters;->c(Ljava/lang/String;)Lco/bird/android/model/constant/ClientIcon;

    move-result-object v13

    const/4 v6, 0x6

    invoke-interface {v5, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_3

    move-object v6, v4

    goto :goto_4

    :cond_3
    invoke-interface {v5, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_4
    invoke-static {v6}, Lco/bird/android/persistence/common/impl/Converters;->r(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v14

    const/4 v6, 0x7

    invoke-interface {v5, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_4

    move-object v6, v4

    goto :goto_5

    :cond_4
    invoke-interface {v5, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_5
    invoke-static {v6}, Lco/bird/android/persistence/common/impl/Converters;->r(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v15

    const/16 v6, 0x8

    invoke-interface {v5, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lf43;->v(Ljava/lang/String;)Lco/bird/android/model/constant/NestProminence;

    move-result-object v16

    const/16 v6, 0x9

    invoke-interface {v5, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_5

    move-object v6, v4

    goto :goto_6

    :cond_5
    invoke-interface {v5, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_6
    invoke-static {v6}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v17

    const/16 v6, 0xa

    invoke-interface {v5, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_6

    move-object v6, v4

    goto :goto_7

    :cond_6
    invoke-interface {v5, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    :goto_7
    invoke-static {v6}, Ld43;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v18

    new-instance v6, Lco/bird/android/model/persistence/NestMarker;

    move-object v7, v6

    invoke-direct/range {v7 .. v18}, Lco/bird/android/model/persistence/NestMarker;-><init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/Coordinate;ILco/bird/android/model/constant/NestViewState;Lco/bird/android/model/constant/NestIcon;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/NestProminence;Lorg/joda/time/DateTime;Ljava/util/List;)V

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    :cond_7
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    invoke-virtual {v3}, LHb5;->release()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    invoke-virtual {v3}, LHb5;->release()V

    throw v0
.end method

.method public f(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/NestMarker;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lf43;->a:LEb5;

    invoke-virtual {v0}, LEb5;->b()V

    iget-object v0, p0, Lf43;->a:LEb5;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    iget-object v0, p0, Lf43;->d:Lbf1;

    invoke-virtual {v0, p1}, Lbf1;->k(Ljava/lang/Iterable;)I

    iget-object p1, p0, Lf43;->a:LEb5;

    invoke-virtual {p1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lf43;->a:LEb5;

    invoke-virtual {p1}, LEb5;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lf43;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    throw p1
.end method

.method public g(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lf43;->a:LEb5;

    invoke-virtual {v0}, LEb5;->b()V

    invoke-static {}, LiS5;->b()Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "DELETE FROM nest_markers WHERE id NOT in ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v0, v1}, LiS5;->a(Ljava/lang/StringBuilder;I)V

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lf43;->a:LEb5;

    invoke-virtual {v1, v0}, LEb5;->d(Ljava/lang/String;)LqV5;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_0

    invoke-interface {v0, v1}, LoV5;->m1(I)V

    goto :goto_1

    :cond_0
    invoke-interface {v0, v1, v2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lf43;->a:LEb5;

    invoke-virtual {p1}, LEb5;->c()V

    :try_start_0
    invoke-interface {v0}, LqV5;->M()I

    iget-object p1, p0, Lf43;->a:LEb5;

    invoke-virtual {p1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lf43;->a:LEb5;

    invoke-virtual {p1}, LEb5;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lf43;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    throw p1
.end method

.method public h(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lf43;->a:LEb5;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    invoke-static {p0, p1}, Lf43;->z(Lf43;Ljava/util/List;)V

    iget-object p1, p0, Lf43;->a:LEb5;

    invoke-virtual {p1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lf43;->a:LEb5;

    invoke-virtual {p1}, LEb5;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lf43;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    throw p1
.end method

.method public varargs i([Lco/bird/android/model/persistence/NestMarker;)V
    .locals 1

    iget-object v0, p0, Lf43;->a:LEb5;

    invoke-virtual {v0}, LEb5;->b()V

    iget-object v0, p0, Lf43;->a:LEb5;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    iget-object v0, p0, Lf43;->e:Lbf1;

    invoke-virtual {v0, p1}, Lbf1;->l([Ljava/lang/Object;)I

    iget-object p1, p0, Lf43;->a:LEb5;

    invoke-virtual {p1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lf43;->a:LEb5;

    invoke-virtual {p1}, LEb5;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lf43;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    throw p1
.end method

.method public j(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/NestMarker;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lf43;->a:LEb5;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    invoke-static {p0, p1}, Lf43;->y(Lf43;Ljava/util/List;)V

    iget-object p1, p0, Lf43;->a:LEb5;

    invoke-virtual {p1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lf43;->a:LEb5;

    invoke-virtual {p1}, LEb5;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lf43;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    throw p1
.end method

.method public final s(Lco/bird/android/model/constant/NestIcon;)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object v0, Lf43$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t convert enum to string, unknown enum value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const-string p1, "UNKNOWN"

    return-object p1

    :pswitch_1
    const-string p1, "TRIAL"

    return-object p1

    :pswitch_2
    const-string p1, "SILVER_STAR"

    return-object p1

    :pswitch_3
    const-string p1, "SILVER_HEART"

    return-object p1

    :pswitch_4
    const-string p1, "REBALANCE"

    return-object p1

    :pswitch_5
    const-string p1, "LOCK"

    return-object p1

    :pswitch_6
    const-string p1, "HEART"

    return-object p1

    :pswitch_7
    const-string p1, "GOLD_STAR"

    return-object p1

    :pswitch_8
    const-string p1, "GOLD_HEART"

    return-object p1

    :pswitch_9
    const-string p1, "FLAG"

    return-object p1

    :pswitch_a
    const-string p1, "EMPTY_SQUARE"

    return-object p1

    :pswitch_b
    const-string p1, "BLUE_STAR"

    return-object p1

    :pswitch_c
    const-string p1, "BLUE_HEART"

    return-object p1

    :pswitch_d
    const-string p1, "BIKE"

    return-object p1

    :pswitch_e
    const-string p1, "BIRD"

    return-object p1

    :pswitch_f
    const-string p1, "AVAILABLE"

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final t(Ljava/lang/String;)Lco/bird/android/model/constant/NestIcon;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "AVAILABLE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v1, 0xf

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "BLUE_HEART"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v1, 0xe

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "GOLD_STAR"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v1, 0xd

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "EMPTY_SQUARE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v1, 0xc

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "BLUE_STAR"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v1, 0xb

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "UNKNOWN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v1, 0xa

    goto/16 :goto_0

    :sswitch_6
    const-string v0, "GOLD_HEART"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v1, 0x9

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "TRIAL"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v1, 0x8

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "HEART"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    const/4 v1, 0x7

    goto :goto_0

    :sswitch_9
    const-string v0, "LOCK"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_0

    :cond_a
    const/4 v1, 0x6

    goto :goto_0

    :sswitch_a
    const-string v0, "FLAG"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_0

    :cond_b
    const/4 v1, 0x5

    goto :goto_0

    :sswitch_b
    const-string v0, "BIRD"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_0

    :cond_c
    const/4 v1, 0x4

    goto :goto_0

    :sswitch_c
    const-string v0, "BIKE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_0

    :cond_d
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_d
    const-string v0, "SILVER_HEART"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_0

    :cond_e
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_e
    const-string v0, "SILVER_STAR"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_0

    :cond_f
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_f
    const-string v0, "REBALANCE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_0

    :cond_10
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t convert value to enum, unknown value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object p1, Lco/bird/android/model/constant/NestIcon;->AVAILABLE:Lco/bird/android/model/constant/NestIcon;

    return-object p1

    :pswitch_1
    sget-object p1, Lco/bird/android/model/constant/NestIcon;->BLUE_HEART:Lco/bird/android/model/constant/NestIcon;

    return-object p1

    :pswitch_2
    sget-object p1, Lco/bird/android/model/constant/NestIcon;->GOLD_STAR:Lco/bird/android/model/constant/NestIcon;

    return-object p1

    :pswitch_3
    sget-object p1, Lco/bird/android/model/constant/NestIcon;->EMPTY_SQUARE:Lco/bird/android/model/constant/NestIcon;

    return-object p1

    :pswitch_4
    sget-object p1, Lco/bird/android/model/constant/NestIcon;->BLUE_STAR:Lco/bird/android/model/constant/NestIcon;

    return-object p1

    :pswitch_5
    sget-object p1, Lco/bird/android/model/constant/NestIcon;->UNKNOWN:Lco/bird/android/model/constant/NestIcon;

    return-object p1

    :pswitch_6
    sget-object p1, Lco/bird/android/model/constant/NestIcon;->GOLD_HEART:Lco/bird/android/model/constant/NestIcon;

    return-object p1

    :pswitch_7
    sget-object p1, Lco/bird/android/model/constant/NestIcon;->TRIAL:Lco/bird/android/model/constant/NestIcon;

    return-object p1

    :pswitch_8
    sget-object p1, Lco/bird/android/model/constant/NestIcon;->HEART:Lco/bird/android/model/constant/NestIcon;

    return-object p1

    :pswitch_9
    sget-object p1, Lco/bird/android/model/constant/NestIcon;->LOCK:Lco/bird/android/model/constant/NestIcon;

    return-object p1

    :pswitch_a
    sget-object p1, Lco/bird/android/model/constant/NestIcon;->FLAG:Lco/bird/android/model/constant/NestIcon;

    return-object p1

    :pswitch_b
    sget-object p1, Lco/bird/android/model/constant/NestIcon;->BIRD:Lco/bird/android/model/constant/NestIcon;

    return-object p1

    :pswitch_c
    sget-object p1, Lco/bird/android/model/constant/NestIcon;->BIKE:Lco/bird/android/model/constant/NestIcon;

    return-object p1

    :pswitch_d
    sget-object p1, Lco/bird/android/model/constant/NestIcon;->SILVER_HEART:Lco/bird/android/model/constant/NestIcon;

    return-object p1

    :pswitch_e
    sget-object p1, Lco/bird/android/model/constant/NestIcon;->SILVER_STAR:Lco/bird/android/model/constant/NestIcon;

    return-object p1

    :pswitch_f
    sget-object p1, Lco/bird/android/model/constant/NestIcon;->REBALANCE:Lco/bird/android/model/constant/NestIcon;

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6bcf5ed7 -> :sswitch_f
        -0x5395afbc -> :sswitch_e
        -0x1fc21b8c -> :sswitch_d
        0x1f1be1 -> :sswitch_c
        0x1f1cb9 -> :sswitch_b
        0x20f76c -> :sswitch_a
        0x23bd2b -> :sswitch_9
        0x416f826 -> :sswitch_8
        0x4c616f6 -> :sswitch_7
        0xbb10b87 -> :sswitch_6
        0x19d1382a -> :sswitch_5
        0x1c0fb717 -> :sswitch_4
        0x2a0b006f -> :sswitch_3
        0x5b3c7ad1 -> :sswitch_2
        0x65455801 -> :sswitch_1
        0x7a599aa9 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final u(Lco/bird/android/model/constant/NestProminence;)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object v0, Lf43$a;->c:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    const-string p1, "MINIMIZED"

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t convert enum to string, unknown enum value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const-string p1, "FULL"

    return-object p1
.end method

.method public final v(Ljava/lang/String;)Lco/bird/android/model/constant/NestProminence;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, "MINIMIZED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "FULL"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lco/bird/android/model/constant/NestProminence;->FULL:Lco/bird/android/model/constant/NestProminence;

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t convert value to enum, unknown value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-object p1, Lco/bird/android/model/constant/NestProminence;->MINIMIZED:Lco/bird/android/model/constant/NestProminence;

    return-object p1
.end method

.method public final w(Lco/bird/android/model/constant/NestViewState;)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object v0, Lf43$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    const-string p1, "UNKNOWN"

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t convert enum to string, unknown enum value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const-string p1, "RECOMMENDED"

    return-object p1

    :cond_3
    const-string p1, "LOCKED"

    return-object p1

    :cond_4
    const-string p1, "FLAGGED"

    return-object p1
.end method

.method public final x(Ljava/lang/String;)Lco/bird/android/model/constant/NestViewState;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "UNKNOWN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_1
    const-string v0, "FLAGGED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_2
    const-string v0, "RECOMMENDED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_3
    const-string v0, "LOCKED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can\'t convert value to enum, unknown value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object p1, Lco/bird/android/model/constant/NestViewState;->UNKNOWN:Lco/bird/android/model/constant/NestViewState;

    return-object p1

    :pswitch_1
    sget-object p1, Lco/bird/android/model/constant/NestViewState;->FLAGGED:Lco/bird/android/model/constant/NestViewState;

    return-object p1

    :pswitch_2
    sget-object p1, Lco/bird/android/model/constant/NestViewState;->RECOMMENDED:Lco/bird/android/model/constant/NestViewState;

    return-object p1

    :pswitch_3
    sget-object p1, Lco/bird/android/model/constant/NestViewState;->LOCKED:Lco/bird/android/model/constant/NestViewState;

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x79d6d8f6 -> :sswitch_3
        -0x29f78dc5 -> :sswitch_2
        -0x3a62bc6 -> :sswitch_1
        0x19d1382a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
