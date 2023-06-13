.class public final Lcom/stripe/android/paymentsheet/forms/FormViewModel;
.super LOr6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001:\u00012B7\u0008\u0001\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0004\u00080\u00101J\u001d\u0010\u0008\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR#\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u000c\u001a\u0004\u0008\u0012\u0010\u000eR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u000cR \u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u000c\u001a\u0004\u0008\u0016\u0010\u000eR!\u0010\u0019\u001a\u000f\u0012\u000b\u0012\t\u0018\u00010\u0017\u00a2\u0006\u0002\u0008\u00180\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u000cR\"\u0010\u001b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR&\u0010\u001d\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\t8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u000c\u001a\u0004\u0008\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u000cR\u001a\u0010!\u001a\u0008\u0012\u0004\u0012\u00020 0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u000cR\u001f\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u000c\u001a\u0004\u0008$\u0010\u000eR \u0010%\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u000f0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010\u000cR\u001f\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\u000c\u001a\u0004\u0008\'\u0010\u000e\u00a8\u00063"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/forms/FormViewModel;",
        "LOr6;",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "identifierSpecs",
        "",
        "addHiddenIdentifiers$paymentsheet_release",
        "(Ljava/util/Set;)V",
        "addHiddenIdentifiers",
        "LEu1;",
        "",
        "showCheckboxFlow",
        "LEu1;",
        "getShowCheckboxFlow",
        "()LEu1;",
        "",
        "Lcom/stripe/android/uicore/elements/FormElement;",
        "elementsFlow",
        "getElementsFlow",
        "Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;",
        "saveForFutureUseElement",
        "saveForFutureUse",
        "getSaveForFutureUse$paymentsheet_release",
        "Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;",
        "Lkotlin/internal/NoInfer;",
        "cardBillingElement",
        "LGX2;",
        "externalHiddenIdentifiers",
        "LGX2;",
        "hiddenIdentifiers",
        "getHiddenIdentifiers$paymentsheet_release",
        "showingMandate",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;",
        "userRequestedReuse",
        "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
        "completeFormValues",
        "getCompleteFormValues",
        "textFieldControllerIdsFlow",
        "lastTextFieldIdentifier",
        "getLastTextFieldIdentifier",
        "Landroid/content/Context;",
        "context",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
        "formArguments",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
        "lpmRepository",
        "Lcom/stripe/android/uicore/address/AddressRepository;",
        "addressRepository",
        "<init>",
        "(Landroid/content/Context;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Lcom/stripe/android/uicore/address/AddressRepository;LEu1;)V",
        "Factory",
        "paymentsheet_release"
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
        "SMAP\nFormViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormViewModel.kt\ncom/stripe/android/paymentsheet/forms/FormViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,194:1\n47#2:195\n49#2:199\n47#2:200\n49#2:204\n47#2:205\n49#2:209\n47#2:210\n49#2:214\n47#2:215\n49#2:219\n47#2:220\n49#2:224\n50#3:196\n55#3:198\n50#3:201\n55#3:203\n50#3:206\n55#3:208\n50#3:211\n55#3:213\n50#3:216\n55#3:218\n50#3:221\n55#3:223\n106#4:197\n106#4:202\n106#4:207\n106#4:212\n106#4:217\n106#4:222\n*S KotlinDebug\n*F\n+ 1 FormViewModel.kt\ncom/stripe/android/paymentsheet/forms/FormViewModel\n*L\n82#1:195\n82#1:199\n88#1:200\n88#1:204\n93#1:205\n93#1:209\n109#1:210\n109#1:214\n165#1:215\n165#1:219\n179#1:220\n179#1:224\n82#1:196\n82#1:198\n88#1:201\n88#1:203\n93#1:206\n93#1:208\n109#1:211\n109#1:213\n165#1:216\n165#1:218\n179#1:221\n179#1:223\n82#1:197\n88#1:202\n93#1:207\n109#1:212\n165#1:217\n179#1:222\n*E\n"
    }
.end annotation


# instance fields
.field private final cardBillingElement:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;",
            ">;"
        }
    .end annotation
.end field

