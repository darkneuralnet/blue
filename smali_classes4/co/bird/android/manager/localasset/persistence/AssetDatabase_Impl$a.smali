.class public Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl$a;
.super LGb5$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;->f(LfT0;)LnV5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;I)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl$a;->b:Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;

    invoke-direct {p0, p2}, LGb5$b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(LmV5;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `local_assets` (`id` TEXT NOT NULL, `manager` TEXT NOT NULL, `file_size` INTEGER, `media_type` TEXT, `file_path` TEXT, `created_by` TEXT, `downloaded_at` TEXT, `manifest_date` TEXT, `download_url` TEXT, PRIMARY KEY(`id`))"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_local_assets_downloaded_at` ON `local_assets` (`downloaded_at`)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE INDEX IF NOT EXISTS `index_local_assets_manifest_date` ON `local_assets` (`manifest_date`)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'2926ff64458c0cd84c1808cdd543cfe7\')"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    return-void
.end method

.method public b(LmV5;)V
    .locals 3

    const-string v0, "DROP TABLE IF EXISTS `local_assets`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl$a;->b:Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;->D(Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl$a;->b:Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;->E(Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl$a;->b:Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;->G(Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;)Ljava/util/List;

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

    iget-object v0, p0, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl$a;->b:Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;->H(Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl$a;->b:Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;->I(Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl$a;->b:Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;->J(Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;)Ljava/util/List;

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

    iget-object v0, p0, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl$a;->b:Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;

    invoke-static {v0, p1}, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;->K(Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;LmV5;)LmV5;

    iget-object v0, p0, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl$a;->b:Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;

    invoke-static {v0, p1}, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;->L(Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;LmV5;)V

    iget-object v0, p0, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl$a;->b:Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;->M(Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl$a;->b:Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;->N(Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl$a;->b:Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;->F(Lco/bird/android/manager/localasset/persistence/AssetDatabase_Impl;)Ljava/util/List;

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

    const-string v4, "TEXT"

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "id"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "manager"

    const-string v5, "TEXT"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "manager"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "file_size"

    const-string v5, "INTEGER"

    const/4 v6, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "file_size"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "media_type"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "media_type"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "file_path"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "file_path"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "created_by"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "created_by"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "downloaded_at"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "downloaded_at"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "manifest_date"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "manifest_date"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v5, "download_url"

    const-string v6, "TEXT"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v4, v1

    invoke-direct/range {v4 .. v10}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "download_url"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/util/HashSet;

    const/4 v4, 0x0

    invoke-direct {v1, v4}, Ljava/util/HashSet;-><init>(I)V

    new-instance v5, Ljava/util/HashSet;

    const/4 v6, 0x2

    invoke-direct {v5, v6}, Ljava/util/HashSet;-><init>(I)V

    new-instance v6, LtY5$e;

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v7, "ASC"

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const-string v9, "index_local_assets_downloaded_at"

    invoke-direct {v6, v9, v4, v2, v8}, LtY5$e;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-virtual {v5, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v2, LtY5$e;

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const-string v7, "index_local_assets_manifest_date"

    invoke-direct {v2, v7, v4, v3, v6}, LtY5$e;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-virtual {v5, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v2, LtY5;

    const-string v3, "local_assets"

    invoke-direct {v2, v3, v0, v1, v5}, LtY5;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {p1, v3}, LtY5;->a(LmV5;Ljava/lang/String;)LtY5;

    move-result-object p1

    invoke-virtual {v2, p1}, LtY5;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, LGb5$c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "local_assets(co.bird.android.manager.localasset.persistence.AssetEntity).\n Expected:\n"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\n Found:\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v4, p1}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_0
    new-instance p1, LGb5$c;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object p1
.end method
