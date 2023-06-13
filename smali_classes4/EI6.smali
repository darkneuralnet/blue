.class public final LEI6;
.super LCI6;
.source "SourceFile"


# instance fields
.field public final a:LEb5;

.field public final b:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/ZoneData;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcf1<",
            "Lco/bird/android/model/persistence/ZoneRegion;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lbf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbf1<",
            "Lco/bird/android/model/persistence/ZoneData;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lbf1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbf1<",
            "Lco/bird/android/model/persistence/ZoneRegion;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lgz5;

.field public final g:Lgz5;

.field public final h:Lgz5;


# direct methods
.method public constructor <init>(LEb5;)V
    .locals 1

    invoke-direct {p0}, LCI6;-><init>()V

    iput-object p1, p0, LEI6;->a:LEb5;

    new-instance v0, LEI6$h;

    invoke-direct {v0, p0, p1}, LEI6$h;-><init>(LEI6;LEb5;)V

    iput-object v0, p0, LEI6;->b:Lcf1;

    new-instance v0, LEI6$i;

    invoke-direct {v0, p0, p1}, LEI6$i;-><init>(LEI6;LEb5;)V

    iput-object v0, p0, LEI6;->c:Lcf1;

    new-instance v0, LEI6$j;

    invoke-direct {v0, p0, p1}, LEI6$j;-><init>(LEI6;LEb5;)V

    iput-object v0, p0, LEI6;->d:Lbf1;

    new-instance v0, LEI6$k;

    invoke-direct {v0, p0, p1}, LEI6$k;-><init>(LEI6;LEb5;)V

    iput-object v0, p0, LEI6;->e:Lbf1;

    new-instance v0, LEI6$l;

    invoke-direct {v0, p0, p1}, LEI6$l;-><init>(LEI6;LEb5;)V

    iput-object v0, p0, LEI6;->f:Lgz5;

    new-instance v0, LEI6$m;

    invoke-direct {v0, p0, p1}, LEI6$m;-><init>(LEI6;LEb5;)V

    iput-object v0, p0, LEI6;->g:Lgz5;

    new-instance v0, LEI6$n;

    invoke-direct {v0, p0, p1}, LEI6$n;-><init>(LEI6;LEb5;)V

    iput-object v0, p0, LEI6;->h:Lgz5;

    return-void
.end method

