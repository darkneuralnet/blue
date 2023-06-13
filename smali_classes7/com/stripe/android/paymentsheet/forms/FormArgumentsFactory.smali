.class public final Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002JH\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;",
        "",
        "()V",
        "create",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
        "paymentMethod",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
        "stripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "config",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "merchantName",
        "",
        "amount",
        "Lcom/stripe/android/ui/core/Amount;",
        "newLpm",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
        "isShowingLinkInlineSignup",
        "",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Ljava/lang/String;Lcom/stripe/android/ui/core/Amount;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;ZILjava/lang/Object;)Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;
    .locals 9

    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v6, v0

    goto :goto_0

    :cond_0
    move-object v6, p5

    :goto_0
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    move v8, v0

    goto :goto_1

    :cond_1
    move/from16 v8, p7

    :goto_1
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v7, p6

    invoke-virtual/range {v1 .. v8}, Lcom/stripe/android/paymentsheet/forms/FormArgumentsFactory;->create(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Ljava/lang/String;Lcom/stripe/android/ui/core/Amount;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;Z)Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final create(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Ljava/lang/String;Lcom/stripe/android/ui/core/Amount;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;Z)Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;
    .locals 12

    move-object/from16 v0, p6

    const-string v1, "paymentMethod"

    move-object v2, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "stripeIntent"

    move-object v3, p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "merchantName"

    move-object/from16 v6, p4

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2, p3}, Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt;->getPMAddForm(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;

    move-result-object v1

    instance-of v3, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$LinkInline;->getLinkPaymentDetails()Lcom/stripe/android/link/LinkPaymentDetails$New;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/link/LinkPaymentDetails$New;->getOriginalParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v3

    :goto_0
    move-object v10, v3

    goto :goto_2

    :cond_0
    if-eqz v0, :cond_4

    invoke-virtual/range {p6 .. p6}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/stripe/android/model/PaymentMethodCreateParams;->getTypeCode()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    move-object v3, v4

    :goto_1
    if-eqz v3, :cond_4

    instance-of v3, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;

    if-eqz v3, :cond_2

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$GenericPaymentMethod;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v3

    goto :goto_0

    :cond_2
    instance-of v3, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;

    if-eqz v3, :cond_3

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;

    invoke-virtual {v3}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$Card;->getPaymentMethodCreateParams()Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v3

    goto :goto_0

    :cond_3
    move-object v3, v4

    goto :goto_0

    :cond_4
    move-object v10, v4

    :goto_2
    const/4 v3, 0x1

    const/4 v5, 0x0

    if-eqz v0, :cond_6

    invoke-virtual/range {p6 .. p6}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;->getCustomerRequestedSave()Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    move-result-object v0

    sget-object v7, Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;->RequestReuse:Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;

    if-ne v0, v7, :cond_5

    move v0, v3

    goto :goto_3

    :cond_5
    move v0, v5

    goto :goto_3

    :cond_6
    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->getShowCheckboxControlledFields()Z

    move-result v0

    :goto_3
    new-instance v11, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;->getShowCheckbox()Z

    move-result v1

    if-eqz v1, :cond_7

    if-nez p7, :cond_7

    move v5, v3

    :cond_7
    if-eqz p3, :cond_8

    invoke-virtual {p3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getDefaultBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v1

    move-object v8, v1

    goto :goto_4

    :cond_8
    move-object v8, v4

    :goto_4
    if-eqz p3, :cond_9

    invoke-virtual {p3}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getShippingDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v1

    move-object v9, v1

    goto :goto_5

    :cond_9
    move-object v9, v4

    :goto_5
    move-object v2, v11

    move-object v3, v7

    move v4, v5

    move v5, v0

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    invoke-direct/range {v2 .. v10}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;-><init>(Ljava/lang/String;ZZLjava/lang/String;Lcom/stripe/android/ui/core/Amount;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lcom/stripe/android/model/PaymentMethodCreateParams;)V

    return-object v11
.end method
