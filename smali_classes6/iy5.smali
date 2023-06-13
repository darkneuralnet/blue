.class public Liy5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Liy5$c;,
        Liy5$b;
    }
.end annotation


# static fields
.field public static final m:LNC0;


# instance fields
.field public a:LQC0;

.field public b:LQC0;

.field public c:LQC0;

.field public d:LQC0;

.field public e:LNC0;

.field public f:LNC0;

.field public g:LNC0;

.field public h:LNC0;

.field public i:LL91;

.field public j:LL91;

.field public k:LL91;

.field public l:LL91;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LYt4;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-direct {v0, v1}, LYt4;-><init>(F)V

    sput-object v0, Liy5;->m:LNC0;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LQM2;->b()LQC0;

    move-result-object v0

    iput-object v0, p0, Liy5;->a:LQC0;

    invoke-static {}, LQM2;->b()LQC0;

    move-result-object v0

    iput-object v0, p0, Liy5;->b:LQC0;

    invoke-static {}, LQM2;->b()LQC0;

    move-result-object v0

    iput-object v0, p0, Liy5;->c:LQC0;

    invoke-static {}, LQM2;->b()LQC0;

    move-result-object v0

    iput-object v0, p0, Liy5;->d:LQC0;

    new-instance v0, Lf0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf0;-><init>(F)V

    iput-object v0, p0, Liy5;->e:LNC0;

    new-instance v0, Lf0;

    invoke-direct {v0, v1}, Lf0;-><init>(F)V

    iput-object v0, p0, Liy5;->f:LNC0;

    new-instance v0, Lf0;

    invoke-direct {v0, v1}, Lf0;-><init>(F)V

    iput-object v0, p0, Liy5;->g:LNC0;

    new-instance v0, Lf0;

    invoke-direct {v0, v1}, Lf0;-><init>(F)V

    iput-object v0, p0, Liy5;->h:LNC0;

    invoke-static {}, LQM2;->c()LL91;

    move-result-object v0

    iput-object v0, p0, Liy5;->i:LL91;

    invoke-static {}, LQM2;->c()LL91;

    move-result-object v0

    iput-object v0, p0, Liy5;->j:LL91;

    invoke-static {}, LQM2;->c()LL91;

    move-result-object v0

    iput-object v0, p0, Liy5;->k:LL91;

    invoke-static {}, LQM2;->c()LL91;

    move-result-object v0

    iput-object v0, p0, Liy5;->l:LL91;

    return-void
.end method

