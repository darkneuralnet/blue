.class final Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3;->invoke(LTe;LEt0;I)V
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSignUpScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,240:1\n154#2:241\n*S KotlinDebug\n*F\n+ 1 SignUpScreen.kt\ncom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$1\n*L\n170#1:241\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

.field final synthetic $phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

.field final synthetic $requiresNameCollection:Z


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/PhoneNumberController;ZILcom/stripe/android/uicore/elements/TextFieldController;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$1;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    iput-boolean p2, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$1;->$requiresNameCollection:Z

    iput p3, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$1;->$$dirty:I

    iput-object p4, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$1;->$nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 12

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.link.ui.signup.SignUpBody.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SignUpScreen.kt:146)"

    const v2, 0x5bf8b041    # 1.39999175E17f

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const/4 v3, 0x1

    iget-object v4, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$1;->$phoneNumberController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    const/4 v5, 0x0

    invoke-virtual {v4}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getInitialPhoneNumber()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p2, :cond_3

    move v6, v0

    goto :goto_1

    :cond_3
    move v6, v1

    :goto_1
    iget-boolean p2, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$1;->$requiresNameCollection:Z

    if-eqz p2, :cond_4

    sget-object p2, LFY1;->b:LFY1$a;

    invoke-virtual {p2}, LFY1$a;->d()I

    move-result p2

    goto :goto_2

    :cond_4
    sget-object p2, LFY1;->b:LFY1$a;

    invoke-virtual {p2}, LFY1$a;->b()I

    move-result p2

    :goto_2
    move v7, p2

    sget p2, Lcom/stripe/android/uicore/elements/PhoneNumberController;->$stable:I

    shl-int/lit8 p2, p2, 0x3

    const/4 v2, 0x6

    or-int/2addr p2, v2

    iget v8, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$1;->$$dirty:I

    shr-int/lit8 v8, v8, 0x3

    and-int/lit8 v8, v8, 0x70

    or-int v9, p2, v8

    const/4 v10, 0x4

    move-object v8, p1

    invoke-static/range {v3 .. v10}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberCollectionSection-a7tNSiQ(ZLcom/stripe/android/uicore/elements/PhoneNumberController;Ljava/lang/Integer;ZILEt0;II)V

    const p2, 0x5639559

    invoke-interface {p1, p2}, LEt0;->F(I)V

    iget-boolean p2, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$1;->$requiresNameCollection:Z

    if-eqz p2, :cond_5

    iget-object v3, p0, Lcom/stripe/android/link/ui/signup/SignUpScreenKt$SignUpBody$3$3$1$1;->$nameController:Lcom/stripe/android/uicore/elements/TextFieldController;

    sget-object p2, LFY1;->b:LFY1$a;

    invoke-virtual {p2}, LFY1$a;->b()I

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v10, 0x188

    const/16 v11, 0x38

    move-object v9, p1

    invoke-static/range {v3 .. v11}, Lcom/stripe/android/uicore/elements/TextFieldUIKt;->TextFieldSection-uGujYS0(Lcom/stripe/android/uicore/elements/TextFieldController;IZLgV2;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;LEt0;II)V

    :cond_5
    invoke-interface {p1}, LEt0;->Q()V

    sget-object p2, LgV2;->b0:LgV2$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {p2, v3, v0, v4}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v5

    const/4 v6, 0x0

    const/16 p2, 0x8

    int-to-float p2, p2

    invoke-static {p2}, Lk61;->g(F)F

    move-result v7

    const/4 v8, 0x0

    const/16 p2, 0x10

    int-to-float p2, p2

    invoke-static {p2}, Lk61;->g(F)F

    move-result v9

    const/4 v10, 0x5

    const/4 v11, 0x0

    invoke-static/range {v5 .. v11}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object p2

    sget-object v0, Lr06;->b:Lr06$a;

    invoke-virtual {v0}, Lr06$a;->a()I

    move-result v0

    invoke-static {p2, v0, p1, v2, v1}, Lcom/stripe/android/link/ui/LinkTermsKt;->LinkTerms-5stqomU(LgV2;ILEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    :goto_3
    return-void
.end method
