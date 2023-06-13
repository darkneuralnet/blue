.class public LNk2;
.super LXj2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LNk2$a;
    }
.end annotation


# instance fields
.field public A:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ">;"
        }
    .end annotation
.end field

.field public g:I

.field public h:Ljava/lang/String;

.field public i:I

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:I

.field public m:I

.field public n:Landroid/view/View;

.field public o:F

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:F

.field public t:F

.field public u:Z

.field public v:I

.field public w:I

.field public x:I

.field public y:Landroid/graphics/RectF;

.field public z:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LXj2;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LNk2;->g:I

    const/4 v0, 0x0

    iput-object v0, p0, LNk2;->h:Ljava/lang/String;

    sget v1, LXj2;->f:I

    iput v1, p0, LNk2;->i:I

    iput-object v0, p0, LNk2;->j:Ljava/lang/String;

    iput-object v0, p0, LNk2;->k:Ljava/lang/String;

    iput v1, p0, LNk2;->l:I

    iput v1, p0, LNk2;->m:I

    iput-object v0, p0, LNk2;->n:Landroid/view/View;

    const v0, 0x3dcccccd    # 0.1f

    iput v0, p0, LNk2;->o:F

    const/4 v0, 0x1

    iput-boolean v0, p0, LNk2;->p:Z

    iput-boolean v0, p0, LNk2;->q:Z

    iput-boolean v0, p0, LNk2;->r:Z

    const/high16 v0, 0x7fc00000    # Float.NaN

    iput v0, p0, LNk2;->s:F

    const/4 v0, 0x0

    iput-boolean v0, p0, LNk2;->u:Z

    iput v1, p0, LNk2;->v:I

    iput v1, p0, LNk2;->w:I

    iput v1, p0, LNk2;->x:I

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, LNk2;->y:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, LNk2;->z:Landroid/graphics/RectF;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LNk2;->A:Ljava/util/HashMap;

    const/4 v0, 0x5

    iput v0, p0, LXj2;->d:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LXj2;->e:Ljava/util/HashMap;

    return-void
.end method

.method public static synthetic m(LNk2;F)F
    .locals 0

    iput p1, p0, LNk2;->s:F

    return p1
.end method

