.class public abstract Lcom/stripe/android/ui/core/elements/CardNumberController;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/uicore/elements/TextFieldController;
.implements Lcom/stripe/android/uicore/elements/SectionFieldErrorController;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u00002\u00020\u00012\u00020\u0002B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0017\u0010\rJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003R \u0010\u0008\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\t\u0012\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u0082\u0001\u0002\u0018\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/CardNumberController;",
        "Lcom/stripe/android/uicore/elements/TextFieldController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;",
        "Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;",
        "cardScanSheetResult",
        "",
        "onCardScanResult",
        "LRu;",
        "autofillType",
        "LRu;",
        "getAutofillType",
        "()LRu;",
        "getAutofillType$annotations",
        "()V",
        "LEu1;",
        "Lcom/stripe/android/model/CardBrand;",
        "getCardBrandFlow",
        "()LEu1;",
        "cardBrandFlow",
        "",
        "getCardScanEnabled",
        "()Z",
        "cardScanEnabled",
        "<init>",
        "Lcom/stripe/android/ui/core/elements/CardNumberEditableController;",
        "Lcom/stripe/android/ui/core/elements/CardNumberViewOnlyController;",
        "payments-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final autofillType:LRu;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LRu;->i:LRu;

    iput-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberController;->autofillType:LRu;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/ui/core/elements/CardNumberController;-><init>()V

    return-void
.end method

.method public static synthetic getAutofillType$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public ComposeUI-MxjM1cc(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            "LgV2;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "II",
            "LEt0;",
            "I)V"
        }
    .end annotation

    invoke-static/range {p0 .. p9}, Lcom/stripe/android/uicore/elements/TextFieldController$DefaultImpls;->ComposeUI-MxjM1cc(Lcom/stripe/android/uicore/elements/TextFieldController;ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V

    return-void
.end method

.method public getAutofillType()LRu;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberController;->autofillType:LRu;

    return-object v0
.end method

.method public abstract getCardBrandFlow()LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/model/CardBrand;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getCardScanEnabled()Z
.end method

.method public getEnabled()Z
    .locals 1

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/TextFieldController$DefaultImpls;->getEnabled(Lcom/stripe/android/uicore/elements/TextFieldController;)Z

    move-result v0

    return v0
.end method

.method public getPlaceHolder()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/TextFieldController$DefaultImpls;->getPlaceHolder(Lcom/stripe/android/uicore/elements/TextFieldController;)LEu1;

    move-result-object v0

    return-object v0
.end method

.method public final onCardScanResult(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;)V
    .locals 1

    const-string v0, "cardScanSheetResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult$Completed;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult$Completed;

    invoke-virtual {p1}, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult$Completed;->getScannedCard()Lcom/stripe/android/stripecardscan/payment/card/ScannedCard;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/stripecardscan/payment/card/ScannedCard;->getPan()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/stripe/android/uicore/elements/InputController;->onRawValueChange(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
