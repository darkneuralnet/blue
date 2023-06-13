.class public final LGe2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKp6;


# instance fields
.field public final a:Landroidx/cardview/widget/CardView;

.field public final b:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final c:Landroidx/cardview/widget/CardView;

.field public final d:Landroid/widget/TextView;

.field public final e:Landroid/widget/ImageView;

.field public final f:Landroid/widget/TextView;

.field public final g:Lco/bird/android/feature/payment/views/SupportedPaymentBrandsView;

.field public final h:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroidx/cardview/widget/CardView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/cardview/widget/CardView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Lco/bird/android/feature/payment/views/SupportedPaymentBrandsView;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGe2;->a:Landroidx/cardview/widget/CardView;

    iput-object p2, p0, LGe2;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p3, p0, LGe2;->c:Landroidx/cardview/widget/CardView;

    iput-object p4, p0, LGe2;->d:Landroid/widget/TextView;

    iput-object p5, p0, LGe2;->e:Landroid/widget/ImageView;

    iput-object p6, p0, LGe2;->f:Landroid/widget/TextView;

    iput-object p7, p0, LGe2;->g:Lco/bird/android/feature/payment/views/SupportedPaymentBrandsView;

    iput-object p8, p0, LGe2;->h:Landroid/widget/TextView;

    return-void
.end method

.method public static a(Landroid/view/View;)LGe2;
    .locals 11

    sget v0, LOh4;->contentContainer:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v4, :cond_0

    move-object v5, p0

    check-cast v5, Landroidx/cardview/widget/CardView;

    sget v0, LOh4;->promoText:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/TextView;

    if-eqz v6, :cond_0

    sget v0, LOh4;->selectedIndicator:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/ImageView;

    if-eqz v7, :cond_0

    sget v0, LOh4;->subtitle:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroid/widget/TextView;

    if-eqz v8, :cond_0

    sget v0, LOh4;->supportedBrands:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lco/bird/android/feature/payment/views/SupportedPaymentBrandsView;

    if-eqz v9, :cond_0

    sget v0, LOh4;->title:I

    invoke-static {p0, v0}, LLp6;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Landroid/widget/TextView;

    if-eqz v10, :cond_0

    new-instance p0, LGe2;

    move-object v2, p0

    move-object v3, v5

    invoke-direct/range {v2 .. v10}, LGe2;-><init>(Landroidx/cardview/widget/CardView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/cardview/widget/CardView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Lco/bird/android/feature/payment/views/SupportedPaymentBrandsView;Landroid/widget/TextView;)V

    return-object p0

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


# virtual methods
.method public b()Landroidx/cardview/widget/CardView;
    .locals 1

    iget-object v0, p0, LGe2;->a:Landroidx/cardview/widget/CardView;

    return-object v0
.end method

.method public bridge synthetic getRoot()Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LGe2;->b()Landroidx/cardview/widget/CardView;

    move-result-object v0

    return-object v0
.end method
