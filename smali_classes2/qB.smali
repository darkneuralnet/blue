.class public abstract LqB;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp71;
.implements LoB$b;
.implements LCk2;


# instance fields
.field public A:Landroid/graphics/Paint;

.field public B:F

.field public C:Landroid/graphics/BlurMaskFilter;

.field public final a:Landroid/graphics/Path;

.field public final b:Landroid/graphics/Matrix;

.field public final c:Landroid/graphics/Matrix;

.field public final d:Landroid/graphics/Paint;

.field public final e:Landroid/graphics/Paint;

.field public final f:Landroid/graphics/Paint;

.field public final g:Landroid/graphics/Paint;

.field public final h:Landroid/graphics/Paint;

.field public final i:Landroid/graphics/RectF;

.field public final j:Landroid/graphics/RectF;

.field public final k:Landroid/graphics/RectF;

.field public final l:Landroid/graphics/RectF;

.field public final m:Landroid/graphics/RectF;

.field public final n:Ljava/lang/String;

.field public final o:Landroid/graphics/Matrix;

.field public final p:LRD2;

.field public final q:Lfm2;

.field public r:LqM2;

.field public s:Lou1;

.field public t:LqB;

.field public u:LqB;

.field public v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LqB;",
            ">;"
        }
    .end annotation
.end field

.field public final w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LoB<",
            "**>;>;"
        }
    .end annotation
.end field

