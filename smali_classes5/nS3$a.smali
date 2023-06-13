.class public LnS3$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQg3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LnS3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LnS3;


# direct methods
.method public constructor <init>(LnS3;)V
    .locals 0

    iput-object p1, p0, LnS3$a;->a:LnS3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(FFFF)V
    .locals 2

    iget-object p1, p0, LnS3$a;->a:LnS3;

    new-instance p2, LnS3$f;

    invoke-static {p1}, LnS3;->r(LnS3;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, p1, v0}, LnS3$f;-><init>(LnS3;Landroid/content/Context;)V

    invoke-static {p1, p2}, LnS3;->x(LnS3;LnS3$f;)LnS3$f;

    iget-object p1, p0, LnS3$a;->a:LnS3;

    invoke-static {p1}, LnS3;->w(LnS3;)LnS3$f;

    move-result-object p1

    iget-object p2, p0, LnS3$a;->a:LnS3;

    invoke-static {p2}, LnS3;->r(LnS3;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-static {p2, v0}, LnS3;->c(LnS3;Landroid/widget/ImageView;)I

    move-result p2

    iget-object v0, p0, LnS3$a;->a:LnS3;

    invoke-static {v0}, LnS3;->r(LnS3;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-static {v0, v1}, LnS3;->d(LnS3;Landroid/widget/ImageView;)I

    move-result v0

    float-to-int p3, p3

    float-to-int p4, p4

    invoke-virtual {p1, p2, v0, p3, p4}, LnS3$f;->b(IIII)V

    iget-object p1, p0, LnS3$a;->a:LnS3;

    invoke-static {p1}, LnS3;->r(LnS3;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object p2, p0, LnS3$a;->a:LnS3;

    invoke-static {p2}, LnS3;->w(LnS3;)LnS3$f;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b(FF)V
    .locals 5

    iget-object v0, p0, LnS3$a;->a:LnS3;

    invoke-static {v0}, LnS3;->a(LnS3;)LnF0;

    move-result-object v0

    invoke-virtual {v0}, LnF0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LnS3$a;->a:LnS3;

    invoke-static {v0}, LnS3;->b(LnS3;)Lqh3;

    iget-object v0, p0, LnS3$a;->a:LnS3;

    invoke-static {v0}, LnS3;->k(LnS3;)Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    iget-object v0, p0, LnS3$a;->a:LnS3;

    invoke-static {v0}, LnS3;->q(LnS3;)V

    iget-object v0, p0, LnS3$a;->a:LnS3;

    invoke-static {v0}, LnS3;->r(LnS3;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, LnS3$a;->a:LnS3;

    invoke-static {v1}, LnS3;->s(LnS3;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_5

    iget-object v1, p0, LnS3$a;->a:LnS3;

    invoke-static {v1}, LnS3;->a(LnS3;)LnF0;

    move-result-object v1

    invoke-virtual {v1}, LnF0;->e()Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, LnS3$a;->a:LnS3;

    invoke-static {v1}, LnS3;->t(LnS3;)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, LnS3$a;->a:LnS3;

    invoke-static {v1}, LnS3;->u(LnS3;)I

    move-result v1

    const/4 v3, 0x2

    if-eq v1, v3, :cond_4

    iget-object v1, p0, LnS3$a;->a:LnS3;

    invoke-static {v1}, LnS3;->u(LnS3;)I

    move-result v1

    const/high16 v3, 0x3f800000    # 1.0f

    if-nez v1, :cond_1

    cmpl-float v1, p1, v3

    if-gez v1, :cond_4

    :cond_1
    iget-object v1, p0, LnS3$a;->a:LnS3;

    invoke-static {v1}, LnS3;->u(LnS3;)I

    move-result v1

    const/high16 v4, -0x40800000    # -1.0f

    if-ne v1, v2, :cond_2

    cmpg-float p1, p1, v4

    if-lez p1, :cond_4

    :cond_2
    iget-object p1, p0, LnS3$a;->a:LnS3;

    invoke-static {p1}, LnS3;->v(LnS3;)I

    move-result p1

    if-nez p1, :cond_3

    cmpl-float p1, p2, v3

    if-gez p1, :cond_4

    :cond_3
    iget-object p1, p0, LnS3$a;->a:LnS3;

    invoke-static {p1}, LnS3;->v(LnS3;)I

    move-result p1

    if-ne p1, v2, :cond_6

    cmpg-float p1, p2, v4

    if-gtz p1, :cond_6

    :cond_4
    if-eqz v0, :cond_6

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_0

    :cond_5
    if-eqz v0, :cond_6

    invoke-interface {v0, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_6
    :goto_0
    return-void
.end method

.method public c(FFF)V
    .locals 2

    iget-object v0, p0, LnS3$a;->a:LnS3;

    invoke-virtual {v0}, LnS3;->K()F

    move-result v0

    iget-object v1, p0, LnS3$a;->a:LnS3;

    invoke-static {v1}, LnS3;->e(LnS3;)F

    move-result v1

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p1, v0

    if-gez v0, :cond_1

    :cond_0
    iget-object v0, p0, LnS3$a;->a:LnS3;

    invoke-static {v0}, LnS3;->f(LnS3;)Lih3;

    iget-object v0, p0, LnS3$a;->a:LnS3;

    invoke-static {v0}, LnS3;->k(LnS3;)Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v0, p1, p1, p2, p3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    iget-object p1, p0, LnS3$a;->a:LnS3;

    invoke-static {p1}, LnS3;->q(LnS3;)V

    :cond_1
    return-void
.end method
