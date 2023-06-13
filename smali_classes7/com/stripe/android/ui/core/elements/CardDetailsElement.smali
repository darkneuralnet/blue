.class public final Lcom/stripe/android/ui/core/elements/CardDetailsElement;
.super Lcom/stripe/android/uicore/elements/SectionMultiFieldElement;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\u000e\u0008\u0002\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u001d\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\t\u001a\u00020\u00082\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016J\u0014\u0010\u000c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u000b0\nH\u0016J \u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\r0\u000b0\nH\u0016R\u0017\u0010\u0011\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0016\u0010\u0018\u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/CardDetailsElement;",
        "Lcom/stripe/android/uicore/elements/SectionMultiFieldElement;",
        "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;",
        "sectionFieldErrorController",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "",
        "rawValuesMap",
        "",
        "setRawValue",
        "LEu1;",
        "",
        "getTextFieldIdentifiers",
        "Lkotlin/Pair;",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "getFormFieldValueFlow",
        "Lcom/stripe/android/ui/core/elements/CardDetailsController;",
        "controller",
        "Lcom/stripe/android/ui/core/elements/CardDetailsController;",
        "getController",
        "()Lcom/stripe/android/ui/core/elements/CardDetailsController;",
        "",
        "isCardScanEnabled",
        "Z",
        "()Z",
        "identifier",
        "Landroid/content/Context;",
        "context",
        "initialValues",
        "",
        "viewOnlyFields",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroid/content/Context;Ljava/util/Map;Ljava/util/Set;Lcom/stripe/android/ui/core/elements/CardDetailsController;)V",
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
.field private final controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

.field private final isCardScanEnabled:Z


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroid/content/Context;Ljava/util/Map;Ljava/util/Set;Lcom/stripe/android/ui/core/elements/CardDetailsController;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Lcom/stripe/android/ui/core/elements/CardDetailsController;",
            ")V"
        }
    .end annotation

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "initialValues"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "viewOnlyFields"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "controller"

    invoke-static {p5, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/stripe/android/uicore/elements/SectionMultiFieldElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    iput-object p5, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {p5}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getNumberElement()Lcom/stripe/android/ui/core/elements/CardNumberElement;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardNumberElement;->getController()Lcom/stripe/android/ui/core/elements/CardNumberController;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardNumberController;->getCardScanEnabled()Z

    move-result p1

    iput-boolean p1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->isCardScanEnabled:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroid/content/Context;Ljava/util/Map;Ljava/util/Set;Lcom/stripe/android/ui/core/elements/CardDetailsController;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p4

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    new-instance p5, Lcom/stripe/android/ui/core/elements/CardDetailsController;

    sget-object p4, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {p4}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCardNumber()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p4

    invoke-interface {v4, p4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p4

    invoke-direct {p5, p2, p3, p4}, Lcom/stripe/android/ui/core/elements/CardDetailsController;-><init>(Landroid/content/Context;Ljava/util/Map;Z)V

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/ui/core/elements/CardDetailsElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroid/content/Context;Ljava/util/Map;Ljava/util/Set;Lcom/stripe/android/ui/core/elements/CardDetailsController;)V

    return-void
.end method


# virtual methods
.method public final getController()Lcom/stripe/android/ui/core/elements/CardDetailsController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    return-object v0
.end method

.method public getFormFieldValueFlow()LEu1;
    .locals 6
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

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getNumberElement()Lcom/stripe/android/ui/core/elements/CardNumberElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/CardNumberElement;->getController()Lcom/stripe/android/ui/core/elements/CardNumberController;

    move-result-object v0

    invoke-interface {v0}, Lcom/stripe/android/uicore/elements/InputController;->getFormFieldValue()LEu1;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getCvcElement()Lcom/stripe/android/ui/core/elements/CvcElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CvcElement;->getController()Lcom/stripe/android/ui/core/elements/CvcController;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CvcController;->getFormFieldValue()LEu1;

    move-result-object v1

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getExpirationDateElement()Lcom/stripe/android/uicore/elements/SimpleTextElement;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/SimpleTextElement;->getController()Lcom/stripe/android/uicore/elements/TextFieldController;

    move-result-object v2

    invoke-interface {v2}, Lcom/stripe/android/uicore/elements/InputController;->getFormFieldValue()LEu1;

    move-result-object v2

    iget-object v3, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getNumberElement()Lcom/stripe/android/ui/core/elements/CardNumberElement;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/CardNumberElement;->getController()Lcom/stripe/android/ui/core/elements/CardNumberController;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/CardNumberController;->getCardBrandFlow()LEu1;

    move-result-object v3

    new-instance v4, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$1;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lcom/stripe/android/ui/core/elements/CardDetailsElement$getFormFieldValueFlow$1;-><init>(Lcom/stripe/android/ui/core/elements/CardDetailsElement;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, v2, v3, v4}, LVu1;->l(LEu1;LEu1;LEu1;LEu1;Lkotlin/jvm/functions/Function5;)LEu1;

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

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getNumberElement()Lcom/stripe/android/ui/core/elements/CardNumberElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getExpirationDateElement()Lcom/stripe/android/uicore/elements/SimpleTextElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/SimpleTextElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/CardDetailsController;->getCvcElement()Lcom/stripe/android/ui/core/elements/CvcElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v0

    return-object v0
.end method

.method public final isCardScanEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->isCardScanEnabled:Z

    return v0
.end method

.method public sectionFieldErrorController()Lcom/stripe/android/uicore/elements/SectionFieldErrorController;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardDetailsElement;->controller:Lcom/stripe/android/ui/core/elements/CardDetailsController;

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

    return-void
.end method
