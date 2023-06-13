.class final Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$4;
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
        "Ljava/lang/String;",
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
.field final synthetic $fieldState$delegate:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lcom/stripe/android/uicore/elements/TextFieldState;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onTextStateChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/uicore/elements/TextFieldState;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $textFieldController:Lcom/stripe/android/uicore/elements/TextFieldController;

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
.method public constructor <init>(Lcom/stripe/android/uicore/elements/TextFieldController;Lkotlin/jvm/functions/Function1;LsP5;LsP5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/uicore/elements/TextFieldState;",
            "Lkotlin/Unit;",
            ">;",
            "LsP5<",
            "+",
            "Lcom/stripe/android/uicore/elements/TextFieldState;",
            ">;",
            "LsP5<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$4;->$textFieldController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$4;->$onTextStateChanged:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$4;->$fieldState$delegate:LsP5;

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$4;->$value$delegate:LsP5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$4;->invoke(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 2

    const-string v0, "newValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$4;->$fieldState$delegate:LsP5;

    invoke-static {v0}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->access$TextField_ndPIYpw$lambda$11(LsP5;)Lcom/stripe/android/uicore/elements/TextFieldState;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$4;->$value$delegate:LsP5;

    invoke-static {v1}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->access$TextField_ndPIYpw$lambda$3(LsP5;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Lcom/stripe/android/uicore/elements/TextFieldStateKt;->canAcceptInput(Lcom/stripe/android/uicore/elements/TextFieldState;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$4;->$textFieldController:Lcom/stripe/android/uicore/elements/TextFieldController;

    invoke-interface {v0, p1}, Lcom/stripe/android/uicore/elements/TextFieldController;->onValueChange(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldState;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/TextFieldUIKt$TextField$4;->$onTextStateChanged:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
