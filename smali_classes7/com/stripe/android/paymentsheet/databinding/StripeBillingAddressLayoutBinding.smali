.class public final Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final address1:Lcom/google/android/material/textfield/TextInputEditText;

.field public final address1Divider:Landroid/view/View;

.field public final address1Layout:Lcom/google/android/material/textfield/TextInputLayout;

.field public final address2:Lcom/google/android/material/textfield/TextInputEditText;

.field public final address2Divider:Landroid/view/View;

.field public final address2Layout:Lcom/google/android/material/textfield/TextInputLayout;

.field public final city:Lcom/google/android/material/textfield/TextInputEditText;

.field public final cityLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field public final cityPostalContainer:Landroid/widget/LinearLayout;

.field public final cityPostalDivider:Landroid/view/View;

.field public final countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

.field public final postalCode:Lcom/stripe/android/view/StripeEditText;

.field public final postalCodeLayout:Lcom/google/android/material/textfield/TextInputLayout;

.field private final rootView:Landroid/view/View;

.field public final state:Lcom/google/android/material/textfield/TextInputEditText;

.field public final stateDivider:Landroid/view/View;

.field public final stateLayout:Lcom/google/android/material/textfield/TextInputLayout;


# direct methods
.method private constructor <init>(Landroid/view/View;Lcom/google/android/material/textfield/TextInputEditText;Landroid/view/View;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputEditText;Landroid/view/View;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputLayout;Landroid/widget/LinearLayout;Landroid/view/View;Lcom/stripe/android/view/CountryTextInputLayout;Lcom/stripe/android/view/StripeEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputEditText;Landroid/view/View;Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 2

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->rootView:Landroid/view/View;

    move-object v1, p2

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->address1:Lcom/google/android/material/textfield/TextInputEditText;

    move-object v1, p3

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->address1Divider:Landroid/view/View;

    move-object v1, p4

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->address1Layout:Lcom/google/android/material/textfield/TextInputLayout;

    move-object v1, p5

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->address2:Lcom/google/android/material/textfield/TextInputEditText;

    move-object v1, p6

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->address2Divider:Landroid/view/View;

    move-object v1, p7

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->address2Layout:Lcom/google/android/material/textfield/TextInputLayout;

    move-object v1, p8

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->city:Lcom/google/android/material/textfield/TextInputEditText;

    move-object v1, p9

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->cityLayout:Lcom/google/android/material/textfield/TextInputLayout;

    move-object v1, p10

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->cityPostalContainer:Landroid/widget/LinearLayout;

    move-object v1, p11

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->cityPostalDivider:Landroid/view/View;

    move-object v1, p12

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->countryLayout:Lcom/stripe/android/view/CountryTextInputLayout;

    move-object v1, p13

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->postalCode:Lcom/stripe/android/view/StripeEditText;

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->postalCodeLayout:Lcom/google/android/material/textfield/TextInputLayout;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->state:Lcom/google/android/material/textfield/TextInputEditText;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->stateDivider:Landroid/view/View;

    move-object/from16 v1, p17

    iput-object v1, v0, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->stateLayout:Lcom/google/android/material/textfield/TextInputLayout;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;
    .locals 19

    move-object/from16 v1, p0

    sget v0, Lcom/stripe/android/paymentsheet/R$id;->address1:I

    invoke-static {v1, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/material/textfield/TextInputEditText;

    if-eqz v2, :cond_0

    sget v0, Lcom/stripe/android/paymentsheet/R$id;->address1_divider:I

    invoke-static {v1, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_0

    sget v0, Lcom/stripe/android/paymentsheet/R$id;->address1_layout:I

    invoke-static {v1, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v4, :cond_0

    sget v0, Lcom/stripe/android/paymentsheet/R$id;->address2:I

    invoke-static {v1, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/google/android/material/textfield/TextInputEditText;

    if-eqz v5, :cond_0

    sget v0, Lcom/stripe/android/paymentsheet/R$id;->address2_divider:I

    invoke-static {v1, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_0

    sget v0, Lcom/stripe/android/paymentsheet/R$id;->address2_layout:I

    invoke-static {v1, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v7, :cond_0

    sget v0, Lcom/stripe/android/paymentsheet/R$id;->city:I

    invoke-static {v1, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Lcom/google/android/material/textfield/TextInputEditText;

    if-eqz v8, :cond_0

    sget v0, Lcom/stripe/android/paymentsheet/R$id;->city_layout:I

    invoke-static {v1, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v9, :cond_0

    sget v0, Lcom/stripe/android/paymentsheet/R$id;->city_postal_container:I

    invoke-static {v1, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/LinearLayout;

    if-eqz v10, :cond_0

    sget v0, Lcom/stripe/android/paymentsheet/R$id;->city_postal_divider:I

    invoke-static {v1, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v11

    if-eqz v11, :cond_0

    sget v0, Lcom/stripe/android/paymentsheet/R$id;->country_layout:I

    invoke-static {v1, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Lcom/stripe/android/view/CountryTextInputLayout;

    if-eqz v12, :cond_0

    sget v0, Lcom/stripe/android/paymentsheet/R$id;->postal_code:I

    invoke-static {v1, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Lcom/stripe/android/view/StripeEditText;

    if-eqz v13, :cond_0

    sget v0, Lcom/stripe/android/paymentsheet/R$id;->postal_code_layout:I

    invoke-static {v1, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v14

    check-cast v14, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v14, :cond_0

    sget v0, Lcom/stripe/android/paymentsheet/R$id;->state:I

    invoke-static {v1, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Lcom/google/android/material/textfield/TextInputEditText;

    if-eqz v15, :cond_0

    sget v0, Lcom/stripe/android/paymentsheet/R$id;->state_divider:I

    invoke-static {v1, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v16

    if-eqz v16, :cond_0

    sget v0, Lcom/stripe/android/paymentsheet/R$id;->state_layout:I

    invoke-static {v1, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v17

    check-cast v17, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v17, :cond_0

    new-instance v18, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v17}, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;-><init>(Landroid/view/View;Lcom/google/android/material/textfield/TextInputEditText;Landroid/view/View;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputEditText;Landroid/view/View;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputLayout;Landroid/widget/LinearLayout;Landroid/view/View;Lcom/stripe/android/view/CountryTextInputLayout;Lcom/stripe/android/view/StripeEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputEditText;Landroid/view/View;Lcom/google/android/material/textfield/TextInputLayout;)V

    return-object v18

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

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;
    .locals 1

    if-eqz p1, :cond_0

    sget v0, Lcom/stripe/android/paymentsheet/R$layout;->stripe_billing_address_layout:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->bind(Landroid/view/View;)Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;

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

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/databinding/StripeBillingAddressLayoutBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