.method public static synthetic n(LNk2;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, LNk2;->j:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic o(LNk2;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, LNk2;->k:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic p(LNk2;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, LNk2;->h:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic q(LNk2;)I
    .locals 0

    iget p0, p0, LNk2;->l:I

    return p0
.end method

.method public static synthetic r(LNk2;I)I
    .locals 0

    iput p1, p0, LNk2;->l:I

    return p1
.end method

.method public static synthetic s(LNk2;)I
    .locals 0

    iget p0, p0, LNk2;->m:I

    return p0
.end method

.method public static synthetic t(LNk2;I)I
    .locals 0

    iput p1, p0, LNk2;->m:I

    return p1
.end method

.method public static synthetic u(LNk2;)Z
    .locals 0

    iget-boolean p0, p0, LNk2;->u:Z

    return p0
.end method

.method public static synthetic v(LNk2;Z)Z
    .locals 0

    iput-boolean p1, p0, LNk2;->u:Z

    return p1
.end method

.method public static synthetic w(LNk2;)I
    .locals 0

    iget p0, p0, LNk2;->i:I

    return p0
.end method

.method public static synthetic x(LNk2;I)I
    .locals 0

    iput p1, p0, LNk2;->i:I

    return p1
.end method


# virtual methods
.method public final A(Ljava/lang/String;Landroid/view/View;)V
    .locals 4

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    :cond_1
    iget-object v1, p0, LXj2;->e:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    if-nez v0, :cond_3

    invoke-virtual {v3, p1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_3
    iget-object v3, p0, LXj2;->e:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/widget/a;

    if-eqz v2, :cond_2

    invoke-virtual {v2, p2}, Landroidx/constraintlayout/widget/a;->a(Landroid/view/View;)V

    goto :goto_1

    :cond_4
    return-void
.end method

.method public final B(Landroid/graphics/RectF;Landroid/view/View;Z)V
    .locals 1

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v0

    int-to-float v0, v0

    iput v0, p1, Landroid/graphics/RectF;->top:F

    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result v0

    int-to-float v0, v0

    iput v0, p1, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    iput v0, p1, Landroid/graphics/RectF;->left:F

    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result v0

    int-to-float v0, v0

    iput v0, p1, Landroid/graphics/RectF;->right:F

    if-eqz p3, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    :cond_0
    return-void
.end method

.method public a(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "LGt6;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public b()LXj2;
    .locals 1

    new-instance v0, LNk2;

    invoke-direct {v0}, LNk2;-><init>()V

    invoke-virtual {v0, p0}, LNk2;->c(LXj2;)LXj2;

    move-result-object v0

    return-object v0
.end method

.method public c(LXj2;)LXj2;
    .locals 1

    invoke-super {p0, p1}, LXj2;->c(LXj2;)LXj2;

    check-cast p1, LNk2;

    iget v0, p1, LNk2;->g:I

    iput v0, p0, LNk2;->g:I

    iget-object v0, p1, LNk2;->h:Ljava/lang/String;

    iput-object v0, p0, LNk2;->h:Ljava/lang/String;

    iget v0, p1, LNk2;->i:I

    iput v0, p0, LNk2;->i:I

    iget-object v0, p1, LNk2;->j:Ljava/lang/String;

    iput-object v0, p0, LNk2;->j:Ljava/lang/String;

    iget-object v0, p1, LNk2;->k:Ljava/lang/String;

    iput-object v0, p0, LNk2;->k:Ljava/lang/String;

    iget v0, p1, LNk2;->l:I

    iput v0, p0, LNk2;->l:I

    iget v0, p1, LNk2;->m:I

    iput v0, p0, LNk2;->m:I

    iget-object v0, p1, LNk2;->n:Landroid/view/View;

    iput-object v0, p0, LNk2;->n:Landroid/view/View;

    iget v0, p1, LNk2;->o:F

    iput v0, p0, LNk2;->o:F

    iget-boolean v0, p1, LNk2;->p:Z

    iput-boolean v0, p0, LNk2;->p:Z

    iget-boolean v0, p1, LNk2;->q:Z

    iput-boolean v0, p0, LNk2;->q:Z

    iget-boolean v0, p1, LNk2;->r:Z

    iput-boolean v0, p0, LNk2;->r:Z

    iget v0, p1, LNk2;->s:F

    iput v0, p0, LNk2;->s:F

    iget v0, p1, LNk2;->t:F

    iput v0, p0, LNk2;->t:F

    iget-boolean v0, p1, LNk2;->u:Z

    iput-boolean v0, p0, LNk2;->u:Z

    iget-object v0, p1, LNk2;->y:Landroid/graphics/RectF;

    iput-object v0, p0, LNk2;->y:Landroid/graphics/RectF;

    iget-object v0, p1, LNk2;->z:Landroid/graphics/RectF;

    iput-object v0, p0, LNk2;->z:Landroid/graphics/RectF;

    iget-object p1, p1, LNk2;->A:Ljava/util/HashMap;

    iput-object p1, p0, LNk2;->A:Ljava/util/HashMap;

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LNk2;->b()LXj2;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/util/HashSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public e(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget-object v0, Lcm4;->KeyTrigger:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    invoke-static {p0, p2, p1}, LNk2$a;->a(LNk2;Landroid/content/res/TypedArray;Landroid/content/Context;)V

    return-void
.end method

.method public y(FLandroid/view/View;)V
    .locals 9

    iget v0, p0, LNk2;->m:I

    sget v1, LXj2;->f:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_6

    iget-object v0, p0, LNk2;->n:Landroid/view/View;

    if-nez v0, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iget v1, p0, LNk2;->m:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, LNk2;->n:Landroid/view/View;

    :cond_0
    iget-object v0, p0, LNk2;->y:Landroid/graphics/RectF;

    iget-object v1, p0, LNk2;->n:Landroid/view/View;

    iget-boolean v4, p0, LNk2;->u:Z

    invoke-virtual {p0, v0, v1, v4}, LNk2;->B(Landroid/graphics/RectF;Landroid/view/View;Z)V

    iget-object v0, p0, LNk2;->z:Landroid/graphics/RectF;

    iget-boolean v1, p0, LNk2;->u:Z

    invoke-virtual {p0, v0, p2, v1}, LNk2;->B(Landroid/graphics/RectF;Landroid/view/View;Z)V

    iget-object v0, p0, LNk2;->y:Landroid/graphics/RectF;

    iget-object v1, p0, LNk2;->z:Landroid/graphics/RectF;

    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, LNk2;->p:Z

    if-eqz v0, :cond_1

    iput-boolean v3, p0, LNk2;->p:Z

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v3

    :goto_0
    iget-boolean v1, p0, LNk2;->r:Z

    if-eqz v1, :cond_2

    iput-boolean v3, p0, LNk2;->r:Z

    move v1, v2

    goto :goto_1

    :cond_2
    move v1, v3

    :goto_1
    iput-boolean v2, p0, LNk2;->q:Z

    move v4, v1

    move v1, v3

    goto/16 :goto_8

    :cond_3
    iget-boolean v0, p0, LNk2;->p:Z

    if-nez v0, :cond_4

    iput-boolean v2, p0, LNk2;->p:Z

    move v0, v2

    goto :goto_2

    :cond_4
    move v0, v3

    :goto_2
    iget-boolean v1, p0, LNk2;->q:Z

    if-eqz v1, :cond_5

    iput-boolean v3, p0, LNk2;->q:Z

    move v1, v2

    goto :goto_3

    :cond_5
    move v1, v3

    :goto_3
    iput-boolean v2, p0, LNk2;->r:Z

    goto/16 :goto_7

    :cond_6
    iget-boolean v0, p0, LNk2;->p:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    iget v0, p0, LNk2;->s:F

    sub-float v4, p1, v0

    iget v5, p0, LNk2;->t:F

    sub-float/2addr v5, v0

    mul-float/2addr v4, v5

    cmpg-float v0, v4, v1

    if-gez v0, :cond_8

    iput-boolean v3, p0, LNk2;->p:Z

    move v0, v2

    goto :goto_4

    :cond_7
    iget v0, p0, LNk2;->s:F

    sub-float v0, p1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v4, p0, LNk2;->o:F

    cmpl-float v0, v0, v4

    if-lez v0, :cond_8

    iput-boolean v2, p0, LNk2;->p:Z

    :cond_8
    move v0, v3

    :goto_4
    iget-boolean v4, p0, LNk2;->q:Z

    if-eqz v4, :cond_9

    iget v4, p0, LNk2;->s:F

    sub-float v5, p1, v4

    iget v6, p0, LNk2;->t:F

    sub-float/2addr v6, v4

    mul-float/2addr v6, v5

    cmpg-float v4, v6, v1

    if-gez v4, :cond_a

    cmpg-float v4, v5, v1

    if-gez v4, :cond_a

    iput-boolean v3, p0, LNk2;->q:Z

    move v4, v2

    goto :goto_5

    :cond_9
    iget v4, p0, LNk2;->s:F

    sub-float v4, p1, v4

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    iget v5, p0, LNk2;->o:F

    cmpl-float v4, v4, v5

    if-lez v4, :cond_a

    iput-boolean v2, p0, LNk2;->q:Z

    :cond_a
    move v4, v3

    :goto_5
    iget-boolean v5, p0, LNk2;->r:Z

    if-eqz v5, :cond_c

    iget v5, p0, LNk2;->s:F

    sub-float v6, p1, v5

    iget v7, p0, LNk2;->t:F

    sub-float/2addr v7, v5

    mul-float/2addr v7, v6

    cmpg-float v5, v7, v1

    if-gez v5, :cond_b

    cmpl-float v1, v6, v1

    if-lez v1, :cond_b

    iput-boolean v3, p0, LNk2;->r:Z

    move v1, v2

    goto :goto_6

    :cond_b
    move v1, v3

    :goto_6
    move v8, v4

    move v4, v1

    move v1, v8

    goto :goto_8

    :cond_c
    iget v1, p0, LNk2;->s:F

    sub-float v1, p1, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iget v5, p0, LNk2;->o:F

    cmpl-float v1, v1, v5

    if-lez v1, :cond_d

    iput-boolean v2, p0, LNk2;->r:Z

    :cond_d
    move v1, v4

    :goto_7
    move v4, v3

    :goto_8
    iput p1, p0, LNk2;->t:F

    if-nez v1, :cond_e

    if-nez v0, :cond_e

    if-eqz v4, :cond_f

    :cond_e
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    check-cast v5, Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v6, p0, LNk2;->l:I

    invoke-virtual {v5, v6, v4, p1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->O(IZF)V

    :cond_f
    iget p1, p0, LNk2;->i:I

    sget v5, LXj2;->f:I

    if-ne p1, v5, :cond_10

    move-object p1, p2

    goto :goto_9

    :cond_10
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v5, p0, LNk2;->i:I

    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_9
    if-eqz v1, :cond_12

    iget-object v1, p0, LNk2;->j:Ljava/lang/String;

    if-eqz v1, :cond_11

    invoke-virtual {p0, v1, p1}, LNk2;->z(Ljava/lang/String;Landroid/view/View;)V

    :cond_11
    iget v1, p0, LNk2;->v:I

    sget v5, LXj2;->f:I

    if-eq v1, v5, :cond_12

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v5, p0, LNk2;->v:I

    new-array v6, v2, [Landroid/view/View;

    aput-object p1, v6, v3

    invoke-virtual {v1, v5, v6}, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0(I[Landroid/view/View;)V

    :cond_12
    if-eqz v4, :cond_14

    iget-object v1, p0, LNk2;->k:Ljava/lang/String;

    if-eqz v1, :cond_13

    invoke-virtual {p0, v1, p1}, LNk2;->z(Ljava/lang/String;Landroid/view/View;)V

    :cond_13
    iget v1, p0, LNk2;->w:I

    sget v4, LXj2;->f:I

    if-eq v1, v4, :cond_14

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v4, p0, LNk2;->w:I

    new-array v5, v2, [Landroid/view/View;

    aput-object p1, v5, v3

    invoke-virtual {v1, v4, v5}, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0(I[Landroid/view/View;)V

    :cond_14
    if-eqz v0, :cond_16

    iget-object v0, p0, LNk2;->h:Ljava/lang/String;

    if-eqz v0, :cond_15

    invoke-virtual {p0, v0, p1}, LNk2;->z(Ljava/lang/String;Landroid/view/View;)V

    :cond_15
    iget v0, p0, LNk2;->x:I

    sget v1, LXj2;->f:I

    if-eq v0, v1, :cond_16

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    check-cast p2, Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v0, p0, LNk2;->x:I

    new-array v1, v2, [Landroid/view/View;

    aput-object p1, v1, v3

    invoke-virtual {p2, v0, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->w0(I[Landroid/view/View;)V

    :cond_16
    return-void
.end method

.method public final z(Ljava/lang/String;Landroid/view/View;)V
    .locals 7

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "."

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1, p2}, LNk2;->A(Ljava/lang/String;Landroid/view/View;)V

    return-void

    :cond_1
    iget-object v0, p0, LNk2;->A:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, LNk2;->A:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    if-nez v0, :cond_3

    return-void

    :cond_2
    move-object v0, v1

    :cond_3
    const-string v2, " "

    const-string v3, "\"on class "

    const-string v4, "KeyTrigger"

    const/4 v5, 0x0

    if-nez v0, :cond_4

    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    new-array v6, v5, [Ljava/lang/Class;

    invoke-virtual {v0, p1, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    iget-object v6, p0, LNk2;->A:Ljava/util/HashMap;

    invoke-virtual {v6, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object v0, p0, LNk2;->A:Ljava/util/HashMap;

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not find method \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, LFU0;->d(Landroid/view/View;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_4
    :goto_0
    :try_start_1
    new-array p1, v5, [Ljava/lang/Object;

    invoke-virtual {v0, p2, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Exception in call \""

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LNk2;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, LFU0;->d(Landroid/view/View;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return-void
.end method
