.class public Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl$a;
.super LGb5$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;->f(LfT0;)LnV5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;


# direct methods
.method public constructor <init>(Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;I)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;

    invoke-direct {p0, p2}, LGb5$b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(LmV5;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `warehouse_flight_sheets` (`warehouse_id` TEXT NOT NULL, `summary` TEXT, `status` TEXT, `warehouse_details` TEXT, `vehicle_details` TEXT, PRIMARY KEY(`warehouse_id`))"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'9731585fd47815149c7bdd2ed09cef1f\')"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    return-void
.end method

.method public b(LmV5;)V
    .locals 3

    const-string v0, "DROP TABLE IF EXISTS `warehouse_flight_sheets`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;->D(Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;->E(Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;->G(Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LEb5$b;

    invoke-virtual {v2, p1}, LEb5$b;->b(LmV5;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(LmV5;)V
    .locals 3

    iget-object v0, p0, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;->H(Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;->I(Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;->J(Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LEb5$b;

    invoke-virtual {v2, p1}, LEb5$b;->a(LmV5;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public d(LmV5;)V
    .locals 3

    iget-object v0, p0, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;

    invoke-static {v0, p1}, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;->K(Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;LmV5;)LmV5;

    iget-object v0, p0, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;

    invoke-static {v0, p1}, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;->L(Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;LmV5;)V

    iget-object v0, p0, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;->M(Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;->N(Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;->F(Lco/bird/android/persistence/warehouseflightsheet/impl/WarehouseFlightSheetDatabase_Impl;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LEb5$b;

    invoke-virtual {v2, p1}, LEb5$b;->c(LmV5;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e(LmV5;)V
    .locals 0

    return-void
.end method

.method public f(LmV5;)V
    .locals 0

    invoke-static {p1}, LIF0;->b(LmV5;)V

    return-void
.end method

.method public g(LmV5;)LGb5$c;
    .locals 10

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, LtY5$a;

    const-string v3, "warehouse_id"

    const-string v4, "TEXT"

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "warehouse_id"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "summary"

    const-string v5, "TEXT"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "summary"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "status"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "status"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "warehouse_details"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "warehouse_details"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "vehicle_details"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "vehicle_details"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/util/HashSet;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v2}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, LtY5;

    const-string v5, "warehouse_flight_sheets"

    invoke-direct {v4, v5, v0, v1, v3}, LtY5;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {p1, v5}, LtY5;->a(LmV5;Ljava/lang/String;)LtY5;

    move-result-object p1

    invoke-virtual {v4, p1}, LtY5;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, LGb5$c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "warehouse_flight_sheets(co.bird.android.model.persistence.WarehouseFlightSheetDetails).\n Expected:\n"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "\n Found:\n"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v2, p1}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_0
    new-instance p1, LGb5$c;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object p1
.end method
