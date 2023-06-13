.class public Lco/bird/android/widget/RangeSeekBar;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/RangeSeekBar$e;,
        Lco/bird/android/widget/RangeSeekBar$d;,
        Lco/bird/android/widget/RangeSeekBar$b;,
        Lco/bird/android/widget/RangeSeekBar$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Number;",
        ">",
        "Landroidx/appcompat/widget/AppCompatImageView;"
    }
.end annotation


# static fields
.field public static final v0:I

.field public static final w0:Ljava/text/DecimalFormat;

.field public static final x0:Ljava/lang/Integer;

.field public static final y0:Ljava/lang/Integer;

.field public static final z0:Ljava/lang/Integer;


# instance fields
.field public A:I

.field public B:Z

.field public C:I

.field public D:I

.field public E:I

.field public F:Landroid/graphics/RectF;

.field public G:Lco/bird/android/widget/RangeSeekBar$d;

.field public H:Z

.field public I:Z

.field public J:Z

.field public K:Z

.field public P:Z

.field public Q:I

.field public R:I

.field public S:I

.field public T:I

.field public U:Z

.field public W:I

.field public final b:Landroid/graphics/Paint;

.field public final c:Landroid/graphics/Paint;

.field public d:Z

.field public e:Landroid/graphics/Bitmap;

.field public f:Landroid/graphics/Bitmap;

.field public g:Landroid/graphics/Bitmap;

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:Ljava/lang/Number;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public m:Ljava/lang/Number;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public n:Ljava/lang/Number;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public o:Lco/bird/android/widget/RangeSeekBar$b;

.field public p:D

.field public p0:I

.field public q:D

.field public q0:I

.field public r:D

.field public r0:Landroid/graphics/Path;

.field public s:D

.field public s0:Landroid/graphics/Path;

.field public t:D

.field public t0:Landroid/graphics/Matrix;

.field public u:D

.field public u0:Z

.field public v:Lco/bird/android/widget/RangeSeekBar$e;

.field public w:Z

.field public x:Lco/bird/android/widget/RangeSeekBar$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/widget/RangeSeekBar$c<",
            "TT;>;"
        }
    .end annotation
.end field

.field public y:F

