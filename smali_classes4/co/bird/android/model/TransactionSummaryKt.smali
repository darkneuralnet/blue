.class public final Lco/bird/android/model/TransactionSummaryKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/TransactionSummaryKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0011\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "auxiliaryDescriptionRes",
        "",
        "Lco/bird/android/model/TransactionSummary;",
        "(Lco/bird/android/model/TransactionSummary;)Ljava/lang/Integer;",
        "model_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final auxiliaryDescriptionRes(Lco/bird/android/model/TransactionSummary;)Ljava/lang/Integer;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/TransactionSummary;->getTransaction()Lco/bird/android/model/TransactionSummaryTransaction;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/TransactionSummaryTransaction;->getTransactionKind()Lco/bird/android/model/constant/IncomingTransactionKind;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p0}, Lco/bird/android/model/TransactionSummary;->getTransaction()Lco/bird/android/model/TransactionSummaryTransaction;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lco/bird/android/model/TransactionSummaryTransaction;->getSourceKind()Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    invoke-virtual {p0}, Lco/bird/android/model/TransactionSummary;->getCharge()Lco/bird/android/model/TransactionSummaryAdhocCharge;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lco/bird/android/model/TransactionSummaryAdhocCharge;->getFeatureKind()Lco/bird/android/model/TransactionSummaryChargeFeatureKind;

    move-result-object p0

    goto :goto_2

    :cond_2
    move-object p0, v1

    :goto_2
    if-eqz p0, :cond_5

    sget-object v3, Lco/bird/android/model/TransactionSummaryChargeFeatureKind;->UNKNOWN:Lco/bird/android/model/TransactionSummaryChargeFeatureKind;

    if-eq p0, v3, :cond_5

    sget-object v0, Lco/bird/android/model/TransactionSummaryKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    sget p0, Lnl4;->bird_model_unknown:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_3

    :cond_3
    sget p0, Lnl4;->ride_pass_purchase:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_3

    :cond_4
    sget p0, Lnl4;->bird_plus_subscription:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    :goto_3
    return-object p0

    :cond_5
    sget-object p0, Lco/bird/android/model/constant/IncomingTransactionKind;->CREDIT:Lco/bird/android/model/constant/IncomingTransactionKind;

    if-ne v0, p0, :cond_6

    if-eqz v2, :cond_6

    sget-object p0, Lco/bird/android/model/TransactionSummaryKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p0, p0, v0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    sget p0, Lnl4;->transaction_history_item_credit:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_4

    :pswitch_1
    sget p0, Lnl4;->transaction_history_item_balance_reload:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_4

    :pswitch_2
    sget p0, Lnl4;->transaction_history_item_balance_bonus:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_4

    :pswitch_3
    sget p0, Lnl4;->transaction_history_item_negative_balance_charge:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_4

    :pswitch_4
    sget p0, Lnl4;->transaction_history_item_support:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    :goto_4
    return-object p0

    :cond_6
    if-eqz v2, :cond_7

    sget-object p0, Lco/bird/android/model/TransactionSummaryKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p0, p0, v0

    packed-switch p0, :pswitch_data_1

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_5
    sget p0, Lnl4;->transaction_history_item_lease_initial_charge:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_5

    :pswitch_6
    sget p0, Lnl4;->transaction_history_item_lease_delinquent_fee:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_5

    :pswitch_7
    sget p0, Lnl4;->long_term_rental_transaction_history_description:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_5

    :pswitch_8
    sget p0, Lnl4;->transaction_history_item_delivery:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_5

    :pswitch_9
    sget p0, Lnl4;->transaction_history_item_support:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_7
    :goto_5
    :pswitch_a
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_9
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_8
        :pswitch_a
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_a
        :pswitch_a
    .end packed-switch
.end method
