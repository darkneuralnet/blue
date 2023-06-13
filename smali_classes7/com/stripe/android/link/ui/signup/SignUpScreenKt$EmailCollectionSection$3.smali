.class final Lcom/stripe/android/link/ui/signup/SignUpScreenKt$EmailCollectionSection$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/signup/SignUpScreenKt;->EmailCollectionSection(ZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;Landroidx/compose/ui/focus/h;LEt0;II)V
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

.field final synthetic $$default:I

.field final synthetic $emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field final synthetic $enabled:Z

.field final synthetic $focusRequester:Landroidx/compose/ui/focus/h;

.field final synthetic $signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;


# direct methods
.method public constructor <init>(ZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;Landroidx/compose/ui/focus/h;II)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$EmailCollectionSection$3;->$enabled:Z

    iput-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$EmailCollectionSection$3;->$emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iput-object p3, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$EmailCollectionSection$3;->$signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    iput-object p4, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$EmailCollectionSection$3;->$focusRequester:Landroidx/compose/ui/focus/h;

    iput p5, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$EmailCollectionSection$3;->$$changed:I

    iput p6, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$EmailCollectionSection$3;->$$default:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$EmailCollectionSection$3;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 7

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$EmailCollectionSection$3;->$enabled:Z

    iget-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$EmailCollectionSection$3;->$emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iget-object v2, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$EmailCollectionSection$3;->$signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    iget-object v3, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$EmailCollectionSection$3;->$focusRequester:Landroidx/compose/ui/focus/h;

    iget p2, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$EmailCollectionSection$3;->$$changed:I

    or-int/lit8 v5, p2, 0x1

    iget v6, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$EmailCollectionSection$3;->$$default:I

    move-object v4, p1

    invoke-static/range {v0 .. v6}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt;->EmailCollectionSection(ZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;Landroidx/compose/ui/focus/h;LEt0;II)V

    return-void
.end method