.field public z:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/16 v0, 0xb5

    const/16 v1, 0xe5

    const/16 v2, 0xff

    const/16 v3, 0x33

    invoke-static {v2, v3, v0, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    sput v0, Lco/bird/android/widget/RangeSeekBar;->v0:I

    new-instance v0, Ljava/text/DecimalFormat;

    const-string v1, "#.##"

    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lco/bird/android/widget/RangeSeekBar;->w0:Ljava/text/DecimalFormat;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lco/bird/android/widget/RangeSeekBar;->x0:Ljava/lang/Integer;

    const/16 v0, 0x64

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lco/bird/android/widget/RangeSeekBar;->y0:Ljava/lang/Integer;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lco/bird/android/widget/RangeSeekBar;->z0:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->b:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->c:Landroid/graphics/Paint;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->s:D

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    iput-wide v2, p0, Lco/bird/android/widget/RangeSeekBar;->t:D

    iput-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->u:D

    const/4 v0, 0x0

    iput-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->v:Lco/bird/android/widget/RangeSeekBar$e;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lco/bird/android/widget/RangeSeekBar;->w:Z

    const/16 v1, 0xff

    iput v1, p0, Lco/bird/android/widget/RangeSeekBar;->z:I

    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lco/bird/android/widget/RangeSeekBar;->s0:Landroid/graphics/Path;

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Lco/bird/android/widget/RangeSeekBar;->t0:Landroid/graphics/Matrix;

    invoke-virtual {p0, p1, v0}, Lco/bird/android/widget/RangeSeekBar;->q(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->b:Landroid/graphics/Paint;

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->c:Landroid/graphics/Paint;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->s:D

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    iput-wide v2, p0, Lco/bird/android/widget/RangeSeekBar;->t:D

    iput-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->u:D

    const/4 v0, 0x0

    iput-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->v:Lco/bird/android/widget/RangeSeekBar$e;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lco/bird/android/widget/RangeSeekBar;->w:Z

    const/16 v0, 0xff

    iput v0, p0, Lco/bird/android/widget/RangeSeekBar;->z:I

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->s0:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->t0:Landroid/graphics/Matrix;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/widget/RangeSeekBar;->q(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p3, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {p3, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p3, p0, Lco/bird/android/widget/RangeSeekBar;->b:Landroid/graphics/Paint;

    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    iput-object p3, p0, Lco/bird/android/widget/RangeSeekBar;->c:Landroid/graphics/Paint;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->s:D

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    iput-wide v2, p0, Lco/bird/android/widget/RangeSeekBar;->t:D

    iput-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->u:D

    const/4 p3, 0x0

    iput-object p3, p0, Lco/bird/android/widget/RangeSeekBar;->v:Lco/bird/android/widget/RangeSeekBar$e;

    const/4 p3, 0x0

    iput-boolean p3, p0, Lco/bird/android/widget/RangeSeekBar;->w:Z

    const/16 p3, 0xff

    iput p3, p0, Lco/bird/android/widget/RangeSeekBar;->z:I

    new-instance p3, Landroid/graphics/Path;

    invoke-direct {p3}, Landroid/graphics/Path;-><init>()V

    iput-object p3, p0, Lco/bird/android/widget/RangeSeekBar;->s0:Landroid/graphics/Path;

    new-instance p3, Landroid/graphics/Matrix;

    invoke-direct {p3}, Landroid/graphics/Matrix;-><init>()V

    iput-object p3, p0, Lco/bird/android/widget/RangeSeekBar;->t0:Landroid/graphics/Matrix;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/widget/RangeSeekBar;->q(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static bridge synthetic c()Ljava/text/DecimalFormat;
    .locals 1

    sget-object v0, Lco/bird/android/widget/RangeSeekBar;->w0:Ljava/text/DecimalFormat;

    return-object v0
.end method

.method public static f(DDD)D
    .locals 1

    cmpg-double v0, p2, p4

    if-gez v0, :cond_2

    cmpg-double v0, p0, p2

    if-gez v0, :cond_0

    return-wide p2

    :cond_0
    cmpl-double p2, p0, p4

    if-lez p2, :cond_1

    return-wide p4

    :cond_1
    return-wide p0

    :cond_2
    cmpl-double v0, p0, p2

    if-lez v0, :cond_3

    return-wide p2

    :cond_3
    cmpg-double p2, p0, p4

    if-gez p2, :cond_4

    return-wide p4

    :cond_4
    return-wide p0
.end method


# virtual methods
.method public final A(F)D
    .locals 6

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lco/bird/android/widget/RangeSeekBar;->j:F

    iget v2, p0, Lco/bird/android/widget/RangeSeekBar;->k:F

    add-float v3, v1, v2

    cmpg-float v3, v0, v3

    const-wide/16 v4, 0x0

    if-gtz v3, :cond_0

    return-wide v4

    :cond_0
    sub-float/2addr p1, v1

    add-float/2addr v1, v2

    sub-float/2addr v0, v1

    div-float/2addr p1, v0

    float-to-double v0, p1

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    return-wide v0
.end method

.method public final B(D)V
    .locals 2

    iget-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->t:D

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p1

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(DD)D

    move-result-wide p1

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(DD)D

    move-result-wide p1

    iput-wide p1, p0, Lco/bird/android/widget/RangeSeekBar;->s:D

    iget-object p1, p0, Lco/bird/android/widget/RangeSeekBar;->G:Lco/bird/android/widget/RangeSeekBar$d;

    sget-object p2, Lco/bird/android/widget/RangeSeekBar$d;->d:Lco/bird/android/widget/RangeSeekBar$d;

    if-ne p1, p2, :cond_0

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->m()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p0, p1}, Lco/bird/android/widget/RangeSeekBar;->H(Ljava/lang/Number;)D

    move-result-wide p1

    iput-wide p1, p0, Lco/bird/android/widget/RangeSeekBar;->s:D

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final C(D)V
    .locals 2

    iget-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->s:D

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide p1

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(DD)D

    move-result-wide p1

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(DD)D

    move-result-wide p1

    iput-wide p1, p0, Lco/bird/android/widget/RangeSeekBar;->t:D

    iget-object p1, p0, Lco/bird/android/widget/RangeSeekBar;->G:Lco/bird/android/widget/RangeSeekBar$d;

    sget-object p2, Lco/bird/android/widget/RangeSeekBar$d;->d:Lco/bird/android/widget/RangeSeekBar$d;

    if-ne p1, p2, :cond_0

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->p()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p0, p1}, Lco/bird/android/widget/RangeSeekBar;->H(Ljava/lang/Number;)D

    move-result-wide p1

    iput-wide p1, p0, Lco/bird/android/widget/RangeSeekBar;->t:D

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final D()V
    .locals 3

    sget-object v0, Lco/bird/android/widget/RangeSeekBar;->x0:Ljava/lang/Integer;

    sget-object v1, Lco/bird/android/widget/RangeSeekBar;->y0:Ljava/lang/Integer;

    sget-object v2, Lco/bird/android/widget/RangeSeekBar;->z0:Ljava/lang/Integer;

    invoke-virtual {p0, v0, v1, v2}, Lco/bird/android/widget/RangeSeekBar;->setRangeValues(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->E()V

    return-void
.end method

.method public final E()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->l:Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->p:D

    iget-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->m:Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->q:D

    iget-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->n:Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->r:D

    iget-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->l:Ljava/lang/Number;

    invoke-static {v0}, Lco/bird/android/widget/RangeSeekBar$b;->b(Ljava/lang/Number;)Lco/bird/android/widget/RangeSeekBar$b;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->o:Lco/bird/android/widget/RangeSeekBar$b;

    return-void
.end method

.method public final F()Z
    .locals 2

    iget-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->G:Lco/bird/android/widget/RangeSeekBar$d;

    sget-object v1, Lco/bird/android/widget/RangeSeekBar$d;->b:Lco/bird/android/widget/RangeSeekBar$d;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final G(Landroid/view/MotionEvent;)V
    .locals 5

    iget v0, p0, Lco/bird/android/widget/RangeSeekBar;->z:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result p1

    invoke-virtual {p0, p1}, Lco/bird/android/widget/RangeSeekBar;->A(F)D

    move-result-wide v0

    sget-object p1, Lco/bird/android/widget/RangeSeekBar$e;->b:Lco/bird/android/widget/RangeSeekBar$e;

    iget-object v2, p0, Lco/bird/android/widget/RangeSeekBar;->v:Lco/bird/android/widget/RangeSeekBar$e;

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-boolean v2, p0, Lco/bird/android/widget/RangeSeekBar;->J:Z

    if-nez v2, :cond_1

    iget-boolean p1, p0, Lco/bird/android/widget/RangeSeekBar;->I:Z

    if-eqz p1, :cond_0

    iget-wide v2, p0, Lco/bird/android/widget/RangeSeekBar;->t:D

    cmpl-double p1, v0, v2

    if-lez p1, :cond_0

    sget-object p1, Lco/bird/android/widget/RangeSeekBar$e;->c:Lco/bird/android/widget/RangeSeekBar$e;

    iput-object p1, p0, Lco/bird/android/widget/RangeSeekBar;->v:Lco/bird/android/widget/RangeSeekBar$e;

    invoke-virtual {p0, v2, v3}, Lco/bird/android/widget/RangeSeekBar;->B(D)V

    invoke-virtual {p0, v0, v1}, Lco/bird/android/widget/RangeSeekBar;->C(D)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0, v1}, Lco/bird/android/widget/RangeSeekBar;->B(D)V

    goto :goto_0

    :cond_1
    sget-object v2, Lco/bird/android/widget/RangeSeekBar$e;->c:Lco/bird/android/widget/RangeSeekBar$e;

    iget-object v3, p0, Lco/bird/android/widget/RangeSeekBar;->v:Lco/bird/android/widget/RangeSeekBar$e;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-boolean v2, p0, Lco/bird/android/widget/RangeSeekBar;->I:Z

    if-eqz v2, :cond_2

    iget-wide v2, p0, Lco/bird/android/widget/RangeSeekBar;->s:D

    cmpg-double v4, v0, v2

    if-gez v4, :cond_2

    iput-object p1, p0, Lco/bird/android/widget/RangeSeekBar;->v:Lco/bird/android/widget/RangeSeekBar$e;

    invoke-virtual {p0, v2, v3}, Lco/bird/android/widget/RangeSeekBar;->C(D)V

    invoke-virtual {p0, v0, v1}, Lco/bird/android/widget/RangeSeekBar;->B(D)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0, v1}, Lco/bird/android/widget/RangeSeekBar;->C(D)V

    :cond_3
    :goto_0
    iget-object p1, p0, Lco/bird/android/widget/RangeSeekBar;->x:Lco/bird/android/widget/RangeSeekBar$c;

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->m()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->p()Ljava/lang/Number;

    move-result-object v1

    invoke-interface {p1, p0, v0, v1}, Lco/bird/android/widget/RangeSeekBar$c;->a(Lco/bird/android/widget/RangeSeekBar;Ljava/lang/Number;Ljava/lang/Number;)V

    :cond_4
    return-void
.end method

.method public H(Ljava/lang/Number;)D
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)D"
        }
    .end annotation

    iget-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->q:D

    iget-wide v2, p0, Lco/bird/android/widget/RangeSeekBar;->p:D

    sub-double/2addr v0, v2

    const-wide/16 v2, 0x0

    cmpl-double v0, v2, v0

    if-nez v0, :cond_0

    return-wide v2

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    iget-wide v2, p0, Lco/bird/android/widget/RangeSeekBar;->p:D

    sub-double/2addr v0, v2

    iget-wide v4, p0, Lco/bird/android/widget/RangeSeekBar;->q:D

    sub-double/2addr v4, v2

    div-double/2addr v0, v4

    return-wide v0
.end method

.method public final d()V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 5

    iget-boolean v0, p0, Lco/bird/android/widget/RangeSeekBar;->d:Z

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->s()Z

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->l()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->k()Ljava/lang/Number;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->o()Ljava/lang/Number;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->n()Ljava/lang/Number;

    move-result-object v3

    iget-boolean v4, p0, Lco/bird/android/widget/RangeSeekBar;->d:Z

    xor-int/lit8 v4, v4, 0x1

    iput-boolean v4, p0, Lco/bird/android/widget/RangeSeekBar;->d:Z

    invoke-virtual {p0, v0, v1}, Lco/bird/android/widget/RangeSeekBar;->setRangeValues(Ljava/lang/Number;Ljava/lang/Number;)V

    invoke-virtual {p0, v2}, Lco/bird/android/widget/RangeSeekBar;->setSelectedMinValue(Ljava/lang/Number;)V

    invoke-virtual {p0, v3}, Lco/bird/android/widget/RangeSeekBar;->setSelectedMaxValue(Ljava/lang/Number;)V

    :cond_0
    return-void
