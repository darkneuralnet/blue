.class public LdX2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LdX2$a;
    }
.end annotation


# instance fields
.field public final a:LdX2$a;

.field public final b:[Landroid/view/View;


# direct methods
.method public varargs constructor <init>(LdX2$a;[Landroid/view/View;)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "LambdaLast"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LdX2;->a:LdX2$a;

    iput-object p2, p0, LdX2;->b:[Landroid/view/View;

    return-void
.end method

.method public static synthetic a(Landroid/animation/ValueAnimator;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, LdX2;->j(Landroid/animation/ValueAnimator;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Landroid/animation/ValueAnimator;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, LdX2;->h(Landroid/animation/ValueAnimator;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic c(Landroid/animation/ValueAnimator;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, LdX2;->i(Landroid/animation/ValueAnimator;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Landroid/animation/ValueAnimator;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, LdX2;->g(Landroid/animation/ValueAnimator;Landroid/view/View;)V

    return-void
.end method

.method public static varargs e([Landroid/view/View;)LdX2;
    .locals 2

    new-instance v0, LdX2;

    new-instance v1, LcX2;

    invoke-direct {v1}, LcX2;-><init>()V

    invoke-direct {v0, v1, p0}, LdX2;-><init>(LdX2$a;[Landroid/view/View;)V

    return-object v0
.end method

.method public static varargs f([Landroid/view/View;)LdX2;
    .locals 2

    new-instance v0, LdX2;

    new-instance v1, LZW2;

    invoke-direct {v1}, LZW2;-><init>()V

    invoke-direct {v0, v1, p0}, LdX2;-><init>(LdX2$a;[Landroid/view/View;)V

    return-object v0
.end method

.method public static g(Landroid/animation/ValueAnimator;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    invoke-virtual {p1, p0}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public static h(Landroid/animation/ValueAnimator;Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleX(F)V

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    invoke-virtual {p1, p0}, Landroid/view/View;->setScaleY(F)V

    return-void
.end method

.method public static i(Landroid/animation/ValueAnimator;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    invoke-virtual {p1, p0}, Landroid/view/View;->setTranslationX(F)V

    return-void
.end method

.method public static j(Landroid/animation/ValueAnimator;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    invoke-virtual {p1, p0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public static varargs k([Landroid/view/View;)LdX2;
    .locals 2

    new-instance v0, LdX2;

    new-instance v1, LaX2;

    invoke-direct {v1}, LaX2;-><init>()V

    invoke-direct {v0, v1, p0}, LdX2;-><init>(LdX2$a;[Landroid/view/View;)V

    return-object v0
.end method

.method public static varargs l([Landroid/view/View;)LdX2;
    .locals 2

    new-instance v0, LdX2;

    new-instance v1, LbX2;

    invoke-direct {v1}, LbX2;-><init>()V

    invoke-direct {v0, v1, p0}, LdX2;-><init>(LdX2$a;[Landroid/view/View;)V

    return-object v0
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 5

    iget-object v0, p0, LdX2;->b:[Landroid/view/View;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    iget-object v4, p0, LdX2;->a:LdX2$a;

    invoke-interface {v4, p1, v3}, LdX2$a;->a(Landroid/animation/ValueAnimator;Landroid/view/View;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
