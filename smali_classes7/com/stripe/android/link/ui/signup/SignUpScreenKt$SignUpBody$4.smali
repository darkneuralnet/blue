.class final Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/signup/SignUpScreenKt;->SignUpBody(Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function0;LEt0;I)V
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

.field final synthetic $emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field final synthetic $errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

.field final synthetic $isReadyToSignUp:Z

.field final synthetic $merchantName:Ljava/lang/String;

.field final synthetic $nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field final synthetic $onSignUpClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

.field final synthetic $requiresNameCollection:Z

.field final synthetic $signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function0;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
            "Lcom/stripe/android/uicore/elements/TextFieldController;",
            "Lcom/stripe/android/link/ui/signup/SignUpState;",
            "ZZ",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;->$merchantName:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;->$emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iput-object p3, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iput-object p4, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;->$nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iput-object p5, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;->$signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    iput-boolean p6, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;->$isReadyToSignUp:Z

    iput-boolean p7, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;->$requiresNameCollection:Z

    iput-object p8, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iput-object p9, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;->$onSignUpClick:Lkotlin/jvm/functions/Function0;

    iput p10, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;->$$changed:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 11

    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;->$merchantName:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;->$emailController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iget-object v2, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iget-object v3, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;->$nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    iget-object v4, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;->$signUpState:Lcom/stripe/android/link/ui/signup/SignUpState;

    iget-boolean v5, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;->$isReadyToSignUp:Z

    iget-boolean v6, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;->$requiresNameCollection:Z

    iget-object v7, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iget-object v8, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;->$onSignUpClick:Lkotlin/jvm/functions/Function0;

    iget p2, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$4;->$$changed:I

    or-int/lit8 v10, p2, 0x1

    move-object v9, p1

    invoke-static/range {v0 .. v10}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt;->SignUpBody(Ljava/lang/String;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function0;LEt0;I)V

    return-void
.end method