.end method

.method public final g(FZLandroid/graphics/Canvas;Z)V
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/widget/RangeSeekBar;->u0:Z

    if-nez v0, :cond_0

    if-eqz p4, :cond_0

    iget-object p2, p0, Lco/bird/android/widget/RangeSeekBar;->g:Landroid/graphics/Bitmap;

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    iget-object p2, p0, Lco/bird/android/widget/RangeSeekBar;->f:Landroid/graphics/Bitmap;

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lco/bird/android/widget/RangeSeekBar;->e:Landroid/graphics/Bitmap;

    :goto_0
    iget p4, p0, Lco/bird/android/widget/RangeSeekBar;->h:F

    sub-float/2addr p1, p4

    iget p4, p0, Lco/bird/android/widget/RangeSeekBar;->C:I

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    add-int/2addr p4, v0

    int-to-float p4, p4

    iget-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->b:Landroid/graphics/Paint;

    invoke-virtual {p3, p2, p1, p4, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final h(FLandroid/graphics/Canvas;)V
    .locals 3

    iget-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->t0:Landroid/graphics/Matrix;

    iget v1, p0, Lco/bird/android/widget/RangeSeekBar;->W:I

    int-to-float v1, v1

    add-float/2addr p1, v1

    iget v1, p0, Lco/bird/android/widget/RangeSeekBar;->C:I

    int-to-float v1, v1

    iget v2, p0, Lco/bird/android/widget/RangeSeekBar;->i:F

    add-float/2addr v1, v2

    iget v2, p0, Lco/bird/android/widget/RangeSeekBar;->p0:I

    int-to-float v2, v2

    add-float/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v1, v2

    invoke-virtual {v0, p1, v1}, Landroid/graphics/Matrix;->setTranslate(FF)V

    iget-object p1, p0, Lco/bird/android/widget/RangeSeekBar;->s0:Landroid/graphics/Path;

    iget-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->r0:Landroid/graphics/Path;

    invoke-virtual {p1, v0}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    iget-object p1, p0, Lco/bird/android/widget/RangeSeekBar;->s0:Landroid/graphics/Path;

    iget-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->t0:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    iget-object p1, p0, Lco/bird/android/widget/RangeSeekBar;->s0:Landroid/graphics/Path;

    iget-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->c:Landroid/graphics/Paint;

    invoke-virtual {p2, p1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final i(F)Lco/bird/android/widget/RangeSeekBar$e;
    .locals 3

    iget-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->s:D

    invoke-virtual {p0, p1, v0, v1}, Lco/bird/android/widget/RangeSeekBar;->r(FD)Z

    move-result v0

    iget-wide v1, p0, Lco/bird/android/widget/RangeSeekBar;->t:D

    invoke-virtual {p0, p1, v1, v2}, Lco/bird/android/widget/RangeSeekBar;->r(FD)Z

    move-result v1

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    cmpl-float p1, p1, v0

    if-lez p1, :cond_0

    sget-object p1, Lco/bird/android/widget/RangeSeekBar$e;->b:Lco/bird/android/widget/RangeSeekBar$e;

    goto :goto_0

    :cond_0
    sget-object p1, Lco/bird/android/widget/RangeSeekBar$e;->c:Lco/bird/android/widget/RangeSeekBar$e;

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    sget-object p1, Lco/bird/android/widget/RangeSeekBar$e;->b:Lco/bird/android/widget/RangeSeekBar$e;

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    sget-object p1, Lco/bird/android/widget/RangeSeekBar$e;->c:Lco/bird/android/widget/RangeSeekBar$e;

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final j(Landroid/content/res/TypedArray;II)Ljava/lang/Number;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/TypedArray;",
            "II)TT;"
        }
    .end annotation

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    iget v0, v0, Landroid/util/TypedValue;->type:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    int-to-float p3, p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public k()Ljava/lang/Number;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lco/bird/android/widget/RangeSeekBar;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->l:Ljava/lang/Number;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->m:Ljava/lang/Number;

    :goto_0
    return-object v0
.end method

.method public l()Ljava/lang/Number;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lco/bird/android/widget/RangeSeekBar;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->m:Ljava/lang/Number;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->l:Ljava/lang/Number;

    :goto_0
    return-object v0
.end method

.method public final m()Ljava/lang/Number;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->s:D

    invoke-virtual {p0, v0, v1}, Lco/bird/android/widget/RangeSeekBar;->u(D)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lco/bird/android/widget/RangeSeekBar;->z(D)Ljava/lang/Number;

    move-result-object v0

    return-object v0
.end method

.method public n()Ljava/lang/Number;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lco/bird/android/widget/RangeSeekBar;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->m()Ljava/lang/Number;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->p()Ljava/lang/Number;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public o()Ljava/lang/Number;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lco/bird/android/widget/RangeSeekBar;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->p()Ljava/lang/Number;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->m()Ljava/lang/Number;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public declared-synchronized onDraw(Landroid/graphics/Canvas;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    monitor-enter p0

    :try_start_0
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/RangeSeekBar;->e()V

    iget-object v2, v1, Lco/bird/android/widget/RangeSeekBar;->b:Landroid/graphics/Paint;

    iget v3, v1, Lco/bird/android/widget/RangeSeekBar;->D:I

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v2, v1, Lco/bird/android/widget/RangeSeekBar;->b:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v2, v1, Lco/bird/android/widget/RangeSeekBar;->b:Landroid/graphics/Paint;

    iget v3, v1, Lco/bird/android/widget/RangeSeekBar;->S:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, v1, Lco/bird/android/widget/RangeSeekBar;->b:Landroid/graphics/Paint;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    iget v4, v1, Lco/bird/android/widget/RangeSeekBar;->h:F

    add-float/2addr v2, v4

    iput v2, v1, Lco/bird/android/widget/RangeSeekBar;->j:F

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    int-to-float v2, v2

    iget v4, v1, Lco/bird/android/widget/RangeSeekBar;->h:F

    add-float/2addr v2, v4

    iput v2, v1, Lco/bird/android/widget/RangeSeekBar;->k:F

    iget-object v2, v1, Lco/bird/android/widget/RangeSeekBar;->F:Landroid/graphics/RectF;

    iget v4, v1, Lco/bird/android/widget/RangeSeekBar;->j:F

    iput v4, v2, Landroid/graphics/RectF;->left:F

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    iget v5, v1, Lco/bird/android/widget/RangeSeekBar;->k:F

    sub-float/2addr v4, v5

    iput v4, v2, Landroid/graphics/RectF;->right:F

    iget-object v2, v1, Lco/bird/android/widget/RangeSeekBar;->F:Landroid/graphics/RectF;

    iget-object v4, v1, Lco/bird/android/widget/RangeSeekBar;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, v2, v4}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-wide v4, v1, Lco/bird/android/widget/RangeSeekBar;->s:D

    iget-wide v6, v1, Lco/bird/android/widget/RangeSeekBar;->u:D

    cmpg-double v2, v4, v6

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    if-gtz v2, :cond_0

    iget-wide v10, v1, Lco/bird/android/widget/RangeSeekBar;->t:D

    sub-double v6, v8, v6

    cmpl-double v2, v10, v6

    if-ltz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-boolean v2, v1, Lco/bird/android/widget/RangeSeekBar;->K:Z

    if-nez v2, :cond_1

    iget-boolean v2, v1, Lco/bird/android/widget/RangeSeekBar;->u0:Z

    if-nez v2, :cond_1

    if-eqz v3, :cond_1

    iget v2, v1, Lco/bird/android/widget/RangeSeekBar;->S:I

    goto :goto_1

    :cond_1
    iget v2, v1, Lco/bird/android/widget/RangeSeekBar;->R:I

    :goto_1
    iget-object v6, v1, Lco/bird/android/widget/RangeSeekBar;->F:Landroid/graphics/RectF;

    invoke-virtual {v1, v4, v5}, Lco/bird/android/widget/RangeSeekBar;->t(D)F

    move-result v4

    iput v4, v6, Landroid/graphics/RectF;->left:F

    iget-object v4, v1, Lco/bird/android/widget/RangeSeekBar;->F:Landroid/graphics/RectF;

    iget-wide v5, v1, Lco/bird/android/widget/RangeSeekBar;->t:D

    invoke-virtual {v1, v5, v6}, Lco/bird/android/widget/RangeSeekBar;->t(D)F

    move-result v5

    iput v5, v4, Landroid/graphics/RectF;->right:F

    iget-object v4, v1, Lco/bird/android/widget/RangeSeekBar;->b:Landroid/graphics/Paint;

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, v1, Lco/bird/android/widget/RangeSeekBar;->F:Landroid/graphics/RectF;

    iget-object v4, v1, Lco/bird/android/widget/RangeSeekBar;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, v2, v4}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-boolean v2, v1, Lco/bird/android/widget/RangeSeekBar;->J:Z

    if-nez v2, :cond_3

    iget-boolean v2, v1, Lco/bird/android/widget/RangeSeekBar;->U:Z

    if-eqz v2, :cond_2

    iget-wide v4, v1, Lco/bird/android/widget/RangeSeekBar;->s:D

    invoke-virtual {v1, v4, v5}, Lco/bird/android/widget/RangeSeekBar;->t(D)F

    move-result v2

    invoke-virtual {v1, v2, v0}, Lco/bird/android/widget/RangeSeekBar;->h(FLandroid/graphics/Canvas;)V

    :cond_2
    iget-wide v4, v1, Lco/bird/android/widget/RangeSeekBar;->s:D

    invoke-virtual {v1, v4, v5}, Lco/bird/android/widget/RangeSeekBar;->t(D)F

    move-result v2

    sget-object v4, Lco/bird/android/widget/RangeSeekBar$e;->b:Lco/bird/android/widget/RangeSeekBar$e;

    iget-object v5, v1, Lco/bird/android/widget/RangeSeekBar;->v:Lco/bird/android/widget/RangeSeekBar$e;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v1, v2, v4, v0, v3}, Lco/bird/android/widget/RangeSeekBar;->g(FZLandroid/graphics/Canvas;Z)V

    :cond_3
    iget-boolean v2, v1, Lco/bird/android/widget/RangeSeekBar;->U:Z

    if-eqz v2, :cond_4

    iget-wide v4, v1, Lco/bird/android/widget/RangeSeekBar;->t:D

    invoke-virtual {v1, v4, v5}, Lco/bird/android/widget/RangeSeekBar;->t(D)F

    move-result v2

    invoke-virtual {v1, v2, v0}, Lco/bird/android/widget/RangeSeekBar;->h(FLandroid/graphics/Canvas;)V

    :cond_4
    iget-wide v4, v1, Lco/bird/android/widget/RangeSeekBar;->t:D

    invoke-virtual {v1, v4, v5}, Lco/bird/android/widget/RangeSeekBar;->t(D)F

    move-result v2

    sget-object v4, Lco/bird/android/widget/RangeSeekBar$e;->c:Lco/bird/android/widget/RangeSeekBar$e;

    iget-object v5, v1, Lco/bird/android/widget/RangeSeekBar;->v:Lco/bird/android/widget/RangeSeekBar$e;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v1, v2, v4, v0, v3}, Lco/bird/android/widget/RangeSeekBar;->g(FZLandroid/graphics/Canvas;Z)V

    iget-boolean v2, v1, Lco/bird/android/widget/RangeSeekBar;->P:Z

    if-eqz v2, :cond_8

    iget-boolean v2, v1, Lco/bird/android/widget/RangeSeekBar;->u0:Z

    if-nez v2, :cond_5

    if-nez v3, :cond_8

    :cond_5
    iget-object v2, v1, Lco/bird/android/widget/RangeSeekBar;->b:Landroid/graphics/Paint;

    iget v3, v1, Lco/bird/android/widget/RangeSeekBar;->D:I

    int-to-float v3, v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v2, v1, Lco/bird/android/widget/RangeSeekBar;->b:Landroid/graphics/Paint;

    iget v3, v1, Lco/bird/android/widget/RangeSeekBar;->T:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, v1, Lco/bird/android/widget/RangeSeekBar;->o:Lco/bird/android/widget/RangeSeekBar$b;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/RangeSeekBar;->m()Ljava/lang/Number;

    move-result-object v3

    invoke-virtual {v2, v3}, Lco/bird/android/widget/RangeSeekBar$b;->d(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Lco/bird/android/widget/RangeSeekBar;->o:Lco/bird/android/widget/RangeSeekBar$b;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/RangeSeekBar;->p()Ljava/lang/Number;

    move-result-object v4

    invoke-virtual {v3, v4}, Lco/bird/android/widget/RangeSeekBar$b;->d(Ljava/lang/Number;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, v1, Lco/bird/android/widget/RangeSeekBar;->b:Landroid/graphics/Paint;

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v4

    iget-object v5, v1, Lco/bird/android/widget/RangeSeekBar;->b:Landroid/graphics/Paint;

    invoke-virtual {v5, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v5

    iget-wide v6, v1, Lco/bird/android/widget/RangeSeekBar;->s:D

    invoke-virtual {v1, v6, v7}, Lco/bird/android/widget/RangeSeekBar;->t(D)F

    move-result v6

    const/high16 v7, 0x3f000000    # 0.5f

    mul-float v10, v4, v7

    sub-float/2addr v6, v10

    const/4 v10, 0x0

    invoke-static {v10, v6}, Ljava/lang/Math;->max(FF)F

    move-result v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v11

    int-to-float v11, v11

    sub-float/2addr v11, v5

    iget-wide v12, v1, Lco/bird/android/widget/RangeSeekBar;->t:D

    invoke-virtual {v1, v12, v13}, Lco/bird/android/widget/RangeSeekBar;->t(D)F

    move-result v12

    mul-float/2addr v5, v7

    sub-float/2addr v12, v5

    invoke-static {v11, v12}, Ljava/lang/Math;->min(FF)F

    move-result v5

    iget-boolean v7, v1, Lco/bird/android/widget/RangeSeekBar;->J:Z

    if-nez v7, :cond_7

    add-float/2addr v4, v6

    sub-float/2addr v4, v5

    iget v7, v1, Lco/bird/android/widget/RangeSeekBar;->Q:I

    int-to-float v7, v7

    add-float/2addr v4, v7

    cmpl-float v7, v4, v10

    if-lez v7, :cond_6

    float-to-double v6, v6

    float-to-double v10, v4

    iget-wide v12, v1, Lco/bird/android/widget/RangeSeekBar;->s:D

    mul-double v14, v10, v12

    add-double v16, v12, v8

    iget-wide v8, v1, Lco/bird/android/widget/RangeSeekBar;->t:D

    sub-double v16, v16, v8

    div-double v14, v14, v16

    sub-double/2addr v6, v14

    double-to-float v6, v6

    float-to-double v4, v5

    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    sub-double v16, v14, v8

    mul-double v10, v10, v16

    add-double/2addr v12, v14

    sub-double/2addr v12, v8

    div-double/2addr v10, v12

    add-double/2addr v4, v10

    double-to-float v4, v4

    move v5, v4

    :cond_6
    iget v4, v1, Lco/bird/android/widget/RangeSeekBar;->E:I

    iget v7, v1, Lco/bird/android/widget/RangeSeekBar;->D:I

    add-int/2addr v4, v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    add-int/2addr v4, v7

    int-to-float v4, v4

    iget-object v7, v1, Lco/bird/android/widget/RangeSeekBar;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, v2, v6, v4, v7}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_7
    iget v2, v1, Lco/bird/android/widget/RangeSeekBar;->E:I

    iget v4, v1, Lco/bird/android/widget/RangeSeekBar;->D:I

    add-int/2addr v2, v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    add-int/2addr v2, v4

    int-to-float v2, v2

    iget-object v4, v1, Lco/bird/android/widget/RangeSeekBar;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, v3, v5, v2, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_8
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized onMeasure(II)V
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const/16 p1, 0xc8

    :goto_0
    iget-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->e:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    iget v1, p0, Lco/bird/android/widget/RangeSeekBar;->C:I

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    add-int/2addr v0, v1

    iget-boolean v1, p0, Lco/bird/android/widget/RangeSeekBar;->U:Z

    if-eqz v1, :cond_1

    iget v1, p0, Lco/bird/android/widget/RangeSeekBar;->p0:I

    iget v2, p0, Lco/bird/android/widget/RangeSeekBar;->q0:I

    add-int/2addr v1, v2

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    add-int/2addr v0, v1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result v0

    :cond_2
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    check-cast p1, Landroid/os/Bundle;

    const-string v0, "SUPER"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    const-string v0, "LEFT"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->s:D

    const-string v0, "RIGHT"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    iput-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->t:D

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "SUPER"

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "LEFT"

    iget-wide v2, p0, Lco/bird/android/widget/RangeSeekBar;->s:D

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    const-string v1, "RIGHT"

    iget-wide v2, p0, Lco/bird/android/widget/RangeSeekBar;->t:D

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    return-object v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/4 v2, 0x1

    if-eqz v0, :cond_b

    if-eq v0, v2, :cond_8

    const/4 v3, 0x2

    if-eq v0, v3, :cond_5

    const/4 v3, 0x3

    if-eq v0, v3, :cond_3

    const/4 v1, 0x5

    if-eq v0, v1, :cond_2

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {p0, p1}, Lco/bird/android/widget/RangeSeekBar;->v(Landroid/view/MotionEvent;)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto/16 :goto_2

    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    sub-int/2addr v0, v2

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    iput v1, p0, Lco/bird/android/widget/RangeSeekBar;->y:F

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Lco/bird/android/widget/RangeSeekBar;->z:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto/16 :goto_2

    :cond_3
    iget-boolean p1, p0, Lco/bird/android/widget/RangeSeekBar;->B:Z

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->x()V

    invoke-virtual {p0, v1}, Landroid/view/View;->setPressed(Z)V

    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto/16 :goto_2

    :cond_5
    iget-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->v:Lco/bird/android/widget/RangeSeekBar$e;

    if-eqz v0, :cond_d

    iget-boolean v0, p0, Lco/bird/android/widget/RangeSeekBar;->B:Z

    if-eqz v0, :cond_6

    invoke-virtual {p0, p1}, Lco/bird/android/widget/RangeSeekBar;->G(Landroid/view/MotionEvent;)V

    goto :goto_0

    :cond_6
    iget v0, p0, Lco/bird/android/widget/RangeSeekBar;->z:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    iget v1, p0, Lco/bird/android/widget/RangeSeekBar;->y:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Lco/bird/android/widget/RangeSeekBar;->A:I

    int-to-float v1, v1

    cmpl-float v0, v0, v1

    if-lez v0, :cond_7

    invoke-virtual {p0, v2}, Landroid/view/View;->setPressed(Z)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->w()V

    invoke-virtual {p0, p1}, Lco/bird/android/widget/RangeSeekBar;->G(Landroid/view/MotionEvent;)V

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->d()V

    :cond_7
    :goto_0
    iget-boolean p1, p0, Lco/bird/android/widget/RangeSeekBar;->w:Z

    if-eqz p1, :cond_d

    iget-object p1, p0, Lco/bird/android/widget/RangeSeekBar;->x:Lco/bird/android/widget/RangeSeekBar$c;

    if-eqz p1, :cond_d

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->m()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->p()Ljava/lang/Number;

    move-result-object v1

    invoke-interface {p1, p0, v0, v1}, Lco/bird/android/widget/RangeSeekBar$c;->a(Lco/bird/android/widget/RangeSeekBar;Ljava/lang/Number;Ljava/lang/Number;)V

    goto/16 :goto_2

    :cond_8
    iget-boolean v0, p0, Lco/bird/android/widget/RangeSeekBar;->B:Z

    if-eqz v0, :cond_9

    invoke-virtual {p0, p1}, Lco/bird/android/widget/RangeSeekBar;->G(Landroid/view/MotionEvent;)V

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->x()V

    invoke-virtual {p0, v1}, Landroid/view/View;->setPressed(Z)V

    goto :goto_1

    :cond_9
    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->w()V

    invoke-virtual {p0, p1}, Lco/bird/android/widget/RangeSeekBar;->G(Landroid/view/MotionEvent;)V

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->x()V

    :goto_1
    iget-object p1, p0, Lco/bird/android/widget/RangeSeekBar;->G:Lco/bird/android/widget/RangeSeekBar$d;

    sget-object v0, Lco/bird/android/widget/RangeSeekBar$d;->c:Lco/bird/android/widget/RangeSeekBar$d;

    if-ne p1, v0, :cond_a

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->m()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p0, p1}, Lco/bird/android/widget/RangeSeekBar;->H(Ljava/lang/Number;)D

    move-result-wide v0

    iput-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->s:D

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->p()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p0, p1}, Lco/bird/android/widget/RangeSeekBar;->H(Ljava/lang/Number;)D

    move-result-wide v0

    iput-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->t:D

    :cond_a
    const/4 p1, 0x0

    iput-object p1, p0, Lco/bird/android/widget/RangeSeekBar;->v:Lco/bird/android/widget/RangeSeekBar$e;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    iget-object p1, p0, Lco/bird/android/widget/RangeSeekBar;->x:Lco/bird/android/widget/RangeSeekBar$c;

    if-eqz p1, :cond_d

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->m()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->p()Ljava/lang/Number;

    move-result-object v1

    invoke-interface {p1, p0, v0, v1}, Lco/bird/android/widget/RangeSeekBar$c;->a(Lco/bird/android/widget/RangeSeekBar;Ljava/lang/Number;Ljava/lang/Number;)V

    goto :goto_2

    :cond_b
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    sub-int/2addr v0, v2

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lco/bird/android/widget/RangeSeekBar;->z:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    iput v0, p0, Lco/bird/android/widget/RangeSeekBar;->y:F

    invoke-virtual {p0, v0}, Lco/bird/android/widget/RangeSeekBar;->i(F)Lco/bird/android/widget/RangeSeekBar$e;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/widget/RangeSeekBar;->v:Lco/bird/android/widget/RangeSeekBar$e;

    if-nez v0, :cond_c

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_c
    invoke-virtual {p0, v2}, Landroid/view/View;->setPressed(Z)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->w()V

    invoke-virtual {p0, p1}, Lco/bird/android/widget/RangeSeekBar;->G(Landroid/view/MotionEvent;)V

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->d()V

    :cond_d
    :goto_2
    return v2
