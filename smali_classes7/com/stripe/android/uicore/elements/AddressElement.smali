.class public Lcom/stripe/android/uicore/elements/AddressElement;
.super Lcom/stripe/android/uicore/elements/SectionMultiFieldElement;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0017\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010<\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0016\u0008\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u000b\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0014\u0012\u000e\u0008\u0002\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u000c0=\u0012\u0008\u0008\u0002\u0010@\u001a\u00020?\u0012\u0008\u0010B\u001a\u0004\u0018\u00010A\u0012\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008D\u0010EJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00060\u00050\u0004H\u0016J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00050\u0004H\u0016J\u001e\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R$\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R \u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001b\u0010\u001c\u0012\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0014\u0010(\u001a\u00020\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\"\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u000c0*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010\u0013R \u0010-\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020,0\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u0010.R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u0010.R#\u00104\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020,0\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u00084\u0010.\u001a\u0004\u00085\u00106R\u0017\u00108\u001a\u0002078\u0006\u00a2\u0006\u000c\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;\u00a8\u0006F"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/AddressElement;",
        "Lcom/stripe/android/uicore/elements/SectionMultiFieldElement;",
        "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;",
        "sectionFieldErrorController",
        "LEu1;",
        "",
        "Lkotlin/Pair;",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "getFormFieldValueFlow",
        "getTextFieldIdentifiers",
        "",
        "",
        "rawValuesMap",
        "",
        "setRawValue",
        "Lcom/stripe/android/uicore/address/AddressRepository;",
        "addressRepository",
        "Lcom/stripe/android/uicore/address/AddressRepository;",
        "Ljava/util/Map;",
        "Lcom/stripe/android/uicore/elements/AddressType;",
        "addressType",
        "Lcom/stripe/android/uicore/elements/AddressType;",
        "Lcom/stripe/android/uicore/elements/IsPlacesAvailable;",
        "isPlacesAvailable",
        "Lcom/stripe/android/uicore/elements/IsPlacesAvailable;",
        "Lcom/stripe/android/uicore/elements/CountryElement;",
        "countryElement",
        "Lcom/stripe/android/uicore/elements/CountryElement;",
        "getCountryElement",
        "()Lcom/stripe/android/uicore/elements/CountryElement;",
        "getCountryElement$annotations",
        "()V",
        "Lcom/stripe/android/uicore/elements/SimpleTextElement;",
        "nameElement",
        "Lcom/stripe/android/uicore/elements/SimpleTextElement;",
        "Lcom/stripe/android/uicore/elements/AddressTextFieldElement;",
        "addressAutoCompleteElement",
        "Lcom/stripe/android/uicore/elements/AddressTextFieldElement;",
        "Lcom/stripe/android/uicore/elements/PhoneNumberElement;",
        "phoneNumberElement",
        "Lcom/stripe/android/uicore/elements/PhoneNumberElement;",
        "",
        "currentValuesMap",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        "otherFields",
        "LEu1;",
        "",
        "lastSameAsShipping",
        "Ljava/lang/Boolean;",
        "sameAsShippingUpdatedFlow",
        "fieldsUpdatedFlow",
        "fields",
        "getFields",
        "()LEu1;",
        "Lcom/stripe/android/uicore/elements/AddressController;",
        "controller",
        "Lcom/stripe/android/uicore/elements/AddressController;",
        "getController",
        "()Lcom/stripe/android/uicore/elements/AddressController;",
        "_identifier",
        "",
        "countryCodes",
        "Lcom/stripe/android/uicore/elements/DropdownFieldController;",
        "countryDropdownFieldController",
        "Lcom/stripe/android/uicore/elements/SameAsShippingElement;",
        "sameAsShippingElement",
        "shippingValuesMap",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/address/AddressRepository;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AddressType;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;)V",
        "stripe-ui-core_release"
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
        "SMAP\nAddressElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressElement.kt\ncom/stripe/android/uicore/elements/AddressElement\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,263:1\n47#2:264\n49#2:268\n47#2:269\n49#2:273\n50#3:265\n55#3:267\n50#3:270\n55#3:272\n106#4:266\n106#4:271\n190#5:274\n190#5:275\n*S KotlinDebug\n*F\n+ 1 AddressElement.kt\ncom/stripe/android/uicore/elements/AddressElement\n*L\n66#1:264\n66#1:268\n122#1:269\n122#1:273\n66#1:265\n66#1:267\n122#1:270\n122#1:272\n66#1:266\n122#1:271\n193#1:274\n204#1:275\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final addressAutoCompleteElement:Lcom/stripe/android/uicore/elements/AddressTextFieldElement;

