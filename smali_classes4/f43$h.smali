.class public Lf43$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf43;->d()Lio/reactivex/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/util/List<",
        "Lco/bird/android/model/persistence/NestMarker;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LHb5;

.field public final synthetic c:Lf43;


# direct methods
.method public constructor <init>(Lf43;LHb5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lf43$h;->c:Lf43;

    iput-object p2, p0, Lf43$h;->b:LHb5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/NestMarker;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v1, p0

    iget-object v0, v1, Lf43$h;->c:Lf43;

    invoke-static {v0}, Lf43;->k(Lf43;)LEb5;

    move-result-object v0

    invoke-virtual {v0}, LEb5;->c()V

    :try_start_0
    iget-object v0, v1, Lf43$h;->c:Lf43;

    invoke-static {v0}, Lf43;->k(Lf43;)LEb5;

    move-result-object v0

    iget-object v2, v1, Lf43$h;->b:LHb5;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, LIF0;->c(LEb5;LpV5;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v5

    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v7, v4

    goto :goto_1

    :cond_0
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    move-object v7, v5

    :goto_1
    const/4 v5, 0x1

    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_1

    move-object v5, v4

    goto :goto_2

    :cond_1
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    :goto_2
    invoke-static {v5}, Lco/bird/android/persistence/common/impl/Converters;->d(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/Coordinate;

    move-result-object v8

    const/4 v5, 0x2

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v9

    iget-object v5, v1, Lf43$h;->c:Lf43;

    const/4 v6, 0x3

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lf43;->r(Lf43;Ljava/lang/String;)Lco/bird/android/model/constant/NestViewState;

    move-result-object v10

    iget-object v5, v1, Lf43$h;->c:Lf43;

    const/4 v6, 0x4

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lf43;->n(Lf43;Ljava/lang/String;)Lco/bird/android/model/constant/NestIcon;

    move-result-object v11

    const/4 v5, 0x5

    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_2

    move-object v5, v4

    goto :goto_3

    :cond_2
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    :goto_3
    invoke-static {v5}, Lco/bird/android/persistence/common/impl/Converters;->c(Ljava/lang/String;)Lco/bird/android/model/constant/ClientIcon;

    move-result-object v12

    const/4 v5, 0x6

    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_3

    move-object v5, v4

    goto :goto_4

    :cond_3
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    :goto_4
    invoke-static {v5}, Lco/bird/android/persistence/common/impl/Converters;->r(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v13

    const/4 v5, 0x7

    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_4

    move-object v5, v4

    goto :goto_5

    :cond_4
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    :goto_5
    invoke-static {v5}, Lco/bird/android/persistence/common/impl/Converters;->r(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v14

    iget-object v5, v1, Lf43$h;->c:Lf43;

    const/16 v6, 0x8

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lf43;->p(Lf43;Ljava/lang/String;)Lco/bird/android/model/constant/NestProminence;

    move-result-object v15

    const/16 v5, 0x9

    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_5

    move-object v5, v4

    goto :goto_6

    :cond_5
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    :goto_6
    invoke-static {v5}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v16

    const/16 v5, 0xa

    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-eqz v6, :cond_6

    move-object v5, v4

    goto :goto_7

    :cond_6
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    :goto_7
    invoke-static {v5}, Ld43;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v17

    new-instance v5, Lco/bird/android/model/persistence/NestMarker;

    move-object v6, v5

    invoke-direct/range {v6 .. v17}, Lco/bird/android/model/persistence/NestMarker;-><init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/Coordinate;ILco/bird/android/model/constant/NestViewState;Lco/bird/android/model/constant/NestIcon;Lco/bird/android/model/constant/ClientIcon;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;Lco/bird/android/model/constant/NestProminence;Lorg/joda/time/DateTime;Ljava/util/List;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_7
    iget-object v3, v1, Lf43$h;->c:Lf43;

    invoke-static {v3}, Lf43;->k(Lf43;)LEb5;

    move-result-object v3

    invoke-virtual {v3}, LEb5;->A()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v2, v1, Lf43$h;->c:Lf43;

    invoke-static {v2}, Lf43;->k(Lf43;)LEb5;

    move-result-object v2

    invoke-virtual {v2}, LEb5;->g()V

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    iget-object v2, v1, Lf43$h;->c:Lf43;

    invoke-static {v2}, Lf43;->k(Lf43;)LEb5;

    move-result-object v2

    invoke-virtual {v2}, LEb5;->g()V

    throw v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lf43$h;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public finalize()V
    .locals 1

    iget-object v0, p0, Lf43$h;->b:LHb5;

    invoke-virtual {v0}, LHb5;->release()V

    return-void
.end method
