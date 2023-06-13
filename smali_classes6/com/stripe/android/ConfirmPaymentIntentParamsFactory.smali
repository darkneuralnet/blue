.class public final Lcom/stripe/android/ConfirmPaymentIntentParamsFactory;
.super Lcom/stripe/android/ConfirmStripeIntentParamsFactory;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ConfirmPaymentIntentParamsFactory$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/stripe/android/ConfirmStripeIntentParamsFactory<",
        "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0008\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u0008\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/ConfirmPaymentIntentParamsFactory;",
        "Lcom/stripe/android/ConfirmStripeIntentParamsFactory;",
        "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
        "clientSecret",
        "",
        "shipping",
        "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;",
        "(Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)V",
        "create",
        "paymentMethod",
        "Lcom/stripe/android/model/PaymentMethod;",
        "createParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "setupFutureUsage",
        "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nConfirmStripeIntentParamsFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmStripeIntentParamsFactory.kt\ncom/stripe/android/ConfirmPaymentIntentParamsFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"
    }
.end annotation


# instance fields
.field private final clientSecret:Ljava/lang/String;

.field private final shipping:Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)V
    .locals 1

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/ConfirmStripeIntentParamsFactory;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/ConfirmPaymentIntentParamsFactory;->clientSecret:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/ConfirmPaymentIntentParamsFactory;->shipping:Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;

    return-void
.end method


# virtual methods
.method public create(Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;
    .locals 14

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->Companion:Lcom/stripe/android/model/ConfirmPaymentIntentParams$Companion;

    iget-object v0, p1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    move-object v2, v0

    iget-object v3, p0, Lcom/stripe/android/ConfirmPaymentIntentParamsFactory;->clientSecret:Ljava/lang/String;

    const/4 v4, 0x0

    iget-object v0, p1, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    if-nez v0, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    sget-object v5, Lcom/stripe/android/ConfirmPaymentIntentParamsFactory$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v5, v0

    :goto_0
    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v0, v6, :cond_3

    const/4 v7, 0x2

    if-eq v0, v7, :cond_2

    move-object v0, v5

    goto :goto_1

    :cond_2
    new-instance v0, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;

    sget-object v7, Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;->OffSession:Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    invoke-direct {v0, v7}, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;-><init>(Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)V

    goto :goto_1

    :cond_3
    new-instance v0, Lcom/stripe/android/model/PaymentMethodOptionsParams$Card;

    const/4 v9, 0x0

    const/4 v10, 0x0

    sget-object v11, Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;->Blank:Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    const/4 v12, 0x3

    const/4 v13, 0x0

    move-object v8, v0

    invoke-direct/range {v8 .. v13}, Lcom/stripe/android/model/PaymentMethodOptionsParams$Card;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    const/4 v7, 0x0

    new-instance v8, Lcom/stripe/android/model/MandateDataParams;

    sget-object v9, Lcom/stripe/android/model/MandateDataParams$Type$Online;->Companion:Lcom/stripe/android/model/MandateDataParams$Type$Online$Companion;

    invoke-virtual {v9}, Lcom/stripe/android/model/MandateDataParams$Type$Online$Companion;->getDEFAULT()Lcom/stripe/android/model/MandateDataParams$Type$Online;

    move-result-object v9

    invoke-direct {v8, v9}, Lcom/stripe/android/model/MandateDataParams;-><init>(Lcom/stripe/android/model/MandateDataParams$Type;)V

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    const/4 v9, 0x0

    if-eqz p1, :cond_4

    iget-boolean p1, p1, Lcom/stripe/android/model/PaymentMethod$Type;->requiresMandate:Z

    if-ne p1, v6, :cond_4

    goto :goto_2

    :cond_4
    move v6, v9

    :goto_2
    if-eqz v6, :cond_5

    goto :goto_3

    :cond_5
    move-object v8, v5

    :goto_3
    const/4 p1, 0x0

    iget-object v9, p0, Lcom/stripe/android/ConfirmPaymentIntentParamsFactory;->shipping:Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;

    const/16 v10, 0x54

    const/4 v11, 0x0

    move-object v5, v0

    move-object v6, v7

    move-object v7, v8

    move-object v8, p1

    invoke-static/range {v1 .. v11}, Lcom/stripe/android/model/ConfirmPaymentIntentParams$Companion;->createWithPaymentMethodId$default(Lcom/stripe/android/model/ConfirmPaymentIntentParams$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/model/PaymentMethodOptionsParams;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;ILjava/lang/Object;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    move-result-object p1

    return-object p1
.end method

.method public create(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;
    .locals 12

    const-string v0, "createParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/stripe/android/model/ConfirmPaymentIntentParams;->Companion:Lcom/stripe/android/model/ConfirmPaymentIntentParams$Companion;

    iget-object v3, p0, Lcom/stripe/android/ConfirmPaymentIntentParamsFactory;->clientSecret:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodCreateParams;->getTypeCode()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v2, v2, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v0, Lcom/stripe/android/model/PaymentMethodOptionsParams$Card;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x3

    const/4 v9, 0x0

    move-object v4, v0

    move-object v7, p2

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/model/PaymentMethodOptionsParams$Card;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    move-object v9, v0

    goto :goto_2

    :cond_0
    sget-object v2, Lcom/stripe/android/model/PaymentMethod$Type;->USBankAccount:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v2, v2, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v0, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;

    invoke-direct {v0, p2}, Lcom/stripe/android/model/PaymentMethodOptionsParams$USBankAccount;-><init>(Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)V

    goto :goto_0

    :cond_1
    sget-object p2, Lcom/stripe/android/model/PaymentMethod$Type;->Link:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object p2, p2, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 p2, 0x0

    goto :goto_1

    :cond_2
    new-instance p2, Lcom/stripe/android/model/PaymentMethodOptionsParams$Card;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x3

    const/4 v9, 0x0

    move-object v4, p2

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/model/PaymentMethodOptionsParams$Card;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    move-object v9, p2

    :goto_2
    iget-object v8, p0, Lcom/stripe/android/ConfirmPaymentIntentParamsFactory;->shipping:Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v10, 0x3c

    const/4 v11, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v11}, Lcom/stripe/android/model/ConfirmPaymentIntentParams$Companion;->createWithPaymentMethodCreateParams$default(Lcom/stripe/android/model/ConfirmPaymentIntentParams$Companion;Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/PaymentMethodOptionsParams;ILjava/lang/Object;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic create(Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/model/ConfirmStripeIntentParams;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/ConfirmPaymentIntentParamsFactory;->create(Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic create(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)Lcom/stripe/android/model/ConfirmStripeIntentParams;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ConfirmPaymentIntentParamsFactory;->create(Lcom/stripe/android/model/PaymentMethodCreateParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;

    move-result-object p1

    return-object p1
.end method
