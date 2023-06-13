.class public final LO2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroid/widget/LinearLayout;

.field public final b:Lcom/adyen/checkout/card/CardView;

.field public final c:Lco/bird/android/widget/DrawableView;

.field public final d:Lcom/google/android/material/textfield/TextInputEditText;

.field public final e:Lcom/google/android/material/textfield/TextInputLayout;

.field public final f:Lcom/google/android/material/textfield/TextInputEditText;

.field public final g:Lcom/google/android/material/textfield/TextInputLayout;

.field public final h:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

.field public final i:Landroid/widget/TextView;

.field public final j:Landroid/widget/RelativeLayout;

.field public final k:Lcom/stripe/android/view/CardInputWidget;

.field public final l:Lcom/stripe/android/view/CardMultilineWidget;

.field public final m:Lcom/stripe/android/view/ShippingInfoWidget;


# direct methods
.method public constructor <init>(Landroid/widget/LinearLayout;Lcom/adyen/checkout/card/CardView;Lco/bird/android/widget/DrawableView;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/TextView;Landroid/widget/RelativeLayout;Lcom/stripe/android/view/CardInputWidget;Lcom/stripe/android/view/CardMultilineWidget;Lcom/stripe/android/view/ShippingInfoWidget;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO2;->a:Landroid/widget/LinearLayout;

    iput-object p2, p0, LO2;->b:Lcom/adyen/checkout/card/CardView;

    iput-object p3, p0, LO2;->c:Lco/bird/android/widget/DrawableView;

    iput-object p4, p0, LO2;->d:Lcom/google/android/material/textfield/TextInputEditText;

    iput-object p5, p0, LO2;->e:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p6, p0, LO2;->f:Lcom/google/android/material/textfield/TextInputEditText;

    iput-object p7, p0, LO2;->g:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p8, p0, LO2;->h:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    iput-object p9, p0, LO2;->i:Landroid/widget/TextView;

    iput-object p10, p0, LO2;->j:Landroid/widget/RelativeLayout;

    iput-object p11, p0, LO2;->k:Lcom/stripe/android/view/CardInputWidget;

    iput-object p12, p0, LO2;->l:Lcom/stripe/android/view/CardMultilineWidget;

    iput-object p13, p0, LO2;->m:Lcom/stripe/android/view/ShippingInfoWidget;

    return-void
.end method

.method public static a(Landroid/view/View;)LO2;
    .locals 17

    move-object/from16 v0, p0

    sget v1, LVg4;->adyenCardView:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/adyen/checkout/card/CardView;

    if-eqz v5, :cond_0

    sget v1, LVg4;->cardImage:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lco/bird/android/widget/DrawableView;

    if-eqz v6, :cond_0

    sget v1, LVg4;->dobEditText:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/google/android/material/textfield/TextInputEditText;

    if-eqz v7, :cond_0

    sget v1, LVg4;->dobTextInputLayout:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v8, :cond_0

    sget v1, LVg4;->passwordEditText:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lcom/google/android/material/textfield/TextInputEditText;

    if-eqz v9, :cond_0

    sget v1, LVg4;->passwordTextInputLayout:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v10, :cond_0

    sget v1, LVg4;->progressBar:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    if-eqz v11, :cond_0

    sget v1, LVg4;->scanCard:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroid/widget/TextView;

    if-eqz v12, :cond_0

    sget v1, LVg4;->scanCardRow:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Landroid/widget/RelativeLayout;

    if-eqz v13, :cond_0

    sget v1, LVg4;->stripeCardInput:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Lcom/stripe/android/view/CardInputWidget;

    if-eqz v14, :cond_0

    sget v1, LVg4;->stripeCardZipInput:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lcom/stripe/android/view/CardMultilineWidget;

    if-eqz v15, :cond_0

    sget v1, LVg4;->stripeFullAddress:I

    invoke-static {v0, v1}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Lcom/stripe/android/view/ShippingInfoWidget;

    if-eqz v16, :cond_0

    new-instance v1, LO2;

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    move-object v3, v1

    invoke-direct/range {v3 .. v16}, LO2;-><init>(Landroid/widget/LinearLayout;Lcom/adyen/checkout/card/CardView;Lco/bird/android/widget/DrawableView;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Landroid/widget/TextView;Landroid/widget/RelativeLayout;Lcom/stripe/android/view/CardInputWidget;Lcom/stripe/android/view/CardMultilineWidget;Lcom/stripe/android/view/ShippingInfoWidget;)V

    return-object v1

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Missing required view with ID: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static c(Landroid/view/LayoutInflater;)LO2;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LO2;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LO2;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LO2;
    .locals 2

    sget v0, Lcj4;->activity_add_card:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    invoke-static {p0}, LO2;->a(Landroid/view/View;)LO2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Landroid/widget/LinearLayout;
    .locals 1

    iget-object v0, p0, LO2;->a:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LO2;->b()Landroid/widget/LinearLayout;

    move-result-object v0

    return-object v0
.end method
