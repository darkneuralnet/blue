.class public LPM2;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements LCy5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LPM2$c;
    }
.end annotation


# static fields
.field public static final y:Ljava/lang/String; = "PM2"

.field public static final z:Landroid/graphics/Paint;


# instance fields
.field public b:LPM2$c;

.field public final c:[Lvy5$g;

.field public final d:[Lvy5$g;

.field public final e:Ljava/util/BitSet;

.field public f:Z

.field public final g:Landroid/graphics/Matrix;

.field public final h:Landroid/graphics/Path;

.field public final i:Landroid/graphics/Path;

.field public final j:Landroid/graphics/RectF;

.field public final k:Landroid/graphics/RectF;

.field public final l:Landroid/graphics/Region;

.field public final m:Landroid/graphics/Region;

.field public n:Liy5;

.field public final o:Landroid/graphics/Paint;

.field public final p:Landroid/graphics/Paint;

.field public final q:LSx5;

.field public final r:Ljy5$b;

.field public final s:Ljy5;

.field public t:Landroid/graphics/PorterDuffColorFilter;

.field public u:Landroid/graphics/PorterDuffColorFilter;

.field public v:I

.field public final w:Landroid/graphics/RectF;

.field public x:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    sput-object v0, LPM2;->z:Landroid/graphics/Paint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Liy5;

    invoke-direct {v0}, Liy5;-><init>()V

    invoke-direct {p0, v0}, LPM2;-><init>(Liy5;)V

    return-void
.end method

.method public constructor <init>(LPM2$c;)V
    .locals 5

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/4 v0, 0x4

    new-array v1, v0, [Lvy5$g;

    iput-object v1, p0, LPM2;->c:[Lvy5$g;

    new-array v0, v0, [Lvy5$g;

    iput-object v0, p0, LPM2;->d:[Lvy5$g;

    new-instance v0, Ljava/util/BitSet;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ljava/util/BitSet;-><init>(I)V

    iput-object v0, p0, LPM2;->e:Ljava/util/BitSet;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, LPM2;->g:Landroid/graphics/Matrix;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, LPM2;->h:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, LPM2;->i:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, LPM2;->j:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, LPM2;->k:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0}, Landroid/graphics/Region;-><init>()V

    iput-object v0, p0, LPM2;->l:Landroid/graphics/Region;

    new-instance v0, Landroid/graphics/Region;

    invoke-direct {v0}, Landroid/graphics/Region;-><init>()V

    iput-object v0, p0, LPM2;->m:Landroid/graphics/Region;

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, LPM2;->o:Landroid/graphics/Paint;

    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v2, p0, LPM2;->p:Landroid/graphics/Paint;

    new-instance v3, LSx5;

    invoke-direct {v3}, LSx5;-><init>()V

    iput-object v3, p0, LPM2;->q:LSx5;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-virtual {v3}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    if-ne v3, v4, :cond_0

    invoke-static {}, Ljy5;->k()Ljy5;

    move-result-object v3

    goto :goto_0

    :cond_0
    new-instance v3, Ljy5;

    invoke-direct {v3}, Ljy5;-><init>()V

    :goto_0
    iput-object v3, p0, LPM2;->s:Ljy5;

    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    iput-object v3, p0, LPM2;->w:Landroid/graphics/RectF;

    iput-boolean v1, p0, LPM2;->x:Z

    iput-object p1, p0, LPM2;->b:LPM2$c;

    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {p0}, LPM2;->n0()Z

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, LPM2;->m0([I)Z

    new-instance p1, LPM2$a;

    invoke-direct {p1, p0}, LPM2$a;-><init>(LPM2;)V

    iput-object p1, p0, LPM2;->r:Ljy5$b;

    return-void
.end method

.method public synthetic constructor <init>(LPM2$c;LPM2$a;)V
    .locals 0

    invoke-direct {p0, p1}, LPM2;-><init>(LPM2$c;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    invoke-static {p1, p2, p3, p4}, Liy5;->e(Landroid/content/Context;Landroid/util/AttributeSet;II)Liy5$b;

    move-result-object p1

    invoke-virtual {p1}, Liy5$b;->m()Liy5;

    move-result-object p1

    invoke-direct {p0, p1}, LPM2;-><init>(Liy5;)V

    return-void
.end method

.method public constructor <init>(Liy5;)V
    .locals 2

    new-instance v0, LPM2$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LPM2$c;-><init>(Liy5;Loa1;)V

    invoke-direct {p0, v0}, LPM2;-><init>(LPM2$c;)V

    return-void
.end method

.method public static U(II)I
    .locals 1

    ushr-int/lit8 v0, p1, 0x7

    add-int/2addr p1, v0

    mul-int/2addr p0, p1

    ushr-int/lit8 p0, p0, 0x8

    return p0
.end method

.method public static synthetic b(LPM2;)Ljava/util/BitSet;
    .locals 0

    iget-object p0, p0, LPM2;->e:Ljava/util/BitSet;

    return-object p0
.end method

.method public static synthetic c(LPM2;)[Lvy5$g;
    .locals 0

    iget-object p0, p0, LPM2;->c:[Lvy5$g;

    return-object p0
.end method

.method public static synthetic d(LPM2;)[Lvy5$g;
    .locals 0

    iget-object p0, p0, LPM2;->d:[Lvy5$g;

    return-object p0
.end method

.method public static synthetic e(LPM2;Z)Z
    .locals 0

    iput-boolean p1, p0, LPM2;->f:Z

    return p1
.end method

.method public static m(Landroid/content/Context;F)LPM2;
    .locals 2

    sget v0, Luf4;->colorSurface:I

    const-class v1, LPM2;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, LHM2;->c(Landroid/content/Context;ILjava/lang/String;)I

    move-result v0

    new-instance v1, LPM2;

    invoke-direct {v1}, LPM2;-><init>()V

    invoke-virtual {v1, p0}, LPM2;->P(Landroid/content/Context;)V

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p0

    invoke-virtual {v1, p0}, LPM2;->a0(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v1, p1}, LPM2;->Z(F)V

    return-object v1
.end method


# virtual methods
.method public A()I
    .locals 1

    iget v0, p0, LPM2;->v:I

    return v0
.end method

.method public B()I
    .locals 5

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget v1, v0, LPM2$c;->s:I

    int-to-double v1, v1

    iget v0, v0, LPM2$c;->t:I

    int-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    mul-double/2addr v1, v3

    double-to-int v0, v1

    return v0
.end method

.method public C()I
    .locals 5

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget v1, v0, LPM2$c;->s:I

    int-to-double v1, v1

    iget v0, v0, LPM2$c;->t:I

    int-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    mul-double/2addr v1, v3

    double-to-int v0, v1

    return v0
.end method

.method public D()I
    .locals 1

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget v0, v0, LPM2$c;->r:I

    return v0
.end method

.method public E()Liy5;
    .locals 1

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v0, v0, LPM2$c;->a:Liy5;

    return-object v0
.end method

.method public F()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v0, v0, LPM2$c;->e:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public final G()F
    .locals 2

    invoke-virtual {p0}, LPM2;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LPM2;->p:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public H()F
    .locals 1

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget v0, v0, LPM2$c;->l:F

    return v0
.end method

.method public I()F
    .locals 2

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v0, v0, LPM2$c;->a:Liy5;

    invoke-virtual {v0}, Liy5;->r()LNC0;

    move-result-object v0

    invoke-virtual {p0}, LPM2;->u()Landroid/graphics/RectF;

    move-result-object v1

    invoke-interface {v0, v1}, LNC0;->a(Landroid/graphics/RectF;)F

    move-result v0

    return v0
.end method

.method public J()F
    .locals 2

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v0, v0, LPM2$c;->a:Liy5;

    invoke-virtual {v0}, Liy5;->t()LNC0;

    move-result-object v0

    invoke-virtual {p0}, LPM2;->u()Landroid/graphics/RectF;

    move-result-object v1

    invoke-interface {v0, v1}, LNC0;->a(Landroid/graphics/RectF;)F

    move-result v0

    return v0
.end method

.method public K()F
    .locals 1

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget v0, v0, LPM2$c;->p:F

    return v0
.end method

.method public L()F
    .locals 2

    invoke-virtual {p0}, LPM2;->w()F

    move-result v0

    invoke-virtual {p0}, LPM2;->K()F

    move-result v1

    add-float/2addr v0, v1

    return v0
.end method

.method public final M()Z
    .locals 3

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget v1, v0, LPM2$c;->q:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    iget v0, v0, LPM2$c;->r:I

    if-lez v0, :cond_0

    const/4 v0, 0x2

    if-eq v1, v0, :cond_1

    invoke-virtual {p0}, LPM2;->W()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    return v2
.end method

.method public final N()Z
    .locals 2

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v0, v0, LPM2$c;->v:Landroid/graphics/Paint$Style;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    if-eq v0, v1, :cond_1

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    if-ne v0, v1, :cond_0

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

.method public final O()Z
    .locals 2

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v0, v0, LPM2$c;->v:Landroid/graphics/Paint$Style;

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    if-eq v0, v1, :cond_0

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    if-ne v0, v1, :cond_1

    :cond_0
    iget-object v0, p0, LPM2;->p:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public P(Landroid/content/Context;)V
    .locals 2

    iget-object v0, p0, LPM2;->b:LPM2$c;

    new-instance v1, Loa1;

    invoke-direct {v1, p1}, Loa1;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, LPM2$c;->b:Loa1;

    invoke-virtual {p0}, LPM2;->o0()V

    return-void
.end method

.method public final Q()V
    .locals 0

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public R()Z
    .locals 1

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v0, v0, LPM2$c;->b:Loa1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Loa1;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public S()Z
    .locals 2

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v0, v0, LPM2$c;->a:Liy5;

    invoke-virtual {p0}, LPM2;->u()Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {v0, v1}, Liy5;->u(Landroid/graphics/RectF;)Z

    move-result v0

    return v0
.end method

.method public final T(Landroid/graphics/Canvas;)V
    .locals 6

    invoke-virtual {p0}, LPM2;->M()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {p0, p1}, LPM2;->V(Landroid/graphics/Canvas;)V

    iget-boolean v0, p0, LPM2;->x:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, LPM2;->n(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void

    :cond_1
    iget-object v0, p0, LPM2;->w:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    float-to-int v0, v0

    iget-object v1, p0, LPM2;->w:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    float-to-int v1, v1

    if-ltz v0, :cond_2

    if-ltz v1, :cond_2

    iget-object v2, p0, LPM2;->w:Landroid/graphics/RectF;

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    float-to-int v2, v2

    iget-object v3, p0, LPM2;->b:LPM2$c;

    iget v3, v3, LPM2$c;->r:I

    mul-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    add-int/2addr v2, v0

    iget-object v3, p0, LPM2;->w:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v3

    float-to-int v3, v3

    iget-object v4, p0, LPM2;->b:LPM2$c;

    iget v4, v4, LPM2$c;->r:I

    mul-int/lit8 v4, v4, 0x2

    add-int/2addr v3, v4

    add-int/2addr v3, v1

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v4

    iget v4, v4, Landroid/graphics/Rect;->left:I

    iget-object v5, p0, LPM2;->b:LPM2$c;

    iget v5, v5, LPM2$c;->r:I

    sub-int/2addr v4, v5

    sub-int/2addr v4, v0

    int-to-float v0, v4

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v4

    iget v4, v4, Landroid/graphics/Rect;->top:I

    iget-object v5, p0, LPM2;->b:LPM2$c;

    iget v5, v5, LPM2$c;->r:I

    sub-int/2addr v4, v5

    sub-int/2addr v4, v1

    int-to-float v1, v4

    neg-float v4, v0

    neg-float v5, v1

    invoke-virtual {v3, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {p0, v3}, LPM2;->n(Landroid/graphics/Canvas;)V

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v0, v1, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Invalid shadow bounds. Check that the treatments result in a valid path."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final V(Landroid/graphics/Canvas;)V
    .locals 2

    invoke-virtual {p0}, LPM2;->B()I

    move-result v0

    invoke-virtual {p0}, LPM2;->C()I

    move-result v1

    int-to-float v0, v0

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    return-void
.end method

.method public W()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {p0}, LPM2;->S()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, LPM2;->h:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->isConvex()Z

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public X(F)V
    .locals 1

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v0, v0, LPM2$c;->a:Liy5;

    invoke-virtual {v0, p1}, Liy5;->w(F)Liy5;

    move-result-object p1

    invoke-virtual {p0, p1}, LPM2;->setShapeAppearanceModel(Liy5;)V

    return-void
.end method

.method public Y(LNC0;)V
    .locals 1

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v0, v0, LPM2$c;->a:Liy5;

    invoke-virtual {v0, p1}, Liy5;->x(LNC0;)Liy5;

    move-result-object p1

    invoke-virtual {p0, p1}, LPM2;->setShapeAppearanceModel(Liy5;)V

    return-void
.end method

.method public Z(F)V
    .locals 2

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget v1, v0, LPM2$c;->o:F

    cmpl-float v1, v1, p1

    if-eqz v1, :cond_0

    iput p1, v0, LPM2$c;->o:F

    invoke-virtual {p0}, LPM2;->o0()V

    :cond_0
    return-void
.end method

.method public a0(Landroid/content/res/ColorStateList;)V
    .locals 2

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v1, v0, LPM2$c;->d:Landroid/content/res/ColorStateList;

    if-eq v1, p1, :cond_0

    iput-object p1, v0, LPM2$c;->d:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, LPM2;->onStateChange([I)Z

    :cond_0
    return-void
.end method

.method public b0(F)V
    .locals 2

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget v1, v0, LPM2$c;->k:F

    cmpl-float v1, v1, p1

    if-eqz v1, :cond_0

    iput p1, v0, LPM2$c;->k:F

    const/4 p1, 0x1

    iput-boolean p1, p0, LPM2;->f:Z

    invoke-virtual {p0}, LPM2;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public c0(IIII)V
    .locals 2

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v1, v0, LPM2$c;->i:Landroid/graphics/Rect;

    if-nez v1, :cond_0

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, v0, LPM2$c;->i:Landroid/graphics/Rect;

    :cond_0
    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v0, v0, LPM2$c;->i:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    invoke-virtual {p0}, LPM2;->invalidateSelf()V

    return-void
.end method

.method public d0(Landroid/graphics/Paint$Style;)V
    .locals 1

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iput-object p1, v0, LPM2$c;->v:Landroid/graphics/Paint$Style;

    invoke-virtual {p0}, LPM2;->Q()V

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 4

    iget-object v0, p0, LPM2;->o:Landroid/graphics/Paint;

    iget-object v1, p0, LPM2;->t:Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    iget-object v0, p0, LPM2;->o:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    iget-object v1, p0, LPM2;->o:Landroid/graphics/Paint;

    iget-object v2, p0, LPM2;->b:LPM2$c;

    iget v2, v2, LPM2$c;->m:I

    invoke-static {v0, v2}, LPM2;->U(II)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v1, p0, LPM2;->p:Landroid/graphics/Paint;

    iget-object v2, p0, LPM2;->u:Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    iget-object v1, p0, LPM2;->p:Landroid/graphics/Paint;

    iget-object v2, p0, LPM2;->b:LPM2$c;

    iget v2, v2, LPM2$c;->l:F

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v1, p0, LPM2;->p:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getAlpha()I

    move-result v1

    iget-object v2, p0, LPM2;->p:Landroid/graphics/Paint;

    iget-object v3, p0, LPM2;->b:LPM2$c;

    iget v3, v3, LPM2$c;->m:I

    invoke-static {v1, v3}, LPM2;->U(II)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-boolean v2, p0, LPM2;->f:Z

    if-eqz v2, :cond_0

    invoke-virtual {p0}, LPM2;->i()V

    invoke-virtual {p0}, LPM2;->u()Landroid/graphics/RectF;

    move-result-object v2

    iget-object v3, p0, LPM2;->h:Landroid/graphics/Path;

    invoke-virtual {p0, v2, v3}, LPM2;->g(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    const/4 v2, 0x0

    iput-boolean v2, p0, LPM2;->f:Z

    :cond_0
    invoke-virtual {p0, p1}, LPM2;->T(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, LPM2;->N()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, p1}, LPM2;->o(Landroid/graphics/Canvas;)V

    :cond_1
    invoke-virtual {p0}, LPM2;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, p1}, LPM2;->r(Landroid/graphics/Canvas;)V

    :cond_2
    iget-object p1, p0, LPM2;->o:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object p1, p0, LPM2;->p:Landroid/graphics/Paint;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method public e0(F)V
    .locals 2

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget v1, v0, LPM2$c;->n:F

    cmpl-float v1, v1, p1

    if-eqz v1, :cond_0

    iput p1, v0, LPM2$c;->n:F

    invoke-virtual {p0}, LPM2;->o0()V

    :cond_0
    return-void
.end method

.method public final f(Landroid/graphics/Paint;Z)Landroid/graphics/PorterDuffColorFilter;
    .locals 1

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    move-result p1

    invoke-virtual {p0, p1}, LPM2;->l(I)I

    move-result p2

    iput p2, p0, LPM2;->v:I

    if-eq p2, p1, :cond_0

    new-instance p1, Landroid/graphics/PorterDuffColorFilter;

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p1, p2, v0}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public f0(Z)V
    .locals 0

    iput-boolean p1, p0, LPM2;->x:Z

    return-void
.end method

.method public final g(Landroid/graphics/RectF;Landroid/graphics/Path;)V
    .locals 4

    invoke-virtual {p0, p1, p2}, LPM2;->h(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget v0, v0, LPM2$c;->j:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    iget-object v0, p0, LPM2;->g:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    iget-object v0, p0, LPM2;->g:Landroid/graphics/Matrix;

    iget-object v1, p0, LPM2;->b:LPM2$c;

    iget v1, v1, LPM2$c;->j:F

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    move-result p1

    div-float/2addr p1, v3

    invoke-virtual {v0, v1, v1, v2, p1}, Landroid/graphics/Matrix;->setScale(FFFF)V

    iget-object p1, p0, LPM2;->g:Landroid/graphics/Matrix;

    invoke-virtual {p2, p1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    :cond_0
    iget-object p1, p0, LPM2;->w:Landroid/graphics/RectF;

    const/4 v0, 0x1

    invoke-virtual {p2, p1, v0}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    return-void
.end method

.method public g0(I)V
    .locals 1

    iget-object v0, p0, LPM2;->q:LSx5;

    invoke-virtual {v0, p1}, LSx5;->d(I)V

    iget-object p1, p0, LPM2;->b:LPM2$c;

    const/4 v0, 0x0

    iput-boolean v0, p1, LPM2$c;->u:Z

    invoke-virtual {p0}, LPM2;->Q()V

    return-void
.end method

.method public getAlpha()I
    .locals 1

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget v0, v0, LPM2$c;->m:I

    return v0
.end method

.method public getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    iget-object v0, p0, LPM2;->b:LPM2$c;

    return-object v0
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public getOutline(Landroid/graphics/Outline;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget v0, v0, LPM2$c;->q:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LPM2;->S()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LPM2;->I()F

    move-result v0

    iget-object v1, p0, LPM2;->b:LPM2$c;

    iget v1, v1, LPM2$c;->k:F

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Outline;->setRoundRect(Landroid/graphics/Rect;F)V

    return-void

    :cond_1
    invoke-virtual {p0}, LPM2;->u()Landroid/graphics/RectF;

    move-result-object v0

    iget-object v1, p0, LPM2;->h:Landroid/graphics/Path;

    invoke-virtual {p0, v0, v1}, LPM2;->g(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    iget-object v0, p0, LPM2;->h:Landroid/graphics/Path;

    invoke-static {p1, v0}, Lf71;->h(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    return-void
.end method

.method public getPadding(Landroid/graphics/Rect;)Z
    .locals 1

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v0, v0, LPM2$c;->i:Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public getTransparentRegion()Landroid/graphics/Region;
    .locals 3

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, LPM2;->l:Landroid/graphics/Region;

    invoke-virtual {v1, v0}, Landroid/graphics/Region;->set(Landroid/graphics/Rect;)Z

    invoke-virtual {p0}, LPM2;->u()Landroid/graphics/RectF;

    move-result-object v0

    iget-object v1, p0, LPM2;->h:Landroid/graphics/Path;

    invoke-virtual {p0, v0, v1}, LPM2;->g(Landroid/graphics/RectF;Landroid/graphics/Path;)V

    iget-object v0, p0, LPM2;->m:Landroid/graphics/Region;

    iget-object v1, p0, LPM2;->h:Landroid/graphics/Path;

    iget-object v2, p0, LPM2;->l:Landroid/graphics/Region;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    iget-object v0, p0, LPM2;->l:Landroid/graphics/Region;

    iget-object v1, p0, LPM2;->m:Landroid/graphics/Region;

    sget-object v2, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    iget-object v0, p0, LPM2;->l:Landroid/graphics/Region;

    return-object v0
.end method

.method public final h(Landroid/graphics/RectF;Landroid/graphics/Path;)V
    .locals 6

    iget-object v0, p0, LPM2;->s:Ljy5;

    iget-object v1, p0, LPM2;->b:LPM2$c;

    iget-object v2, v1, LPM2$c;->a:Liy5;

    iget v3, v1, LPM2$c;->k:F

    iget-object v4, p0, LPM2;->r:Ljy5$b;

    move-object v1, v2

    move v2, v3

    move-object v3, p1

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Ljy5;->d(Liy5;FLandroid/graphics/RectF;Ljy5$b;Landroid/graphics/Path;)V

    return-void
.end method

.method public h0(I)V
    .locals 2

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget v1, v0, LPM2$c;->q:I

    if-eq v1, p1, :cond_0

    iput p1, v0, LPM2$c;->q:I

    invoke-virtual {p0}, LPM2;->Q()V

    :cond_0
    return-void
.end method

.method public final i()V
    .locals 5

    invoke-virtual {p0}, LPM2;->G()F

    move-result v0

    neg-float v0, v0

    invoke-virtual {p0}, LPM2;->E()Liy5;

    move-result-object v1

    new-instance v2, LPM2$b;

    invoke-direct {v2, p0, v0}, LPM2$b;-><init>(LPM2;F)V

    invoke-virtual {v1, v2}, Liy5;->y(Liy5$c;)Liy5;

    move-result-object v0

    iput-object v0, p0, LPM2;->n:Liy5;

    iget-object v1, p0, LPM2;->s:Ljy5;

    iget-object v2, p0, LPM2;->b:LPM2$c;

    iget v2, v2, LPM2$c;->k:F

    invoke-virtual {p0}, LPM2;->v()Landroid/graphics/RectF;

    move-result-object v3

    iget-object v4, p0, LPM2;->i:Landroid/graphics/Path;

    invoke-virtual {v1, v0, v2, v3, v4}, Ljy5;->e(Liy5;FLandroid/graphics/RectF;Landroid/graphics/Path;)V

    return-void
.end method

.method public i0(FI)V
    .locals 0

    invoke-virtual {p0, p1}, LPM2;->l0(F)V

    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, LPM2;->k0(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public invalidateSelf()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LPM2;->f:Z

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public isStateful()Z
    .locals 1

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v0, v0, LPM2$c;->g:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_0
    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v0, v0, LPM2$c;->f:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_1
    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v0, v0, LPM2$c;->e:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_2
    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v0, v0, LPM2$c;->d:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final j(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;Z)Landroid/graphics/PorterDuffColorFilter;
    .locals 2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    if-eqz p3, :cond_0

    invoke-virtual {p0, p1}, LPM2;->l(I)I

    move-result p1

    :cond_0
    iput p1, p0, LPM2;->v:I

    new-instance p3, Landroid/graphics/PorterDuffColorFilter;

    invoke-direct {p3, p1, p2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    return-object p3
.end method

.method public j0(FLandroid/content/res/ColorStateList;)V
    .locals 0

    invoke-virtual {p0, p1}, LPM2;->l0(F)V

    invoke-virtual {p0, p2}, LPM2;->k0(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final k(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;Landroid/graphics/Paint;Z)Landroid/graphics/PorterDuffColorFilter;
    .locals 0

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2, p4}, LPM2;->j(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;Z)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p0, p3, p4}, LPM2;->f(Landroid/graphics/Paint;Z)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public k0(Landroid/content/res/ColorStateList;)V
    .locals 2

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v1, v0, LPM2$c;->e:Landroid/content/res/ColorStateList;

    if-eq v1, p1, :cond_0

    iput-object p1, v0, LPM2$c;->e:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, LPM2;->onStateChange([I)Z

    :cond_0
    return-void
.end method

.method public l(I)I
    .locals 2

    invoke-virtual {p0}, LPM2;->L()F

    move-result v0

    invoke-virtual {p0}, LPM2;->z()F

    move-result v1

    add-float/2addr v0, v1

    iget-object v1, p0, LPM2;->b:LPM2$c;

    iget-object v1, v1, LPM2$c;->b:Loa1;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1, v0}, Loa1;->c(IF)I

    move-result p1

    :cond_0
    return p1
.end method

.method public l0(F)V
    .locals 1

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iput p1, v0, LPM2$c;->l:F

    invoke-virtual {p0}, LPM2;->invalidateSelf()V

    return-void
.end method

.method public final m0([I)Z
    .locals 4

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v0, v0, LPM2$c;->d:Landroid/content/res/ColorStateList;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LPM2;->o:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    iget-object v2, p0, LPM2;->b:LPM2$c;

    iget-object v2, v2, LPM2$c;->d:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, p1, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v2

    if-eq v0, v2, :cond_0

    iget-object v0, p0, LPM2;->o:Landroid/graphics/Paint;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, LPM2;->b:LPM2$c;

    iget-object v2, v2, LPM2$c;->e:Landroid/content/res/ColorStateList;

    if-eqz v2, :cond_1

    iget-object v2, p0, LPM2;->p:Landroid/graphics/Paint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getColor()I

    move-result v2

    iget-object v3, p0, LPM2;->b:LPM2$c;

    iget-object v3, v3, LPM2$c;->e:Landroid/content/res/ColorStateList;

    invoke-virtual {v3, p1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    if-eq v2, p1, :cond_1

    iget-object v0, p0, LPM2;->p:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    return v1
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 2

    new-instance v0, LPM2$c;

    iget-object v1, p0, LPM2;->b:LPM2$c;

    invoke-direct {v0, v1}, LPM2$c;-><init>(LPM2$c;)V

    iput-object v0, p0, LPM2;->b:LPM2$c;

    return-object p0
.end method

.method public final n(Landroid/graphics/Canvas;)V
    .locals 4

    iget-object v0, p0, LPM2;->e:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->cardinality()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, LPM2;->y:Ljava/lang/String;

    const-string v1, "Compatibility shadow requested but can\'t be drawn for all operations in this shape."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget v0, v0, LPM2$c;->s:I

    if-eqz v0, :cond_1

    iget-object v0, p0, LPM2;->h:Landroid/graphics/Path;

    iget-object v1, p0, LPM2;->q:LSx5;

    invoke-virtual {v1}, LSx5;->c()Landroid/graphics/Paint;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x4

    if-ge v0, v1, :cond_2

    iget-object v1, p0, LPM2;->c:[Lvy5$g;

    aget-object v1, v1, v0

    iget-object v2, p0, LPM2;->q:LSx5;

    iget-object v3, p0, LPM2;->b:LPM2$c;

    iget v3, v3, LPM2$c;->r:I

    invoke-virtual {v1, v2, v3, p1}, Lvy5$g;->a(LSx5;ILandroid/graphics/Canvas;)V

    iget-object v1, p0, LPM2;->d:[Lvy5$g;

    aget-object v1, v1, v0

    iget-object v2, p0, LPM2;->q:LSx5;

    iget-object v3, p0, LPM2;->b:LPM2$c;

    iget v3, v3, LPM2$c;->r:I

    invoke-virtual {v1, v2, v3, p1}, Lvy5$g;->a(LSx5;ILandroid/graphics/Canvas;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    iget-boolean v0, p0, LPM2;->x:Z

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LPM2;->B()I

    move-result v0

    invoke-virtual {p0}, LPM2;->C()I

    move-result v1

    neg-int v2, v0

    int-to-float v2, v2

    neg-int v3, v1

    int-to-float v3, v3

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v2, p0, LPM2;->h:Landroid/graphics/Path;

    sget-object v3, LPM2;->z:Landroid/graphics/Paint;

    invoke-virtual {p1, v2, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    int-to-float v0, v0

    int-to-float v1, v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    :cond_3
    return-void
.end method

.method public final n0()Z
    .locals 7

    iget-object v0, p0, LPM2;->t:Landroid/graphics/PorterDuffColorFilter;

    iget-object v1, p0, LPM2;->u:Landroid/graphics/PorterDuffColorFilter;

    iget-object v2, p0, LPM2;->b:LPM2$c;

    iget-object v3, v2, LPM2$c;->g:Landroid/content/res/ColorStateList;

    iget-object v2, v2, LPM2$c;->h:Landroid/graphics/PorterDuff$Mode;

    iget-object v4, p0, LPM2;->o:Landroid/graphics/Paint;

    const/4 v5, 0x1

    invoke-virtual {p0, v3, v2, v4, v5}, LPM2;->k(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;Landroid/graphics/Paint;Z)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v2

    iput-object v2, p0, LPM2;->t:Landroid/graphics/PorterDuffColorFilter;

    iget-object v2, p0, LPM2;->b:LPM2$c;

    iget-object v3, v2, LPM2$c;->f:Landroid/content/res/ColorStateList;

    iget-object v2, v2, LPM2$c;->h:Landroid/graphics/PorterDuff$Mode;

    iget-object v4, p0, LPM2;->p:Landroid/graphics/Paint;

    const/4 v6, 0x0

    invoke-virtual {p0, v3, v2, v4, v6}, LPM2;->k(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;Landroid/graphics/Paint;Z)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v2

    iput-object v2, p0, LPM2;->u:Landroid/graphics/PorterDuffColorFilter;

    iget-object v2, p0, LPM2;->b:LPM2$c;

    iget-boolean v3, v2, LPM2$c;->u:Z

    if-eqz v3, :cond_0

    iget-object v3, p0, LPM2;->q:LSx5;

    iget-object v2, v2, LPM2$c;->g:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v4

    invoke-virtual {v2, v4, v6}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v2

    invoke-virtual {v3, v2}, LSx5;->d(I)V

    :cond_0
    iget-object v2, p0, LPM2;->t:Landroid/graphics/PorterDuffColorFilter;

    invoke-static {v0, v2}, LYd3;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LPM2;->u:Landroid/graphics/PorterDuffColorFilter;

    invoke-static {v1, v0}, LYd3;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move v5, v6

    :cond_2
    :goto_0
    return v5
.end method

.method public final o(Landroid/graphics/Canvas;)V
    .locals 6

    iget-object v2, p0, LPM2;->o:Landroid/graphics/Paint;

    iget-object v3, p0, LPM2;->h:Landroid/graphics/Path;

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v4, v0, LPM2$c;->a:Liy5;

    invoke-virtual {p0}, LPM2;->u()Landroid/graphics/RectF;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, LPM2;->p(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Liy5;Landroid/graphics/RectF;)V

    return-void
.end method

.method public final o0()V
    .locals 4

    invoke-virtual {p0}, LPM2;->L()F

    move-result v0

    iget-object v1, p0, LPM2;->b:LPM2$c;

    const/high16 v2, 0x3f400000    # 0.75f

    mul-float/2addr v2, v0

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    iput v2, v1, LPM2$c;->r:I

    iget-object v1, p0, LPM2;->b:LPM2$c;

    const/high16 v2, 0x3e800000    # 0.25f

    mul-float/2addr v0, v2

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v0, v2

    iput v0, v1, LPM2$c;->s:I

    invoke-virtual {p0}, LPM2;->n0()Z

    invoke-virtual {p0}, LPM2;->Q()V

    return-void
.end method

.method public onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LPM2;->f:Z

    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    return-void
.end method

.method public onStateChange([I)Z
    .locals 1

    invoke-virtual {p0, p1}, LPM2;->m0([I)Z

    move-result p1

    invoke-virtual {p0}, LPM2;->n0()Z

    move-result v0

    if-nez p1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, LPM2;->invalidateSelf()V

    :cond_2
    return p1
.end method

.method public final p(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Liy5;Landroid/graphics/RectF;)V
    .locals 1

    invoke-virtual {p4, p5}, Liy5;->u(Landroid/graphics/RectF;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p4}, Liy5;->t()LNC0;

    move-result-object p3

    invoke-interface {p3, p5}, LNC0;->a(Landroid/graphics/RectF;)F

    move-result p3

    iget-object p4, p0, LPM2;->b:LPM2$c;

    iget p4, p4, LPM2$c;->k:F

    mul-float/2addr p3, p4

    invoke-virtual {p1, p5, p3, p3, p2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :goto_0
    return-void
.end method

.method public q(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Landroid/graphics/RectF;)V
    .locals 7

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v5, v0, LPM2$c;->a:Liy5;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p4

    invoke-virtual/range {v1 .. v6}, LPM2;->p(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Liy5;Landroid/graphics/RectF;)V

    return-void
.end method

.method public r(Landroid/graphics/Canvas;)V
    .locals 6

    iget-object v2, p0, LPM2;->p:Landroid/graphics/Paint;

    iget-object v3, p0, LPM2;->i:Landroid/graphics/Path;

    iget-object v4, p0, LPM2;->n:Liy5;

    invoke-virtual {p0}, LPM2;->v()Landroid/graphics/RectF;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, LPM2;->p(Landroid/graphics/Canvas;Landroid/graphics/Paint;Landroid/graphics/Path;Liy5;Landroid/graphics/RectF;)V

    return-void
.end method

.method public s()F
    .locals 2

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v0, v0, LPM2$c;->a:Liy5;

    invoke-virtual {v0}, Liy5;->j()LNC0;

    move-result-object v0

    invoke-virtual {p0}, LPM2;->u()Landroid/graphics/RectF;

    move-result-object v1

    invoke-interface {v0, v1}, LNC0;->a(Landroid/graphics/RectF;)F

    move-result v0

    return v0
.end method

.method public setAlpha(I)V
    .locals 2

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget v1, v0, LPM2$c;->m:I

    if-eq v1, p1, :cond_0

    iput p1, v0, LPM2$c;->m:I

    invoke-virtual {p0}, LPM2;->Q()V

    :cond_0
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iput-object p1, v0, LPM2$c;->c:Landroid/graphics/ColorFilter;

    invoke-virtual {p0}, LPM2;->Q()V

    return-void
.end method

.method public setShapeAppearanceModel(Liy5;)V
    .locals 1

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iput-object p1, v0, LPM2$c;->a:Liy5;

    invoke-virtual {p0}, LPM2;->invalidateSelf()V

    return-void
.end method

.method public setTint(I)V
    .locals 0

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, LPM2;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iput-object p1, v0, LPM2$c;->g:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, LPM2;->n0()Z

    invoke-virtual {p0}, LPM2;->Q()V

    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v1, v0, LPM2$c;->h:Landroid/graphics/PorterDuff$Mode;

    if-eq v1, p1, :cond_0

    iput-object p1, v0, LPM2$c;->h:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0}, LPM2;->n0()Z

    invoke-virtual {p0}, LPM2;->Q()V

    :cond_0
    return-void
.end method

.method public t()F
    .locals 2

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v0, v0, LPM2$c;->a:Liy5;

    invoke-virtual {v0}, Liy5;->l()LNC0;

    move-result-object v0

    invoke-virtual {p0}, LPM2;->u()Landroid/graphics/RectF;

    move-result-object v1

    invoke-interface {v0, v1}, LNC0;->a(Landroid/graphics/RectF;)F

    move-result v0

    return v0
.end method

.method public u()Landroid/graphics/RectF;
    .locals 2

    iget-object v0, p0, LPM2;->j:Landroid/graphics/RectF;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    iget-object v0, p0, LPM2;->j:Landroid/graphics/RectF;

    return-object v0
.end method

.method public final v()Landroid/graphics/RectF;
    .locals 2

    iget-object v0, p0, LPM2;->k:Landroid/graphics/RectF;

    invoke-virtual {p0}, LPM2;->u()Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    invoke-virtual {p0}, LPM2;->G()F

    move-result v0

    iget-object v1, p0, LPM2;->k:Landroid/graphics/RectF;

    invoke-virtual {v1, v0, v0}, Landroid/graphics/RectF;->inset(FF)V

    iget-object v0, p0, LPM2;->k:Landroid/graphics/RectF;

    return-object v0
.end method

.method public w()F
    .locals 1

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget v0, v0, LPM2$c;->o:F

    return v0
.end method

.method public x()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget-object v0, v0, LPM2$c;->d:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public y()F
    .locals 1

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget v0, v0, LPM2$c;->k:F

    return v0
.end method

.method public z()F
    .locals 1

    iget-object v0, p0, LPM2;->b:LPM2$c;

    iget v0, v0, LPM2$c;->n:F

    return v0
.end method