.field private final addressRepository:Lcom/stripe/android/uicore/address/AddressRepository;

.field private final addressType:Lcom/stripe/android/uicore/elements/AddressType;

.field private final controller:Lcom/stripe/android/uicore/elements/AddressController;

.field private final countryElement:Lcom/stripe/android/uicore/elements/CountryElement;

.field private final currentValuesMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final fields:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;>;"
        }
    .end annotation
.end field

.field private final fieldsUpdatedFlow:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final isPlacesAvailable:Lcom/stripe/android/uicore/elements/IsPlacesAvailable;

.field private lastSameAsShipping:Ljava/lang/Boolean;

.field private final nameElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

.field private final otherFields:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;>;"
        }
    .end annotation
.end field

.field private final phoneNumberElement:Lcom/stripe/android/uicore/elements/PhoneNumberElement;

.field private rawValuesMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final sameAsShippingUpdatedFlow:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/address/AddressRepository;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AddressType;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/address/AddressRepository;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/uicore/elements/AddressType;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/uicore/elements/DropdownFieldController;",
            "Lcom/stripe/android/uicore/elements/SameAsShippingElement;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IsPlacesAvailable;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    const-string v8, "_identifier"

    move-object/from16 v9, p1

    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "addressRepository"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "rawValuesMap"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "addressType"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "countryCodes"

    move-object/from16 v10, p5

    invoke-static {v10, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "countryDropdownFieldController"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "isPlacesAvailable"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p1}, Lcom/stripe/android/uicore/elements/SectionMultiFieldElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    iput-object v1, v0, Lcom/stripe/android/uicore/elements/AddressElement;->addressRepository:Lcom/stripe/android/uicore/address/AddressRepository;

    iput-object v2, v0, Lcom/stripe/android/uicore/elements/AddressElement;->rawValuesMap:Ljava/util/Map;

    iput-object v3, v0, Lcom/stripe/android/uicore/elements/AddressElement;->addressType:Lcom/stripe/android/uicore/elements/AddressType;

    iput-object v7, v0, Lcom/stripe/android/uicore/elements/AddressElement;->isPlacesAvailable:Lcom/stripe/android/uicore/elements/IsPlacesAvailable;

    new-instance v1, Lcom/stripe/android/uicore/elements/CountryElement;

    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCountry()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v7

    invoke-direct {v1, v7, v4}, Lcom/stripe/android/uicore/elements/CountryElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/DropdownFieldController;)V

    iput-object v1, v0, Lcom/stripe/android/uicore/elements/AddressElement;->countryElement:Lcom/stripe/android/uicore/elements/CountryElement;

    new-instance v4, Lcom/stripe/android/uicore/elements/SimpleTextElement;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getName()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v7

    new-instance v14, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    new-instance v9, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;

    sget v8, Lcom/stripe/android/uicore/R$string;->address_label_full_name:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xe

    const/16 v21, 0x0

    move-object v15, v9

    invoke-direct/range {v15 .. v21}, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;-><init>(Ljava/lang/Integer;IILGX2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x0

    iget-object v8, v0, Lcom/stripe/android/uicore/elements/AddressElement;->rawValuesMap:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getName()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v11

    invoke-interface {v8, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, Ljava/lang/String;

    const/4 v12, 0x2

    const/4 v13, 0x0

    move-object v8, v14

    invoke-direct/range {v8 .. v13}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v4, v7, v14}, Lcom/stripe/android/uicore/elements/SimpleTextElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/TextFieldController;)V

    iput-object v4, v0, Lcom/stripe/android/uicore/elements/AddressElement;->nameElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

    new-instance v4, Lcom/stripe/android/uicore/elements/AddressTextFieldElement;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getOneLineAddress()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v7

    new-instance v15, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;

    sget v8, Lcom/stripe/android/uicore/R$string;->address_label_address:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xe

    const/4 v14, 0x0

    move-object v8, v15

    invoke-direct/range {v8 .. v14}, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;-><init>(Ljava/lang/Integer;IILGX2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    instance-of v8, v3, Lcom/stripe/android/uicore/elements/AddressType$ShippingCondensed;

    const/4 v9, 0x0

    if-eqz v8, :cond_0

    move-object v8, v3

    check-cast v8, Lcom/stripe/android/uicore/elements/AddressType$ShippingCondensed;

    goto :goto_0

    :cond_0
    move-object v8, v9

    :goto_0
    if-eqz v8, :cond_1

    invoke-virtual {v8}, Lcom/stripe/android/uicore/elements/AddressType$ShippingCondensed;->getOnNavigation()Lkotlin/jvm/functions/Function0;

    move-result-object v8

    goto :goto_1

    :cond_1
    move-object v8, v9

    :goto_1
    invoke-direct {v4, v7, v15, v8}, Lcom/stripe/android/uicore/elements/AddressTextFieldElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/TextFieldConfig;Lkotlin/jvm/functions/Function0;)V

    iput-object v4, v0, Lcom/stripe/android/uicore/elements/AddressElement;->addressAutoCompleteElement:Lcom/stripe/android/uicore/elements/AddressTextFieldElement;

    new-instance v4, Lcom/stripe/android/uicore/elements/PhoneNumberElement;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getPhone()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v7

    new-instance v8, Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iget-object v10, v0, Lcom/stripe/android/uicore/elements/AddressElement;->rawValuesMap:Ljava/util/Map;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getPhone()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    invoke-interface {v10, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_2

    const-string v2, ""

    :cond_2
    move-object v11, v2

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-virtual/range {p4 .. p4}, Lcom/stripe/android/uicore/elements/AddressType;->getPhoneNumberState()Lcom/stripe/android/uicore/elements/PhoneNumberState;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/uicore/elements/PhoneNumberState;->OPTIONAL:Lcom/stripe/android/uicore/elements/PhoneNumberState;

    if-ne v2, v3, :cond_3

    const/4 v2, 0x1

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    move v14, v2

    const/4 v15, 0x6

    const/16 v16, 0x0

    move-object v10, v8

    invoke-direct/range {v10 .. v16}, Lcom/stripe/android/uicore/elements/PhoneNumberController;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v4, v7, v8}, Lcom/stripe/android/uicore/elements/PhoneNumberElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/PhoneNumberController;)V

    iput-object v4, v0, Lcom/stripe/android/uicore/elements/AddressElement;->phoneNumberElement:Lcom/stripe/android/uicore/elements/PhoneNumberElement;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v2, v0, Lcom/stripe/android/uicore/elements/AddressElement;->currentValuesMap:Ljava/util/Map;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/CountryElement;->getController()Lcom/stripe/android/uicore/elements/DropdownFieldController;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->getRawFieldValue()LEu1;

    move-result-object v2

    invoke-static {v2}, LVu1;->p(LEu1;)LEu1;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1;

    invoke-direct {v3, v2, v0}, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$1;-><init>(LEu1;Lcom/stripe/android/uicore/elements/AddressElement;)V

    iput-object v3, v0, Lcom/stripe/android/uicore/elements/AddressElement;->otherFields:LEu1;

    if-eqz v5, :cond_4

    invoke-virtual/range {p7 .. p7}, Lcom/stripe/android/uicore/elements/SameAsShippingElement;->getController()Lcom/stripe/android/uicore/elements/SameAsShippingController;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/SameAsShippingController;->getValue()LEu1;

    move-result-object v2

    if-nez v2, :cond_5

    :cond_4
    invoke-static {v9}, LVu1;->G(Ljava/lang/Object;)LEu1;

    move-result-object v2

    :cond_5
    new-instance v4, Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;

    invoke-direct {v4, v0, v6, v9}, Lcom/stripe/android/uicore/elements/AddressElement$sameAsShippingUpdatedFlow$1;-><init>(Lcom/stripe/android/uicore/elements/AddressElement;Ljava/util/Map;Lkotlin/coroutines/Continuation;)V

    invoke-static {v3, v2, v4}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object v2

    iput-object v2, v0, Lcom/stripe/android/uicore/elements/AddressElement;->sameAsShippingUpdatedFlow:LEu1;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/CountryElement;->getController()Lcom/stripe/android/uicore/elements/DropdownFieldController;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->getRawFieldValue()LEu1;

    move-result-object v4

    new-instance v7, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$2;

    invoke-direct {v7, v3}, Lcom/stripe/android/uicore/elements/AddressElement$special$$inlined$map$2;-><init>(LEu1;)V

    invoke-static {v7}, LVu1;->C(LEu1;)LEu1;

    move-result-object v7

    invoke-static {v7}, LVu1;->p(LEu1;)LEu1;

    move-result-object v7

    new-instance v8, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;

    invoke-direct {v8, v0, v5, v6, v9}, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$2;-><init>(Lcom/stripe/android/uicore/elements/AddressElement;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Lkotlin/coroutines/Continuation;)V

    invoke-static {v4, v7, v8}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object v4

    iput-object v4, v0, Lcom/stripe/android/uicore/elements/AddressElement;->fieldsUpdatedFlow:LEu1;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/CountryElement;->getController()Lcom/stripe/android/uicore/elements/DropdownFieldController;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->getRawFieldValue()LEu1;

    move-result-object v1

    new-instance v5, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;

    invoke-direct {v5, v0, v9}, Lcom/stripe/android/uicore/elements/AddressElement$fields$1;-><init>(Lcom/stripe/android/uicore/elements/AddressElement;Lkotlin/coroutines/Continuation;)V

    invoke-static {v1, v3, v2, v4, v5}, LVu1;->l(LEu1;LEu1;LEu1;LEu1;Lkotlin/jvm/functions/Function5;)LEu1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/uicore/elements/AddressElement;->fields:LEu1;

    new-instance v2, Lcom/stripe/android/uicore/elements/AddressController;

    invoke-direct {v2, v1}, Lcom/stripe/android/uicore/elements/AddressController;-><init>(LEu1;)V

    iput-object v2, v0, Lcom/stripe/android/uicore/elements/AddressElement;->controller:Lcom/stripe/android/uicore/elements/AddressController;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/address/AddressRepository;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AddressType;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object/from16 v5, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    new-instance v1, Lcom/stripe/android/uicore/elements/AddressType$Normal;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2, v3}, Lcom/stripe/android/uicore/elements/AddressType$Normal;-><init>(Lcom/stripe/android/uicore/elements/PhoneNumberState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object/from16 v6, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object/from16 v1, p5

    :goto_2
    and-int/lit8 v2, v0, 0x20

    if-eqz v2, :cond_3

    new-instance v2, Lcom/stripe/android/uicore/elements/DropdownFieldController;

    new-instance v3, Lcom/stripe/android/uicore/elements/CountryConfig;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0x3e

    const/4 v15, 0x0

    move-object v7, v3

    move-object v8, v1

    invoke-direct/range {v7 .. v15}, Lcom/stripe/android/uicore/elements/CountryConfig;-><init>(Ljava/util/Set;Ljava/util/Locale;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v4, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v4}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCountry()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lcom/stripe/android/uicore/elements/DropdownFieldController;-><init>(Lcom/stripe/android/uicore/elements/DropdownConfig;Ljava/lang/String;)V

    move-object v8, v2

    goto :goto_3

    :cond_3
    move-object/from16 v8, p6

    :goto_3
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_4

    new-instance v0, Lcom/stripe/android/uicore/elements/DefaultIsPlacesAvailable;

    invoke-direct {v0}, Lcom/stripe/android/uicore/elements/DefaultIsPlacesAvailable;-><init>()V

    move-object v11, v0

    goto :goto_4

    :cond_4
    move-object/from16 v11, p9

    :goto_4
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object v7, v1

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    invoke-direct/range {v2 .. v11}, Lcom/stripe/android/uicore/elements/AddressElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/address/AddressRepository;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AddressType;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Lcom/stripe/android/uicore/elements/IsPlacesAvailable;)V

    return-void
