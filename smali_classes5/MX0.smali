.class public LMX0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHO1;


# static fields
.field public static final p:Ljava/lang/String;


# instance fields
.field public final a:Landroid/view/View;

.field public final b:LwO1;

.field public final c:LGO1;

.field public final d:Landroid/view/animation/Animation;

.field public final e:Landroid/view/animation/Animation;

.field public final f:LX10;

.field public final g:LjZ1;

.field public h:Z

.field public i:Ljava/lang/Runnable;

.field public final j:Landroid/view/View;

.field public k:Landroid/view/View;

.field public l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public m:Landroid/view/View;

.field public n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public o:Landroid/view/ViewGroup;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, LMX0;

    invoke-static {v0}, Lk20;->n(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LMX0;->p:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;LwO1;LGO1;LX10;Landroid/view/animation/Animation;Landroid/view/animation/Animation;Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LMX0;->m:Landroid/view/View;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LMX0;->n:Ljava/util/Map;

    iput-object p1, p0, LMX0;->a:Landroid/view/View;

    iput-object p2, p0, LMX0;->b:LwO1;

    iput-object p3, p0, LMX0;->c:LGO1;

    iput-object p4, p0, LMX0;->f:LX10;

    iput-object p5, p0, LMX0;->d:Landroid/view/animation/Animation;

    iput-object p6, p0, LMX0;->e:Landroid/view/animation/Animation;

    const/4 p3, 0x0

    iput-boolean p3, p0, LMX0;->h:Z

    if-eqz p7, :cond_0

    iput-object p7, p0, LMX0;->j:Landroid/view/View;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LMX0;->j:Landroid/view/View;

    :goto_0
    instance-of p2, p2, LBZ1;

    if-eqz p2, :cond_1

    invoke-virtual {p0}, LMX0;->t()LDW5$c;

    move-result-object p2

    new-instance p3, LX56;

    invoke-direct {p3, p1, p2}, LX56;-><init>(Landroid/view/View;LDW5$c;)V

    invoke-virtual {p0}, LMX0;->u()LX56$a;

    move-result-object p1

    invoke-virtual {p3, p1}, LX56;->g(LX56$a;)V

    iget-object p1, p0, LMX0;->j:Landroid/view/View;

    invoke-virtual {p1, p3}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_1
    iget-object p1, p0, LMX0;->j:Landroid/view/View;

    invoke-virtual {p0}, LMX0;->r()Landroid/view/View$OnClickListener;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p1, LjZ1;

    invoke-direct {p1, p0}, LjZ1;-><init>(LHO1;)V

    iput-object p1, p0, LMX0;->g:LjZ1;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;LwO1;LGO1;LX10;Landroid/view/animation/Animation;Landroid/view/animation/Animation;Landroid/view/View;Ljava/util/List;Landroid/view/View;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "LwO1;",
            "LGO1;",
            "LX10;",
            "Landroid/view/animation/Animation;",
            "Landroid/view/animation/Animation;",
            "Landroid/view/View;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    invoke-direct/range {p0 .. p7}, LMX0;-><init>(Landroid/view/View;LwO1;LGO1;LX10;Landroid/view/animation/Animation;Landroid/view/animation/Animation;Landroid/view/View;)V

    if-eqz p9, :cond_0

    iput-object p9, p0, LMX0;->k:Landroid/view/View;

    invoke-virtual {p0}, LMX0;->s()Landroid/view/View$OnClickListener;

    move-result-object p1

    invoke-virtual {p9, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz p8, :cond_1

    iput-object p8, p0, LMX0;->l:Ljava/util/List;

    invoke-interface {p8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    invoke-virtual {p0}, LMX0;->q()Landroid/view/View$OnClickListener;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private synthetic A(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, LMX0;->b:LwO1;

    check-cast v0, LAO1;

    invoke-interface {v0}, LAO1;->M()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, LMX0;->p:Ljava/lang/String;

    const-string v0, "Cannot create button click listener since this in-app message does not have message buttons."

    invoke-static {p1, v0}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LMX0;->l:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    iget-object v3, p0, LMX0;->l:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v3

    if-ne v2, v3, :cond_1

    invoke-interface {v0}, LAO1;->M()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LmT2;

    iget-object v1, p0, LMX0;->c:LGO1;

    iget-object v2, p0, LMX0;->g:LjZ1;

    invoke-interface {v1, v2, p1, v0}, LGO1;->a(LjZ1;LmT2;LAO1;)V

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private synthetic B(Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, LMX0;->b:LwO1;

    instance-of v0, p1, LAO1;

    if-eqz v0, :cond_0

    check-cast p1, LAO1;

    invoke-interface {p1}, LAO1;->M()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LMX0;->c:LGO1;

    iget-object v0, p0, LMX0;->g:LjZ1;

    iget-object v1, p0, LMX0;->a:Landroid/view/View;

    iget-object v2, p0, LMX0;->b:LwO1;

    invoke-interface {p1, v0, v1, v2}, LGO1;->g(LjZ1;Landroid/view/View;LwO1;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LMX0;->c:LGO1;

    iget-object v1, p0, LMX0;->g:LjZ1;

    iget-object v2, p0, LMX0;->a:Landroid/view/View;

    invoke-interface {v0, v1, v2, p1}, LGO1;->g(LjZ1;Landroid/view/View;LwO1;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic C(Landroid/view/View;)V
    .locals 1

    invoke-static {}, Li20;->s()Li20;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Li20;->t(Z)V

    return-void
.end method

.method public static D(Landroid/view/ViewGroup;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    if-nez p0, :cond_0

    sget-object p0, LMX0;->p:Ljava/lang/String;

    const-string p1, "In-app message ViewGroup was null. Not resetting in-app message accessibility for exclusive mode."

    invoke-static {p0, p1}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_3

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v2, v3}, Lbq6;->H0(Landroid/view/View;I)V

    goto :goto_1

    :cond_1
    invoke-static {v2, v0}, Lbq6;->H0(Landroid/view/View;I)V

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static E(Landroid/view/ViewGroup;Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    if-nez p0, :cond_0

    sget-object p0, LMX0;->p:Ljava/lang/String;

    const-string p1, "In-app message ViewGroup was null. Not preparing in-app message accessibility for exclusive mode."

    invoke-static {p0, p1}, Lk20;->z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x4

    invoke-static {v1, v2}, Lbq6;->H0(Landroid/view/View;I)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static synthetic e(Landroid/view/View;Landroid/view/View;LDB6;)LDB6;
    .locals 0

    invoke-static {p0, p1, p2}, LMX0;->z(Landroid/view/View;Landroid/view/View;LDB6;)LDB6;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()V
    .locals 0

    invoke-static {}, LMX0;->y()V

    return-void
.end method

.method public static synthetic g(LMX0;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, LMX0;->B(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(LMX0;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, LMX0;->A(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, LMX0;->C(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j()Ljava/lang/String;
    .locals 1

    sget-object v0, LMX0;->p:Ljava/lang/String;

    return-object v0
.end method

.method public static synthetic y()V
    .locals 2

    invoke-static {}, Li20;->s()Li20;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Li20;->t(Z)V

    return-void
.end method

.method public static synthetic z(Landroid/view/View;Landroid/view/View;LDB6;)LDB6;
    .locals 1

    if-nez p2, :cond_0

    return-object p2

    :cond_0
    check-cast p0, LEO1;

    invoke-interface {p0}, LEO1;->hasAppliedWindowInsets()Z

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, LMX0;->p:Ljava/lang/String;

    const-string v0, "Calling applyWindowInsets on in-app message view."

    invoke-static {p1, v0}, Lk20;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, p2}, LEO1;->applyWindowInsets(LDB6;)V

    goto :goto_0

    :cond_1
    sget-object p0, LMX0;->p:Ljava/lang/String;

    const-string p1, "Not reapplying window insets to in-app message view."

    invoke-static {p0, p1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object p2
.end method


# virtual methods
.method public F(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, LMX0;->d:Landroid/view/animation/Animation;

    goto :goto_0

    :cond_0
    iget-object v0, p0, LMX0;->e:Landroid/view/animation/Animation;

    :goto_0
    invoke-virtual {p0, p1}, LMX0;->p(Z)Landroid/view/animation/Animation$AnimationListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    iget-object p1, p0, LMX0;->a:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    iget-object p1, p0, LMX0;->a:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {v0}, Landroid/view/animation/Animation;->startNow()V

    iget-object p1, p0, LMX0;->a:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public a()Landroid/view/View;
    .locals 1

    iget-object v0, p0, LMX0;->a:Landroid/view/View;

    return-object v0
.end method

.method public b()LwO1;
    .locals 1

    iget-object v0, p0, LMX0;->b:LwO1;

    return-object v0
.end method

.method public c(Landroid/app/Activity;)V
    .locals 5

    sget-object v0, LMX0;->p:Ljava/lang/String;

    const-string v1, "Opening in-app message view wrapper"

    invoke-static {v0, v1}, Lk20;->w(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LMX0;->x(Landroid/app/Activity;)Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v2

    iget-object v3, p0, LMX0;->f:LX10;

    invoke-virtual {v3}, LX10;->isInAppMessageAccessibilityExclusiveModeEnabled()Z

    move-result v3

    if-eqz v3, :cond_0

    iput-object v1, p0, LMX0;->o:Landroid/view/ViewGroup;

    iget-object v3, p0, LMX0;->n:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->clear()V

    iget-object v3, p0, LMX0;->o:Landroid/view/ViewGroup;

    iget-object v4, p0, LMX0;->n:Ljava/util/Map;

    invoke-static {v3, v4}, LMX0;->E(Landroid/view/ViewGroup;Ljava/util/Map;)V

    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, LMX0;->m:Landroid/view/View;

    if-nez v2, :cond_1

    new-instance p1, LMX0$a;

    invoke-direct {p1, p0, v1}, LMX0$a;-><init>(LMX0;Landroid/view/ViewGroup;)V

    invoke-virtual {v1, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Detected root view height of "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, LMX0;->b:LwO1;

    iget-object v0, p0, LMX0;->a:Landroid/view/View;

    iget-object v2, p0, LMX0;->c:LGO1;

    invoke-virtual {p0, v1, p1, v0, v2}, LMX0;->l(Landroid/view/ViewGroup;LwO1;Landroid/view/View;LGO1;)V

    :goto_0
    return-void
.end method

.method public close()V
    .locals 3

    iget-object v0, p0, LMX0;->f:LX10;

    invoke-virtual {v0}, LX10;->isInAppMessageAccessibilityExclusiveModeEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LMX0;->o:Landroid/view/ViewGroup;

    iget-object v1, p0, LMX0;->n:Ljava/util/Map;

    invoke-static {v0, v1}, LMX0;->D(Landroid/view/ViewGroup;Ljava/util/Map;)V

    :cond_0
    iget-object v0, p0, LMX0;->a:Landroid/view/View;

    iget-object v1, p0, LMX0;->i:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, LMX0;->c:LGO1;

    iget-object v1, p0, LMX0;->a:Landroid/view/View;

    iget-object v2, p0, LMX0;->b:LwO1;

    invoke-interface {v0, v1, v2}, LGO1;->b(Landroid/view/View;LwO1;)V

    iget-object v0, p0, LMX0;->b:LwO1;

    invoke-interface {v0}, LwO1;->l0()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, LMX0;->h:Z

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LMX0;->F(Z)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LMX0;->o()V

    :goto_0
    return-void
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, LMX0;->h:Z

    return v0
.end method

.method public k()V
    .locals 4

    iget-object v0, p0, LMX0;->i:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    new-instance v0, LKX0;

    invoke-direct {v0}, LKX0;-><init>()V

    iput-object v0, p0, LMX0;->i:Ljava/lang/Runnable;

    iget-object v1, p0, LMX0;->a:Landroid/view/View;

    iget-object v2, p0, LMX0;->b:LwO1;

    invoke-interface {v2}, LwO1;->e0()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v1, v0, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public l(Landroid/view/ViewGroup;LwO1;Landroid/view/View;LGO1;)V
    .locals 2

    invoke-interface {p4, p3, p2}, LGO1;->f(Landroid/view/View;LwO1;)V

    sget-object v0, LMX0;->p:Ljava/lang/String;

    const-string v1, "Adding In-app message view to parent view group."

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, LMX0;->w(LwO1;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-virtual {p1, p3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    instance-of v1, p3, LEO1;

    if-eqz v1, :cond_0

    invoke-static {p1}, Lbq6;->s0(Landroid/view/View;)V

    new-instance v1, LHX0;

    invoke-direct {v1, p3}, LHX0;-><init>(Landroid/view/View;)V

    invoke-static {p1, v1}, Lbq6;->L0(Landroid/view/View;LUe3;)V

    :cond_0
    invoke-interface {p2}, LwO1;->H()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "In-app message view will animate into the visible area."

    invoke-static {v0, p1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, LMX0;->F(Z)V

    goto :goto_0

    :cond_1
    const-string p1, "In-app message view will be placed instantly into the visible area."

    invoke-static {v0, p1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2}, LwO1;->Z()LI41;

    move-result-object p1

    sget-object v0, LI41;->b:LI41;

    if-ne p1, v0, :cond_2

    invoke-virtual {p0}, LMX0;->k()V

    :cond_2
    invoke-virtual {p0, p2, p3, p4}, LMX0;->v(LwO1;Landroid/view/View;LGO1;)V

    :goto_0
    return-void
.end method

.method public m()V
    .locals 1

    const-string v0, "In app message displayed."

    invoke-virtual {p0, v0}, LMX0;->n(Ljava/lang/String;)V

    return-void
.end method

.method public n(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LMX0;->a:Landroid/view/View;

    instance-of v1, v0, LBO1;

    if-eqz v1, :cond_1

    iget-object p1, p0, LMX0;->b:LwO1;

    invoke-interface {p1}, LwO1;->getMessage()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, LMX0;->b:LwO1;

    instance-of v1, v0, LAO1;

    if-eqz v1, :cond_0

    check-cast v0, LAO1;

    invoke-interface {v0}, LAO1;->E()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LMX0;->a:Landroid/view/View;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " . "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LMX0;->a:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;

    if-eqz v1, :cond_2

    invoke-virtual {v0, p1}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public o()V
    .locals 3

    sget-object v0, LMX0;->p:Ljava/lang/String;

    const-string v1, "Closing in-app message view"

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, LMX0;->a:Landroid/view/View;

    invoke-static {v1}, LWt6;->j(Landroid/view/View;)V

    iget-object v1, p0, LMX0;->a:Landroid/view/View;

    instance-of v2, v1, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;

    invoke-virtual {v1}, Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;->finishWebViewDisplay()V

    :cond_0
    iget-object v1, p0, LMX0;->m:Landroid/view/View;

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Returning focus to view after closing message. View: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LMX0;->m:Landroid/view/View;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lk20;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LMX0;->m:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    :cond_1
    iget-object v0, p0, LMX0;->c:LGO1;

    iget-object v1, p0, LMX0;->b:LwO1;

    invoke-interface {v0, v1}, LGO1;->c(LwO1;)V

    return-void
.end method

.method public p(Z)Landroid/view/animation/Animation$AnimationListener;
    .locals 0

    if-eqz p1, :cond_0

    new-instance p1, LMX0$d;

    invoke-direct {p1, p0}, LMX0$d;-><init>(LMX0;)V

    return-object p1

    :cond_0
    new-instance p1, LMX0$e;

    invoke-direct {p1, p0}, LMX0$e;-><init>(LMX0;)V

    return-object p1
.end method

.method public q()Landroid/view/View$OnClickListener;
    .locals 1

    new-instance v0, LJX0;

    invoke-direct {v0, p0}, LJX0;-><init>(LMX0;)V

    return-object v0
.end method

.method public r()Landroid/view/View$OnClickListener;
    .locals 1

    new-instance v0, LLX0;

    invoke-direct {v0, p0}, LLX0;-><init>(LMX0;)V

    return-object v0
.end method

.method public s()Landroid/view/View$OnClickListener;
    .locals 1

    new-instance v0, LIX0;

    invoke-direct {v0}, LIX0;-><init>()V

    return-object v0
.end method

.method public t()LDW5$c;
    .locals 1

    new-instance v0, LMX0$b;

    invoke-direct {v0, p0}, LMX0$b;-><init>(LMX0;)V

    return-object v0
.end method

.method public u()LX56$a;
    .locals 1

    new-instance v0, LMX0$c;

    invoke-direct {v0, p0}, LMX0$c;-><init>(LMX0;)V

    return-object v0
.end method

.method public v(LwO1;Landroid/view/View;LGO1;)V
    .locals 2

    invoke-static {p2}, LWt6;->h(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LMX0$f;->a:[I

    invoke-interface {p1}, LwO1;->h0()LzT2;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    invoke-static {p2}, LWt6;->l(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    invoke-static {p2}, LWt6;->l(Landroid/view/View;)V

    :cond_1
    :goto_0
    invoke-virtual {p0}, LMX0;->m()V

    invoke-interface {p3, p2, p1}, LGO1;->d(Landroid/view/View;LwO1;)V

    return-void
.end method

.method public w(LwO1;)Landroid/view/ViewGroup$LayoutParams;
    .locals 3

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    instance-of v1, p1, LBZ1;

    if-eqz v1, :cond_1

    check-cast p1, LBZ1;

    invoke-virtual {p1}, LBZ1;->x0()LeE5;

    move-result-object p1

    sget-object v1, LeE5;->b:LeE5;

    if-ne p1, v1, :cond_0

    const/16 p1, 0x30

    goto :goto_0

    :cond_0
    const/16 p1, 0x50

    :goto_0
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    :cond_1
    return-object v0
.end method

.method public x(Landroid/app/Activity;)Landroid/view/ViewGroup;
    .locals 1

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const v0, 0x1020002

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    return-object p1
.end method