.method public constructor <init>(Liy5$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Liy5$b;->a(Liy5$b;)LQC0;

    move-result-object v0

    iput-object v0, p0, Liy5;->a:LQC0;

    invoke-static {p1}, Liy5$b;->e(Liy5$b;)LQC0;

    move-result-object v0

    iput-object v0, p0, Liy5;->b:LQC0;

    invoke-static {p1}, Liy5$b;->f(Liy5$b;)LQC0;

    move-result-object v0

    iput-object v0, p0, Liy5;->c:LQC0;

    invoke-static {p1}, Liy5$b;->g(Liy5$b;)LQC0;

    move-result-object v0

    iput-object v0, p0, Liy5;->d:LQC0;

    invoke-static {p1}, Liy5$b;->h(Liy5$b;)LNC0;

    move-result-object v0

    iput-object v0, p0, Liy5;->e:LNC0;

    invoke-static {p1}, Liy5$b;->i(Liy5$b;)LNC0;

    move-result-object v0

    iput-object v0, p0, Liy5;->f:LNC0;

    invoke-static {p1}, Liy5$b;->j(Liy5$b;)LNC0;

    move-result-object v0

    iput-object v0, p0, Liy5;->g:LNC0;

    invoke-static {p1}, Liy5$b;->k(Liy5$b;)LNC0;

    move-result-object v0

    iput-object v0, p0, Liy5;->h:LNC0;

    invoke-static {p1}, Liy5$b;->l(Liy5$b;)LL91;

    move-result-object v0

    iput-object v0, p0, Liy5;->i:LL91;

    invoke-static {p1}, Liy5$b;->b(Liy5$b;)LL91;

    move-result-object v0

    iput-object v0, p0, Liy5;->j:LL91;

    invoke-static {p1}, Liy5$b;->c(Liy5$b;)LL91;

    move-result-object v0

    iput-object v0, p0, Liy5;->k:LL91;

    invoke-static {p1}, Liy5$b;->d(Liy5$b;)LL91;

    move-result-object p1

    iput-object p1, p0, Liy5;->l:LL91;

    return-void
.end method

.method public synthetic constructor <init>(Liy5$b;Liy5$a;)V
    .locals 0

    invoke-direct {p0, p1}, Liy5;-><init>(Liy5$b;)V

    return-void
.end method

.method public static a()Liy5$b;
    .locals 1

    new-instance v0, Liy5$b;

    invoke-direct {v0}, Liy5$b;-><init>()V

    return-object v0
.end method

.method public static b(Landroid/content/Context;II)Liy5$b;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Liy5;->c(Landroid/content/Context;III)Liy5$b;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/Context;III)Liy5$b;
    .locals 1

    new-instance v0, Lf0;

    int-to-float p3, p3

    invoke-direct {v0, p3}, Lf0;-><init>(F)V

    invoke-static {p0, p1, p2, v0}, Liy5;->d(Landroid/content/Context;IILNC0;)Liy5$b;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/content/Context;IILNC0;)Liy5$b;
    .locals 6

    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-direct {v0, p0, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    if-eqz p2, :cond_0

    new-instance p0, Landroid/view/ContextThemeWrapper;

    invoke-direct {p0, v0, p2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    move-object v0, p0

    :cond_0
    sget-object p0, LXl4;->ShapeAppearance:[I

    invoke-virtual {v0, p0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object p0

    :try_start_0
    sget p1, LXl4;->ShapeAppearance_cornerFamily:I

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    sget p2, LXl4;->ShapeAppearance_cornerFamilyTopLeft:I

    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    sget v0, LXl4;->ShapeAppearance_cornerFamilyTopRight:I

    invoke-virtual {p0, v0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    sget v1, LXl4;->ShapeAppearance_cornerFamilyBottomRight:I

    invoke-virtual {p0, v1, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    sget v2, LXl4;->ShapeAppearance_cornerFamilyBottomLeft:I

    invoke-virtual {p0, v2, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    sget v2, LXl4;->ShapeAppearance_cornerSize:I

    invoke-static {p0, v2, p3}, Liy5;->m(Landroid/content/res/TypedArray;ILNC0;)LNC0;

    move-result-object p3

    sget v2, LXl4;->ShapeAppearance_cornerSizeTopLeft:I

    invoke-static {p0, v2, p3}, Liy5;->m(Landroid/content/res/TypedArray;ILNC0;)LNC0;

    move-result-object v2

    sget v3, LXl4;->ShapeAppearance_cornerSizeTopRight:I

    invoke-static {p0, v3, p3}, Liy5;->m(Landroid/content/res/TypedArray;ILNC0;)LNC0;

    move-result-object v3

    sget v4, LXl4;->ShapeAppearance_cornerSizeBottomRight:I

    invoke-static {p0, v4, p3}, Liy5;->m(Landroid/content/res/TypedArray;ILNC0;)LNC0;

    move-result-object v4

    sget v5, LXl4;->ShapeAppearance_cornerSizeBottomLeft:I

    invoke-static {p0, v5, p3}, Liy5;->m(Landroid/content/res/TypedArray;ILNC0;)LNC0;

    move-result-object p3

    new-instance v5, Liy5$b;

    invoke-direct {v5}, Liy5$b;-><init>()V

    invoke-virtual {v5, p2, v2}, Liy5$b;->E(ILNC0;)Liy5$b;

    move-result-object p2

    invoke-virtual {p2, v0, v3}, Liy5$b;->I(ILNC0;)Liy5$b;

    move-result-object p2

    invoke-virtual {p2, v1, v4}, Liy5$b;->z(ILNC0;)Liy5$b;

    move-result-object p2

    invoke-virtual {p2, p1, p3}, Liy5$b;->u(ILNC0;)Liy5$b;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    throw p1
.end method

.method public static e(Landroid/content/Context;Landroid/util/AttributeSet;II)Liy5$b;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, p3, v0}, Liy5;->f(Landroid/content/Context;Landroid/util/AttributeSet;III)Liy5$b;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;Landroid/util/AttributeSet;III)Liy5$b;
    .locals 1

    new-instance v0, Lf0;

    int-to-float p4, p4

    invoke-direct {v0, p4}, Lf0;-><init>(F)V

    invoke-static {p0, p1, p2, p3, v0}, Liy5;->g(Landroid/content/Context;Landroid/util/AttributeSet;IILNC0;)Liy5$b;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/content/Context;Landroid/util/AttributeSet;IILNC0;)Liy5$b;
    .locals 1

    sget-object v0, LXl4;->MaterialShape:[I

    invoke-virtual {p0, p1, v0, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    sget p2, LXl4;->MaterialShape_shapeAppearance:I

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    sget v0, LXl4;->MaterialShape_shapeAppearanceOverlay:I

    invoke-virtual {p1, v0, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-static {p0, p2, p3, p4}, Liy5;->d(Landroid/content/Context;IILNC0;)Liy5$b;

    move-result-object p0

    return-object p0
.end method

.method public static m(Landroid/content/res/TypedArray;ILNC0;)LNC0;
    .locals 2

    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    iget v0, p1, Landroid/util/TypedValue;->type:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    new-instance p2, Lf0;

    iget p1, p1, Landroid/util/TypedValue;->data:I

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result p0

    int-to-float p0, p0

    invoke-direct {p2, p0}, Lf0;-><init>(F)V

    return-object p2

    :cond_1
    const/4 p0, 0x6

    if-ne v0, p0, :cond_2

    new-instance p0, LYt4;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2, p2}, Landroid/util/TypedValue;->getFraction(FF)F

    move-result p1

    invoke-direct {p0, p1}, LYt4;-><init>(F)V

    return-object p0

    :cond_2
    return-object p2
.end method


# virtual methods
.method public h()LL91;
    .locals 1

    iget-object v0, p0, Liy5;->k:LL91;

    return-object v0
.end method

.method public i()LQC0;
    .locals 1

    iget-object v0, p0, Liy5;->d:LQC0;

    return-object v0
.end method

.method public j()LNC0;
    .locals 1

    iget-object v0, p0, Liy5;->h:LNC0;

    return-object v0
.end method

.method public k()LQC0;
    .locals 1

    iget-object v0, p0, Liy5;->c:LQC0;

    return-object v0
.end method

.method public l()LNC0;
    .locals 1

    iget-object v0, p0, Liy5;->g:LNC0;

    return-object v0
.end method

.method public n()LL91;
    .locals 1

    iget-object v0, p0, Liy5;->l:LL91;

    return-object v0
.end method

.method public o()LL91;
    .locals 1

    iget-object v0, p0, Liy5;->j:LL91;

    return-object v0
.end method

.method public p()LL91;
    .locals 1

    iget-object v0, p0, Liy5;->i:LL91;

    return-object v0
.end method

.method public q()LQC0;
    .locals 1

    iget-object v0, p0, Liy5;->a:LQC0;

    return-object v0
.end method

.method public r()LNC0;
    .locals 1

    iget-object v0, p0, Liy5;->e:LNC0;

    return-object v0
.end method

.method public s()LQC0;
    .locals 1

    iget-object v0, p0, Liy5;->b:LQC0;

    return-object v0
.end method

.method public t()LNC0;
    .locals 1

    iget-object v0, p0, Liy5;->f:LNC0;

    return-object v0
.end method

.method public u(Landroid/graphics/RectF;)Z
    .locals 5

    iget-object v0, p0, Liy5;->l:LL91;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, LL91;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Liy5;->j:LL91;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Liy5;->i:LL91;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Liy5;->k:LL91;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    iget-object v1, p0, Liy5;->e:LNC0;

    invoke-interface {v1, p1}, LNC0;->a(Landroid/graphics/RectF;)F

    move-result v1

    iget-object v4, p0, Liy5;->f:LNC0;

    invoke-interface {v4, p1}, LNC0;->a(Landroid/graphics/RectF;)F

    move-result v4

    cmpl-float v4, v4, v1

    if-nez v4, :cond_1

    iget-object v4, p0, Liy5;->h:LNC0;

    invoke-interface {v4, p1}, LNC0;->a(Landroid/graphics/RectF;)F

    move-result v4

    cmpl-float v4, v4, v1

    if-nez v4, :cond_1

    iget-object v4, p0, Liy5;->g:LNC0;

    invoke-interface {v4, p1}, LNC0;->a(Landroid/graphics/RectF;)F

    move-result p1

    cmpl-float p1, p1, v1

    if-nez p1, :cond_1

    move p1, v2

    goto :goto_1

    :cond_1
    move p1, v3

    :goto_1
    iget-object v1, p0, Liy5;->b:LQC0;

    instance-of v1, v1, Ldc5;

    if-eqz v1, :cond_2

    iget-object v1, p0, Liy5;->a:LQC0;

    instance-of v1, v1, Ldc5;

    if-eqz v1, :cond_2

    iget-object v1, p0, Liy5;->c:LQC0;

    instance-of v1, v1, Ldc5;

    if-eqz v1, :cond_2

    iget-object v1, p0, Liy5;->d:LQC0;

    instance-of v1, v1, Ldc5;

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    move v1, v3

    :goto_2
    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    if-eqz v1, :cond_3

    goto :goto_3

    :cond_3
    move v2, v3

    :goto_3
    return v2
.end method

.method public v()Liy5$b;
    .locals 1

    new-instance v0, Liy5$b;

    invoke-direct {v0, p0}, Liy5$b;-><init>(Liy5;)V

    return-object v0
.end method

.method public w(F)Liy5;
    .locals 1

    invoke-virtual {p0}, Liy5;->v()Liy5$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Liy5$b;->o(F)Liy5$b;

    move-result-object p1

    invoke-virtual {p1}, Liy5$b;->m()Liy5;

    move-result-object p1

    return-object p1
.end method

.method public x(LNC0;)Liy5;
    .locals 1

    invoke-virtual {p0}, Liy5;->v()Liy5$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Liy5$b;->p(LNC0;)Liy5$b;

    move-result-object p1

    invoke-virtual {p1}, Liy5$b;->m()Liy5;

    move-result-object p1

    return-object p1
.end method

.method public y(Liy5$c;)Liy5;
    .locals 2

    invoke-virtual {p0}, Liy5;->v()Liy5$b;

    move-result-object v0

    invoke-virtual {p0}, Liy5;->r()LNC0;

    move-result-object v1

    invoke-interface {p1, v1}, Liy5$c;->a(LNC0;)LNC0;

    move-result-object v1

    invoke-virtual {v0, v1}, Liy5$b;->H(LNC0;)Liy5$b;

    move-result-object v0

    invoke-virtual {p0}, Liy5;->t()LNC0;

    move-result-object v1

    invoke-interface {p1, v1}, Liy5$c;->a(LNC0;)LNC0;

    move-result-object v1

    invoke-virtual {v0, v1}, Liy5$b;->L(LNC0;)Liy5$b;

    move-result-object v0

    invoke-virtual {p0}, Liy5;->j()LNC0;

    move-result-object v1

    invoke-interface {p1, v1}, Liy5$c;->a(LNC0;)LNC0;

    move-result-object v1

    invoke-virtual {v0, v1}, Liy5$b;->x(LNC0;)Liy5$b;

    move-result-object v0

    invoke-virtual {p0}, Liy5;->l()LNC0;

    move-result-object v1

    invoke-interface {p1, v1}, Liy5$c;->a(LNC0;)LNC0;

    move-result-object p1

    invoke-virtual {v0, p1}, Liy5$b;->C(LNC0;)Liy5$b;

    move-result-object p1

    invoke-virtual {p1}, Liy5$b;->m()Liy5;

    move-result-object p1

    return-object p1
.end method
