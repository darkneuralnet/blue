.class public Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl$a;
.super LGb5$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;->f(LfT0;)LnV5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;I)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl$a;->b:Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;

    invoke-direct {p0, p2}, LGb5$b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(LmV5;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `hard_count` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `hard_count_id` TEXT NOT NULL, `scan_identifier` TEXT NOT NULL, `identifier_category` TEXT NOT NULL, `previous_identifier_category` TEXT, `scan_error_code` TEXT)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE UNIQUE INDEX IF NOT EXISTS `index_hard_count_scan_identifier` ON `hard_count` (`scan_identifier`)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `pending_scan_hard_count` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `hard_count_id` TEXT NOT NULL, `scan_identifier` TEXT NOT NULL, `previous_identifier` TEXT)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE UNIQUE INDEX IF NOT EXISTS `index_pending_scan_hard_count_scan_identifier` ON `pending_scan_hard_count` (`scan_identifier`)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `unidentified_scan_hard_count` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `hard_count_id` TEXT NOT NULL, `scan_identifier` TEXT NOT NULL, `scan_error_code` TEXT NOT NULL)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE UNIQUE INDEX IF NOT EXISTS `index_unidentified_scan_hard_count_scan_identifier` ON `unidentified_scan_hard_count` (`scan_identifier`)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'8456d029823ab20ae41198831d1971f4\')"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    return-void
.end method

