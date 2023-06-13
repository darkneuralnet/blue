.class public final Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;
.super Lcom/stripe/android/uicore/elements/AddressType;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/uicore/address/AutocompleteCapableAddressType;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/AddressType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ShippingExpanded"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\u000cJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0008H\u00c6\u0003J\u000f\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003JA\u0010\u0019\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\u0008\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0004H\u00d6\u0001R\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u0008X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;",
        "Lcom/stripe/android/uicore/elements/AddressType;",
        "Lcom/stripe/android/uicore/address/AutocompleteCapableAddressType;",
        "googleApiKey",
        "",
        "autocompleteCountries",
        "",
        "phoneNumberState",
        "Lcom/stripe/android/uicore/elements/PhoneNumberState;",
        "onNavigation",
        "Lkotlin/Function0;",
        "",
        "(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/PhoneNumberState;Lkotlin/jvm/functions/Function0;)V",
        "getAutocompleteCountries",
        "()Ljava/util/Set;",
        "getGoogleApiKey",
        "()Ljava/lang/String;",
        "getOnNavigation",
        "()Lkotlin/jvm/functions/Function0;",
        "getPhoneNumberState",
        "()Lcom/stripe/android/uicore/elements/PhoneNumberState;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "stripe-ui-core_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final autocompleteCountries:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final googleApiKey:Ljava/lang/String;

.field private final onNavigation:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final phoneNumberState:Lcom/stripe/android/uicore/elements/PhoneNumberState;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/PhoneNumberState;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/uicore/elements/PhoneNumberState;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "phoneNumberState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigation"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/uicore/elements/AddressType;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->googleApiKey:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->autocompleteCountries:Ljava/util/Set;

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->phoneNumberState:Lcom/stripe/android/uicore/elements/PhoneNumberState;

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->onNavigation:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/PhoneNumberState;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getGoogleApiKey()Ljava/lang/String;

    move-result-object p1

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getAutocompleteCountries()Ljava/util/Set;

    move-result-object p2

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getPhoneNumberState()Lcom/stripe/android/uicore/elements/PhoneNumberState;

    move-result-object p3

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getOnNavigation()Lkotlin/jvm/functions/Function0;

    move-result-object p4

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->copy(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/PhoneNumberState;Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getGoogleApiKey()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final component2()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getAutocompleteCountries()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/uicore/elements/PhoneNumberState;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getPhoneNumberState()Lcom/stripe/android/uicore/elements/PhoneNumberState;

    move-result-object v0

    return-object v0
.end method

.method public final component4()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getOnNavigation()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/PhoneNumberState;Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/uicore/elements/PhoneNumberState;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;"
        }
    .end annotation

    const-string v0, "phoneNumberState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigation"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;-><init>(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/PhoneNumberState;Lkotlin/jvm/functions/Function0;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getGoogleApiKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getGoogleApiKey()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getAutocompleteCountries()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getAutocompleteCountries()Ljava/util/Set;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getPhoneNumberState()Lcom/stripe/android/uicore/elements/PhoneNumberState;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getPhoneNumberState()Lcom/stripe/android/uicore/elements/PhoneNumberState;

    move-result-object v3

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getOnNavigation()Lkotlin/jvm/functions/Function0;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getOnNavigation()Lkotlin/jvm/functions/Function0;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public getAutocompleteCountries()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->autocompleteCountries:Ljava/util/Set;

    return-object v0
.end method

.method public getGoogleApiKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->googleApiKey:Ljava/lang/String;

    return-object v0
.end method

.method public getOnNavigation()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->onNavigation:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public getPhoneNumberState()Lcom/stripe/android/uicore/elements/PhoneNumberState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->phoneNumberState:Lcom/stripe/android/uicore/elements/PhoneNumberState;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getGoogleApiKey()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getGoogleApiKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getAutocompleteCountries()Ljava/util/Set;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getAutocompleteCountries()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getPhoneNumberState()Lcom/stripe/android/uicore/elements/PhoneNumberState;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getOnNavigation()Lkotlin/jvm/functions/Function0;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public supportsAutoComplete(Ljava/lang/String;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/uicore/address/AutocompleteCapableAddressType$DefaultImpls;->supportsAutoComplete(Lcom/stripe/android/uicore/address/AutocompleteCapableAddressType;Ljava/lang/String;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;)Z

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getGoogleApiKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getAutocompleteCountries()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getPhoneNumberState()Lcom/stripe/android/uicore/elements/PhoneNumberState;

    move-result-object v2

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressType$ShippingExpanded;->getOnNavigation()Lkotlin/jvm/functions/Function0;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ShippingExpanded(googleApiKey="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", autocompleteCountries="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", phoneNumberState="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", onNavigation="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
