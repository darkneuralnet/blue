.class public final LRz0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRz0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001a\u000c\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u00a8\u0006\u0007"
    }
    d2 = {
        "Lco/bird/android/model/constant/ContainerOrderStatus;",
        "",
        "b",
        "Landroid/content/Context;",
        "context",
        "",
        "a",
        "co.bird.android.feature.transfer-order"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nContainerOrderStatus+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContainerOrderStatus+.kt\nco/bird/android/feature/transferorder/extensions/ContainerOrderStatus_Kt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/constant/ContainerOrderStatus;Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LRz0$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    sget p0, Lnl4;->model_name_unknown:I

    goto :goto_0

    :pswitch_1
    sget p0, Lnl4;->return_to_sender:I

    goto :goto_0

    :pswitch_2
    sget p0, Lnl4;->received:I

    goto :goto_0

    :pswitch_3
    sget p0, Lnl4;->ready_for_pickup:I

    goto :goto_0

    :pswitch_4
    sget p0, Lnl4;->completed:I

    goto :goto_0

    :pswitch_5
    sget p0, Lnl4;->transfer_order_status_checked_in:I

    goto :goto_0

    :pswitch_6
    sget p0, Lnl4;->pending:I

    goto :goto_0

    :pswitch_7
    sget p0, Lnl4;->canceled:I

    goto :goto_0

    :pswitch_8
    sget p0, Lnl4;->transfer_order_status_in_transit:I

    :goto_0
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
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

.method public static final b(Lco/bird/android/model/constant/ContainerOrderStatus;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LRz0$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    sget p0, LDf4;->primaryText:I

    goto :goto_0

    :pswitch_0
    sget p0, LDf4;->birdGreen:I

    goto :goto_0

    :pswitch_1
    sget p0, LDf4;->birdRed:I

    goto :goto_0

    :pswitch_2
    sget p0, LDf4;->birdYellow:I

    :goto_0
    return p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
