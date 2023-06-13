.class public LLy6$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLy6;->c(Ljava/lang/String;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:LHb5;

.field public final synthetic c:LLy6;


# direct methods
.method public constructor <init>(LLy6;LHb5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LLy6$e;->c:LLy6;

    iput-object p2, p0, LLy6$e;->b:LHb5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, LLy6$e;->c:LLy6;

    invoke-static {v0}, LLy6;->d(LLy6;)LEb5;

    move-result-object v0

    iget-object v1, p0, LLy6$e;->b:LHb5;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, LIF0;->c(LEb5;LpV5;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v0

    :try_start_0
    const-string v1, "warehouse_id"

    invoke-static {v0, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    const-string v2, "summary"

    invoke-static {v0, v2}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v2

    const-string v4, "status"

    invoke-static {v0, v4}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    const-string v5, "warehouse_details"

    invoke-static {v0, v5}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "vehicle_details"

    invoke-static {v0, v6}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v0, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_0

    move-object v8, v3

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object v8, v1

    :goto_0
    invoke-interface {v0, v2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v1, v3

    goto :goto_1

    :cond_1
    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-static {v1}, LJy6;->g(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;

    move-result-object v9

    invoke-interface {v0, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v1, v3

    goto :goto_2

    :cond_2
    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_2
    invoke-static {v1}, LJy6;->f(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;

    move-result-object v10

    invoke-interface {v0, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_3

    move-object v1, v3

    goto :goto_3

    :cond_3
    invoke-interface {v0, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_3
    invoke-static {v1}, LJy6;->e(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;

    move-result-object v11

    invoke-interface {v0, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-interface {v0, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    :goto_4
    invoke-static {v3}, LJy6;->h(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;

    move-result-object v12

    new-instance v3, Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;

    move-object v7, v3

    invoke-direct/range {v7 .. v12}, Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;-><init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-object v3

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    throw v1
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, LLy6$e;->a()Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;

    move-result-object v0

    return-object v0
.end method

.method public finalize()V
    .locals 1

    iget-object v0, p0, LLy6$e;->b:LHb5;

    invoke-virtual {v0}, LHb5;->release()V

    return-void
.end method
