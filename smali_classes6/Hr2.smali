.class public final LHr2;
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
.field public static final j:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "LHr2;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public d:Landroid/animation/ObjectAnimator;

.field public e:LLj1;

.field public final f:LyC;

.field public g:I

.field public h:Z

.field public i:F


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, LHr2$b;

    const-class v1, Ljava/lang/Float;

    const-string v2, "animationFraction"

    invoke-direct {v0, v1, v2}, LHr2$b;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, LHr2;->j:Landroid/util/Property;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/progressindicator/LinearProgressIndicatorSpec;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lp12;-><init>(I)V

    const/4 v0, 0x1

    iput v0, p0, LHr2;->g:I

    iput-object p1, p0, LHr2;->f:LyC;

    new-instance p1, LLj1;

    invoke-direct {p1}, LLj1;-><init>()V

    iput-object p1, p0, LHr2;->e:LLj1;

    return-void
.end method

.method public static synthetic i(LHr2;)I
    .locals 0

    iget p0, p0, LHr2;->g:I

    return p0
.end method

.method public static synthetic j(LHr2;I)I
    .locals 0

    iput p1, p0, LHr2;->g:I

    return p1
.end method

.method public static synthetic k(LHr2;)LyC;
    .locals 0

    iget-object p0, p0, LHr2;->f:LyC;

    return-object p0
.end method

.method public static synthetic l(LHr2;Z)Z
    .locals 0

    iput-boolean p1, p0, LHr2;->h:Z

    return p1
.end method

.method public static synthetic m(LHr2;)F
    .locals 0

    invoke-virtual {p0}, LHr2;->n()F

    move-result p0

    return p0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, LHr2;->d:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    :cond_0
    return-void
.end method

.method public c()V
    .locals 0

    invoke-virtual {p0}, LHr2;->q()V

    return-void
.end method

.method public d(Loe;)V
    .locals 0

    return-void
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public g()V
    .locals 1

    invoke-virtual {p0}, LHr2;->o()V

    invoke-virtual {p0}, LHr2;->q()V

    iget-object v0, p0, LHr2;->d:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public final n()F
    .locals 1

    iget v0, p0, LHr2;->i:F

    return v0
.end method

.method public final o()V
    .locals 3

    iget-object v0, p0, LHr2;->d:Landroid/animation/ObjectAnimator;

    if-nez v0, :cond_0

    sget-object v0, LHr2;->j:Landroid/util/Property;

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, LHr2;->d:Landroid/animation/ObjectAnimator;

    const-wide/16 v1, 0x14d

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    iget-object v0, p0, LHr2;->d:Landroid/animation/ObjectAnimator;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v0, p0, LHr2;->d:Landroid/animation/ObjectAnimator;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    iget-object v0, p0, LHr2;->d:Landroid/animation/ObjectAnimator;

    new-instance v1, LHr2$a;

    invoke-direct {v1, p0}, LHr2$a;-><init>(LHr2;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_0
    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final p()V
    .locals 4

    iget-boolean v0, p0, LHr2;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp12;->b:[F

    const/4 v1, 0x3

    aget v0, v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    iget-object v0, p0, Lp12;->c:[I

    const/4 v1, 0x2

    const/4 v2, 0x1

    aget v3, v0, v2

    aput v3, v0, v1

    const/4 v1, 0x0

    aget v3, v0, v1

    aput v3, v0, v2

    iget-object v2, p0, LHr2;->f:LyC;

    iget-object v2, v2, LyC;->c:[I

    iget v3, p0, LHr2;->g:I

    aget v2, v2, v3

    iget-object v3, p0, Lp12;->a:Lq12;

    invoke-virtual {v3}, Lq12;->getAlpha()I

    move-result v3

    invoke-static {v2, v3}, LHM2;->a(II)I

    move-result v2

    aput v2, v0, v1

    iput-boolean v1, p0, LHr2;->h:Z

    :cond_0
    return-void
.end method

.method public q()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, LHr2;->h:Z

    iput v0, p0, LHr2;->g:I

    iget-object v0, p0, Lp12;->c:[I

    iget-object v1, p0, LHr2;->f:LyC;

    iget-object v1, v1, LyC;->c:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    iget-object v2, p0, Lp12;->a:Lq12;

    invoke-virtual {v2}, Lq12;->getAlpha()I

    move-result v2

    invoke-static {v1, v2}, LHM2;->a(II)I

    move-result v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    return-void
.end method

.method public r(F)V
    .locals 1

    iput p1, p0, LHr2;->i:F

    const v0, 0x43a68000    # 333.0f

    mul-float/2addr p1, v0

    float-to-int p1, p1

    invoke-virtual {p0, p1}, LHr2;->s(I)V

    invoke-virtual {p0}, LHr2;->p()V

    iget-object p1, p0, Lp12;->a:Lq12;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final s(I)V
    .locals 3

    iget-object v0, p0, Lp12;->b:[F

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput v1, v0, v2

    const/16 v0, 0x29b

    invoke-virtual {p0, p1, v2, v0}, Lp12;->b(III)F

    move-result p1

    iget-object v0, p0, Lp12;->b:[F

    iget-object v1, p0, LHr2;->e:LLj1;

    invoke-virtual {v1, p1}, LLj1;->getInterpolation(F)F

    move-result v1

    const/4 v2, 0x2

    aput v1, v0, v2

    const/4 v2, 0x1

    aput v1, v0, v2

    const v0, 0x3eff9dbf

    add-float/2addr p1, v0

    iget-object v0, p0, Lp12;->b:[F

    iget-object v1, p0, LHr2;->e:LLj1;

    invoke-virtual {v1, p1}, LLj1;->getInterpolation(F)F

    move-result p1

    const/4 v1, 0x4

    aput p1, v0, v1

    const/4 v1, 0x3

    aput p1, v0, v1

    iget-object p1, p0, Lp12;->b:[F

    const/4 v0, 0x5

    const/high16 v1, 0x3f800000    # 1.0f

    aput v1, p1, v0

    return-void
.end method
