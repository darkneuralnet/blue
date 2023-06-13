.class public Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl$a;
.super LGb5$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;->f(LfT0;)LnV5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;


# direct methods
.method public constructor <init>(Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;I)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl$a;->b:Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;

    invoke-direct {p0, p2}, LGb5$b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(LmV5;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `complaint_resolution_form` (`action_taken_required_fields` TEXT NOT NULL, `no_action_taken_required_fields` TEXT NOT NULL, `issue_options` TEXT NOT NULL, `action_taken_options` TEXT NOT NULL, PRIMARY KEY(`action_taken_required_fields`))"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `complaint_resolution` (`complaint_hash` INTEGER NOT NULL, `complaint_ids` TEXT NOT NULL, `situation` TEXT NOT NULL, `before_photo_asset_id` TEXT, `before_photo_url` TEXT, `after_photo_asset_id` TEXT, `after_photo_url` TEXT, `issues` TEXT, `action_taken` TEXT, `vehicle_ids_involved` TEXT, `additional_notes` TEXT, `submitted` INTEGER NOT NULL, PRIMARY KEY(`complaint_hash`))"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'69c5eb476889230bdafff656d8552117\')"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    return-void
.end method

.method public b(LmV5;)V
    .locals 3

    const-string v0, "DROP TABLE IF EXISTS `complaint_resolution_form`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS `complaint_resolution`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl$a;->b:Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;->E(Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl$a;->b:Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;->F(Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl$a;->b:Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;->H(Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;)Ljava/util/List;

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

    iget-object v0, p0, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl$a;->b:Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;->I(Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl$a;->b:Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;->J(Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl$a;->b:Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;->K(Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;)Ljava/util/List;

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

    iget-object v0, p0, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl$a;->b:Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;

    invoke-static {v0, p1}, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;->L(Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;LmV5;)LmV5;

    iget-object v0, p0, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl$a;->b:Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;

    invoke-static {v0, p1}, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;->M(Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;LmV5;)V

    iget-object v0, p0, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl$a;->b:Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;->N(Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl$a;->b:Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;->O(Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl$a;->b:Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;->G(Lco/bird/android/persistence/complaintresolution/impl/ComplaintResolutionDatabase_Impl;)Ljava/util/List;

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
    .locals 12

    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, LtY5$a;

    const-string v3, "action_taken_required_fields"

    const-string v4, "TEXT"

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "action_taken_required_fields"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "no_action_taken_required_fields"

    const-string v5, "TEXT"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "no_action_taken_required_fields"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "issue_options"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "issue_options"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v4, "action_taken_options"

    const-string v5, "TEXT"

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "action_taken_options"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/util/HashSet;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v2}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, LtY5;

    const-string v5, "complaint_resolution_form"

    invoke-direct {v4, v5, v0, v1, v3}, LtY5;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {p1, v5}, LtY5;->a(LmV5;Ljava/lang/String;)LtY5;

    move-result-object v0

    invoke-virtual {v4, v0}, LtY5;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v3, "\n Found:\n"

    if-nez v1, :cond_0

    new-instance p1, LGb5$c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "complaint_resolution_form(co.bird.android.model.persistence.ComplaintResolutionForm).\n Expected:\n"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v2, v0}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    new-instance v1, LtY5$a;

    const-string v5, "complaint_hash"

    const-string v6, "INTEGER"

    const/4 v7, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v4, v1

    invoke-direct/range {v4 .. v10}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "complaint_hash"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v6, "complaint_ids"

    const-string v7, "TEXT"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    move-object v5, v1

    invoke-direct/range {v5 .. v11}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "complaint_ids"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v6, "situation"

    const-string v7, "TEXT"

    move-object v5, v1

    invoke-direct/range {v5 .. v11}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "situation"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v6, "before_photo_asset_id"

    const-string v7, "TEXT"

    const/4 v8, 0x0

    move-object v5, v1

    invoke-direct/range {v5 .. v11}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "before_photo_asset_id"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v6, "before_photo_url"

    const-string v7, "TEXT"

    move-object v5, v1

    invoke-direct/range {v5 .. v11}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "before_photo_url"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v6, "after_photo_asset_id"

    const-string v7, "TEXT"

    move-object v5, v1

    invoke-direct/range {v5 .. v11}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "after_photo_asset_id"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v6, "after_photo_url"

    const-string v7, "TEXT"

    move-object v5, v1

    invoke-direct/range {v5 .. v11}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "after_photo_url"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v6, "issues"

    const-string v7, "TEXT"

    move-object v5, v1

    invoke-direct/range {v5 .. v11}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "issues"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v6, "action_taken"

    const-string v7, "TEXT"

    move-object v5, v1

    invoke-direct/range {v5 .. v11}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "action_taken"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v6, "vehicle_ids_involved"

    const-string v7, "TEXT"

    move-object v5, v1

    invoke-direct/range {v5 .. v11}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "vehicle_ids_involved"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v6, "additional_notes"

    const-string v7, "TEXT"

    move-object v5, v1

    invoke-direct/range {v5 .. v11}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "additional_notes"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LtY5$a;

    const-string v6, "submitted"

    const-string v7, "INTEGER"

    const/4 v8, 0x1

    move-object v5, v1

    invoke-direct/range {v5 .. v11}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "submitted"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v2}, Ljava/util/HashSet;-><init>(I)V

    new-instance v5, LtY5;

    const-string v6, "complaint_resolution"

    invoke-direct {v5, v6, v0, v1, v4}, LtY5;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {p1, v6}, LtY5;->a(LmV5;Ljava/lang/String;)LtY5;

    move-result-object p1

    invoke-virtual {v5, p1}, LtY5;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, LGb5$c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "complaint_resolution(co.bird.android.model.persistence.ComplaintResolution).\n Expected:\n"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v2, p1}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v0

    :cond_1
    new-instance p1, LGb5$c;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object p1
.end method