.field private final completeFormValues:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            ">;"
        }
    .end annotation
.end field

.field private final elementsFlow:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;>;"
        }
    .end annotation
.end field

.field private externalHiddenIdentifiers:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;"
        }
    .end annotation
.end field

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

.field private final lastTextFieldIdentifier:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;"
        }
    .end annotation
.end field

.field private final saveForFutureUse:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final saveForFutureUseElement:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;",
            ">;"
        }
    .end annotation
.end field

.field private final showCheckboxFlow:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final showingMandate:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final textFieldControllerIdsFlow:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;"
        }
    .end annotation
.end field

.field private final userRequestedReuse:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/ui/core/forms/resources/LpmRepository;Lcom/stripe/android/uicore/address/AddressRepository;LEu1;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
            "Lcom/stripe/android/uicore/address/AddressRepository;",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p5

    const-string v3, "context"

    move-object/from16 v11, p1

    invoke-static {v11, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "formArguments"

    move-object/from16 v15, p2

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "lpmRepository"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "addressRepository"

    move-object/from16 v5, p4

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "showCheckboxFlow"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, LOr6;-><init>()V

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->showCheckboxFlow:LEu1;

    invoke-static/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArgumentsKt;->getInitialValuesMap(Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;)Ljava/util/Map;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getAmount()Lcom/stripe/android/ui/core/Amount;

    move-result-object v8

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getShowCheckboxControlledFields()Z

    move-result v9

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getMerchantName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getShippingDetails()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;

    move-result-object v3

    const/4 v14, 0x0

    if-eqz v3, :cond_0

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getBillingDetails()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/stripe/android/paymentsheet/addresselement/AddressDetailsKt;->toIdentifierMap(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;)Ljava/util/Map;

    move-result-object v3

    move-object v7, v3

    goto :goto_0

    :cond_0
    move-object v7, v14

    :goto_0
    new-instance v3, Lcom/stripe/android/ui/core/forms/TransformSpecToElements;

    const/4 v12, 0x0

    const/16 v13, 0x80

    const/16 v16, 0x0

    move-object v4, v3

    move-object/from16 v5, p4

    move-object/from16 v11, p1

    move-object v15, v14

    move-object/from16 v14, v16

    invoke-direct/range {v4 .. v14}, Lcom/stripe/android/ui/core/forms/TransformSpecToElements;-><init>(Lcom/stripe/android/uicore/address/AddressRepository;Ljava/util/Map;Ljava/util/Map;Lcom/stripe/android/ui/core/Amount;ZLjava/lang/String;Landroid/content/Context;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p2 .. p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getPaymentMethodCode()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->fromCode(Ljava/lang/String;)Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getFormSpec()Lcom/stripe/android/ui/core/elements/LayoutSpec;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/LayoutSpec;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v3, v1}, Lcom/stripe/android/ui/core/forms/TransformSpecToElements;->transform(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, LVu1;->G(Ljava/lang/Object;)LEu1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->elementsFlow:LEu1;

    new-instance v3, Lcom/stripe/android/paymentsheet/forms/FormViewModel$special$$inlined$map$1;

    invoke-direct {v3, v1}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$special$$inlined$map$1;-><init>(LEu1;)V

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->saveForFutureUseElement:LEu1;

    new-instance v4, Lcom/stripe/android/paymentsheet/forms/FormViewModel$special$$inlined$map$2;

    invoke-direct {v4, v3}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$special$$inlined$map$2;-><init>(LEu1;)V

    invoke-static {v4}, LVu1;->C(LEu1;)LEu1;

    move-result-object v3

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->saveForFutureUse:LEu1;

    new-instance v3, Lcom/stripe/android/paymentsheet/forms/FormViewModel$special$$inlined$map$3;

    invoke-direct {v3, v1}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$special$$inlined$map$3;-><init>(LEu1;)V

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->cardBillingElement:LEu1;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v4

    invoke-static {v4}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v4

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->externalHiddenIdentifiers:LGX2;

    new-instance v4, Lcom/stripe/android/paymentsheet/forms/FormViewModel$special$$inlined$map$4;

    invoke-direct {v4, v3}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$special$$inlined$map$4;-><init>(LEu1;)V

    invoke-static {v4}, LVu1;->C(LEu1;)LEu1;

    move-result-object v3

    iget-object v4, v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->externalHiddenIdentifiers:LGX2;

    new-instance v5, Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;

    invoke-direct {v5, v0, v15}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$hiddenIdentifiers$2;-><init>(Lcom/stripe/android/paymentsheet/forms/FormViewModel;Lkotlin/coroutines/Continuation;)V

    invoke-static {v2, v3, v4, v5}, LVu1;->m(LEu1;LEu1;LEu1;Lkotlin/jvm/functions/Function4;)LEu1;

    move-result-object v3

    iput-object v3, v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->hiddenIdentifiers:LEu1;

    new-instance v4, Lcom/stripe/android/paymentsheet/forms/FormViewModel$showingMandate$1;

    invoke-direct {v4, v15}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$showingMandate$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v3, v1, v4}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object v4

    iput-object v4, v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->showingMandate:LEu1;

    invoke-static {v1}, LVu1;->v(LEu1;)LEu1;

    move-result-object v5

    new-instance v6, Lcom/stripe/android/paymentsheet/forms/FormViewModel$userRequestedReuse$1;

    invoke-direct {v6, v15}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$userRequestedReuse$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v5, v2, v6}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object v2

    invoke-static {v2}, LVu1;->C(LEu1;)LEu1;

    move-result-object v2

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->userRequestedReuse:LEu1;

    new-instance v5, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;

    invoke-static {v1}, LVu1;->v(LEu1;)LEu1;

    move-result-object v6

    new-instance v7, Lcom/stripe/android/paymentsheet/forms/FormViewModel$special$$inlined$map$5;

    invoke-direct {v7, v6}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$special$$inlined$map$5;-><init>(LEu1;)V

    invoke-static {v7}, LVu1;->C(LEu1;)LEu1;

    move-result-object v6

    invoke-direct {v5, v6, v3, v4, v2}, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;-><init>(LEu1;LEu1;LEu1;LEu1;)V

    invoke-virtual {v5}, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;->filterFlow()LEu1;

    move-result-object v2

    iput-object v2, v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->completeFormValues:LEu1;

    invoke-static {v1}, LVu1;->v(LEu1;)LEu1;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/paymentsheet/forms/FormViewModel$special$$inlined$map$6;

    invoke-direct {v2, v1}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$special$$inlined$map$6;-><init>(LEu1;)V

    invoke-static {v2}, LVu1;->C(LEu1;)LEu1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->textFieldControllerIdsFlow:LEu1;

    new-instance v2, Lcom/stripe/android/paymentsheet/forms/FormViewModel$lastTextFieldIdentifier$1;

    invoke-direct {v2, v15}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$lastTextFieldIdentifier$1;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v3, v1, v2}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->lastTextFieldIdentifier:LEu1;

    return-void

    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Required value was null."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static final synthetic access$getSaveForFutureUseElement$p(Lcom/stripe/android/paymentsheet/forms/FormViewModel;)LEu1;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->saveForFutureUseElement:LEu1;

    return-object p0
.end method


# virtual methods
.method public final addHiddenIdentifiers$paymentsheet_release(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;)V"
        }
    .end annotation

    const-string v0, "identifierSpecs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->externalHiddenIdentifiers:LGX2;

    invoke-interface {v0, p1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final getCompleteFormValues()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->completeFormValues:LEu1;

    return-object v0
.end method

.method public final getElementsFlow()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->elementsFlow:LEu1;

    return-object v0
.end method

.method public final getHiddenIdentifiers$paymentsheet_release()LEu1;
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

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->hiddenIdentifiers:LEu1;

    return-object v0
.end method

.method public final getLastTextFieldIdentifier()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->lastTextFieldIdentifier:LEu1;

    return-object v0
.end method

.method public final getSaveForFutureUse$paymentsheet_release()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->saveForFutureUse:LEu1;

    return-object v0
.end method

.method public final getShowCheckboxFlow()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->showCheckboxFlow:LEu1;

    return-object v0
.end method
