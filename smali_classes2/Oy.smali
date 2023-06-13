.class public final LOy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LOy$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\r\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aO\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0014\u0010\u000f\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0000H\u0002\u001a\"\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014\u00a8\u0006\u0018"
    }
    d2 = {
        "Landroid/content/Context;",
        "",
        "isGuest",
        "",
        "guestRes",
        "hostRes",
        "",
        "fineString",
        "guestFineRes",
        "hostFineRes",
        "",
        "b",
        "(Landroid/content/Context;ZIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/CharSequence;",
        "Lco/bird/android/model/IdToolOption;",
        "context",
        "d",
        "Lco/bird/android/model/constant/ScanMode;",
        "mode",
        "Lco/bird/android/model/constant/ScanStatus;",
        "status",
        "LTq4;",
        "reactiveConfig",
        "LNy;",
        "a",
        "core-base_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanStatus;LTq4;)LNy;
    .locals 11

    const-string v0, "mode"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LTq4;->f8()LZ84;

    move-result-object p2

    invoke-virtual {p2}, LZ84;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object p2

    sget-object v0, LOy$a;->$EnumSwitchMapping$2:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eq p0, v0, :cond_14

    const/4 v3, 0x2

    const/16 v4, 0x17

    const/16 v5, 0x16

    const/16 v6, 0x13

    const/16 v7, 0x12

    const/16 v8, 0x8

    const/4 v9, 0x4

    const/4 v10, 0x3

    if-eq p0, v3, :cond_9

    if-eq p0, v10, :cond_9

    if-eq p0, v9, :cond_9

    const/4 v0, 0x5

    if-ne p0, v0, :cond_8

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, LOy$a;->$EnumSwitchMapping$1:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget v1, p0, p1

    :goto_0
    if-eq v1, v10, :cond_7

    if-eq v1, v9, :cond_6

    if-eq v1, v8, :cond_5

    if-eq v1, v7, :cond_4

    if-eq v1, v6, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    goto/16 :goto_3

    :cond_1
    sget-object v2, Lsl5;->d:Lsl5;

    goto/16 :goto_3

    :cond_2
    sget-object v2, Lkl5;->d:Lkl5;

    goto/16 :goto_3

    :cond_3
    sget-object v2, Lhk5;->d:Lhk5;

    goto/16 :goto_3

    :cond_4
    sget-object v2, Lzk5;->d:Lzk5;

    goto/16 :goto_3

    :cond_5
    new-instance v2, Ljk5;

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/RideConfig;->getMinBirdCodeLength()I

    move-result p0

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/RideConfig;->getMaxBirdCodeLength()I

    move-result p1

    invoke-direct {v2, p0, p1}, Ljk5;-><init>(II)V

    goto/16 :goto_3

    :cond_6
    sget-object v2, LxT;->d:LxT;

    goto/16 :goto_3

    :cond_7
    sget-object v2, Lgk5;->d:Lgk5;

    goto/16 :goto_3

    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_9
    if-nez p1, :cond_a

    goto :goto_1

    :cond_a
    sget-object p0, LOy$a;->$EnumSwitchMapping$1:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget v1, p0, p1

    :goto_1
    if-eq v1, v0, :cond_16

    const/16 p0, 0x1a

    if-eq v1, p0, :cond_13

    if-eq v1, v10, :cond_12

    if-eq v1, v9, :cond_11

    if-eq v1, v8, :cond_10

    const/16 p0, 0x9

    if-eq v1, p0, :cond_f

    if-eq v1, v7, :cond_e

    if-eq v1, v6, :cond_d

    if-eq v1, v5, :cond_c

    if-eq v1, v4, :cond_b

    sget-object v2, Lul5;->d:Lul5;

    goto/16 :goto_3

    :cond_b
    sget-object v2, Lsl5;->d:Lsl5;

    goto/16 :goto_3

    :cond_c
    sget-object v2, Lkl5;->d:Lkl5;

    goto/16 :goto_3

    :cond_d
    sget-object v2, Lhk5;->d:Lhk5;

    goto/16 :goto_3

    :cond_e
    sget-object v2, Lzk5;->d:Lzk5;

    goto/16 :goto_3

    :cond_f
    sget-object v2, LAk5;->d:LAk5;

    goto/16 :goto_3

    :cond_10
    new-instance v2, Ljk5;

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/RideConfig;->getMinBirdCodeLength()I

    move-result p0

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/RideConfig;->getMaxBirdCodeLength()I

    move-result p1

    invoke-direct {v2, p0, p1}, Ljk5;-><init>(II)V

    goto/16 :goto_3

    :cond_11
    sget-object v2, LxT;->d:LxT;

    goto/16 :goto_3

    :cond_12
    sget-object v2, Lgk5;->d:Lgk5;

    goto/16 :goto_3

    :cond_13
    sget-object v2, Lmk5;->d:Lmk5;

    goto/16 :goto_3

    :cond_14
    if-nez p1, :cond_15

    goto :goto_2

    :cond_15
    sget-object p0, LOy$a;->$EnumSwitchMapping$1:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget v1, p0, p1

    :goto_2
    packed-switch v1, :pswitch_data_0

    sget-object v2, Lul5;->d:Lul5;

    goto/16 :goto_3

    :pswitch_0
    sget-object v2, Ltl5;->d:Ltl5;

    goto :goto_3

    :pswitch_1
    sget-object v2, LgJ4;->d:LgJ4;

    goto :goto_3

    :pswitch_2
    sget-object v2, Lsl5;->d:Lsl5;

    goto :goto_3

    :pswitch_3
    sget-object v2, Lkl5;->d:Lkl5;

    goto :goto_3

    :pswitch_4
    sget-object v2, Lik5;->d:Lik5;

    goto :goto_3

    :pswitch_5
    sget-object v2, Lsk5;->d:Lsk5;

    goto :goto_3

    :pswitch_6
    sget-object v2, Lhk5;->d:Lhk5;

    goto :goto_3

    :pswitch_7
    sget-object v2, Lzk5;->d:Lzk5;

    goto :goto_3

    :pswitch_8
    sget-object v2, LSk5;->d:LSk5;

    goto :goto_3

    :pswitch_9
    sget-object v2, LMw2;->d:LMw2;

    goto :goto_3

    :pswitch_a
    sget-object v2, Lnk5;->d:Lnk5;

    goto :goto_3

    :pswitch_b
    sget-object v2, LAl5;->d:LAl5;

    goto :goto_3

    :pswitch_c
    sget-object v2, Lfj5;->d:Lfj5;

    goto :goto_3

    :pswitch_d
    sget-object v2, Lgj5;->d:Lgj5;

    goto :goto_3

    :pswitch_e
    sget-object v2, LXk5;->d:LXk5;

    goto :goto_3

    :pswitch_f
    new-instance v2, LZj5;

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/RideConfig;->getMinBirdCodeLength()I

    move-result p0

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/RideConfig;->getMaxBirdCodeLength()I

    move-result p1

    invoke-direct {v2, p0, p1}, LZj5;-><init>(II)V

    goto :goto_3

    :pswitch_10
    new-instance v2, Ljk5;

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/RideConfig;->getMinBirdCodeLength()I

    move-result p0

    invoke-virtual {p2}, Lco/bird/android/model/wire/configs/RideConfig;->getMaxBirdCodeLength()I

    move-result p1

    invoke-direct {v2, p0, p1}, Ljk5;-><init>(II)V

    goto :goto_3

    :pswitch_11
    sget-object v2, LVj5;->d:LVj5;

    goto :goto_3

    :pswitch_12
    sget-object v2, Lok5;->d:Lok5;

    goto :goto_3

    :pswitch_13
    sget-object v2, Llk5;->d:Llk5;

    goto :goto_3

    :pswitch_14
    sget-object v2, LxT;->d:LxT;

    goto :goto_3

    :pswitch_15
    sget-object v2, Lfk5;->d:Lfk5;

    :cond_16
    :goto_3
    :pswitch_16
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_16
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

.method public static final synthetic access$getStringForGuestAndFineCombo(Landroid/content/Context;ZIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static/range {p0 .. p6}, LOy;->b(Landroid/content/Context;ZIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$label(Lco/bird/android/model/IdToolOption;Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, LOy;->d(Lco/bird/android/model/IdToolOption;Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroid/content/Context;ZIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/CharSequence;
    .locals 0

    if-eqz p4, :cond_1

    if-eqz p6, :cond_1

    if-eqz p5, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p6}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_0
    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    const/4 p3, 0x0

    aput-object p4, p2, p3

    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "{\n    getString(if (isGu\u2026ineRes }, fineString)\n  }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    move p2, p3

    :goto_1
    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const-string p1, "{\n    getString(if (isGu\u2026s } else { hostRes })\n  }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    return-object p0
.end method

.method public static synthetic c(Landroid/content/Context;ZIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Object;)Ljava/lang/CharSequence;
    .locals 9

    and-int/lit8 v0, p7, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object v6, p4

    :goto_0
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_1

    move-object v7, v1

    goto :goto_1

    :cond_1
    move-object v7, p5

    :goto_1
    and-int/lit8 v0, p7, 0x20

    if-eqz v0, :cond_2

    move-object v8, v1

    goto :goto_2

    :cond_2
    move-object v8, p6

    :goto_2
    move-object v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    invoke-static/range {v2 .. v8}, LOy;->b(Landroid/content/Context;ZIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public static final d(Lco/bird/android/model/IdToolOption;Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    sget-object v0, LOy$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    sget p0, Lnl4;->part_physical_lock_sticker:I

    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :pswitch_1
    sget p0, Lnl4;->part_helmet:I

    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :pswitch_2
    sget p0, Lnl4;->id_tools_beacon_label:I

    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :pswitch_3
    sget p0, Lnl4;->id_tools_pcm_label:I

    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :pswitch_4
    sget p0, Lnl4;->id_tools_us_ca_plate_label:I

    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :pswitch_5
    sget p0, Lnl4;->id_tools_il_license_plate_label:I

    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :pswitch_6
    sget p0, Lnl4;->id_tools_german_license_plate_label:I

    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :pswitch_7
    sget p0, Lnl4;->id_tools_motor_label:I

    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :pswitch_8
    sget p0, Lnl4;->id_tools_battery_serial_label:I

    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :pswitch_9
    sget p0, Lnl4;->id_tools_one_code_label:I

    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :pswitch_a
    sget p0, Lnl4;->id_tools_handlebar_label:I

    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :pswitch_b
    sget p0, Lnl4;->id_tools_brain_label:I

    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :pswitch_c
    sget p0, Lnl4;->id_tools_license_plate_label:I

    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :pswitch_d
    sget p0, Lnl4;->id_tools_qr_code_label:I

    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    :goto_0
    const-string p1, "when (this) {\n  IdToolOp\u2026_physical_lock_sticker)\n}"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
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