.method public b(LmV5;)V
    .locals 3

    const-string v0, "DROP TABLE IF EXISTS `hard_count`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS `pending_scan_hard_count`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS `unidentified_scan_hard_count`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl$a;->b:Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;->D(Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl$a;->b:Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;->E(Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl$a;->b:Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;->G(Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;)Ljava/util/List;

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

    iget-object v0, p0, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl$a;->b:Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;->H(Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl$a;->b:Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;->I(Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl$a;->b:Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;->J(Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;)Ljava/util/List;

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

    iget-object v0, p0, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl$a;->b:Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;

    invoke-static {v0, p1}, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;->K(Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;LmV5;)LmV5;

    iget-object v0, p0, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl$a;->b:Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;

    invoke-static {v0, p1}, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;->L(Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;LmV5;)V

    iget-object v0, p0, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl$a;->b:Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;->M(Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl$a;->b:Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;->N(Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl$a;->b:Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;->F(Lco/bird/android/manager/hardcount/persistence/HardCountDatabase_Impl;)Ljava/util/List;

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
    .locals 27

    move-object/from16 v0, p1

    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, LtY5$a;

    const-string v4, "id"

    const-string v5, "INTEGER"

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v3, v2

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "id"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v5, "hard_count_id"

    const-string v6, "TEXT"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "hard_count_id"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v6, "scan_identifier"

    const-string v7, "TEXT"

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    move-object v5, v2

    invoke-direct/range {v5 .. v11}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "scan_identifier"

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v7, "identifier_category"

    const-string v8, "TEXT"

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    move-object v6, v2

    invoke-direct/range {v6 .. v12}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v6, "identifier_category"

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v8, "previous_identifier_category"

    const-string v9, "TEXT"

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    move-object v7, v2

    invoke-direct/range {v7 .. v13}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v6, "previous_identifier_category"

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v8, "scan_error_code"

    const-string v9, "TEXT"

    move-object v7, v2

    invoke-direct/range {v7 .. v13}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v6, "scan_error_code"

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashSet;

    const/4 v7, 0x0

    invoke-direct {v2, v7}, Ljava/util/HashSet;-><init>(I)V

    new-instance v8, Ljava/util/HashSet;

    const/4 v9, 0x1

    invoke-direct {v8, v9}, Ljava/util/HashSet;-><init>(I)V

    new-instance v10, LtY5$e;

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    const-string v12, "ASC"

    filled-new-array {v12}, [Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    const-string v14, "index_hard_count_scan_identifier"

    invoke-direct {v10, v14, v9, v11, v13}, LtY5$e;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-virtual {v8, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v10, LtY5;

    const-string v11, "hard_count"

    invoke-direct {v10, v11, v1, v2, v8}, LtY5;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {v0, v11}, LtY5;->a(LmV5;Ljava/lang/String;)LtY5;

    move-result-object v1

    invoke-virtual {v10, v1}, LtY5;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v8, "\n Found:\n"

    if-nez v2, :cond_0

    new-instance v0, LGb5$c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hard_count(co.bird.android.model.persistence.HardCountEntity).\n Expected:\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v7, v1}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v10, LtY5$a;

    const-string v14, "id"

    const-string v15, "INTEGER"

    const/16 v16, 0x1

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x1

    move-object v13, v10

    invoke-direct/range {v13 .. v19}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v3, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v10, LtY5$a;

    const-string v21, "hard_count_id"

    const-string v22, "TEXT"

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x1

    move-object/from16 v20, v10

    invoke-direct/range {v20 .. v26}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v4, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v10, LtY5$a;

    const-string v14, "scan_identifier"

    const-string v15, "TEXT"

    const/16 v17, 0x0

    move-object v13, v10

    invoke-direct/range {v13 .. v19}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v5, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v10, LtY5$a;

    const-string v21, "previous_identifier"

    const-string v22, "TEXT"

    const/16 v23, 0x0

    move-object/from16 v20, v10

    invoke-direct/range {v20 .. v26}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v11, "previous_identifier"

    invoke-virtual {v1, v11, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10, v7}, Ljava/util/HashSet;-><init>(I)V

    new-instance v11, Ljava/util/HashSet;

    invoke-direct {v11, v9}, Ljava/util/HashSet;-><init>(I)V

    new-instance v13, LtY5$e;

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    filled-new-array {v12}, [Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    const-string v2, "index_pending_scan_hard_count_scan_identifier"

    invoke-direct {v13, v2, v9, v14, v15}, LtY5$e;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-virtual {v11, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v2, LtY5;

    const-string v13, "pending_scan_hard_count"

    invoke-direct {v2, v13, v1, v10, v11}, LtY5;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {v0, v13}, LtY5;->a(LmV5;Ljava/lang/String;)LtY5;

    move-result-object v1

    invoke-virtual {v2, v1}, LtY5;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1

    new-instance v0, LGb5$c;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "pending_scan_hard_count(co.bird.android.model.persistence.PendingScanEntity).\n Expected:\n"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v7, v1}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_1
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, LtY5$a;

    const-string v14, "id"

    const-string v15, "INTEGER"

    const/16 v16, 0x1

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x1

    move-object v13, v2

    invoke-direct/range {v13 .. v19}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v21, "hard_count_id"

    const-string v22, "TEXT"

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x1

    move-object/from16 v20, v2

    invoke-direct/range {v20 .. v26}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v14, "scan_identifier"

    const-string v15, "TEXT"

    const/16 v17, 0x0

    move-object v13, v2

    invoke-direct/range {v13 .. v19}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v21, "scan_error_code"

    const-string v22, "TEXT"

    move-object/from16 v20, v2

    invoke-direct/range {v20 .. v26}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v7}, Ljava/util/HashSet;-><init>(I)V

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v9}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, LtY5$e;

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    filled-new-array {v12}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const-string v10, "index_unidentified_scan_hard_count_scan_identifier"

    invoke-direct {v4, v10, v9, v5, v6}, LtY5$e;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v4, LtY5;

    const-string v5, "unidentified_scan_hard_count"

    invoke-direct {v4, v5, v1, v2, v3}, LtY5;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {v0, v5}, LtY5;->a(LmV5;Ljava/lang/String;)LtY5;

    move-result-object v0

    invoke-virtual {v4, v0}, LtY5;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, LGb5$c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unidentified_scan_hard_count(co.bird.android.model.persistence.UnidentifiedScanEntity).\n Expected:\n"

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

    invoke-direct {v0, v9, v1}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method
