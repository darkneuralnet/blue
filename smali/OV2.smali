.class public LOV2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "LXj2;",
            ">;"
        }
    .end annotation
.end field

.field public B:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "LLt6;",
            ">;"
        }
    .end annotation
.end field

.field public C:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "LGt6;",
            ">;"
        }
    .end annotation
.end field

.field public D:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lvs6;",
            ">;"
        }
    .end annotation
.end field

.field public E:[LNk2;

.field public F:I

.field public G:I

.field public H:Landroid/view/View;

.field public I:I

.field public J:F

.field public K:Landroid/view/animation/Interpolator;

.field public L:Z

.field public a:Landroid/graphics/Rect;

.field public b:Landroid/view/View;

.field public c:I

.field public d:Z

.field public e:Ljava/lang/String;

.field public f:I

.field public g:LXV2;

.field public h:LXV2;

.field public i:LNV2;

.field public j:LNV2;

.field public k:[LiF0;

.field public l:LiF0;

.field public m:F

.field public n:F

.field public o:F

.field public p:F

.field public q:F

.field public r:[I

.field public s:[D

.field public t:[D

.field public u:[Ljava/lang/String;

.field public v:[I

.field public w:I

.field public x:[F

.field public y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "LXV2;",
            ">;"
        }
    .end annotation
.end field

.field public z:[F


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, LOV2;->a:Landroid/graphics/Rect;

    const/4 v0, 0x0

    iput-boolean v0, p0, LOV2;->d:Z

    const/4 v1, -0x1

    iput v1, p0, LOV2;->f:I

    new-instance v1, LXV2;

    invoke-direct {v1}, LXV2;-><init>()V

    iput-object v1, p0, LOV2;->g:LXV2;

    new-instance v1, LXV2;

    invoke-direct {v1}, LXV2;-><init>()V

    iput-object v1, p0, LOV2;->h:LXV2;

    new-instance v1, LNV2;

    invoke-direct {v1}, LNV2;-><init>()V

    iput-object v1, p0, LOV2;->i:LNV2;

    new-instance v1, LNV2;

    invoke-direct {v1}, LNV2;-><init>()V

    iput-object v1, p0, LOV2;->j:LNV2;

    const/high16 v1, 0x7fc00000    # Float.NaN

    iput v1, p0, LOV2;->m:F

    const/4 v2, 0x0

    iput v2, p0, LOV2;->n:F

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, p0, LOV2;->o:F

    const/4 v2, 0x4

    iput v2, p0, LOV2;->w:I

    new-array v2, v2, [F

    iput-object v2, p0, LOV2;->x:[F

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, LOV2;->y:Ljava/util/ArrayList;

    const/4 v2, 0x1

    new-array v2, v2, [F

    iput-object v2, p0, LOV2;->z:[F

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, LOV2;->A:Ljava/util/ArrayList;

    sget v2, LXj2;->f:I

    iput v2, p0, LOV2;->F:I

    iput v2, p0, LOV2;->G:I

    const/4 v3, 0x0

    iput-object v3, p0, LOV2;->H:Landroid/view/View;

    iput v2, p0, LOV2;->I:I

    iput v1, p0, LOV2;->J:F

    iput-object v3, p0, LOV2;->K:Landroid/view/animation/Interpolator;

    iput-boolean v0, p0, LOV2;->L:Z

    invoke-virtual {p0, p1}, LOV2;->H(Landroid/view/View;)V

    return-void
.end method

.method public static p(Landroid/content/Context;ILjava/lang/String;I)Landroid/view/animation/Interpolator;
    .locals 1

    const/4 v0, -0x2

    if-eq p1, v0, :cond_6

    const/4 p0, -0x1

    if-eq p1, p0, :cond_5

    if-eqz p1, :cond_4

    const/4 p0, 0x1

    if-eq p1, p0, :cond_3

    const/4 p0, 0x2

    if-eq p1, p0, :cond_2

    const/4 p0, 0x4

    if-eq p1, p0, :cond_1

    const/4 p0, 0x5

    if-eq p1, p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance p0, Landroid/view/animation/OvershootInterpolator;

    invoke-direct {p0}, Landroid/view/animation/OvershootInterpolator;-><init>()V

    return-object p0

    :cond_1
    new-instance p0, Landroid/view/animation/BounceInterpolator;

    invoke-direct {p0}, Landroid/view/animation/BounceInterpolator;-><init>()V

    return-object p0

    :cond_2
    new-instance p0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {p0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    return-object p0

    :cond_3
    new-instance p0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {p0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    return-object p0

    :cond_4
    new-instance p0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {p0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    return-object p0

    :cond_5
    invoke-static {p2}, Lg91;->c(Ljava/lang/String;)Lg91;

    move-result-object p0

    new-instance p1, LOV2$a;

    invoke-direct {p1, p0}, LOV2$a;-><init>(Lg91;)V

    return-object p1

    :cond_6
    invoke-static {p0, p3}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A(Landroid/graphics/Rect;Landroid/graphics/Rect;III)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-eq p3, v0, :cond_3

    if-eq p3, v1, :cond_2

    const/4 v0, 0x3

    if-eq p3, v0, :cond_1

    const/4 p5, 0x4

    if-eq p3, p5, :cond_0

    goto/16 :goto_0

    :cond_0
    iget p3, p1, Landroid/graphics/Rect;->left:I

    iget p5, p1, Landroid/graphics/Rect;->right:I

    add-int/2addr p3, p5

    iget p5, p1, Landroid/graphics/Rect;->bottom:I

    iget v0, p1, Landroid/graphics/Rect;->top:I

    add-int/2addr p5, v0

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    add-int/2addr p5, v0

    div-int/2addr p5, v1

    sub-int/2addr p4, p5

    iput p4, p2, Landroid/graphics/Rect;->left:I

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p4

    sub-int/2addr p3, p4

    div-int/2addr p3, v1

    iput p3, p2, Landroid/graphics/Rect;->top:I

    iget p3, p2, Landroid/graphics/Rect;->left:I

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p4

    add-int/2addr p3, p4

    iput p3, p2, Landroid/graphics/Rect;->right:I

    iget p3, p2, Landroid/graphics/Rect;->top:I

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    add-int/2addr p3, p1

    iput p3, p2, Landroid/graphics/Rect;->bottom:I

    goto/16 :goto_0

    :cond_1
    iget p3, p1, Landroid/graphics/Rect;->left:I

    iget p4, p1, Landroid/graphics/Rect;->right:I

    add-int/2addr p3, p4

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p4

    div-int/2addr p4, v1

    iget v0, p1, Landroid/graphics/Rect;->top:I

    add-int/2addr p4, v0

    div-int/lit8 v0, p3, 0x2

    sub-int/2addr p4, v0

    iput p4, p2, Landroid/graphics/Rect;->left:I

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p4

    add-int/2addr p3, p4

    div-int/2addr p3, v1

    sub-int/2addr p5, p3

    iput p5, p2, Landroid/graphics/Rect;->top:I

    iget p3, p2, Landroid/graphics/Rect;->left:I

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p4

    add-int/2addr p3, p4

    iput p3, p2, Landroid/graphics/Rect;->right:I

    iget p3, p2, Landroid/graphics/Rect;->top:I

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    add-int/2addr p3, p1

    iput p3, p2, Landroid/graphics/Rect;->bottom:I

    goto :goto_0

    :cond_2
    iget p3, p1, Landroid/graphics/Rect;->left:I

    iget p5, p1, Landroid/graphics/Rect;->right:I

    add-int/2addr p3, p5

    iget p5, p1, Landroid/graphics/Rect;->top:I

    iget v0, p1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p5, v0

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    add-int/2addr p5, v0

    div-int/2addr p5, v1

    sub-int/2addr p4, p5

    iput p4, p2, Landroid/graphics/Rect;->left:I

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p4

    sub-int/2addr p3, p4

    div-int/2addr p3, v1

    iput p3, p2, Landroid/graphics/Rect;->top:I

    iget p3, p2, Landroid/graphics/Rect;->left:I

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p4

    add-int/2addr p3, p4

    iput p3, p2, Landroid/graphics/Rect;->right:I

    iget p3, p2, Landroid/graphics/Rect;->top:I

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    add-int/2addr p3, p1

    iput p3, p2, Landroid/graphics/Rect;->bottom:I

    goto :goto_0

    :cond_3
    iget p3, p1, Landroid/graphics/Rect;->left:I

    iget p4, p1, Landroid/graphics/Rect;->right:I

    add-int/2addr p3, p4

    iget p4, p1, Landroid/graphics/Rect;->top:I

    iget v0, p1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p4, v0

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    sub-int/2addr p4, v0

    div-int/2addr p4, v1

    iput p4, p2, Landroid/graphics/Rect;->left:I

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p4

    add-int/2addr p3, p4

    div-int/2addr p3, v1

    sub-int/2addr p5, p3

    iput p5, p2, Landroid/graphics/Rect;->top:I

    iget p3, p2, Landroid/graphics/Rect;->left:I

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p4

    add-int/2addr p3, p4

    iput p3, p2, Landroid/graphics/Rect;->right:I

    iget p3, p2, Landroid/graphics/Rect;->top:I

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    add-int/2addr p3, p1

    iput p3, p2, Landroid/graphics/Rect;->bottom:I

    :goto_0
    return-void
.end method

.method public B(Landroid/view/View;)V
    .locals 5

    iget-object v0, p0, LOV2;->g:LXV2;

    const/4 v1, 0x0

    iput v1, v0, LXV2;->d:F

    iput v1, v0, LXV2;->e:F

    const/4 v1, 0x1

    iput-boolean v1, p0, LOV2;->L:Z

    invoke-virtual {p1}, Landroid/view/View;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getY()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v0, v1, v2, v3, v4}, LXV2;->p(FFFF)V

    iget-object v0, p0, LOV2;->h:LXV2;

    invoke-virtual {p1}, Landroid/view/View;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getY()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v0, v1, v2, v3, v4}, LXV2;->p(FFFF)V

    iget-object v0, p0, LOV2;->i:LNV2;

    invoke-virtual {v0, p1}, LNV2;->j(Landroid/view/View;)V

    iget-object v0, p0, LOV2;->j:LNV2;

    invoke-virtual {v0, p1}, LNV2;->j(Landroid/view/View;)V

    return-void
.end method

.method public C(Landroid/graphics/Rect;Landroidx/constraintlayout/widget/b;II)V
    .locals 7

    iget v6, p2, Landroidx/constraintlayout/widget/b;->d:I

    if-eqz v6, :cond_0

    iget-object v2, p0, LOV2;->a:Landroid/graphics/Rect;

    move-object v0, p0

    move-object v1, p1

    move v3, v6

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, LOV2;->A(Landroid/graphics/Rect;Landroid/graphics/Rect;III)V

    iget-object p1, p0, LOV2;->a:Landroid/graphics/Rect;

    :cond_0
    iget-object p3, p0, LOV2;->h:LXV2;

    const/high16 p4, 0x3f800000    # 1.0f

    iput p4, p3, LXV2;->d:F

    iput p4, p3, LXV2;->e:F

    invoke-virtual {p0, p3}, LOV2;->y(LXV2;)V

    iget-object p3, p0, LOV2;->h:LXV2;

    iget p4, p1, Landroid/graphics/Rect;->left:I

    int-to-float p4, p4

    iget v0, p1, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p3, p4, v0, v1, v2}, LXV2;->p(FFFF)V

    iget-object p3, p0, LOV2;->h:LXV2;

    iget p4, p0, LOV2;->c:I

    invoke-virtual {p2, p4}, Landroidx/constraintlayout/widget/b;->A(I)Landroidx/constraintlayout/widget/b$a;

    move-result-object p4

    invoke-virtual {p3, p4}, LXV2;->a(Landroidx/constraintlayout/widget/b$a;)V

    iget-object p3, p0, LOV2;->j:LNV2;

    iget p4, p0, LOV2;->c:I

    invoke-virtual {p3, p1, p2, v6, p4}, LNV2;->i(Landroid/graphics/Rect;Landroidx/constraintlayout/widget/b;II)V

    return-void
.end method

.method public D(I)V
    .locals 0

    iput p1, p0, LOV2;->F:I

    return-void
.end method

.method public E(Landroid/view/View;)V
    .locals 5

    iget-object v0, p0, LOV2;->g:LXV2;

    const/4 v1, 0x0

    iput v1, v0, LXV2;->d:F

    iput v1, v0, LXV2;->e:F

    invoke-virtual {p1}, Landroid/view/View;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getY()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v0, v1, v2, v3, v4}, LXV2;->p(FFFF)V

    iget-object v0, p0, LOV2;->i:LNV2;

    invoke-virtual {v0, p1}, LNV2;->j(Landroid/view/View;)V

    return-void
.end method

.method public F(LHt6;Landroid/view/View;III)V
    .locals 4

    iget-object v0, p0, LOV2;->g:LXV2;

    const/4 v1, 0x0

    iput v1, v0, LXV2;->d:F

    iput v1, v0, LXV2;->e:F

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq p3, v1, :cond_1

    if-eq p3, v2, :cond_0

    goto :goto_0

    :cond_0
    iget p4, p1, LHt6;->b:I

    iget v1, p1, LHt6;->d:I

    add-int/2addr p4, v1

    iget v1, p1, LHt6;->c:I

    iget v3, p1, LHt6;->e:I

    add-int/2addr v1, v3

    invoke-virtual {p1}, LHt6;->b()I

    move-result v3

    add-int/2addr v1, v3

    div-int/2addr v1, v2

    sub-int/2addr p5, v1

    iput p5, v0, Landroid/graphics/Rect;->left:I

    invoke-virtual {p1}, LHt6;->a()I

    move-result p5

    sub-int/2addr p4, p5

    div-int/2addr p4, v2

    iput p4, v0, Landroid/graphics/Rect;->top:I

    iget p4, v0, Landroid/graphics/Rect;->left:I

    invoke-virtual {p1}, LHt6;->b()I

    move-result p5

    add-int/2addr p4, p5

    iput p4, v0, Landroid/graphics/Rect;->right:I

    iget p4, v0, Landroid/graphics/Rect;->top:I

    invoke-virtual {p1}, LHt6;->a()I

    move-result p5

    add-int/2addr p4, p5

    iput p4, v0, Landroid/graphics/Rect;->bottom:I

    goto :goto_0

    :cond_1
    iget p5, p1, LHt6;->b:I

    iget v1, p1, LHt6;->d:I

    add-int/2addr p5, v1

    iget v1, p1, LHt6;->c:I

    iget v3, p1, LHt6;->e:I

    add-int/2addr v1, v3

    invoke-virtual {p1}, LHt6;->b()I

    move-result v3

    sub-int/2addr v1, v3

    div-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->left:I

    invoke-virtual {p1}, LHt6;->a()I

    move-result v1

    add-int/2addr p5, v1

    div-int/2addr p5, v2

    sub-int/2addr p4, p5

    iput p4, v0, Landroid/graphics/Rect;->top:I

    iget p4, v0, Landroid/graphics/Rect;->left:I

    invoke-virtual {p1}, LHt6;->b()I

    move-result p5

    add-int/2addr p4, p5

    iput p4, v0, Landroid/graphics/Rect;->right:I

    iget p4, v0, Landroid/graphics/Rect;->top:I

    invoke-virtual {p1}, LHt6;->a()I

    move-result p5

    add-int/2addr p4, p5

    iput p4, v0, Landroid/graphics/Rect;->bottom:I

    :goto_0
    iget-object p4, p0, LOV2;->g:LXV2;

    iget p5, v0, Landroid/graphics/Rect;->left:I

    int-to-float p5, p5

    iget v1, v0, Landroid/graphics/Rect;->top:I

    int-to-float v1, v1

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p4, p5, v1, v2, v3}, LXV2;->p(FFFF)V

    iget-object p4, p0, LOV2;->i:LNV2;

    iget p1, p1, LHt6;->a:F

    invoke-virtual {p4, v0, p2, p3, p1}, LNV2;->h(Landroid/graphics/Rect;Landroid/view/View;IF)V

    return-void
.end method

.method public G(Landroid/graphics/Rect;Landroidx/constraintlayout/widget/b;II)V
    .locals 7

    iget v6, p2, Landroidx/constraintlayout/widget/b;->d:I

    if-eqz v6, :cond_0

    iget-object v2, p0, LOV2;->a:Landroid/graphics/Rect;

    move-object v0, p0

    move-object v1, p1

    move v3, v6

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, LOV2;->A(Landroid/graphics/Rect;Landroid/graphics/Rect;III)V

    :cond_0
    iget-object p3, p0, LOV2;->g:LXV2;

    const/4 p4, 0x0

    iput p4, p3, LXV2;->d:F

    iput p4, p3, LXV2;->e:F

    invoke-virtual {p0, p3}, LOV2;->y(LXV2;)V

    iget-object p3, p0, LOV2;->g:LXV2;

    iget p4, p1, Landroid/graphics/Rect;->left:I

    int-to-float p4, p4

    iget v0, p1, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p3, p4, v0, v1, v2}, LXV2;->p(FFFF)V

    iget p3, p0, LOV2;->c:I

    invoke-virtual {p2, p3}, Landroidx/constraintlayout/widget/b;->A(I)Landroidx/constraintlayout/widget/b$a;

    move-result-object p3

    iget-object p4, p0, LOV2;->g:LXV2;

    invoke-virtual {p4, p3}, LXV2;->a(Landroidx/constraintlayout/widget/b$a;)V

    iget-object p4, p3, Landroidx/constraintlayout/widget/b$a;->d:Landroidx/constraintlayout/widget/b$c;

    iget p4, p4, Landroidx/constraintlayout/widget/b$c;->g:F

    iput p4, p0, LOV2;->m:F

    iget-object p4, p0, LOV2;->i:LNV2;

    iget v0, p0, LOV2;->c:I

    invoke-virtual {p4, p1, p2, v6, v0}, LNV2;->i(Landroid/graphics/Rect;Landroidx/constraintlayout/widget/b;II)V

    iget-object p1, p3, Landroidx/constraintlayout/widget/b$a;->f:Landroidx/constraintlayout/widget/b$e;

    iget p1, p1, Landroidx/constraintlayout/widget/b$e;->i:I

    iput p1, p0, LOV2;->G:I

    iget-object p1, p3, Landroidx/constraintlayout/widget/b$a;->d:Landroidx/constraintlayout/widget/b$c;

    iget p2, p1, Landroidx/constraintlayout/widget/b$c;->k:I

    iput p2, p0, LOV2;->I:I

    iget p1, p1, Landroidx/constraintlayout/widget/b$c;->j:F

    iput p1, p0, LOV2;->J:F

    iget-object p1, p0, LOV2;->b:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object p2, p3, Landroidx/constraintlayout/widget/b$a;->d:Landroidx/constraintlayout/widget/b$c;

    iget p3, p2, Landroidx/constraintlayout/widget/b$c;->m:I

    iget-object p4, p2, Landroidx/constraintlayout/widget/b$c;->l:Ljava/lang/String;

    iget p2, p2, Landroidx/constraintlayout/widget/b$c;->n:I

    invoke-static {p1, p3, p4, p2}, LOV2;->p(Landroid/content/Context;ILjava/lang/String;I)Landroid/view/animation/Interpolator;

    move-result-object p1

    iput-object p1, p0, LOV2;->K:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public H(Landroid/view/View;)V
    .locals 1

    iput-object p1, p0, LOV2;->b:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iput v0, p0, LOV2;->c:I

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    instance-of v0, p1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    invoke-virtual {p1}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LOV2;->e:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public I(IIFJ)V
    .locals 16

    move-object/from16 v0, p0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    iget v5, v0, LOV2;->F:I

    sget v6, LXj2;->f:I

    if-eq v5, v6, :cond_0

    iget-object v6, v0, LOV2;->g:LXV2;

    iput v5, v6, LXV2;->l:I

    :cond_0
    iget-object v5, v0, LOV2;->i:LNV2;

    iget-object v6, v0, LOV2;->j:LNV2;

    invoke-virtual {v5, v6, v2}, LNV2;->f(LNV2;Ljava/util/HashSet;)V

    iget-object v5, v0, LOV2;->A:Ljava/util/ArrayList;

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v7, 0x0

    :cond_1
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LXj2;

    instance-of v9, v8, LEk2;

    if-eqz v9, :cond_2

    check-cast v8, LEk2;

    new-instance v9, LXV2;

    iget-object v14, v0, LOV2;->g:LXV2;

    iget-object v15, v0, LOV2;->h:LXV2;

    move-object v10, v9

    move/from16 v11, p1

    move/from16 v12, p2

    move-object v13, v8

    invoke-direct/range {v10 .. v15}, LXV2;-><init>(IILEk2;LXV2;LXV2;)V

    invoke-virtual {v0, v9}, LOV2;->w(LXV2;)V

    iget v8, v8, LFk2;->g:I

    sget v9, LXj2;->f:I

    if-eq v8, v9, :cond_1

    iput v8, v0, LOV2;->f:I

    goto :goto_0

    :cond_2
    instance-of v9, v8, Lfk2;

    if-eqz v9, :cond_3

    invoke-virtual {v8, v3}, LXj2;->d(Ljava/util/HashSet;)V

    goto :goto_0

    :cond_3
    instance-of v9, v8, LMk2;

    if-eqz v9, :cond_4

    invoke-virtual {v8, v1}, LXj2;->d(Ljava/util/HashSet;)V

    goto :goto_0

    :cond_4
    instance-of v9, v8, LNk2;

    if-eqz v9, :cond_6

    if-nez v7, :cond_5

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    :cond_5
    check-cast v8, LNk2;

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    invoke-virtual {v8, v4}, LXj2;->h(Ljava/util/HashMap;)V

    invoke-virtual {v8, v2}, LXj2;->d(Ljava/util/HashSet;)V

    goto :goto_0

    :cond_7
    const/4 v7, 0x0

    :cond_8
    const/4 v5, 0x0

    if-eqz v7, :cond_9

    new-array v8, v5, [LNk2;

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [LNk2;

    iput-object v7, v0, LOV2;->E:[LNk2;

    :cond_9
    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    move-result v7

    const-string v8, ","

    const-string v9, "CUSTOM,"

    const/4 v10, 0x1

    if-nez v7, :cond_14

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    iput-object v7, v0, LOV2;->C:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_f

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v11, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_d

    new-instance v12, Landroid/util/SparseArray;

    invoke-direct {v12}, Landroid/util/SparseArray;-><init>()V

    invoke-virtual {v11, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v13

    aget-object v13, v13, v10

    iget-object v14, v0, LOV2;->A:Ljava/util/ArrayList;

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_a
    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_c

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LXj2;

    iget-object v6, v15, LXj2;->e:Ljava/util/HashMap;

    if-nez v6, :cond_b

    goto :goto_2

    :cond_b
    invoke-virtual {v6, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/constraintlayout/widget/a;

    if-eqz v6, :cond_a

    iget v15, v15, LXj2;->a:I

    invoke-virtual {v12, v15, v6}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    goto :goto_2

    :cond_c
    invoke-static {v11, v12}, LGt6;->f(Ljava/lang/String;Landroid/util/SparseArray;)LGt6;

    move-result-object v6

    goto :goto_3

    :cond_d
    invoke-static {v11}, LGt6;->g(Ljava/lang/String;)LGt6;

    move-result-object v6

    :goto_3
    if-nez v6, :cond_e

    goto :goto_1

    :cond_e
    invoke-virtual {v6, v11}, LXN5;->d(Ljava/lang/String;)V

    iget-object v12, v0, LOV2;->C:Ljava/util/HashMap;

    invoke-virtual {v12, v11, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_f
    iget-object v6, v0, LOV2;->A:Ljava/util/ArrayList;

    if-eqz v6, :cond_11

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_10
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_11

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LXj2;

    instance-of v11, v7, Lck2;

    if-eqz v11, :cond_10

    iget-object v11, v0, LOV2;->C:Ljava/util/HashMap;

    invoke-virtual {v7, v11}, LXj2;->a(Ljava/util/HashMap;)V

    goto :goto_4

    :cond_11
    iget-object v6, v0, LOV2;->i:LNV2;

    iget-object v7, v0, LOV2;->C:Ljava/util/HashMap;

    invoke-virtual {v6, v7, v5}, LNV2;->a(Ljava/util/HashMap;I)V

    iget-object v6, v0, LOV2;->j:LNV2;

    iget-object v7, v0, LOV2;->C:Ljava/util/HashMap;

    const/16 v11, 0x64

    invoke-virtual {v6, v7, v11}, LNV2;->a(Ljava/util/HashMap;I)V

    iget-object v6, v0, LOV2;->C:Ljava/util/HashMap;

    invoke-virtual {v6}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_12
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_14

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v4, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_13

    invoke-virtual {v4, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    if-eqz v11, :cond_13

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    goto :goto_6

    :cond_13
    move v11, v5

    :goto_6
    iget-object v12, v0, LOV2;->C:Ljava/util/HashMap;

    invoke-virtual {v12, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LXN5;

    if-eqz v7, :cond_12

    invoke-virtual {v7, v11}, LXN5;->e(I)V

    goto :goto_5

    :cond_14
    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_20

    iget-object v6, v0, LOV2;->B:Ljava/util/HashMap;

    if-nez v6, :cond_15

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    iput-object v6, v0, LOV2;->B:Ljava/util/HashMap;

    :cond_15
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    iget-object v7, v0, LOV2;->B:Ljava/util/HashMap;

    invoke-virtual {v7, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_16

    goto :goto_7

    :cond_16
    invoke-virtual {v6, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1a

    new-instance v7, Landroid/util/SparseArray;

    invoke-direct {v7}, Landroid/util/SparseArray;-><init>()V

    invoke-virtual {v6, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    aget-object v11, v11, v10

    iget-object v12, v0, LOV2;->A:Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_17
    :goto_8
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_19

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LXj2;

    iget-object v14, v13, LXj2;->e:Ljava/util/HashMap;

    if-nez v14, :cond_18

    goto :goto_8

    :cond_18
    invoke-virtual {v14, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/constraintlayout/widget/a;

    if-eqz v14, :cond_17

    iget v13, v13, LXj2;->a:I

    invoke-virtual {v7, v13, v14}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    goto :goto_8

    :cond_19
    invoke-static {v6, v7}, LLt6;->g(Ljava/lang/String;Landroid/util/SparseArray;)LLt6;

    move-result-object v7

    move-wide/from16 v11, p4

    goto :goto_9

    :cond_1a
    move-wide/from16 v11, p4

    invoke-static {v6, v11, v12}, LLt6;->h(Ljava/lang/String;J)LLt6;

    move-result-object v7

    :goto_9
    if-nez v7, :cond_1b

    goto :goto_7

    :cond_1b
    invoke-virtual {v7, v6}, Li46;->d(Ljava/lang/String;)V

    iget-object v13, v0, LOV2;->B:Ljava/util/HashMap;

    invoke-virtual {v13, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_1c
    iget-object v1, v0, LOV2;->A:Ljava/util/ArrayList;

    if-eqz v1, :cond_1e

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1d
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LXj2;

    instance-of v7, v6, LMk2;

    if-eqz v7, :cond_1d

    check-cast v6, LMk2;

    iget-object v7, v0, LOV2;->B:Ljava/util/HashMap;

    invoke-virtual {v6, v7}, LMk2;->U(Ljava/util/HashMap;)V

    goto :goto_a

    :cond_1e
    iget-object v1, v0, LOV2;->B:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_20

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1f

    invoke-virtual {v4, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_c

    :cond_1f
    move v7, v5

    :goto_c
    iget-object v8, v0, LOV2;->B:Ljava/util/HashMap;

    invoke-virtual {v8, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LLt6;

    invoke-virtual {v6, v7}, Li46;->e(I)V

    goto :goto_b

    :cond_20
    iget-object v1, v0, LOV2;->y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v4, 0x2

    add-int/2addr v1, v4

    new-array v6, v1, [LXV2;

    iget-object v7, v0, LOV2;->g:LXV2;

    aput-object v7, v6, v5

    add-int/lit8 v7, v1, -0x1

    iget-object v8, v0, LOV2;->h:LXV2;

    aput-object v8, v6, v7

    iget-object v7, v0, LOV2;->y:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-lez v7, :cond_21

    iget v7, v0, LOV2;->f:I

    const/4 v8, -0x1

    if-ne v7, v8, :cond_21

    iput v5, v0, LOV2;->f:I

    :cond_21
    iget-object v7, v0, LOV2;->y:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v8, v10

    :goto_d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_22

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LXV2;

    add-int/lit8 v12, v8, 0x1

    aput-object v11, v6, v8

    move v8, v12

    goto :goto_d

    :cond_22
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    iget-object v8, v0, LOV2;->h:LXV2;

    iget-object v8, v8, LXV2;->p:Ljava/util/LinkedHashMap;

    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_23
    :goto_e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_24

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    iget-object v12, v0, LOV2;->g:LXV2;

    iget-object v12, v12, LXV2;->p:Ljava/util/LinkedHashMap;

    invoke-virtual {v12, v11}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_23

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_23

    invoke-virtual {v7, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_24
    new-array v2, v5, [Ljava/lang/String;

    invoke-virtual {v7, v2}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    iput-object v2, v0, LOV2;->u:[Ljava/lang/String;

    array-length v2, v2

    new-array v2, v2, [I

    iput-object v2, v0, LOV2;->v:[I

    move v2, v5

    :goto_f
    iget-object v7, v0, LOV2;->u:[Ljava/lang/String;

    array-length v8, v7

    if-ge v2, v8, :cond_27

    aget-object v7, v7, v2

    iget-object v8, v0, LOV2;->v:[I

    aput v5, v8, v2

    move v8, v5

    :goto_10
    if-ge v8, v1, :cond_26

    aget-object v9, v6, v8

    iget-object v9, v9, LXV2;->p:Ljava/util/LinkedHashMap;

    invoke-virtual {v9, v7}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_25

    aget-object v9, v6, v8

    iget-object v9, v9, LXV2;->p:Ljava/util/LinkedHashMap;

    invoke-virtual {v9, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/constraintlayout/widget/a;

    if-eqz v9, :cond_25

    iget-object v7, v0, LOV2;->v:[I

    aget v8, v7, v2

    invoke-virtual {v9}, Landroidx/constraintlayout/widget/a;->h()I

    move-result v9

    add-int/2addr v8, v9

    aput v8, v7, v2

    goto :goto_11

    :cond_25
    add-int/lit8 v8, v8, 0x1

    goto :goto_10

    :cond_26
    :goto_11
    add-int/lit8 v2, v2, 0x1

    goto :goto_f

    :cond_27
    aget-object v2, v6, v5

    iget v2, v2, LXV2;->l:I

    sget v8, LXj2;->f:I

    if-eq v2, v8, :cond_28

    move v2, v10

    goto :goto_12

    :cond_28
    move v2, v5

    :goto_12
    array-length v7, v7

    const/16 v8, 0x12

    add-int/2addr v8, v7

    new-array v7, v8, [Z

    move v9, v10

    :goto_13
    if-ge v9, v1, :cond_29

    aget-object v11, v6, v9

    add-int/lit8 v12, v9, -0x1

    aget-object v12, v6, v12

    iget-object v13, v0, LOV2;->u:[Ljava/lang/String;

    invoke-virtual {v11, v12, v7, v13, v2}, LXV2;->d(LXV2;[Z[Ljava/lang/String;Z)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_13

    :cond_29
    move v9, v5

    move v2, v10

    :goto_14
    if-ge v2, v8, :cond_2b

    aget-boolean v11, v7, v2

    if-eqz v11, :cond_2a

    add-int/lit8 v9, v9, 0x1

    :cond_2a
    add-int/lit8 v2, v2, 0x1

    goto :goto_14

    :cond_2b
    new-array v2, v9, [I

    iput-object v2, v0, LOV2;->r:[I

    invoke-static {v4, v9}, Ljava/lang/Math;->max(II)I

    move-result v2

    new-array v9, v2, [D

    iput-object v9, v0, LOV2;->s:[D

    new-array v2, v2, [D

    iput-object v2, v0, LOV2;->t:[D

    move v9, v5

    move v2, v10

    :goto_15
    if-ge v2, v8, :cond_2d

    aget-boolean v11, v7, v2

    if-eqz v11, :cond_2c

    iget-object v11, v0, LOV2;->r:[I

    add-int/lit8 v12, v9, 0x1

    aput v2, v11, v9

    move v9, v12

    :cond_2c
    add-int/lit8 v2, v2, 0x1

    goto :goto_15

    :cond_2d
    iget-object v2, v0, LOV2;->r:[I

    array-length v2, v2

    new-array v7, v4, [I

    aput v2, v7, v10

    aput v1, v7, v5

    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v2, v7}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [[D

    new-array v7, v1, [D

    move v8, v5

    :goto_16
    if-ge v8, v1, :cond_2e

    aget-object v9, v6, v8

    aget-object v11, v2, v8

    iget-object v12, v0, LOV2;->r:[I

    invoke-virtual {v9, v11, v12}, LXV2;->e([D[I)V

    aget-object v9, v6, v8

    iget v9, v9, LXV2;->d:F

    float-to-double v11, v9

    aput-wide v11, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_16

    :cond_2e
    move v8, v5

    :goto_17
    iget-object v9, v0, LOV2;->r:[I

    array-length v11, v9

    if-ge v8, v11, :cond_30

    aget v9, v9, v8

    sget-object v11, LXV2;->u:[Ljava/lang/String;

    array-length v11, v11

    if-ge v9, v11, :cond_2f

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v11, LXV2;->u:[Ljava/lang/String;

    iget-object v12, v0, LOV2;->r:[I

    aget v12, v12, v8

    aget-object v11, v11, v12

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, " ["

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    move v11, v5

    :goto_18
    if-ge v11, v1, :cond_2f

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v9, v2, v11

    aget-wide v13, v9, v8

    invoke-virtual {v12, v13, v14}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    add-int/lit8 v11, v11, 0x1

    goto :goto_18

    :cond_2f
    add-int/lit8 v8, v8, 0x1

    goto :goto_17

    :cond_30
    iget-object v8, v0, LOV2;->u:[Ljava/lang/String;

    array-length v8, v8

    add-int/2addr v8, v10

    new-array v8, v8, [LiF0;

    iput-object v8, v0, LOV2;->k:[LiF0;

    move v8, v5

    :goto_19
    iget-object v9, v0, LOV2;->u:[Ljava/lang/String;

    array-length v11, v9

    if-ge v8, v11, :cond_34

    aget-object v9, v9, v8

    move v11, v5

    move v13, v11

    const/4 v12, 0x0

    const/4 v14, 0x0

    :goto_1a
    if-ge v11, v1, :cond_33

    aget-object v15, v6, v11

    invoke-virtual {v15, v9}, LXV2;->k(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_32

    if-nez v14, :cond_31

    new-array v12, v1, [D

    aget-object v14, v6, v11

    invoke-virtual {v14, v9}, LXV2;->i(Ljava/lang/String;)I

    move-result v14

    new-array v15, v4, [I

    aput v14, v15, v10

    aput v1, v15, v5

    sget-object v14, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v14, v15}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, [[D

    :cond_31
    aget-object v15, v6, v11

    iget v10, v15, LXV2;->d:F

    float-to-double v4, v10

    aput-wide v4, v12, v13

    aget-object v4, v14, v13

    const/4 v5, 0x0

    invoke-virtual {v15, v9, v4, v5}, LXV2;->h(Ljava/lang/String;[DI)I

    add-int/lit8 v13, v13, 0x1

    :cond_32
    add-int/lit8 v11, v11, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v10, 0x1

    goto :goto_1a

    :cond_33
    invoke-static {v12, v13}, Ljava/util/Arrays;->copyOf([DI)[D

    move-result-object v4

    invoke-static {v14, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [[D

    iget-object v9, v0, LOV2;->k:[LiF0;

    add-int/lit8 v8, v8, 0x1

    iget v10, v0, LOV2;->f:I

    invoke-static {v10, v4, v5}, LiF0;->a(I[D[[D)LiF0;

    move-result-object v4

    aput-object v4, v9, v8

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v10, 0x1

    goto :goto_19

    :cond_34
    iget-object v4, v0, LOV2;->k:[LiF0;

    iget v5, v0, LOV2;->f:I

    invoke-static {v5, v7, v2}, LiF0;->a(I[D[[D)LiF0;

    move-result-object v2

    const/4 v5, 0x0

    aput-object v2, v4, v5

    aget-object v2, v6, v5

    iget v2, v2, LXV2;->l:I

    sget v4, LXj2;->f:I

    if-eq v2, v4, :cond_36

    new-array v2, v1, [I

    new-array v4, v1, [D

    const/4 v7, 0x2

    new-array v8, v7, [I

    const/4 v9, 0x1

    aput v7, v8, v9

    aput v1, v8, v5

    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-static {v5, v8}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [[D

    const/4 v7, 0x0

    :goto_1b
    if-ge v7, v1, :cond_35

    aget-object v8, v6, v7

    iget v9, v8, LXV2;->l:I

    aput v9, v2, v7

    iget v9, v8, LXV2;->d:F

    float-to-double v9, v9

    aput-wide v9, v4, v7

    aget-object v9, v5, v7

    iget v10, v8, LXV2;->f:F

    float-to-double v10, v10

    const/4 v12, 0x0

    aput-wide v10, v9, v12

    iget v8, v8, LXV2;->g:F

    float-to-double v10, v8

    const/4 v8, 0x1

    aput-wide v10, v9, v8

    add-int/lit8 v7, v7, 0x1

    goto :goto_1b

    :cond_35
    invoke-static {v2, v4, v5}, LiF0;->b([I[D[[D)LiF0;

    move-result-object v1

    iput-object v1, v0, LOV2;->l:LiF0;

    :cond_36
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, v0, LOV2;->D:Ljava/util/HashMap;

    iget-object v1, v0, LOV2;->A:Ljava/util/ArrayList;

    if-eqz v1, :cond_3c

    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/high16 v2, 0x7fc00000    # Float.NaN

    :goto_1c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_39

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lvs6;->i(Ljava/lang/String;)Lvs6;

    move-result-object v4

    if-nez v4, :cond_37

    goto :goto_1c

    :cond_37
    invoke-virtual {v4}, Lgk2;->h()Z

    move-result v5

    if-eqz v5, :cond_38

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-eqz v5, :cond_38

    invoke-virtual/range {p0 .. p0}, LOV2;->s()F

    move-result v2

    :cond_38
    invoke-virtual {v4, v3}, Lgk2;->f(Ljava/lang/String;)V

    iget-object v5, v0, LOV2;->D:Ljava/util/HashMap;

    invoke-virtual {v5, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1c

    :cond_39
    iget-object v1, v0, LOV2;->A:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3a
    :goto_1d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LXj2;

    instance-of v4, v3, Lfk2;

    if-eqz v4, :cond_3a

    check-cast v3, Lfk2;

    iget-object v4, v0, LOV2;->D:Ljava/util/HashMap;

    invoke-virtual {v3, v4}, Lfk2;->Y(Ljava/util/HashMap;)V

    goto :goto_1d

    :cond_3b
    iget-object v1, v0, LOV2;->D:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lvs6;

    invoke-virtual {v3, v2}, Lgk2;->g(F)V

    goto :goto_1e

    :cond_3c
    return-void
.end method

.method public J(LOV2;)V
    .locals 2

    iget-object v0, p0, LOV2;->g:LXV2;

    iget-object v1, p1, LOV2;->g:LXV2;

    invoke-virtual {v0, p1, v1}, LXV2;->s(LOV2;LXV2;)V

    iget-object v0, p0, LOV2;->h:LXV2;

    iget-object v1, p1, LOV2;->h:LXV2;

    invoke-virtual {v0, p1, v1}, LXV2;->s(LOV2;LXV2;)V

    return-void
.end method

.method public a(LXj2;)V
    .locals 1

    iget-object v0, p0, LOV2;->A:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "LXj2;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LOV2;->A:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public c([F[I)I
    .locals 10

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    iget-object v1, p0, LOV2;->k:[LiF0;

    aget-object v1, v1, v0

    invoke-virtual {v1}, LiF0;->h()[D

    move-result-object v1

    if-eqz p2, :cond_0

    iget-object v2, p0, LOV2;->y:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v3, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LXV2;

    add-int/lit8 v5, v3, 0x1

    iget v4, v4, LXV2;->q:I

    aput v4, p2, v3

    move v3, v5

    goto :goto_0

    :cond_0
    move p2, v0

    move v9, p2

    :goto_1
    array-length v2, v1

    if-ge p2, v2, :cond_1

    iget-object v2, p0, LOV2;->k:[LiF0;

    aget-object v2, v2, v0

    aget-wide v3, v1, p2

    iget-object v5, p0, LOV2;->s:[D

    invoke-virtual {v2, v3, v4, v5}, LiF0;->d(D[D)V

    iget-object v2, p0, LOV2;->g:LXV2;

    aget-wide v3, v1, p2

    iget-object v5, p0, LOV2;->r:[I

    iget-object v6, p0, LOV2;->s:[D

    move-object v7, p1

    move v8, v9

    invoke-virtual/range {v2 .. v8}, LXV2;->f(D[I[D[FI)V

    add-int/lit8 v9, v9, 0x2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_1
    div-int/lit8 v9, v9, 0x2

    return v9

    :cond_2
    return v0
.end method

.method public d([FI)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v8, p2

    add-int/lit8 v1, v8, -0x1

    int-to-float v1, v1

    const/high16 v9, 0x3f800000    # 1.0f

    div-float v10, v9, v1

    iget-object v1, v0, LOV2;->C:Ljava/util/HashMap;

    const-string v2, "translationX"

    const/4 v3, 0x0

    if-nez v1, :cond_0

    move-object v11, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LXN5;

    move-object v11, v1

    :goto_0
    iget-object v1, v0, LOV2;->C:Ljava/util/HashMap;

    const-string v4, "translationY"

    if-nez v1, :cond_1

    move-object v12, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LXN5;

    move-object v12, v1

    :goto_1
    iget-object v1, v0, LOV2;->D:Ljava/util/HashMap;

    if-nez v1, :cond_2

    move-object v13, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvs6;

    move-object v13, v1

    :goto_2
    iget-object v1, v0, LOV2;->D:Ljava/util/HashMap;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lvs6;

    :goto_3
    move-object v14, v3

    const/4 v7, 0x0

    :goto_4
    if-ge v7, v8, :cond_10

    int-to-float v1, v7

    mul-float/2addr v1, v10

    iget v2, v0, LOV2;->o:F

    cmpl-float v3, v2, v9

    const/4 v4, 0x0

    if-eqz v3, :cond_5

    iget v3, v0, LOV2;->n:F

    cmpg-float v5, v1, v3

    if-gez v5, :cond_4

    move v1, v4

    :cond_4
    cmpl-float v5, v1, v3

    if-lez v5, :cond_5

    float-to-double v5, v1

    const-wide/high16 v16, 0x3ff0000000000000L    # 1.0

    cmpg-double v5, v5, v16

    if-gez v5, :cond_5

    sub-float/2addr v1, v3

    mul-float/2addr v1, v2

    invoke-static {v1, v9}, Ljava/lang/Math;->min(FF)F

    move-result v1

    :cond_5
    move v6, v1

    float-to-double v1, v6

    iget-object v3, v0, LOV2;->g:LXV2;

    iget-object v3, v3, LXV2;->b:Lg91;

    iget-object v5, v0, LOV2;->y:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/high16 v16, 0x7fc00000    # Float.NaN

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v9, v17

    check-cast v9, LXV2;

    iget-object v15, v9, LXV2;->b:Lg91;

    move-wide/from16 v18, v1

    if-eqz v15, :cond_7

    iget v1, v9, LXV2;->d:F

    cmpg-float v2, v1, v6

    if-gez v2, :cond_6

    move v4, v1

    move-object v3, v15

    goto :goto_6

    :cond_6
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_7

    iget v1, v9, LXV2;->d:F

    move/from16 v16, v1

    :cond_7
    :goto_6
    move-wide/from16 v1, v18

    const/high16 v9, 0x3f800000    # 1.0f

    goto :goto_5

    :cond_8
    move-wide/from16 v18, v1

    if-eqz v3, :cond_a

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-eqz v1, :cond_9

    const/high16 v16, 0x3f800000    # 1.0f

    :cond_9
    sub-float v1, v6, v4

    sub-float v16, v16, v4

    div-float v1, v1, v16

    float-to-double v1, v1

    invoke-virtual {v3, v1, v2}, Lg91;->a(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float v1, v1, v16

    add-float/2addr v1, v4

    float-to-double v1, v1

    move-wide v2, v1

    goto :goto_7

    :cond_a
    move-wide/from16 v2, v18

    :goto_7
    iget-object v1, v0, LOV2;->k:[LiF0;

    const/4 v9, 0x0

    aget-object v1, v1, v9

    iget-object v4, v0, LOV2;->s:[D

    invoke-virtual {v1, v2, v3, v4}, LiF0;->d(D[D)V

    iget-object v1, v0, LOV2;->l:LiF0;

    if-eqz v1, :cond_b

    iget-object v4, v0, LOV2;->s:[D

    array-length v5, v4

    if-lez v5, :cond_b

    invoke-virtual {v1, v2, v3, v4}, LiF0;->d(D[D)V

    :cond_b
    iget-object v1, v0, LOV2;->g:LXV2;

    iget-object v4, v0, LOV2;->r:[I

    iget-object v5, v0, LOV2;->s:[D

    mul-int/lit8 v15, v7, 0x2

    move v9, v6

    move-object/from16 v6, p1

    move/from16 v16, v7

    move v7, v15

    invoke-virtual/range {v1 .. v7}, LXV2;->f(D[I[D[FI)V

    if-eqz v13, :cond_c

    aget v1, p1, v15

    invoke-virtual {v13, v9}, Lgk2;->a(F)F

    move-result v2

    add-float/2addr v1, v2

    aput v1, p1, v15

    goto :goto_8

    :cond_c
    if-eqz v11, :cond_d

    aget v1, p1, v15

    invoke-virtual {v11, v9}, LXN5;->a(F)F

    move-result v2

    add-float/2addr v1, v2

    aput v1, p1, v15

    :cond_d
    :goto_8
    if-eqz v14, :cond_e

    add-int/lit8 v15, v15, 0x1

    aget v1, p1, v15

    invoke-virtual {v14, v9}, Lgk2;->a(F)F

    move-result v2

    add-float/2addr v1, v2

    aput v1, p1, v15

    goto :goto_9

    :cond_e
    if-eqz v12, :cond_f

    add-int/lit8 v15, v15, 0x1

    aget v1, p1, v15

    invoke-virtual {v12, v9}, LXN5;->a(F)F

    move-result v2

    add-float/2addr v1, v2

    aput v1, p1, v15

    :cond_f
    :goto_9
    add-int/lit8 v7, v16, 0x1

    const/high16 v9, 0x3f800000    # 1.0f

    goto/16 :goto_4

    :cond_10
    return-void
.end method

.method public e(F[FI)V
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LOV2;->g(F[F)F

    move-result p1

    iget-object v0, p0, LOV2;->k:[LiF0;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    float-to-double v1, p1

    iget-object p1, p0, LOV2;->s:[D

    invoke-virtual {v0, v1, v2, p1}, LiF0;->d(D[D)V

    iget-object p1, p0, LOV2;->g:LXV2;

    iget-object v0, p0, LOV2;->r:[I

    iget-object v1, p0, LOV2;->s:[D

    invoke-virtual {p1, v0, v1, p2, p3}, LXV2;->j([I[D[FI)V

    return-void
.end method

.method public f(Z)V
    .locals 4

    iget-object v0, p0, LOV2;->b:Landroid/view/View;

    invoke-static {v0}, LFU0;->d(Landroid/view/View;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "button"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LOV2;->E:[LNk2;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LOV2;->E:[LNk2;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v1, v1, v0

    if-eqz p1, :cond_0

    const/high16 v2, -0x3d380000    # -100.0f

    goto :goto_1

    :cond_0
    const/high16 v2, 0x42c80000    # 100.0f

    :goto_1
    iget-object v3, p0, LOV2;->b:Landroid/view/View;

    invoke-virtual {v1, v2, v3}, LNk2;->y(FLandroid/view/View;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final g(F[F)F
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz p2, :cond_0

    aput v2, p2, v1

    goto :goto_0

    :cond_0
    iget v3, p0, LOV2;->o:F

    float-to-double v4, v3

    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    cmpl-double v4, v4, v6

    if-eqz v4, :cond_2

    iget v4, p0, LOV2;->n:F

    cmpg-float v5, p1, v4

    if-gez v5, :cond_1

    move p1, v0

    :cond_1
    cmpl-float v5, p1, v4

    if-lez v5, :cond_2

    float-to-double v8, p1

    cmpg-double v5, v8, v6

    if-gez v5, :cond_2

    sub-float/2addr p1, v4

    mul-float/2addr p1, v3

    invoke-static {p1, v2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    :cond_2
    :goto_0
    iget-object v3, p0, LOV2;->g:LXV2;

    iget-object v3, v3, LXV2;->b:Lg91;

    iget-object v4, p0, LOV2;->y:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/high16 v5, 0x7fc00000    # Float.NaN

    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LXV2;

    iget-object v7, v6, LXV2;->b:Lg91;

    if-eqz v7, :cond_3

    iget v8, v6, LXV2;->d:F

    cmpg-float v9, v8, p1

    if-gez v9, :cond_4

    move-object v3, v7

    move v0, v8

    goto :goto_1

    :cond_4
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    if-eqz v7, :cond_3

    iget v5, v6, LXV2;->d:F

    goto :goto_1

    :cond_5
    if-eqz v3, :cond_7

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_2

    :cond_6
    move v2, v5

    :goto_2
    sub-float/2addr p1, v0

    sub-float/2addr v2, v0

    div-float/2addr p1, v2

    float-to-double v4, p1

    invoke-virtual {v3, v4, v5}, Lg91;->a(D)D

    move-result-wide v6

    double-to-float p1, v6

    mul-float/2addr p1, v2

    add-float/2addr p1, v0

    if-eqz p2, :cond_7

    invoke-virtual {v3, v4, v5}, Lg91;->b(D)D

    move-result-wide v2

    double-to-float v0, v2

    aput v0, p2, v1

    :cond_7
    return p1
.end method

.method public h()I
    .locals 1

    iget-object v0, p0, LOV2;->g:LXV2;

    iget v0, v0, LXV2;->m:I

    return v0
.end method

.method public i(D[F[F)V
    .locals 9

    const/4 v0, 0x4

    new-array v5, v0, [D

    new-array v7, v0, [D

    iget-object v0, p0, LOV2;->k:[LiF0;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1, p2, v5}, LiF0;->d(D[D)V

    iget-object v0, p0, LOV2;->k:[LiF0;

    aget-object v0, v0, v1

    invoke-virtual {v0, p1, p2, v7}, LiF0;->g(D[D)V

    const/4 v0, 0x0

    invoke-static {p4, v0}, Ljava/util/Arrays;->fill([FF)V

    iget-object v1, p0, LOV2;->g:LXV2;

    iget-object v4, p0, LOV2;->r:[I

    move-wide v2, p1

    move-object v6, p3

    move-object v8, p4

    invoke-virtual/range {v1 .. v8}, LXV2;->g(D[I[D[F[D[F)V

    return-void
.end method

.method public j()F
    .locals 1

    iget v0, p0, LOV2;->p:F

    return v0
.end method

.method public k()F
    .locals 1

    iget v0, p0, LOV2;->q:F

    return v0
.end method

.method public l(FFF[F)V
    .locals 11

    iget-object v0, p0, LOV2;->z:[F

    invoke-virtual {p0, p1, v0}, LOV2;->g(F[F)F

    move-result p1

    iget-object v0, p0, LOV2;->k:[LiF0;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    aget-object v0, v0, v1

    float-to-double v2, p1

    iget-object p1, p0, LOV2;->t:[D

    invoke-virtual {v0, v2, v3, p1}, LiF0;->g(D[D)V

    iget-object p1, p0, LOV2;->k:[LiF0;

    aget-object p1, p1, v1

    iget-object v0, p0, LOV2;->s:[D

    invoke-virtual {p1, v2, v3, v0}, LiF0;->d(D[D)V

    iget-object p1, p0, LOV2;->z:[F

    aget p1, p1, v1

    :goto_0
    iget-object v9, p0, LOV2;->t:[D

    array-length v0, v9

    if-ge v1, v0, :cond_0

    aget-wide v4, v9, v1

    float-to-double v6, p1

    mul-double/2addr v4, v6

    aput-wide v4, v9, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LOV2;->l:LiF0;

    if-eqz p1, :cond_2

    iget-object v0, p0, LOV2;->s:[D

    array-length v1, v0

    if-lez v1, :cond_1

    invoke-virtual {p1, v2, v3, v0}, LiF0;->d(D[D)V

    iget-object p1, p0, LOV2;->l:LiF0;

    iget-object v0, p0, LOV2;->t:[D

    invoke-virtual {p1, v2, v3, v0}, LiF0;->g(D[D)V

    iget-object v4, p0, LOV2;->g:LXV2;

    iget-object v8, p0, LOV2;->r:[I

    iget-object v9, p0, LOV2;->t:[D

    iget-object v10, p0, LOV2;->s:[D

    move v5, p2

    move v6, p3

    move-object v7, p4

    invoke-virtual/range {v4 .. v10}, LXV2;->q(FF[F[I[D[D)V

    :cond_1
    return-void

    :cond_2
    iget-object v4, p0, LOV2;->g:LXV2;

    iget-object v8, p0, LOV2;->r:[I

    iget-object v10, p0, LOV2;->s:[D

    move v5, p2

    move v6, p3

    move-object v7, p4

    invoke-virtual/range {v4 .. v10}, LXV2;->q(FF[F[I[D[D)V

    return-void

    :cond_3
    iget-object p1, p0, LOV2;->h:LXV2;

    iget v0, p1, LXV2;->f:F

    iget-object v2, p0, LOV2;->g:LXV2;

    iget v3, v2, LXV2;->f:F

    sub-float/2addr v0, v3

    iget v3, p1, LXV2;->g:F

    iget v4, v2, LXV2;->g:F

    sub-float/2addr v3, v4

    iget v4, p1, LXV2;->h:F

    iget v5, v2, LXV2;->h:F

    sub-float/2addr v4, v5

    iget p1, p1, LXV2;->i:F

    iget v2, v2, LXV2;->i:F

    sub-float/2addr p1, v2

    add-float/2addr v4, v0

    add-float/2addr p1, v3

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v5, v2, p2

    mul-float/2addr v0, v5

    mul-float/2addr v4, p2

    add-float/2addr v0, v4

    aput v0, p4, v1

    sub-float/2addr v2, p3

    mul-float/2addr v3, v2

    mul-float/2addr p1, p3

    add-float/2addr v3, p1

    const/4 p1, 0x1

    aput v3, p4, p1

    return-void
.end method

.method public m()I
    .locals 3

    iget-object v0, p0, LOV2;->g:LXV2;

    iget v0, v0, LXV2;->c:I

    iget-object v1, p0, LOV2;->y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LXV2;

    iget v2, v2, LXV2;->c:I

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v1, p0, LOV2;->h:LXV2;

    iget v1, v1, LXV2;->c:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public n()F
    .locals 1

    iget-object v0, p0, LOV2;->h:LXV2;

    iget v0, v0, LXV2;->f:F

    return v0
.end method

.method public o()F
    .locals 1

    iget-object v0, p0, LOV2;->h:LXV2;

    iget v0, v0, LXV2;->g:F

    return v0
.end method

.method public q(I)LXV2;
    .locals 1

    iget-object v0, p0, LOV2;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LXV2;

    return-object p1
.end method

.method public r(FIIFF[F)V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, LOV2;->z:[F

    move/from16 v2, p1

    invoke-virtual {v0, v2, v1}, LOV2;->g(F[F)F

    move-result v1

    iget-object v2, v0, LOV2;->C:Ljava/util/HashMap;

    const-string v3, "translationX"

    const/4 v4, 0x0

    if-nez v2, :cond_0

    move-object v2, v4

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LXN5;

    :goto_0
    iget-object v5, v0, LOV2;->C:Ljava/util/HashMap;

    const-string v6, "translationY"

    if-nez v5, :cond_1

    move-object v5, v4

    goto :goto_1

    :cond_1
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LXN5;

    :goto_1
    iget-object v7, v0, LOV2;->C:Ljava/util/HashMap;

    const-string v8, "rotation"

    if-nez v7, :cond_2

    move-object v7, v4

    goto :goto_2

    :cond_2
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LXN5;

    :goto_2
    iget-object v9, v0, LOV2;->C:Ljava/util/HashMap;

    const-string v10, "scaleX"

    if-nez v9, :cond_3

    move-object v9, v4

    goto :goto_3

    :cond_3
    invoke-virtual {v9, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LXN5;

    :goto_3
    iget-object v11, v0, LOV2;->C:Ljava/util/HashMap;

    const-string v12, "scaleY"

    if-nez v11, :cond_4

    move-object v11, v4

    goto :goto_4

    :cond_4
    invoke-virtual {v11, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LXN5;

    :goto_4
    iget-object v13, v0, LOV2;->D:Ljava/util/HashMap;

    if-nez v13, :cond_5

    move-object v3, v4

    goto :goto_5

    :cond_5
    invoke-virtual {v13, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lvs6;

    :goto_5
    iget-object v13, v0, LOV2;->D:Ljava/util/HashMap;

    if-nez v13, :cond_6

    move-object v6, v4

    goto :goto_6

    :cond_6
    invoke-virtual {v13, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lvs6;

    :goto_6
    iget-object v13, v0, LOV2;->D:Ljava/util/HashMap;

    if-nez v13, :cond_7

    move-object v8, v4

    goto :goto_7

    :cond_7
    invoke-virtual {v13, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lvs6;

    :goto_7
    iget-object v13, v0, LOV2;->D:Ljava/util/HashMap;

    if-nez v13, :cond_8

    move-object v10, v4

    goto :goto_8

    :cond_8
    invoke-virtual {v13, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lvs6;

    :goto_8
    iget-object v13, v0, LOV2;->D:Ljava/util/HashMap;

    if-nez v13, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v13, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lvs6;

    :goto_9
    new-instance v12, Lto6;

    invoke-direct {v12}, Lto6;-><init>()V

    invoke-virtual {v12}, Lto6;->b()V

    invoke-virtual {v12, v7, v1}, Lto6;->d(LXN5;F)V

    invoke-virtual {v12, v2, v5, v1}, Lto6;->h(LXN5;LXN5;F)V

    invoke-virtual {v12, v9, v11, v1}, Lto6;->f(LXN5;LXN5;F)V

    invoke-virtual {v12, v8, v1}, Lto6;->c(Lgk2;F)V

    invoke-virtual {v12, v3, v6, v1}, Lto6;->g(Lgk2;Lgk2;F)V

    invoke-virtual {v12, v10, v4, v1}, Lto6;->e(Lgk2;Lgk2;F)V

    iget-object v13, v0, LOV2;->l:LiF0;

    if-eqz v13, :cond_b

    iget-object v2, v0, LOV2;->s:[D

    array-length v3, v2

    if-lez v3, :cond_a

    float-to-double v3, v1

    invoke-virtual {v13, v3, v4, v2}, LiF0;->d(D[D)V

    iget-object v1, v0, LOV2;->l:LiF0;

    iget-object v2, v0, LOV2;->t:[D

    invoke-virtual {v1, v3, v4, v2}, LiF0;->g(D[D)V

    iget-object v1, v0, LOV2;->g:LXV2;

    iget-object v5, v0, LOV2;->r:[I

    iget-object v6, v0, LOV2;->t:[D

    iget-object v7, v0, LOV2;->s:[D

    move/from16 v2, p4

    move/from16 v3, p5

    move-object/from16 v4, p6

    invoke-virtual/range {v1 .. v7}, LXV2;->q(FF[F[I[D[D)V

    :cond_a
    move-object v1, v12

    move/from16 v2, p4

    move/from16 v3, p5

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p6

    invoke-virtual/range {v1 .. v6}, Lto6;->a(FFII[F)V

    return-void

    :cond_b
    iget-object v13, v0, LOV2;->k:[LiF0;

    const/4 v14, 0x0

    if-eqz v13, :cond_d

    iget-object v2, v0, LOV2;->z:[F

    invoke-virtual {v0, v1, v2}, LOV2;->g(F[F)F

    move-result v1

    iget-object v2, v0, LOV2;->k:[LiF0;

    aget-object v2, v2, v14

    float-to-double v3, v1

    iget-object v1, v0, LOV2;->t:[D

    invoke-virtual {v2, v3, v4, v1}, LiF0;->g(D[D)V

    iget-object v1, v0, LOV2;->k:[LiF0;

    aget-object v1, v1, v14

    iget-object v2, v0, LOV2;->s:[D

    invoke-virtual {v1, v3, v4, v2}, LiF0;->d(D[D)V

    iget-object v1, v0, LOV2;->z:[F

    aget v1, v1, v14

    :goto_a
    iget-object v6, v0, LOV2;->t:[D

    array-length v2, v6

    if-ge v14, v2, :cond_c

    aget-wide v2, v6, v14

    float-to-double v4, v1

    mul-double/2addr v2, v4

    aput-wide v2, v6, v14

    add-int/lit8 v14, v14, 0x1

    goto :goto_a

    :cond_c
    iget-object v1, v0, LOV2;->g:LXV2;

    iget-object v5, v0, LOV2;->r:[I

    iget-object v7, v0, LOV2;->s:[D

    move/from16 v2, p4

    move/from16 v3, p5

    move-object/from16 v4, p6

    invoke-virtual/range {v1 .. v7}, LXV2;->q(FF[F[I[D[D)V

    move-object v1, v12

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p6

    invoke-virtual/range {v1 .. v6}, Lto6;->a(FFII[F)V

    return-void

    :cond_d
    iget-object v13, v0, LOV2;->h:LXV2;

    iget v15, v13, LXV2;->f:F

    iget-object v14, v0, LOV2;->g:LXV2;

    iget v0, v14, LXV2;->f:F

    sub-float/2addr v15, v0

    iget v0, v13, LXV2;->g:F

    move-object/from16 v16, v4

    iget v4, v14, LXV2;->g:F

    sub-float/2addr v0, v4

    iget v4, v13, LXV2;->h:F

    move-object/from16 v17, v10

    iget v10, v14, LXV2;->h:F

    sub-float/2addr v4, v10

    iget v10, v13, LXV2;->i:F

    iget v13, v14, LXV2;->i:F

    sub-float/2addr v10, v13

    add-float/2addr v4, v15

    add-float/2addr v10, v0

    const/high16 v13, 0x3f800000    # 1.0f

    sub-float v14, v13, p4

    mul-float/2addr v15, v14

    mul-float v4, v4, p4

    add-float/2addr v15, v4

    const/4 v4, 0x0

    aput v15, p6, v4

    sub-float v13, v13, p5

    mul-float/2addr v0, v13

    mul-float v10, v10, p5

    add-float/2addr v0, v10

    const/4 v4, 0x1

    aput v0, p6, v4

    invoke-virtual {v12}, Lto6;->b()V

    invoke-virtual {v12, v7, v1}, Lto6;->d(LXN5;F)V

    invoke-virtual {v12, v2, v5, v1}, Lto6;->h(LXN5;LXN5;F)V

    invoke-virtual {v12, v9, v11, v1}, Lto6;->f(LXN5;LXN5;F)V

    invoke-virtual {v12, v8, v1}, Lto6;->c(Lgk2;F)V

    invoke-virtual {v12, v3, v6, v1}, Lto6;->g(Lgk2;Lgk2;F)V

    move-object/from16 v4, v16

    move-object/from16 v10, v17

    invoke-virtual {v12, v10, v4, v1}, Lto6;->e(Lgk2;Lgk2;F)V

    move-object v1, v12

    move/from16 v2, p4

    move/from16 v3, p5

    move/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p6

    invoke-virtual/range {v1 .. v6}, Lto6;->a(FFII[F)V

    return-void
.end method

.method public final s()F
    .locals 21

    move-object/from16 v0, p0

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/16 v2, 0x63

    int-to-float v2, v2

    const/high16 v9, 0x3f800000    # 1.0f

    div-float v10, v9, v2

    const-wide/16 v2, 0x0

    move-wide v13, v2

    move-wide v15, v13

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    const/16 v2, 0x64

    if-ge v8, v2, :cond_6

    int-to-float v2, v8

    mul-float/2addr v2, v10

    float-to-double v3, v2

    iget-object v5, v0, LOV2;->g:LXV2;

    iget-object v5, v5, LXV2;->b:Lg91;

    iget-object v6, v0, LOV2;->y:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/high16 v17, 0x7fc00000    # Float.NaN

    const/16 v18, 0x0

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v9, v19

    check-cast v9, LXV2;

    iget-object v11, v9, LXV2;->b:Lg91;

    if-eqz v11, :cond_1

    iget v12, v9, LXV2;->d:F

    cmpg-float v20, v12, v2

    if-gez v20, :cond_0

    move-object v5, v11

    move/from16 v18, v12

    goto :goto_2

    :cond_0
    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->isNaN(F)Z

    move-result v11

    if-eqz v11, :cond_1

    iget v9, v9, LXV2;->d:F

    move/from16 v17, v9

    :cond_1
    :goto_2
    const/high16 v9, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_2
    if-eqz v5, :cond_4

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_3

    const/high16 v17, 0x3f800000    # 1.0f

    :cond_3
    sub-float v2, v2, v18

    sub-float v17, v17, v18

    div-float v2, v2, v17

    float-to-double v2, v2

    invoke-virtual {v5, v2, v3}, Lg91;->a(D)D

    move-result-wide v2

    double-to-float v2, v2

    mul-float v2, v2, v17

    add-float v2, v2, v18

    float-to-double v2, v2

    move-wide v3, v2

    :cond_4
    iget-object v2, v0, LOV2;->k:[LiF0;

    const/4 v5, 0x0

    aget-object v2, v2, v5

    iget-object v5, v0, LOV2;->s:[D

    invoke-virtual {v2, v3, v4, v5}, LiF0;->d(D[D)V

    iget-object v2, v0, LOV2;->g:LXV2;

    iget-object v5, v0, LOV2;->r:[I

    iget-object v6, v0, LOV2;->s:[D

    const/4 v9, 0x0

    move v11, v7

    move-object v7, v1

    move v12, v8

    move v8, v9

    invoke-virtual/range {v2 .. v8}, LXV2;->f(D[I[D[FI)V

    const/4 v2, 0x1

    if-lez v12, :cond_5

    float-to-double v3, v11

    aget v5, v1, v2

    float-to-double v5, v5

    sub-double v5, v15, v5

    const/4 v7, 0x0

    aget v8, v1, v7

    float-to-double v8, v8

    sub-double/2addr v13, v8

    invoke-static {v5, v6, v13, v14}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v5

    add-double/2addr v3, v5

    double-to-float v3, v3

    goto :goto_3

    :cond_5
    const/4 v7, 0x0

    move v3, v11

    :goto_3
    aget v4, v1, v7

    float-to-double v13, v4

    aget v2, v1, v2

    float-to-double v4, v2

    add-int/lit8 v8, v12, 0x1

    move v7, v3

    move-wide v15, v4

    const/high16 v9, 0x3f800000    # 1.0f

    goto/16 :goto_0

    :cond_6
    move v11, v7

    return v11
.end method

.method public t()F
    .locals 1

    iget-object v0, p0, LOV2;->g:LXV2;

    iget v0, v0, LXV2;->f:F

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " start: x: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LOV2;->g:LXV2;

    iget v1, v1, LXV2;->f:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " y: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LOV2;->g:LXV2;

    iget v2, v2, LXV2;->g:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, " end: x: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LOV2;->h:LXV2;

    iget v2, v2, LXV2;->f:F

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LOV2;->h:LXV2;

    iget v1, v1, LXV2;->g:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()F
    .locals 1

    iget-object v0, p0, LOV2;->g:LXV2;

    iget v0, v0, LXV2;->g:F

    return v0
.end method

.method public v()Landroid/view/View;
    .locals 1

    iget-object v0, p0, LOV2;->b:Landroid/view/View;

    return-object v0
.end method

.method public final w(LXV2;)V
    .locals 3

    iget-object v0, p0, LOV2;->y:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " KeyPath position \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p1, LXV2;->e:F

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, "\" outside of range"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "MotionController"

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v1, p0, LOV2;->y:Ljava/util/ArrayList;

    neg-int v0, v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public x(Landroid/view/View;FJLdk2;)Z
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v11, p1

    const/4 v1, 0x0

    move/from16 v2, p2

    invoke-virtual {v0, v2, v1}, LOV2;->g(F[F)F

    move-result v2

    iget v3, v0, LOV2;->I:I

    sget v4, LXj2;->f:I

    const/high16 v13, 0x3f800000    # 1.0f

    if-eq v3, v4, :cond_3

    int-to-float v3, v3

    div-float v3, v13, v3

    div-float v4, v2, v3

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    move-result-wide v4

    double-to-float v4, v4

    mul-float/2addr v4, v3

    rem-float/2addr v2, v3

    div-float/2addr v2, v3

    iget v5, v0, LOV2;->J:F

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_0

    iget v5, v0, LOV2;->J:F

    add-float/2addr v2, v5

    rem-float/2addr v2, v13

    :cond_0
    iget-object v5, v0, LOV2;->K:Landroid/view/animation/Interpolator;

    if-eqz v5, :cond_1

    invoke-interface {v5, v2}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result v2

    goto :goto_0

    :cond_1
    float-to-double v5, v2

    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    cmpl-double v2, v5, v7

    if-lez v2, :cond_2

    move v2, v13

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    mul-float/2addr v2, v3

    add-float/2addr v2, v4

    :cond_3
    move v14, v2

    iget-object v2, v0, LOV2;->C:Ljava/util/HashMap;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LGt6;

    invoke-virtual {v3, v11, v14}, LGt6;->h(Landroid/view/View;F)V

    goto :goto_1

    :cond_4
    iget-object v2, v0, LOV2;->B:Ljava/util/HashMap;

    const/4 v15, 0x0

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move-object v8, v1

    move v9, v15

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LLt6;

    instance-of v2, v1, LLt6$d;

    if-eqz v2, :cond_5

    move-object v8, v1

    check-cast v8, LLt6$d;

    goto :goto_2

    :cond_5
    move-object/from16 v2, p1

    move v3, v14

    move-wide/from16 v4, p3

    move-object/from16 v6, p5

    invoke-virtual/range {v1 .. v6}, LLt6;->i(Landroid/view/View;FJLdk2;)Z

    move-result v1

    or-int/2addr v9, v1

    goto :goto_2

    :cond_6
    move/from16 v16, v9

    move-object v9, v8

    goto :goto_3

    :cond_7
    move-object v9, v1

    move/from16 v16, v15

    :goto_3
    iget-object v1, v0, LOV2;->k:[LiF0;

    const/4 v10, 0x1

    if-eqz v1, :cond_13

    aget-object v1, v1, v15

    float-to-double v7, v14

    iget-object v2, v0, LOV2;->s:[D

    invoke-virtual {v1, v7, v8, v2}, LiF0;->d(D[D)V

    iget-object v1, v0, LOV2;->k:[LiF0;

    aget-object v1, v1, v15

    iget-object v2, v0, LOV2;->t:[D

    invoke-virtual {v1, v7, v8, v2}, LiF0;->g(D[D)V

    iget-object v1, v0, LOV2;->l:LiF0;

    if-eqz v1, :cond_8

    iget-object v2, v0, LOV2;->s:[D

    array-length v3, v2

    if-lez v3, :cond_8

    invoke-virtual {v1, v7, v8, v2}, LiF0;->d(D[D)V

    iget-object v1, v0, LOV2;->l:LiF0;

    iget-object v2, v0, LOV2;->t:[D

    invoke-virtual {v1, v7, v8, v2}, LiF0;->g(D[D)V

    :cond_8
    iget-boolean v1, v0, LOV2;->L:Z

    if-nez v1, :cond_9

    iget-object v1, v0, LOV2;->g:LXV2;

    iget-object v4, v0, LOV2;->r:[I

    iget-object v5, v0, LOV2;->s:[D

    iget-object v6, v0, LOV2;->t:[D

    const/16 v17, 0x0

    iget-boolean v3, v0, LOV2;->d:Z

    move v2, v14

    move/from16 v18, v3

    move-object/from16 v3, p1

    move-wide v12, v7

    move-object/from16 v7, v17

    move/from16 v8, v18

    invoke-virtual/range {v1 .. v8}, LXV2;->r(FLandroid/view/View;[I[D[D[DZ)V

    iput-boolean v15, v0, LOV2;->d:Z

    goto :goto_4

    :cond_9
    move-wide v12, v7

    :goto_4
    iget v1, v0, LOV2;->G:I

    sget v2, LXj2;->f:I

    if-eq v1, v2, :cond_b

    iget-object v1, v0, LOV2;->H:Landroid/view/View;

    if-nez v1, :cond_a

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    iget v2, v0, LOV2;->G:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, v0, LOV2;->H:Landroid/view/View;

    :cond_a
    iget-object v1, v0, LOV2;->H:Landroid/view/View;

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    iget-object v2, v0, LOV2;->H:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v2

    add-int/2addr v1, v2

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    iget-object v3, v0, LOV2;->H:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v3

    iget-object v4, v0, LOV2;->H:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getRight()I

    move-result v4

    add-int/2addr v3, v4

    int-to-float v3, v3

    div-float/2addr v3, v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getRight()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getLeft()I

    move-result v4

    sub-int/2addr v2, v4

    if-lez v2, :cond_b

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getBottom()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getTop()I

    move-result v4

    sub-int/2addr v2, v4

    if-lez v2, :cond_b

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getLeft()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v3, v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getTop()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v1, v2

    invoke-virtual {v11, v3}, Landroid/view/View;->setPivotX(F)V

    invoke-virtual {v11, v1}, Landroid/view/View;->setPivotY(F)V

    :cond_b
    iget-object v1, v0, LOV2;->C:Ljava/util/HashMap;

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_c
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LXN5;

    instance-of v2, v1, LGt6$d;

    if-eqz v2, :cond_c

    iget-object v2, v0, LOV2;->t:[D

    array-length v3, v2

    if-le v3, v10, :cond_c

    check-cast v1, LGt6$d;

    aget-wide v4, v2, v15

    aget-wide v6, v2, v10

    move-object/from16 v2, p1

    move v3, v14

    invoke-virtual/range {v1 .. v7}, LGt6$d;->i(Landroid/view/View;FDD)V

    goto :goto_5

    :cond_d
    if-eqz v9, :cond_e

    iget-object v1, v0, LOV2;->t:[D

    aget-wide v7, v1, v15

    aget-wide v17, v1, v10

    move-object v1, v9

    move-object/from16 v2, p1

    move-object/from16 v3, p5

    move v4, v14

    move-wide/from16 v5, p3

    move/from16 v19, v10

    move-wide/from16 v9, v17

    invoke-virtual/range {v1 .. v10}, LLt6$d;->j(Landroid/view/View;Ldk2;FJDD)Z

    move-result v1

    or-int v1, v16, v1

    move/from16 v16, v1

    goto :goto_6

    :cond_e
    move/from16 v19, v10

    :goto_6
    move/from16 v10, v19

    :goto_7
    iget-object v1, v0, LOV2;->k:[LiF0;

    array-length v2, v1

    if-ge v10, v2, :cond_f

    aget-object v1, v1, v10

    iget-object v2, v0, LOV2;->x:[F

    invoke-virtual {v1, v12, v13, v2}, LiF0;->e(D[F)V

    iget-object v1, v0, LOV2;->g:LXV2;

    iget-object v1, v1, LXV2;->p:Ljava/util/LinkedHashMap;

    iget-object v2, v0, LOV2;->u:[Ljava/lang/String;

    add-int/lit8 v3, v10, -0x1

    aget-object v2, v2, v3

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/constraintlayout/widget/a;

    iget-object v2, v0, LOV2;->x:[F

    invoke-static {v1, v11, v2}, LpF0;->b(Landroidx/constraintlayout/widget/a;Landroid/view/View;[F)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_f
    iget-object v1, v0, LOV2;->i:LNV2;

    iget v2, v1, LNV2;->c:I

    if-nez v2, :cond_12

    const/4 v2, 0x0

    cmpg-float v2, v14, v2

    if-gtz v2, :cond_10

    iget v1, v1, LNV2;->d:I

    invoke-virtual {v11, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_8

    :cond_10
    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v2, v14, v2

    if-ltz v2, :cond_11

    iget-object v1, v0, LOV2;->j:LNV2;

    iget v1, v1, LNV2;->d:I

    invoke-virtual {v11, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_8

    :cond_11
    iget-object v2, v0, LOV2;->j:LNV2;

    iget v2, v2, LNV2;->d:I

    iget v1, v1, LNV2;->d:I

    if-eq v2, v1, :cond_12

    invoke-virtual {v11, v15}, Landroid/view/View;->setVisibility(I)V

    :cond_12
    :goto_8
    iget-object v1, v0, LOV2;->E:[LNk2;

    if-eqz v1, :cond_16

    move v1, v15

    :goto_9
    iget-object v2, v0, LOV2;->E:[LNk2;

    array-length v3, v2

    if-ge v1, v3, :cond_16

    aget-object v2, v2, v1

    invoke-virtual {v2, v14, v11}, LNk2;->y(FLandroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_13
    move/from16 v19, v10

    iget-object v1, v0, LOV2;->g:LXV2;

    iget v2, v1, LXV2;->f:F

    iget-object v3, v0, LOV2;->h:LXV2;

    iget v4, v3, LXV2;->f:F

    sub-float/2addr v4, v2

    mul-float/2addr v4, v14

    add-float/2addr v2, v4

    iget v4, v1, LXV2;->g:F

    iget v5, v3, LXV2;->g:F

    sub-float/2addr v5, v4

    mul-float/2addr v5, v14

    add-float/2addr v4, v5

    iget v5, v1, LXV2;->h:F

    iget v6, v3, LXV2;->h:F

    sub-float v7, v6, v5

    mul-float/2addr v7, v14

    add-float/2addr v7, v5

    iget v1, v1, LXV2;->i:F

    iget v3, v3, LXV2;->i:F

    sub-float v8, v3, v1

    mul-float/2addr v8, v14

    add-float/2addr v8, v1

    const/high16 v9, 0x3f000000    # 0.5f

    add-float/2addr v2, v9

    float-to-int v10, v2

    add-float/2addr v4, v9

    float-to-int v9, v4

    add-float/2addr v2, v7

    float-to-int v2, v2

    add-float/2addr v4, v8

    float-to-int v4, v4

    sub-int v7, v2, v10

    sub-int v8, v4, v9

    cmpl-float v5, v6, v5

    if-nez v5, :cond_14

    cmpl-float v1, v3, v1

    if-nez v1, :cond_14

    iget-boolean v1, v0, LOV2;->d:Z

    if-eqz v1, :cond_15

    :cond_14
    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v7, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-static {v8, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {v11, v3, v1}, Landroid/view/View;->measure(II)V

    iput-boolean v15, v0, LOV2;->d:Z

    :cond_15
    invoke-virtual {v11, v10, v9, v2, v4}, Landroid/view/View;->layout(IIII)V

    :cond_16
    iget-object v1, v0, LOV2;->D:Ljava/util/HashMap;

    if-eqz v1, :cond_18

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_18

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvs6;

    instance-of v2, v1, Lvs6$d;

    if-eqz v2, :cond_17

    check-cast v1, Lvs6$d;

    iget-object v2, v0, LOV2;->t:[D

    aget-wide v4, v2, v15

    aget-wide v6, v2, v19

    move-object/from16 v2, p1

    move v3, v14

    invoke-virtual/range {v1 .. v7}, Lvs6$d;->k(Landroid/view/View;FDD)V

    goto :goto_a

    :cond_17
    invoke-virtual {v1, v11, v14}, Lvs6;->j(Landroid/view/View;F)V

    goto :goto_a

    :cond_18
    return v16
.end method

.method public final y(LXV2;)V
    .locals 4

    iget-object v0, p0, LOV2;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getX()F

    move-result v0

    float-to-int v0, v0

    int-to-float v0, v0

    iget-object v1, p0, LOV2;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getY()F

    move-result v1

    float-to-int v1, v1

    int-to-float v1, v1

    iget-object v2, p0, LOV2;->b:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    iget-object v3, p0, LOV2;->b:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p1, v0, v1, v2, v3}, LXV2;->p(FFFF)V

    return-void
.end method

.method public z()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LOV2;->d:Z

    return-void
.end method
