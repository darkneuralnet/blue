.class public LYm$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYm;->b(Ljava/util/List;)Lio/reactivex/F;
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
        "Lco/bird/android/model/persistence/Area;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LHb5;

.field public final synthetic c:LYm;


# direct methods
.method public constructor <init>(LYm;LHb5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYm$d;->c:LYm;

    iput-object p2, p0, LYm$d;->b:LHb5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 109
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Area;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v1, p0

    iget-object v0, v1, LYm$d;->c:LYm;

    invoke-static {v0}, LYm;->m(LYm;)LEb5;

    move-result-object v0

    iget-object v2, v1, LYm$d;->b:LHb5;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4}, LIF0;->c(LEb5;LpV5;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    const-string v0, "id"

    invoke-static {v2, v0}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    const-string v5, "title"

    invoke-static {v2, v5}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v5

    const-string v6, "label"

    invoke-static {v2, v6}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v6

    const-string v7, "notes"

    invoke-static {v2, v7}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v7

    const-string v8, "hide_birds"

    invoke-static {v2, v8}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v8

    const-string v9, "reject_drops"

    invoke-static {v2, v9}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v9

    const-string v10, "no_rides"

    invoke-static {v2, v10}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v10

    const-string v11, "no_parking"

    invoke-static {v2, v11}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v11

    const-string v12, "preferred_parking"

    invoke-static {v2, v12}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v12

    const-string v13, "delivery"

    invoke-static {v2, v13}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v13

    const-string v14, "release_constrained"

    invoke-static {v2, v14}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v14

    const-string v15, "is_demand_area"

    invoke-static {v2, v15}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v15

    const-string v3, "fee_modified"

    invoke-static {v2, v3}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    const-string v4, "demand_level"

    invoke-static {v2, v4}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v4

    const-string v1, "overlay_label"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v16, v1

    const-string v1, "overlay_icon"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v17, v1

    const-string v1, "overlay_min_zoom_level"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v18, v1

    const-string v1, "selected_overlay_label"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v19, v1

    const-string v1, "region"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v20, v1

    const-string v1, "color"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v21, v1

    const-string v1, "color_dark"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v22, v1

    const-string v1, "border_color"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v23, v1

    const-string v1, "border_color_dark"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v24, v1

    const-string v1, "title_color"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v25, v1

    const-string v1, "title_color_dark"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v26, v1

    const-string v1, "zoom_behavior"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v27, v1

    const-string v1, "operational"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v28, v1

    const-string v1, "max_speed"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v29, v1

    const-string v1, "release_capacity"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v30, v1

    const-string v1, "no_parking_fine_alert_title"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v31, v1

    const-string v1, "no_parking_fine_alert_message"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v32, v1

    const-string v1, "rider_bar_in_ride_message_title"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v33, v1

    const-string v1, "rider_bar_in_ride_message_body"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v34, v1

    const-string v1, "rider_bar_not_in_ride_message_title"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v35, v1

    const-string v1, "rider_bar_not_in_ride_message_body"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v36, v1

    const-string v1, "rider_bar_in_ride_message_icon_type"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v37, v1

    const-string v1, "rider_bar_not_in_ride_message_icon_type"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v38, v1

    const-string v1, "area_release_capacity_icon_type"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v39, v1

    const-string v1, "partner_id"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v40, v1

    const-string v1, "fleet_ids"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v41, v1

    const-string v1, "area_keys"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v42, v1

    const-string v1, "universal"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v43, v1

    const-string v1, "no_parking_fine_currency"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v44, v1

    const-string v1, "no_parking_warning_alert_title"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v45, v1

    const-string v1, "no_parking_warning_alert_body"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v46, v1

    const-string v1, "no_parking_fine_amount"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v47, v1

    const-string v1, "areas_merged"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v48, v1

    const-string v1, "center_point"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v49, v1

    const-string v1, "role"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v50, v1

    const-string v1, "updatedAt"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v51, v1

    const-string v1, "zone_id"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v52, v1

    const-string v1, "walkway"

    invoke-static {v2, v1}, LfF0;->e(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    move/from16 v53, v1

    new-instance v1, Ljava/util/ArrayList;

    move/from16 v54, v4

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_35

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_0

    const/16 v56, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v56, v4

    :goto_1
    invoke-interface {v2, v5}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v57, 0x0

    goto :goto_2

    :cond_1
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v57, v4

    :goto_2
    invoke-interface {v2, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v58, 0x0

    goto :goto_3

    :cond_2
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v58, v4

    :goto_3
    invoke-interface {v2, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v59, 0x0

    goto :goto_4

    :cond_3
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v59, v4

    :goto_4
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    const/16 v55, 0x1

    if-eqz v4, :cond_4

    move/from16 v60, v55

    goto :goto_5

    :cond_4
    const/16 v60, 0x0

    :goto_5
    invoke-interface {v2, v9}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    if-eqz v4, :cond_5

    move/from16 v61, v55

    goto :goto_6

    :cond_5
    const/16 v61, 0x0

    :goto_6
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    if-eqz v4, :cond_6

    move/from16 v62, v55

    goto :goto_7

    :cond_6
    const/16 v62, 0x0

    :goto_7
    invoke-interface {v2, v11}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    if-eqz v4, :cond_7

    move/from16 v63, v55

    goto :goto_8

    :cond_7
    const/16 v63, 0x0

    :goto_8
    invoke-interface {v2, v12}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    if-eqz v4, :cond_8

    move/from16 v64, v55

    goto :goto_9

    :cond_8
    const/16 v64, 0x0

    :goto_9
    invoke-interface {v2, v13}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    if-eqz v4, :cond_9

    move/from16 v65, v55

    goto :goto_a

    :cond_9
    const/16 v65, 0x0

    :goto_a
    invoke-interface {v2, v14}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    if-eqz v4, :cond_a

    move/from16 v66, v55

    goto :goto_b

    :cond_a
    const/16 v66, 0x0

    :goto_b
    invoke-interface {v2, v15}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    if-eqz v4, :cond_b

    move/from16 v67, v55

    goto :goto_c

    :cond_b
    const/16 v67, 0x0

    :goto_c
    invoke-interface {v2, v3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_c

    const/4 v4, 0x0

    goto :goto_d

    :cond_c
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :goto_d
    if-nez v4, :cond_d

    move/from16 v4, v54

    const/16 v68, 0x0

    goto :goto_f

    :cond_d
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-eqz v4, :cond_e

    move/from16 v4, v55

    goto :goto_e

    :cond_e
    const/4 v4, 0x0

    :goto_e
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    move-object/from16 v68, v4

    move/from16 v4, v54

    :goto_f
    invoke-interface {v2, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v54

    if-eqz v54, :cond_f

    const/16 v69, 0x0

    :goto_10
    move/from16 v108, v16

    move/from16 v16, v0

    move/from16 v0, v108

    goto :goto_11

    :cond_f
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v54

    invoke-static/range {v54 .. v54}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v54

    move-object/from16 v69, v54

    goto :goto_10

    :goto_11
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v54

    if-eqz v54, :cond_10

    const/16 v70, 0x0

    :goto_12
    move/from16 v108, v17

    move/from16 v17, v0

    move/from16 v0, v108

    goto :goto_13

    :cond_10
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v54

    move-object/from16 v70, v54

    goto :goto_12

    :goto_13
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v54

    if-eqz v54, :cond_11

    const/16 v54, 0x0

    goto :goto_14

    :cond_11
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v54

    :goto_14
    invoke-static/range {v54 .. v54}, LWm;->a(Ljava/lang/String;)Lco/bird/android/model/constant/AreaIconType;

    move-result-object v71

    move/from16 v54, v0

    move/from16 v0, v18

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v18

    if-eqz v18, :cond_12

    move/from16 v18, v0

    move/from16 v0, v19

    const/16 v72, 0x0

    goto :goto_15

    :cond_12
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v18

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    move-object/from16 v72, v18

    move/from16 v18, v0

    move/from16 v0, v19

    :goto_15
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v19

    if-eqz v19, :cond_13

    move/from16 v19, v0

    move/from16 v0, v20

    const/16 v73, 0x0

    goto :goto_16

    :cond_13
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v19

    move-object/from16 v73, v19

    move/from16 v19, v0

    move/from16 v0, v20

    :goto_16
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v20

    if-eqz v20, :cond_14

    const/16 v20, 0x0

    goto :goto_17

    :cond_14
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v20

    :goto_17
    invoke-static/range {v20 .. v20}, LWm;->e(Ljava/lang/String;)Lco/bird/android/model/Polygon;

    move-result-object v74

    move/from16 v20, v0

    move/from16 v0, v21

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v75

    move/from16 v21, v0

    move/from16 v0, v22

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v22

    if-eqz v22, :cond_15

    move/from16 v22, v0

    move/from16 v0, v23

    const/16 v76, 0x0

    goto :goto_18

    :cond_15
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v22

    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v22

    move-object/from16 v76, v22

    move/from16 v22, v0

    move/from16 v0, v23

    :goto_18
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v77

    move/from16 v23, v0

    move/from16 v0, v24

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v24

    if-eqz v24, :cond_16

    move/from16 v24, v0

    move/from16 v0, v25

    const/16 v78, 0x0

    goto :goto_19

    :cond_16
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v24

    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v24

    move-object/from16 v78, v24

    move/from16 v24, v0

    move/from16 v0, v25

    :goto_19
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v79

    move/from16 v25, v0

    move/from16 v0, v26

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v26

    if-eqz v26, :cond_17

    move/from16 v26, v0

    move/from16 v0, v27

    const/16 v80, 0x0

    goto :goto_1a

    :cond_17
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v26

    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v26

    move-object/from16 v80, v26

    move/from16 v26, v0

    move/from16 v0, v27

    :goto_1a
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v27

    if-eqz v27, :cond_18

    const/16 v27, 0x0

    goto :goto_1b

    :cond_18
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v27

    :goto_1b
    invoke-static/range {v27 .. v27}, LWm;->f(Ljava/lang/String;)Lco/bird/android/model/constant/ZoomBehavior;

    move-result-object v81

    move/from16 v27, v0

    move/from16 v0, v28

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v28

    if-eqz v28, :cond_19

    move/from16 v28, v0

    move/from16 v0, v29

    move/from16 v82, v55

    goto :goto_1c

    :cond_19
    move/from16 v28, v0

    move/from16 v0, v29

    const/16 v82, 0x0

    :goto_1c
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v29

    if-eqz v29, :cond_1a

    move/from16 v29, v0

    move/from16 v0, v30

    const/16 v83, 0x0

    goto :goto_1d

    :cond_1a
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v29

    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v29

    move-object/from16 v83, v29

    move/from16 v29, v0

    move/from16 v0, v30

    :goto_1d
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v30

    if-eqz v30, :cond_1b

    move/from16 v30, v0

    move/from16 v0, v31

    const/16 v84, 0x0

    goto :goto_1e

    :cond_1b
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v30

    invoke-static/range {v30 .. v30}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v30

    move-object/from16 v84, v30

    move/from16 v30, v0

    move/from16 v0, v31

    :goto_1e
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v31

    if-eqz v31, :cond_1c

    move/from16 v31, v0

    move/from16 v0, v32

    const/16 v85, 0x0

    goto :goto_1f

    :cond_1c
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v31

    move-object/from16 v85, v31

    move/from16 v31, v0

    move/from16 v0, v32

    :goto_1f
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v32

    if-eqz v32, :cond_1d

    move/from16 v32, v0

    move/from16 v0, v33

    const/16 v86, 0x0

    goto :goto_20

    :cond_1d
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v32

    move-object/from16 v86, v32

    move/from16 v32, v0

    move/from16 v0, v33

    :goto_20
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v33

    if-eqz v33, :cond_1e

    move/from16 v33, v0

    move/from16 v0, v34

    const/16 v87, 0x0

    goto :goto_21

    :cond_1e
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v33

    move-object/from16 v87, v33

    move/from16 v33, v0

    move/from16 v0, v34

    :goto_21
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v34

    if-eqz v34, :cond_1f

    move/from16 v34, v0

    move/from16 v0, v35

    const/16 v88, 0x0

    goto :goto_22

    :cond_1f
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v34

    move-object/from16 v88, v34

    move/from16 v34, v0

    move/from16 v0, v35

    :goto_22
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v35

    if-eqz v35, :cond_20

    move/from16 v35, v0

    move/from16 v0, v36

    const/16 v89, 0x0

    goto :goto_23

    :cond_20
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v35

    move-object/from16 v89, v35

    move/from16 v35, v0

    move/from16 v0, v36

    :goto_23
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v36

    if-eqz v36, :cond_21

    move/from16 v36, v0

    move/from16 v0, v37

    const/16 v90, 0x0

    goto :goto_24

    :cond_21
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v36

    move-object/from16 v90, v36

    move/from16 v36, v0

    move/from16 v0, v37

    :goto_24
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v37

    if-eqz v37, :cond_22

    const/16 v37, 0x0

    goto :goto_25

    :cond_22
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v37

    :goto_25
    invoke-static/range {v37 .. v37}, LWm;->a(Ljava/lang/String;)Lco/bird/android/model/constant/AreaIconType;

    move-result-object v91

    move/from16 v37, v0

    move/from16 v0, v38

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v38

    if-eqz v38, :cond_23

    const/16 v38, 0x0

    goto :goto_26

    :cond_23
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v38

    :goto_26
    invoke-static/range {v38 .. v38}, LWm;->a(Ljava/lang/String;)Lco/bird/android/model/constant/AreaIconType;

    move-result-object v92

    move/from16 v38, v0

    move/from16 v0, v39

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v39

    if-eqz v39, :cond_24

    const/16 v39, 0x0

    goto :goto_27

    :cond_24
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v39

    :goto_27
    invoke-static/range {v39 .. v39}, LWm;->a(Ljava/lang/String;)Lco/bird/android/model/constant/AreaIconType;

    move-result-object v93

    move/from16 v39, v0

    move/from16 v0, v40

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v40

    if-eqz v40, :cond_25

    move/from16 v40, v0

    move/from16 v0, v41

    const/16 v94, 0x0

    goto :goto_28

    :cond_25
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v40

    move-object/from16 v94, v40

    move/from16 v40, v0

    move/from16 v0, v41

    :goto_28
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v41

    if-eqz v41, :cond_26

    const/16 v41, 0x0

    goto :goto_29

    :cond_26
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v41

    :goto_29
    invoke-static/range {v41 .. v41}, Lco/bird/android/persistence/common/impl/Converters;->q(Ljava/lang/String;)Ljava/util/List;

    move-result-object v95

    move/from16 v41, v0

    move/from16 v0, v42

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v42

    if-eqz v42, :cond_27

    const/16 v42, 0x0

    goto :goto_2a

    :cond_27
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v42

    :goto_2a
    invoke-static/range {v42 .. v42}, Lco/bird/android/persistence/common/impl/Converters;->q(Ljava/lang/String;)Ljava/util/List;

    move-result-object v96

    move/from16 v42, v0

    move/from16 v0, v43

    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v43

    if-eqz v43, :cond_28

    move/from16 v43, v0

    move/from16 v0, v44

    move/from16 v97, v55

    goto :goto_2b

    :cond_28
    move/from16 v43, v0

    move/from16 v0, v44

    const/16 v97, 0x0

    :goto_2b
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v44

    if-eqz v44, :cond_29

    move/from16 v44, v0

    move/from16 v0, v45

    const/16 v98, 0x0

    goto :goto_2c

    :cond_29
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v44

    move-object/from16 v98, v44

    move/from16 v44, v0

    move/from16 v0, v45

    :goto_2c
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v45

    if-eqz v45, :cond_2a

    move/from16 v45, v0

    move/from16 v0, v46

    const/16 v99, 0x0

    goto :goto_2d

    :cond_2a
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v45

    move-object/from16 v99, v45

    move/from16 v45, v0

    move/from16 v0, v46

    :goto_2d
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v46

    if-eqz v46, :cond_2b

    move/from16 v46, v0

    move/from16 v0, v47

    const/16 v100, 0x0

    goto :goto_2e

    :cond_2b
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v46

    move-object/from16 v100, v46

    move/from16 v46, v0

    move/from16 v0, v47

    :goto_2e
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v47

    if-eqz v47, :cond_2c

    move/from16 v47, v0

    move/from16 v0, v48

    const/16 v101, 0x0

    goto :goto_2f

    :cond_2c
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v47

    invoke-static/range {v47 .. v47}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v47

    move-object/from16 v101, v47

    move/from16 v47, v0

    move/from16 v0, v48

    :goto_2f
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v48

    if-eqz v48, :cond_2d

    const/16 v48, 0x0

    goto :goto_30

    :cond_2d
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v48

    :goto_30
    invoke-static/range {v48 .. v48}, Lco/bird/android/persistence/common/impl/Converters;->q(Ljava/lang/String;)Ljava/util/List;

    move-result-object v102

    move/from16 v48, v0

    move/from16 v0, v49

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v49

    if-eqz v49, :cond_2e

    const/16 v49, 0x0

    goto :goto_31

    :cond_2e
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v49

    :goto_31
    invoke-static/range {v49 .. v49}, Lco/bird/android/persistence/common/impl/Converters;->h(Ljava/lang/String;)Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v103

    move/from16 v49, v0

    move/from16 v0, v50

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v50

    if-eqz v50, :cond_2f

    move/from16 v50, v0

    move/from16 v0, v51

    const/16 v104, 0x0

    goto :goto_32

    :cond_2f
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v50

    move-object/from16 v104, v50

    move/from16 v50, v0

    move/from16 v0, v51

    :goto_32
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v51

    if-eqz v51, :cond_30

    const/16 v51, 0x0

    goto :goto_33

    :cond_30
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v51

    :goto_33
    invoke-static/range {v51 .. v51}, Lco/bird/android/persistence/common/impl/Converters;->f(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v105

    move/from16 v51, v0

    move/from16 v0, v52

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v52

    if-eqz v52, :cond_31

    move/from16 v52, v0

    move/from16 v0, v53

    const/16 v106, 0x0

    goto :goto_34

    :cond_31
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v52

    move-object/from16 v106, v52

    move/from16 v52, v0

    move/from16 v0, v53

    :goto_34
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v53

    if-eqz v53, :cond_32

    const/16 v53, 0x0

    goto :goto_35

    :cond_32
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v53

    invoke-static/range {v53 .. v53}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v53

    :goto_35
    if-nez v53, :cond_33

    move/from16 v53, v0

    const/16 v107, 0x0

    goto :goto_37

    :cond_33
    invoke-virtual/range {v53 .. v53}, Ljava/lang/Integer;->intValue()I

    move-result v53

    if-eqz v53, :cond_34

    goto :goto_36

    :cond_34
    const/16 v55, 0x0

    :goto_36
    invoke-static/range {v55 .. v55}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v53

    move-object/from16 v107, v53

    move/from16 v53, v0

    :goto_37
    new-instance v0, Lco/bird/android/model/persistence/Area;

    move-object/from16 v55, v0

    invoke-direct/range {v55 .. v107}, Lco/bird/android/model/persistence/Area;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/Polygon;ILjava/lang/Integer;ILjava/lang/Integer;ILjava/lang/Integer;Lco/bird/android/model/constant/ZoomBehavior;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Lco/bird/android/model/constant/AreaIconType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/Boolean;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v0, v16

    move/from16 v16, v17

    move/from16 v17, v54

    move/from16 v54, v4

    goto/16 :goto_0

    :cond_35
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

    invoke-virtual {p0}, LYm$d;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public finalize()V
    .locals 1

    iget-object v0, p0, LYm$d;->b:LHb5;

    invoke-virtual {v0}, LHb5;->release()V

    return-void
.end method
