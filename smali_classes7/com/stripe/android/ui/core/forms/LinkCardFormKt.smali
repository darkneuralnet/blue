.class public final Lcom/stripe/android/ui/core/forms/LinkCardFormKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0016\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "LinkCardForm",
        "Lcom/stripe/android/ui/core/elements/LayoutSpec;",
        "getLinkCardForm",
        "()Lcom/stripe/android/ui/core/elements/LayoutSpec;",
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
.field private static final LinkCardForm:Lcom/stripe/android/ui/core/elements/LayoutSpec;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/stripe/android/ui/core/elements/LayoutSpec;

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/stripe/android/ui/core/elements/FormItemSpec;

    new-instance v2, Lcom/stripe/android/ui/core/elements/CardDetailsSectionSpec;

    sget-object v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    const-string v4, "card_details_section"

    invoke-virtual {v3, v4}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->Generic(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/stripe/android/ui/core/elements/CardDetailsSectionSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Lcom/stripe/android/ui/core/elements/CardBillingSpec;

    const/4 v3, 0x0

    invoke-static {}, Lcom/stripe/android/uicore/elements/BillingSpecKt;->getSupportedBillingCountries()Ljava/util/Set;

    move-result-object v4

    const/4 v5, 0x1

    invoke-direct {v2, v3, v4, v5, v3}, Lcom/stripe/android/ui/core/elements/CardBillingSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v2, v1, v5

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/ui/core/elements/LayoutSpec;-><init>(Ljava/util/List;)V

    sput-object v0, Lcom/stripe/android/ui/core/forms/LinkCardFormKt;->LinkCardForm:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    return-void
.end method

.method public static final getLinkCardForm()Lcom/stripe/android/ui/core/elements/LayoutSpec;
    .locals 1

    sget-object v0, Lcom/stripe/android/ui/core/forms/LinkCardFormKt;->LinkCardForm:Lcom/stripe/android/ui/core/elements/LayoutSpec;

    return-object v0
.end method
