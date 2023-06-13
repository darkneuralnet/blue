.class public Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl$a;
.super LGb5$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->f(LfT0;)LnV5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;


# direct methods
.method public constructor <init>(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;I)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl$a;->b:Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;

    invoke-direct {p0, p2}, LGb5$b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(LmV5;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `bird` (`id` TEXT NOT NULL, `model` TEXT, `task_id` TEXT, `battery_level` INTEGER NOT NULL, `estimated_range` INTEGER, `distance` INTEGER NOT NULL, `location` TEXT NOT NULL, `code` TEXT NOT NULL, `sticker_id` TEXT, `serial_number` TEXT NOT NULL, `disconnected` INTEGER NOT NULL, `accident` INTEGER NOT NULL, `submerged` INTEGER NOT NULL, `lost` INTEGER NOT NULL, `locked` INTEGER NOT NULL, `ack_locked` INTEGER NOT NULL, `captive` INTEGER NOT NULL, `gps_fix` INTEGER NOT NULL, `broken` INTEGER NOT NULL, `label` TEXT NOT NULL, `actions` TEXT NOT NULL, `bounty_id` TEXT, `bounty_price` INTEGER, `bounty_currency` TEXT NOT NULL, `bounty_lost` INTEGER NOT NULL, `bounty_overdue` INTEGER NOT NULL, `bounty_kind` TEXT NOT NULL, `brand_name` TEXT, `task_kind` TEXT NOT NULL, `gps_at` TEXT, `tracked_at` TEXT, `token` TEXT, `bluetooth` INTEGER NOT NULL, `cellular` INTEGER NOT NULL, `started_at` TEXT, `due_at` TEXT, `asleep` INTEGER NOT NULL, `imei` TEXT, `board_protocol` TEXT, `physical_lock` TEXT, `physical_locks` TEXT, `priority_collect` INTEGER NOT NULL, `down` INTEGER NOT NULL, `needs_inspection` INTEGER NOT NULL, `partner_id` TEXT, `nest_id` TEXT, `last_ride_ended_at` TEXT, `partner_bird_state` TEXT, `peril` INTEGER NOT NULL, `deliverable` INTEGER NOT NULL, `lifecycle` TEXT NOT NULL, `offline` INTEGER NOT NULL, `license` TEXT, `area_key` TEXT, `nest_purpose` TEXT, `private_bird` TEXT, `scanned_at` TEXT, `badge_type` TEXT NOT NULL, `bounty_reasons` TEXT NOT NULL, `ephemeral_id` TEXT, `ble_mac_address` TEXT, `has_helmet` INTEGER, `location_updated_at` TEXT, PRIMARY KEY(`id`))"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `bird_map_markers` (`id` TEXT NOT NULL, `battery_level` INTEGER NOT NULL, `location` TEXT NOT NULL, `code` TEXT NOT NULL, `fleet_marker` TEXT NOT NULL, `filter_hash` TEXT NOT NULL, `updated_at` TEXT NOT NULL, PRIMARY KEY(`id`))"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `bulk_scan_purpose_bird` (`bird_id` TEXT NOT NULL, `purpose` TEXT NOT NULL, PRIMARY KEY(`bird_id`, `purpose`), FOREIGN KEY(`bird_id`) REFERENCES `bird`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_bulk_scan_purpose_bird_by_purpose` ON `bulk_scan_purpose_bird` (`purpose`)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'e99b26f117bbff9b672a4a1d58cce5de\')"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    return-void
.end method

.method public b(LmV5;)V
    .locals 3

    const-string v0, "DROP TABLE IF EXISTS `bird`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS `bird_map_markers`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS `bulk_scan_purpose_bird`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl$a;->b:Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->F(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl$a;->b:Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->G(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl$a;->b:Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->I(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;)Ljava/util/List;

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

    iget-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl$a;->b:Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->J(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl$a;->b:Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->K(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl$a;->b:Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->L(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;)Ljava/util/List;

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

    iget-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl$a;->b:Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;

    invoke-static {v0, p1}, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->M(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;LmV5;)LmV5;

    const-string v0, "PRAGMA foreign_keys = ON"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl$a;->b:Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;

    invoke-static {v0, p1}, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->N(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;LmV5;)V

    iget-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl$a;->b:Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->O(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl$a;->b:Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->P(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl$a;->b:Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;->H(Lco/bird/android/persistence/bird/impl/BirdDatabase_Impl;)Ljava/util/List;

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
    .locals 23

    move-object/from16 v0, p1

    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0x3f

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, LtY5$a;

    const-string v4, "id"

    const-string v5, "TEXT"

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v3, v2

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "id"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v5, "model"

    const-string v6, "TEXT"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "model"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v6, "task_id"

    const-string v7, "TEXT"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    move-object v5, v2

    invoke-direct/range {v5 .. v11}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "task_id"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v6, "battery_level"

    const-string v7, "INTEGER"

    const/4 v8, 0x1

    move-object v5, v2

    invoke-direct/range {v5 .. v11}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "battery_level"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v6, "estimated_range"

    const-string v7, "INTEGER"

    const/4 v8, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v11}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "estimated_range"

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v7, "distance"

    const-string v8, "INTEGER"

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    move-object v6, v2

    invoke-direct/range {v6 .. v12}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "distance"

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v7, "location"

    const-string v8, "TEXT"

    move-object v6, v2

    invoke-direct/range {v6 .. v12}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "location"

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v7, "code"

    const-string v8, "TEXT"

    move-object v6, v2

    invoke-direct/range {v6 .. v12}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v6, "code"

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v8, "sticker_id"

    const-string v9, "TEXT"

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    move-object v7, v2

    invoke-direct/range {v7 .. v13}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "sticker_id"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "serial_number"

    const-string v10, "TEXT"

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "serial_number"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "disconnected"

    const-string v10, "INTEGER"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "disconnected"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "accident"

    const-string v10, "INTEGER"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "accident"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "submerged"

    const-string v10, "INTEGER"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "submerged"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "lost"

    const-string v10, "INTEGER"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "lost"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "locked"

    const-string v10, "INTEGER"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "locked"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "ack_locked"

    const-string v10, "INTEGER"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "ack_locked"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "captive"

    const-string v10, "INTEGER"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "captive"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "gps_fix"

    const-string v10, "INTEGER"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "gps_fix"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "broken"

    const-string v10, "INTEGER"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "broken"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "label"

    const-string v10, "TEXT"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "label"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "actions"

    const-string v10, "TEXT"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "actions"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "bounty_id"

    const-string v10, "TEXT"

    const/4 v11, 0x0

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "bounty_id"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "bounty_price"

    const-string v10, "INTEGER"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "bounty_price"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "bounty_currency"

    const-string v10, "TEXT"

    const/4 v11, 0x1

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "bounty_currency"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "bounty_lost"

    const-string v10, "INTEGER"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "bounty_lost"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "bounty_overdue"

    const-string v10, "INTEGER"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "bounty_overdue"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "bounty_kind"

    const-string v10, "TEXT"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "bounty_kind"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "brand_name"

    const-string v10, "TEXT"

    const/4 v11, 0x0

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "brand_name"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "task_kind"

    const-string v10, "TEXT"

    const/4 v11, 0x1

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "task_kind"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "gps_at"

    const-string v10, "TEXT"

    const/4 v11, 0x0

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "gps_at"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "tracked_at"

    const-string v10, "TEXT"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "tracked_at"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "token"

    const-string v10, "TEXT"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "token"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "bluetooth"

    const-string v10, "INTEGER"

    const/4 v11, 0x1

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "bluetooth"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "cellular"

    const-string v10, "INTEGER"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "cellular"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "started_at"

    const-string v10, "TEXT"

    const/4 v11, 0x0

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "started_at"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "due_at"

    const-string v10, "TEXT"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "due_at"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "asleep"

    const-string v10, "INTEGER"

    const/4 v11, 0x1

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "asleep"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "imei"

    const-string v10, "TEXT"

    const/4 v11, 0x0

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "imei"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "board_protocol"

    const-string v10, "TEXT"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "board_protocol"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "physical_lock"

    const-string v10, "TEXT"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "physical_lock"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "physical_locks"

    const-string v10, "TEXT"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "physical_locks"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "priority_collect"

    const-string v10, "INTEGER"

    const/4 v11, 0x1

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "priority_collect"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "down"

    const-string v10, "INTEGER"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "down"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "needs_inspection"

    const-string v10, "INTEGER"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "needs_inspection"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "partner_id"

    const-string v10, "TEXT"

    const/4 v11, 0x0

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "partner_id"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "nest_id"

    const-string v10, "TEXT"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "nest_id"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "last_ride_ended_at"

    const-string v10, "TEXT"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "last_ride_ended_at"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "partner_bird_state"

    const-string v10, "TEXT"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "partner_bird_state"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "peril"

    const-string v10, "INTEGER"

    const/4 v11, 0x1

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "peril"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "deliverable"

    const-string v10, "INTEGER"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "deliverable"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "lifecycle"

    const-string v10, "TEXT"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "lifecycle"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "offline"

    const-string v10, "INTEGER"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "offline"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "license"

    const-string v10, "TEXT"

    const/4 v11, 0x0

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "license"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "area_key"

    const-string v10, "TEXT"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "area_key"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "nest_purpose"

    const-string v10, "TEXT"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "nest_purpose"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "private_bird"

    const-string v10, "TEXT"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "private_bird"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "scanned_at"

    const-string v10, "TEXT"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "scanned_at"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "badge_type"

    const-string v10, "TEXT"

    const/4 v11, 0x1

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "badge_type"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "bounty_reasons"

    const-string v10, "TEXT"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "bounty_reasons"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "ephemeral_id"

    const-string v10, "TEXT"

    const/4 v11, 0x0

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "ephemeral_id"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "ble_mac_address"

    const-string v10, "TEXT"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "ble_mac_address"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "has_helmet"

    const-string v10, "INTEGER"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "has_helmet"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "location_updated_at"

    const-string v10, "TEXT"

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "location_updated_at"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashSet;

    const/4 v7, 0x0

    invoke-direct {v2, v7}, Ljava/util/HashSet;-><init>(I)V

    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8, v7}, Ljava/util/HashSet;-><init>(I)V

    new-instance v9, LtY5;

    const-string v10, "bird"

    invoke-direct {v9, v10, v1, v2, v8}, LtY5;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {v0, v10}, LtY5;->a(LmV5;Ljava/lang/String;)LtY5;

    move-result-object v1

    invoke-virtual {v9, v1}, LtY5;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v8, "\n Found:\n"

    if-nez v2, :cond_0

    new-instance v0, LGb5$c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bird(co.bird.android.model.persistence.Bird).\n Expected:\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v7, v1}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, LtY5$a;

    const-string v10, "id"

    const-string v11, "TEXT"

    const/4 v12, 0x1

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x1

    move-object v9, v2

    invoke-direct/range {v9 .. v15}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v17, "battery_level"

    const-string v18, "INTEGER"

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    move-object/from16 v16, v2

    invoke-direct/range {v16 .. v22}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v10, "location"

    const-string v11, "TEXT"

    const/4 v13, 0x0

    move-object v9, v2

    invoke-direct/range {v9 .. v15}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v17, "code"

    const-string v18, "TEXT"

    move-object/from16 v16, v2

    invoke-direct/range {v16 .. v22}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v10, "fleet_marker"

    const-string v11, "TEXT"

    move-object v9, v2

    invoke-direct/range {v9 .. v15}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "fleet_marker"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v10, "filter_hash"

    const-string v11, "TEXT"

    move-object v9, v2

    invoke-direct/range {v9 .. v15}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "filter_hash"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v10, "updated_at"

    const-string v11, "TEXT"

    move-object v9, v2

    invoke-direct/range {v9 .. v15}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "updated_at"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v7}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v7}, Ljava/util/HashSet;-><init>(I)V

    new-instance v5, LtY5;

    const-string v6, "bird_map_markers"

    invoke-direct {v5, v6, v1, v2, v4}, LtY5;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {v0, v6}, LtY5;->a(LmV5;Ljava/lang/String;)LtY5;

    move-result-object v1

    invoke-virtual {v5, v1}, LtY5;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v0, LGb5$c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bird_map_markers(co.bird.android.model.persistence.BirdMapMarker).\n Expected:\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v7, v1}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_1
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, LtY5$a;

    const-string v10, "bird_id"

    const-string v11, "TEXT"

    const/4 v12, 0x1

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x1

    move-object v9, v2

    invoke-direct/range {v9 .. v15}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "bird_id"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v10, "purpose"

    const-string v11, "TEXT"

    const/4 v13, 0x2

    move-object v9, v2

    invoke-direct/range {v9 .. v15}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "purpose"

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashSet;

    const/4 v6, 0x1

    invoke-direct {v2, v6}, Ljava/util/HashSet;-><init>(I)V

    new-instance v15, LtY5$c;

    const-string v10, "bird"

    const-string v11, "CASCADE"

    const-string v12, "NO ACTION"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    move-object v9, v15

    invoke-direct/range {v9 .. v14}, LtY5$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {v2, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v6}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, LtY5$e;

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const-string v9, "ASC"

    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    const-string v10, "index_bulk_scan_purpose_bird_by_purpose"

    invoke-direct {v4, v10, v7, v5, v9}, LtY5$e;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v4, LtY5;

    const-string v5, "bulk_scan_purpose_bird"

    invoke-direct {v4, v5, v1, v2, v3}, LtY5;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {v0, v5}, LtY5;->a(LmV5;Ljava/lang/String;)LtY5;

    move-result-object v0

    invoke-virtual {v4, v0}, LtY5;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, LGb5$c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bulk_scan_purpose_bird(co.bird.android.model.persistence.BulkScanPurposeBird).\n Expected:\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v7, v0}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v1

    :cond_2
    new-instance v0, LGb5$c;

    const/4 v1, 0x0

    invoke-direct {v0, v6, v1}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method
