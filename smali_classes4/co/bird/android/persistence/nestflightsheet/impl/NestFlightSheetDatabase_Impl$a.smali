.class public Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl$a;
.super LGb5$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;->f(LfT0;)LnV5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;


# direct methods
.method public constructor <init>(Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;I)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;

    invoke-direct {p0, p2}, LGb5$b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(LmV5;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `nest_flight_sheet` (`nest_id` TEXT NOT NULL, `nest_summary` TEXT NOT NULL, `nest_birdle` TEXT, `nest_status` TEXT, `nest_images` TEXT, `nest_capacity` TEXT, `nest_details` TEXT, `vehicle_details` TEXT, `nest_buttons` TEXT, `claim_details` TEXT, `nest_allowed_vehicles` TEXT, `new_claim_error_message` TEXT, PRIMARY KEY(`nest_id`))"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'38bbde647df61c552c1d861d1e18822a\')"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    return-void
.end method

.method public b(LmV5;)V
    .locals 3

    const-string v0, "DROP TABLE IF EXISTS `nest_flight_sheet`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;->D(Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;->E(Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;->G(Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;)Ljava/util/List;

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

    iget-object v0, p0, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;->H(Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;->I(Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;->J(Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;)Ljava/util/List;

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

    iget-object v0, p0, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;

    invoke-static {v0, p1}, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;->K(Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;LmV5;)LmV5;

    iget-object v0, p0, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;

    invoke-static {v0, p1}, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;->L(Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;LmV5;)V

    iget-object v0, p0, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;->M(Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;->N(Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl$a;->b:Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;->F(Lco/bird/android/persistence/nestflightsheet/impl/NestFlightSheetDatabase_Impl;)Ljava/util/List;

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

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, LtY5$a;

    const-string v3, "nest_id"

    const-string v4, "TEXT"

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "nest_id"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "nest_summary"

    const-string v5, "TEXT"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "nest_summary"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "nest_birdle"

    const-string v5, "TEXT"

    const/4 v6, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "nest_birdle"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "nest_status"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "nest_status"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "nest_images"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "nest_images"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "nest_capacity"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "nest_capacity"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "nest_details"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "nest_details"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "vehicle_details"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "vehicle_details"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "nest_buttons"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "nest_buttons"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "claim_details"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "claim_details"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "nest_allowed_vehicles"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "nest_allowed_vehicles"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "new_claim_error_message"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "new_claim_error_message"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/util/HashSet;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v2}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, LtY5;

    const-string v5, "nest_flight_sheet"

    invoke-direct {v4, v5, v0, v1, v3}, LtY5;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {p1, v5}, LtY5;->a(LmV5;Ljava/lang/String;)LtY5;

    move-result-object p1

    invoke-virtual {v4, p1}, LtY5;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, LGb5$c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "nest_flight_sheet(co.bird.android.model.persistence.NestFlightSheetDetails).\n Expected:\n"

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
