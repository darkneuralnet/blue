.class public Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl$a;
.super LGb5$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;->f(LfT0;)LnV5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;


# direct methods
.method public constructor <init>(Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;I)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl$a;->b:Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;

    invoke-direct {p0, p2}, LGb5$b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(LmV5;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `hard_count_scan` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `bird_id` TEXT, `session_id` TEXT NOT NULL, `scan_identifier` TEXT NOT NULL, `model` TEXT, `model_version_title` TEXT, `scanned_at` TEXT NOT NULL, `lap_id` INTEGER NOT NULL, `completed` INTEGER NOT NULL)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE UNIQUE INDEX IF NOT EXISTS `index_hard_count_scan_scan_identifier` ON `hard_count_scan` (`scan_identifier`)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'b96fd6fead486cfc49cbb93a42b7232c\')"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    return-void
.end method

.method public b(LmV5;)V
    .locals 3

    const-string v0, "DROP TABLE IF EXISTS `hard_count_scan`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl$a;->b:Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;->D(Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl$a;->b:Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;->E(Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl$a;->b:Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;->G(Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;)Ljava/util/List;

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

    iget-object v0, p0, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl$a;->b:Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;->H(Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl$a;->b:Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;->I(Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl$a;->b:Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;->J(Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;)Ljava/util/List;

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

    iget-object v0, p0, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl$a;->b:Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;

    invoke-static {v0, p1}, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;->K(Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;LmV5;)LmV5;

    iget-object v0, p0, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl$a;->b:Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;

    invoke-static {v0, p1}, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;->L(Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;LmV5;)V

    iget-object v0, p0, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl$a;->b:Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;->M(Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl$a;->b:Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;->N(Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl$a;->b:Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;->F(Lco/bird/android/persistence/hardcount/impl/HardCountScanDatabase_Impl;)Ljava/util/List;

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
    .locals 11

    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, LtY5$a;

    const-string v3, "id"

    const-string v4, "INTEGER"

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "id"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "bird_id"

    const-string v5, "TEXT"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "bird_id"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "session_id"

    const-string v5, "TEXT"

    const/4 v6, 0x1

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "session_id"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "scan_identifier"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "scan_identifier"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "model"

    const-string v5, "TEXT"

    const/4 v6, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "model"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v5, "model_version_title"

    const-string v6, "TEXT"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v4, v1

    invoke-direct/range {v4 .. v10}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "model_version_title"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v5, "scanned_at"

    const-string v6, "TEXT"

    const/4 v7, 0x1

    move-object v4, v1

    invoke-direct/range {v4 .. v10}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "scanned_at"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v5, "lap_id"

    const-string v6, "INTEGER"

    move-object v4, v1

    invoke-direct/range {v4 .. v10}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "lap_id"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v5, "completed"

    const-string v6, "INTEGER"

    move-object v4, v1

    invoke-direct/range {v4 .. v10}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "completed"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/util/HashSet;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, Ljava/util/HashSet;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v6, LtY5$e;

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v7, "ASC"

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const-string v8, "index_hard_count_scan_scan_identifier"

    invoke-direct {v6, v8, v5, v2, v7}, LtY5$e;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-virtual {v4, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v2, LtY5;

    const-string v6, "hard_count_scan"

    invoke-direct {v2, v6, v0, v1, v4}, LtY5;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {p1, v6}, LtY5;->a(LmV5;Ljava/lang/String;)LtY5;

    move-result-object p1

    invoke-virtual {v2, p1}, LtY5;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, LGb5$c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "hard_count_scan(co.bird.android.model.persistence.HardCountScan).\n Expected:\n"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\n Found:\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v3, p1}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_0
    new-instance p1, LGb5$c;

    const/4 v0, 0x0

    invoke-direct {p1, v5, v0}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object p1
.end method
