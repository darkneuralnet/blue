.class public final LyK2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LyK2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001a\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000c\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0007\u00a8\u0006\u0007"
    }
    d2 = {
        "Lco/bird/android/model/constant/MapMarkerKind;",
        "Landroid/content/Context;",
        "context",
        "Landroid/graphics/drawable/Drawable;",
        "b",
        "",
        "a",
        "extension_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/constant/MapMarkerKind;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LyK2$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    sget p0, Lrg4;->marker_operator_regular:I

    goto/16 :goto_0

    :pswitch_0
    sget p0, Lrg4;->ic_marker_operator_rebalance_for_transport:I

    goto/16 :goto_0

    :pswitch_1
    sget p0, Lrg4;->ic_marker_operator_private_property:I

    goto/16 :goto_0

    :pswitch_2
    sget p0, Lrg4;->ic_map_marker_peril:I

    goto :goto_0

    :pswitch_3
    sget p0, Lrg4;->ic_map_marker_inspection_white_bg:I

    goto :goto_0

    :pswitch_4
    sget p0, Lrg4;->marker_operator_down:I

    goto :goto_0

    :pswitch_5
    sget p0, Lrg4;->marker_operator_collect:I

    goto :goto_0

    :pswitch_6
    sget p0, Lrg4;->ic_marker_operator_captive_recovery:I

    goto :goto_0

    :pswitch_7
    sget p0, Lrg4;->ic_gift:I

    goto :goto_0

    :pswitch_8
    sget p0, Lrg4;->ic_arrow_market:I

    goto :goto_0

    :pswitch_9
    sget p0, Lrg4;->ic_home_hold:I

    goto :goto_0

    :pswitch_a
    sget p0, Lrg4;->ic_truck_facility:I

    goto :goto_0

    :pswitch_b
    sget p0, Lrg4;->ic_pin_debrain:I

    goto :goto_0

    :pswitch_c
    sget p0, Lrg4;->ic_marker_operator_ulm:I

    goto :goto_0

    :pswitch_d
    sget p0, Lrg4;->ic_map_marker_submerged:I

    goto :goto_0

    :pswitch_e
    sget p0, Lrg4;->marker_operator_regular:I

    goto :goto_0

    :pswitch_f
    sget p0, Lrg4;->ic_marker_operator_radar:I

    goto :goto_0

    :pswitch_10
    sget p0, Lrg4;->ic_marker_operator_property:I

    goto :goto_0

    :pswitch_11
    sget p0, Lrg4;->ic_marker_operator_peril_rebalance:I

    goto :goto_0

    :pswitch_12
    sget p0, Lrg4;->ic_map_marker_debrained:I

    goto :goto_0

    :pswitch_13
    sget p0, Lrg4;->ic_marker_operator_lipo:I

    goto :goto_0

    :pswitch_14
    sget p0, Lrg4;->ic_marker_operator_legal_preserve:I

    goto :goto_0

    :pswitch_15
    sget p0, Lrg4;->ic_marker_operator_move:I

    goto :goto_0

    :pswitch_16
    sget p0, Lrg4;->ic_marker_operator_missing:I

    goto :goto_0

    :pswitch_17
    sget p0, Lrg4;->ic_marker_operator_in_task:I

    goto :goto_0

    :pswitch_18
    sget p0, Lrg4;->ic_marker_operator_in_ride:I

    goto :goto_0

    :pswitch_19
    sget p0, Lrg4;->ic_marker_operator_designated:I

    goto :goto_0

    :pswitch_1a
    sget p0, Lrg4;->ic_marker_operator_damaged:I

    goto :goto_0

    :pswitch_1b
    sget p0, Lrg4;->ic_marker_operator_charge:I

    :goto_0
    return p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final b(Lco/bird/android/model/constant/MapMarkerKind;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LyK2$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    sget p0, Lrg4;->ic_badge_available:I

    goto :goto_0

    :pswitch_0
    sget p0, Lrg4;->ic_gift:I

    goto :goto_0

    :pswitch_1
    sget p0, Lrg4;->ic_arrow_market:I

    goto :goto_0

    :pswitch_2
    sget p0, Lrg4;->ic_home_hold:I

    goto :goto_0

    :pswitch_3
    sget p0, Lrg4;->ic_truck_facility:I

    goto :goto_0

    :pswitch_4
    sget p0, Lrg4;->ic_pin_debrain:I

    goto :goto_0

    :pswitch_5
    sget p0, Lrg4;->ic_badge_ulm:I

    goto :goto_0

    :pswitch_6
    sget p0, Lrg4;->ic_badge_submerged:I

    goto :goto_0

    :pswitch_7
    sget p0, Lrg4;->ic_badge_available:I

    goto :goto_0

    :pswitch_8
    sget p0, Lrg4;->ic_badge_radar:I

    goto :goto_0

    :pswitch_9
    sget p0, Lrg4;->ic_badge_property_report:I

    goto :goto_0

    :pswitch_a
    sget p0, Lrg4;->ic_badge_area:I

    goto :goto_0

    :pswitch_b
    sget p0, Lrg4;->ic_badge_offline:I

    goto :goto_0

    :pswitch_c
    sget p0, Lrg4;->ic_badge_lipo:I

    goto :goto_0

    :pswitch_d
    sget p0, Lrg4;->ic_badge_legal_preserve:I

    goto :goto_0

    :pswitch_e
    sget p0, Lrg4;->ic_badge_rebalance:I

    goto :goto_0

    :pswitch_f
    sget p0, Lrg4;->ic_badge_missing:I

    goto :goto_0

    :pswitch_10
    sget p0, Lrg4;->ic_badge_in_task:I

    goto :goto_0

    :pswitch_11
    sget p0, Lrg4;->ic_badge_in_ride:I

    goto :goto_0

    :pswitch_12
    sget p0, Lrg4;->ic_badge_designated:I

    goto :goto_0

    :pswitch_13
    sget p0, Lrg4;->ic_badge_damaged:I

    goto :goto_0

    :pswitch_14
    sget p0, Lrg4;->ic_badge_charge:I

    :goto_0
    invoke-static {p1, p0}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
