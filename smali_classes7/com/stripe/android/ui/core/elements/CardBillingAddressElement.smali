.class public final Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;
.super Lcom/stripe/android/uicore/elements/AddressElement;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0016\u0008\u0002\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R#\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;",
        "Lcom/stripe/android/uicore/elements/AddressElement;",
        "LEu1;",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "hiddenIdentifiers",
        "LEu1;",
        "getHiddenIdentifiers",
        "()LEu1;",
        "identifier",
        "",
        "",
        "rawValuesMap",
        "Lcom/stripe/android/uicore/address/AddressRepository;",
        "addressRepository",
        "countryCodes",
        "Lcom/stripe/android/uicore/elements/DropdownFieldController;",
        "countryDropdownFieldController",
        "Lcom/stripe/android/uicore/elements/SameAsShippingElement;",
        "sameAsShippingElement",
        "shippingValuesMap",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lcom/stripe/android/uicore/address/AddressRepository;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;)V",
        "payments-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCardBillingAddressElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardBillingAddressElement.kt\ncom/stripe/android/ui/core/elements/CardBillingAddressElement\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,61:1\n47#2:62\n49#2:66\n50#3:63\n55#3:65\n106#4:64\n*S KotlinDebug\n*F\n+ 1 CardBillingAddressElement.kt\ncom/stripe/android/ui/core/elements/CardBillingAddressElement\n*L\n45#1:62\n45#1:66\n45#1:63\n45#1:65\n45#1:64\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final hiddenIdentifiers:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lcom/stripe/android/uicore/address/AddressRepository;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/uicore/address/AddressRepository;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/uicore/elements/DropdownFieldController;",
            "Lcom/stripe/android/uicore/elements/SameAsShippingElement;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "identifier"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawValuesMap"

    move-object/from16 v4, p2

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addressRepository"

    move-object/from16 v3, p3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "countryCodes"

    move-object/from16 v6, p4

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "countryDropdownFieldController"

    move-object/from16 v13, p5

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lcom/stripe/android/uicore/elements/AddressType$Normal;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {v5, v0, v1, v0}, Lcom/stripe/android/uicore/elements/AddressType$Normal;-><init>(Lcom/stripe/android/uicore/elements/PhoneNumberState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x0

    const/16 v11, 0x100

    const/4 v12, 0x0

    move-object v1, p0

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    invoke-direct/range {v1 .. v12}, Lcom/stripe/android/uicore/elements/AddressElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/address/AddressRepository;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AddressType;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p5 .. p5}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->getRawFieldValue()LEu1;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/ui/core/elements/CardBillingAddressElement$special$$inlined$map$1;

    invoke-direct {v1, v0}, Lcom/stripe/android/ui/core/elements/CardBillingAddressElement$special$$inlined$map$1;-><init>(LEu1;)V

    move-object v0, p0

    iput-object v1, v0, Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;->hiddenIdentifiers:LEu1;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lcom/stripe/android/uicore/address/AddressRepository;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, p2

    :goto_0
    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_1

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object/from16 v0, p4

    :goto_1
    and-int/lit8 v1, p8, 0x10

    if-eqz v1, :cond_2

    new-instance v1, Lcom/stripe/android/uicore/elements/DropdownFieldController;

    new-instance v2, Lcom/stripe/android/uicore/elements/CountryConfig;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x3e

    const/4 v12, 0x0

    move-object v4, v2

    move-object v5, v0

    invoke-direct/range {v4 .. v12}, Lcom/stripe/android/uicore/elements/CountryConfig;-><init>(Ljava/util/Set;Ljava/util/Locale;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v4, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v4}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCountry()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-direct {v1, v2, v4}, Lcom/stripe/android/uicore/elements/DropdownFieldController;-><init>(Lcom/stripe/android/uicore/elements/DropdownConfig;Ljava/lang/String;)V

    move-object v6, v1

    goto :goto_2

    :cond_2
    move-object/from16 v6, p5

    :goto_2
    move-object v1, p0

    move-object v2, p1

    move-object/from16 v4, p3

    move-object v5, v0

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lcom/stripe/android/uicore/address/AddressRepository;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final getHiddenIdentifiers()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;->hiddenIdentifiers:LEu1;

    return-object v0
.end method
