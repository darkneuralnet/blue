.class public final Lcom/afollestad/materialdialogs/input/InputUtilExtKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a7\u0010\u0005\u001a\u00020\u0004\"\u0008\u0008\u0000\u0010\u0006*\u00020\u0007*\u0002H\u00062\u0019\u0008\u0004\u0010\u0008\u001a\u0013\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00010\t\u00a2\u0006\u0002\u0008\nH\u0080\u0008\u00a2\u0006\u0002\u0010\u000b\u001a\u000c\u0010\u000c\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\r"
    }
    d2 = {
        "invalidateInputMaxLength",
        "",
        "Lcom/afollestad/materialdialogs/MaterialDialog;",
        "allowEmpty",
        "",
        "postRun",
        "T",
        "Landroid/view/View;",
        "exec",
        "Lkotlin/Function1;",
        "Lkotlin/ExtensionFunctionType;",
        "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)Z",
        "showKeyboardIfApplicable",
        "input"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0x10
    }
.end annotation


# direct methods
.method public static final invalidateInputMaxLength(Lcom/afollestad/materialdialogs/MaterialDialog;Z)V
    .locals 3

    invoke-static {p0}, Lcom/afollestad/materialdialogs/input/DialogInputExtKt;->getInputField(Lcom/afollestad/materialdialogs/MaterialDialog;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-nez p1, :cond_1

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-static {p0}, Lcom/afollestad/materialdialogs/input/DialogInputExtKt;->getInputLayout(Lcom/afollestad/materialdialogs/MaterialDialog;)Lcom/google/android/material/textfield/TextInputLayout;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->getCounterMaxLength()I

    move-result p1

    if-lez p1, :cond_3

    sget-object v2, Lcom/afollestad/materialdialogs/WhichButton;->POSITIVE:Lcom/afollestad/materialdialogs/WhichButton;

    if-gt v0, p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    invoke-static {p0, v2, v1}, Lcom/afollestad/materialdialogs/actions/DialogActionExtKt;->setActionButtonEnabled(Lcom/afollestad/materialdialogs/MaterialDialog;Lcom/afollestad/materialdialogs/WhichButton;Z)V

    :cond_3
    return-void
.end method

.method public static final postRun(Landroid/view/View;Lkotlin/jvm/functions/Function1;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(TT;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;)Z"
        }
    .end annotation

    new-instance v0, Lcom/afollestad/materialdialogs/input/InputUtilExtKt$postRun$1;

    invoke-direct {v0, p0, p1}, Lcom/afollestad/materialdialogs/input/InputUtilExtKt$postRun$1;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    move-result p0

    return p0
.end method

.method public static final showKeyboardIfApplicable(Lcom/afollestad/materialdialogs/MaterialDialog;)V
    .locals 2

    invoke-static {p0}, Lcom/afollestad/materialdialogs/input/DialogInputExtKt;->getInputField(Lcom/afollestad/materialdialogs/MaterialDialog;)Landroid/widget/EditText;

    move-result-object v0

    new-instance v1, Lcom/afollestad/materialdialogs/input/InputUtilExtKt$showKeyboardIfApplicable$$inlined$postRun$1;

    invoke-direct {v1, v0, p0}, Lcom/afollestad/materialdialogs/input/InputUtilExtKt$showKeyboardIfApplicable$$inlined$postRun$1;-><init>(Landroid/view/View;Lcom/afollestad/materialdialogs/MaterialDialog;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
