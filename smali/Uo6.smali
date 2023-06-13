.class public final LUo6;
.super Landroidx/camera/core/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LUo6$d;,
        LUo6$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Ltp6;",
        ">",
        "Landroidx/camera/core/p;"
    }
.end annotation


# static fields
.field public static final A:Z

.field public static final y:LUo6$e;

.field public static z:Z


# instance fields
.field public n:Landroidx/camera/core/impl/DeferrableSurface;

.field public o:LMV5;

.field public p:LuR5;

.field public q:Landroidx/camera/core/impl/q$b;

.field public r:Lcom/google/common/util/concurrent/ListenableFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public s:Landroidx/camera/core/o;

.field public t:Ltp6$a;

.field public u:LYV5;

.field public v:Lhp6;

.field public w:Landroid/graphics/Rect;

.field public final x:LZd3$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZd3$a<",
            "LuR5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, LUo6$e;

    invoke-direct {v0}, LUo6$e;-><init>()V

    sput-object v0, LUo6;->y:LUo6$e;

    const-class v0, Lg24;

    invoke-static {v0}, LQ21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const-class v3, LY14;

    invoke-static {v3}, LQ21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v3

    if-eqz v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    const-class v4, LgX1;

    invoke-static {v4}, LQ21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v4

    if-eqz v4, :cond_2

    move v4, v1

    goto :goto_2

    :cond_2
    move v4, v2

    :goto_2
    invoke-static {}, LUo6;->u0()Z

    move-result v5

    const-class v6, LUi1;

    invoke-static {v6}, LQ21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v6

    if-eqz v6, :cond_3

    move v6, v1

    goto :goto_3

    :cond_3
    move v6, v2

    :goto_3
    if-nez v0, :cond_5

    if-nez v3, :cond_5

    if-eqz v4, :cond_4

    goto :goto_4

    :cond_4
    move v0, v2

    goto :goto_5

    :cond_5
    :goto_4
    move v0, v1

    :goto_5
    sput-boolean v0, LUo6;->A:Z

    if-nez v3, :cond_7

    if-nez v4, :cond_7

    if-nez v5, :cond_7

    if-eqz v6, :cond_6

    goto :goto_6

    :cond_6
    move v1, v2

    :cond_7
    :goto_6
    sput-boolean v1, LUo6;->z:Z

    return-void
.end method

.method public constructor <init>(LYo6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYo6<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Landroidx/camera/core/p;-><init>(Landroidx/camera/core/impl/s;)V

    sget-object p1, LuR5;->a:LuR5;

    iput-object p1, p0, LUo6;->p:LuR5;

    new-instance p1, Landroidx/camera/core/impl/q$b;

    invoke-direct {p1}, Landroidx/camera/core/impl/q$b;-><init>()V

    iput-object p1, p0, LUo6;->q:Landroidx/camera/core/impl/q$b;

    const/4 p1, 0x0

    iput-object p1, p0, LUo6;->r:Lcom/google/common/util/concurrent/ListenableFuture;

    sget-object p1, Ltp6$a;->d:Ltp6$a;

    iput-object p1, p0, LUo6;->t:Ltp6$a;

    new-instance p1, LUo6$a;

    invoke-direct {p1, p0}, LUo6$a;-><init>(LUo6;)V

    iput-object p1, p0, LUo6;->x:LZd3$a;

    return-void
.end method

.method public static synthetic A0(Ljava/util/concurrent/atomic/AtomicBoolean;Landroidx/camera/core/impl/q$b;Lpa0;)V
    .locals 2

    invoke-static {}, LO36;->c()Z

    move-result v0

    const-string v1, "Surface update cancellation should only occur on main thread."

    invoke-static {v0, v1}, LHZ3;->j(ZLjava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {p1, p2}, Landroidx/camera/core/impl/q$b;->q(Lpa0;)Z

    return-void
.end method

.method private synthetic B0(Landroidx/camera/core/impl/q$b;LO80$a;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "androidx.camera.video.VideoCapture.streamUpdate"

    invoke-virtual {p1, v1, v0}, Landroidx/camera/core/impl/q$b;->l(Ljava/lang/String;Ljava/lang/Object;)Landroidx/camera/core/impl/q$b;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v3, LUo6$b;

    invoke-direct {v3, p0, v0, p2, p1}, LUo6$b;-><init>(LUo6;Ljava/util/concurrent/atomic/AtomicBoolean;LO80$a;Landroidx/camera/core/impl/q$b;)V

    new-instance v4, LTo6;

    invoke-direct {v4, v0, p1, v3}, LTo6;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Landroidx/camera/core/impl/q$b;Lpa0;)V

    invoke-static {}, LAc0;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    invoke-virtual {p2, v4, v0}, LO80$a;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1, v3}, Landroidx/camera/core/impl/q$b;->i(Lpa0;)Landroidx/camera/core/impl/q$b;

    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    aput-object v1, p1, v2

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v0, 0x1

    aput-object p2, p1, v0

    const-string p2, "%s[0x%x]"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static E0(LxA1;Lyp6;LFP2;Landroid/util/Size;Landroid/util/Range;)Lhp6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxA1<",
            "Ldp6;",
            "Lhp6;",
            ">;",
            "Lyp6;",
            "LFP2;",
            "Landroid/util/Size;",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lhp6;"
        }
    .end annotation

    invoke-static {p2, p1}, LZo6;->c(LFP2;Lyp6;)LmU2;

    move-result-object p1

    sget-object v0, Lr46;->b:Lr46;

    invoke-virtual {p2}, LFP2;->d()Lwp6;

    move-result-object p2

    invoke-static {p1, v0, p2, p3, p4}, LZo6;->b(LmU2;Lr46;Lwp6;Landroid/util/Size;Landroid/util/Range;)Ldp6;

    move-result-object p1

    invoke-interface {p0, p1}, LxA1;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lhp6;

    return-object p0
