.class public Lde/mateware/snacky/Snacky;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lde/mateware/snacky/Snacky$Builder;,
        Lde/mateware/snacky/Snacky$Duration;,
        Lde/mateware/snacky/Snacky$b;
    }
.end annotation


# static fields
.field public static final LENGTH_INDEFINITE:I = -0x2

.field public static final LENGTH_LONG:I = 0x0

.field public static final LENGTH_SHORT:I = -0x1


# instance fields
.field public final a:Lde/mateware/snacky/Snacky$Builder;


# direct methods
.method public constructor <init>(Lde/mateware/snacky/Snacky$Builder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    return-void
.end method

.method public synthetic constructor <init>(Lde/mateware/snacky/Snacky$Builder;Lde/mateware/snacky/Snacky$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lde/mateware/snacky/Snacky;-><init>(Lde/mateware/snacky/Snacky$Builder;)V

    return-void
.end method

.method public static synthetic a(Lde/mateware/snacky/Snacky;)Lcom/google/android/material/snackbar/Snackbar;
    .locals 0

    invoke-virtual {p0}, Lde/mateware/snacky/Snacky;->b()Lcom/google/android/material/snackbar/Snackbar;

    move-result-object p0

    return-object p0
.end method

.method public static builder()Lde/mateware/snacky/Snacky$Builder;
    .locals 2

    new-instance v0, Lde/mateware/snacky/Snacky$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lde/mateware/snacky/Snacky$Builder;-><init>(Lde/mateware/snacky/Snacky$a;)V

    return-object v0
.end method


# virtual methods
.method public final b()Lcom/google/android/material/snackbar/Snackbar;
    .locals 6

    iget-object v0, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v0}, Lde/mateware/snacky/Snacky$Builder;->a(Lde/mateware/snacky/Snacky$Builder;)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v1}, Lde/mateware/snacky/Snacky$Builder;->b(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/CharSequence;

    move-result-object v1

    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->n(Lde/mateware/snacky/Snacky$Builder;)I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/google/android/material/snackbar/Snackbar;->o0(Landroid/view/View;Ljava/lang/CharSequence;I)Lcom/google/android/material/snackbar/Snackbar;

    move-result-object v0

    iget-object v1, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v1}, Lde/mateware/snacky/Snacky$Builder;->r(Lde/mateware/snacky/Snacky$Builder;)Landroid/view/View$OnClickListener;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v1}, Lde/mateware/snacky/Snacky$Builder;->t(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/CharSequence;

    move-result-object v1

    if-eqz v1, :cond_4

    :cond_0
    iget-object v1, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v1}, Lde/mateware/snacky/Snacky$Builder;->r(Lde/mateware/snacky/Snacky$Builder;)Landroid/view/View$OnClickListener;

    move-result-object v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    new-instance v2, Lde/mateware/snacky/Snacky$a;

    invoke-direct {v2, p0}, Lde/mateware/snacky/Snacky$a;-><init>(Lde/mateware/snacky/Snacky;)V

    invoke-static {v1, v2}, Lde/mateware/snacky/Snacky$Builder;->s(Lde/mateware/snacky/Snacky$Builder;Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;

    :cond_1
    iget-object v1, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v1}, Lde/mateware/snacky/Snacky$Builder;->t(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/CharSequence;

    move-result-object v1

    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->r(Lde/mateware/snacky/Snacky$Builder;)Landroid/view/View$OnClickListener;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/snackbar/Snackbar;->r0(Ljava/lang/CharSequence;Landroid/view/View$OnClickListener;)Lcom/google/android/material/snackbar/Snackbar;

    iget-object v1, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v1}, Lde/mateware/snacky/Snacky$Builder;->u(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v1}, Lde/mateware/snacky/Snacky$Builder;->w(Lde/mateware/snacky/Snacky$Builder;)Lde/mateware/snacky/Snacky$b;

    move-result-object v2

    invoke-virtual {v2}, Lde/mateware/snacky/Snacky$b;->c()Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lde/mateware/snacky/Snacky$Builder;->v(Lde/mateware/snacky/Snacky$Builder;Ljava/lang/Integer;)Ljava/lang/Integer;

    :cond_2
    iget-object v1, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v1}, Lde/mateware/snacky/Snacky$Builder;->x(Lde/mateware/snacky/Snacky$Builder;)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v1}, Lde/mateware/snacky/Snacky$Builder;->x(Lde/mateware/snacky/Snacky$Builder;)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/snackbar/Snackbar;->t0(Landroid/content/res/ColorStateList;)Lcom/google/android/material/snackbar/Snackbar;

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v1}, Lde/mateware/snacky/Snacky$Builder;->u(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v1}, Lde/mateware/snacky/Snacky$Builder;->u(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/snackbar/Snackbar;->s0(I)Lcom/google/android/material/snackbar/Snackbar;

    :cond_4
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->I()Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/snackbar/Snackbar$SnackbarLayout;

    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->y(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Integer;

    move-result-object v2

    if-nez v2, :cond_5

    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->w(Lde/mateware/snacky/Snacky$Builder;)Lde/mateware/snacky/Snacky$b;

    move-result-object v3

    invoke-virtual {v3}, Lde/mateware/snacky/Snacky$b;->a()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lde/mateware/snacky/Snacky$Builder;->z(Lde/mateware/snacky/Snacky$Builder;Ljava/lang/Integer;)Ljava/lang/Integer;

    :cond_5
    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->y(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_6

    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->y(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_6
    sget v2, LJi4;->snackbar_action:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v3, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v3}, Lde/mateware/snacky/Snacky$Builder;->A(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Float;

    move-result-object v3

    if-eqz v3, :cond_8

    iget-object v3, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v3}, Lde/mateware/snacky/Snacky$Builder;->c(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_7

    iget-object v3, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v3}, Lde/mateware/snacky/Snacky$Builder;->c(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v4}, Lde/mateware/snacky/Snacky$Builder;->A(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v2, v3, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_1

    :cond_7
    iget-object v3, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v3}, Lde/mateware/snacky/Snacky$Builder;->A(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    :cond_8
    :goto_1
    invoke-virtual {v2}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v3

    iget-object v4, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v4}, Lde/mateware/snacky/Snacky$Builder;->d(Lde/mateware/snacky/Snacky$Builder;)Landroid/graphics/Typeface;

    move-result-object v4

    if-eqz v4, :cond_9

    iget-object v3, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v3}, Lde/mateware/snacky/Snacky$Builder;->d(Lde/mateware/snacky/Snacky$Builder;)Landroid/graphics/Typeface;

    move-result-object v3

    :cond_9
    iget-object v4, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v4}, Lde/mateware/snacky/Snacky$Builder;->e(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_a

    iget-object v4, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v4}, Lde/mateware/snacky/Snacky$Builder;->e(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    goto :goto_2

    :cond_a
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :goto_2
    sget v2, LJi4;->snackbar_text:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->f(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Float;

    move-result-object v2

    if-eqz v2, :cond_c

    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->g(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_b

    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->g(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v3}, Lde/mateware/snacky/Snacky$Builder;->f(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_3

    :cond_b
    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->f(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    :cond_c
    :goto_3
    invoke-virtual {v1}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v2

    iget-object v3, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v3}, Lde/mateware/snacky/Snacky$Builder;->h(Lde/mateware/snacky/Snacky$Builder;)Landroid/graphics/Typeface;

    move-result-object v3

    if-eqz v3, :cond_d

    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->h(Lde/mateware/snacky/Snacky$Builder;)Landroid/graphics/Typeface;

    move-result-object v2

    :cond_d
    iget-object v3, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v3}, Lde/mateware/snacky/Snacky$Builder;->i(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_e

    iget-object v3, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v3}, Lde/mateware/snacky/Snacky$Builder;->i(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    goto :goto_4

    :cond_e
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :goto_4
    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->j(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Integer;

    move-result-object v2

    if-nez v2, :cond_f

    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->w(Lde/mateware/snacky/Snacky$Builder;)Lde/mateware/snacky/Snacky$b;

    move-result-object v3

    invoke-virtual {v3}, Lde/mateware/snacky/Snacky$b;->c()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lde/mateware/snacky/Snacky$Builder;->k(Lde/mateware/snacky/Snacky$Builder;Ljava/lang/Integer;)Ljava/lang/Integer;

    :cond_f
    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->l(Lde/mateware/snacky/Snacky$Builder;)Landroid/content/res/ColorStateList;

    move-result-object v2

    if-eqz v2, :cond_10

    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->l(Lde/mateware/snacky/Snacky$Builder;)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    goto :goto_5

    :cond_10
    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->j(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_11

    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->j(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_11
    :goto_5
    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->m(Lde/mateware/snacky/Snacky$Builder;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->o(Lde/mateware/snacky/Snacky$Builder;)Z

    move-result v2

    if-eqz v2, :cond_12

    const/16 v2, 0x11

    goto :goto_6

    :cond_12
    const/16 v2, 0x10

    :goto_6
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->o(Lde/mateware/snacky/Snacky$Builder;)Z

    move-result v2

    if-eqz v2, :cond_13

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/view/View;->setTextAlignment(I)V

    :cond_13
    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->p(Lde/mateware/snacky/Snacky$Builder;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_14

    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->w(Lde/mateware/snacky/Snacky$Builder;)Lde/mateware/snacky/Snacky$b;

    move-result-object v3

    iget-object v4, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v4}, Lde/mateware/snacky/Snacky$Builder;->a(Lde/mateware/snacky/Snacky$Builder;)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v3, v4}, Lde/mateware/snacky/Snacky$b;->b(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-static {v2, v3}, Lde/mateware/snacky/Snacky$Builder;->q(Lde/mateware/snacky/Snacky$Builder;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    :cond_14
    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->p(Lde/mateware/snacky/Snacky$Builder;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_16

    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->o(Lde/mateware/snacky/Snacky$Builder;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_15

    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->t(Lde/mateware/snacky/Snacky$Builder;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_15

    iget-object v2, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v2}, Lde/mateware/snacky/Snacky$Builder;->a(Lde/mateware/snacky/Snacky$Builder;)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v4, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v4}, Lde/mateware/snacky/Snacky$Builder;->p(Lde/mateware/snacky/Snacky$Builder;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    iget-object v5, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v5}, Lde/mateware/snacky/Snacky$Builder;->p(Lde/mateware/snacky/Snacky$Builder;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    invoke-static {v2, v4, v5}, Lde/mateware/snacky/SnackyUtils;->a(Landroid/content/Context;II)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_7

    :cond_15
    move-object v2, v3

    :goto_7
    iget-object v4, p0, Lde/mateware/snacky/Snacky;->a:Lde/mateware/snacky/Snacky$Builder;

    invoke-static {v4}, Lde/mateware/snacky/Snacky$Builder;->p(Lde/mateware/snacky/Snacky$Builder;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v1, v4, v3, v2, v3}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lde/mateware/snacky/R$dimen;->snacky_icon_padding:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    :cond_16
    return-object v0
.end method
