.class public Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl$a;
.super LGb5$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;->f(LfT0;)LnV5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;


# direct methods
.method public constructor <init>(Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;I)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl$a;->b:Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;

    invoke-direct {p0, p2}, LGb5$b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(LmV5;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `operator_option_filters` (`id` TEXT NOT NULL, `kind` TEXT NOT NULL, `ordinal_num` INTEGER NOT NULL, `type` TEXT NOT NULL, `label` TEXT NOT NULL, `options` TEXT NOT NULL, `logic_operator` TEXT, `icon` TEXT, `icon_color` TEXT, `colored_icon` TEXT, `icon_background_color` TEXT, PRIMARY KEY(`id`))"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `operator_toggle_filters` (`id` TEXT NOT NULL, `kind` TEXT NOT NULL, `ordinal_num` INTEGER NOT NULL, `type` TEXT NOT NULL, `title` TEXT NOT NULL, `toggle_title` TEXT NOT NULL, `enabled` INTEGER NOT NULL, `icon` TEXT, `icon_color` TEXT, `colored_icon` TEXT, `icon_background_color` TEXT, PRIMARY KEY(`id`))"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'9959d9a2e9fd67db013924fb617def91\')"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    return-void
.end method

.method public b(LmV5;)V
    .locals 3

    const-string v0, "DROP TABLE IF EXISTS `operator_option_filters`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS `operator_toggle_filters`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl$a;->b:Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;->E(Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl$a;->b:Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;->F(Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl$a;->b:Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;->H(Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;)Ljava/util/List;

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

    iget-object v0, p0, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl$a;->b:Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;->I(Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl$a;->b:Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;->J(Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl$a;->b:Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;->K(Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;)Ljava/util/List;

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

    iget-object v0, p0, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl$a;->b:Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;

    invoke-static {v0, p1}, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;->L(Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;LmV5;)LmV5;

    iget-object v0, p0, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl$a;->b:Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;

    invoke-static {v0, p1}, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;->M(Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;LmV5;)V

    iget-object v0, p0, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl$a;->b:Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;->N(Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl$a;->b:Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;->O(Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl$a;->b:Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;->G(Lco/bird/android/persistence/operatorfilter/impl/OperatorFilterDatabase_Impl;)Ljava/util/List;

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
    .locals 28

    move-object/from16 v0, p1

    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v10, LtY5$a;

    const-string v4, "id"

    const-string v5, "TEXT"

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v3, v10

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "id"

    invoke-virtual {v1, v3, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, LtY5$a;

    const-string v12, "kind"

    const-string v13, "TEXT"

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x1

    move-object v11, v4

    invoke-direct/range {v11 .. v17}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v5, "kind"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, LtY5$a;

    const-string v7, "ordinal_num"

    const-string v8, "INTEGER"

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    move-object v6, v4

    invoke-direct/range {v6 .. v12}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v6, "ordinal_num"

    invoke-virtual {v1, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, LtY5$a;

    const-string v8, "type"

    const-string v9, "TEXT"

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    move-object v7, v4

    invoke-direct/range {v7 .. v13}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "type"

    invoke-virtual {v1, v7, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, LtY5$a;

    const-string v9, "label"

    const-string v10, "TEXT"

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v8, v4

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v8, "label"

    invoke-virtual {v1, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, LtY5$a;

    const-string v10, "options"

    const-string v11, "TEXT"

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    move-object v9, v4

    invoke-direct/range {v9 .. v15}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v8, "options"

    invoke-virtual {v1, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, LtY5$a;

    const-string v10, "logic_operator"

    const-string v11, "TEXT"

    const/4 v12, 0x0

    move-object v9, v4

    invoke-direct/range {v9 .. v15}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v8, "logic_operator"

    invoke-virtual {v1, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, LtY5$a;

    const-string v10, "icon"

    const-string v11, "TEXT"

    move-object v9, v4

    invoke-direct/range {v9 .. v15}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v8, "icon"

    invoke-virtual {v1, v8, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, LtY5$a;

    const-string v10, "icon_color"

    const-string v11, "TEXT"

    move-object v9, v4

    invoke-direct/range {v9 .. v15}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v9, "icon_color"

    invoke-virtual {v1, v9, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, LtY5$a;

    const-string v11, "colored_icon"

    const-string v12, "TEXT"

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    move-object v10, v4

    invoke-direct/range {v10 .. v16}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v10, "colored_icon"

    invoke-virtual {v1, v10, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, LtY5$a;

    const-string v12, "icon_background_color"

    const-string v13, "TEXT"

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v11, v4

    invoke-direct/range {v11 .. v17}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v11, "icon_background_color"

    invoke-virtual {v1, v11, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Ljava/util/HashSet;

    const/4 v12, 0x0

    invoke-direct {v4, v12}, Ljava/util/HashSet;-><init>(I)V

    new-instance v13, Ljava/util/HashSet;

    invoke-direct {v13, v12}, Ljava/util/HashSet;-><init>(I)V

    new-instance v14, LtY5;

    const-string v15, "operator_option_filters"

    invoke-direct {v14, v15, v1, v4, v13}, LtY5;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {v0, v15}, LtY5;->a(LmV5;Ljava/lang/String;)LtY5;

    move-result-object v1

    invoke-virtual {v14, v1}, LtY5;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v13, "\n Found:\n"

    if-nez v4, :cond_0

    new-instance v0, LGb5$c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "operator_option_filters(co.bird.android.model.persistence.OperatorOptionFilter).\n Expected:\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v12, v1}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, LtY5$a;

    const-string v15, "id"

    const-string v16, "TEXT"

    const/16 v17, 0x1

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x1

    move-object v14, v2

    invoke-direct/range {v14 .. v20}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v22, "kind"

    const-string v23, "TEXT"

    const/16 v24, 0x1

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x1

    move-object/from16 v21, v2

    invoke-direct/range {v21 .. v27}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v15, "ordinal_num"

    const-string v16, "INTEGER"

    const/16 v18, 0x0

    move-object v14, v2

    invoke-direct/range {v14 .. v20}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v22, "type"

    const-string v23, "TEXT"

    move-object/from16 v21, v2

    invoke-direct/range {v21 .. v27}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v15, "title"

    const-string v16, "TEXT"

    move-object v14, v2

    invoke-direct/range {v14 .. v20}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "title"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v15, "toggle_title"

    const-string v16, "TEXT"

    move-object v14, v2

    invoke-direct/range {v14 .. v20}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "toggle_title"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v15, "enabled"

    const-string v16, "INTEGER"

    move-object v14, v2

    invoke-direct/range {v14 .. v20}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "enabled"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v15, "icon"

    const-string v16, "TEXT"

    const/16 v17, 0x0

    move-object v14, v2

    invoke-direct/range {v14 .. v20}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v22, "icon_color"

    const-string v23, "TEXT"

    const/16 v24, 0x0

    move-object/from16 v21, v2

    invoke-direct/range {v21 .. v27}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v9, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v15, "colored_icon"

    const-string v16, "TEXT"

    move-object v14, v2

    invoke-direct/range {v14 .. v20}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v4, "icon_background_color"

    const-string v5, "TEXT"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v3, v2

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v12}, Ljava/util/HashSet;-><init>(I)V

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v12}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, LtY5;

    const-string v5, "operator_toggle_filters"

    invoke-direct {v4, v5, v1, v2, v3}, LtY5;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {v0, v5}, LtY5;->a(LmV5;Ljava/lang/String;)LtY5;

    move-result-object v0

    invoke-virtual {v4, v0}, LtY5;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, LGb5$c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "operator_toggle_filters(co.bird.android.model.persistence.OperatorToggleFilter).\n Expected:\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v12, v0}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v1

    :cond_1
    new-instance v0, LGb5$c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method
