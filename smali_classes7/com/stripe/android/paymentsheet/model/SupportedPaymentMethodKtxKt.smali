.class public final Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a*\u0010\u0005\u001a\u00020\u00012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00022\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002\u001a\"\u0010\u000c\u001a\u00020\u00012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002\u001a*\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0000\u001a*\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0000\u001a\u001e\u0010\u0016\u001a\u00020\u0017*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000\u001a \u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000\u001a\u001e\u0010\u0019\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00022\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002\u001a\u001e\u0010\u001a\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00022\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002\u001a\u001e\u0010\u001b\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00022\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002\u001a\u0016\u0010\u001c\u001a\u00020\u0001*\u00020\u00102\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u001d"
    }
    d2 = {
        "containsValidShippingInfo",
        "",
        "Lcom/stripe/android/model/PaymentIntent;",
        "getContainsValidShippingInfo",
        "(Lcom/stripe/android/model/PaymentIntent;)Z",
        "checkPaymentIntentRequirements",
        "requirements",
        "",
        "Lcom/stripe/android/paymentsheet/forms/PIRequirement;",
        "paymentIntent",
        "config",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "checkSetupIntentRequirements",
        "Lcom/stripe/android/paymentsheet/forms/SIRequirement;",
        "getPMsToAdd",
        "",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
        "stripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "lpmRepository",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
        "getSupportedSavedCustomerPMs",
        "getPMAddForm",
        "Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;",
        "getSpecWithFullfilledRequirements",
        "supportsPaymentIntentSfuNotSettable",
        "supportsPaymentIntentSfuSet",
        "supportsPaymentIntentSfuSettable",
        "supportsSetupIntent",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSupportedPaymentMethodKtx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportedPaymentMethodKtx.kt\ncom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n1549#2:218\n1620#2,3:219\n1549#2:222\n1620#2,3:223\n1603#2,9:226\n1855#2:235\n1856#2:237\n1612#2:238\n766#2:239\n857#2,2:240\n1603#2,9:242\n1855#2:251\n1856#2:253\n1612#2:254\n766#2:255\n857#2,2:256\n819#2:258\n847#2,2:259\n1#3:236\n1#3:252\n*S KotlinDebug\n*F\n+ 1 SupportedPaymentMethodKtx.kt\ncom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt\n*L\n149#1:218\n149#1:219,3\n164#1:222\n164#1:223,3\n191#1:226,9\n191#1:235\n191#1:237\n191#1:238\n193#1:239\n193#1:240,2\n206#1:242,9\n206#1:251\n206#1:253\n206#1:254\n208#1:255\n208#1:256,2\n213#1:258\n213#1:259,2\n191#1:236\n206#1:252\n*E\n"
    }
.end annotation


# direct methods
.method private static final checkPaymentIntentRequirements(Ljava/util/Set;Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Lcom/stripe/android/paymentsheet/forms/PIRequirement;",
            ">;",
            "Lcom/stripe/android/model/PaymentIntent;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            ")Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/paymentsheet/forms/PIRequirement;

    sget-object v4, Lcom/stripe/android/paymentsheet/forms/Delayed;->INSTANCE:Lcom/stripe/android/paymentsheet/forms/Delayed;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getAllowsDelayedPaymentMethods()Z

    move-result v2

    if-ne v2, v3, :cond_0

    goto :goto_2

    :cond_0
    move v3, v0

    goto :goto_2

    :cond_1
    sget-object v4, Lcom/stripe/android/paymentsheet/forms/ShippingAddress;->INSTANCE:Lcom/stripe/android/paymentsheet/forms/ShippingAddress;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getAllowsPaymentMethodsRequiringShippingAddress()Z

    move-result v2

    if-ne v2, v3, :cond_2

    move v2, v3

    goto :goto_1

    :cond_2
    move v2, v0

    :goto_1
    invoke-static {p1}, Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt;->getContainsValidShippingInfo(Lcom/stripe/android/model/PaymentIntent;)Z

    move-result v4

    if-nez v4, :cond_3

    if-eqz v2, :cond_0

    :cond_3
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    move v0, v3

    :cond_6
    return v0
.end method

.method private static final checkSetupIntentRequirements(Ljava/util/Set;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Lcom/stripe/android/paymentsheet/forms/SIRequirement;",
            ">;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            ")Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/paymentsheet/forms/SIRequirement;

    sget-object v4, Lcom/stripe/android/paymentsheet/forms/Delayed;->INSTANCE:Lcom/stripe/android/paymentsheet/forms/Delayed;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getAllowsDelayedPaymentMethods()Z

    move-result v2

    if-ne v2, v3, :cond_0

    goto :goto_1

    :cond_0
    move v3, v0

    :goto_1
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    move v0, v3

    :cond_3
    return v0
.end method

