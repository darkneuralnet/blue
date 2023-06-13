.class final Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/verification/VerificationScreenKt;->VerificationBody(IIZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;ZZLcom/stripe/android/link/ui/ErrorMessage;Landroidx/compose/ui/focus/h;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V
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

.field final synthetic $$changed1:I

.field final synthetic $email:Ljava/lang/String;

.field final synthetic $errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

.field final synthetic $focusRequester:Landroidx/compose/ui/focus/h;

.field final synthetic $headerStringResId:I

.field final synthetic $isProcessing:Z

.field final synthetic $isSendingNewCode:Z

.field final synthetic $messageStringResId:I

.field final synthetic $onBack:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onChangeEmailClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onResendCodeClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

.field final synthetic $redactedPhoneNumber:Ljava/lang/String;

.field final synthetic $showChangeEmailMessage:Z


# direct methods
.method public constructor <init>(IIZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;ZZLcom/stripe/android/link/ui/ErrorMessage;Landroidx/compose/ui/focus/h;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/uicore/elements/OTPElement;",
            "ZZ",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            "Landroidx/compose/ui/focus/h;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;II)V"
        }
    .end annotation

    iput p1, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$headerStringResId:I

    iput p2, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$messageStringResId:I

    iput-boolean p3, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$showChangeEmailMessage:Z

    iput-object p4, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$redactedPhoneNumber:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$email:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

    iput-boolean p7, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$isProcessing:Z

    iput-boolean p8, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$isSendingNewCode:Z

    iput-object p9, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iput-object p10, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$focusRequester:Landroidx/compose/ui/focus/h;

    iput-object p11, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$onBack:Lkotlin/jvm/functions/Function0;

    iput-object p12, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$onChangeEmailClick:Lkotlin/jvm/functions/Function0;

    iput-object p13, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$onResendCodeClick:Lkotlin/jvm/functions/Function0;

    iput p14, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$$changed:I

    iput p15, p0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$$changed1:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 17

    move-object/from16 v0, p0

    iget v1, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$headerStringResId:I

    iget v2, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$messageStringResId:I

    iget-boolean v3, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$showChangeEmailMessage:Z

    iget-object v4, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$redactedPhoneNumber:Ljava/lang/String;

    iget-object v5, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$email:Ljava/lang/String;

    iget-object v6, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$otpElement:Lcom/stripe/android/uicore/elements/OTPElement;

    iget-boolean v7, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$isProcessing:Z

    iget-boolean v8, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$isSendingNewCode:Z

    iget-object v9, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iget-object v10, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$focusRequester:Landroidx/compose/ui/focus/h;

    iget-object v11, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$onBack:Lkotlin/jvm/functions/Function0;

    iget-object v12, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$onChangeEmailClick:Lkotlin/jvm/functions/Function0;

    iget-object v13, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$onResendCodeClick:Lkotlin/jvm/functions/Function0;

    iget v14, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$$changed:I

    or-int/lit8 v15, v14, 0x1

    iget v14, v0, Lcom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$10;->$$changed1:I

    move/from16 v16, v14

    move-object/from16 v14, p1

    invoke-static/range {v1 .. v16}, Lcom/stripe/android/link/ui/verification/VerificationScreenKt;->VerificationBody(IIZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;ZZLcom/stripe/android/link/ui/ErrorMessage;Landroidx/compose/ui/focus/h;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V

    return-void
.end method
