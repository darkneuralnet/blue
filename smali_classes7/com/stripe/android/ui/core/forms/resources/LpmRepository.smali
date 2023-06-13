.class public final Lcom/stripe/android/ui/core/forms/resources/LpmRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;,
        Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;,
        Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;,
        Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;,
        Lcom/stripe/android/ui/core/forms/resources/LpmRepository$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u001f\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 02\u00020\u0001:\u000501234B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u001f\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001` J\u0014\u0010!\u001a\u0004\u0018\u00010\u00132\u0008\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u001a\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00122\u0008\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u0010\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0012H\u0002J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u0013H\u0002J\u001a\u0010)\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u001b2\u0008\u0010+\u001a\u0004\u0018\u00010\u0013H\u0007J \u0010)\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u001b2\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0012H\u0002J\u0010\u0010-\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00190/R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R!\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00128FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u00065"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository;",
        "",
        "arguments",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;",
        "lpmInitialFormData",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;",
        "lpmPostConfirmData",
        "Lcom/stripe/android/model/LuxePostConfirmActionRepository;",
        "(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;Lcom/stripe/android/model/LuxePostConfirmActionRepository;)V",
        "lpmSerializer",
        "Lcom/stripe/android/ui/core/elements/LpmSerializer;",
        "serverSpecLoadingState",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;",
        "getServerSpecLoadingState",
        "()Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;",
        "setServerSpecLoadingState",
        "(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;)V",
        "supportedPaymentMethods",
        "",
        "",
        "getSupportedPaymentMethods",
        "()Ljava/util/List;",
        "supportedPaymentMethods$delegate",
        "Lkotlin/Lazy;",
        "convertToSupportedPaymentMethod",
        "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
        "stripeIntent",
        "Lcom/stripe/android/model/StripeIntent;",
        "sharedDataSpec",
        "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
        "fromCode",
        "code",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "getJsonStringFromInputStream",
        "inputStream",
        "Ljava/io/InputStream;",
        "parseLpms",
        "readFromDisk",
        "supportsPaymentMethod",
        "",
        "paymentMethodCode",
        "update",
        "",
        "serverLpmSpecs",
        "lpms",
        "updateFromDisk",
        "values",
        "",
        "Companion",
        "LpmInitialFormData",
        "LpmRepositoryArguments",
        "ServerSpecState",
        "SupportedPaymentMethod",
        "payments-ui-core_release"
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
        "SMAP\nLpmRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LpmRepository.kt\ncom/stripe/android/ui/core/forms/resources/LpmRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,561:1\n766#2:562\n857#2,2:563\n766#2:565\n857#2,2:566\n1194#2,2:568\n1222#2,4:570\n1603#2,9:581\n1855#2:590\n1856#2:592\n1612#2:593\n1603#2,9:594\n1855#2:603\n1856#2:605\n1612#2:606\n1194#2,2:607\n1222#2,4:609\n1238#2,4:615\n766#2:619\n857#2,2:620\n819#2:622\n847#2,2:623\n1603#2,9:625\n1855#2:634\n1856#2:636\n1612#2:637\n1194#2,2:638\n1222#2,4:640\n1179#2,2:644\n1253#2,4:646\n467#3,7:574\n442#3:613\n392#3:614\n1#4:591\n1#4:604\n1#4:635\n1#4:650\n*S KotlinDebug\n*F\n+ 1 LpmRepository.kt\ncom/stripe/android/ui/core/forms/resources/LpmRepository\n*L\n131#1:562\n131#1:563,2\n132#1:565\n132#1:566,2\n137#1:568,2\n137#1:570,4\n141#1:581,9\n141#1:590\n141#1:592\n141#1:593\n142#1:594,9\n142#1:603\n142#1:605\n142#1:606\n143#1:607,2\n143#1:609,4\n146#1:615,4\n164#1:619\n164#1:620,2\n165#1:622\n165#1:623,2\n172#1:625,9\n172#1:634\n172#1:636\n172#1:637\n176#1:638,2\n176#1:640,4\n182#1:644,2\n182#1:646,4\n138#1:574,7\n146#1:613\n146#1:614\n141#1:591\n142#1:604\n172#1:635\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$Companion;

.field private static final HardcodedCard:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

.field private static volatile INSTANCE:Lcom/stripe/android/ui/core/forms/resources/LpmRepository;


# instance fields
.field private final arguments:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;

.field private final lpmInitialFormData:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;

.field private final lpmPostConfirmData:Lcom/stripe/android/model/LuxePostConfirmActionRepository;

.field private final lpmSerializer:Lcom/stripe/android/ui/core/elements/LpmSerializer;

.field private serverSpecLoadingState:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;

.field private final supportedPaymentMethods$delegate:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->Companion:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->$stable:I

    new-instance v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const-string v3, "card"

    const/4 v4, 0x0

    sget v5, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_card:I

    sget v6, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_paymentsheet_pm_card:I

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-static {}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->getCardRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v10

    new-instance v11, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    const/4 v2, 0x3

    new-array v12, v2, [Lcom/stripe/android/ui/core/elements/FormItemSpec;

    new-instance v13, Lcom/stripe/android/ui/core/elements/CardDetailsSectionSpec;

    const/4 v14, 0x1

    invoke-direct {v13, v1, v14, v1}, Lcom/stripe/android/ui/core/elements/CardDetailsSectionSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v15, 0x0

    aput-object v13, v12, v15

    new-instance v13, Lcom/stripe/android/ui/core/elements/CardBillingSpec;

    invoke-direct {v13, v1, v1, v2, v1}, Lcom/stripe/android/ui/core/elements/CardBillingSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v13, v12, v14

    new-instance v2, Lcom/stripe/android/ui/core/elements/SaveForFutureUseSpec;

    invoke-direct {v2, v1, v14, v1}, Lcom/stripe/android/ui/core/elements/SaveForFutureUseSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x2

    aput-object v2, v12, v1

    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v11, v1}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    move-object v2, v0

    invoke-direct/range {v2 .. v11}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V

    sput-object v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->HardcodedCard:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;Lcom/stripe/android/model/LuxePostConfirmActionRepository;)V
    .locals 1

    const-string v0, "arguments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lpmInitialFormData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lpmPostConfirmData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->arguments:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;

    iput-object p2, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->lpmInitialFormData:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;

    iput-object p3, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->lpmPostConfirmData:Lcom/stripe/android/model/LuxePostConfirmActionRepository;

    new-instance p1, Lcom/stripe/android/ui/core/elements/LpmSerializer;

    invoke-direct {p1}, Lcom/stripe/android/ui/core/elements/LpmSerializer;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->lpmSerializer:Lcom/stripe/android/ui/core/elements/LpmSerializer;

    sget-object p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$Uninitialized;->INSTANCE:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$Uninitialized;

    iput-object p1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->serverSpecLoadingState:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;

    sget-object p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$supportedPaymentMethods$2;->INSTANCE:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$supportedPaymentMethods$2;

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->supportedPaymentMethods$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;Lcom/stripe/android/model/LuxePostConfirmActionRepository;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;->Companion:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData$Companion;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData$Companion;->getInstance()Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    sget-object p3, Lcom/stripe/android/model/LuxePostConfirmActionRepository;->Companion:Lcom/stripe/android/model/LuxePostConfirmActionRepository$Companion;

    invoke-virtual {p3}, Lcom/stripe/android/model/LuxePostConfirmActionRepository$Companion;->getInstance()Lcom/stripe/android/model/LuxePostConfirmActionRepository;

    move-result-object p3

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;-><init>(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;Lcom/stripe/android/model/LuxePostConfirmActionRepository;)V

    return-void
.end method

.method public static final synthetic access$getHardcodedCard$cp()Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->HardcodedCard:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    return-object v0
.end method

.method public static final synthetic access$getINSTANCE$cp()Lcom/stripe/android/ui/core/forms/resources/LpmRepository;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->INSTANCE:Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    return-object v0
.end method

.method public static final synthetic access$setINSTANCE$cp(Lcom/stripe/android/ui/core/forms/resources/LpmRepository;)V
    .locals 0

    sput-object p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->INSTANCE:Lcom/stripe/android/ui/core/forms/resources/LpmRepository;

    return-void
.end method

.method private final convertToSupportedPaymentMethod(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/ui/core/elements/SharedDataSpec;)Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;
    .locals 13

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getType()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    new-instance p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const-string v4, "card"

    const/4 v5, 0x0

    sget v6, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_card:I

    sget v7, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_paymentsheet_pm_card:I

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getLightThemePng()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_0

    :cond_0
    move-object v8, v2

    :goto_0
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getDarkThemePng()Ljava/lang/String;

    move-result-object v2

    :cond_1
    move-object v9, v2

    const/4 v10, 0x1

    invoke-static {}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->getCardRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v11

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/EmptyFormSpec;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {v0, p2}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    move-object v12, v0

    goto :goto_2

    :cond_3
    :goto_1
    sget-object p2, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->HardcodedCard:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getFormSpec()Lcom/stripe/android/ui/core/elements/LayoutSpec;

    move-result-object p2

    move-object v12, p2

    :goto_2
    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V

    goto :goto_4

    :cond_4
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Bancontact:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    new-instance p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const-string v4, "bancontact"

    const/4 v5, 0x1

    sget v6, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_bancontact:I

    sget v7, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_paymentsheet_pm_bancontact:I

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getLightThemePng()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_3

    :cond_5
    move-object v8, v2

    :goto_3
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getDarkThemePng()Ljava/lang/String;

    move-result-object v2

    :cond_6
    move-object v9, v2

    const/4 v10, 0x0

    invoke-static {}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->getBancontactRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v11

    new-instance v12, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {v12, p2}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V

    :goto_4
    move-object v2, p1

    goto/16 :goto_18

    :cond_7
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Sofort:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    new-instance p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const-string v4, "sofort"

    const/4 v5, 0x1

    sget v6, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_sofort:I

    sget v7, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_paymentsheet_pm_klarna:I

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getLightThemePng()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_5

    :cond_8
    move-object v8, v2

    :goto_5
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getDarkThemePng()Ljava/lang/String;

    move-result-object v2

    :cond_9
    move-object v9, v2

    const/4 v10, 0x0

    invoke-static {}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->getSofortRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v11

    new-instance v12, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {v12, p2}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V

    goto :goto_4

    :cond_a
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Ideal:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    new-instance p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const-string v4, "ideal"

    const/4 v5, 0x1

    sget v6, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_ideal:I

    sget v7, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_paymentsheet_pm_ideal:I

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getLightThemePng()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_6

    :cond_b
    move-object v8, v2

    :goto_6
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getDarkThemePng()Ljava/lang/String;

    move-result-object v2

    :cond_c
    move-object v9, v2

    const/4 v10, 0x0

    invoke-static {}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->getIdealRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v11

    new-instance v12, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {v12, p2}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V

    goto :goto_4

    :cond_d
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->SepaDebit:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    new-instance p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const-string v4, "sepa_debit"

    const/4 v5, 0x1

    sget v6, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_sepa_debit:I

    sget v7, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_paymentsheet_pm_sepa_debit:I

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getLightThemePng()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_7

    :cond_e
    move-object v8, v2

    :goto_7
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getDarkThemePng()Ljava/lang/String;

    move-result-object v2

    :cond_f
    move-object v9, v2

    const/4 v10, 0x0

    invoke-static {}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->getSepaDebitRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v11

    new-instance v12, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {v12, p2}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V

    goto/16 :goto_4

    :cond_10
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Eps:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    new-instance p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const-string v4, "eps"

    const/4 v5, 0x1

    sget v6, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_eps:I

    sget v7, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_paymentsheet_pm_eps:I

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getLightThemePng()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_8

    :cond_11
    move-object v8, v2

    :goto_8
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getDarkThemePng()Ljava/lang/String;

    move-result-object v2

    :cond_12
    move-object v9, v2

    const/4 v10, 0x0

    invoke-static {}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->getEpsRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v11

    new-instance v12, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {v12, p2}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V

    goto/16 :goto_4

    :cond_13
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->P24:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    new-instance p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const-string v4, "p24"

    const/4 v5, 0x0

    sget v6, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_p24:I

    sget v7, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_paymentsheet_pm_p24:I

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getLightThemePng()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_9

    :cond_14
    move-object v8, v2

    :goto_9
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getDarkThemePng()Ljava/lang/String;

    move-result-object v2

    :cond_15
    move-object v9, v2

    const/4 v10, 0x0

    invoke-static {}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->getP24Requirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v11

    new-instance v12, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {v12, p2}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V

    goto/16 :goto_4

    :cond_16
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Giropay:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_19

    new-instance p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const-string v4, "giropay"

    const/4 v5, 0x0

    sget v6, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_giropay:I

    sget v7, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_paymentsheet_pm_giropay:I

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getLightThemePng()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_a

    :cond_17
    move-object v8, v2

    :goto_a
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_18

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getDarkThemePng()Ljava/lang/String;

    move-result-object v2

    :cond_18
    move-object v9, v2

    const/4 v10, 0x0

    invoke-static {}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->getGiropayRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v11

    new-instance v12, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {v12, p2}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V

    goto/16 :goto_4

    :cond_19
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->AfterpayClearpay:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1d

    new-instance p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const-string v4, "afterpay_clearpay"

    const/4 v5, 0x0

    sget-object v0, Lcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement;->Companion:Lcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/AfterpayClearpayHeaderElement$Companion;->isClearpay$payments_ui_core_release()Z

    move-result v0

    if-eqz v0, :cond_1a

    sget v0, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_clearpay:I

    goto :goto_b

    :cond_1a
    sget v0, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_afterpay:I

    :goto_b
    move v6, v0

    sget v7, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_paymentsheet_pm_afterpay_clearpay:I

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getLightThemePng()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_c

    :cond_1b
    move-object v8, v2

    :goto_c
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getDarkThemePng()Ljava/lang/String;

    move-result-object v2

    :cond_1c
    move-object v9, v2

    const/4 v10, 0x0

    invoke-static {}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->getAfterpayClearpayRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v11

    new-instance v12, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {v12, p2}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V

    goto/16 :goto_4

    :cond_1d
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Klarna:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_20

    new-instance p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const-string v4, "klarna"

    const/4 v5, 0x0

    sget v6, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_klarna:I

    sget v7, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_paymentsheet_pm_klarna:I

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_1e

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getLightThemePng()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_d

    :cond_1e
    move-object v8, v2

    :goto_d
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getDarkThemePng()Ljava/lang/String;

    move-result-object v2

    :cond_1f
    move-object v9, v2

    const/4 v10, 0x0

    invoke-static {}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->getKlarnaRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v11

    new-instance v12, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {v12, p2}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V

    goto/16 :goto_4

    :cond_20
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->PayPal:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_24

    invoke-static {p1}, Lcom/stripe/android/ui/core/forms/resources/LpmRepositoryKt;->access$payPalRequiresMandate(Lcom/stripe/android/model/StripeIntent;)Z

    move-result v0

    if-eqz v0, :cond_21

    new-instance v0, Lcom/stripe/android/ui/core/elements/MandateTextSpec;

    sget v1, Lcom/stripe/android/ui/core/R$string;->paypal_mandate:I

    const/4 v3, 0x1

    invoke-direct {v0, v2, v1, v3, v2}, Lcom/stripe/android/ui/core/elements/MandateTextSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_e

    :cond_21
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :goto_e
    new-instance v1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const-string v4, "paypal"

    invoke-static {p1}, Lcom/stripe/android/ui/core/forms/resources/LpmRepositoryKt;->access$payPalRequiresMandate(Lcom/stripe/android/model/StripeIntent;)Z

    move-result v5

    sget v6, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_paypal:I

    sget v7, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_paymentsheet_pm_paypal:I

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object p1

    if-eqz p1, :cond_22

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getLightThemePng()Ljava/lang/String;

    move-result-object p1

    move-object v8, p1

    goto :goto_f

    :cond_22
    move-object v8, v2

    :goto_f
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object p1

    if-eqz p1, :cond_23

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getDarkThemePng()Ljava/lang/String;

    move-result-object v2

    :cond_23
    move-object v9, v2

    const/4 v10, 0x0

    invoke-static {}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->getPaypalRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v11

    new-instance v12, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v12, p1}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    move-object v3, v1

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V

    move-object v2, v1

    goto/16 :goto_18

    :cond_24
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Affirm:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_27

    new-instance p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const-string v4, "affirm"

    const/4 v5, 0x0

    sget v6, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_affirm:I

    sget v7, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_paymentsheet_pm_affirm:I

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_25

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getLightThemePng()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_10

    :cond_25
    move-object v8, v2

    :goto_10
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_26

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getDarkThemePng()Ljava/lang/String;

    move-result-object v2

    :cond_26
    move-object v9, v2

    const/4 v10, 0x0

    invoke-static {}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->getAffirmRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v11

    new-instance v12, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {v12, p2}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V

    goto/16 :goto_4

    :cond_27
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->RevolutPay:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2a

    new-instance p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const-string v4, "revolut_pay"

    const/4 v5, 0x0

    sget v6, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_revolut_pay:I

    sget v7, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_paymentsheet_pm_revolut_pay:I

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_28

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getLightThemePng()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_11

    :cond_28
    move-object v8, v2

    :goto_11
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_29

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getDarkThemePng()Ljava/lang/String;

    move-result-object v2

    :cond_29
    move-object v9, v2

    const/4 v10, 0x0

    invoke-static {}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->getRevolutPayRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v11

    new-instance v12, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {v12, p2}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V

    goto/16 :goto_4

    :cond_2a
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->MobilePay:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2d

    new-instance p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const-string v4, "mobilepay"

    const/4 v5, 0x0

    sget v6, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_mobile_pay:I

    sget v7, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_paymentsheet_pm_mobile_pay:I

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_2b

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getLightThemePng()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_12

    :cond_2b
    move-object v8, v2

    :goto_12
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_2c

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getDarkThemePng()Ljava/lang/String;

    move-result-object v2

    :cond_2c
    move-object v9, v2

    const/4 v10, 0x0

    invoke-static {}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->getMobilePayRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v11

    new-instance v12, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {v12, p2}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V

    goto/16 :goto_4

    :cond_2d
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->Zip:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_30

    new-instance p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const-string v4, "zip"

    const/4 v5, 0x0

    sget v6, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_zip:I

    sget v7, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_paymentsheet_pm_zip:I

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_2e

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getLightThemePng()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_13

    :cond_2e
    move-object v8, v2

    :goto_13
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_2f

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getDarkThemePng()Ljava/lang/String;

    move-result-object v2

    :cond_2f
    move-object v9, v2

    const/4 v10, 0x0

    invoke-static {}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->getZipRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v11

    new-instance v12, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {v12, p2}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V

    goto/16 :goto_4

    :cond_30
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->AuBecsDebit:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_33

    new-instance p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const-string v4, "au_becs_debit"

    const/4 v5, 0x1

    sget v6, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_au_becs_debit:I

    sget v7, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_paymentsheet_pm_bank:I

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_31

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getLightThemePng()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_14

    :cond_31
    move-object v8, v2

    :goto_14
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_32

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getDarkThemePng()Ljava/lang/String;

    move-result-object v2

    :cond_32
    move-object v9, v2

    const/4 v10, 0x1

    invoke-static {}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->getAuBecsDebitRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v11

    new-instance v12, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {v12, p2}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V

    goto/16 :goto_4

    :cond_33
    sget-object v1, Lcom/stripe/android/model/PaymentMethod$Type;->USBankAccount:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v1, v1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_36

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getClientSecret()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3c

    new-instance p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const-string v4, "us_bank_account"

    const/4 v5, 0x1

    sget v6, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_us_bank_account:I

    sget v7, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_paymentsheet_pm_bank:I

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_34

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getLightThemePng()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_15

    :cond_34
    move-object v8, v2

    :goto_15
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_35

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getDarkThemePng()Ljava/lang/String;

    move-result-object v2

    :cond_35
    move-object v9, v2

    const/4 v10, 0x1

    invoke-static {}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->getUSBankAccountRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v11

    new-instance v12, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {v12, p2}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V

    goto/16 :goto_4

    :cond_36
    sget-object p1, Lcom/stripe/android/model/PaymentMethod$Type;->Upi:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_39

    new-instance p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const-string v4, "upi"

    const/4 v5, 0x0

    sget v6, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_upi:I

    sget v7, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_paymentsheet_pm_upi:I

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_37

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getLightThemePng()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_16

    :cond_37
    move-object v8, v2

    :goto_16
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_38

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getDarkThemePng()Ljava/lang/String;

    move-result-object v2

    :cond_38
    move-object v9, v2

    const/4 v10, 0x0

    invoke-static {}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->getUpiRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v11

    new-instance v12, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {v12, p2}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V

    goto/16 :goto_4

    :cond_39
    sget-object p1, Lcom/stripe/android/model/PaymentMethod$Type;->CashAppPay:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3c

    new-instance p1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    const-string v4, "cashapp"

    const/4 v5, 0x0

    sget v6, Lcom/stripe/android/ui/core/R$string;->stripe_paymentsheet_payment_method_cashapp:I

    sget v7, Lcom/stripe/android/ui/core/R$drawable;->stripe_ic_paymentsheet_pm_cash_app_pay:I

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_3a

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getLightThemePng()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    goto :goto_17

    :cond_3a
    move-object v8, v2

    :goto_17
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getSelectorIcon()Lcom/stripe/android/ui/core/elements/SelectorIcon;

    move-result-object v0

    if-eqz v0, :cond_3b

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SelectorIcon;->getDarkThemePng()Ljava/lang/String;

    move-result-object v2

    :cond_3b
    move-object v9, v2

    const/4 v10, 0x0

    invoke-static {}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->getCashAppPayRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    move-result-object v11

    new-instance v12, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object p2

    invoke-direct {v12, p2}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;-><init>(Ljava/lang/String;ZIILjava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;Lcom/stripe/android/ui/core/elements/LayoutSpec;)V

    goto/16 :goto_4

    :cond_3c
    :goto_18
    return-object v2
.end method

.method private final getJsonStringFromInputStream(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-direct {v2, p1, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    instance-of p1, v2, Ljava/io/BufferedReader;

    if-eqz p1, :cond_0

    check-cast v2, Ljava/io/BufferedReader;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/BufferedReader;

    const/16 v1, 0x2000

    invoke-direct {p1, v2, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    move-object v2, p1

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    if-eqz v2, :cond_2

    :try_start_0
    invoke-static {v2}, Lkotlin/io/TextStreamsKt;->readText(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v2, p1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    move-object p1, v0

    :goto_1
    invoke-static {v2, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object p1
.end method

.method private final parseLpms(Ljava/io/InputStream;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
            ">;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->getJsonStringFromInputStream(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->lpmSerializer:Lcom/stripe/android/ui/core/elements/LpmSerializer;

    invoke-virtual {v0, p1}, Lcom/stripe/android/ui/core/elements/LpmSerializer;->deserializeList(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private final readFromDisk()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->arguments:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "lpms.json"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->parseLpms(Ljava/io/InputStream;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private final supportsPaymentMethod(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->getSupportedPaymentMethods()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final update(Lcom/stripe/android/model/StripeIntent;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/StripeIntent;",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/SharedDataSpec;",
            ">;)V"
        }
    .end annotation

    if-eqz p2, :cond_4

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->supportsPaymentMethod(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    iget-object v3, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->arguments:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;

    invoke-virtual {v3}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmRepositoryArguments;->isFinancialConnectionsAvailable()Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;

    move-result-object v3

    invoke-interface {v3}, Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsAvailable;->invoke()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getType()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/model/PaymentMethod$Type;->USBankAccount:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v3, v3, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, 0x1

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    if-nez v2, :cond_2

    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    const/4 p2, 0x0

    :cond_5
    const/16 v0, 0x10

    const/16 v1, 0xa

    if-eqz p2, :cond_9

    move-object v2, p2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    invoke-direct {p0, p1, v4}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->convertToSupportedPaymentMethod(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/ui/core/elements/SharedDataSpec;)Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_9

    iget-object v2, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->lpmInitialFormData:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v3

    invoke-static {v3, v0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v3

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    invoke-virtual {v5}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_8
    invoke-virtual {v2, v4}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;->putAll(Ljava/util/Map;)V

    :cond_9
    if-eqz p2, :cond_b

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result p1

    invoke-static {p1, v0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result p1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getNextActionSpec()Lcom/stripe/android/ui/core/elements/NextActionSpec;

    move-result-object p2

    invoke-static {p2}, Lcom/stripe/android/ui/core/elements/NextActionSpecKt;->transform(Lcom/stripe/android/ui/core/elements/NextActionSpec;)Lcom/stripe/android/model/LuxePostConfirmActionRepository$LuxeAction;

    move-result-object p2

    invoke-static {v1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    invoke-virtual {p2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_a
    iget-object p1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->lpmPostConfirmData:Lcom/stripe/android/model/LuxePostConfirmActionRepository;

    invoke-virtual {p1, v0}, Lcom/stripe/android/model/LuxePostConfirmActionRepository;->update(Ljava/util/Map;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final fromCode(Ljava/lang/String;)Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->lpmInitialFormData:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;

    invoke-virtual {v0, p1}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;->fromCode(Ljava/lang/String;)Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    move-result-object p1

    return-object p1
.end method

.method public final getServerSpecLoadingState()Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->serverSpecLoadingState:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;

    return-object v0
.end method

.method public final getSupportedPaymentMethods()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->supportedPaymentMethods$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final setServerSpecLoadingState(Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->serverSpecLoadingState:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;

    return-void
.end method

.method public final update(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;)V
    .locals 8

    const-string v0, "stripeIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/stripe/android/model/StripeIntent;->getPaymentMethodTypes()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$NoServerSpec;

    invoke-direct {v1, p2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$NoServerSpec;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->serverSpecLoadingState:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;

    const/4 v1, 0x1

    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v1

    :goto_1
    if-nez v2, :cond_3

    new-instance v2, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$ServerNotParsed;

    invoke-direct {v2, p2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$ServerNotParsed;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->serverSpecLoadingState:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;

    iget-object v2, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->lpmSerializer:Lcom/stripe/android/ui/core/elements/LpmSerializer;

    invoke-virtual {v2, p2}, Lcom/stripe/android/ui/core/elements/LpmSerializer;->deserializeList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v1

    if-eqz v3, :cond_2

    new-instance v3, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$ServerParsed;

    invoke-direct {v3, p2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState$ServerParsed;-><init>(Ljava/lang/String;)V

    iput-object v3, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->serverSpecLoadingState:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$ServerSpecState;

    :cond_2
    invoke-direct {p0, p1, v2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->update(Lcom/stripe/android/model/StripeIntent;Ljava/util/List;)V

    :cond_3
    move-object p2, v0

    check-cast p2, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->lpmInitialFormData:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;

    invoke-virtual {v5, v4}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;->containsKey(Ljava/lang/String;)Z

    move-result v4

    xor-int/2addr v4, v1

    if-eqz v4, :cond_4

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    invoke-direct {p0, v4}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->supportsPaymentMethod(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {p2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/2addr v1, v2

    if-eqz v1, :cond_13

    invoke-direct {p0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->readFromDisk()Ljava/util/List;

    move-result-object v1

    const/16 v2, 0x10

    const/16 v3, 0xa

    const/4 v4, 0x0

    if-eqz v1, :cond_a

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v5

    invoke-static {v5, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v5

    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    invoke-virtual {v7}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getType()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_8
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_9
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v0, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v1, v7, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_a
    move-object v1, v4

    :cond_b
    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->lpmInitialFormData:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_c
    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v1, :cond_d

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    goto :goto_7

    :cond_d
    move-object v6, v4

    :goto_7
    if-eqz v6, :cond_c

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_e
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_f
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    invoke-direct {p0, p1, v5}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->convertToSupportedPaymentMethod(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/ui/core/elements/SharedDataSpec;)Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    move-result-object v5

    if-eqz v5, :cond_f

    invoke-interface {p2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_10
    invoke-static {p2, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result p1

    invoke-static {p1, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result p1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_11

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v3, p2

    check-cast v3, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;

    invoke-virtual {v3}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;->getCode()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    :cond_11
    invoke-virtual {v0, v2}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;->putAll(Ljava/util/Map;)V

    if-eqz v1, :cond_13

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result p2

    invoke-static {p2}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_a
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/ui/core/elements/SharedDataSpec;

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getNextActionSpec()Lcom/stripe/android/ui/core/elements/NextActionSpec;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/ui/core/elements/NextActionSpecKt;->transform(Lcom/stripe/android/ui/core/elements/NextActionSpec;)Lcom/stripe/android/model/LuxePostConfirmActionRepository$LuxeAction;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    :cond_12
    iget-object p2, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->lpmPostConfirmData:Lcom/stripe/android/model/LuxePostConfirmActionRepository;

    invoke-virtual {p2, p1}, Lcom/stripe/android/model/LuxePostConfirmActionRepository;->update(Ljava/util/Map;)V

    :cond_13
    return-void
.end method

.method public final updateFromDisk(Lcom/stripe/android/model/StripeIntent;)V
    .locals 1

    const-string v0, "stripeIntent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->readFromDisk()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->update(Lcom/stripe/android/model/StripeIntent;Ljava/util/List;)V

    return-void
.end method

.method public final values()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/stripe/android/ui/core/forms/resources/LpmRepository$SupportedPaymentMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/ui/core/forms/resources/LpmRepository;->lpmInitialFormData:Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/forms/resources/LpmRepository$LpmInitialFormData;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