.method public static synthetic B(LEI6;[Lco/bird/android/model/persistence/ZoneData;)V
    .locals 0

    invoke-super {p0, p1}, LCI6;->m([Lco/bird/android/model/persistence/ZoneData;)V

    return-void
.end method

.method public static synthetic C(LEI6;[Lco/bird/android/model/persistence/ZoneRegion;)V
    .locals 0

    invoke-super {p0, p1}, LCI6;->n([Lco/bird/android/model/persistence/ZoneRegion;)V

    return-void
.end method

.method public static synthetic D(LEI6;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-super {p0, p1, p2}, LCI6;->j(Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static E()Ljava/util/List;
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

.method public static bridge synthetic t(LEI6;)LEb5;
    .locals 0

    iget-object p0, p0, LEI6;->a:LEb5;

    return-object p0
.end method

.method public static bridge synthetic u(LEI6;)Lgz5;
    .locals 0

    iget-object p0, p0, LEI6;->g:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic v(LEI6;)Lgz5;
    .locals 0

    iget-object p0, p0, LEI6;->h:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic w(LEI6;)Lgz5;
    .locals 0

    iget-object p0, p0, LEI6;->f:Lgz5;

    return-object p0
.end method

.method public static bridge synthetic x(LEI6;Lco/bird/android/model/constant/OperatorMapZoneSelectability;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, LEI6;->z(Lco/bird/android/model/constant/OperatorMapZoneSelectability;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic y(LEI6;Ljava/lang/String;)Lco/bird/android/model/constant/OperatorMapZoneSelectability;
    .locals 0

    invoke-virtual {p0, p1}, LEI6;->A(Ljava/lang/String;)Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A(Ljava/lang/String;)Lco/bird/android/model/constant/OperatorMapZoneSelectability;
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
    const-string v0, "SELECTABLE_OVERLAY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_1
    const-string v0, "UNKNOWN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_2
    const-string v0, "NOT_SELECTABLE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_3
    const-string v0, "SELECTABLE_ANNOTATION"

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
    sget-object p1, Lco/bird/android/model/constant/OperatorMapZoneSelectability;->SELECTABLE_OVERLAY:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    return-object p1

    :pswitch_1
    sget-object p1, Lco/bird/android/model/constant/OperatorMapZoneSelectability;->UNKNOWN:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    return-object p1

    :pswitch_2
    sget-object p1, Lco/bird/android/model/constant/OperatorMapZoneSelectability;->NOT_SELECTABLE:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    return-object p1

    :pswitch_3
    sget-object p1, Lco/bird/android/model/constant/OperatorMapZoneSelectability;->SELECTABLE_ANNOTATION:Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x62cd1d48 -> :sswitch_3
        -0x12991e9e -> :sswitch_2
        0x19d1382a -> :sswitch_1
        0x52309947 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public a()Lio/reactivex/c;
    .locals 1

    new-instance v0, LEI6$p;

    invoke-direct {v0, p0}, LEI6$p;-><init>(LEI6;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public b()Lio/reactivex/c;
    .locals 1

    new-instance v0, LEI6$a;

    invoke-direct {v0, p0}, LEI6$a;-><init>(LEI6;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/persistence/ZoneOverlayAnalytics;",
            ">;"
        }
    .end annotation

    const-string v0, "\n    SELECT regions.zone_id, regions.region, data.overlay, data.selectability \n    FROM zone_regions regions \n    INNER JOIN zone_data data ON regions.zone_id = data.zone_id \n    WHERE data.overlay IS NOT NULL \n        AND data.selectability IS NOT NULL\n        AND data.zone_id = ?\n  "

    const/4 v1, 0x1

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, LHb5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, LHb5;->G0(ILjava/lang/String;)V

    :goto_0
    new-instance p1, LEI6$e;

    invoke-direct {p1, p0, v0}, LEI6$e;-><init>(LEI6;LHb5;)V

    invoke-static {p1}, LZe5;->e(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public varargs d([Lco/bird/android/model/persistence/ZoneData;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lco/bird/android/model/persistence/ZoneData;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->b()V

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    iget-object v0, p0, LEI6;->b:Lcf1;

    invoke-virtual {v0, p1}, Lcf1;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    throw p1
.end method

.method public varargs e([Lco/bird/android/model/persistence/ZoneRegion;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lco/bird/android/model/persistence/ZoneRegion;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->b()V

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    iget-object v0, p0, LEI6;->c:Lcf1;

    invoke-virtual {v0, p1}, Lcf1;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    throw p1
.end method

.method public varargs f([Ljava/lang/String;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/ZoneRegion;",
            ">;"
        }
    .end annotation

    invoke-static {}, LiS5;->b()Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "SELECT * FROM zone_regions WHERE zone_id NOT IN ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v1, p1

    invoke-static {v0, v1}, LiS5;->a(Ljava/lang/StringBuilder;I)V

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    add-int/2addr v1, v2

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    array-length v1, p1

    const/4 v3, 0x1

    move v4, v2

    :goto_0
    if-ge v4, v1, :cond_1

    aget-object v5, p1, v4

    if-nez v5, :cond_0

    invoke-virtual {v0, v3}, LHb5;->m1(I)V

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v3, v5}, LHb5;->G0(ILjava/lang/String;)V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, LEI6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->b()V

    iget-object p1, p0, LEI6;->a:LEb5;

    const/4 v1, 0x0

    invoke-static {p1, v0, v2, v1}, LIF0;->c(LEb5;LpV5;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    const-string v2, "zone_id"

    invoke-static {p1, v2}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v2

    const-string v3, "region"

    invoke-static {p1, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    const-string v4, "center_point"

    invoke-static {p1, v4}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    const-string v5, "region_updated_at"

    invoke-static {p1, v5}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    :goto_2
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {p1, v2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_2

    move-object v7, v1

    goto :goto_3

    :cond_2
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    :goto_3
    invoke-interface {p1, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_3

    move-object v8, v1

    goto :goto_4

    :cond_3
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    :goto_4
    invoke-static {v8}, LBI6;->d(Ljava/lang/String;)Lco/bird/android/model/Polygon;

    move-result-object v8

    invoke-interface {p1, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_4

    move-object v9, v1

    goto :goto_5

    :cond_4
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    :goto_5
    invoke-static {v9}, Lco/bird/android/persistence/common/impl/Converters;->p(Ljava/lang/String;)Lco/bird/android/model/Point;

    move-result-object v9

    invoke-interface {p1, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v10

    if-eqz v10, :cond_5

    move-object v10, v1

    goto :goto_6

    :cond_5
    invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    :goto_6
    invoke-static {v10}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v10

    new-instance v11, Lco/bird/android/model/persistence/ZoneRegion;

    invoke-direct {v11, v7, v8, v9, v10}, Lco/bird/android/model/persistence/ZoneRegion;-><init>(Ljava/lang/String;Lco/bird/android/model/Polygon;Lco/bird/android/model/Point;Lorg/joda/time/DateTime;)V

    invoke-interface {v6, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_6
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, LHb5;->release()V

    return-object v6

    :catchall_0
    move-exception v1

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, LHb5;->release()V

    throw v1
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

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->b()V

    invoke-static {}, LiS5;->b()Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "DELETE FROM zone_data WHERE zone_id IN ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v0, v1}, LiS5;->a(Ljava/lang/StringBuilder;I)V

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LEI6;->a:LEb5;

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
    iget-object p1, p0, LEI6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->c()V

    :try_start_0
    invoke-interface {v0}, LqV5;->M()I

    iget-object p1, p0, LEI6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LEI6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    throw p1
.end method

.method public h(Ljava/util/List;Lorg/joda/time/DateTime;)Lio/reactivex/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lorg/joda/time/DateTime;",
            ")",
            "Lio/reactivex/c;"
        }
    .end annotation

    new-instance v0, LEI6$f;

    invoke-direct {v0, p0, p1, p2}, LEI6$f;-><init>(LEI6;Ljava/util/List;Lorg/joda/time/DateTime;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public i(Lorg/joda/time/DateTime;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LEI6$o;

    invoke-direct {v0, p0, p1}, LEI6$o;-><init>(LEI6;Lorg/joda/time/DateTime;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    invoke-static {p0, p1, p2}, LEI6;->D(LEI6;Ljava/util/List;Ljava/util/List;)V

    iget-object p1, p0, LEI6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LEI6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, LEI6;->a:LEb5;

    invoke-virtual {p2}, LEb5;->g()V

    throw p1
.end method

.method public varargs k([Lco/bird/android/model/persistence/ZoneData;)V
    .locals 1

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->b()V

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    iget-object v0, p0, LEI6;->d:Lbf1;

    invoke-virtual {v0, p1}, Lbf1;->l([Ljava/lang/Object;)I

    iget-object p1, p0, LEI6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LEI6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    throw p1
.end method

.method public varargs l([Lco/bird/android/model/persistence/ZoneRegion;)V
    .locals 1

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->b()V

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    iget-object v0, p0, LEI6;->e:Lbf1;

    invoke-virtual {v0, p1}, Lbf1;->l([Ljava/lang/Object;)I

    iget-object p1, p0, LEI6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LEI6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    throw p1
.end method

.method public varargs m([Lco/bird/android/model/persistence/ZoneData;)V
    .locals 1

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    invoke-static {p0, p1}, LEI6;->B(LEI6;[Lco/bird/android/model/persistence/ZoneData;)V

    iget-object p1, p0, LEI6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LEI6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    throw p1
.end method

.method public varargs n([Lco/bird/android/model/persistence/ZoneRegion;)V
    .locals 1

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    invoke-static {p0, p1}, LEI6;->C(LEI6;[Lco/bird/android/model/persistence/ZoneRegion;)V

    iget-object p1, p0, LEI6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, LEI6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, LEI6;->a:LEb5;

    invoke-virtual {v0}, LEb5;->g()V

    throw p1
.end method

.method public o(Ljava/util/List;)Ljava/util/List;
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

    const-string v1, "SELECT zone_id FROM zone_data WHERE rowid in ("

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
    iget-object p1, p0, LEI6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->b()V

    iget-object p1, p0, LEI6;->a:LEb5;

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

.method public p(Ljava/util/List;)Ljava/util/List;
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

    const-string v1, "SELECT zone_id FROM zone_regions WHERE rowid in ("

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
    iget-object p1, p0, LEI6;->a:LEb5;

    invoke-virtual {p1}, LEb5;->b()V

    iget-object p1, p0, LEI6;->a:LEb5;

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

.method public q()Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    const-string v0, "\n    SELECT data.zone_id \n    FROM zone_data data \n    LEFT JOIN zone_regions regions ON data.zone_id = regions.zone_id \n    WHERE regions.zone_id IS NULL\n  "

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    new-instance v1, LEI6$b;

    invoke-direct {v1, p0, v0}, LEI6$b;-><init>(LEI6;LHb5;)V

    invoke-static {v1}, LZe5;->e(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public r()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/ZoneMarker;",
            ">;>;"
        }
    .end annotation

    const-string v0, "\n    SELECT data.zone_id, regions.center_point, data.annotation, data.selectability \n    FROM zone_data data \n    INNER JOIN zone_regions regions ON data.zone_id = regions.zone_id \n    WHERE regions.center_point IS NOT NULL\n        AND data.annotation IS NOT NULL\n        AND data.selectability IS NOT NULL\n  "

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    iget-object v2, p0, LEI6;->a:LEb5;

    const-string v3, "zone_data"

    const-string v4, "zone_regions"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, LEI6$d;

    invoke-direct {v4, p0, v0}, LEI6$d;-><init>(LEI6;LHb5;)V

    invoke-static {v2, v1, v3, v4}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public s()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/ZonePolygonable;",
            ">;>;"
        }
    .end annotation

    const-string v0, "\n    SELECT regions.zone_id, regions.region, data.overlay, data.selectability \n    FROM zone_regions regions \n    INNER JOIN zone_data data ON regions.zone_id = data.zone_id \n    WHERE data.overlay IS NOT NULL \n        AND data.selectability IS NOT NULL\n  "

    const/4 v1, 0x0

    invoke-static {v0, v1}, LHb5;->c(Ljava/lang/String;I)LHb5;

    move-result-object v0

    iget-object v2, p0, LEI6;->a:LEb5;

    const-string v3, "zone_regions"

    const-string v4, "zone_data"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    new-instance v4, LEI6$c;

    invoke-direct {v4, p0, v0}, LEI6$c;-><init>(LEI6;LHb5;)V

    invoke-static {v2, v1, v3, v4}, LZe5;->c(LEb5;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final z(Lco/bird/android/model/constant/OperatorMapZoneSelectability;)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object v0, LEI6$g;->a:[I

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
    const-string p1, "SELECTABLE_OVERLAY"

    return-object p1

    :cond_3
    const-string p1, "SELECTABLE_ANNOTATION"

    return-object p1

    :cond_4
    const-string p1, "NOT_SELECTABLE"

    return-object p1
.end method
