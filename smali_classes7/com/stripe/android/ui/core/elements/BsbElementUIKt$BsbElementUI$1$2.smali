.class final Lcom/stripe/android/ui/core/elements/BsbElementUIKt$BsbElementUI$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/ui/core/elements/BsbElementUIKt;->BsbElementUI(ZLcom/stripe/android/ui/core/elements/BsbElement;Lcom/stripe/android/uicore/elements/IdentifierSpec;LEt0;I)V
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
.field final synthetic $$dirty:I

.field final synthetic $element:Lcom/stripe/android/ui/core/elements/BsbElement;

.field final synthetic $enabled:Z

.field final synthetic $lastTextFieldIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;


# direct methods
.method public constructor <init>(Lcom/stripe/android/ui/core/elements/BsbElement;ZLcom/stripe/android/uicore/elements/IdentifierSpec;I)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$BsbElementUI$1$2;->$element:Lcom/stripe/android/ui/core/elements/BsbElement;

    iput-boolean p2, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$BsbElementUI$1$2;->$enabled:Z

    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$BsbElementUI$1$2;->$lastTextFieldIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput p4, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$BsbElementUI$1$2;->$$dirty:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$BsbElementUI$1$2;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 10

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.ui.core.elements.BsbElementUI.<anonymous>.<anonymous> (BsbElementUI.kt:37)"

    const v2, -0x3ac57f0d

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$BsbElementUI$1$2;->$element:Lcom/stripe/android/ui/core/elements/BsbElement;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/BsbElement;->getTextElement$payments_ui_core_release()Lcom/stripe/android/uicore/elements/SimpleTextElement;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/uicore/elements/SimpleTextElement;->getController()Lcom/stripe/android/uicore/elements/TextFieldController;

    move-result-object v0

    iget-boolean v1, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$BsbElementUI$1$2;->$enabled:Z

    iget-object p2, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$BsbElementUI$1$2;->$lastTextFieldIdentifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$BsbElementUI$1$2;->$element:Lcom/stripe/android/ui/core/elements/BsbElement;

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/BsbElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p2, LFY1;->b:LFY1$a;

    invoke-virtual {p2}, LFY1$a;->b()I

    move-result p2

    goto :goto_1

    :cond_3
    sget-object p2, LFY1;->b:LFY1$a;

    invoke-virtual {p2}, LFY1$a;->d()I

    move-result p2

    :goto_1
    move v2, p2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    iget p2, p0, Lcom/stripe/android/ui/core/elements/BsbElementUIKt$BsbElementUI$1$2;->$$dirty:I

    shl-int/lit8 p2, p2, 0x3

    and-int/lit8 p2, p2, 0x70

    or-int/lit8 v8, p2, 0x8

    const/16 v9, 0x78

    move-object v7, p1

    invoke-static/range {v0 .. v9}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->TextField-ndPIYpw(Lcom/stripe/android/uicore/elements/TextFieldController;ZILgV2;Lkotlin/jvm/functions/Function1;IILEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    :goto_2
    return-void
.end method
