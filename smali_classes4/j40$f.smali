.class public Lj40$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj40;->d(Lco/bird/android/model/constant/BulkScanPurpose;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/util/List<",
        "Lco/bird/android/model/persistence/Bird;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LHb5;

.field public final synthetic c:Lj40;


# direct methods
.method public constructor <init>(Lj40;LHb5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lj40$f;->c:Lj40;

    iput-object p2, p0, Lj40$f;->b:LHb5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 131
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Bird;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v1, p0

    iget-object v0, v1, Lj40$f;->c:Lj40;

    invoke-static {v0}, Lj40;->e(Lj40;)LEb5;

    move-result-object v0

    iget-object v2, v1, Lj40$f;->b:LHb5;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, LIF0;->c(LEb5;LpV5;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    const-string v0, "id"

    invoke-static {v2, v0}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v5, "model"

    invoke-static {v2, v5}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "task_id"

    invoke-static {v2, v6}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "battery_level"

    invoke-static {v2, v7}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "estimated_range"

    invoke-static {v2, v8}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "distance"

    invoke-static {v2, v9}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "location"

    invoke-static {v2, v10}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    const-string v11, "code"

    invoke-static {v2, v11}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    const-string v12, "sticker_id"

    invoke-static {v2, v12}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v12

    const-string v13, "serial_number"

    invoke-static {v2, v13}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v13

    const-string v14, "disconnected"

    invoke-static {v2, v14}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v14

    const-string v15, "accident"

    invoke-static {v2, v15}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v15

    const-string v3, "submerged"

    invoke-static {v2, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    const-string v4, "lost"

    invoke-static {v2, v4}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    const-string v1, "locked"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v16, v1

    const-string v1, "ack_locked"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v17, v1

    const-string v1, "captive"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v18, v1

    const-string v1, "gps_fix"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v19, v1

    const-string v1, "broken"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v20, v1

    const-string v1, "label"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v21, v1

    const-string v1, "actions"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v22, v1

    const-string v1, "bounty_id"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v23, v1

    const-string v1, "bounty_price"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v24, v1

    const-string v1, "bounty_currency"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v25, v1

    const-string v1, "bounty_lost"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v26, v1

    const-string v1, "bounty_overdue"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v27, v1

    const-string v1, "bounty_kind"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v28, v1

    const-string v1, "brand_name"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v29, v1

    const-string v1, "task_kind"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v30, v1

    const-string v1, "gps_at"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v31, v1

    const-string v1, "tracked_at"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v32, v1

    const-string v1, "token"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v33, v1

    const-string v1, "bluetooth"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v34, v1

    const-string v1, "cellular"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v35, v1

    const-string v1, "started_at"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v36, v1

    const-string v1, "due_at"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v37, v1

    const-string v1, "asleep"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v38, v1

    const-string v1, "imei"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v39, v1

    const-string v1, "board_protocol"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v40, v1

    const-string v1, "physical_lock"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v41, v1

    const-string v1, "physical_locks"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v42, v1

    const-string v1, "priority_collect"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v43, v1

    const-string v1, "down"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v44, v1

    const-string v1, "needs_inspection"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v45, v1

    const-string v1, "partner_id"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v46, v1

    const-string v1, "nest_id"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v47, v1

    const-string v1, "last_ride_ended_at"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v48, v1

    const-string v1, "partner_bird_state"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v49, v1

    const-string v1, "peril"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v50, v1

    const-string v1, "deliverable"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v51, v1

    const-string v1, "lifecycle"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v52, v1

    const-string v1, "offline"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v53, v1

    const-string v1, "license"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v54, v1

    const-string v1, "area_key"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v55, v1

    const-string v1, "nest_purpose"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v56, v1

    const-string v1, "private_bird"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v57, v1

    const-string v1, "scanned_at"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v58, v1

    const-string v1, "badge_type"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v59, v1

    const-string v1, "bounty_reasons"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v60, v1

    const-string v1, "ephemeral_id"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v61, v1

    const-string v1, "ble_mac_address"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v62, v1

    const-string v1, "has_helmet"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v63, v1

    const-string v1, "location_updated_at"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v64, v1

    new-instance v1, Ljava/util/ArrayList;

    move/from16 v65, v4

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_3f

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_0

    const/16 v67, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v67, v4

    :goto_1
    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v68, 0x0

    goto :goto_2

    :cond_1
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v68, v4

    :goto_2
    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v69, 0x0

    goto :goto_3

    :cond_2
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v69, v4

    :goto_3
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v70

    invoke-interface {v2, v8}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v71, 0x0

    goto :goto_4

    :cond_3
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v71, v4

    :goto_4
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getInt(I)I

    move-result v72

    invoke-interface {v2, v10}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, 0x0

    goto :goto_5

    :cond_4
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    :goto_5
    invoke-static {v4}, Lco/bird/android/persistence/common/impl/Converters;->h(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v73

    invoke-interface {v2, v11}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v74, 0x0

    goto :goto_6

    :cond_5
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v74, v4

    :goto_6
    invoke-interface {v2, v12}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v75, 0x0

    goto :goto_7

    :cond_6
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v75, v4

    :goto_7
    invoke-interface {v2, v13}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v76, 0x0

    goto :goto_8

    :cond_7
    invoke-interface {v2, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v76, v4

    :goto_8
    invoke-interface {v2, v14}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    const/16 v66, 0x1

    if-eqz v4, :cond_8

    move/from16 v77, v66

    goto :goto_9

    :cond_8
    const/16 v77, 0x0

    :goto_9
    invoke-interface {v2, v15}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    if-eqz v4, :cond_9

    move/from16 v78, v66

    goto :goto_a

    :cond_9
    const/16 v78, 0x0

    :goto_a
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    if-eqz v4, :cond_a

    move/from16 v4, v65

    move/from16 v79, v66

    goto :goto_b

    :cond_a
    move/from16 v4, v65

    const/16 v79, 0x0

    :goto_b
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v65

    if-eqz v65, :cond_b

    move/from16 v80, v66

    goto :goto_c

    :cond_b
    const/16 v80, 0x0

    :goto_c
    move/from16 v130, v16

    move/from16 v16, v0

    move/from16 v0, v130

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v65

    if-eqz v65, :cond_c

    move/from16 v81, v66

    goto :goto_d

    :cond_c
    const/16 v81, 0x0

    :goto_d
    move/from16 v130, v17

    move/from16 v17, v0

    move/from16 v0, v130

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v65

    if-eqz v65, :cond_d

    move/from16 v82, v66

    goto :goto_e

    :cond_d
    const/16 v82, 0x0

    :goto_e
    move/from16 v130, v18

    move/from16 v18, v0

    move/from16 v0, v130

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v65

    if-eqz v65, :cond_e

    move/from16 v83, v66

    goto :goto_f

    :cond_e
    const/16 v83, 0x0

    :goto_f
    move/from16 v130, v19

    move/from16 v19, v0

    move/from16 v0, v130

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v65

    if-eqz v65, :cond_f

    move/from16 v84, v66

    goto :goto_10

    :cond_f
    const/16 v84, 0x0

    :goto_10
    move/from16 v130, v20

    move/from16 v20, v0

    move/from16 v0, v130

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v65

    if-eqz v65, :cond_10

    move/from16 v85, v66

    goto :goto_11

    :cond_10
    const/16 v85, 0x0

    :goto_11
    move/from16 v130, v21

    move/from16 v21, v0

    move/from16 v0, v130

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v65

    if-eqz v65, :cond_11

    const/16 v65, 0x0

    goto :goto_12

    :cond_11
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v65

    :goto_12
    invoke-static/range {v65 .. v65}, LaL;->d(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/BirdLabel;

    move-result-object v86

    move/from16 v65, v0

    move/from16 v0, v22

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v22

    if-eqz v22, :cond_12

    const/16 v22, 0x0

    goto :goto_13

    :cond_12
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v22

    :goto_13
    invoke-static/range {v22 .. v22}, LaL;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v87

    move/from16 v22, v0

    move/from16 v0, v23

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v23

    if-eqz v23, :cond_13

    move/from16 v23, v0

    move/from16 v0, v24

    const/16 v88, 0x0

    goto :goto_14

    :cond_13
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v23

    move-object/from16 v88, v23

    move/from16 v23, v0

    move/from16 v0, v24

    :goto_14
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v24

    if-eqz v24, :cond_14

    move/from16 v24, v0

    move/from16 v0, v25

    const/16 v89, 0x0

    goto :goto_15

    :cond_14
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v24

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v24

    move-object/from16 v89, v24

    move/from16 v24, v0

    move/from16 v0, v25

    :goto_15
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v25

    if-eqz v25, :cond_15

    move/from16 v25, v0

    move/from16 v0, v26

    const/16 v90, 0x0

    goto :goto_16

    :cond_15
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v25

    move-object/from16 v90, v25

    move/from16 v25, v0

    move/from16 v0, v26

    :goto_16
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v26

    if-eqz v26, :cond_16

    move/from16 v26, v0

    move/from16 v0, v27

    move/from16 v91, v66

    goto :goto_17

    :cond_16
    move/from16 v26, v0

    move/from16 v0, v27

    const/16 v91, 0x0

    :goto_17
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v27

    if-eqz v27, :cond_17

    move/from16 v27, v0

    move/from16 v0, v28

    move/from16 v92, v66

    goto :goto_18

    :cond_17
    move/from16 v27, v0

    move/from16 v0, v28

    const/16 v92, 0x0

    :goto_18
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v28

    if-eqz v28, :cond_18

    const/16 v28, 0x0

    goto :goto_19

    :cond_18
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v28

    :goto_19
    invoke-static/range {v28 .. v28}, LaL;->g(Ljava/lang/String;)Lco/bird/android/model/constant/BountyKind;

    move-result-object v93

    move/from16 v28, v0

    move/from16 v0, v29

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v29

    if-eqz v29, :cond_19

    move/from16 v29, v0

    move/from16 v0, v30

    const/16 v94, 0x0

    goto :goto_1a

    :cond_19
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v29

    move-object/from16 v94, v29

    move/from16 v29, v0

    move/from16 v0, v30

    :goto_1a
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v30

    if-eqz v30, :cond_1a

    const/16 v30, 0x0

    goto :goto_1b

    :cond_1a
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v30

    :goto_1b
    invoke-static/range {v30 .. v30}, LaL;->f(Ljava/lang/String;)Lco/bird/android/model/constant/BirdTaskKind;

    move-result-object v95

    move/from16 v30, v0

    move/from16 v0, v31

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v31

    if-eqz v31, :cond_1b

    const/16 v31, 0x0

    goto :goto_1c

    :cond_1b
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v31

    :goto_1c
    invoke-static/range {v31 .. v31}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v96

    move/from16 v31, v0

    move/from16 v0, v32

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v32

    if-eqz v32, :cond_1c

    const/16 v32, 0x0

    goto :goto_1d

    :cond_1c
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v32

    :goto_1d
    invoke-static/range {v32 .. v32}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v97

    move/from16 v32, v0

    move/from16 v0, v33

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v33

    if-eqz v33, :cond_1d

    move/from16 v33, v0

    move/from16 v0, v34

    const/16 v98, 0x0

    goto :goto_1e

    :cond_1d
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v33

    move-object/from16 v98, v33

    move/from16 v33, v0

    move/from16 v0, v34

    :goto_1e
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v34

    if-eqz v34, :cond_1e

    move/from16 v34, v0

    move/from16 v0, v35

    move/from16 v99, v66

    goto :goto_1f

    :cond_1e
    move/from16 v34, v0

    move/from16 v0, v35

    const/16 v99, 0x0

    :goto_1f
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v35

    if-eqz v35, :cond_1f

    move/from16 v35, v0

    move/from16 v0, v36

    move/from16 v100, v66

    goto :goto_20

    :cond_1f
    move/from16 v35, v0

    move/from16 v0, v36

    const/16 v100, 0x0

    :goto_20
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v36

    if-eqz v36, :cond_20

    const/16 v36, 0x0

    goto :goto_21

    :cond_20
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v36

    :goto_21
    invoke-static/range {v36 .. v36}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v101

    move/from16 v36, v0

    move/from16 v0, v37

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v37

    if-eqz v37, :cond_21

    const/16 v37, 0x0

    goto :goto_22

    :cond_21
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v37

    :goto_22
    invoke-static/range {v37 .. v37}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v102

    move/from16 v37, v0

    move/from16 v0, v38

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v38

    if-eqz v38, :cond_22

    move/from16 v38, v0

    move/from16 v0, v39

    move/from16 v103, v66

    goto :goto_23

    :cond_22
    move/from16 v38, v0

    move/from16 v0, v39

    const/16 v103, 0x0

    :goto_23
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v39

    if-eqz v39, :cond_23

    move/from16 v39, v0

    move/from16 v0, v40

    const/16 v104, 0x0

    goto :goto_24

    :cond_23
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v39

    move-object/from16 v104, v39

    move/from16 v39, v0

    move/from16 v0, v40

    :goto_24
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v40

    if-eqz v40, :cond_24

    move/from16 v40, v0

    move/from16 v0, v41

    const/16 v105, 0x0

    goto :goto_25

    :cond_24
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v40

    move-object/from16 v105, v40

    move/from16 v40, v0

    move/from16 v0, v41

    :goto_25
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v41

    if-eqz v41, :cond_25

    const/16 v41, 0x0

    goto :goto_26

    :cond_25
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v41

    :goto_26
    invoke-static/range {v41 .. v41}, LaL;->y(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;

    move-result-object v106

    move/from16 v41, v0

    move/from16 v0, v42

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v42

    if-eqz v42, :cond_26

    const/16 v42, 0x0

    goto :goto_27

    :cond_26
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v42

    :goto_27
    invoke-static/range {v42 .. v42}, LaL;->z(Ljava/lang/String;)Ljava/util/List;

    move-result-object v107

    move/from16 v42, v0

    move/from16 v0, v43

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v43

    if-eqz v43, :cond_27

    move/from16 v43, v0

    move/from16 v0, v44

    move/from16 v108, v66

    goto :goto_28

    :cond_27
    move/from16 v43, v0

    move/from16 v0, v44

    const/16 v108, 0x0

    :goto_28
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v44

    if-eqz v44, :cond_28

    move/from16 v44, v0

    move/from16 v0, v45

    move/from16 v109, v66

    goto :goto_29

    :cond_28
    move/from16 v44, v0

    move/from16 v0, v45

    const/16 v109, 0x0

    :goto_29
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v45

    if-eqz v45, :cond_29

    move/from16 v45, v0

    move/from16 v0, v46

    move/from16 v110, v66

    goto :goto_2a

    :cond_29
    move/from16 v45, v0

    move/from16 v0, v46

    const/16 v110, 0x0

    :goto_2a
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v46

    if-eqz v46, :cond_2a

    move/from16 v46, v0

    move/from16 v0, v47

    const/16 v111, 0x0

    goto :goto_2b

    :cond_2a
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v46

    move-object/from16 v111, v46

    move/from16 v46, v0

    move/from16 v0, v47

    :goto_2b
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v47

    if-eqz v47, :cond_2b

    move/from16 v47, v0

    move/from16 v0, v48

    const/16 v112, 0x0

    goto :goto_2c

    :cond_2b
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v47

    move-object/from16 v112, v47

    move/from16 v47, v0

    move/from16 v0, v48

    :goto_2c
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v48

    if-eqz v48, :cond_2c

    const/16 v48, 0x0

    goto :goto_2d

    :cond_2c
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v48

    :goto_2d
    invoke-static/range {v48 .. v48}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v113

    move/from16 v48, v0

    move/from16 v0, v49

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v49

    if-eqz v49, :cond_2d

    const/16 v49, 0x0

    goto :goto_2e

    :cond_2d
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v49

    :goto_2e
    invoke-static/range {v49 .. v49}, LaL;->x(Ljava/lang/String;)Lco/bird/android/model/constant/PartnerBirdState;

    move-result-object v114

    move/from16 v49, v0

    move/from16 v0, v50

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v50

    if-eqz v50, :cond_2e

    move/from16 v50, v0

    move/from16 v0, v51

    move/from16 v115, v66

    goto :goto_2f

    :cond_2e
    move/from16 v50, v0

    move/from16 v0, v51

    const/16 v115, 0x0

    :goto_2f
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v51

    if-eqz v51, :cond_2f

    move/from16 v51, v0

    move/from16 v0, v52

    move/from16 v116, v66

    goto :goto_30

    :cond_2f
    move/from16 v51, v0

    move/from16 v0, v52

    const/16 v116, 0x0

    :goto_30
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v52

    if-eqz v52, :cond_30

    const/16 v52, 0x0

    goto :goto_31

    :cond_30
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v52

    :goto_31
    invoke-static/range {v52 .. v52}, LaL;->u(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    move-result-object v117

    move/from16 v52, v0

    move/from16 v0, v53

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v53

    if-eqz v53, :cond_31

    move/from16 v53, v0

    move/from16 v0, v54

    move/from16 v118, v66

    goto :goto_32

    :cond_31
    move/from16 v53, v0

    move/from16 v0, v54

    const/16 v118, 0x0

    :goto_32
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v54

    if-eqz v54, :cond_32

    const/16 v54, 0x0

    goto :goto_33

    :cond_32
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v54

    :goto_33
    invoke-static/range {v54 .. v54}, LaL;->e(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;

    move-result-object v119

    move/from16 v54, v0

    move/from16 v0, v55

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v55

    if-eqz v55, :cond_33

    move/from16 v55, v0

    move/from16 v0, v56

    const/16 v120, 0x0

    goto :goto_34

    :cond_33
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v55

    move-object/from16 v120, v55

    move/from16 v55, v0

    move/from16 v0, v56

    :goto_34
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v56

    if-eqz v56, :cond_34

    const/16 v56, 0x0

    goto :goto_35

    :cond_34
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v56

    :goto_35
    invoke-static/range {v56 .. v56}, LaL;->w(Ljava/lang/String;)Lco/bird/android/model/constant/NestPurpose;

    move-result-object v121

    move/from16 v56, v0

    move/from16 v0, v57

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v57

    if-eqz v57, :cond_35

    const/16 v57, 0x0

    goto :goto_36

    :cond_35
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v57

    :goto_36
    invoke-static/range {v57 .. v57}, LaL;->A(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

    move-result-object v122

    move/from16 v57, v0

    move/from16 v0, v58

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v58

    if-eqz v58, :cond_36

    const/16 v58, 0x0

    goto :goto_37

    :cond_36
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v58

    :goto_37
    invoke-static/range {v58 .. v58}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v123

    move/from16 v58, v0

    move/from16 v0, v59

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v59

    if-eqz v59, :cond_37

    const/16 v59, 0x0

    goto :goto_38

    :cond_37
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v59

    :goto_38
    invoke-static/range {v59 .. v59}, LaL;->v(Ljava/lang/String;)Lco/bird/android/model/constant/MapPinBadge;

    move-result-object v124

    move/from16 v59, v0

    move/from16 v0, v60

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v60

    if-eqz v60, :cond_38

    const/16 v60, 0x0

    goto :goto_39

    :cond_38
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v60

    :goto_39
    invoke-static/range {v60 .. v60}, LaL;->i(Ljava/lang/String;)Ljava/util/List;

    move-result-object v125

    move/from16 v60, v0

    move/from16 v0, v61

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v61

    if-eqz v61, :cond_39

    move/from16 v61, v0

    move/from16 v0, v62

    const/16 v126, 0x0

    goto :goto_3a

    :cond_39
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v61

    move-object/from16 v126, v61

    move/from16 v61, v0

    move/from16 v0, v62

    :goto_3a
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v62

    if-eqz v62, :cond_3a

    move/from16 v62, v0

    move/from16 v0, v63

    const/16 v127, 0x0

    goto :goto_3b

    :cond_3a
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v62

    move-object/from16 v127, v62

    move/from16 v62, v0

    move/from16 v0, v63

    :goto_3b
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v63

    if-eqz v63, :cond_3b

    const/16 v63, 0x0

    goto :goto_3c

    :cond_3b
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v63

    invoke-static/range {v63 .. v63}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v63

    :goto_3c
    if-nez v63, :cond_3c

    move/from16 v63, v0

    move/from16 v0, v64

    const/16 v128, 0x0

    goto :goto_3e

    :cond_3c
    invoke-virtual/range {v63 .. v63}, Ljava/lang/Integer;->intValue()I

    move-result v63

    if-eqz v63, :cond_3d

    goto :goto_3d

    :cond_3d
    const/16 v66, 0x0

    :goto_3d
    invoke-static/range {v66 .. v66}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v63

    move-object/from16 v128, v63

    move/from16 v63, v0

    move/from16 v0, v64

    :goto_3e
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v64

    if-eqz v64, :cond_3e

    const/16 v64, 0x0

    goto :goto_3f

    :cond_3e
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v64

    :goto_3f
    invoke-static/range {v64 .. v64}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v129

    move/from16 v64, v0

    new-instance v0, Lco/bird/android/model/persistence/Bird;

    move-object/from16 v66, v0

    invoke-direct/range {v66 .. v129}, Lco/bird/android/model/persistence/Bird;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/persistence/nestedstructures/BirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/persistence/nestedstructures/Lifecycle;ZLco/bird/android/model/persistence/nestedstructures/BirdLicenseView;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/persistence/nestedstructures/PrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v0, v16

    move/from16 v16, v17

    move/from16 v17, v18

    move/from16 v18, v19

    move/from16 v19, v20

    move/from16 v20, v21

    move/from16 v21, v65

    move/from16 v65, v4

    goto/16 :goto_0

    :cond_3f
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    return-object v1

    :catchall_0
    move-exception v0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    throw v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lj40$f;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public finalize()V
    .locals 1

    iget-object v0, p0, Lj40$f;->b:LHb5;

    invoke-virtual {v0}, LHb5;->release()V

    return-void
.end method
