.class public LRD2;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;
.implements Landroid/graphics/drawable/Animatable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRD2$c;,
        LRD2$b;
    }
.end annotation


# instance fields
.field public final A:Landroid/graphics/Matrix;

.field public B:Landroid/graphics/Bitmap;

.field public C:Landroid/graphics/Canvas;

.field public D:Landroid/graphics/Rect;

.field public E:Landroid/graphics/RectF;

.field public F:Landroid/graphics/Paint;

.field public G:Landroid/graphics/Rect;

.field public H:Landroid/graphics/Rect;

.field public I:Landroid/graphics/RectF;

.field public J:Landroid/graphics/RectF;

.field public K:Landroid/graphics/Matrix;

.field public P:Landroid/graphics/Matrix;

.field public Q:Z

.field public b:LrD2;

.field public final c:LfE2;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:LRD2$c;

.field public final h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "LRD2$b;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

.field public j:LHW1;

.field public k:Ljava/lang/String;

.field public l:Lhw1;

.field public m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field

.field public n:Ljava/lang/String;

.field public o:Lgw1;

.field public p:LU06;

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Leu0;

.field public u:I

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Lqw4;

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    new-instance v0, LfE2;

    invoke-direct {v0}, LfE2;-><init>()V

    iput-object v0, p0, LRD2;->c:LfE2;

    const/4 v1, 0x1

    iput-boolean v1, p0, LRD2;->d:Z

    const/4 v2, 0x0

    iput-boolean v2, p0, LRD2;->e:Z

    iput-boolean v2, p0, LRD2;->f:Z

    sget-object v3, LRD2$c;->b:LRD2$c;

    iput-object v3, p0, LRD2;->g:LRD2$c;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, LRD2;->h:Ljava/util/ArrayList;

    new-instance v3, LRD2$a;

    invoke-direct {v3, p0}, LRD2$a;-><init>(LRD2;)V

    iput-object v3, p0, LRD2;->i:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    iput-boolean v2, p0, LRD2;->r:Z

    iput-boolean v1, p0, LRD2;->s:Z

    const/16 v1, 0xff

    iput v1, p0, LRD2;->u:I

    sget-object v1, Lqw4;->b:Lqw4;

    iput-object v1, p0, LRD2;->y:Lqw4;

    iput-boolean v2, p0, LRD2;->z:Z

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, LRD2;->A:Landroid/graphics/Matrix;

    iput-boolean v2, p0, LRD2;->Q:Z

    invoke-virtual {v0, v3}, LtB;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-void
.end method

.method public static synthetic a(LRD2;LrD2;)V
    .locals 0

    invoke-direct {p0, p1}, LRD2;->f0(LrD2;)V

    return-void
.end method

