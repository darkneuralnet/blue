.class public final Lo76$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo76;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/TransactionSummary;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/TransactionSummary;",
        "kotlin.jvm.PlatformType",
        "summary",
        "",
        "a",
        "(Lco/bird/android/model/TransactionSummary;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTransactionHistoryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionHistoryPresenter.kt\nco/bird/android/app/feature/transactionhistory/TransactionHistoryPresenterImpl$onCreate$8\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lo76;


# direct methods
.method public constructor <init>(Lo76;)V
    .locals 0

    iput-object p1, p0, Lo76$h;->g:Lo76;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/TransactionSummary;)V
    .locals 13

    invoke-virtual {p1}, Lco/bird/android/model/TransactionSummary;->getRide()Lco/bird/android/model/TransactionSummaryRide;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/TransactionSummaryRide;->getRideEndRidePhotoParkingEvaluation()Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lo76$h;->g:Lo76;

    invoke-static {v2}, Lo76;->access$getAnalyticsManager$p(Lo76;)LEa;

    move-result-object v2

    new-instance v12, LQR4;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;->getId()Ljava/lang/String;

    move-result-object v3

    move-object v7, v3

    goto :goto_1

    :cond_1
    move-object v7, v1

    :goto_1
    invoke-static {v0}, Lco/bird/android/model/PhotoReviewStatusKt;->toPhotoReviewStatus(Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lco/bird/android/model/TransactionSummary;->getRide()Lco/bird/android/model/TransactionSummaryRide;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lco/bird/android/model/TransactionSummaryRide;->getId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    :cond_2
    const-string v0, ""

    :cond_3
    move-object v9, v0

    const/4 v10, 0x7

    const/4 v11, 0x0

    move-object v3, v12

    invoke-direct/range {v3 .. v11}, LQR4;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v12}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    invoke-virtual {p1}, Lco/bird/android/model/TransactionSummary;->getRide()Lco/bird/android/model/TransactionSummaryRide;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/TransactionSummary;->getCharge()Lco/bird/android/model/TransactionSummaryAdhocCharge;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lco/bird/android/model/TransactionSummaryAdhocCharge;->getReceiptId()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_4
    move-object v2, v1

    :goto_2
    const/4 v3, 0x0

    if-eqz v2, :cond_6

    iget-object v0, p0, Lo76$h;->g:Lo76;

    invoke-static {v0}, Lo76;->access$getNavigator$p(Lo76;)Le13;

    move-result-object v0

    const-string v4, "summary"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lco/bird/android/model/TransactionSummaryKt;->auxiliaryDescriptionRes(Lco/bird/android/model/TransactionSummary;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v4, p0, Lo76$h;->g:Lo76;

    invoke-static {v4}, Lo76;->access$getUi$p(Lo76;)Lu76;

    move-result-object v4

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v4, p1, v3}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_5
    move-object p1, v1

    :goto_3
    invoke-interface {v0, v2, p1, v1}, Le13;->C0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    goto/16 :goto_14

    :cond_6
    if-eqz v0, :cond_7

    iget-object p1, p0, Lo76$h;->g:Lo76;

    invoke-static {p1}, Lo76;->access$getNavigator$p(Lo76;)Le13;

    move-result-object p1

    invoke-virtual {v0}, Lco/bird/android/model/TransactionSummaryRide;->getId()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {p1, v0, v3, v2, v1}, Le13$a;->goToRideDetail$default(Le13;Ljava/lang/String;ZILjava/lang/Object;)V

    goto/16 :goto_14

    :cond_7
    invoke-virtual {p1}, Lco/bird/android/model/TransactionSummary;->getTransaction()Lco/bird/android/model/TransactionSummaryTransaction;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lco/bird/android/model/TransactionSummaryTransaction;->getSourceKind()Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    move-result-object v0

    goto :goto_4

    :cond_8
    move-object v0, v1

    :goto_4
    sget-object v2, Lco/bird/android/model/constant/IncomingTransactionSourceKind;->MERCHANT:Lco/bird/android/model/constant/IncomingTransactionSourceKind;

    if-ne v0, v2, :cond_1b

    invoke-virtual {p1}, Lco/bird/android/model/TransactionSummary;->getTransaction()Lco/bird/android/model/TransactionSummaryTransaction;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/TransactionSummary;->getMerchantTransaction()Lco/bird/android/model/MerchantTransaction;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Lco/bird/android/model/MerchantTransaction;->getId()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_9

    goto :goto_6

    :cond_9
    :goto_5
    move-object v4, v2

    goto :goto_7

    :cond_a
    :goto_6
    if-eqz v0, :cond_b

    invoke-virtual {v0}, Lco/bird/android/model/TransactionSummaryTransaction;->getId()Ljava/lang/String;

    move-result-object v2

    goto :goto_5

    :cond_b
    move-object v4, v1

    :goto_7
    if-eqz p1, :cond_d

    invoke-virtual {p1}, Lco/bird/android/model/MerchantTransaction;->getMerchantSiteId()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_c

    goto :goto_9

    :cond_c
    :goto_8
    move-object v5, v2

    goto :goto_a

    :cond_d
    :goto_9
    if-eqz v0, :cond_e

    invoke-virtual {v0}, Lco/bird/android/model/TransactionSummaryTransaction;->getMetadata()Lco/bird/android/model/TransactionMetadata;

    move-result-object v2

    if-eqz v2, :cond_e

    invoke-virtual {v2}, Lco/bird/android/model/TransactionMetadata;->getMerchantSiteId()Ljava/lang/String;

    move-result-object v2

    goto :goto_8

    :cond_e
    move-object v5, v1

    :goto_a
    if-eqz p1, :cond_f

    invoke-virtual {p1}, Lco/bird/android/model/MerchantTransaction;->getBilledAmount()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    goto :goto_b

    :cond_f
    move-object v2, v1

    :goto_b
    if-eqz p1, :cond_10

    invoke-virtual {p1}, Lco/bird/android/model/MerchantTransaction;->getPreTipAmount()Ljava/lang/Long;

    move-result-object v3

    if-nez v3, :cond_13

    :cond_10
    if-eqz p1, :cond_11

    invoke-virtual {p1}, Lco/bird/android/model/MerchantTransaction;->getAmount()J

    move-result-wide v6

    :goto_c
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    goto :goto_d

    :cond_11
    if-eqz v0, :cond_12

    invoke-virtual {v0}, Lco/bird/android/model/TransactionSummaryTransaction;->getAmount()J

    move-result-wide v6

    goto :goto_c

    :cond_12
    move-object v3, v1

    :cond_13
    :goto_d
    if-eqz p1, :cond_14

    invoke-virtual {p1}, Lco/bird/android/model/MerchantTransaction;->getTipAmount()Ljava/lang/Long;

    move-result-object v6

    goto :goto_e

    :cond_14
    move-object v6, v1

    :goto_e
    if-eqz v0, :cond_15

    invoke-virtual {v0}, Lco/bird/android/model/TransactionSummaryTransaction;->getCurrency()Ljava/lang/String;

    move-result-object v7

    move-object v10, v7

    goto :goto_f

    :cond_15
    move-object v10, v1

    :goto_f
    if-eqz p1, :cond_17

    invoke-virtual {p1}, Lco/bird/android/model/MerchantTransaction;->getDate()Lorg/joda/time/DateTime;

    move-result-object p1

    if-nez p1, :cond_16

    goto :goto_11

    :cond_16
    :goto_10
    move-object v11, p1

    goto :goto_12

    :cond_17
    :goto_11
    if-eqz v0, :cond_18

    invoke-virtual {v0}, Lco/bird/android/model/TransactionSummaryTransaction;->getCreatedAt()Lorg/joda/time/DateTime;

    move-result-object p1

    goto :goto_10

    :cond_18
    move-object v11, v1

    :goto_12
    if-eqz v4, :cond_1b

    if-eqz v5, :cond_1b

    if-eqz v3, :cond_1b

    if-eqz v10, :cond_1b

    if-eqz v11, :cond_1b

    iget-object p1, p0, Lo76$h;->g:Lo76;

    invoke-static {p1}, Lo76;->access$getNavigator$p(Lo76;)Le13;

    move-result-object p1

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(J)J

    move-result-wide v7

    if-eqz v2, :cond_19

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_13

    :cond_19
    move-object v0, v1

    :goto_13
    if-eqz v6, :cond_1a

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :cond_1a
    move-object v9, v1

    move-object v3, p1

    move-wide v6, v7

    move-object v8, v0

    invoke-interface/range {v3 .. v11}, Le13;->V0(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Lorg/joda/time/DateTime;)V

    :cond_1b
    :goto_14
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/TransactionSummary;

    invoke-virtual {p0, p1}, Lo76$h;->a(Lco/bird/android/model/TransactionSummary;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
