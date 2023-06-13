.class public final Lrg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;

.field public final c:Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;

.field public final d:Lcom/adyen/checkout/card/ui/CardNumberInput;

.field public final e:Lcom/adyen/checkout/card/ui/ExpiryDateInput;

.field public final f:Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;

.field public final g:Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;

.field public final h:Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;

.field public final i:Lcom/adyen/checkout/card/ui/SecurityCodeInput;

.field public final j:Lcom/adyen/checkout/card/ui/SocialSecurityNumberInput;

.field public final k:Landroidx/appcompat/widget/SwitchCompat;

.field public final l:Lcom/google/android/material/textfield/TextInputLayout;

.field public final m:Lcom/google/android/material/textfield/TextInputLayout;

.field public final n:Lcom/google/android/material/textfield/TextInputLayout;

.field public final o:Lcom/google/android/material/textfield/TextInputLayout;

.field public final p:Lcom/google/android/material/textfield/TextInputLayout;

.field public final q:Lcom/google/android/material/textfield/TextInputLayout;

.field public final r:Lcom/google/android/material/textfield/TextInputLayout;

.field public final s:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;Lcom/adyen/checkout/card/ui/CardNumberInput;Lcom/adyen/checkout/card/ui/ExpiryDateInput;Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;Lcom/adyen/checkout/card/ui/SecurityCodeInput;Lcom/adyen/checkout/card/ui/SocialSecurityNumberInput;Landroidx/appcompat/widget/SwitchCompat;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 2

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lrg0;->a:Landroid/view/View;

    move-object v1, p2

    iput-object v1, v0, Lrg0;->b:Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;

    move-object v1, p3

    iput-object v1, v0, Lrg0;->c:Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;

    move-object v1, p4

    iput-object v1, v0, Lrg0;->d:Lcom/adyen/checkout/card/ui/CardNumberInput;

    move-object v1, p5

    iput-object v1, v0, Lrg0;->e:Lcom/adyen/checkout/card/ui/ExpiryDateInput;

    move-object v1, p6

    iput-object v1, v0, Lrg0;->f:Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;

    move-object v1, p7

    iput-object v1, v0, Lrg0;->g:Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;

    move-object v1, p8

    iput-object v1, v0, Lrg0;->h:Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;

    move-object v1, p9

    iput-object v1, v0, Lrg0;->i:Lcom/adyen/checkout/card/ui/SecurityCodeInput;

    move-object v1, p10

    iput-object v1, v0, Lrg0;->j:Lcom/adyen/checkout/card/ui/SocialSecurityNumberInput;

    move-object v1, p11

    iput-object v1, v0, Lrg0;->k:Landroidx/appcompat/widget/SwitchCompat;

    move-object v1, p12

    iput-object v1, v0, Lrg0;->l:Lcom/google/android/material/textfield/TextInputLayout;

    move-object v1, p13

    iput-object v1, v0, Lrg0;->m:Lcom/google/android/material/textfield/TextInputLayout;

    move-object/from16 v1, p14

    iput-object v1, v0, Lrg0;->n:Lcom/google/android/material/textfield/TextInputLayout;

    move-object/from16 v1, p15

    iput-object v1, v0, Lrg0;->o:Lcom/google/android/material/textfield/TextInputLayout;

    move-object/from16 v1, p16

    iput-object v1, v0, Lrg0;->p:Lcom/google/android/material/textfield/TextInputLayout;

    move-object/from16 v1, p17

    iput-object v1, v0, Lrg0;->q:Lcom/google/android/material/textfield/TextInputLayout;

    move-object/from16 v1, p18

    iput-object v1, v0, Lrg0;->r:Lcom/google/android/material/textfield/TextInputLayout;

    move-object/from16 v1, p19

    iput-object v1, v0, Lrg0;->s:Lcom/google/android/material/textfield/TextInputLayout;

    return-void
.end method

.method public static a(Landroid/view/View;)Lrg0;
    .locals 21

    move-object/from16 v1, p0

    sget v0, LEi4;->cardBrandLogo_imageView:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;

    if-eqz v2, :cond_0

    sget v0, LEi4;->editText_cardHolder:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;

    if-eqz v3, :cond_0

    sget v0, LEi4;->editText_cardNumber:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/adyen/checkout/card/ui/CardNumberInput;

    if-eqz v4, :cond_0

    sget v0, LEi4;->editText_expiryDate:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/adyen/checkout/card/ui/ExpiryDateInput;

    if-eqz v5, :cond_0

    sget v0, LEi4;->editText_kcpBirthDateOrTaxNumber:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;

    if-eqz v6, :cond_0

    sget v0, LEi4;->editText_kcpCardPassword:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;

    if-eqz v7, :cond_0

    sget v0, LEi4;->editText_postalCode:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;

    if-eqz v8, :cond_0

    sget v0, LEi4;->editText_securityCode:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Lcom/adyen/checkout/card/ui/SecurityCodeInput;

    if-eqz v9, :cond_0

    sget v0, LEi4;->editText_socialSecurityNumber:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Lcom/adyen/checkout/card/ui/SocialSecurityNumberInput;

    if-eqz v10, :cond_0

    sget v0, LEi4;->switch_storePaymentMethod:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroidx/appcompat/widget/SwitchCompat;

    if-eqz v11, :cond_0

    sget v0, LEi4;->textInputLayout_cardHolder:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v12, :cond_0

    sget v0, LEi4;->textInputLayout_cardNumber:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v13, :cond_0

    sget v0, LEi4;->textInputLayout_expiryDate:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v14, :cond_0

    sget v0, LEi4;->textInputLayout_kcpBirthDateOrTaxNumber:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v15, :cond_0

    sget v0, LEi4;->textInputLayout_kcpCardPassword:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v16, :cond_0

    sget v0, LEi4;->textInputLayout_postalCode:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v17

    check-cast v17, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v17, :cond_0

    sget v0, LEi4;->textInputLayout_securityCode:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v18

    check-cast v18, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v18, :cond_0

    sget v0, LEi4;->textInputLayout_socialSecurityNumber:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v19

    check-cast v19, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v19, :cond_0

    new-instance v20, Lrg0;

    move-object/from16 v0, v20

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v19}, Lrg0;-><init>(Landroid/view/View;Lcom/adyen/checkout/components/ui/view/RoundCornerImageView;Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;Lcom/adyen/checkout/card/ui/CardNumberInput;Lcom/adyen/checkout/card/ui/ExpiryDateInput;Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;Lcom/adyen/checkout/components/ui/view/AdyenTextInputEditText;Lcom/adyen/checkout/card/ui/SecurityCodeInput;Lcom/adyen/checkout/card/ui/SocialSecurityNumberInput;Landroidx/appcompat/widget/SwitchCompat;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;)V

    return-object v20

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Missing required view with ID: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lrg0;
    .locals 1

    if-eqz p1, :cond_0

    sget v0, Lrk4;->card_view:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-static {p1}, Lrg0;->a(Landroid/view/View;)Lrg0;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "parent"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public getRoot()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lrg0;->a:Landroid/view/View;

    return-object v0
.end method
