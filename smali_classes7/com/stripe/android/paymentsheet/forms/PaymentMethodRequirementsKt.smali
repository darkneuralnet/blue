.class public final Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\'\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0003\"\u0014\u0010\u0008\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0003\"\u0014\u0010\n\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0003\"\u0014\u0010\u000c\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u0003\"\u0014\u0010\u000e\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0003\"\u0014\u0010\u0010\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0003\"\u0014\u0010\u0012\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0003\"\u0014\u0010\u0014\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0003\"\u0014\u0010\u0016\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0003\"\u0014\u0010\u0018\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0003\"\u0014\u0010\u001a\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0003\"\u0014\u0010\u001c\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0003\"\u0014\u0010\u001e\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0003\"\u0014\u0010 \u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u0003\"\u0014\u0010\"\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010\u0003\"\u0014\u0010$\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u0003\"\u0014\u0010&\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u0003\u00a8\u0006("
    }
    d2 = {
        "AffirmRequirement",
        "Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;",
        "getAffirmRequirement",
        "()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;",
        "AfterpayClearpayRequirement",
        "getAfterpayClearpayRequirement",
        "AuBecsDebitRequirement",
        "getAuBecsDebitRequirement",
        "BancontactRequirement",
        "getBancontactRequirement",
        "CardRequirement",
        "getCardRequirement",
        "CashAppPayRequirement",
        "getCashAppPayRequirement",
        "EpsRequirement",
        "getEpsRequirement",
        "GiropayRequirement",
        "getGiropayRequirement",
        "IdealRequirement",
        "getIdealRequirement",
        "KlarnaRequirement",
        "getKlarnaRequirement",
        "MobilePayRequirement",
        "getMobilePayRequirement",
        "P24Requirement",
        "getP24Requirement",
        "PaypalRequirement",
        "getPaypalRequirement",
        "RevolutPayRequirement",
        "getRevolutPayRequirement",
        "SepaDebitRequirement",
        "getSepaDebitRequirement",
        "SofortRequirement",
        "getSofortRequirement",
        "USBankAccountRequirement",
        "getUSBankAccountRequirement",
        "UpiRequirement",
        "getUpiRequirement",
        "ZipRequirement",
        "getZipRequirement",
        "payments-ui-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final AffirmRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

.field private static final AfterpayClearpayRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

.field private static final AuBecsDebitRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

.field private static final BancontactRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

.field private static final CardRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

.field private static final CashAppPayRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

.field private static final EpsRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

.field private static final GiropayRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

.field private static final IdealRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

.field private static final KlarnaRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

.field private static final MobilePayRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

.field private static final P24Requirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

.field private static final PaypalRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

.field private static final RevolutPayRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

.field private static final SepaDebitRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

.field private static final SofortRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

.field private static final USBankAccountRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

.field private static final UpiRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

.field private static final ZipRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v1

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->CardRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v4, v2}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->BancontactRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    sget-object v1, Lcom/stripe/android/paymentsheet/forms/Delayed;->INSTANCE:Lcom/stripe/android/paymentsheet/forms/Delayed;

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    invoke-direct {v0, v5, v4, v2}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->SofortRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v5

    invoke-direct {v0, v5, v4, v2}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->IdealRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    invoke-direct {v0, v5, v4, v2}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->SepaDebitRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v5

    invoke-direct {v0, v5, v4, v4}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->EpsRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v5

    invoke-direct {v0, v5, v4, v4}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->P24Requirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v5

    invoke-direct {v0, v5, v4, v4}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->GiropayRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    sget-object v5, Lcom/stripe/android/paymentsheet/forms/ShippingAddress;->INSTANCE:Lcom/stripe/android/paymentsheet/forms/ShippingAddress;

    invoke-static {v5}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    invoke-direct {v0, v6, v4, v4}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->AfterpayClearpayRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v6

    invoke-direct {v0, v6, v4, v4}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->KlarnaRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v6

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v7

    invoke-direct {v0, v6, v7, v3}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->PaypalRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    invoke-static {v5}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    invoke-direct {v0, v5, v4, v4}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->AffirmRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v5

    invoke-direct {v0, v5, v4, v4}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->RevolutPayRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v5

    invoke-direct {v0, v5, v4, v4}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->MobilePayRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    invoke-direct {v0, v5, v4, v4}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->AuBecsDebitRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v5

    invoke-direct {v0, v5, v4, v4}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->ZipRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v5, v1, v3}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->USBankAccountRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1, v4, v4}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->UpiRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1, v4, v2}, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;-><init>(Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->CashAppPayRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-void
.end method

.method public static final getAffirmRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->AffirmRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-object v0
.end method

.method public static final getAfterpayClearpayRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->AfterpayClearpayRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-object v0
.end method

.method public static final getAuBecsDebitRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->AuBecsDebitRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-object v0
.end method

.method public static final getBancontactRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->BancontactRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-object v0
.end method

.method public static final getCardRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->CardRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-object v0
.end method

.method public static final getCashAppPayRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->CashAppPayRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-object v0
.end method

.method public static final getEpsRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->EpsRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-object v0
.end method

.method public static final getGiropayRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->GiropayRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-object v0
.end method

.method public static final getIdealRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->IdealRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-object v0
.end method

.method public static final getKlarnaRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->KlarnaRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-object v0
.end method

.method public static final getMobilePayRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->MobilePayRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-object v0
.end method

.method public static final getP24Requirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->P24Requirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-object v0
.end method

.method public static final getPaypalRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->PaypalRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-object v0
.end method

.method public static final getRevolutPayRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->RevolutPayRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-object v0
.end method

.method public static final getSepaDebitRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->SepaDebitRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-object v0
.end method

.method public static final getSofortRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->SofortRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-object v0
.end method

.method public static final getUSBankAccountRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->USBankAccountRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-object v0
.end method

.method public static final getUpiRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->UpiRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-object v0
.end method

.method public static final getZipRequirement()Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirementsKt;->ZipRequirement:Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;

    return-object v0
.end method
