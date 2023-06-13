.class public Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl$a;
.super LGb5$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;->f(LfT0;)LnV5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;


# direct methods
.method public constructor <init>(Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;I)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl$a;->b:Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;

    invoke-direct {p0, p2}, LGb5$b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(LmV5;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `categories` (`category` TEXT NOT NULL, `title` TEXT NOT NULL, PRIMARY KEY(`category`))"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `notification_groups` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `category` TEXT NOT NULL, `date` TEXT NOT NULL, `icon` TEXT NOT NULL, PRIMARY KEY(`id`))"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `notifications` (`id` TEXT NOT NULL, `group_id` TEXT, `category` TEXT NOT NULL, `kind` TEXT NOT NULL, `title` TEXT, `short_description` TEXT, `full_description` TEXT, `icon` TEXT NOT NULL, `date` TEXT NOT NULL, `actions` TEXT NOT NULL, PRIMARY KEY(`id`))"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'97b6f155fe68aaf8606aa2c527bc1d6a\')"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    return-void
.end method

.method public b(LmV5;)V
    .locals 3

    const-string v0, "DROP TABLE IF EXISTS `categories`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS `notification_groups`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS `notifications`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl$a;->b:Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;->F(Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl$a;->b:Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;->G(Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl$a;->b:Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;->I(Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;)Ljava/util/List;

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

    iget-object v0, p0, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl$a;->b:Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;->J(Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl$a;->b:Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;->K(Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl$a;->b:Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;->L(Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;)Ljava/util/List;

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

    iget-object v0, p0, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl$a;->b:Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;

    invoke-static {v0, p1}, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;->M(Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;LmV5;)LmV5;

    iget-object v0, p0, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl$a;->b:Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;

    invoke-static {v0, p1}, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;->N(Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;LmV5;)V

    iget-object v0, p0, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl$a;->b:Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;->O(Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl$a;->b:Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;->P(Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl$a;->b:Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;->H(Lco/bird/android/persistence/notificationcenter/impl/NotificationCenterDatabase_Impl;)Ljava/util/List;

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
    .locals 24

    move-object/from16 v0, p1

    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, LtY5$a;

    const-string v4, "category"

    const-string v5, "TEXT"

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v3, v2

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "category"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v5, "title"

    const-string v6, "TEXT"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "title"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashSet;

    const/4 v5, 0x0

    invoke-direct {v2, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v7, LtY5;

    const-string v8, "categories"

    invoke-direct {v7, v8, v1, v2, v6}, LtY5;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {v0, v8}, LtY5;->a(LmV5;Ljava/lang/String;)LtY5;

    move-result-object v1

    invoke-virtual {v7, v1}, LtY5;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v6, "\n Found:\n"

    if-nez v2, :cond_0

    new-instance v0, LGb5$c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "categories(co.bird.android.model.persistence.OperatorNotificationCategory).\n Expected:\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v5, v1}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, LtY5$a;

    const-string v8, "id"

    const-string v9, "TEXT"

    const/4 v10, 0x1

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x1

    move-object v7, v2

    invoke-direct/range {v7 .. v13}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "id"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "title"

    const-string v10, "TEXT"

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v16, "description"

    const-string v17, "TEXT"

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1

    move-object v15, v2

    invoke-direct/range {v15 .. v21}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v8, "description"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v10, "category"

    const-string v11, "TEXT"

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    move-object v9, v2

    invoke-direct/range {v9 .. v15}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v17, "date"

    const-string v18, "TEXT"

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    move-object/from16 v16, v2

    invoke-direct/range {v16 .. v22}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v8, "date"

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v10, "icon"

    const-string v11, "TEXT"

    move-object v9, v2

    invoke-direct/range {v9 .. v15}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v9, "icon"

    invoke-virtual {v1, v9, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v11, LtY5;

    const-string v12, "notification_groups"

    invoke-direct {v11, v12, v1, v2, v10}, LtY5;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {v0, v12}, LtY5;->a(LmV5;Ljava/lang/String;)LtY5;

    move-result-object v1

    invoke-virtual {v11, v1}, LtY5;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    new-instance v0, LGb5$c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notification_groups(co.bird.android.model.persistence.NotificationGroup).\n Expected:\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v5, v1}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_1
    new-instance v1, Ljava/util/HashMap;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, LtY5$a;

    const-string v11, "id"

    const-string v12, "TEXT"

    const/4 v13, 0x1

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 v16, 0x1

    move-object v10, v2

    invoke-direct/range {v10 .. v16}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v18, "group_id"

    const-string v19, "TEXT"

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x1

    move-object/from16 v17, v2

    invoke-direct/range {v17 .. v23}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "group_id"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v11, "category"

    const-string v12, "TEXT"

    const/4 v14, 0x0

    move-object v10, v2

    invoke-direct/range {v10 .. v16}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v18, "kind"

    const-string v19, "TEXT"

    const/16 v20, 0x1

    move-object/from16 v17, v2

    invoke-direct/range {v17 .. v23}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "kind"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v11, "title"

    const-string v12, "TEXT"

    const/4 v13, 0x0

    move-object v10, v2

    invoke-direct/range {v10 .. v16}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v18, "short_description"

    const-string v19, "TEXT"

    const/16 v20, 0x0

    move-object/from16 v17, v2

    invoke-direct/range {v17 .. v23}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "short_description"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v11, "full_description"

    const-string v12, "TEXT"

    move-object v10, v2

    invoke-direct/range {v10 .. v16}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "full_description"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v11, "icon"

    const-string v12, "TEXT"

    const/4 v13, 0x1

    move-object v10, v2

    invoke-direct/range {v10 .. v16}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v9, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v18, "date"

    const-string v19, "TEXT"

    const/16 v20, 0x1

    move-object/from16 v17, v2

    invoke-direct/range {v17 .. v23}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v10, "actions"

    const-string v11, "TEXT"

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    move-object v9, v2

    invoke-direct/range {v9 .. v15}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "actions"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, LtY5;

    const-string v7, "notifications"

    invoke-direct {v4, v7, v1, v2, v3}, LtY5;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {v0, v7}, LtY5;->a(LmV5;Ljava/lang/String;)LtY5;

    move-result-object v0

    invoke-virtual {v4, v0}, LtY5;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, LGb5$c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notifications(co.bird.android.model.persistence.Notification).\n Expected:\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v5, v0}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v1

    :cond_2
    new-instance v0, LGb5$c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method
