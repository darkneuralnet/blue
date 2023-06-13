.class public final Lcom/stripe/android/databinding/CardBrandViewBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final icon:Landroid/widget/ImageView;

.field public final progress:Lcom/stripe/android/view/CardWidgetProgressView;

.field private final rootView:Landroid/view/View;


# direct methods
.method private constructor <init>(Landroid/view/View;Landroid/widget/ImageView;Lcom/stripe/android/view/CardWidgetProgressView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/databinding/CardBrandViewBinding;->rootView:Landroid/view/View;

    iput-object p2, p0, Lcom/stripe/android/databinding/CardBrandViewBinding;->icon:Landroid/widget/ImageView;

    iput-object p3, p0, Lcom/stripe/android/databinding/CardBrandViewBinding;->progress:Lcom/stripe/android/view/CardWidgetProgressView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/stripe/android/databinding/CardBrandViewBinding;
    .locals 3

    sget v0, Lcom/stripe/android/R$id;->icon:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-eqz v1, :cond_0

    sget v0, Lcom/stripe/android/R$id;->progress:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/view/CardWidgetProgressView;

    if-eqz v2, :cond_0

    new-instance v0, Lcom/stripe/android/databinding/CardBrandViewBinding;

    invoke-direct {v0, p0, v1, v2}, Lcom/stripe/android/databinding/CardBrandViewBinding;-><init>(Landroid/view/View;Landroid/widget/ImageView;Lcom/stripe/android/view/CardWidgetProgressView;)V

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

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/stripe/android/databinding/CardBrandViewBinding;
    .locals 1

    if-eqz p1, :cond_0

    sget v0, Lcom/stripe/android/R$layout;->card_brand_view:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-static {p1}, Lcom/stripe/android/databinding/CardBrandViewBinding;->bind(Landroid/view/View;)Lcom/stripe/android/databinding/CardBrandViewBinding;

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

    iget-object v0, p0, Lcom/stripe/android/databinding/CardBrandViewBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
