.class public Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl$a;
.super LGb5$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;->f(LfT0;)LnV5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;


# direct methods
.method public constructor <init>(Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;I)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl$a;->b:Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;

    invoke-direct {p0, p2}, LGb5$b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(LmV5;)V
    .locals 1

    const-string v0, "CREATE TABLE IF NOT EXISTS `fleet_reports` (`period` TEXT NOT NULL, `subheading` TEXT, `scoreboards` TEXT NOT NULL, `sections` TEXT NOT NULL, `fleet_id` TEXT NOT NULL, `page` TEXT NOT NULL, PRIMARY KEY(`fleet_id`, `period`, `page`))"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS `fleet_report_period` (`start_date` TEXT NOT NULL, `end_date` TEXT NOT NULL, `granularity` TEXT NOT NULL, `fleet_id` TEXT NOT NULL, `page` TEXT NOT NULL, PRIMARY KEY(`start_date`, `end_date`, `granularity`, `page`, `fleet_id`))"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'27044c0153abac3406e1ecdca9f857e2\')"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    return-void
.end method

.method public b(LmV5;)V
    .locals 3

    const-string v0, "DROP TABLE IF EXISTS `fleet_reports`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    const-string v0, "DROP TABLE IF EXISTS `fleet_report_period`"

    invoke-interface {p1, v0}, LmV5;->G1(Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl$a;->b:Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;->E(Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl$a;->b:Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;->F(Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl$a;->b:Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;->H(Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;)Ljava/util/List;

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

    iget-object v0, p0, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl$a;->b:Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;->I(Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl$a;->b:Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;->J(Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl$a;->b:Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;->K(Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;)Ljava/util/List;

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

    iget-object v0, p0, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl$a;->b:Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;

    invoke-static {v0, p1}, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;->L(Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;LmV5;)LmV5;

    iget-object v0, p0, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl$a;->b:Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;

    invoke-static {v0, p1}, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;->M(Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;LmV5;)V

    iget-object v0, p0, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl$a;->b:Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;->N(Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl$a;->b:Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;

    invoke-static {v0}, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;->O(Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl$a;->b:Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;

    invoke-static {v2}, Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;->G(Lco/bird/android/persistence/fleetreport/impl/FleetReportDatabase_Impl;)Ljava/util/List;

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
    .locals 22

    move-object/from16 v0, p1

    new-instance v1, Ljava/util/HashMap;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, LtY5$a;

    const-string v4, "period"

    const-string v5, "TEXT"

    const/4 v6, 0x1

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x1

    move-object v3, v2

    invoke-direct/range {v3 .. v9}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "period"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v5, "subheading"

    const-string v6, "TEXT"

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "subheading"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v5, "scoreboards"

    const-string v6, "TEXT"

    const/4 v7, 0x1

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "scoreboards"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v5, "sections"

    const-string v6, "TEXT"

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "sections"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v5, "fleet_id"

    const-string v6, "TEXT"

    const/4 v8, 0x1

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "fleet_id"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v5, "page"

    const-string v6, "TEXT"

    const/4 v8, 0x3

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "page"

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashSet;

    const/4 v5, 0x0

    invoke-direct {v2, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v7, LtY5;

    const-string v8, "fleet_reports"

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

    const-string v3, "fleet_reports(co.bird.android.model.persistence.FleetReport).\n Expected:\n"

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

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    new-instance v2, LtY5$a;

    const-string v8, "start_date"

    const-string v9, "TEXT"

    const/4 v10, 0x1

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x1

    move-object v7, v2

    invoke-direct/range {v7 .. v13}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "start_date"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "end_date"

    const-string v10, "TEXT"

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v14, 0x1

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "end_date"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "granularity"

    const-string v10, "TEXT"

    const/4 v12, 0x3

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v7, "granularity"

    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v9, "fleet_id"

    const-string v10, "TEXT"

    const/4 v12, 0x5

    move-object v8, v2

    invoke-direct/range {v8 .. v14}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LtY5$a;

    const-string v16, "page"

    const-string v17, "TEXT"

    const/16 v18, 0x1

    const/16 v19, 0x4

    const/16 v20, 0x0

    const/16 v21, 0x1

    move-object v15, v2

    invoke-direct/range {v15 .. v21}, LtY5$a;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v5}, Ljava/util/HashSet;-><init>(I)V

    new-instance v4, LtY5;

    const-string v7, "fleet_report_period"

    invoke-direct {v4, v7, v1, v2, v3}, LtY5;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    invoke-static {v0, v7}, LtY5;->a(LmV5;Ljava/lang/String;)LtY5;

    move-result-object v0

    invoke-virtual {v4, v0}, LtY5;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, LGb5$c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fleet_report_period(co.bird.android.model.persistence.FleetReportPeriod).\n Expected:\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v5, v0}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v1

    :cond_1
    new-instance v0, LGb5$c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LGb5$c;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method