.method private static final getContainsValidShippingInfo(Lcom/stripe/android/model/PaymentIntent;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentIntent;->getShipping()Lcom/stripe/android/model/PaymentIntent$Shipping;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentIntent$Shipping;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentIntent;->getShipping()Lcom/stripe/android/model/PaymentIntent$Shipping;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentIntent$Shipping;->getAddress()Lcom/stripe/android/model/Address;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/model/Address;->getLine1()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentIntent;->getShipping()Lcom/stripe/android/model/PaymentIntent$Shipping;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentIntent$Shipping;->getAddress()Lcom/stripe/android/model/Address;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/model/Address;->getCountry()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentIntent;->getShipping()Lcom/stripe/android/model/PaymentIntent$Shipping;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentIntent$Shipping;->getAddress()Lcom/stripe/android/model/Address;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/stripe/android/model/Address;->getPostalCode()Ljava/lang/String;

    move-result-object v1

    :cond_3
    if-eqz v1, :cond_4

    const/4 p0, 0x1

    goto :goto_3

    :cond_4
    const/4 p0, 0x0

    :goto_3
    return p0
.end method

.method public static final getPMAddForm(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt;->getSpecWithFullfilledRequirements(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Required value was null."

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final getPMsToAdd(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/StripeIntent;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
            ">;"
        }
    .end annotation

    const-string v0, "lpmRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_7

    invoke-interface {p0}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethodTypes()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_7

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p2, v2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->fromCode(Ljava/lang/String;)Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    invoke-static {v4, p0, p1}, Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt;->getSpecWithFullfilledRequirements(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;

    move-result-object v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    move v2, v3

    :goto_2
    if-eqz v2, :cond_2

    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    invoke-interface {p0}, Lcom/stripe/android/model/StripeIntent;->isLiveMode()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {p0}, Lcom/stripe/android/model/StripeIntent;->getUnactivatedPaymentMethods()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    move v1, v2

    goto :goto_4

    :cond_6
    move v1, v3

    :goto_4
    if-nez v1, :cond_5

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_8
    return-object p1
.end method

.method public static final getSpecWithFullfilledRequirements(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getFormSpec()Lcom/stripe/android/ui/core/elements/LayoutSpec;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2, v2}, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;-><init>(Lcom/stripe/android/ui/core/elements/LayoutSpec;ZZ)V

    new-instance v3, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v2, v4}, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;-><init>(Lcom/stripe/android/ui/core/elements/LayoutSpec;ZZ)V

    new-instance v5, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;

    invoke-direct {v5, v0, v4, v2}, Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;-><init>(Lcom/stripe/android/ui/core/elements/LayoutSpec;ZZ)V

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethodTypes()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    return-object v2

    :cond_0
    instance-of v0, p1, Lcom/stripe/android/model/PaymentIntent;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/stripe/android/model/PaymentIntent;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/model/PaymentIntent;->isLpmLevelSetupFutureUsageSet(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt;->supportsPaymentIntentSfuSet(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_0

    :cond_1
    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt;->supportsPaymentIntentSfuSettable(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v1, v5

    goto :goto_1

    :cond_2
    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt;->supportsPaymentIntentSfuNotSettable(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_1

    :cond_3
    instance-of p1, p1, Lcom/stripe/android/model/SetupIntent;

    if-eqz p1, :cond_5

    invoke-static {p0, p2}, Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt;->supportsSetupIntent(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Z

    move-result p0

    if-eqz p0, :cond_4

    :goto_0
    move-object v1, v3

    goto :goto_1

    :cond_4
    move-object v1, v2

    :goto_1
    return-object v1

    :cond_5
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final getSupportedSavedCustomerPMs(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/StripeIntent;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
            ">;"
        }
    .end annotation

    const-string v0, "lpmRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_4

    invoke-interface {p0}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethodTypes()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p2, v2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->fromCode(Ljava/lang/String;)Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->supportsCustomerSavedPM()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v2, p0, p1}, Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt;->getSpecWithFullfilledRequirements(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Lcom/stripe/android/ui/core/elements/LayoutFormDescriptor;

    move-result-object v2

    if-eqz v2, :cond_3

    const/4 v2, 0x1

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_2

    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    :cond_5
    return-object p2
.end method

.method private static final supportsPaymentIntentSfuNotSettable(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->getPiRequirements()Ljava/util/Set;

    move-result-object p0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt;->checkPaymentIntentRequirements(Ljava/util/Set;Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Z

    move-result p0

    return p0
.end method

.method private static final supportsPaymentIntentSfuSet(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->getConfirmPMFromCustomer(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->getSiRequirements()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt;->checkSetupIntentRequirements(Ljava/util/Set;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->getPiRequirements()Ljava/util/Set;

    move-result-object p0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt;->checkPaymentIntentRequirements(Ljava/util/Set;Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final supportsPaymentIntentSfuSettable(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Z
    .locals 2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getCustomer()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->getConfirmPMFromCustomer(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->getPiRequirements()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0, p1, p2}, Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt;->checkPaymentIntentRequirements(Ljava/util/Set;Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->getSiRequirements()Ljava/util/Set;

    move-result-object p0

    invoke-static {p0, p2}, Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt;->checkSetupIntentRequirements(Ljava/util/Set;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    return p0
.end method

.method private static final supportsSetupIntent(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->getConfirmPMFromCustomer(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;->getSiRequirements()Ljava/util/Set;

    move-result-object p0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/model/SupportedPaymentMethodKtxKt;->checkSetupIntentRequirements(Ljava/util/Set;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