.end method

.method public static J0(Landroid/graphics/Rect;Landroid/util/Size;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result p0

    if-eq p1, p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static K0(LLb0;)Z
    .locals 0

    invoke-interface {p0}, LLb0;->q()Z

    move-result p0

    if-eqz p0, :cond_0

    sget-boolean p0, LUo6;->z:Z

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static N0(Ltp6;)LUo6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ltp6;",
            ">(TT;)",
            "LUo6<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LUo6$d;

    invoke-static {p0}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ltp6;

    invoke-direct {v0, p0}, LUo6$d;-><init>(Ltp6;)V

    invoke-virtual {v0}, LUo6$d;->e()LUo6;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic U(LUo6;Ljava/lang/String;LYo6;LBR5;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LUo6;->z0(Ljava/lang/String;LYo6;LBR5;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V

    return-void
.end method

.method public static synthetic V(Ljava/util/concurrent/atomic/AtomicBoolean;Landroidx/camera/core/impl/q$b;Lpa0;)V
    .locals 0

    invoke-static {p0, p1, p2}, LUo6;->A0(Ljava/util/concurrent/atomic/AtomicBoolean;Landroidx/camera/core/impl/q$b;Lpa0;)V

    return-void
.end method

.method public static synthetic W(LUo6;Landroidx/camera/core/impl/q$b;LO80$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, LUo6;->B0(Landroidx/camera/core/impl/q$b;LO80$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X(LUo6;LMV5;LLb0;LYo6;Lr46;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LUo6;->x0(LMV5;LLb0;LYo6;Lr46;)V

    return-void
.end method

.method public static synthetic Y(LUo6;)V
    .locals 0

    invoke-static {p0}, LUo6;->w0(LUo6;)V

    return-void
.end method

.method public static synthetic Z(LUo6;Landroidx/camera/core/impl/DeferrableSurface;)V
    .locals 0

    invoke-direct {p0, p1}, LUo6;->y0(Landroidx/camera/core/impl/DeferrableSurface;)V

    return-void
.end method

.method public static synthetic a0(Landroid/graphics/Rect;Landroid/util/Size;Landroid/util/Size;)I
    .locals 0

    invoke-static {p0, p1, p2}, LUo6;->v0(Landroid/graphics/Rect;Landroid/util/Size;Landroid/util/Size;)I

    move-result p0

    return p0
.end method

.method public static synthetic b0(LUo6;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/p;->h()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c0(LUo6;Landroidx/camera/core/impl/q;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->S(Landroidx/camera/core/impl/q;)V

    return-void
.end method

.method public static synthetic d0(LUo6;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/p;->C()V

    return-void
.end method

.method public static synthetic e0(LUo6;Landroidx/camera/core/impl/q;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->S(Landroidx/camera/core/impl/q;)V

    return-void
.end method

.method public static synthetic f0(LUo6;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/p;->E()V

    return-void
.end method

.method public static g0(Ljava/util/Set;IILandroid/util/Size;Lhp6;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Landroid/util/Size;",
            ">;II",
            "Landroid/util/Size;",
            "Lhp6;",
            ")V"
        }
    .end annotation

    const-string v0, "VideoCapture"

    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    move-result v1

    if-gt p1, v1, :cond_1

    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    move-result p3

    if-le p2, p3, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    invoke-interface {p4, p1}, Lhp6;->c(I)Landroid/util/Range;

    move-result-object p3

    new-instance v1, Landroid/util/Size;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p3, v2}, Landroid/util/Range;->clamp(Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-direct {v1, p1, p3}, Landroid/util/Size;-><init>(II)V

    invoke-interface {p0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No supportedHeights for width: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p3}, LJx2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    :try_start_1
    invoke-interface {p4, p2}, Lhp6;->a(I)Landroid/util/Range;

    move-result-object p3

    new-instance p4, Landroid/util/Size;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/util/Range;->clamp(Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {p4, p1, p2}, Landroid/util/Size;-><init>(II)V

    invoke-interface {p0, p4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "No supportedWidths for height: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, p0}, LJx2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    return-void
.end method

.method public static h0(Landroid/graphics/Rect;Landroid/util/Size;Lhp6;)Landroid/graphics/Rect;
    .locals 10

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p0}, Lp96;->k(Landroid/graphics/Rect;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-interface {p2}, Lhp6;->h()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    invoke-interface {p2}, Lhp6;->f()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const/4 v1, 0x3

    invoke-interface {p2}, Lhp6;->d()Landroid/util/Range;

    move-result-object v5

    aput-object v5, v0, v1

    const/4 v1, 0x4

    invoke-interface {p2}, Lhp6;->e()Landroid/util/Range;

    move-result-object v5

    aput-object v5, v0, v1

    const-string v1, "Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "VideoCapture"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2}, Lhp6;->h()I

    move-result v0

    invoke-interface {p2}, Lhp6;->f()I

    move-result v5

    invoke-interface {p2}, Lhp6;->d()Landroid/util/Range;

    move-result-object v6

    invoke-interface {p2}, Lhp6;->e()Landroid/util/Range;

    move-result-object v7

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v8

    invoke-static {v8, v0, v6}, LUo6;->j0(IILandroid/util/Range;)I

    move-result v8

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v9

    invoke-static {v9, v0, v6}, LUo6;->k0(IILandroid/util/Range;)I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v6

    invoke-static {v6, v5, v7}, LUo6;->j0(IILandroid/util/Range;)I

    move-result v6

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v9

    invoke-static {v9, v5, v7}, LUo6;->k0(IILandroid/util/Range;)I

    move-result v5

    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    invoke-static {v7, v8, v6, p1, p2}, LUo6;->g0(Ljava/util/Set;IILandroid/util/Size;Lhp6;)V

    invoke-static {v7, v8, v5, p1, p2}, LUo6;->g0(Ljava/util/Set;IILandroid/util/Size;Lhp6;)V

    invoke-static {v7, v0, v6, p1, p2}, LUo6;->g0(Ljava/util/Set;IILandroid/util/Size;Lhp6;)V

    invoke-static {v7, v0, v5, p1, p2}, LUo6;->g0(Ljava/util/Set;IILandroid/util/Size;Lhp6;)V

    invoke-interface {v7}, Ljava/util/Set;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p1, "Can\'t find valid cropped size"

    invoke-static {v1, p1}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "candidatesList = "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, LSo6;

    invoke-direct {v0, p0}, LSo6;-><init>(Landroid/graphics/Rect;)V

    invoke-static {p2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "sorted candidatesList = "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/util/Size;

    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result v0

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p2

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v5

    if-ne v0, v5, :cond_1

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v5

    if-ne p2, v5, :cond_1

    const-string p1, "No need to adjust cropRect because crop size is valid."

    invoke-static {v1, p1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    :cond_1
    rem-int/lit8 v5, v0, 0x2

    if-nez v5, :cond_2

    rem-int/lit8 v5, p2, 0x2

    if-nez v5, :cond_2

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v5

    if-gt v0, v5, :cond_2

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v5

    if-gt p2, v5, :cond_2

    move v5, v3

    goto :goto_0

    :cond_2
    move v5, v2

    :goto_0
    invoke-static {v5}, LHZ3;->i(Z)V

    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5, p0}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v6

    if-eq v0, v6, :cond_3

    invoke-virtual {p0}, Landroid/graphics/Rect;->centerX()I

    move-result v6

    div-int/lit8 v7, v0, 0x2

    sub-int/2addr v6, v7

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    iput v6, v5, Landroid/graphics/Rect;->left:I

    add-int/2addr v6, v0

    iput v6, v5, Landroid/graphics/Rect;->right:I

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v7

    if-le v6, v7, :cond_3

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v6

    iput v6, v5, Landroid/graphics/Rect;->right:I

    sub-int/2addr v6, v0

    iput v6, v5, Landroid/graphics/Rect;->left:I

    :cond_3
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v0

    if-eq p2, v0, :cond_4

    invoke-virtual {p0}, Landroid/graphics/Rect;->centerY()I

    move-result v0

    div-int/lit8 v6, p2, 0x2

    sub-int/2addr v0, v6

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, v5, Landroid/graphics/Rect;->top:I

    add-int/2addr v0, p2

    iput v0, v5, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v6

    if-le v0, v6, :cond_4

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    iput p1, v5, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p1, p2

    iput p1, v5, Landroid/graphics/Rect;->top:I

    :cond_4
    new-array p1, v4, [Ljava/lang/Object;

    invoke-static {p0}, Lp96;->k(Landroid/graphics/Rect;)Ljava/lang/String;

    move-result-object p0

    aput-object p0, p1, v2

    invoke-static {v5}, Lp96;->k(Landroid/graphics/Rect;)Ljava/lang/String;

    move-result-object p0

    aput-object p0, p1, v3

    const-string p0, "Adjust cropRect from %s to %s"

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object v5
.end method

.method public static i0(ZIILandroid/util/Range;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZII",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    rem-int v0, p1, p2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p0, :cond_1

    sub-int/2addr p1, v0

    goto :goto_0

    :cond_1
    sub-int/2addr p2, v0

    add-int/2addr p1, p2

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p3, p0}, Landroid/util/Range;->clamp(Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static j0(IILandroid/util/Range;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {v0, p0, p1, p2}, LUo6;->i0(ZIILandroid/util/Range;)I

    move-result p0

    return p0
.end method

.method public static k0(IILandroid/util/Range;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0, p0, p1, p2}, LUo6;->i0(ZIILandroid/util/Range;)I

    move-result p0

    return p0
.end method

.method public static q0(LZd3;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LZd3<",
            "TT;>;TT;)TT;"
        }
    .end annotation

    invoke-interface {p0}, LZd3;->d()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    :goto_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static u0()Z
    .locals 2

    const-class v0, Lup6;

    invoke-static {v0}, LQ21;->b(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lup6;

    invoke-interface {v1}, Lup6;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static synthetic v0(Landroid/graphics/Rect;Landroid/util/Size;Landroid/util/Size;)I
    .locals 2

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result v1

    sub-int/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    add-int/2addr v0, p1

    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v1

    sub-int/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p2

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result p0

    sub-int/2addr p2, p0

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p0

    add-int/2addr p1, p0

    sub-int/2addr v0, p1

    return v0
.end method

.method public static synthetic w0(LUo6;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/p;->C()V

    return-void
.end method

.method private synthetic x0(LMV5;LLb0;LYo6;Lr46;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, LUo6;->C0(LMV5;LLb0;LYo6;Lr46;)V

    return-void
.end method

.method private synthetic y0(Landroidx/camera/core/impl/DeferrableSurface;)V
    .locals 1

    iget-object v0, p0, LUo6;->n:Landroidx/camera/core/impl/DeferrableSurface;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, LUo6;->n0()V

    :cond_0
    return-void
.end method

.method private synthetic z0(Ljava/lang/String;LYo6;LBR5;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/q$f;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LUo6;->D0(Ljava/lang/String;LYo6;LBR5;)V

    return-void
.end method


# virtual methods
.method public final C0(LMV5;LLb0;LYo6;Lr46;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMV5;",
            "LLb0;",
            "LYo6<",
            "TT;>;",
            "Lr46;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object v0

    if-ne p2, v0, :cond_0

    invoke-virtual {p1, p2}, LMV5;->j(LLb0;)Landroidx/camera/core/o;

    move-result-object p1

    iput-object p1, p0, LUo6;->s:Landroidx/camera/core/o;

    invoke-virtual {p3}, LYo6;->S()Ltp6;

    move-result-object p1

    iget-object p2, p0, LUo6;->s:Landroidx/camera/core/o;

    invoke-interface {p1, p2, p4}, Ltp6;->e(Landroidx/camera/core/o;Lr46;)V

    invoke-virtual {p0}, LUo6;->F0()V

    :cond_0
    return-void
.end method

.method public D0(Ljava/lang/String;LYo6;LBR5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LYo6<",
            "TT;>;",
            "LBR5;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, LUo6;->n0()V

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->w(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, LUo6;->p0(Ljava/lang/String;LYo6;LBR5;)Landroidx/camera/core/impl/q$b;

    move-result-object p1

    iput-object p1, p0, LUo6;->q:Landroidx/camera/core/impl/q$b;

    iget-object p2, p0, LUo6;->p:LuR5;

    invoke-virtual {p0, p1, p2}, LUo6;->l0(Landroidx/camera/core/impl/q$b;LuR5;)V

    iget-object p1, p0, LUo6;->q:Landroidx/camera/core/impl/q$b;

    invoke-virtual {p1}, Landroidx/camera/core/impl/q$b;->m()Landroidx/camera/core/impl/q;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->S(Landroidx/camera/core/impl/q;)V

    invoke-virtual {p0}, Landroidx/camera/core/p;->C()V

    :cond_0
    return-void
.end method

.method public final F0()V
    .locals 6

    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object v0

    iget-object v1, p0, LUo6;->s:Landroidx/camera/core/o;

    iget-object v2, p0, LUo6;->w:Landroid/graphics/Rect;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    invoke-virtual {p0, v0}, Landroidx/camera/core/p;->y(LLb0;)Z

    move-result v3

    invoke-virtual {p0, v0, v3}, Landroidx/camera/core/p;->p(LLb0;Z)I

    move-result v3

    invoke-virtual {p0}, Landroidx/camera/core/p;->c()I

    move-result v4

    iget-object v5, p0, LUo6;->o:LMV5;

    if-eqz v5, :cond_0

    invoke-virtual {v5, v3}, LMV5;->D(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v0}, LLb0;->q()Z

    move-result v0

    invoke-static {v2, v3, v4, v0}, Landroidx/camera/core/o$h;->e(Landroid/graphics/Rect;IIZ)Landroidx/camera/core/o$h;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/camera/core/o;->C(Landroidx/camera/core/o$h;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public G0(Ltp6$a;)V
    .locals 1

    iget-object v0, p0, LUo6;->t:Ltp6$a;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, LUo6;->t:Ltp6$a;

    invoke-virtual {p0}, LUo6;->s0()Ltp6;

    move-result-object v0

    invoke-interface {v0, p1}, Ltp6;->d(Ltp6$a;)V

    :cond_0
    return-void
.end method

.method public H(LKb0;Landroidx/camera/core/impl/s$a;)Landroidx/camera/core/impl/s;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LKb0;",
            "Landroidx/camera/core/impl/s$a<",
            "***>;)",
            "Landroidx/camera/core/impl/s<",
            "*>;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, LUo6;->M0(LKb0;Landroidx/camera/core/impl/s$a;)V

    invoke-interface {p2}, Landroidx/camera/core/impl/s$a;->d()Landroidx/camera/core/impl/s;

    move-result-object p1

    return-object p1
.end method

.method public H0(I)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->P(I)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LUo6;->F0()V

    :cond_0
    return-void
.end method

.method public I()V
    .locals 3

    invoke-super {p0}, Landroidx/camera/core/p;->I()V

    invoke-virtual {p0}, Landroidx/camera/core/p;->d()LBR5;

    move-result-object v0

    const-string v1, "The suggested stream specification should be already updated and shouldn\'t be null."

    invoke-static {v0, v1}, LHZ3;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LUo6;->s:Landroidx/camera/core/o;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "The surface request should be null when VideoCapture is attached."

    invoke-static {v0, v1}, LHZ3;->j(ZLjava/lang/String;)V

    invoke-virtual {p0}, LUo6;->s0()Ltp6;

    move-result-object v0

    invoke-interface {v0}, Ltp6;->c()LZd3;

    move-result-object v0

    sget-object v1, LuR5;->a:LuR5;

    invoke-static {v0, v1}, LUo6;->q0(LZd3;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LuR5;

    iput-object v0, p0, LUo6;->p:LuR5;

    invoke-virtual {p0}, Landroidx/camera/core/p;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v1

    check-cast v1, LYo6;

    invoke-virtual {p0}, Landroidx/camera/core/p;->d()LBR5;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, LUo6;->p0(Ljava/lang/String;LYo6;LBR5;)Landroidx/camera/core/impl/q$b;

    move-result-object v0

    iput-object v0, p0, LUo6;->q:Landroidx/camera/core/impl/q$b;

    iget-object v1, p0, LUo6;->p:LuR5;

    invoke-virtual {p0, v0, v1}, LUo6;->l0(Landroidx/camera/core/impl/q$b;LuR5;)V

    iget-object v0, p0, LUo6;->q:Landroidx/camera/core/impl/q$b;

    invoke-virtual {v0}, Landroidx/camera/core/impl/q$b;->m()Landroidx/camera/core/impl/q;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/core/p;->S(Landroidx/camera/core/impl/q;)V

    invoke-virtual {p0}, Landroidx/camera/core/p;->A()V

    invoke-virtual {p0}, LUo6;->s0()Ltp6;

    move-result-object v0

    invoke-interface {v0}, Ltp6;->c()LZd3;

    move-result-object v0

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    iget-object v2, p0, LUo6;->x:LZd3$a;

    invoke-interface {v0, v1, v2}, LZd3;->c(Ljava/util/concurrent/Executor;LZd3$a;)V

    sget-object v0, Ltp6$a;->c:Ltp6$a;

    invoke-virtual {p0, v0}, LUo6;->G0(Ltp6$a;)V

    return-void
.end method

.method public final I0(Landroidx/camera/core/impl/q$b;Z)V
    .locals 2

    iget-object v0, p0, LUo6;->r:Lcom/google/common/util/concurrent/ListenableFuture;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "VideoCapture"

    const-string v1, "A newer surface update is requested. Previous surface update cancelled."

    invoke-static {v0, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    new-instance v0, LNo6;

    invoke-direct {v0, p0, p1}, LNo6;-><init>(LUo6;Landroidx/camera/core/impl/q$b;)V

    invoke-static {v0}, LO80;->a(LO80$c;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    iput-object p1, p0, LUo6;->r:Lcom/google/common/util/concurrent/ListenableFuture;

    new-instance v0, LUo6$c;

    invoke-direct {v0, p0, p1, p2}, LUo6$c;-><init>(LUo6;Lcom/google/common/util/concurrent/ListenableFuture;Z)V

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p2

    invoke-static {p1, v0, p2}, LIA1;->b(Lcom/google/common/util/concurrent/ListenableFuture;LCA1;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public J()V
    .locals 2

    invoke-static {}, LO36;->c()Z

    move-result v0

    const-string v1, "VideoCapture can only be detached on the main thread."

    invoke-static {v0, v1}, LHZ3;->j(ZLjava/lang/String;)V

    sget-object v0, Ltp6$a;->d:Ltp6$a;

    invoke-virtual {p0, v0}, LUo6;->G0(Ltp6$a;)V

    invoke-virtual {p0}, LUo6;->s0()Ltp6;

    move-result-object v0

    invoke-interface {v0}, Ltp6;->c()LZd3;

    move-result-object v0

    iget-object v1, p0, LUo6;->x:LZd3$a;

    invoke-interface {v0, v1}, LZd3;->b(LZd3$a;)V

    iget-object v0, p0, LUo6;->r:Lcom/google/common/util/concurrent/ListenableFuture;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "VideoCapture"

    const-string v1, "VideoCapture is detached from the camera. Surface update cancelled."

    invoke-static {v0, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, LUo6;->n0()V

    return-void
.end method

.method public final L0(LLb0;)Z
    .locals 1

    invoke-interface {p1}, LLb0;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/camera/core/p;->y(LLb0;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final M0(LKb0;Landroidx/camera/core/impl/s$a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LKb0;",
            "Landroidx/camera/core/impl/s$a<",
            "***>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    invoke-virtual {p0}, LUo6;->r0()LFP2;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Unable to update target resolution by null MediaSpec."

    invoke-static {v1, v2}, LHZ3;->b(ZLjava/lang/Object;)V

    invoke-static {p1}, LRc4;->i(LJb0;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const-string v2, "VideoCapture"

    if-eqz v1, :cond_1

    const-string p1, "Can\'t find any supported quality on the device."

    invoke-static {v2, p1}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {v0}, LFP2;->d()Lwp6;

    move-result-object v1

    invoke-virtual {v1}, Lwp6;->e()LRc4;

    move-result-object v1

    invoke-virtual {v1, p1}, LRc4;->f(LJb0;)Ljava/util/List;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Found selectedQualities "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " by "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, LFP2;->d()Lwp6;

    move-result-object v0

    invoke-virtual {v0}, Lwp6;->b()I

    move-result v0

    invoke-static {p1}, LRc4;->h(LJb0;)Ljava/util/Map;

    move-result-object v1

    new-instance v4, LQc4;

    invoke-virtual {p0}, Landroidx/camera/core/p;->l()I

    move-result v5

    invoke-interface {p1, v5}, LKb0;->l(I)Ljava/util/List;

    move-result-object p1

    invoke-direct {v4, p1, v1}, LQc4;-><init>(Ljava/util/List;Ljava/util/Map;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzb4;

    invoke-virtual {v4, v3, v0}, LQc4;->g(Lzb4;I)Ljava/util/List;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Set supported resolutions = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2}, LDi1;->b()Landroidx/camera/core/impl/l;

    move-result-object p2

    sget-object v0, Landroidx/camera/core/impl/k;->u:Landroidx/camera/core/impl/f$a;

    invoke-interface {p2, v0, p1}, Landroidx/camera/core/impl/l;->C(Landroidx/camera/core/impl/f$a;Ljava/lang/Object;)V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unable to find supported quality by QualitySelector"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public Q(Landroid/graphics/Rect;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/camera/core/p;->Q(Landroid/graphics/Rect;)V

    invoke-virtual {p0}, LUo6;->F0()V

    return-void
.end method

.method public j(ZLVf6;)Landroidx/camera/core/impl/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "LVf6;",
            ")",
            "Landroidx/camera/core/impl/s<",
            "*>;"
        }
    .end annotation

    sget-object v0, LVf6$b;->e:LVf6$b;

    const/4 v1, 0x1

    invoke-interface {p2, v0, v1}, LVf6;->a(LVf6$b;I)Landroidx/camera/core/impl/f;

    move-result-object p2

    if-eqz p1, :cond_0

    sget-object p1, LUo6;->y:LUo6$e;

    invoke-virtual {p1}, LUo6$e;->c()LYo6;

    move-result-object p1

    invoke-static {p2, p1}, Landroidx/camera/core/impl/f;->N(Landroidx/camera/core/impl/f;Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/f;

    move-result-object p2

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p2}, LUo6;->u(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/s$a;

    move-result-object p1

    invoke-interface {p1}, Landroidx/camera/core/impl/s$a;->d()Landroidx/camera/core/impl/s;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public l0(Landroidx/camera/core/impl/q$b;LuR5;)V
    .locals 4

    invoke-virtual {p2}, LuR5;->a()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    invoke-virtual {p2}, LuR5;->b()LuR5$a;

    move-result-object p2

    sget-object v1, LuR5$a;->b:LuR5$a;

    if-ne p2, v1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    if-eqz v0, :cond_3

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unexpected stream state, stream is error but active"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_2
    invoke-virtual {p1}, Landroidx/camera/core/impl/q$b;->n()Landroidx/camera/core/impl/q$b;

    if-nez v0, :cond_5

    if-eqz v2, :cond_4

    iget-object p2, p0, LUo6;->n:Landroidx/camera/core/impl/DeferrableSurface;

    invoke-virtual {p1, p2}, Landroidx/camera/core/impl/q$b;->k(Landroidx/camera/core/impl/DeferrableSurface;)Landroidx/camera/core/impl/q$b;

    goto :goto_3

    :cond_4
    iget-object p2, p0, LUo6;->n:Landroidx/camera/core/impl/DeferrableSurface;

    invoke-virtual {p1, p2}, Landroidx/camera/core/impl/q$b;->h(Landroidx/camera/core/impl/DeferrableSurface;)Landroidx/camera/core/impl/q$b;

    :cond_5
    :goto_3
    invoke-virtual {p0, p1, v2}, LUo6;->I0(Landroidx/camera/core/impl/q$b;Z)V

    return-void
.end method

.method public final m0(Landroid/util/Size;Lhp6;)Landroid/graphics/Rect;
    .locals 4

    invoke-virtual {p0}, Landroidx/camera/core/p;->v()Landroid/graphics/Rect;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/p;->v()Landroid/graphics/Rect;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v2

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    :goto_0
    if-eqz p2, :cond_2

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-interface {p2, v1, v2}, Lhp6;->g(II)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v0, p1, p2}, LUo6;->h0(Landroid/graphics/Rect;Landroid/util/Size;Lhp6;)Landroid/graphics/Rect;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_1
    return-object v0
.end method

.method public final n0()V
    .locals 2

    invoke-static {}, LO36;->a()V

    iget-object v0, p0, LUo6;->n:Landroidx/camera/core/impl/DeferrableSurface;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/core/impl/DeferrableSurface;->c()V

    iput-object v1, p0, LUo6;->n:Landroidx/camera/core/impl/DeferrableSurface;

    :cond_0
    iget-object v0, p0, LUo6;->u:LYV5;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LYV5;->h()V

    iput-object v1, p0, LUo6;->u:LYV5;

    :cond_1
    iget-object v0, p0, LUo6;->o:LMV5;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LMV5;->h()V

    iput-object v1, p0, LUo6;->o:LMV5;

    :cond_2
    iput-object v1, p0, LUo6;->v:Lhp6;

    iput-object v1, p0, LUo6;->w:Landroid/graphics/Rect;

    iput-object v1, p0, LUo6;->s:Landroidx/camera/core/o;

    sget-object v0, LuR5;->a:LuR5;

    iput-object v0, p0, LUo6;->p:LuR5;

    return-void
.end method

.method public final o0(LLb0;Landroid/graphics/Rect;Landroid/util/Size;)LYV5;
    .locals 1

    invoke-virtual {p0}, Landroidx/camera/core/p;->k()Lyb0;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {p1}, LUo6;->K0(LLb0;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2, p3}, LUo6;->J0(Landroid/graphics/Rect;Landroid/util/Size;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0, p1}, LUo6;->L0(LLb0;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    :goto_0
    const-string p1, "VideoCapture"

    const-string p2, "Surface processing is enabled."

    invoke-static {p1, p2}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, LYV5;

    invoke-virtual {p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p2, LLb0;

    invoke-virtual {p0}, Landroidx/camera/core/p;->k()Lyb0;

    move-result-object p3

    if-eqz p3, :cond_2

    invoke-virtual {p0}, Landroidx/camera/core/p;->k()Lyb0;

    move-result-object p3

    invoke-virtual {p3}, Lyb0;->a()LUV5;

    move-result-object p3

    goto :goto_1

    :cond_2
    invoke-static {}, LLY0$a;->a()LUV5;

    move-result-object p3

    :goto_1
    invoke-direct {p1, p2, p3}, LYV5;-><init>(LLb0;LUV5;)V

    return-object p1
.end method

.method public final p0(Ljava/lang/String;LYo6;LBR5;)Landroidx/camera/core/impl/q$b;
    .locals 23
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LYo6<",
            "TT;>;",
            "LBR5;",
            ")",
            "Landroidx/camera/core/impl/q$b;"
        }
    .end annotation

    move-object/from16 v6, p0

    move-object/from16 v7, p2

    invoke-static {}, LO36;->a()V

    invoke-virtual/range {p0 .. p0}, Landroidx/camera/core/p;->f()LLb0;

    move-result-object v0

    invoke-static {v0}, LHZ3;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, LLb0;

    invoke-virtual/range {p3 .. p3}, LBR5;->c()Landroid/util/Size;

    move-result-object v9

    new-instance v10, LOo6;

    invoke-direct {v10, v6}, LOo6;-><init>(LUo6;)V

    sget-object v0, LUo6$e;->d:Landroid/util/Range;

    invoke-interface {v7, v0}, Landroidx/camera/core/impl/s;->M(Landroid/util/Range;)Landroid/util/Range;

    move-result-object v11

    invoke-static {v11}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, LUo6;->r0()LFP2;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v8}, LLb0;->b()LJb0;

    move-result-object v0

    invoke-static {v0}, LMo6;->d(LJb0;)LMo6;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, LYo6;->R()LxA1;

    move-result-object v1

    move-object/from16 v0, p0

    move-object v4, v9

    move-object v5, v11

    invoke-virtual/range {v0 .. v5}, LUo6;->t0(LxA1;LMo6;LFP2;Landroid/util/Size;Landroid/util/Range;)Lhp6;

    move-result-object v0

    invoke-virtual {v6, v9, v0}, LUo6;->m0(Landroid/util/Size;Lhp6;)Landroid/graphics/Rect;

    move-result-object v0

    iput-object v0, v6, LUo6;->w:Landroid/graphics/Rect;

    invoke-virtual {v6, v8, v0, v9}, LUo6;->o0(LLb0;Landroid/graphics/Rect;Landroid/util/Size;)LYV5;

    move-result-object v0

    iput-object v0, v6, LUo6;->u:LYV5;

    if-nez v0, :cond_1

    invoke-interface {v8}, LLb0;->q()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lr46;->b:Lr46;

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {v8}, LLb0;->d()LKb0;

    move-result-object v0

    invoke-interface {v0}, LKb0;->n()Lr46;

    move-result-object v0

    :goto_1
    move-object v12, v0

    iget-object v0, v6, LUo6;->u:LYV5;

    const/4 v13, 0x1

    if-eqz v0, :cond_3

    iget-object v0, v6, LUo6;->o:LMV5;

    if-nez v0, :cond_2

    move v0, v13

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-static {v0}, LHZ3;->i(Z)V

    new-instance v9, LMV5;

    const/4 v15, 0x2

    const/16 v16, 0x22

    invoke-virtual/range {p0 .. p0}, Landroidx/camera/core/p;->q()Landroid/graphics/Matrix;

    move-result-object v18

    invoke-interface {v8}, LLb0;->q()Z

    move-result v19

    iget-object v0, v6, LUo6;->w:Landroid/graphics/Rect;

    invoke-virtual {v6, v8}, Landroidx/camera/core/p;->y(LLb0;)Z

    move-result v1

    invoke-virtual {v6, v8, v1}, Landroidx/camera/core/p;->p(LLb0;Z)I

    move-result v21

    invoke-virtual {v6, v8}, LUo6;->L0(LLb0;)Z

    move-result v22

    move-object v14, v9

    move-object/from16 v17, p3

    move-object/from16 v20, v0

    invoke-direct/range {v14 .. v22}, LMV5;-><init>(IILBR5;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IZ)V

    invoke-virtual {v9, v10}, LMV5;->e(Ljava/lang/Runnable;)V

    iput-object v9, v6, LUo6;->o:LMV5;

    invoke-static {v9}, LYV5$d;->i(LMV5;)LYV5$d;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v9, v1}, LYV5$b;->c(LMV5;Ljava/util/List;)LYV5$b;

    move-result-object v1

    iget-object v2, v6, LUo6;->u:LYV5;

    invoke-virtual {v2, v1}, LYV5;->l(LYV5$b;)LYV5$c;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, LMV5;

    invoke-static {v10}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v14, LPo6;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object v2, v10

    move-object v3, v8

    move-object/from16 v4, p2

    move-object v5, v12

    invoke-direct/range {v0 .. v5}, LPo6;-><init>(LUo6;LMV5;LLb0;LYo6;Lr46;)V

    invoke-virtual {v10, v14}, LMV5;->e(Ljava/lang/Runnable;)V

    invoke-virtual {v10, v8, v11}, LMV5;->k(LLb0;Landroid/util/Range;)Landroidx/camera/core/o;

    move-result-object v0

    iput-object v0, v6, LUo6;->s:Landroidx/camera/core/o;

    invoke-virtual {v9}, LMV5;->o()Landroidx/camera/core/impl/DeferrableSurface;

    move-result-object v0

    iput-object v0, v6, LUo6;->n:Landroidx/camera/core/impl/DeferrableSurface;

    invoke-virtual {v0}, Landroidx/camera/core/impl/DeferrableSurface;->i()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object v1

    new-instance v2, LQo6;

    invoke-direct {v2, v6, v0}, LQo6;-><init>(LUo6;Landroidx/camera/core/impl/DeferrableSurface;)V

    invoke-static {}, LAc0;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_3

    :cond_3
    new-instance v0, Landroidx/camera/core/o;

    invoke-direct {v0, v9, v8, v11, v10}, Landroidx/camera/core/o;-><init>(Landroid/util/Size;LLb0;Landroid/util/Range;Ljava/lang/Runnable;)V

    iput-object v0, v6, LUo6;->s:Landroidx/camera/core/o;

    invoke-virtual {v0}, Landroidx/camera/core/o;->l()Landroidx/camera/core/impl/DeferrableSurface;

    move-result-object v0

    iput-object v0, v6, LUo6;->n:Landroidx/camera/core/impl/DeferrableSurface;

    :goto_3
    invoke-virtual/range {p2 .. p2}, LYo6;->S()Ltp6;

    move-result-object v0

    iget-object v1, v6, LUo6;->s:Landroidx/camera/core/o;

    invoke-interface {v0, v1, v12}, Ltp6;->e(Landroidx/camera/core/o;Lr46;)V

    invoke-virtual/range {p0 .. p0}, LUo6;->F0()V

    iget-object v0, v6, LUo6;->n:Landroidx/camera/core/impl/DeferrableSurface;

    const-class v1, Landroid/media/MediaCodec;

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/DeferrableSurface;->p(Ljava/lang/Class;)V

    invoke-virtual/range {p3 .. p3}, LBR5;->c()Landroid/util/Size;

    move-result-object v0

    invoke-static {v7, v0}, Landroidx/camera/core/impl/q$b;->o(Landroidx/camera/core/impl/s;Landroid/util/Size;)Landroidx/camera/core/impl/q$b;

    move-result-object v0

    invoke-virtual/range {p3 .. p3}, LBR5;->b()Landroid/util/Range;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/q$b;->r(Landroid/util/Range;)Landroidx/camera/core/impl/q$b;

    new-instance v1, LRo6;

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    invoke-direct {v1, v6, v2, v7, v3}, LRo6;-><init>(LUo6;Ljava/lang/String;LYo6;LBR5;)V

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/q$b;->f(Landroidx/camera/core/impl/q$c;)Landroidx/camera/core/impl/q$b;

    sget-boolean v1, LUo6;->A:Z

    if-eqz v1, :cond_4

    invoke-virtual {v0, v13}, Landroidx/camera/core/impl/q$b;->u(I)Landroidx/camera/core/impl/q$b;

    :cond_4
    return-object v0
.end method

.method public final r0()LFP2;
    .locals 2

    invoke-virtual {p0}, LUo6;->s0()Ltp6;

    move-result-object v0

    invoke-interface {v0}, Ltp6;->b()LZd3;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, LUo6;->q0(LZd3;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFP2;

    return-object v0
.end method

.method public s()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public s0()Ltp6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/camera/core/p;->i()Landroidx/camera/core/impl/s;

    move-result-object v0

    check-cast v0, LYo6;

    invoke-virtual {v0}, LYo6;->S()Ltp6;

    move-result-object v0

    return-object v0
.end method

.method public final t0(LxA1;LMo6;LFP2;Landroid/util/Size;Landroid/util/Range;)Lhp6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LxA1<",
            "Ldp6;",
            "Lhp6;",
            ">;",
            "LMo6;",
            "LFP2;",
            "Landroid/util/Size;",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lhp6;"
        }
    .end annotation

    iget-object v0, p0, LUo6;->v:Lhp6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p2, p4}, LMo6;->b(Landroid/util/Size;)Lyp6;

    move-result-object p2

    invoke-static {p1, p2, p3, p4, p5}, LUo6;->E0(LxA1;Lyp6;LFP2;Landroid/util/Size;Landroid/util/Range;)Lhp6;

    move-result-object p1

    const/4 p3, 0x0

    if-nez p1, :cond_1

    const-string p1, "VideoCapture"

    const-string p2, "Can\'t find videoEncoderInfo"

    invoke-static {p1, p2}, LJx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-object p3

    :cond_1
    if-eqz p2, :cond_2

    new-instance p3, Landroid/util/Size;

    invoke-virtual {p2}, Lyp6;->h()Llc1$c;

    move-result-object p4

    invoke-virtual {p4}, Llc1$c;->k()I

    move-result p4

    invoke-virtual {p2}, Lyp6;->h()Llc1$c;

    move-result-object p2

    invoke-virtual {p2}, Llc1$c;->h()I

    move-result p2

    invoke-direct {p3, p4, p2}, Landroid/util/Size;-><init>(II)V

    :cond_2
    invoke-static {p1, p3}, Ljp6;->i(Lhp6;Landroid/util/Size;)Lhp6;

    move-result-object p1

    iput-object p1, p0, LUo6;->v:Lhp6;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VideoCapture:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/camera/core/p;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Landroidx/camera/core/impl/f;)Landroidx/camera/core/impl/s$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/f;",
            ")",
            "Landroidx/camera/core/impl/s$a<",
            "***>;"
        }
    .end annotation

    invoke-static {p1}, LUo6$d;->g(Landroidx/camera/core/impl/f;)LUo6$d;

    move-result-object p1

    return-object p1
.end method