.end method

.method public p()Ljava/lang/Number;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->t:D

    invoke-virtual {p0, v0, v1}, Lco/bird/android/widget/RangeSeekBar;->u(D)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lco/bird/android/widget/RangeSeekBar;->z(D)Ljava/lang/Number;

    move-result-object v0

    return-object v0
.end method

.method public final q(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 13

    sget v0, Lsg4;->seek_thumb_normal:I

    sget v1, Lsg4;->seek_thumb_disabled:I

    const/16 v2, 0x4b

    const/4 v3, 0x0

    invoke-static {v2, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, LZf4;->range_seek_bar_deafult_shadow_y_offset:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v4

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, LZf4;->range_seek_bar_deafult_shadow_x_offset:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v5

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, LZf4;->range_seek_bar_deafult_shadow_blur:I

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v6

    sget-object v7, Lco/bird/android/widget/RangeSeekBar$d;->b:Lco/bird/android/widget/RangeSeekBar$d;

    iput-object v7, p0, Lco/bird/android/widget/RangeSeekBar;->G:Lco/bird/android/widget/RangeSeekBar$d;

    iput-boolean v3, p0, Lco/bird/android/widget/RangeSeekBar;->H:Z

    const/4 v7, 0x1

    iput-boolean v7, p0, Lco/bird/android/widget/RangeSeekBar;->I:Z

    iput-boolean v3, p0, Lco/bird/android/widget/RangeSeekBar;->J:Z

    iput-boolean v3, p0, Lco/bird/android/widget/RangeSeekBar;->K:Z

    iput-boolean v7, p0, Lco/bird/android/widget/RangeSeekBar;->P:Z

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    sget v9, LZf4;->range_seek_bar_text_lateral_padding:I

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v8

    iput v8, p0, Lco/bird/android/widget/RangeSeekBar;->Q:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    sget v9, LZf4;->range_seek_bar_line_height:I

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v8

    sget v9, LDf4;->colorPrimary:I

    invoke-static {p1, v9}, LNA0;->c(Landroid/content/Context;I)I

    move-result v9

    iput v9, p0, Lco/bird/android/widget/RangeSeekBar;->T:I

    sget v9, Lco/bird/android/widget/RangeSeekBar;->v0:I

    iput v9, p0, Lco/bird/android/widget/RangeSeekBar;->R:I

    const v9, -0x777778

    iput v9, p0, Lco/bird/android/widget/RangeSeekBar;->S:I

    iput-boolean v7, p0, Lco/bird/android/widget/RangeSeekBar;->u0:Z

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->D()V

    iput v5, p0, Lco/bird/android/widget/RangeSeekBar;->W:I

    iput v4, p0, Lco/bird/android/widget/RangeSeekBar;->p0:I

    iput v6, p0, Lco/bird/android/widget/RangeSeekBar;->q0:I

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v9

    sget-object v10, LNl4;->RangeSeekBar:[I

    invoke-virtual {v9, p2, v10, v3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    :try_start_0
    sget v9, LNl4;->RangeSeekBar_absoluteMinValue:I

    sget-object v10, Lco/bird/android/widget/RangeSeekBar;->x0:Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-virtual {p0, p2, v9, v10}, Lco/bird/android/widget/RangeSeekBar;->j(Landroid/content/res/TypedArray;II)Ljava/lang/Number;

    move-result-object v9

    sget v10, LNl4;->RangeSeekBar_absoluteMaxValue:I

    sget-object v11, Lco/bird/android/widget/RangeSeekBar;->y0:Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-virtual {p0, p2, v10, v11}, Lco/bird/android/widget/RangeSeekBar;->j(Landroid/content/res/TypedArray;II)Ljava/lang/Number;

    move-result-object v10

    sget v11, LNl4;->RangeSeekBar_step:I

    sget-object v12, Lco/bird/android/widget/RangeSeekBar;->z0:Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-virtual {p0, p2, v11, v12}, Lco/bird/android/widget/RangeSeekBar;->j(Landroid/content/res/TypedArray;II)Ljava/lang/Number;

    move-result-object v11

    invoke-virtual {p0, v9, v10, v11}, Lco/bird/android/widget/RangeSeekBar;->setRangeValues(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V

    invoke-static {}, Lco/bird/android/widget/RangeSeekBar$d;->values()[Lco/bird/android/widget/RangeSeekBar$d;

    move-result-object v9

    sget v10, LNl4;->RangeSeekBar_snapThumb:I

    iget-object v11, p0, Lco/bird/android/widget/RangeSeekBar;->G:Lco/bird/android/widget/RangeSeekBar$d;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    invoke-virtual {p2, v10, v11}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v10

    aget-object v9, v9, v10

    iput-object v9, p0, Lco/bird/android/widget/RangeSeekBar;->G:Lco/bird/android/widget/RangeSeekBar$d;

    sget v9, LNl4;->RangeSeekBar_allowCrossover:I

    iget-boolean v10, p0, Lco/bird/android/widget/RangeSeekBar;->I:Z

    invoke-virtual {p2, v9, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v9

    iput-boolean v9, p0, Lco/bird/android/widget/RangeSeekBar;->I:Z

    sget v9, LNl4;->RangeSeekBar_valuesAboveThumbs:I

    iget-boolean v10, p0, Lco/bird/android/widget/RangeSeekBar;->P:Z

    invoke-virtual {p2, v9, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v9

    iput-boolean v9, p0, Lco/bird/android/widget/RangeSeekBar;->P:Z

    sget v9, LNl4;->RangeSeekBar_textAboveThumbsColor:I

    iget v10, p0, Lco/bird/android/widget/RangeSeekBar;->T:I

    invoke-virtual {p2, v9, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v9

    iput v9, p0, Lco/bird/android/widget/RangeSeekBar;->T:I

    sget v9, LNl4;->RangeSeekBar_singleThumb:I

    iget-boolean v10, p0, Lco/bird/android/widget/RangeSeekBar;->J:Z

    invoke-virtual {p2, v9, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v9

    iput-boolean v9, p0, Lco/bird/android/widget/RangeSeekBar;->J:Z

    sget v9, LNl4;->RangeSeekBar_barHeight:I

    invoke-virtual {p2, v9, v8}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v8

    sget v9, LNl4;->RangeSeekBar_activeColor:I

    iget v10, p0, Lco/bird/android/widget/RangeSeekBar;->R:I

    invoke-virtual {p2, v9, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v9

    iput v9, p0, Lco/bird/android/widget/RangeSeekBar;->R:I

    sget v9, LNl4;->RangeSeekBar_defaultColor:I

    iget v10, p0, Lco/bird/android/widget/RangeSeekBar;->S:I

    invoke-virtual {p2, v9, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v9

    iput v9, p0, Lco/bird/android/widget/RangeSeekBar;->S:I

    sget v9, LNl4;->RangeSeekBar_alwaysActive:I

    iget-boolean v10, p0, Lco/bird/android/widget/RangeSeekBar;->K:Z

    invoke-virtual {p2, v9, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v9

    iput-boolean v9, p0, Lco/bird/android/widget/RangeSeekBar;->K:Z

    sget v9, LNl4;->RangeSeekBar_thumbNormal:I

    invoke-virtual {p2, v9}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    if-eqz v9, :cond_1

    invoke-static {v9}, LkU;->a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v9

    iput-object v9, p0, Lco/bird/android/widget/RangeSeekBar;->e:Landroid/graphics/Bitmap;

    :cond_1
    sget v9, LNl4;->RangeSeekBar_thumbDisabled:I

    invoke-virtual {p2, v9}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    if-eqz v9, :cond_2

    invoke-static {v9}, LkU;->a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v9

    iput-object v9, p0, Lco/bird/android/widget/RangeSeekBar;->g:Landroid/graphics/Bitmap;

    :cond_2
    sget v9, LNl4;->RangeSeekBar_thumbPressed:I

    invoke-virtual {p2, v9}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    if-eqz v9, :cond_3

    invoke-static {v9}, LkU;->a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v9

    iput-object v9, p0, Lco/bird/android/widget/RangeSeekBar;->f:Landroid/graphics/Bitmap;

    :cond_3
    sget v9, LNl4;->RangeSeekBar_thumbShadow:I

    invoke-virtual {p2, v9, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v9

    iput-boolean v9, p0, Lco/bird/android/widget/RangeSeekBar;->U:Z

    sget v9, LNl4;->RangeSeekBar_thumbShadowColor:I

    invoke-virtual {p2, v9, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    sget v9, LNl4;->RangeSeekBar_thumbShadowXOffset:I

    invoke-virtual {p2, v9, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    iput v5, p0, Lco/bird/android/widget/RangeSeekBar;->W:I

    sget v5, LNl4;->RangeSeekBar_thumbShadowYOffset:I

    invoke-virtual {p2, v5, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lco/bird/android/widget/RangeSeekBar;->p0:I

    sget v4, LNl4;->RangeSeekBar_thumbShadowBlur:I

    invoke-virtual {p2, v4, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    iput v4, p0, Lco/bird/android/widget/RangeSeekBar;->q0:I

    sget v4, LNl4;->RangeSeekBar_activateOnDefaultValues:I

    iget-boolean v5, p0, Lco/bird/android/widget/RangeSeekBar;->u0:Z

    invoke-virtual {p2, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, p0, Lco/bird/android/widget/RangeSeekBar;->u0:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    :goto_0
    iget-object p2, p0, Lco/bird/android/widget/RangeSeekBar;->e:Landroid/graphics/Bitmap;

    if-nez p2, :cond_4

    invoke-static {p1, v0}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-static {p2}, LkU;->a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p2

    iput-object p2, p0, Lco/bird/android/widget/RangeSeekBar;->e:Landroid/graphics/Bitmap;

    :cond_4
    iget-object p2, p0, Lco/bird/android/widget/RangeSeekBar;->f:Landroid/graphics/Bitmap;

    if-nez p2, :cond_5

    invoke-static {p1, v0}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-static {p2}, LkU;->a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p2

    iput-object p2, p0, Lco/bird/android/widget/RangeSeekBar;->f:Landroid/graphics/Bitmap;

    :cond_5
    iget-object p2, p0, Lco/bird/android/widget/RangeSeekBar;->g:Landroid/graphics/Bitmap;

    if-nez p2, :cond_6

    invoke-static {p1, v1}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-static {p2}, LkU;->a(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p2

    iput-object p2, p0, Lco/bird/android/widget/RangeSeekBar;->g:Landroid/graphics/Bitmap;

    :cond_6
    iget-object p2, p0, Lco/bird/android/widget/RangeSeekBar;->e:Landroid/graphics/Bitmap;

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p2

    int-to-float p2, p2

    const/high16 v0, 0x3f000000    # 0.5f

    mul-float/2addr p2, v0

    iput p2, p0, Lco/bird/android/widget/RangeSeekBar;->h:F

    iget-object p2, p0, Lco/bird/android/widget/RangeSeekBar;->e:Landroid/graphics/Bitmap;

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p2

    int-to-float p2, p2

    mul-float/2addr p2, v0

    iput p2, p0, Lco/bird/android/widget/RangeSeekBar;->i:F

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->E()V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget v0, LZf4;->range_seek_bar_text_default_size:I

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    iput p2, p0, Lco/bird/android/widget/RangeSeekBar;->D:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget v0, LZf4;->range_seek_bar_text_distance_to_top:I

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p2

    iput p2, p0, Lco/bird/android/widget/RangeSeekBar;->E:I

    iget-boolean p2, p0, Lco/bird/android/widget/RangeSeekBar;->P:Z

    if-nez p2, :cond_7

    goto :goto_1

    :cond_7
    iget p2, p0, Lco/bird/android/widget/RangeSeekBar;->D:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, LZf4;->range_seek_bar_text_distance_to_button:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p1

    add-int/2addr p2, p1

    iget p1, p0, Lco/bird/android/widget/RangeSeekBar;->E:I

    add-int v3, p2, p1

    :goto_1
    iput v3, p0, Lco/bird/android/widget/RangeSeekBar;->C:I

    new-instance p1, Landroid/graphics/RectF;

    iget p2, p0, Lco/bird/android/widget/RangeSeekBar;->j:F

    iget v0, p0, Lco/bird/android/widget/RangeSeekBar;->C:I

    int-to-float v0, v0

    iget v1, p0, Lco/bird/android/widget/RangeSeekBar;->i:F

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v8, v1

    sub-float/2addr v0, v8

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget v3, p0, Lco/bird/android/widget/RangeSeekBar;->k:F

    sub-float/2addr v1, v3

    iget v3, p0, Lco/bird/android/widget/RangeSeekBar;->C:I

    int-to-float v3, v3

    iget v4, p0, Lco/bird/android/widget/RangeSeekBar;->i:F

    add-float/2addr v3, v4

    add-float/2addr v3, v8

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v3, v4

    invoke-direct {p1, p2, v0, v1, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object p1, p0, Lco/bird/android/widget/RangeSeekBar;->F:Landroid/graphics/RectF;

    invoke-virtual {p0, v7}, Landroid/view/View;->setFocusable(Z)V

    invoke-virtual {p0, v7}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    iput p1, p0, Lco/bird/android/widget/RangeSeekBar;->A:I

    iget-boolean p1, p0, Lco/bird/android/widget/RangeSeekBar;->U:Z

    if-eqz p1, :cond_8

    const/4 p1, 0x0

    invoke-virtual {p0, v7, p1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    iget-object p1, p0, Lco/bird/android/widget/RangeSeekBar;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lco/bird/android/widget/RangeSeekBar;->c:Landroid/graphics/Paint;

    new-instance p2, Landroid/graphics/BlurMaskFilter;

    iget v0, p0, Lco/bird/android/widget/RangeSeekBar;->q0:I

    int-to-float v0, v0

    sget-object v1, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    invoke-direct {p2, v0, v1}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/RangeSeekBar;->r0:Landroid/graphics/Path;

    iget p2, p0, Lco/bird/android/widget/RangeSeekBar;->i:F

    sget-object v0, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v1, p2, v0}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    :cond_8
    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    throw p1
.end method

.method public final r(FD)Z
    .locals 0

    invoke-virtual {p0, p2, p3}, Lco/bird/android/widget/RangeSeekBar;->t(D)F

    move-result p2

    sub-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    iget p2, p0, Lco/bird/android/widget/RangeSeekBar;->h:F

    cmpg-float p1, p1, p2

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final s()Z
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public setNotifyWhileDragging(Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/widget/RangeSeekBar;->w:Z

    return-void
.end method

.method public setOnRangeSeekBarChangeListener(Lco/bird/android/widget/RangeSeekBar$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/widget/RangeSeekBar$c<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/widget/RangeSeekBar;->x:Lco/bird/android/widget/RangeSeekBar$c;

    return-void
.end method

.method public setRangeValues(Ljava/lang/Number;Ljava/lang/Number;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lco/bird/android/widget/RangeSeekBar;->d:Z

    if-eqz v0, :cond_0

    move-object v1, p2

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    iput-object v1, p0, Lco/bird/android/widget/RangeSeekBar;->l:Ljava/lang/Number;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p1, p2

    :goto_1
    iput-object p1, p0, Lco/bird/android/widget/RangeSeekBar;->m:Ljava/lang/Number;

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->E()V

    return-void
.end method

.method public setRangeValues(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;TT;)V"
        }
    .end annotation

    iput-object p3, p0, Lco/bird/android/widget/RangeSeekBar;->n:Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/widget/RangeSeekBar;->setRangeValues(Ljava/lang/Number;Ljava/lang/Number;)V

    return-void
.end method

.method public setSelectedMaxValue(Ljava/lang/Number;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->q:D

    iget-wide v2, p0, Lco/bird/android/widget/RangeSeekBar;->p:D

    sub-double/2addr v0, v2

    const-wide/16 v2, 0x0

    cmpl-double v0, v2, v0

    if-nez v0, :cond_1

    iget-boolean p1, p0, Lco/bird/android/widget/RangeSeekBar;->d:Z

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0, v1}, Lco/bird/android/widget/RangeSeekBar;->B(D)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0, v1}, Lco/bird/android/widget/RangeSeekBar;->C(D)V

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lco/bird/android/widget/RangeSeekBar;->d:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lco/bird/android/widget/RangeSeekBar;->H(Ljava/lang/Number;)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lco/bird/android/widget/RangeSeekBar;->B(D)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, Lco/bird/android/widget/RangeSeekBar;->H(Ljava/lang/Number;)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lco/bird/android/widget/RangeSeekBar;->C(D)V

    :goto_0
    return-void
.end method

.method public setSelectedMinValue(Ljava/lang/Number;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->q:D

    iget-wide v2, p0, Lco/bird/android/widget/RangeSeekBar;->p:D

    sub-double/2addr v0, v2

    const-wide/16 v2, 0x0

    cmpl-double v0, v2, v0

    if-nez v0, :cond_1

    iget-boolean p1, p0, Lco/bird/android/widget/RangeSeekBar;->d:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0, v2, v3}, Lco/bird/android/widget/RangeSeekBar;->C(D)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v2, v3}, Lco/bird/android/widget/RangeSeekBar;->B(D)V

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lco/bird/android/widget/RangeSeekBar;->d:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lco/bird/android/widget/RangeSeekBar;->H(Ljava/lang/Number;)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lco/bird/android/widget/RangeSeekBar;->C(D)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, Lco/bird/android/widget/RangeSeekBar;->H(Ljava/lang/Number;)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lco/bird/android/widget/RangeSeekBar;->B(D)V

    :goto_0
    return-void
.end method

.method public setTextAboveThumbsColor(I)V
    .locals 0

    iput p1, p0, Lco/bird/android/widget/RangeSeekBar;->T:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setTextAboveThumbsColorResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lco/bird/android/widget/RangeSeekBar;->setTextAboveThumbsColor(I)V

    return-void
.end method

.method public setThumbShadowPath(Landroid/graphics/Path;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/RangeSeekBar;->r0:Landroid/graphics/Path;

    return-void
.end method

.method public final t(D)F
    .locals 5

    iget v0, p0, Lco/bird/android/widget/RangeSeekBar;->j:F

    float-to-double v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lco/bird/android/widget/RangeSeekBar;->j:F

    iget v4, p0, Lco/bird/android/widget/RangeSeekBar;->k:F

    add-float/2addr v3, v4

    sub-float/2addr v2, v3

    float-to-double v2, v2

    mul-double/2addr p1, v2

    add-double/2addr v0, p1

    double-to-float p1, v0

    return p1
.end method

.method public final u(D)D
    .locals 4

    iget-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->p:D

    iget-wide v2, p0, Lco/bird/android/widget/RangeSeekBar;->q:D

    sub-double/2addr v2, v0

    mul-double/2addr p1, v2

    add-double/2addr v0, p1

    return-wide v0
.end method

.method public final v(Landroid/view/MotionEvent;)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const v1, 0xff00

    and-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iget v2, p0, Lco/bird/android/widget/RangeSeekBar;->z:I

    if-ne v1, v2, :cond_1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    iput v1, p0, Lco/bird/android/widget/RangeSeekBar;->y:F

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Lco/bird/android/widget/RangeSeekBar;->z:I

    :cond_1
    return-void
.end method

.method public w()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lco/bird/android/widget/RangeSeekBar;->B:Z

    return-void
.end method

.method public x()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lco/bird/android/widget/RangeSeekBar;->B:Z

    return-void
.end method

.method public final y(D)J
    .locals 2

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    add-double/2addr p1, v0

    double-to-long p1, p1

    return-wide p1
.end method

.method public final z(D)Ljava/lang/Number;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)TT;"
        }
    .end annotation

    iget-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->r:D

    div-double/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/widget/RangeSeekBar;->y(D)J

    move-result-wide p1

    long-to-double p1, p1

    iget-wide v0, p0, Lco/bird/android/widget/RangeSeekBar;->r:D

    mul-double v2, p1, v0

    iget-object p1, p0, Lco/bird/android/widget/RangeSeekBar;->o:Lco/bird/android/widget/RangeSeekBar$b;

    iget-wide v4, p0, Lco/bird/android/widget/RangeSeekBar;->p:D

    iget-wide v6, p0, Lco/bird/android/widget/RangeSeekBar;->q:D

    invoke-static/range {v2 .. v7}, Lco/bird/android/widget/RangeSeekBar;->f(DDD)D

    move-result-wide v0

    invoke-virtual {p0}, Lco/bird/android/widget/RangeSeekBar;->F()Z

    move-result p2

    invoke-virtual {p1, v0, v1, p2}, Lco/bird/android/widget/RangeSeekBar$b;->c(DZ)Ljava/lang/Number;

    move-result-object p1

    return-object p1
.end method
