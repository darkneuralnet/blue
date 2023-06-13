.class final Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/SameAsShippingController;->ComposeUI-MxjM1cc(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LEt0;",
        "Ljava/lang/Integer;",
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
.field final synthetic $$changed:I

.field final synthetic $enabled:Z

.field final synthetic $field:Lcom/stripe/android/uicore/elements/SectionFieldElement;

.field final synthetic $hiddenIdentifiers:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $lastTextFieldIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field final synthetic $modifier:LgV2;

.field final synthetic $nextFocusDirection:I

.field final synthetic $previousFocusDirection:I

.field final synthetic $tmp0_rcvr:Lcom/stripe/android/uicore/elements/SameAsShippingController;


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/SameAsShippingController;ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/SameAsShippingController;",
            "Z",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            "LgV2;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "III)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;->$tmp0_rcvr:Lcom/stripe/android/uicore/elements/SameAsShippingController;

    iput-boolean p2, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;->$enabled:Z

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;->$field:Lcom/stripe/android/uicore/elements/SectionFieldElement;

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;->$modifier:LgV2;

    iput-object p5, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;->$hiddenIdentifiers:Ljava/util/Set;

    iput-object p6, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;->$lastTextFieldIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput p7, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;->$nextFocusDirection:I

    iput p8, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;->$previousFocusDirection:I

    iput p9, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;->$$changed:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 10

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;->$tmp0_rcvr:Lcom/stripe/android/uicore/elements/SameAsShippingController;

    iget-boolean v1, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;->$enabled:Z

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;->$field:Lcom/stripe/android/uicore/elements/SectionFieldElement;

    iget-object v3, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;->$modifier:LgV2;

    iget-object v4, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;->$hiddenIdentifiers:Ljava/util/Set;

    iget-object v5, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;->$lastTextFieldIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget v6, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;->$nextFocusDirection:I

    iget v7, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;->$previousFocusDirection:I

    iget p2, p0, Lcom/stripe/android/uicore/elements/SameAsShippingController$ComposeUI$1;->$$changed:I

    or-int/lit8 v9, p2, 0x1

    move-object v8, p1

    invoke-virtual/range {v0 .. v9}, Lcom/stripe/android/uicore/elements/SameAsShippingController;->ComposeUI-MxjM1cc(ZLcom/stripe/android/uicore/elements/SectionFieldElement;LgV2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;IILEt0;I)V

    return-void
.end method
