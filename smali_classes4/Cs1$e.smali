.class public LCs1$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCs1;->b(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lco/bird/android/model/persistence/FlightSheetDetails;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:LHb5;

.field public final synthetic c:LCs1;


# direct methods
.method public constructor <init>(LCs1;LHb5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LCs1$e;->c:LCs1;

    iput-object p2, p0, LCs1$e;->b:LHb5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lco/bird/android/model/persistence/FlightSheetDetails;
    .locals 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v1, p0

    iget-object v0, v1, LCs1$e;->c:LCs1;

    invoke-static {v0}, LCs1;->d(LCs1;)LEb5;

    move-result-object v0

    iget-object v2, v1, LCs1$e;->b:LHb5;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, LIF0;->c(LEb5;LpV5;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    const-string v0, "vehicle_id"

    invoke-static {v2, v0}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v3, "context"

    invoke-static {v2, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    const-string v5, "banner"

    invoke-static {v2, v5}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "vehicle_summary"

    invoke-static {v2, v6}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "commands"

    invoke-static {v2, v7}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "action_sections"

    invoke-static {v2, v8}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "info_sections"

    invoke-static {v2, v9}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "ride_history"

    invoke-static {v2, v10}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    const-string v11, "task_order_info"

    invoke-static {v2, v11}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    const-string v12, "ride_ratings"

    invoke-static {v2, v12}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v12

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v13

    if-eqz v13, :cond_a

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v13

    if-eqz v13, :cond_0

    move-object v14, v4

    goto :goto_0

    :cond_0
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object v14, v0

    :goto_0
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, v4

    goto :goto_1

    :cond_1
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lys1;->g(Ljava/lang/String;)Lco/bird/android/model/constant/FlightSheetContext;

    move-result-object v15

    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v0, v4

    goto :goto_2

    :cond_2
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Lys1;->e(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;

    move-result-object v16

    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_3

    move-object v0, v4

    goto :goto_3

    :cond_3
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-static {v0}, Lys1;->l(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;

    move-result-object v17

    invoke-interface {v2, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_4

    move-object v0, v4

    goto :goto_4

    :cond_4
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_4
    invoke-static {v0}, Lys1;->f(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;

    move-result-object v18

    invoke-interface {v2, v8}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_5

    move-object v0, v4

    goto :goto_5

    :cond_5
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_5
    invoke-static {v0}, Lys1;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v19

    invoke-interface {v2, v9}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_6

    move-object v0, v4

    goto :goto_6

    :cond_6
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_6
    invoke-static {v0}, Lys1;->i(Ljava/lang/String;)Ljava/util/List;

    move-result-object v20

    invoke-interface {v2, v10}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_7

    move-object v0, v4

    goto :goto_7

    :cond_7
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_7
    invoke-static {v0}, Lys1;->j(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;

    move-result-object v21

    invoke-interface {v2, v11}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_8

    move-object v0, v4

    goto :goto_8

    :cond_8
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_8
    invoke-static {v0}, Lys1;->t(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;

    move-result-object v22

    invoke-interface {v2, v12}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_9

    :cond_9
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    :goto_9
    invoke-static {v4}, Lys1;->k(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;

    move-result-object v23

    new-instance v4, Lco/bird/android/model/persistence/FlightSheetDetails;

    move-object v13, v4

    invoke-direct/range {v13 .. v23}, Lco/bird/android/model/persistence/FlightSheetDetails;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/FlightSheetContext;Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_a
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    return-object v4

    :catchall_0
    move-exception v0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    throw v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, LCs1$e;->a()Lco/bird/android/model/persistence/FlightSheetDetails;

    move-result-object v0

    return-object v0
.end method

.method public finalize()V
    .locals 1

    iget-object v0, p0, LCs1$e;->b:LHb5;

    invoke-virtual {v0}, LHb5;->release()V

    return-void
.end method