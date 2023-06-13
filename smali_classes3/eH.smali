.class public final LeH;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LeH$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a\u000c\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\u000c\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0007\u00a8\u0006\u0004"
    }
    d2 = {
        "Lco/bird/android/model/constant/BirdAction;",
        "",
        "b",
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
.method public static final a(Lco/bird/android/model/constant/BirdAction;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LeH$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    sget p0, Lnl4;->bird_action_unknown:I

    goto/16 :goto_0

    :pswitch_1
    sget p0, Lol4;->empty:I

    goto/16 :goto_0

    :pswitch_2
    sget p0, Lnl4;->bird_action_unknown:I

    goto/16 :goto_0

    :pswitch_3
    sget p0, Lnl4;->bird_action_unknown:I

    goto/16 :goto_0

    :pswitch_4
    sget p0, Lol4;->empty:I

    goto/16 :goto_0

    :pswitch_5
    sget p0, Lnl4;->bird_action_sleep_success:I

    goto/16 :goto_0

    :pswitch_6
    sget p0, Lnl4;->bird_action_wake_success:I

    goto/16 :goto_0

    :pswitch_7
    sget p0, Lnl4;->bird_action_unknown:I

    goto/16 :goto_0

    :pswitch_8
    sget p0, Lnl4;->bird_action_unknown:I

    goto :goto_0

    :pswitch_9
    sget p0, Lnl4;->bird_action_search_nearby_success:I

    goto :goto_0

    :pswitch_a
    sget p0, Lnl4;->bird_action_validate_release_success:I

    goto :goto_0

    :pswitch_b
    sget p0, Lnl4;->bird_action_needs_parts_success:I

    goto :goto_0

    :pswitch_c
    sget p0, Lnl4;->bird_action_report_fraud_success:I

    goto :goto_0

    :pswitch_d
    sget p0, Lnl4;->bird_action_continue_repair_success:I

    goto :goto_0

    :pswitch_e
    sget p0, Lnl4;->bird_action_start_repair_success:I

    goto :goto_0

    :pswitch_f
    sget p0, Lnl4;->bird_action_damaged_charge_success:I

    goto :goto_0

    :pswitch_10
    sget p0, Lnl4;->bird_action_damaged_charge_success:I

    goto :goto_0

    :pswitch_11
    sget p0, Lnl4;->bird_action_cancel_task_success:I

    goto :goto_0

    :pswitch_12
    sget p0, Lnl4;->bird_action_complete_charge_success:I

    goto :goto_0

    :pswitch_13
    sget p0, Lnl4;->bird_action_start_charge_success:I

    goto :goto_0

    :pswitch_14
    sget p0, Lnl4;->bird_action_alarm_off_success:I

    goto :goto_0

    :pswitch_15
    sget p0, Lnl4;->bird_action_alarm_on_success:I

    goto :goto_0

    :pswitch_16
    sget p0, Lnl4;->bird_action_alarm_success:I

    goto :goto_0

    :pswitch_17
    sget p0, Lnl4;->bird_action_alarm_success:I

    goto :goto_0

    :pswitch_18
    sget p0, Lnl4;->bird_action_lock_success:I

    goto :goto_0

    :pswitch_19
    sget p0, Lnl4;->bird_action_unlock_success:I

    goto :goto_0

    :pswitch_1a
    sget p0, Lnl4;->bird_action_release_success:I

    goto :goto_0

    :pswitch_1b
    sget p0, Lnl4;->bird_action_capture_success:I

    goto :goto_0

    :pswitch_1c
    sget p0, Lnl4;->bird_action_mark_lost_success:I

    goto :goto_0

    :pswitch_1d
    sget p0, Lnl4;->bird_action_mark_found_success:I

    goto :goto_0

    :pswitch_1e
    sget p0, Lnl4;->bird_action_mark_damaged_success:I

    goto :goto_0

    :pswitch_1f
    sget p0, Lnl4;->bird_action_mark_fixed_success:I

    goto :goto_0

    :pswitch_20
    sget p0, Lnl4;->bird_action_cannot_access_success:I

    goto :goto_0

    :pswitch_21
    sget p0, Lnl4;->bird_action_mark_missing_success:I

    :goto_0
    return p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
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

.method public static final b(Lco/bird/android/model/constant/BirdAction;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LeH$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    sget p0, Lnl4;->bird_action_unknown:I

    goto/16 :goto_0

    :pswitch_1
    sget p0, Lnl4;->bird_action_remove_from_list:I

    goto/16 :goto_0

    :pswitch_2
    sget p0, Lnl4;->bird_action_unknown:I

    goto/16 :goto_0

    :pswitch_3
    sget p0, Lnl4;->bird_action_unknown:I

    goto/16 :goto_0

    :pswitch_4
    sget p0, Lnl4;->bird_action_remove_from_list:I

    goto/16 :goto_0

    :pswitch_5
    sget p0, Lnl4;->bird_action_sleep:I

    goto/16 :goto_0

    :pswitch_6
    sget p0, Lnl4;->bird_action_wake:I

    goto/16 :goto_0

    :pswitch_7
    sget p0, Lnl4;->bird_action_unknown:I

    goto/16 :goto_0

    :pswitch_8
    sget p0, Lnl4;->bird_action_unknown:I

    goto :goto_0

    :pswitch_9
    sget p0, Lnl4;->bird_action_search_nearby:I

    goto :goto_0

    :pswitch_a
    sget p0, Lnl4;->bird_action_validate_release:I

    goto :goto_0

    :pswitch_b
    sget p0, Lnl4;->bird_action_needs_parts:I

    goto :goto_0

    :pswitch_c
    sget p0, Lnl4;->bird_action_report_fraud:I

    goto :goto_0

    :pswitch_d
    sget p0, Lnl4;->bird_action_continue_repair:I

    goto :goto_0

    :pswitch_e
    sget p0, Lnl4;->bird_action_start_repair:I

    goto :goto_0

    :pswitch_f
    sget p0, Lnl4;->bird_action_repair:I

    goto :goto_0

    :pswitch_10
    sget p0, Lnl4;->bird_action_damaged_charge:I

    goto :goto_0

    :pswitch_11
    sget p0, Lnl4;->bird_action_cancel_task:I

    goto :goto_0

    :pswitch_12
    sget p0, Lnl4;->bird_action_complete_charge:I

    goto :goto_0

    :pswitch_13
    sget p0, Lnl4;->bird_action_start_charge:I

    goto :goto_0

    :pswitch_14
    sget p0, Lnl4;->bird_action_alarm_off:I

    goto :goto_0

    :pswitch_15
    sget p0, Lnl4;->bird_action_alarm_on:I

    goto :goto_0

    :pswitch_16
    sget p0, Lnl4;->bird_action_chirp_alarm:I

    goto :goto_0

    :pswitch_17
    sget p0, Lnl4;->bird_action_alarm:I

    goto :goto_0

    :pswitch_18
    sget p0, Lnl4;->bird_action_lock:I

    goto :goto_0

    :pswitch_19
    sget p0, Lnl4;->bird_action_unlock:I

    goto :goto_0

    :pswitch_1a
    sget p0, Lnl4;->bird_action_release:I

    goto :goto_0

    :pswitch_1b
    sget p0, Lnl4;->bird_action_capture:I

    goto :goto_0

    :pswitch_1c
    sget p0, Lnl4;->bird_action_mark_lost:I

    goto :goto_0

    :pswitch_1d
    sget p0, Lnl4;->bird_action_mark_found:I

    goto :goto_0

    :pswitch_1e
    sget p0, Lnl4;->bird_action_report_damaged:I

    goto :goto_0

    :pswitch_1f
    sget p0, Lnl4;->bird_action_mark_fixed:I

    goto :goto_0

    :pswitch_20
    sget p0, Lnl4;->bird_action_cannot_capture:I

    goto :goto_0

    :pswitch_21
    sget p0, Lnl4;->bird_action_mark_missing:I

    :goto_0
    return p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
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
