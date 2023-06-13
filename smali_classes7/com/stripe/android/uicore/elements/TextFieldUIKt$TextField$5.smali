.class final Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$5;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/TextFieldUIKt;->TextField-ndPIYpw(Lcom/stripe/android/uicore/elements/TextFieldController;ZILgV2;Lkotlin/jvm/functions/Function1;IILEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lik2;",
        "Ljava/lang/Boolean;",
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
.field final synthetic $focusManager:LBv1;

.field final synthetic $previousFocusDirection:I

.field final synthetic $value$delegate:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LBv1;ILsP5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBv1;",
            "I",
            "LsP5<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$5;->$focusManager:LBv1;

    iput p2, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$5;->$previousFocusDirection:I

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$5;->$value$delegate:LsP5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lik2;

    invoke-virtual {p1}, Lik2;->f()Landroid/view/KeyEvent;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$5;->invoke-ZmokQxo(Landroid/view/KeyEvent;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final invoke-ZmokQxo(Landroid/view/KeyEvent;)Ljava/lang/Boolean;
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lmk2;->b(Landroid/view/KeyEvent;)I

    move-result v0

    sget-object v1, Llk2;->a:Llk2$a;

    invoke-virtual {v1}, Llk2$a;->a()I

    move-result v1

    invoke-static {v0, v1}, Llk2;->e(II)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    const/16 v0, 0x43

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$5;->$value$delegate:LsP5;

    invoke-static {p1}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->access$TextField_ndPIYpw$lambda$3(LsP5;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$5;->$focusManager:LBv1;

    iget v1, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$5;->$previousFocusDirection:I

    invoke-interface {p1, v1}, LBv1;->i(I)Z

    move v1, v0

    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
