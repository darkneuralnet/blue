.class public final Lcom/stripe/android/link/model/SupportedPaymentMethodTypesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u00a8\u0006\u0006"
    }
    d2 = {
        "supportedPaymentMethodTypes",
        "",
        "",
        "Lcom/stripe/android/model/StripeIntent;",
        "linkAccount",
        "Lcom/stripe/android/link/model/LinkAccount;",
        "link_release"
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
        "SMAP\nSupportedPaymentMethodTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportedPaymentMethodTypes.kt\ncom/stripe/android/link/model/SupportedPaymentMethodTypesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n766#2:25\n857#2,2:26\n1#3:28\n*S KotlinDebug\n*F\n+ 1 SupportedPaymentMethodTypes.kt\ncom/stripe/android/link/model/SupportedPaymentMethodTypesKt\n*L\n20#1:25\n20#1:26,2\n*E\n"
    }
.end annotation


# direct methods
.method public static final supportedPaymentMethodTypes(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/link/model/LinkAccount;)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/StripeIntent;",
            "Lcom/stripe/android/link/model/LinkAccount;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccount"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lcom/stripe/android/model/StripeIntent;->isLiveMode()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/link/model/LinkAccount;->getEmail()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v2, 0x2

    const-string v3, "+multiple_funding_sources@"

    invoke-static {p1, v3, v0, v2, v1}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p0, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;->Companion:Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod$Companion;->getAllTypes()Ljava/util/Set;

    move-result-object p0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Lcom/stripe/android/model/StripeIntent;->getLinkFundingSources()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    sget-object v3, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod;->Companion:Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod$Companion;

    invoke-virtual {v3}, Lcom/stripe/android/link/ui/paymentmethod/SupportedPaymentMethod$Companion;->getAllTypes()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    if-eqz p0, :cond_3

    move-object v1, p1

    :cond_3
    if-eqz v1, :cond_4

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    if-nez p0, :cond_5

    :cond_4
    const-string p0, "card"

    invoke-static {p0}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    :cond_5
    :goto_1
    return-object p0
.end method
