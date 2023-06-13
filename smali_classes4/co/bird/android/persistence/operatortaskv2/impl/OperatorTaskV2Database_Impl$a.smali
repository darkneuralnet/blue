.class public Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl$a;
.super LGb5$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;->f(LfT0;)LnV5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;


# direct methods
.method public constructor <init>(Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;I)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl$a;->b:Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;

    invoke-direct {p0, p2}, LGb5$b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(LmV5;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `operator_task_group` (`title` TEXT NOT NULL, `tasks` TEXT NOT NULL, PRIMARY KEY(`title`))"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `operator_task_banners` (`title` TEXT NOT NULL, `title_color` TEXT NOT NULL, `background_color` TEXT NOT NULL, PRIMARY KEY(`title`))"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'1abceae7bb6215f43a505d3cdb9b6457\')"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    return-void
.end method

.method public b(LmV5;)V
    .locals 3

    const-string v0, "DROP TABLE IF EXISTS `operator_task_group`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS `operator_task_banners`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl$a;->b:Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;->D(Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl$a;->b:Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;->E(Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl$a;->b:Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;->G(Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;)Ljava/util/List;

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

    iget-object v0, p0, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl$a;->b:Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;->H(Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl$a;->b:Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;->I(Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl$a;->b:Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;->J(Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;)Ljava/util/List;

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

    iget-object v0, p0, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl$a;->b:Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;

    invoke-static {v0, p1}, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;->K(Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;LmV5;)LmV5;

    iget-object v0, p0, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl$a;->b:Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;

    invoke-static {v0, p1}, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;->L(Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;LmV5;)V

    iget-object v0, p0, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl$a;->b:Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;->M(Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl$a;->b:Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;->N(Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl$a;->b:Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;->F(Lco/bird/android/persistence/operatortaskv2/impl/OperatorTaskV2Database_Impl;)Ljava/util/List;

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
    .locals 20

    move-object/from16 v0, p1

    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, LtY5$a;

    const-string v4, "title"

    const-string v5, "TEXT"

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v3, v2

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "title"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v5, "tasks"

    const-string v6, "TEXT"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "tasks"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashSet;

    const/4 v4, 0x0

    invoke-direct {v2, v4}, Ljava/util/HashSet;-><init>(I)V

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5, v4}, Ljava/util/HashSet;-><init>(I)V

    new-instance v6, LtY5;

    const-string v7, "operator_task_group"

    invoke-direct {v6, v7, v1, v2, v5}, LtY5;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {v0, v7}, LtY5;->a(LmV5;Ljava/lang/String;)LtY5;

    move-result-object v1

    invoke-virtual {v6, v1}, LtY5;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v5, "\n Found:\n"

    if-nez v2, :cond_0

    new-instance v0, LGb5$c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "operator_task_group(co.bird.android.model.persistence.OperatorTaskGroup).\n Expected:\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v4, v1}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, LtY5$a;

    const-string v7, "title"

    const-string v8, "TEXT"

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x1

    move-object v6, v2

    invoke-direct/range {v6 .. v12}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v14, "title_color"

    const-string v15, "TEXT"

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    move-object v13, v2

    invoke-direct/range {v13 .. v19}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "title_color"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v7, "background_color"

    const-string v8, "TEXT"

    const/4 v10, 0x0

    move-object v6, v2

    invoke-direct/range {v6 .. v12}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "background_color"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v4}, Ljava/util/HashSet;-><init>(I)V

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v4}, Ljava/util/HashSet;-><init>(I)V

    new-instance v6, LtY5;

    const-string v7, "operator_task_banners"

    invoke-direct {v6, v7, v1, v2, v3}, LtY5;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {v0, v7}, LtY5;->a(LmV5;Ljava/lang/String;)LtY5;

    move-result-object v0

    invoke-virtual {v6, v0}, LtY5;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, LGb5$c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "operator_task_banners(co.bird.android.model.persistence.OperatorTaskBanner).\n Expected:\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v4, v0}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v1

    :cond_1
    new-instance v0, LGb5$c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method