.end method

.method public static final synthetic access$getAddressAutoCompleteElement$p(Lcom/stripe/android/uicore/elements/AddressElement;)Lcom/stripe/android/uicore/elements/AddressTextFieldElement;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->addressAutoCompleteElement:Lcom/stripe/android/uicore/elements/AddressTextFieldElement;

    return-object p0
.end method

.method public static final synthetic access$getAddressRepository$p(Lcom/stripe/android/uicore/elements/AddressElement;)Lcom/stripe/android/uicore/address/AddressRepository;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->addressRepository:Lcom/stripe/android/uicore/address/AddressRepository;

    return-object p0
.end method

.method public static final synthetic access$getAddressType$p(Lcom/stripe/android/uicore/elements/AddressElement;)Lcom/stripe/android/uicore/elements/AddressType;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->addressType:Lcom/stripe/android/uicore/elements/AddressType;

    return-object p0
.end method

.method public static final synthetic access$getCurrentValuesMap$p(Lcom/stripe/android/uicore/elements/AddressElement;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->currentValuesMap:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic access$getLastSameAsShipping$p(Lcom/stripe/android/uicore/elements/AddressElement;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->lastSameAsShipping:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static final synthetic access$getNameElement$p(Lcom/stripe/android/uicore/elements/AddressElement;)Lcom/stripe/android/uicore/elements/SimpleTextElement;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->nameElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

    return-object p0
.end method

.method public static final synthetic access$getPhoneNumberElement$p(Lcom/stripe/android/uicore/elements/AddressElement;)Lcom/stripe/android/uicore/elements/PhoneNumberElement;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->phoneNumberElement:Lcom/stripe/android/uicore/elements/PhoneNumberElement;

    return-object p0
.end method

.method public static final synthetic access$getRawValuesMap$p(Lcom/stripe/android/uicore/elements/AddressElement;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->rawValuesMap:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic access$isPlacesAvailable$p(Lcom/stripe/android/uicore/elements/AddressElement;)Lcom/stripe/android/uicore/elements/IsPlacesAvailable;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->isPlacesAvailable:Lcom/stripe/android/uicore/elements/IsPlacesAvailable;

    return-object p0
.end method

.method public static final synthetic access$setLastSameAsShipping$p(Lcom/stripe/android/uicore/elements/AddressElement;Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressElement;->lastSameAsShipping:Ljava/lang/Boolean;

    return-void
.end method

.method public static synthetic getCountryElement$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final getController()Lcom/stripe/android/uicore/elements/AddressController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->controller:Lcom/stripe/android/uicore/elements/AddressController;

    return-object v0
.end method

.method public final getCountryElement()Lcom/stripe/android/uicore/elements/CountryElement;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->countryElement:Lcom/stripe/android/uicore/elements/CountryElement;

    return-object v0
.end method

.method public final getFields()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->fields:LEu1;

    return-object v0
.end method

.method public getFormFieldValueFlow()LEu1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->fields:LEu1;

    new-instance v1, Lcom/stripe/android/uicore/elements/AddressElement$getFormFieldValueFlow$$inlined$flatMapLatest$1;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/stripe/android/uicore/elements/AddressElement$getFormFieldValueFlow$$inlined$flatMapLatest$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1}, LVu1;->Q(LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object v0

    return-object v0
.end method

.method public getTextFieldIdentifiers()LEu1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->fields:LEu1;

    new-instance v1, Lcom/stripe/android/uicore/elements/AddressElement$getTextFieldIdentifiers$$inlined$flatMapLatest$1;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/stripe/android/uicore/elements/AddressElement$getTextFieldIdentifiers$$inlined$flatMapLatest$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1}, LVu1;->Q(LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object v0

    return-object v0
.end method

.method public sectionFieldErrorController()Lcom/stripe/android/uicore/elements/SectionFieldErrorController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->controller:Lcom/stripe/android/uicore/elements/AddressController;

    return-object v0
.end method

.method public setRawValue(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "rawValuesMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressElement;->rawValuesMap:Ljava/util/Map;

    return-void
.end method
