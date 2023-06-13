.class public final LIr2;
.super Lp12;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp12<",
        "Landroid/animation/ObjectAnimator;",
        ">;"
    }
.end annotation


# static fields
.field public static final l:[I

.field public static final m:[I

.field public static final n:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "LIr2;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public d:Landroid/animation/ObjectAnimator;

.field public e:Landroid/animation/ObjectAnimator;

.field public final f:[Landroid/view/animation/Interpolator;

.field public final g:LyC;

.field public h:I

.field public i:Z

.field public j:F

.field public k:Loe;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x4

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sput-object v1, LIr2;->l:[I

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, LIr2;->m:[I

    new-instance v0, LIr2$c;

    const-class v1, Ljava/lang/Float;

    const-string v2, "animationFraction"

    invoke-direct {v0, v1, v2}, LIr2$c;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, LIr2;->n:Landroid/util/Property;

    return-void

    nop

    :array_0
    .array-data 4
        0x215
        0x237
        0x352
        0x2ee
    .end array-data

    :array_1
    .array-data 4
        0x4f3
        0x3e8
        0x14d
        0x0
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;)V
    .locals 3

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lp12;-><init>(I)V

    const/4 v1, 0x0

    iput v1, p0, LIr2;->h:I

    const/4 v2, 0x0

    iput-object v2, p0, LIr2;->k:Loe;

    iput-object p2, p0, LIr2;->g:LyC;

    const/4 p2, 0x4

    new-array p2, p2, [Landroid/view/animation/Interpolator;

    sget v2, Laf4;->linear_indeterminate_line1_head_interpolator:I

    invoke-static {p1, v2}, Lrf;->a(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object v2

    aput-object v2, p2, v1

    sget v1, Laf4;->linear_indeterminate_line1_tail_interpolator:I

    invoke-static {p1, v1}, Lrf;->a(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, p2, v2

    sget v1, Laf4;->linear_indeterminate_line2_head_interpolator:I

    invoke-static {p1, v1}, Lrf;->a(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object v1

    aput-object v1, p2, v0

    sget v0, Laf4;->linear_indeterminate_line2_tail_interpolator:I

    invoke-static {p1, v0}, Lrf;->a(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object p1

    const/4 v0, 0x3

    aput-object p1, p2, v0

    iput-object p2, p0, LIr2;->f:[Landroid/view/animation/Interpolator;

    return-void
.end method

.method public static synthetic i(LIr2;)I
    .locals 0

    iget p0, p0, LIr2;->h:I

    return p0
.end method

.method public static synthetic j(LIr2;I)I
    .locals 0

    iput p1, p0, LIr2;->h:I

    return p1
.end method

.method public static synthetic k(LIr2;)LyC;
    .locals 0

    iget-object p0, p0, LIr2;->g:LyC;

    return-object p0
.end method

.method public static synthetic l(LIr2;Z)Z
    .locals 0

    iput-boolean p1, p0, LIr2;->i:Z

    return p1
.end method

.method public static synthetic m(LIr2;)F
    .locals 0

    invoke-virtual {p0}, LIr2;->n()F

    move-result p0

    return p0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, LIr2;->d:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 0

    invoke-virtual {p0}, LIr2;->q()V

    return-void
.end method

.method public d(Loe;)V
    .locals 0

    iput-object p1, p0, LIr2;->k:Loe;

    return-void
.end method

.method public f()V
    .locals 4

    iget-object v0, p0, LIr2;->e:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LIr2;->a()V

    iget-object v0, p0, Lp12;->a:Lq12;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LIr2;->e:Landroid/animation/ObjectAnimator;

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v2, 0x0

    iget v3, p0, LIr2;->j:F

    aput v3, v1, v2

    const/4 v2, 0x1

    const/high16 v3, 0x3f800000    # 1.0f

    aput v3, v1, v2

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    iget-object v0, p0, LIr2;->e:Landroid/animation/ObjectAnimator;

    iget v1, p0, LIr2;->j:F

    sub-float/2addr v3, v1

    const/high16 v1, 0x44e10000    # 1800.0f

    mul-float/2addr v3, v1

    float-to-long v1, v3

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    iget-object v0, p0, LIr2;->e:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    :cond_1
    :goto_0
    return-void
.end method

.method public g()V
    .locals 1

    invoke-virtual {p0}, LIr2;->o()V

    invoke-virtual {p0}, LIr2;->q()V

    iget-object v0, p0, LIr2;->d:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void
.end method

.method public h()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LIr2;->k:Loe;

    return-void
.end method

.method public final n()F
    .locals 1

    iget v0, p0, LIr2;->j:F

    return v0
.end method

.method public final o()V
    .locals 7

    iget-object v0, p0, LIr2;->d:Landroid/animation/ObjectAnimator;

    const/4 v1, 0x0

    const-wide/16 v2, 0x708

    if-nez v0, :cond_0

    sget-object v0, LIr2;->n:Landroid/util/Property;

    const/4 v4, 0x2

    new-array v4, v4, [F

    fill-array-data v4, :array_0

    invoke-static {p0, v0, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, LIr2;->d:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    iget-object v0, p0, LIr2;->d:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v0, p0, LIr2;->d:Landroid/animation/ObjectAnimator;

    const/4 v4, -0x1

    invoke-virtual {v0, v4}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    iget-object v0, p0, LIr2;->d:Landroid/animation/ObjectAnimator;

    new-instance v4, LIr2$a;

    invoke-direct {v4, p0}, LIr2$a;-><init>(LIr2;)V

    invoke-virtual {v0, v4}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_0
    iget-object v0, p0, LIr2;->e:Landroid/animation/ObjectAnimator;

    if-nez v0, :cond_1

    sget-object v0, LIr2;->n:Landroid/util/Property;

    const/4 v4, 0x1

    new-array v4, v4, [F

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    aput v6, v4, v5

    invoke-static {p0, v0, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, LIr2;->e:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    iget-object v0, p0, LIr2;->e:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v0, p0, LIr2;->e:Landroid/animation/ObjectAnimator;

    new-instance v1, LIr2$b;

    invoke-direct {v1, p0}, LIr2$b;-><init>(LIr2;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_1
    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final p()V
    .locals 3

    iget-boolean v0, p0, LIr2;->i:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp12;->c:[I

    iget-object v1, p0, LIr2;->g:LyC;

    iget-object v1, v1, LyC;->c:[I

    iget v2, p0, LIr2;->h:I

    aget v1, v1, v2

    iget-object v2, p0, Lp12;->a:Lq12;

    invoke-virtual {v2}, Lq12;->getAlpha()I

    move-result v2

    invoke-static {v1, v2}, LHM2;->a(II)I

    move-result v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LIr2;->i:Z

    :cond_0
    return-void
.end method

.method public q()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, LIr2;->h:I

    iget-object v1, p0, LIr2;->g:LyC;

    iget-object v1, v1, LyC;->c:[I

    aget v1, v1, v0

    iget-object v2, p0, Lp12;->a:Lq12;

    invoke-virtual {v2}, Lq12;->getAlpha()I

    move-result v2

    invoke-static {v1, v2}, LHM2;->a(II)I

    move-result v1

    iget-object v2, p0, Lp12;->c:[I

    aput v1, v2, v0

    const/4 v0, 0x1

    aput v1, v2, v0

    return-void
.end method

.method public r(F)V
    .locals 1

    iput p1, p0, LIr2;->j:F

    const/high16 v0, 0x44e10000    # 1800.0f

    mul-float/2addr p1, v0

    float-to-int p1, p1

    invoke-virtual {p0, p1}, LIr2;->s(I)V

    invoke-virtual {p0}, LIr2;->p()V

    iget-object p1, p0, Lp12;->a:Lq12;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final s(I)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    sget-object v1, LIr2;->m:[I

    aget v1, v1, v0

    sget-object v2, LIr2;->l:[I

    aget v2, v2, v0

    invoke-virtual {p0, p1, v1, v2}, Lp12;->b(III)F

    move-result v1

    iget-object v2, p0, LIr2;->f:[Landroid/view/animation/Interpolator;

    aget-object v2, v2, v0

    invoke-interface {v2, v1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v1

    iget-object v2, p0, Lp12;->b:[F

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    const/4 v3, 0x0

    invoke-static {v3, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    aput v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
