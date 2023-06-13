.class public final Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final confirmedIcon:Landroid/widget/ImageView;

.field public final confirmingIcon:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

.field public final label:Landroidx/compose/ui/platform/ComposeView;

.field public final lockIcon:Landroid/widget/ImageView;

.field private final rootView:Landroid/view/View;


# direct methods
.method private constructor <init>(Landroid/view/View;Landroid/widget/ImageView;Lcom/google/android/material/progressindicator/CircularProgressIndicator;Landroidx/compose/ui/platform/ComposeView;Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;->rootView:Landroid/view/View;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;->confirmedIcon:Landroid/widget/ImageView;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;->confirmingIcon:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;->label:Landroidx/compose/ui/platform/ComposeView;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;->lockIcon:Landroid/widget/ImageView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;
    .locals 8

    sget v0, Lcom/stripe/android/paymentsheet/R$id;->confirmed_icon:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/ImageView;

    if-eqz v4, :cond_0

    sget v0, Lcom/stripe/android/paymentsheet/R$id;->confirming_icon:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    if-eqz v5, :cond_0

    sget v0, Lcom/stripe/android/paymentsheet/R$id;->label:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroidx/compose/ui/platform/ComposeView;

    if-eqz v6, :cond_0

    sget v0, Lcom/stripe/android/paymentsheet/R$id;->lock_icon:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/ImageView;

    if-eqz v7, :cond_0

    new-instance v0, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;

    move-object v2, v0

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;-><init>(Landroid/view/View;Landroid/widget/ImageView;Lcom/google/android/material/progressindicator/CircularProgressIndicator;Landroidx/compose/ui/platform/ComposeView;Landroid/widget/ImageView;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;
    .locals 1

    if-eqz p1, :cond_0

    sget v0, Lcom/stripe/android/paymentsheet/R$layout;->primary_button:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;->bind(Landroid/view/View;)Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;

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

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/databinding/PrimaryButtonBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
