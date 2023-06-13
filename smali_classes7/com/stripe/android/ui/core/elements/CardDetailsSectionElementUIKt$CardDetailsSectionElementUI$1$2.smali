.class final Lcom/stripe/android/ui/core/elements/CardDetailsSectionElementUIKt$CardDetailsSectionElementUI$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/ui/core/elements/CardDetailsSectionElementUIKt;->CardDetailsSectionElementUI(ZLcom/stripe/android/ui/core/elements/CardDetailsSectionController;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/content/Intent;",
        "Lkotlin/Unit;",
        ">;"
    }
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


# instance fields
.field final synthetic $controller:Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;


# direct methods
.method public constructor <init>(Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionElementUIKt$CardDetailsSectionElementUI$1$2;->$controller:Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Intent;

    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/elements/CardDetailsSectionElementUIKt$CardDetailsSectionElementUI$1$2;->invoke(Landroid/content/Intent;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/content/Intent;)V
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsSectionElementUIKt$CardDetailsSectionElementUI$1$2;->$controller:Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/CardDetailsSectionController;->getCardDetailsElement$payments_ui_core_release()Lcom/stripe/android/ui/core/elements/CardDetailsElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->getController()Lcom/stripe/android/ui/core/elements/CardDetailsController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getNumberElement()Lcom/stripe/android/ui/core/elements/CardNumberElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/CardNumberElement;->getController()Lcom/stripe/android/ui/core/elements/CardNumberController;

    move-result-object v0

    const-string v1, "CardScanActivityResult"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;

    if-nez p1, :cond_0

    new-instance p1, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult$Failed;

    new-instance v1, Lcom/stripe/android/stripecardscan/cardscan/exception/UnknownScanException;

    const-string v2, "No data in the result intent"

    invoke-direct {v1, v2}, Lcom/stripe/android/stripecardscan/cardscan/exception/UnknownScanException;-><init>(Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Throwable;

    invoke-direct {p1, v1}, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast p1, Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;

    :cond_0
    invoke-virtual {v0, p1}, Lcom/stripe/android/ui/core/elements/CardNumberController;->onCardScanResult(Lcom/stripe/android/stripecardscan/cardscan/CardScanSheetResult;)V

    return-void
.end method
