.class public final Lcom/stripe/android/uicore/address/AutocompleteCapableAddressType$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/address/AutocompleteCapableAddressType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAutocompleteCapableAddressType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutocompleteCapableAddressType.kt\ncom/stripe/android/uicore/address/AutocompleteCapableAddressType$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1549#2:28\n1620#2,3:29\n*S KotlinDebug\n*F\n+ 1 AutocompleteCapableAddressType.kt\ncom/stripe/android/uicore/address/AutocompleteCapableAddressType$DefaultImpls\n*L\n20#1:28\n20#1:29,3\n*E\n"
    }
.end annotation


# direct methods
.method public static supportsAutoComplete(Lcom/stripe/android/uicore/address/AutocompleteCapableAddressType;Ljava/lang/String;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;)Z
    .locals 6

    const-string v0, "isPlacesAvailable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lcom/stripe/android/uicore/address/AutocompleteCapableAddressType;->getAutocompleteCountries()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    sget-object v5, Lqv2;->b:Lqv2$a;

    invoke-virtual {v5}, Lqv2$a;->a()Lqv2;

    move-result-object v5

    invoke-static {v4, v5}, LXR5;->a(Ljava/lang/String;Lqv2;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    sget-object v0, Lqv2;->b:Lqv2$a;

    invoke-virtual {v0}, Lqv2$a;->a()Lqv2;

    move-result-object v0

    invoke-static {p1, v0}, LXR5;->a(Ljava/lang/String;Lqv2;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    invoke-static {v3, p1}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result p1

    if-ne p1, v1, :cond_2

    move p1, v1

    goto :goto_2

    :cond_2
    move p1, v2

    :goto_2
    invoke-interface {p2}, Lcom/stripe/android/uicore/elements/IsPlacesAvailable;->invoke()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p0}, Lcom/stripe/android/uicore/address/AutocompleteCapableAddressType;->getGoogleApiKey()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-static {p0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_3

    :cond_3
    move p0, v2

    goto :goto_4

    :cond_4
    :goto_3
    move p0, v1

    :goto_4
    if-nez p0, :cond_5

    move p0, v1

    goto :goto_5

    :cond_5
    move p0, v2

    :goto_5
    if-eqz p1, :cond_6

    if-eqz p0, :cond_6

    goto :goto_6

    :cond_6
    move v1, v2

    :goto_6
    return v1
.end method
