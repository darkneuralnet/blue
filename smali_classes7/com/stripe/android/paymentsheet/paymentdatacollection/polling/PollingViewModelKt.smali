.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModelKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001a#\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u000c\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u000c"
    }
    d2 = {
        "Lkotlin/time/Duration;",
        "duration",
        "LEu1;",
        "countdownFlow-LRDsOJo",
        "(J)LEu1;",
        "countdownFlow",
        "Lcom/stripe/android/model/StripeIntent$Status;",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;",
        "toPollingState",
        "",
        "KEY_CURRENT_POLLING_START_TIME",
        "Ljava/lang/String;",
        "paymentsheet_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field private static final KEY_CURRENT_POLLING_START_TIME:Ljava/lang/String; = "KEY_CURRENT_POLLING_START_TIME"


# direct methods
.method public static final synthetic access$countdownFlow-LRDsOJo(J)LEu1;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModelKt;->countdownFlow-LRDsOJo(J)LEu1;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toPollingState(Lcom/stripe/android/model/StripeIntent$Status;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModelKt;->toPollingState(Lcom/stripe/android/model/StripeIntent$Status;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    move-result-object p0

    return-object p0
.end method

.method private static final countdownFlow-LRDsOJo(J)LEu1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "LEu1<",
            "Lkotlin/time/Duration;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModelKt$countdownFlow$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModelKt$countdownFlow$1;-><init>(JLkotlin/coroutines/Continuation;)V

    invoke-static {v0}, LVu1;->E(Lkotlin/jvm/functions/Function2;)LEu1;

    move-result-object p0

    return-object p0
.end method

.method private static final toPollingState(Lcom/stripe/android/model/StripeIntent$Status;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModelKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    sget-object p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;->Failed:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    goto :goto_0

    :pswitch_1
    sget-object p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;->Success:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    goto :goto_0

    :pswitch_2
    sget-object p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;->Active:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingState;

    :goto_0
    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
