.class public final Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepositoryKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepositoryKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0002\u001a\u0016\u0010\u0007\u001a\u00020\u0008*\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "toElementsSessionParam",
        "Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;",
        "Lcom/stripe/android/model/DeferredIntentParams$Mode;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;",
        "Lcom/stripe/android/model/StripeIntent$Usage;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;",
        "toElementsSessionParams",
        "Lcom/stripe/android/model/ElementsSessionParams;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;",
        "configuration",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "paymentsheet_release"
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
.method private static final toElementsSessionParam(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;)Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepositoryKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;->Manual:Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;->Automatic:Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;

    :goto_0
    return-object p0
.end method

.method private static final toElementsSessionParam(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;)Lcom/stripe/android/model/DeferredIntentParams$Mode;
    .locals 3

    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;

    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;->getAmount()J

    move-result-wide v1

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;->getCurrency()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lcom/stripe/android/model/DeferredIntentParams$Mode$Payment;-><init>(JLjava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Setup;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/stripe/android/model/DeferredIntentParams$Mode$Setup;

    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Setup;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Setup;->getCurrency()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/model/DeferredIntentParams$Mode$Setup;-><init>(Ljava/lang/String;)V

    :goto_0
    return-object v0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final toElementsSessionParam(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;)Lcom/stripe/android/model/StripeIntent$Usage;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepositoryKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Lcom/stripe/android/model/StripeIntent$Usage;->OffSession:Lcom/stripe/android/model/StripeIntent$Usage;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lcom/stripe/android/model/StripeIntent$Usage;->OnSession:Lcom/stripe/android/model/StripeIntent$Usage;

    :goto_0
    return-object p0
.end method

.method public static final toElementsSessionParams(Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Lcom/stripe/android/model/ElementsSessionParams;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$PaymentIntent;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance p1, Lcom/stripe/android/model/ElementsSessionParams$PaymentIntentType;

    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$PaymentIntent;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$PaymentIntent;->getClientSecret()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0, v2, v1, v2}, Lcom/stripe/android/model/ElementsSessionParams$PaymentIntentType;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_3

    :cond_0
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$SetupIntent;

    if-eqz v0, :cond_1

    new-instance p1, Lcom/stripe/android/model/ElementsSessionParams$SetupIntentType;

    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$SetupIntent;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$SetupIntent;->getClientSecret()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0, v2, v1, v2}, Lcom/stripe/android/model/ElementsSessionParams$SetupIntentType;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_3

    :cond_1
    instance-of v0, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$DeferredIntent;

    if-eqz v0, :cond_5

    new-instance v0, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;

    new-instance v1, Lcom/stripe/android/model/DeferredIntentParams;

    check-cast p0, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$DeferredIntent;

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$DeferredIntent;->getIntentConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;->getMode()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;

    move-result-object v3

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepositoryKt;->toElementsSessionParam(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;)Lcom/stripe/android/model/DeferredIntentParams$Mode;

    move-result-object v4

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$DeferredIntent;->getIntentConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;->getSetupFutureUse$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepositoryKt;->toElementsSessionParam(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;)Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object v3

    move-object v5, v3

    goto :goto_0

    :cond_2
    move-object v5, v2

    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$DeferredIntent;->getIntentConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;->getCaptureMethod$paymentsheet_release()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepositoryKt;->toElementsSessionParam(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;)Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;

    move-result-object v3

    move-object v6, v3

    goto :goto_1

    :cond_3
    move-object v6, v2

    :goto_1
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getCustomer()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;->getId()Ljava/lang/String;

    move-result-object p1

    move-object v7, p1

    goto :goto_2

    :cond_4
    move-object v7, v2

    :goto_2
    const/4 v8, 0x0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$InitializationMode$DeferredIntent;->getIntentConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;->getPaymentMethodTypes()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v9

    const/16 v10, 0x10

    const/4 v11, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v11}, Lcom/stripe/android/model/DeferredIntentParams;-><init>(Lcom/stripe/android/model/DeferredIntentParams$Mode;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/DeferredIntentParams$CaptureMethod;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p0, 0x1

    invoke-direct {v0, v2, v1, p0, v2}, Lcom/stripe/android/model/ElementsSessionParams$DeferredIntentType;-><init>(Ljava/lang/String;Lcom/stripe/android/model/DeferredIntentParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v0

    :goto_3
    return-object p1

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