.method public static synthetic b(LRD2;FLrD2;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LRD2;->j0(FLrD2;)V

    return-void
.end method

.method public static synthetic c(LRD2;LrD2;)V
    .locals 0

    invoke-direct {p0, p1}, LRD2;->e0(LrD2;)V

    return-void
.end method

.method public static synthetic d(LRD2;FLrD2;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LRD2;->q0(FLrD2;)V

    return-void
.end method

.method private synthetic d0(LBk2;Ljava/lang/Object;LgE2;LrD2;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LRD2;->t(LBk2;Ljava/lang/Object;LgE2;)V

    return-void
.end method

.method public static synthetic e(LRD2;FLrD2;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LRD2;->r0(FLrD2;)V

    return-void
.end method

.method private synthetic e0(LrD2;)V
    .locals 0

    invoke-virtual {p0}, LRD2;->t0()V

    return-void
.end method

.method public static synthetic f(LRD2;Ljava/lang/String;LrD2;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LRD2;->p0(Ljava/lang/String;LrD2;)V

    return-void
.end method

.method private synthetic f0(LrD2;)V
    .locals 0

    invoke-virtual {p0}, LRD2;->w0()V

    return-void
.end method

.method public static synthetic g(LRD2;FFLrD2;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LRD2;->n0(FFLrD2;)V

    return-void
.end method

.method private synthetic g0(ILrD2;)V
    .locals 0

    invoke-virtual {p0, p1}, LRD2;->E0(I)V

    return-void
.end method

.method public static synthetic h(LRD2;IILrD2;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LRD2;->k0(IILrD2;)V

    return-void
.end method

.method private synthetic h0(ILrD2;)V
    .locals 0

    invoke-virtual {p0, p1}, LRD2;->J0(I)V

    return-void
.end method

.method public static synthetic i(LRD2;Ljava/lang/String;Ljava/lang/String;ZLrD2;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LRD2;->m0(Ljava/lang/String;Ljava/lang/String;ZLrD2;)V

    return-void
.end method

.method private synthetic i0(Ljava/lang/String;LrD2;)V
    .locals 0

    invoke-virtual {p0, p1}, LRD2;->K0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic j(LRD2;ILrD2;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LRD2;->o0(ILrD2;)V

    return-void
.end method

.method private synthetic j0(FLrD2;)V
    .locals 0

    invoke-virtual {p0, p1}, LRD2;->L0(F)V

    return-void
.end method

.method public static synthetic k(LRD2;Ljava/lang/String;LrD2;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LRD2;->i0(Ljava/lang/String;LrD2;)V

    return-void
.end method

.method private synthetic k0(IILrD2;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LRD2;->M0(II)V

    return-void
.end method

.method public static synthetic l(LRD2;LBk2;Ljava/lang/Object;LgE2;LrD2;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LRD2;->d0(LBk2;Ljava/lang/Object;LgE2;LrD2;)V

    return-void
.end method

.method private synthetic l0(Ljava/lang/String;LrD2;)V
    .locals 0

    invoke-virtual {p0, p1}, LRD2;->N0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic m(LRD2;ILrD2;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LRD2;->g0(ILrD2;)V

    return-void
.end method

.method private synthetic m0(Ljava/lang/String;Ljava/lang/String;ZLrD2;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LRD2;->O0(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic n(LRD2;ILrD2;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LRD2;->h0(ILrD2;)V

    return-void
.end method

.method private synthetic n0(FFLrD2;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LRD2;->P0(FF)V

    return-void
.end method

.method public static synthetic o(LRD2;Ljava/lang/String;LrD2;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LRD2;->l0(Ljava/lang/String;LrD2;)V

    return-void
.end method

.method private synthetic o0(ILrD2;)V
    .locals 0

    invoke-virtual {p0, p1}, LRD2;->Q0(I)V

    return-void
.end method

.method public static synthetic p(LRD2;)Leu0;
    .locals 0

    iget-object p0, p0, LRD2;->t:Leu0;

    return-object p0
.end method

.method private synthetic p0(Ljava/lang/String;LrD2;)V
    .locals 0

    invoke-virtual {p0, p1}, LRD2;->R0(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic q(LRD2;)LfE2;
    .locals 0

    iget-object p0, p0, LRD2;->c:LfE2;

    return-object p0
.end method

.method private synthetic q0(FLrD2;)V
    .locals 0

    invoke-virtual {p0, p1}, LRD2;->S0(F)V

    return-void
.end method

.method private synthetic r0(FLrD2;)V
    .locals 0

    invoke-virtual {p0, p1}, LRD2;->V0(F)V

    return-void
.end method


# virtual methods
.method public final A(Landroid/graphics/RectF;Landroid/graphics/Rect;)V
    .locals 5

    iget v0, p1, Landroid/graphics/RectF;->left:F

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v0, v0

    iget v1, p1, Landroid/graphics/RectF;->top:F

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int v1, v1

    iget v2, p1, Landroid/graphics/RectF;->right:F

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    float-to-double v3, p1

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int p1, v3

    invoke-virtual {p2, v0, v1, v2, p1}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method public A0(LrD2;)Z
    .locals 3

    iget-object v0, p0, LRD2;->b:LrD2;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LRD2;->Q:Z

    invoke-virtual {p0}, LRD2;->x()V

    iput-object p1, p0, LRD2;->b:LrD2;

    invoke-virtual {p0}, LRD2;->v()V

    iget-object v1, p0, LRD2;->c:LfE2;

    invoke-virtual {v1, p1}, LfE2;->H(LrD2;)V

    iget-object v1, p0, LRD2;->c:LfE2;

    invoke-virtual {v1}, LfE2;->getAnimatedFraction()F

    move-result v1

    invoke-virtual {p0, v1}, LRD2;->V0(F)V

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, LRD2;->h:Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LRD2$b;

    if-eqz v2, :cond_1

    invoke-interface {v2, p1}, LRD2$b;->a(LrD2;)V

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    iget-object v1, p0, LRD2;->h:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-boolean v1, p0, LRD2;->v:Z

    invoke-virtual {p1, v1}, LrD2;->v(Z)V

    invoke-virtual {p0}, LRD2;->y()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    instance-of v1, p1, Landroid/widget/ImageView;

    if-eqz v1, :cond_3

    check-cast p1, Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    return v0
.end method

.method public final B(Landroid/graphics/Canvas;)V
    .locals 5

    iget-object v0, p0, LRD2;->t:Leu0;

    iget-object v1, p0, LRD2;->b:LrD2;

    if-eqz v0, :cond_2

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, LRD2;->A:Landroid/graphics/Matrix;

    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v1}, LrD2;->b()Landroid/graphics/Rect;

    move-result-object v4

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v1}, LrD2;->b()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v4, v1

    iget-object v1, p0, LRD2;->A:Landroid/graphics/Matrix;

    invoke-virtual {v1, v3, v4}, Landroid/graphics/Matrix;->preScale(FF)Z

    iget-object v1, p0, LRD2;->A:Landroid/graphics/Matrix;

    iget v3, v2, Landroid/graphics/Rect;->left:I

    int-to-float v3, v3

    iget v2, v2, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    invoke-virtual {v1, v3, v2}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    :cond_1
    iget-object v1, p0, LRD2;->A:Landroid/graphics/Matrix;

    iget v2, p0, LRD2;->u:I

    invoke-virtual {v0, p1, v1, v2}, LqB;->d(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public B0(Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, LRD2;->n:Ljava/lang/String;

    invoke-virtual {p0}, LRD2;->K()Lhw1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lhw1;->c(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public C(Z)V
    .locals 1

    iget-boolean v0, p0, LRD2;->q:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, LRD2;->q:Z

    iget-object p1, p0, LRD2;->b:LrD2;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, LRD2;->v()V

    :cond_1
    return-void
.end method

.method public C0(Lgw1;)V
    .locals 1

    iput-object p1, p0, LRD2;->o:Lgw1;

    iget-object v0, p0, LRD2;->l:Lhw1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lhw1;->d(Lgw1;)V

    :cond_0
    return-void
.end method

.method public D()Z
    .locals 1

    iget-boolean v0, p0, LRD2;->q:Z

    return v0
.end method

.method public D0(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LRD2;->m:Ljava/util/Map;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, LRD2;->m:Ljava/util/Map;

    invoke-virtual {p0}, LRD2;->invalidateSelf()V

    return-void
.end method

.method public E()V
    .locals 1

    iget-object v0, p0, LRD2;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0}, LfE2;->m()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, LRD2$c;->b:LRD2$c;

    iput-object v0, p0, LRD2;->g:LRD2$c;

    :cond_0
    return-void
.end method

.method public E0(I)V
    .locals 2

    iget-object v0, p0, LRD2;->b:LrD2;

    if-nez v0, :cond_0

    iget-object v0, p0, LRD2;->h:Ljava/util/ArrayList;

    new-instance v1, LED2;

    invoke-direct {v1, p0, p1}, LED2;-><init>(LRD2;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget-object v0, p0, LRD2;->c:LfE2;

    int-to-float p1, p1

    invoke-virtual {v0, p1}, LfE2;->I(F)V

    return-void
.end method

.method public final F(II)V
    .locals 3

    iget-object v0, p0, LRD2;->B:Landroid/graphics/Bitmap;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-lt v0, p1, :cond_2

    iget-object v0, p0, LRD2;->B:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-ge v0, p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LRD2;->B:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-gt v0, p1, :cond_1

    iget-object v0, p0, LRD2;->B:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-le v0, p2, :cond_3

    :cond_1
    iget-object v0, p0, LRD2;->B:Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    invoke-static {v0, v2, v2, p1, p2}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, LRD2;->B:Landroid/graphics/Bitmap;

    iget-object p2, p0, LRD2;->C:Landroid/graphics/Canvas;

    invoke-virtual {p2, p1}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    iput-boolean v1, p0, LRD2;->Q:Z

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, LRD2;->B:Landroid/graphics/Bitmap;

    iget-object p2, p0, LRD2;->C:Landroid/graphics/Canvas;

    invoke-virtual {p2, p1}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    iput-boolean v1, p0, LRD2;->Q:Z

    :cond_3
    :goto_1
    return-void
.end method

.method public F0(Z)V
    .locals 0

    iput-boolean p1, p0, LRD2;->e:Z

    return-void
.end method

.method public final G()V
    .locals 1

    iget-object v0, p0, LRD2;->C:Landroid/graphics/Canvas;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0}, Landroid/graphics/Canvas;-><init>()V

    iput-object v0, p0, LRD2;->C:Landroid/graphics/Canvas;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, LRD2;->J:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, LRD2;->K:Landroid/graphics/Matrix;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, LRD2;->P:Landroid/graphics/Matrix;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, LRD2;->D:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, LRD2;->E:Landroid/graphics/RectF;

    new-instance v0, LPl2;

    invoke-direct {v0}, LPl2;-><init>()V

    iput-object v0, p0, LRD2;->F:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, LRD2;->G:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, LRD2;->H:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, LRD2;->I:Landroid/graphics/RectF;

    return-void
.end method

.method public G0(LGW1;)V
    .locals 1

    iget-object v0, p0, LRD2;->j:LHW1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LHW1;->d(LGW1;)V

    :cond_0
    return-void
.end method

.method public H(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1

    invoke-virtual {p0}, LRD2;->M()LHW1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LHW1;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public H0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LRD2;->k:Ljava/lang/String;

    return-void
.end method

.method public I()LrD2;
    .locals 1

    iget-object v0, p0, LRD2;->b:LrD2;

    return-object v0
.end method

.method public I0(Z)V
    .locals 0

    iput-boolean p1, p0, LRD2;->r:Z

    return-void
.end method

.method public final J()Landroid/content/Context;
    .locals 3

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    instance-of v2, v0, Landroid/view/View;

    if-eqz v2, :cond_1

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v1
.end method

.method public J0(I)V
    .locals 2

    iget-object v0, p0, LRD2;->b:LrD2;

    if-nez v0, :cond_0

    iget-object v0, p0, LRD2;->h:Ljava/util/ArrayList;

    new-instance v1, LLD2;

    invoke-direct {v1, p0, p1}, LLD2;-><init>(LRD2;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget-object v0, p0, LRD2;->c:LfE2;

    int-to-float p1, p1

    const v1, 0x3f7d70a4    # 0.99f

    add-float/2addr p1, v1

    invoke-virtual {v0, p1}, LfE2;->J(F)V

    return-void
.end method

.method public final K()Lhw1;
    .locals 3

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, LRD2;->l:Lhw1;

    if-nez v0, :cond_1

    new-instance v0, Lhw1;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v1

    iget-object v2, p0, LRD2;->o:Lgw1;

    invoke-direct {v0, v1, v2}, Lhw1;-><init>(Landroid/graphics/drawable/Drawable$Callback;Lgw1;)V

    iput-object v0, p0, LRD2;->l:Lhw1;

    iget-object v1, p0, LRD2;->n:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Lhw1;->c(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, LRD2;->l:Lhw1;

    return-object v0
.end method

.method public K0(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LRD2;->b:LrD2;

    if-nez v0, :cond_0

    iget-object v0, p0, LRD2;->h:Ljava/util/ArrayList;

    new-instance v1, LND2;

    invoke-direct {v1, p0, p1}, LND2;-><init>(LRD2;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {v0, p1}, LrD2;->l(Ljava/lang/String;)LhM2;

    move-result-object v0

    if-eqz v0, :cond_1

    iget p1, v0, LhM2;->b:F

    iget v0, v0, LhM2;->c:F

    add-float/2addr p1, v0

    float-to-int p1, p1

    invoke-virtual {p0, p1}, LRD2;->J0(I)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot find marker with name "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public L()I
    .locals 1

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0}, LfE2;->o()F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method public L0(F)V
    .locals 3

    iget-object v0, p0, LRD2;->b:LrD2;

    if-nez v0, :cond_0

    iget-object v0, p0, LRD2;->h:Ljava/util/ArrayList;

    new-instance v1, LQD2;

    invoke-direct {v1, p0, p1}, LQD2;-><init>(LRD2;F)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget-object v1, p0, LRD2;->c:LfE2;

    invoke-virtual {v0}, LrD2;->p()F

    move-result v0

    iget-object v2, p0, LRD2;->b:LrD2;

    invoke-virtual {v2}, LrD2;->f()F

    move-result v2

    invoke-static {v0, v2, p1}, LrU2;->i(FFF)F

    move-result p1

    invoke-virtual {v1, p1}, LfE2;->J(F)V

    return-void
.end method

.method public final M()LHW1;
    .locals 5

    iget-object v0, p0, LRD2;->j:LHW1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LRD2;->J()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v2}, LHW1;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object v1, p0, LRD2;->j:LHW1;

    :cond_0
    iget-object v0, p0, LRD2;->j:LHW1;

    if-nez v0, :cond_1

    new-instance v0, LHW1;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v2

    iget-object v3, p0, LRD2;->k:Ljava/lang/String;

    iget-object v4, p0, LRD2;->b:LrD2;

    invoke-virtual {v4}, LrD2;->j()Ljava/util/Map;

    move-result-object v4

    invoke-direct {v0, v2, v3, v1, v4}, LHW1;-><init>(Landroid/graphics/drawable/Drawable$Callback;Ljava/lang/String;LGW1;Ljava/util/Map;)V

    iput-object v0, p0, LRD2;->j:LHW1;

    :cond_1
    iget-object v0, p0, LRD2;->j:LHW1;

    return-object v0
.end method

.method public M0(II)V
    .locals 2

    iget-object v0, p0, LRD2;->b:LrD2;

    if-nez v0, :cond_0

    iget-object v0, p0, LRD2;->h:Ljava/util/ArrayList;

    new-instance v1, LFD2;

    invoke-direct {v1, p0, p1, p2}, LFD2;-><init>(LRD2;II)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget-object v0, p0, LRD2;->c:LfE2;

    int-to-float p1, p1

    int-to-float p2, p2

    const v1, 0x3f7d70a4    # 0.99f

    add-float/2addr p2, v1

    invoke-virtual {v0, p1, p2}, LfE2;->M(FF)V

    return-void
.end method

.method public N()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LRD2;->k:Ljava/lang/String;

    return-object v0
.end method

.method public N0(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LRD2;->b:LrD2;

    if-nez v0, :cond_0

    iget-object v0, p0, LRD2;->h:Ljava/util/ArrayList;

    new-instance v1, LGD2;

    invoke-direct {v1, p0, p1}, LGD2;-><init>(LRD2;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {v0, p1}, LrD2;->l(Ljava/lang/String;)LhM2;

    move-result-object v0

    if-eqz v0, :cond_1

    iget p1, v0, LhM2;->b:F

    float-to-int p1, p1

    iget v0, v0, LhM2;->c:F

    float-to-int v0, v0

    add-int/2addr v0, p1

    invoke-virtual {p0, p1, v0}, LRD2;->M0(II)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot find marker with name "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public O(Ljava/lang/String;)LUD2;
    .locals 1

    iget-object v0, p0, LRD2;->b:LrD2;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v0}, LrD2;->j()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LUD2;

    return-object p1
.end method

.method public O0(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    iget-object v0, p0, LRD2;->b:LrD2;

    if-nez v0, :cond_0

    iget-object v0, p0, LRD2;->h:Ljava/util/ArrayList;

    new-instance v1, LOD2;

    invoke-direct {v1, p0, p1, p2, p3}, LOD2;-><init>(LRD2;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {v0, p1}, LrD2;->l(Ljava/lang/String;)LhM2;

    move-result-object v0

    const-string v1, "."

    const-string v2, "Cannot find marker with name "

    if-eqz v0, :cond_3

    iget p1, v0, LhM2;->b:F

    float-to-int p1, p1

    iget-object v0, p0, LRD2;->b:LrD2;

    invoke-virtual {v0, p2}, LrD2;->l(Ljava/lang/String;)LhM2;

    move-result-object v0

    if-eqz v0, :cond_2

    iget p2, v0, LhM2;->b:F

    if-eqz p3, :cond_1

    const/high16 p3, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_1
    const/4 p3, 0x0

    :goto_0
    add-float/2addr p2, p3

    float-to-int p2, p2

    invoke-virtual {p0, p1, p2}, LRD2;->M0(II)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public P()Z
    .locals 1

    iget-boolean v0, p0, LRD2;->r:Z

    return v0
.end method

.method public P0(FF)V
    .locals 2

    iget-object v0, p0, LRD2;->b:LrD2;

    if-nez v0, :cond_0

    iget-object v0, p0, LRD2;->h:Ljava/util/ArrayList;

    new-instance v1, LID2;

    invoke-direct {v1, p0, p1, p2}, LID2;-><init>(LRD2;FF)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {v0}, LrD2;->p()F

    move-result v0

    iget-object v1, p0, LRD2;->b:LrD2;

    invoke-virtual {v1}, LrD2;->f()F

    move-result v1

    invoke-static {v0, v1, p1}, LrU2;->i(FFF)F

    move-result p1

    float-to-int p1, p1

    iget-object v0, p0, LRD2;->b:LrD2;

    invoke-virtual {v0}, LrD2;->p()F

    move-result v0

    iget-object v1, p0, LRD2;->b:LrD2;

    invoke-virtual {v1}, LrD2;->f()F

    move-result v1

    invoke-static {v0, v1, p2}, LrU2;->i(FFF)F

    move-result p2

    float-to-int p2, p2

    invoke-virtual {p0, p1, p2}, LRD2;->M0(II)V

    return-void
.end method

.method public Q()F
    .locals 1

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0}, LfE2;->q()F

    move-result v0

    return v0
.end method

.method public Q0(I)V
    .locals 2

    iget-object v0, p0, LRD2;->b:LrD2;

    if-nez v0, :cond_0

    iget-object v0, p0, LRD2;->h:Ljava/util/ArrayList;

    new-instance v1, LJD2;

    invoke-direct {v1, p0, p1}, LJD2;-><init>(LRD2;I)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0, p1}, LfE2;->N(I)V

    return-void
.end method

.method public R()F
    .locals 1

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0}, LfE2;->r()F

    move-result v0

    return v0
.end method

.method public R0(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LRD2;->b:LrD2;

    if-nez v0, :cond_0

    iget-object v0, p0, LRD2;->h:Ljava/util/ArrayList;

    new-instance v1, LPD2;

    invoke-direct {v1, p0, p1}, LPD2;-><init>(LRD2;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {v0, p1}, LrD2;->l(Ljava/lang/String;)LhM2;

    move-result-object v0

    if-eqz v0, :cond_1

    iget p1, v0, LhM2;->b:F

    float-to-int p1, p1

    invoke-virtual {p0, p1}, LRD2;->Q0(I)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot find marker with name "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public S()F
    .locals 1

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0}, LfE2;->n()F

    move-result v0

    return v0
.end method

.method public S0(F)V
    .locals 2

    iget-object v0, p0, LRD2;->b:LrD2;

    if-nez v0, :cond_0

    iget-object v0, p0, LRD2;->h:Ljava/util/ArrayList;

    new-instance v1, LKD2;

    invoke-direct {v1, p0, p1}, LKD2;-><init>(LRD2;F)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {v0}, LrD2;->p()F

    move-result v0

    iget-object v1, p0, LRD2;->b:LrD2;

    invoke-virtual {v1}, LrD2;->f()F

    move-result v1

    invoke-static {v0, v1, p1}, LrU2;->i(FFF)F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {p0, p1}, LRD2;->Q0(I)V

    return-void
.end method

.method public T()Lqw4;
    .locals 1

    iget-boolean v0, p0, LRD2;->z:Z

    if-eqz v0, :cond_0

    sget-object v0, Lqw4;->d:Lqw4;

    goto :goto_0

    :cond_0
    sget-object v0, Lqw4;->c:Lqw4;

    :goto_0
    return-object v0
.end method

.method public T0(Z)V
    .locals 1

    iget-boolean v0, p0, LRD2;->w:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, LRD2;->w:Z

    iget-object v0, p0, LRD2;->t:Leu0;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Leu0;->J(Z)V

    :cond_1
    return-void
.end method

.method public U()I
    .locals 1

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getRepeatCount()I

    move-result v0

    return v0
.end method

.method public U0(Z)V
    .locals 1

    iput-boolean p1, p0, LRD2;->v:Z

    iget-object v0, p0, LRD2;->b:LrD2;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LrD2;->v(Z)V

    :cond_0
    return-void
.end method

.method public V()I
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getRepeatMode()I

    move-result v0

    return v0
.end method

.method public V0(F)V
    .locals 3

    iget-object v0, p0, LRD2;->b:LrD2;

    if-nez v0, :cond_0

    iget-object v0, p0, LRD2;->h:Ljava/util/ArrayList;

    new-instance v1, LCD2;

    invoke-direct {v1, p0, p1}, LCD2;-><init>(LRD2;F)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    const-string v0, "Drawable#setProgress"

    invoke-static {v0}, LDl2;->a(Ljava/lang/String;)V

    iget-object v1, p0, LRD2;->c:LfE2;

    iget-object v2, p0, LRD2;->b:LrD2;

    invoke-virtual {v2, p1}, LrD2;->h(F)F

    move-result p1

    invoke-virtual {v1, p1}, LfE2;->I(F)V

    invoke-static {v0}, LDl2;->b(Ljava/lang/String;)F

    return-void
.end method

.method public W()F
    .locals 1

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0}, LfE2;->t()F

    move-result v0

    return v0
.end method

.method public W0(Lqw4;)V
    .locals 0

    iput-object p1, p0, LRD2;->y:Lqw4;

    invoke-virtual {p0}, LRD2;->y()V

    return-void
.end method

.method public X()LU06;
    .locals 1

    iget-object v0, p0, LRD2;->p:LU06;

    return-object v0
.end method

.method public X0(I)V
    .locals 1

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    return-void
.end method

.method public Y(Lfw1;)Landroid/graphics/Typeface;
    .locals 3

    iget-object v0, p0, LRD2;->m:Ljava/util/Map;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lfw1;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Typeface;

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lfw1;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Typeface;

    return-object p1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lfw1;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lfw1;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Typeface;

    return-object p1

    :cond_2
    invoke-virtual {p0}, LRD2;->K()Lhw1;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Lhw1;->b(Lfw1;)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public Y0(I)V
    .locals 1

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0, p1}, LfE2;->setRepeatMode(I)V

    return-void
.end method

.method public final Z()Z
    .locals 3

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getClipChildren()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0

    :cond_1
    return v2
.end method

.method public Z0(Z)V
    .locals 0

    iput-boolean p1, p0, LRD2;->f:Z

    return-void
.end method

.method public a0()Z
    .locals 1

    iget-object v0, p0, LRD2;->c:LfE2;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, LfE2;->isRunning()Z

    move-result v0

    return v0
.end method

.method public a1(F)V
    .locals 1

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0, p1}, LfE2;->O(F)V

    return-void
.end method

.method public b0()Z
    .locals 2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0}, LfE2;->isRunning()Z

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, LRD2;->g:LRD2$c;

    sget-object v1, LRD2$c;->c:LRD2$c;

    if-eq v0, v1, :cond_2

    sget-object v1, LRD2$c;->d:LRD2$c;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public b1(Ljava/lang/Boolean;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, LRD2;->d:Z

    return-void
.end method

.method public c0()Z
    .locals 1

    iget-boolean v0, p0, LRD2;->x:Z

    return v0
.end method

.method public c1(LU06;)V
    .locals 0

    iput-object p1, p0, LRD2;->p:LU06;

    return-void
.end method

.method public d1(Z)V
    .locals 1

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0, p1}, LfE2;->P(Z)V

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 2

    const-string v0, "Drawable#draw"

    invoke-static {v0}, LDl2;->a(Ljava/lang/String;)V

    iget-boolean v1, p0, LRD2;->f:Z

    if-eqz v1, :cond_1

    :try_start_0
    iget-boolean v1, p0, LRD2;->z:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, LRD2;->t:Leu0;

    invoke-virtual {p0, p1, v1}, LRD2;->u0(Landroid/graphics/Canvas;Leu0;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LRD2;->B(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    const-string v1, "Lottie crashed in draw!"

    invoke-static {v1, p1}, LDx2;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    iget-boolean v1, p0, LRD2;->z:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, LRD2;->t:Leu0;

    invoke-virtual {p0, p1, v1}, LRD2;->u0(Landroid/graphics/Canvas;Leu0;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, LRD2;->B(Landroid/graphics/Canvas;)V

    :goto_0
    const/4 p1, 0x0

    iput-boolean p1, p0, LRD2;->Q:Z

    invoke-static {v0}, LDl2;->b(Ljava/lang/String;)F

    return-void
.end method

.method public e1()Z
    .locals 1

    iget-object v0, p0, LRD2;->m:Ljava/util/Map;

    if-nez v0, :cond_0

    iget-object v0, p0, LRD2;->p:LU06;

    if-nez v0, :cond_0

    iget-object v0, p0, LRD2;->b:LrD2;

    invoke-virtual {v0}, LrD2;->c()LLN5;

    move-result-object v0

    invoke-virtual {v0}, LLN5;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getAlpha()I
    .locals 1

    iget v0, p0, LRD2;->u:I

    return v0
.end method

.method public getIntrinsicHeight()I
    .locals 1

    iget-object v0, p0, LRD2;->b:LrD2;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LrD2;->b()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    :goto_0
    return v0
.end method

.method public getIntrinsicWidth()I
    .locals 1

    iget-object v0, p0, LRD2;->b:LrD2;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LrD2;->b()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    :goto_0
    return v0
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1, p0}, Landroid/graphics/drawable/Drawable$Callback;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public invalidateSelf()V
    .locals 1

    iget-boolean v0, p0, LRD2;->Q:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LRD2;->Q:Z

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Landroid/graphics/drawable/Drawable$Callback;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-void
.end method

.method public isRunning()Z
    .locals 1

    invoke-virtual {p0}, LRD2;->a0()Z

    move-result v0

    return v0
.end method

.method public r(Landroid/animation/Animator$AnimatorListener;)V
    .locals 1

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0, p1}, LtB;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method

.method public s(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
    .locals 1

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0, p1}, LtB;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-void
.end method

.method public s0()V
    .locals 1

    iget-object v0, p0, LRD2;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0}, LfE2;->y()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, LRD2$c;->b:LRD2$c;

    iput-object v0, p0, LRD2;->g:LRD2$c;

    :cond_0
    return-void
.end method

.method public scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1, p0, p2, p3, p4}, Landroid/graphics/drawable/Drawable$Callback;->scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V

    return-void
.end method

.method public setAlpha(I)V
    .locals 0

    iput p1, p0, LRD2;->u:I

    invoke-virtual {p0}, LRD2;->invalidateSelf()V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    const-string p1, "Use addColorFilter instead."

    invoke-static {p1}, LDx2;->c(Ljava/lang/String;)V

    return-void
.end method

.method public setVisible(ZZ)Z
    .locals 1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p2

    if-eqz p1, :cond_1

    iget-object p1, p0, LRD2;->g:LRD2$c;

    sget-object v0, LRD2$c;->c:LRD2$c;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, LRD2;->t0()V

    goto :goto_0

    :cond_0
    sget-object v0, LRD2$c;->d:LRD2$c;

    if-ne p1, v0, :cond_3

    invoke-virtual {p0}, LRD2;->w0()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, LRD2;->c:LfE2;

    invoke-virtual {p1}, LfE2;->isRunning()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, LRD2;->s0()V

    sget-object p1, LRD2$c;->d:LRD2$c;

    iput-object p1, p0, LRD2;->g:LRD2$c;

    goto :goto_0

    :cond_2
    if-nez v0, :cond_3

    sget-object p1, LRD2$c;->b:LRD2$c;

    iput-object p1, p0, LRD2;->g:LRD2$c;

    :cond_3
    :goto_0
    return p2
.end method

.method public start()V
    .locals 2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LRD2;->t0()V

    return-void
.end method

.method public stop()V
    .locals 0

    invoke-virtual {p0}, LRD2;->E()V

    return-void
.end method

.method public t(LBk2;Ljava/lang/Object;LgE2;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LBk2;",
            "TT;",
            "LgE2<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, LRD2;->t:Leu0;

    if-nez v0, :cond_0

    iget-object v0, p0, LRD2;->h:Ljava/util/ArrayList;

    new-instance v1, LHD2;

    invoke-direct {v1, p0, p1, p2, p3}, LHD2;-><init>(LRD2;LBk2;Ljava/lang/Object;LgE2;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    sget-object v1, LBk2;->c:LBk2;

    const/4 v2, 0x1

    if-ne p1, v1, :cond_1

    invoke-virtual {v0, p2, p3}, Leu0;->h(Ljava/lang/Object;LgE2;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, LBk2;->d()LCk2;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LBk2;->d()LCk2;

    move-result-object p1

    invoke-interface {p1, p2, p3}, LCk2;->h(Ljava/lang/Object;LgE2;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1}, LRD2;->v0(LBk2;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBk2;

    invoke-virtual {v1}, LBk2;->d()LCk2;

    move-result-object v1

    invoke-interface {v1, p2, p3}, LCk2;->h(Ljava/lang/Object;LgE2;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    xor-int/2addr v2, p1

    :goto_1
    if-eqz v2, :cond_4

    invoke-virtual {p0}, LRD2;->invalidateSelf()V

    sget-object p1, LaE2;->E:Ljava/lang/Float;

    if-ne p2, p1, :cond_4

    invoke-virtual {p0}, LRD2;->S()F

    move-result p1

    invoke-virtual {p0, p1}, LRD2;->V0(F)V

    :cond_4
    return-void
.end method

.method public t0()V
    .locals 2

    iget-object v0, p0, LRD2;->t:Leu0;

    if-nez v0, :cond_0

    iget-object v0, p0, LRD2;->h:Ljava/util/ArrayList;

    new-instance v1, LDD2;

    invoke-direct {v1, p0}, LDD2;-><init>(LRD2;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {p0}, LRD2;->y()V

    invoke-virtual {p0}, LRD2;->u()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LRD2;->U()I

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0}, LfE2;->z()V

    sget-object v0, LRD2$c;->b:LRD2$c;

    iput-object v0, p0, LRD2;->g:LRD2$c;

    goto :goto_0

    :cond_2
    sget-object v0, LRD2$c;->c:LRD2$c;

    iput-object v0, p0, LRD2;->g:LRD2$c;

    :cond_3
    :goto_0
    invoke-virtual {p0}, LRD2;->u()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, LRD2;->W()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    invoke-virtual {p0}, LRD2;->R()F

    move-result v0

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, LRD2;->Q()F

    move-result v0

    :goto_1
    float-to-int v0, v0

    invoke-virtual {p0, v0}, LRD2;->E0(I)V

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0}, LfE2;->m()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, LRD2$c;->b:LRD2$c;

    iput-object v0, p0, LRD2;->g:LRD2$c;

    :cond_5
    return-void
.end method

.method public final u()Z
    .locals 1

    iget-boolean v0, p0, LRD2;->d:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, LRD2;->e:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final u0(Landroid/graphics/Canvas;Leu0;)V
    .locals 8

    iget-object v0, p0, LRD2;->b:LrD2;

    if-eqz v0, :cond_5

    if-nez p2, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p0}, LRD2;->G()V

    iget-object v0, p0, LRD2;->K:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getMatrix(Landroid/graphics/Matrix;)V

    iget-object v0, p0, LRD2;->D:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    iget-object v0, p0, LRD2;->D:Landroid/graphics/Rect;

    iget-object v1, p0, LRD2;->E:Landroid/graphics/RectF;

    invoke-virtual {p0, v0, v1}, LRD2;->z(Landroid/graphics/Rect;Landroid/graphics/RectF;)V

    iget-object v0, p0, LRD2;->K:Landroid/graphics/Matrix;

    iget-object v1, p0, LRD2;->E:Landroid/graphics/RectF;

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget-object v0, p0, LRD2;->E:Landroid/graphics/RectF;

    iget-object v1, p0, LRD2;->D:Landroid/graphics/Rect;

    invoke-virtual {p0, v0, v1}, LRD2;->A(Landroid/graphics/RectF;Landroid/graphics/Rect;)V

    iget-boolean v0, p0, LRD2;->s:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, LRD2;->J:Landroid/graphics/RectF;

    invoke-virtual {p0}, LRD2;->getIntrinsicWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p0}, LRD2;->getIntrinsicHeight()I

    move-result v3

    int-to-float v3, v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v4, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LRD2;->J:Landroid/graphics/RectF;

    const/4 v2, 0x0

    invoke-virtual {p2, v0, v2, v1}, Leu0;->a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    :goto_0
    iget-object v0, p0, LRD2;->K:Landroid/graphics/Matrix;

    iget-object v2, p0, LRD2;->J:Landroid/graphics/RectF;

    invoke-virtual {v0, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p0}, LRD2;->getIntrinsicWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, LRD2;->getIntrinsicHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v0, v3

    iget-object v3, p0, LRD2;->J:Landroid/graphics/RectF;

    invoke-virtual {p0, v3, v2, v0}, LRD2;->x0(Landroid/graphics/RectF;FF)V

    invoke-virtual {p0}, LRD2;->Z()Z

    move-result v3

    if-nez v3, :cond_2

    iget-object v3, p0, LRD2;->J:Landroid/graphics/RectF;

    iget-object v4, p0, LRD2;->D:Landroid/graphics/Rect;

    iget v5, v4, Landroid/graphics/Rect;->left:I

    int-to-float v5, v5

    iget v6, v4, Landroid/graphics/Rect;->top:I

    int-to-float v6, v6

    iget v7, v4, Landroid/graphics/Rect;->right:I

    int-to-float v7, v7

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    int-to-float v4, v4

    invoke-virtual {v3, v5, v6, v7, v4}, Landroid/graphics/RectF;->intersect(FFFF)Z

    :cond_2
    iget-object v3, p0, LRD2;->J:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v3, v3

    iget-object v4, p0, LRD2;->J:Landroid/graphics/RectF;

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v4

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v4, v4

    if-eqz v3, :cond_5

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p0, v3, v4}, LRD2;->F(II)V

    iget-boolean v5, p0, LRD2;->Q:Z

    if-eqz v5, :cond_4

    iget-object v5, p0, LRD2;->A:Landroid/graphics/Matrix;

    iget-object v6, p0, LRD2;->K:Landroid/graphics/Matrix;

    invoke-virtual {v5, v6}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v5, p0, LRD2;->A:Landroid/graphics/Matrix;

    invoke-virtual {v5, v2, v0}, Landroid/graphics/Matrix;->preScale(FF)Z

    iget-object v0, p0, LRD2;->A:Landroid/graphics/Matrix;

    iget-object v2, p0, LRD2;->J:Landroid/graphics/RectF;

    iget v5, v2, Landroid/graphics/RectF;->left:F

    neg-float v5, v5

    iget v2, v2, Landroid/graphics/RectF;->top:F

    neg-float v2, v2

    invoke-virtual {v0, v5, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    iget-object v0, p0, LRD2;->B:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->eraseColor(I)V

    iget-object v0, p0, LRD2;->C:Landroid/graphics/Canvas;

    iget-object v2, p0, LRD2;->A:Landroid/graphics/Matrix;

    iget v5, p0, LRD2;->u:I

    invoke-virtual {p2, v0, v2, v5}, LqB;->d(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V

    iget-object p2, p0, LRD2;->K:Landroid/graphics/Matrix;

    iget-object v0, p0, LRD2;->P:Landroid/graphics/Matrix;

    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    iget-object p2, p0, LRD2;->P:Landroid/graphics/Matrix;

    iget-object v0, p0, LRD2;->I:Landroid/graphics/RectF;

    iget-object v2, p0, LRD2;->J:Landroid/graphics/RectF;

    invoke-virtual {p2, v0, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    iget-object p2, p0, LRD2;->I:Landroid/graphics/RectF;

    iget-object v0, p0, LRD2;->H:Landroid/graphics/Rect;

    invoke-virtual {p0, p2, v0}, LRD2;->A(Landroid/graphics/RectF;Landroid/graphics/Rect;)V

    :cond_4
    iget-object p2, p0, LRD2;->G:Landroid/graphics/Rect;

    invoke-virtual {p2, v1, v1, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object p2, p0, LRD2;->B:Landroid/graphics/Bitmap;

    iget-object v0, p0, LRD2;->G:Landroid/graphics/Rect;

    iget-object v1, p0, LRD2;->H:Landroid/graphics/Rect;

    iget-object v2, p0, LRD2;->F:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :cond_5
    :goto_1
    return-void
.end method

.method public unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1, p0, p2}, Landroid/graphics/drawable/Drawable$Callback;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final v()V
    .locals 4

    iget-object v0, p0, LRD2;->b:LrD2;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Leu0;

    invoke-static {v0}, Lim2;->b(LrD2;)Lfm2;

    move-result-object v2

    invoke-virtual {v0}, LrD2;->k()Ljava/util/List;

    move-result-object v3

    invoke-direct {v1, p0, v2, v3, v0}, Leu0;-><init>(LRD2;Lfm2;Ljava/util/List;LrD2;)V

    iput-object v1, p0, LRD2;->t:Leu0;

    iget-boolean v0, p0, LRD2;->w:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Leu0;->J(Z)V

    :cond_1
    iget-object v0, p0, LRD2;->t:Leu0;

    iget-boolean v1, p0, LRD2;->s:Z

    invoke-virtual {v0, v1}, Leu0;->O(Z)V

    return-void
.end method

.method public v0(LBk2;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBk2;",
            ")",
            "Ljava/util/List<",
            "LBk2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LRD2;->t:Leu0;

    if-nez v0, :cond_0

    const-string p1, "Cannot resolve KeyPath. Composition is not set yet."

    invoke-static {p1}, LDx2;->c(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LRD2;->t:Leu0;

    new-instance v2, LBk2;

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/String;

    invoke-direct {v2, v4}, LBk2;-><init>([Ljava/lang/String;)V

    invoke-virtual {v1, p1, v3, v0, v2}, LqB;->c(LBk2;ILjava/util/List;LBk2;)V

    return-object v0
.end method

.method public w()V
    .locals 1

    iget-object v0, p0, LRD2;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0}, LfE2;->cancel()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, LRD2$c;->b:LRD2$c;

    iput-object v0, p0, LRD2;->g:LRD2$c;

    :cond_0
    return-void
.end method

.method public w0()V
    .locals 2

    iget-object v0, p0, LRD2;->t:Leu0;

    if-nez v0, :cond_0

    iget-object v0, p0, LRD2;->h:Ljava/util/ArrayList;

    new-instance v1, LMD2;

    invoke-direct {v1, p0}, LMD2;-><init>(LRD2;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    invoke-virtual {p0}, LRD2;->y()V

    invoke-virtual {p0}, LRD2;->u()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LRD2;->U()I

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0}, LfE2;->D()V

    sget-object v0, LRD2$c;->b:LRD2$c;

    iput-object v0, p0, LRD2;->g:LRD2$c;

    goto :goto_0

    :cond_2
    sget-object v0, LRD2$c;->d:LRD2$c;

    iput-object v0, p0, LRD2;->g:LRD2$c;

    :cond_3
    :goto_0
    invoke-virtual {p0}, LRD2;->u()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, LRD2;->W()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_4

    invoke-virtual {p0}, LRD2;->R()F

    move-result v0

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, LRD2;->Q()F

    move-result v0

    :goto_1
    float-to-int v0, v0

    invoke-virtual {p0, v0}, LRD2;->E0(I)V

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0}, LfE2;->m()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, LRD2$c;->b:LRD2$c;

    iput-object v0, p0, LRD2;->g:LRD2$c;

    :cond_5
    return-void
.end method

.method public x()V
    .locals 1

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0}, LfE2;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0}, LfE2;->cancel()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, LRD2$c;->b:LRD2$c;

    iput-object v0, p0, LRD2;->g:LRD2$c;

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LRD2;->b:LrD2;

    iput-object v0, p0, LRD2;->t:Leu0;

    iput-object v0, p0, LRD2;->j:LHW1;

    iget-object v0, p0, LRD2;->c:LfE2;

    invoke-virtual {v0}, LfE2;->l()V

    invoke-virtual {p0}, LRD2;->invalidateSelf()V

    return-void
.end method

.method public final x0(Landroid/graphics/RectF;FF)V
    .locals 3

    iget v0, p1, Landroid/graphics/RectF;->left:F

    mul-float/2addr v0, p2

    iget v1, p1, Landroid/graphics/RectF;->top:F

    mul-float/2addr v1, p3

    iget v2, p1, Landroid/graphics/RectF;->right:F

    mul-float/2addr v2, p2

    iget p2, p1, Landroid/graphics/RectF;->bottom:F

    mul-float/2addr p2, p3

    invoke-virtual {p1, v0, v1, v2, p2}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

.method public final y()V
    .locals 4

    iget-object v0, p0, LRD2;->b:LrD2;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, LRD2;->y:Lqw4;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v0}, LrD2;->q()Z

    move-result v3

    invoke-virtual {v0}, LrD2;->m()I

    move-result v0

    invoke-virtual {v1, v2, v3, v0}, Lqw4;->b(IZI)Z

    move-result v0

    iput-boolean v0, p0, LRD2;->z:Z

    return-void
.end method

.method public y0(Z)V
    .locals 0

    iput-boolean p1, p0, LRD2;->x:Z

    return-void
.end method

.method public final z(Landroid/graphics/Rect;Landroid/graphics/RectF;)V
    .locals 3

    iget v0, p1, Landroid/graphics/Rect;->left:I

    int-to-float v0, v0

    iget v1, p1, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    iget v2, p1, Landroid/graphics/Rect;->right:I

    int-to-float v2, v2

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float p1, p1

    invoke-virtual {p2, v0, v1, v2, p1}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

.method public z0(Z)V
    .locals 1

    iget-boolean v0, p0, LRD2;->s:Z

    if-eq p1, v0, :cond_1

    iput-boolean p1, p0, LRD2;->s:Z

    iget-object v0, p0, LRD2;->t:Leu0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Leu0;->O(Z)V

    :cond_0
    invoke-virtual {p0}, LRD2;->invalidateSelf()V

    :cond_1
    return-void
.end method
