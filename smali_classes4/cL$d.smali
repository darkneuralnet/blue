.class public LcL$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LcL;->a(Ljava/lang/String;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lco/bird/android/model/persistence/Bird;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:LHb5;

.field public final synthetic c:LcL;


# direct methods
.method public constructor <init>(LcL;LHb5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LcL$d;->c:LcL;

    iput-object p2, p0, LcL$d;->b:LHb5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lco/bird/android/model/persistence/Bird;
    .locals 128
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v1, p0

    iget-object v0, v1, LcL$d;->c:LcL;

    invoke-static {v0}, LcL;->m(LcL;)LEb5;

    move-result-object v0

    iget-object v2, v1, LcL$d;->b:LHb5;

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

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v64

    if-eqz v64, :cond_3f

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v64

    if-eqz v64, :cond_0

    const/16 v65, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v65, v0

    :goto_0
    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v66, 0x0

    goto :goto_1

    :cond_1
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v66, v0

    :goto_1
    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v67, 0x0

    goto :goto_2

    :cond_2
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v67, v0

    :goto_2
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v68

    invoke-interface {v2, v8}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v69, 0x0

    goto :goto_3

    :cond_3
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v69, v0

    :goto_3
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getInt(I)I

    move-result v70

    invoke-interface {v2, v10}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    goto :goto_4

    :cond_4
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_4
    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->h(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v71

    invoke-interface {v2, v11}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v72, 0x0

    goto :goto_5

    :cond_5
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v72, v0

    :goto_5
    invoke-interface {v2, v12}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v73, 0x0

    goto :goto_6

    :cond_6
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v73, v0

    :goto_6
    invoke-interface {v2, v13}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_7

    const/16 v74, 0x0

    goto :goto_7

    :cond_7
    invoke-interface {v2, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v74, v0

    :goto_7
    invoke-interface {v2, v14}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    const/4 v5, 0x1

    if-eqz v0, :cond_8

    move/from16 v75, v5

    goto :goto_8

    :cond_8
    const/16 v75, 0x0

    :goto_8
    invoke-interface {v2, v15}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_9

    move/from16 v76, v5

    goto :goto_9

    :cond_9
    const/16 v76, 0x0

    :goto_9
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_a

    move/from16 v77, v5

    goto :goto_a

    :cond_a
    const/16 v77, 0x0

    :goto_a
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_b

    move/from16 v78, v5

    move/from16 v0, v16

    goto :goto_b

    :cond_b
    move/from16 v0, v16

    const/16 v78, 0x0

    :goto_b
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_c

    move/from16 v79, v5

    move/from16 v0, v17

    goto :goto_c

    :cond_c
    move/from16 v0, v17

    const/16 v79, 0x0

    :goto_c
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_d

    move/from16 v80, v5

    move/from16 v0, v18

    goto :goto_d

    :cond_d
    move/from16 v0, v18

    const/16 v80, 0x0

    :goto_d
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_e

    move/from16 v81, v5

    move/from16 v0, v19

    goto :goto_e

    :cond_e
    move/from16 v0, v19

    const/16 v81, 0x0

    :goto_e
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_f

    move/from16 v82, v5

    move/from16 v0, v20

    goto :goto_f

    :cond_f
    move/from16 v0, v20

    const/16 v82, 0x0

    :goto_f
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_10

    move/from16 v83, v5

    move/from16 v0, v21

    goto :goto_10

    :cond_10
    move/from16 v0, v21

    const/16 v83, 0x0

    :goto_10
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_11

    const/4 v0, 0x0

    goto :goto_11

    :cond_11
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_11
    invoke-static {v0}, LaL;->d(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/BirdLabel;

    move-result-object v84

    move/from16 v0, v22

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_12

    const/4 v0, 0x0

    goto :goto_12

    :cond_12
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_12
    invoke-static {v0}, LaL;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v85

    move/from16 v0, v23

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_13

    move/from16 v0, v24

    const/16 v86, 0x0

    goto :goto_13

    :cond_13
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v86, v0

    move/from16 v0, v24

    :goto_13
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_14

    move/from16 v0, v25

    const/16 v87, 0x0

    goto :goto_14

    :cond_14
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v87, v0

    move/from16 v0, v25

    :goto_14
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_15

    move/from16 v0, v26

    const/16 v88, 0x0

    goto :goto_15

    :cond_15
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v88, v0

    move/from16 v0, v26

    :goto_15
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_16

    move/from16 v89, v5

    move/from16 v0, v27

    goto :goto_16

    :cond_16
    move/from16 v0, v27

    const/16 v89, 0x0

    :goto_16
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_17

    move/from16 v90, v5

    move/from16 v0, v28

    goto :goto_17

    :cond_17
    move/from16 v0, v28

    const/16 v90, 0x0

    :goto_17
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_18

    const/4 v0, 0x0

    goto :goto_18

    :cond_18
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_18
    invoke-static {v0}, LaL;->g(Ljava/lang/String;)Lco/bird/android/model/constant/BountyKind;

    move-result-object v91

    move/from16 v0, v29

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_19

    move/from16 v0, v30

    const/16 v92, 0x0

    goto :goto_19

    :cond_19
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v92, v0

    move/from16 v0, v30

    :goto_19
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1a

    const/4 v0, 0x0

    goto :goto_1a

    :cond_1a
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1a
    invoke-static {v0}, LaL;->f(Ljava/lang/String;)Lco/bird/android/model/constant/BirdTaskKind;

    move-result-object v93

    move/from16 v0, v31

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1b

    const/4 v0, 0x0

    goto :goto_1b

    :cond_1b
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1b
    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v94

    move/from16 v0, v32

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1c

    const/4 v0, 0x0

    goto :goto_1c

    :cond_1c
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1c
    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v95

    move/from16 v0, v33

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_1d

    move/from16 v0, v34

    const/16 v96, 0x0

    goto :goto_1d

    :cond_1d
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v96, v0

    move/from16 v0, v34

    :goto_1d
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_1e

    move/from16 v97, v5

    move/from16 v0, v35

    goto :goto_1e

    :cond_1e
    move/from16 v0, v35

    const/16 v97, 0x0

    :goto_1e
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_1f

    move/from16 v98, v5

    move/from16 v0, v36

    goto :goto_1f

    :cond_1f
    move/from16 v0, v36

    const/16 v98, 0x0

    :goto_1f
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_20

    const/4 v0, 0x0

    goto :goto_20

    :cond_20
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_20
    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v99

    move/from16 v0, v37

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_21

    const/4 v0, 0x0

    goto :goto_21

    :cond_21
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_21
    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v100

    move/from16 v0, v38

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_22

    move/from16 v101, v5

    move/from16 v0, v39

    goto :goto_22

    :cond_22
    move/from16 v0, v39

    const/16 v101, 0x0

    :goto_22
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_23

    move/from16 v0, v40

    const/16 v102, 0x0

    goto :goto_23

    :cond_23
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v102, v0

    move/from16 v0, v40

    :goto_23
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_24

    move/from16 v0, v41

    const/16 v103, 0x0

    goto :goto_24

    :cond_24
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v103, v0

    move/from16 v0, v41

    :goto_24
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_25

    const/4 v0, 0x0

    goto :goto_25

    :cond_25
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_25
    invoke-static {v0}, LaL;->y(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;

    move-result-object v104

    move/from16 v0, v42

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_26

    const/4 v0, 0x0

    goto :goto_26

    :cond_26
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_26
    invoke-static {v0}, LaL;->z(Ljava/lang/String;)Ljava/util/List;

    move-result-object v105

    move/from16 v0, v43

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_27

    move/from16 v106, v5

    move/from16 v0, v44

    goto :goto_27

    :cond_27
    move/from16 v0, v44

    const/16 v106, 0x0

    :goto_27
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_28

    move/from16 v107, v5

    move/from16 v0, v45

    goto :goto_28

    :cond_28
    move/from16 v0, v45

    const/16 v107, 0x0

    :goto_28
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_29

    move/from16 v108, v5

    move/from16 v0, v46

    goto :goto_29

    :cond_29
    move/from16 v0, v46

    const/16 v108, 0x0

    :goto_29
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_2a

    move/from16 v0, v47

    const/16 v109, 0x0

    goto :goto_2a

    :cond_2a
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v109, v0

    move/from16 v0, v47

    :goto_2a
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_2b

    move/from16 v0, v48

    const/16 v110, 0x0

    goto :goto_2b

    :cond_2b
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v110, v0

    move/from16 v0, v48

    :goto_2b
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_2c

    const/4 v0, 0x0

    goto :goto_2c

    :cond_2c
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_2c
    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v111

    move/from16 v0, v49

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_2d

    const/4 v0, 0x0

    goto :goto_2d

    :cond_2d
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_2d
    invoke-static {v0}, LaL;->x(Ljava/lang/String;)Lco/bird/android/model/constant/PartnerBirdState;

    move-result-object v112

    move/from16 v0, v50

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_2e

    move/from16 v113, v5

    move/from16 v0, v51

    goto :goto_2e

    :cond_2e
    move/from16 v0, v51

    const/16 v113, 0x0

    :goto_2e
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_2f

    move/from16 v114, v5

    move/from16 v0, v52

    goto :goto_2f

    :cond_2f
    move/from16 v0, v52

    const/16 v114, 0x0

    :goto_2f
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_30

    const/4 v0, 0x0

    goto :goto_30

    :cond_30
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_30
    invoke-static {v0}, LaL;->u(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    move-result-object v115

    move/from16 v0, v53

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_31

    move/from16 v116, v5

    move/from16 v0, v54

    goto :goto_31

    :cond_31
    move/from16 v0, v54

    const/16 v116, 0x0

    :goto_31
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_32

    const/4 v0, 0x0

    goto :goto_32

    :cond_32
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_32
    invoke-static {v0}, LaL;->e(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;

    move-result-object v117

    move/from16 v0, v55

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_33

    move/from16 v0, v56

    const/16 v118, 0x0

    goto :goto_33

    :cond_33
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v118, v0

    move/from16 v0, v56

    :goto_33
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_34

    const/4 v0, 0x0

    goto :goto_34

    :cond_34
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_34
    invoke-static {v0}, LaL;->w(Ljava/lang/String;)Lco/bird/android/model/constant/NestPurpose;

    move-result-object v119

    move/from16 v0, v57

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_35

    const/4 v0, 0x0

    goto :goto_35

    :cond_35
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_35
    invoke-static {v0}, LaL;->A(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

    move-result-object v120

    move/from16 v0, v58

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_36

    const/4 v0, 0x0

    goto :goto_36

    :cond_36
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_36
    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v121

    move/from16 v0, v59

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_37

    const/4 v0, 0x0

    goto :goto_37

    :cond_37
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_37
    invoke-static {v0}, LaL;->v(Ljava/lang/String;)Lco/bird/android/model/constant/MapPinBadge;

    move-result-object v122

    move/from16 v0, v60

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_38

    const/4 v0, 0x0

    goto :goto_38

    :cond_38
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_38
    invoke-static {v0}, LaL;->i(Ljava/lang/String;)Ljava/util/List;

    move-result-object v123

    move/from16 v0, v61

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_39

    move/from16 v0, v62

    const/16 v124, 0x0

    goto :goto_39

    :cond_39
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v124, v0

    move/from16 v0, v62

    :goto_39
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_3a

    move/from16 v0, v63

    const/16 v125, 0x0

    goto :goto_3a

    :cond_3a
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v125, v0

    move/from16 v0, v63

    :goto_3a
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v3

    if-eqz v3, :cond_3b

    const/4 v0, 0x0

    goto :goto_3b

    :cond_3b
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_3b
    if-nez v0, :cond_3c

    const/16 v126, 0x0

    goto :goto_3d

    :cond_3c
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_3d

    move v3, v5

    goto :goto_3c

    :cond_3d
    const/4 v3, 0x0

    :goto_3c
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 v126, v0

    :goto_3d
    invoke-interface {v2, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v0

    if-eqz v0, :cond_3e

    const/4 v4, 0x0

    goto :goto_3e

    :cond_3e
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    :goto_3e
    invoke-static {v4}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v127

    new-instance v4, Lco/bird/android/model/persistence/Bird;

    move-object/from16 v64, v4

    invoke-direct/range {v64 .. v127}, Lco/bird/android/model/persistence/Bird;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/persistence/nestedstructures/BirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/persistence/nestedstructures/Lifecycle;ZLco/bird/android/model/persistence/nestedstructures/BirdLicenseView;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/persistence/nestedstructures/PrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3f

    :cond_3f
    const/4 v4, 0x0

    :goto_3f
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    return-object v4

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

    invoke-virtual {p0}, LcL$d;->a()Lco/bird/android/model/persistence/Bird;

    move-result-object v0

    return-object v0
.end method

.method public finalize()V
    .locals 1

    iget-object v0, p0, LcL$d;->b:LHb5;

    invoke-virtual {v0}, LHb5;->release()V

    return-void
.end method