.field public final x:Lm96;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(LRD2;Lfm2;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, LqB;->a:Landroid/graphics/Path;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, LqB;->b:Landroid/graphics/Matrix;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, LqB;->c:Landroid/graphics/Matrix;

    new-instance v0, LPl2;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LPl2;-><init>(I)V

    iput-object v0, p0, LqB;->d:Landroid/graphics/Paint;

    new-instance v0, LPl2;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1, v2}, LPl2;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    iput-object v0, p0, LqB;->e:Landroid/graphics/Paint;

    new-instance v0, LPl2;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1, v2}, LPl2;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    iput-object v0, p0, LqB;->f:Landroid/graphics/Paint;

    new-instance v0, LPl2;

    invoke-direct {v0, v1}, LPl2;-><init>(I)V

    iput-object v0, p0, LqB;->g:Landroid/graphics/Paint;

    new-instance v2, LPl2;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v2, v3}, LPl2;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    iput-object v2, p0, LqB;->h:Landroid/graphics/Paint;

    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, LqB;->i:Landroid/graphics/RectF;

    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, LqB;->j:Landroid/graphics/RectF;

    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, LqB;->k:Landroid/graphics/RectF;

    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, LqB;->l:Landroid/graphics/RectF;

    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, LqB;->m:Landroid/graphics/RectF;

    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    iput-object v2, p0, LqB;->o:Landroid/graphics/Matrix;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, LqB;->w:Ljava/util/List;

    iput-boolean v1, p0, LqB;->y:Z

    const/4 v1, 0x0

    iput v1, p0, LqB;->B:F

    iput-object p1, p0, LqB;->p:LRD2;

    iput-object p2, p0, LqB;->q:Lfm2;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lfm2;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "#draw"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LqB;->n:Ljava/lang/String;

    invoke-virtual {p2}, Lfm2;->h()Lfm2$b;

    move-result-object p1

    sget-object v1, Lfm2$b;->d:Lfm2$b;

    if-ne p1, v1, :cond_0

    new-instance p1, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p1, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p1, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    :goto_0
    invoke-virtual {p2}, Lfm2;->w()LEe;

    move-result-object p1

    invoke-virtual {p1}, LEe;->b()Lm96;

    move-result-object p1

    iput-object p1, p0, LqB;->x:Lm96;

    invoke-virtual {p1, p0}, Lm96;->b(LoB$b;)V

    invoke-virtual {p2}, Lfm2;->g()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p2}, Lfm2;->g()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    new-instance p1, LqM2;

    invoke-virtual {p2}, Lfm2;->g()Ljava/util/List;

    move-result-object p2

    invoke-direct {p1, p2}, LqM2;-><init>(Ljava/util/List;)V

    iput-object p1, p0, LqB;->r:LqM2;

    invoke-virtual {p1}, LqM2;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LoB;

    invoke-virtual {p2, p0}, LoB;->a(LoB$b;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, LqB;->r:LqM2;

    invoke-virtual {p1}, LqM2;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LoB;

    invoke-virtual {p0, p2}, LqB;->i(LoB;)V

    invoke-virtual {p2, p0}, LoB;->a(LoB$b;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, LqB;->N()V

    return-void
.end method

.method private synthetic E()V
    .locals 2

    iget-object v0, p0, LqB;->s:Lou1;

    invoke-virtual {v0}, Lou1;->p()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, LqB;->M(Z)V

    return-void
.end method

.method public static synthetic b(LqB;)V
    .locals 0

    invoke-direct {p0}, LqB;->E()V

    return-void
.end method

.method public static u(Leu0;Lfm2;LRD2;LrD2;)LqB;
    .locals 2

    sget-object v0, LqB$a;->a:[I

    invoke-virtual {p1}, Lfm2;->f()Lfm2$a;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Unknown layer type "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lfm2;->f()Lfm2$a;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LDx2;->c(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    new-instance p0, Ld26;

    invoke-direct {p0, p2, p1}, Ld26;-><init>(LRD2;Lfm2;)V

    return-object p0

    :pswitch_1
    new-instance p0, Lld3;

    invoke-direct {p0, p2, p1}, Lld3;-><init>(LRD2;Lfm2;)V

    return-object p0

    :pswitch_2
    new-instance p0, LyX1;

    invoke-direct {p0, p2, p1}, LyX1;-><init>(LRD2;Lfm2;)V

    return-object p0

    :pswitch_3
    new-instance p0, LqN5;

    invoke-direct {p0, p2, p1}, LqN5;-><init>(LRD2;Lfm2;)V

    return-object p0

    :pswitch_4
    new-instance p0, Leu0;

    invoke-virtual {p1}, Lfm2;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, LrD2;->o(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p2, p1, v0, p3}, Leu0;-><init>(LRD2;Lfm2;Ljava/util/List;LrD2;)V

    return-object p0

    :pswitch_5
    new-instance v0, Lty5;

    invoke-direct {v0, p2, p1, p0, p3}, Lty5;-><init>(LRD2;Lfm2;Leu0;LrD2;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public A()Z
    .locals 1

    iget-object v0, p0, LqB;->t:LqB;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final B(Landroid/graphics/RectF;Landroid/graphics/Matrix;)V
    .locals 10

    iget-object v0, p0, LqB;->k:Landroid/graphics/RectF;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {p0}, LqB;->z()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LqB;->r:LqM2;

    invoke-virtual {v0}, LqM2;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_6

    iget-object v4, p0, LqB;->r:LqM2;

    invoke-virtual {v4}, LqM2;->b()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LpM2;

    iget-object v5, p0, LqB;->r:LqM2;

    invoke-virtual {v5}, LqM2;->a()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LoB;

    invoke-virtual {v5}, LoB;->h()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Path;

    if-nez v5, :cond_1

    goto :goto_2

    :cond_1
    iget-object v6, p0, LqB;->a:Landroid/graphics/Path;

    invoke-virtual {v6, v5}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    iget-object v5, p0, LqB;->a:Landroid/graphics/Path;

    invoke-virtual {v5, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    sget-object v5, LqB$a;->b:[I

    invoke-virtual {v4}, LpM2;->a()LpM2$a;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v5, v5, v6

    const/4 v6, 0x1

    if-eq v5, v6, :cond_5

    const/4 v6, 0x2

    if-eq v5, v6, :cond_5

    const/4 v6, 0x3

    if-eq v5, v6, :cond_2

    const/4 v6, 0x4

    if-eq v5, v6, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v4}, LpM2;->d()Z

    move-result v4

    if-eqz v4, :cond_3

    return-void

    :cond_3
    :goto_1
    iget-object v4, p0, LqB;->a:Landroid/graphics/Path;

    iget-object v5, p0, LqB;->m:Landroid/graphics/RectF;

    invoke-virtual {v4, v5, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    if-nez v3, :cond_4

    iget-object v4, p0, LqB;->k:Landroid/graphics/RectF;

    iget-object v5, p0, LqB;->m:Landroid/graphics/RectF;

    invoke-virtual {v4, v5}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    goto :goto_2

    :cond_4
    iget-object v4, p0, LqB;->k:Landroid/graphics/RectF;

    iget v5, v4, Landroid/graphics/RectF;->left:F

    iget-object v6, p0, LqB;->m:Landroid/graphics/RectF;

    iget v6, v6, Landroid/graphics/RectF;->left:F

    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    move-result v5

    iget-object v6, p0, LqB;->k:Landroid/graphics/RectF;

    iget v6, v6, Landroid/graphics/RectF;->top:F

    iget-object v7, p0, LqB;->m:Landroid/graphics/RectF;

    iget v7, v7, Landroid/graphics/RectF;->top:F

    invoke-static {v6, v7}, Ljava/lang/Math;->min(FF)F

    move-result v6

    iget-object v7, p0, LqB;->k:Landroid/graphics/RectF;

    iget v7, v7, Landroid/graphics/RectF;->right:F

    iget-object v8, p0, LqB;->m:Landroid/graphics/RectF;

    iget v8, v8, Landroid/graphics/RectF;->right:F

    invoke-static {v7, v8}, Ljava/lang/Math;->max(FF)F

    move-result v7

    iget-object v8, p0, LqB;->k:Landroid/graphics/RectF;

    iget v8, v8, Landroid/graphics/RectF;->bottom:F

    iget-object v9, p0, LqB;->m:Landroid/graphics/RectF;

    iget v9, v9, Landroid/graphics/RectF;->bottom:F

    invoke-static {v8, v9}, Ljava/lang/Math;->max(FF)F

    move-result v8

    invoke-virtual {v4, v5, v6, v7, v8}, Landroid/graphics/RectF;->set(FFFF)V

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_5
    return-void

    :cond_6
    iget-object p2, p0, LqB;->k:Landroid/graphics/RectF;

    invoke-virtual {p1, p2}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    move-result p2

    if-nez p2, :cond_7

    invoke-virtual {p1, v1, v1, v1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    :cond_7
    return-void
.end method

.method public final C(Landroid/graphics/RectF;Landroid/graphics/Matrix;)V
    .locals 4

    invoke-virtual {p0}, LqB;->A()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LqB;->q:Lfm2;

    invoke-virtual {v0}, Lfm2;->h()Lfm2$b;

    move-result-object v0

    sget-object v1, Lfm2$b;->d:Lfm2$b;

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, LqB;->l:Landroid/graphics/RectF;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v0, p0, LqB;->t:LqB;

    iget-object v2, p0, LqB;->l:Landroid/graphics/RectF;

    const/4 v3, 0x1

    invoke-virtual {v0, v2, p2, v3}, LqB;->a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object p2, p0, LqB;->l:Landroid/graphics/RectF;

    invoke-virtual {p1, p2}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-virtual {p1, v1, v1, v1, v1}, Landroid/graphics/RectF;->set(FFFF)V

    :cond_2
    return-void
.end method

.method public final D()V
    .locals 1

    iget-object v0, p0, LqB;->p:LRD2;

    invoke-virtual {v0}, LRD2;->invalidateSelf()V

    return-void
.end method

.method public final F(F)V
    .locals 2

    iget-object v0, p0, LqB;->p:LRD2;

    invoke-virtual {v0}, LRD2;->I()LrD2;

    move-result-object v0

    invoke-virtual {v0}, LrD2;->n()LoQ3;

    move-result-object v0

    iget-object v1, p0, LqB;->q:Lfm2;

    invoke-virtual {v1}, Lfm2;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, LoQ3;->a(Ljava/lang/String;F)V

    return-void
.end method

.method public G(LoB;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LoB<",
            "**>;)V"
        }
    .end annotation

    iget-object v0, p0, LqB;->w:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public H(LBk2;ILjava/util/List;LBk2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBk2;",
            "I",
            "Ljava/util/List<",
            "LBk2;",
            ">;",
            "LBk2;",
            ")V"
        }
    .end annotation

    return-void
.end method

.method public I(LqB;)V
    .locals 0

    iput-object p1, p0, LqB;->t:LqB;

    return-void
.end method

.method public J(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, LqB;->A:Landroid/graphics/Paint;

    if-nez v0, :cond_0

    new-instance v0, LPl2;

    invoke-direct {v0}, LPl2;-><init>()V

    iput-object v0, p0, LqB;->A:Landroid/graphics/Paint;

    :cond_0
    iput-boolean p1, p0, LqB;->z:Z

    return-void
.end method

.method public K(LqB;)V
    .locals 0

    iput-object p1, p0, LqB;->u:LqB;

    return-void
.end method

.method public L(F)V
    .locals 3

    iget-object v0, p0, LqB;->x:Lm96;

    invoke-virtual {v0, p1}, Lm96;->j(F)V

    iget-object v0, p0, LqB;->r:LqM2;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    iget-object v2, p0, LqB;->r:LqM2;

    invoke-virtual {v2}, LqM2;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    iget-object v2, p0, LqB;->r:LqM2;

    invoke-virtual {v2}, LqM2;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LoB;

    invoke-virtual {v2, p1}, LoB;->m(F)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LqB;->s:Lou1;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, LoB;->m(F)V

    :cond_1
    iget-object v0, p0, LqB;->t:LqB;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, LqB;->L(F)V

    :cond_2
    :goto_1
    iget-object v0, p0, LqB;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    iget-object v0, p0, LqB;->w:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LoB;

    invoke-virtual {v0, p1}, LoB;->m(F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final M(Z)V
    .locals 1

    iget-boolean v0, p0, LqB;->y:Z

    if-eq p1, v0, :cond_0

    iput-boolean p1, p0, LqB;->y:Z

    invoke-virtual {p0}, LqB;->D()V

    :cond_0
    return-void
.end method

.method public final N()V
    .locals 3

    iget-object v0, p0, LqB;->q:Lfm2;

    invoke-virtual {v0}, Lfm2;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    new-instance v0, Lou1;

    iget-object v2, p0, LqB;->q:Lfm2;

    invoke-virtual {v2}, Lfm2;->e()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2}, Lou1;-><init>(Ljava/util/List;)V

    iput-object v0, p0, LqB;->s:Lou1;

    invoke-virtual {v0}, LoB;->l()V

    iget-object v0, p0, LqB;->s:Lou1;

    new-instance v2, LpB;

    invoke-direct {v2, p0}, LpB;-><init>(LqB;)V

    invoke-virtual {v0, v2}, LoB;->a(LoB$b;)V

    iget-object v0, p0, LqB;->s:Lou1;

    invoke-virtual {v0}, LoB;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0, v1}, LqB;->M(Z)V

    iget-object v0, p0, LqB;->s:Lou1;

    invoke-virtual {p0, v0}, LqB;->i(LoB;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v1}, LqB;->M(Z)V

    :goto_1
    return-void
.end method

.method public a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 1

    iget-object p1, p0, LqB;->i:Landroid/graphics/RectF;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, v0}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {p0}, LqB;->r()V

    iget-object p1, p0, LqB;->o:Landroid/graphics/Matrix;

    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    if-eqz p3, :cond_1

    iget-object p1, p0, LqB;->v:Ljava/util/List;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    :goto_0
    if-ltz p1, :cond_1

    iget-object p2, p0, LqB;->o:Landroid/graphics/Matrix;

    iget-object p3, p0, LqB;->v:Ljava/util/List;

    invoke-interface {p3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LqB;

    iget-object p3, p3, LqB;->x:Lm96;

    invoke-virtual {p3}, Lm96;->f()Landroid/graphics/Matrix;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LqB;->u:LqB;

    if-eqz p1, :cond_1

    iget-object p2, p0, LqB;->o:Landroid/graphics/Matrix;

    iget-object p1, p1, LqB;->x:Lm96;

    invoke-virtual {p1}, Lm96;->f()Landroid/graphics/Matrix;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    :cond_1
    iget-object p1, p0, LqB;->o:Landroid/graphics/Matrix;

    iget-object p2, p0, LqB;->x:Lm96;

    invoke-virtual {p2}, Lm96;->f()Landroid/graphics/Matrix;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    return-void
.end method

.method public c(LBk2;ILjava/util/List;LBk2;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LBk2;",
            "I",
            "Ljava/util/List<",
            "LBk2;",
            ">;",
            "LBk2;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, LqB;->t:LqB;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LqB;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, LBk2;->a(Ljava/lang/String;)LBk2;

    move-result-object v0

    iget-object v1, p0, LqB;->t:LqB;

    invoke-virtual {v1}, LqB;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, LBk2;->c(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LqB;->t:LqB;

    invoke-virtual {v0, v1}, LBk2;->i(LCk2;)LBk2;

    move-result-object v1

    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0}, LqB;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, LBk2;->h(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, LqB;->t:LqB;

    invoke-virtual {v1}, LqB;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, p2}, LBk2;->e(Ljava/lang/String;I)I

    move-result v1

    add-int/2addr v1, p2

    iget-object v2, p0, LqB;->t:LqB;

    invoke-virtual {v2, p1, v1, p3, v0}, LqB;->H(LBk2;ILjava/util/List;LBk2;)V

    :cond_1
    invoke-virtual {p0}, LqB;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, LBk2;->g(Ljava/lang/String;I)Z

    move-result v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    const-string v0, "__container"

    invoke-virtual {p0}, LqB;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, LqB;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, LBk2;->a(Ljava/lang/String;)LBk2;

    move-result-object p4

    invoke-virtual {p0}, LqB;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, LBk2;->c(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p4, p0}, LBk2;->i(LCk2;)LBk2;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-virtual {p0}, LqB;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, LBk2;->h(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, LqB;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, LBk2;->e(Ljava/lang/String;I)I

    move-result v0

    add-int/2addr p2, v0

    invoke-virtual {p0, p1, p2, p3, p4}, LqB;->H(LBk2;ILjava/util/List;LBk2;)V

    :cond_4
    return-void
.end method

.method public d(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V
    .locals 6

    iget-object v0, p0, LqB;->n:Ljava/lang/String;

    invoke-static {v0}, LDl2;->a(Ljava/lang/String;)V

    iget-boolean v0, p0, LqB;->y:Z

    if-eqz v0, :cond_a

    iget-object v0, p0, LqB;->q:Lfm2;

    invoke-virtual {v0}, Lfm2;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p0}, LqB;->r()V

    const-string v0, "Layer#parentMatrix"

    invoke-static {v0}, LDl2;->a(Ljava/lang/String;)V

    iget-object v1, p0, LqB;->b:Landroid/graphics/Matrix;

    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    iget-object v1, p0, LqB;->b:Landroid/graphics/Matrix;

    invoke-virtual {v1, p2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v1, p0, LqB;->v:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_1

    iget-object v2, p0, LqB;->b:Landroid/graphics/Matrix;

    iget-object v3, p0, LqB;->v:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LqB;

    iget-object v3, v3, LqB;->x:Lm96;

    invoke-virtual {v3}, Lm96;->f()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    invoke-static {v0}, LDl2;->b(Ljava/lang/String;)F

    iget-object v0, p0, LqB;->x:Lm96;

    invoke-virtual {v0}, Lm96;->h()LoB;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LoB;->h()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_2
    const/16 v0, 0x64

    :goto_1
    int-to-float p3, p3

    const/high16 v1, 0x437f0000    # 255.0f

    div-float/2addr p3, v1

    int-to-float v0, v0

    mul-float/2addr p3, v0

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p3, v0

    mul-float/2addr p3, v1

    float-to-int p3, p3

    invoke-virtual {p0}, LqB;->A()Z

    move-result v0

    const-string v1, "Layer#drawLayer"

    if-nez v0, :cond_3

    invoke-virtual {p0}, LqB;->z()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object p2, p0, LqB;->b:Landroid/graphics/Matrix;

    iget-object v0, p0, LqB;->x:Lm96;

    invoke-virtual {v0}, Lm96;->f()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    invoke-static {v1}, LDl2;->a(Ljava/lang/String;)V

    iget-object p2, p0, LqB;->b:Landroid/graphics/Matrix;

    invoke-virtual {p0, p1, p2, p3}, LqB;->t(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V

    invoke-static {v1}, LDl2;->b(Ljava/lang/String;)F

    iget-object p1, p0, LqB;->n:Ljava/lang/String;

    invoke-static {p1}, LDl2;->b(Ljava/lang/String;)F

    move-result p1

    invoke-virtual {p0, p1}, LqB;->F(F)V

    return-void

    :cond_3
    const-string v0, "Layer#computeBounds"

    invoke-static {v0}, LDl2;->a(Ljava/lang/String;)V

    iget-object v2, p0, LqB;->i:Landroid/graphics/RectF;

    iget-object v3, p0, LqB;->b:Landroid/graphics/Matrix;

    const/4 v4, 0x0

    invoke-virtual {p0, v2, v3, v4}, LqB;->a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    iget-object v2, p0, LqB;->i:Landroid/graphics/RectF;

    invoke-virtual {p0, v2, p2}, LqB;->C(Landroid/graphics/RectF;Landroid/graphics/Matrix;)V

    iget-object v2, p0, LqB;->b:Landroid/graphics/Matrix;

    iget-object v3, p0, LqB;->x:Lm96;

    invoke-virtual {v3}, Lm96;->f()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    iget-object v2, p0, LqB;->i:Landroid/graphics/RectF;

    iget-object v3, p0, LqB;->b:Landroid/graphics/Matrix;

    invoke-virtual {p0, v2, v3}, LqB;->B(Landroid/graphics/RectF;Landroid/graphics/Matrix;)V

    iget-object v2, p0, LqB;->j:Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v4

    int-to-float v4, v4

    const/4 v5, 0x0

    invoke-virtual {v2, v5, v5, v3, v4}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v2, p0, LqB;->c:Landroid/graphics/Matrix;

    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->getMatrix(Landroid/graphics/Matrix;)V

    iget-object v2, p0, LqB;->c:Landroid/graphics/Matrix;

    invoke-virtual {v2}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, LqB;->c:Landroid/graphics/Matrix;

    invoke-virtual {v2, v2}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    iget-object v2, p0, LqB;->c:Landroid/graphics/Matrix;

    iget-object v3, p0, LqB;->j:Landroid/graphics/RectF;

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    :cond_4
    iget-object v2, p0, LqB;->i:Landroid/graphics/RectF;

    iget-object v3, p0, LqB;->j:Landroid/graphics/RectF;

    invoke-virtual {v2, v3}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, p0, LqB;->i:Landroid/graphics/RectF;

    invoke-virtual {v2, v5, v5, v5, v5}, Landroid/graphics/RectF;->set(FFFF)V

    :cond_5
    invoke-static {v0}, LDl2;->b(Ljava/lang/String;)F

    iget-object v0, p0, LqB;->i:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_8

    iget-object v0, p0, LqB;->i:Landroid/graphics/RectF;

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    cmpl-float v0, v0, v2

    if-ltz v0, :cond_8

    const-string v0, "Layer#saveLayer"

    invoke-static {v0}, LDl2;->a(Ljava/lang/String;)V

    iget-object v2, p0, LqB;->d:Landroid/graphics/Paint;

    const/16 v3, 0xff

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v2, p0, LqB;->i:Landroid/graphics/RectF;

    iget-object v3, p0, LqB;->d:Landroid/graphics/Paint;

    invoke-static {p1, v2, v3}, LGi6;->m(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    invoke-static {v0}, LDl2;->b(Ljava/lang/String;)F

    invoke-virtual {p0, p1}, LqB;->s(Landroid/graphics/Canvas;)V

    invoke-static {v1}, LDl2;->a(Ljava/lang/String;)V

    iget-object v2, p0, LqB;->b:Landroid/graphics/Matrix;

    invoke-virtual {p0, p1, v2, p3}, LqB;->t(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V

    invoke-static {v1}, LDl2;->b(Ljava/lang/String;)F

    invoke-virtual {p0}, LqB;->z()Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, LqB;->b:Landroid/graphics/Matrix;

    invoke-virtual {p0, p1, v1}, LqB;->o(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V

    :cond_6
    invoke-virtual {p0}, LqB;->A()Z

    move-result v1

    const-string v2, "Layer#restoreLayer"

    if-eqz v1, :cond_7

    const-string v1, "Layer#drawMatte"

    invoke-static {v1}, LDl2;->a(Ljava/lang/String;)V

    invoke-static {v0}, LDl2;->a(Ljava/lang/String;)V

    iget-object v3, p0, LqB;->i:Landroid/graphics/RectF;

    iget-object v4, p0, LqB;->g:Landroid/graphics/Paint;

    const/16 v5, 0x13

    invoke-static {p1, v3, v4, v5}, LGi6;->n(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;I)V

    invoke-static {v0}, LDl2;->b(Ljava/lang/String;)F

    invoke-virtual {p0, p1}, LqB;->s(Landroid/graphics/Canvas;)V

    iget-object v0, p0, LqB;->t:LqB;

    invoke-virtual {v0, p1, p2, p3}, LqB;->d(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V

    invoke-static {v2}, LDl2;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    invoke-static {v2}, LDl2;->b(Ljava/lang/String;)F

    invoke-static {v1}, LDl2;->b(Ljava/lang/String;)F

    :cond_7
    invoke-static {v2}, LDl2;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    invoke-static {v2}, LDl2;->b(Ljava/lang/String;)F

    :cond_8
    iget-boolean p2, p0, LqB;->z:Z

    if-eqz p2, :cond_9

    iget-object p2, p0, LqB;->A:Landroid/graphics/Paint;

    if-eqz p2, :cond_9

    sget-object p3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p2, p0, LqB;->A:Landroid/graphics/Paint;

    const p3, -0x3d7fd

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p2, p0, LqB;->A:Landroid/graphics/Paint;

    const/high16 p3, 0x40800000    # 4.0f

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object p2, p0, LqB;->i:Landroid/graphics/RectF;

    iget-object p3, p0, LqB;->A:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-object p2, p0, LqB;->A:Landroid/graphics/Paint;

    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object p2, p0, LqB;->A:Landroid/graphics/Paint;

    const p3, 0x50ebebeb

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p2, p0, LqB;->i:Landroid/graphics/RectF;

    iget-object p3, p0, LqB;->A:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :cond_9
    iget-object p1, p0, LqB;->n:Ljava/lang/String;

    invoke-static {p1}, LDl2;->b(Ljava/lang/String;)F

    move-result p1

    invoke-virtual {p0, p1}, LqB;->F(F)V

    return-void

    :cond_a
    :goto_2
    iget-object p1, p0, LqB;->n:Ljava/lang/String;

    invoke-static {p1}, LDl2;->b(Ljava/lang/String;)F

    return-void
.end method

.method public e()V
    .locals 0

    invoke-virtual {p0}, LqB;->D()V

    return-void
.end method

.method public f(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LVz0;",
            ">;",
            "Ljava/util/List<",
            "LVz0;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LqB;->q:Lfm2;

    invoke-virtual {v0}, Lfm2;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h(Ljava/lang/Object;LgE2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "LgE2<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, LqB;->x:Lm96;

    invoke-virtual {v0, p1, p2}, Lm96;->c(Ljava/lang/Object;LgE2;)Z

    return-void
.end method

.method public i(LoB;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LoB<",
            "**>;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LqB;->w:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final j(Landroid/graphics/Canvas;Landroid/graphics/Matrix;LoB;LoB;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Landroid/graphics/Matrix;",
            "LoB<",
            "Lmy5;",
            "Landroid/graphics/Path;",
            ">;",
            "LoB<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p3}, LoB;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/Path;

    iget-object v0, p0, LqB;->a:Landroid/graphics/Path;

    invoke-virtual {v0, p3}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    iget-object p3, p0, LqB;->a:Landroid/graphics/Path;

    invoke-virtual {p3, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    iget-object p2, p0, LqB;->d:Landroid/graphics/Paint;

    invoke-virtual {p4}, LoB;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    int-to-float p3, p3

    const p4, 0x40233333    # 2.55f

    mul-float/2addr p3, p4

    float-to-int p3, p3

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object p2, p0, LqB;->a:Landroid/graphics/Path;

    iget-object p3, p0, LqB;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final k(Landroid/graphics/Canvas;Landroid/graphics/Matrix;LoB;LoB;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Landroid/graphics/Matrix;",
            "LoB<",
            "Lmy5;",
            "Landroid/graphics/Path;",
            ">;",
            "LoB<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LqB;->i:Landroid/graphics/RectF;

    iget-object v1, p0, LqB;->e:Landroid/graphics/Paint;

    invoke-static {p1, v0, v1}, LGi6;->m(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    invoke-virtual {p3}, LoB;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/Path;

    iget-object v0, p0, LqB;->a:Landroid/graphics/Path;

    invoke-virtual {v0, p3}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    iget-object p3, p0, LqB;->a:Landroid/graphics/Path;

    invoke-virtual {p3, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    iget-object p2, p0, LqB;->d:Landroid/graphics/Paint;

    invoke-virtual {p4}, LoB;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    int-to-float p3, p3

    const p4, 0x40233333    # 2.55f

    mul-float/2addr p3, p4

    float-to-int p3, p3

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object p2, p0, LqB;->a:Landroid/graphics/Path;

    iget-object p3, p0, LqB;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final l(Landroid/graphics/Canvas;Landroid/graphics/Matrix;LoB;LoB;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Landroid/graphics/Matrix;",
            "LoB<",
            "Lmy5;",
            "Landroid/graphics/Path;",
            ">;",
            "LoB<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LqB;->i:Landroid/graphics/RectF;

    iget-object v1, p0, LqB;->d:Landroid/graphics/Paint;

    invoke-static {p1, v0, v1}, LGi6;->m(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-object v0, p0, LqB;->i:Landroid/graphics/RectF;

    iget-object v1, p0, LqB;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    invoke-virtual {p3}, LoB;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/Path;

    iget-object v0, p0, LqB;->a:Landroid/graphics/Path;

    invoke-virtual {v0, p3}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    iget-object p3, p0, LqB;->a:Landroid/graphics/Path;

    invoke-virtual {p3, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    iget-object p2, p0, LqB;->d:Landroid/graphics/Paint;

    invoke-virtual {p4}, LoB;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    int-to-float p3, p3

    const p4, 0x40233333    # 2.55f

    mul-float/2addr p3, p4

    float-to-int p3, p3

    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object p2, p0, LqB;->a:Landroid/graphics/Path;

    iget-object p3, p0, LqB;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final m(Landroid/graphics/Canvas;Landroid/graphics/Matrix;LoB;LoB;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Landroid/graphics/Matrix;",
            "LoB<",
            "Lmy5;",
            "Landroid/graphics/Path;",
            ">;",
            "LoB<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LqB;->i:Landroid/graphics/RectF;

    iget-object v1, p0, LqB;->e:Landroid/graphics/Paint;

    invoke-static {p1, v0, v1}, LGi6;->m(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-object v0, p0, LqB;->i:Landroid/graphics/RectF;

    iget-object v1, p0, LqB;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-object v0, p0, LqB;->f:Landroid/graphics/Paint;

    invoke-virtual {p4}, LoB;->h()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    int-to-float p4, p4

    const v1, 0x40233333    # 2.55f

    mul-float/2addr p4, v1

    float-to-int p4, p4

    invoke-virtual {v0, p4}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {p3}, LoB;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/Path;

    iget-object p4, p0, LqB;->a:Landroid/graphics/Path;

    invoke-virtual {p4, p3}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    iget-object p3, p0, LqB;->a:Landroid/graphics/Path;

    invoke-virtual {p3, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    iget-object p2, p0, LqB;->a:Landroid/graphics/Path;

    iget-object p3, p0, LqB;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final n(Landroid/graphics/Canvas;Landroid/graphics/Matrix;LoB;LoB;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Landroid/graphics/Matrix;",
            "LoB<",
            "Lmy5;",
            "Landroid/graphics/Path;",
            ">;",
            "LoB<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LqB;->i:Landroid/graphics/RectF;

    iget-object v1, p0, LqB;->f:Landroid/graphics/Paint;

    invoke-static {p1, v0, v1}, LGi6;->m(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-object v0, p0, LqB;->i:Landroid/graphics/RectF;

    iget-object v1, p0, LqB;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    iget-object v0, p0, LqB;->f:Landroid/graphics/Paint;

    invoke-virtual {p4}, LoB;->h()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    int-to-float p4, p4

    const v1, 0x40233333    # 2.55f

    mul-float/2addr p4, v1

    float-to-int p4, p4

    invoke-virtual {v0, p4}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {p3}, LoB;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/Path;

    iget-object p4, p0, LqB;->a:Landroid/graphics/Path;

    invoke-virtual {p4, p3}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    iget-object p3, p0, LqB;->a:Landroid/graphics/Path;

    invoke-virtual {p3, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    iget-object p2, p0, LqB;->a:Landroid/graphics/Path;

    iget-object p3, p0, LqB;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final o(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V
    .locals 7

    const-string v0, "Layer#saveLayer"

    invoke-static {v0}, LDl2;->a(Ljava/lang/String;)V

    iget-object v1, p0, LqB;->i:Landroid/graphics/RectF;

    iget-object v2, p0, LqB;->e:Landroid/graphics/Paint;

    const/16 v3, 0x13

    invoke-static {p1, v1, v2, v3}, LGi6;->n(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;I)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-ge v1, v2, :cond_0

    invoke-virtual {p0, p1}, LqB;->s(Landroid/graphics/Canvas;)V

    :cond_0
    invoke-static {v0}, LDl2;->b(Ljava/lang/String;)F

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LqB;->r:LqM2;

    invoke-virtual {v1}, LqM2;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_a

    iget-object v1, p0, LqB;->r:LqM2;

    invoke-virtual {v1}, LqM2;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LpM2;

    iget-object v2, p0, LqB;->r:LqM2;

    invoke-virtual {v2}, LqM2;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LoB;

    iget-object v3, p0, LqB;->r:LqM2;

    invoke-virtual {v3}, LqM2;->c()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LoB;

    sget-object v4, LqB$a;->b:[I

    invoke-virtual {v1}, LpM2;->a()LpM2$a;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    const/16 v5, 0xff

    const/4 v6, 0x1

    if-eq v4, v6, :cond_8

    const/4 v6, 0x2

    if-eq v4, v6, :cond_5

    const/4 v5, 0x3

    if-eq v4, v5, :cond_3

    const/4 v5, 0x4

    if-eq v4, v5, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, LpM2;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, p1, p2, v2, v3}, LqB;->l(Landroid/graphics/Canvas;Landroid/graphics/Matrix;LoB;LoB;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1, p2, v2, v3}, LqB;->j(Landroid/graphics/Canvas;Landroid/graphics/Matrix;LoB;LoB;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, LpM2;->d()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0, p1, p2, v2, v3}, LqB;->m(Landroid/graphics/Canvas;Landroid/graphics/Matrix;LoB;LoB;)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0, p1, p2, v2, v3}, LqB;->k(Landroid/graphics/Canvas;Landroid/graphics/Matrix;LoB;LoB;)V

    goto :goto_1

    :cond_5
    if-nez v0, :cond_6

    iget-object v4, p0, LqB;->d:Landroid/graphics/Paint;

    const/high16 v6, -0x1000000

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v4, p0, LqB;->d:Landroid/graphics/Paint;

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v4, p0, LqB;->i:Landroid/graphics/RectF;

    iget-object v5, p0, LqB;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :cond_6
    invoke-virtual {v1}, LpM2;->d()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p0, p1, p2, v2, v3}, LqB;->n(Landroid/graphics/Canvas;Landroid/graphics/Matrix;LoB;LoB;)V

    goto :goto_1

    :cond_7
    invoke-virtual {p0, p1, p2, v2}, LqB;->p(Landroid/graphics/Canvas;Landroid/graphics/Matrix;LoB;)V

    goto :goto_1

    :cond_8
    invoke-virtual {p0}, LqB;->q()Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, p0, LqB;->d:Landroid/graphics/Paint;

    invoke-virtual {v1, v5}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v1, p0, LqB;->i:Landroid/graphics/RectF;

    iget-object v2, p0, LqB;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    :cond_9
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0

    :cond_a
    const-string p2, "Layer#restoreLayer"

    invoke-static {p2}, LDl2;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    invoke-static {p2}, LDl2;->b(Ljava/lang/String;)F

    return-void
.end method

.method public final p(Landroid/graphics/Canvas;Landroid/graphics/Matrix;LoB;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Landroid/graphics/Matrix;",
            "LoB<",
            "Lmy5;",
            "Landroid/graphics/Path;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p3}, LoB;->h()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/graphics/Path;

    iget-object v0, p0, LqB;->a:Landroid/graphics/Path;

    invoke-virtual {v0, p3}, Landroid/graphics/Path;->set(Landroid/graphics/Path;)V

    iget-object p3, p0, LqB;->a:Landroid/graphics/Path;

    invoke-virtual {p3, p2}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    iget-object p2, p0, LqB;->a:Landroid/graphics/Path;

    iget-object p3, p0, LqB;->f:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final q()Z
    .locals 4

    iget-object v0, p0, LqB;->r:LqM2;

    invoke-virtual {v0}, LqM2;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, LqB;->r:LqM2;

    invoke-virtual {v2}, LqM2;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    iget-object v2, p0, LqB;->r:LqM2;

    invoke-virtual {v2}, LqM2;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LpM2;

    invoke-virtual {v2}, LpM2;->a()LpM2$a;

    move-result-object v2

    sget-object v3, LpM2$a;->e:LpM2$a;

    if-eq v2, v3, :cond_1

    return v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public final r()V
    .locals 2

    iget-object v0, p0, LqB;->v:Ljava/util/List;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LqB;->u:LqB;

    if-nez v0, :cond_1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LqB;->v:Ljava/util/List;

    return-void

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LqB;->v:Ljava/util/List;

    iget-object v0, p0, LqB;->u:LqB;

    :goto_0
    if-eqz v0, :cond_2

    iget-object v1, p0, LqB;->v:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, LqB;->u:LqB;

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final s(Landroid/graphics/Canvas;)V
    .locals 10

    const-string v0, "Layer#clearLayer"

    invoke-static {v0}, LDl2;->a(Ljava/lang/String;)V

    iget-object v1, p0, LqB;->i:Landroid/graphics/RectF;

    iget v2, v1, Landroid/graphics/RectF;->left:F

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v5, v2, v3

    iget v2, v1, Landroid/graphics/RectF;->top:F

    sub-float v6, v2, v3

    iget v2, v1, Landroid/graphics/RectF;->right:F

    add-float v7, v2, v3

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    add-float v8, v1, v3

    iget-object v9, p0, LqB;->h:Landroid/graphics/Paint;

    move-object v4, p1

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    invoke-static {v0}, LDl2;->b(Ljava/lang/String;)F

    return-void
.end method

.method public abstract t(Landroid/graphics/Canvas;Landroid/graphics/Matrix;I)V
.end method

.method public v()LMY;
    .locals 1

    iget-object v0, p0, LqB;->q:Lfm2;

    invoke-virtual {v0}, Lfm2;->a()LMY;

    move-result-object v0

    return-object v0
.end method

.method public w(F)Landroid/graphics/BlurMaskFilter;
    .locals 3

    iget v0, p0, LqB;->B:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    iget-object p1, p0, LqB;->C:Landroid/graphics/BlurMaskFilter;

    return-object p1

    :cond_0
    new-instance v0, Landroid/graphics/BlurMaskFilter;

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, p1, v1

    sget-object v2, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    invoke-direct {v0, v1, v2}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    iput-object v0, p0, LqB;->C:Landroid/graphics/BlurMaskFilter;

    iput p1, p0, LqB;->B:F

    return-object v0
.end method

.method public x()LU71;
    .locals 1

    iget-object v0, p0, LqB;->q:Lfm2;

    invoke-virtual {v0}, Lfm2;->c()LU71;

    move-result-object v0

    return-object v0
.end method

.method public y()Lfm2;
    .locals 1

    iget-object v0, p0, LqB;->q:Lfm2;

    return-object v0
.end method

.method public z()Z
    .locals 1

    iget-object v0, p0, LqB;->r:LqM2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LqM2;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
