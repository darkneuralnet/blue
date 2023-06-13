.class public final Landroidx/camera/core/impl/q$g;
.super Landroidx/camera/core/impl/q$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/impl/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# static fields
.field public static final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:LnW5;

.field public i:Z

.field public j:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/Integer;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    const/4 v3, 0x5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/impl/q$g;->k:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/camera/core/impl/q$a;-><init>()V

    new-instance v0, LnW5;

    invoke-direct {v0}, LnW5;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/impl/q$g;->h:LnW5;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/camera/core/impl/q$g;->i:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/camera/core/impl/q$g;->j:Z

    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/core/impl/q;)V
    .locals 4

    invoke-virtual {p1}, Landroidx/camera/core/impl/q;->h()Landroidx/camera/core/impl/d;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/d;->h()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/camera/core/impl/q$g;->j:Z

    iget-object v1, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v0}, Landroidx/camera/core/impl/d;->h()I

    move-result v2

    iget-object v3, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v3}, Landroidx/camera/core/impl/d$a;->n()I

    move-result v3

    invoke-virtual {p0, v2, v3}, Landroidx/camera/core/impl/q$g;->f(II)I

    move-result v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/d$a;->s(I)V

    :cond_0
    invoke-virtual {v0}, Landroidx/camera/core/impl/d;->d()Landroid/util/Range;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroidx/camera/core/impl/q$g;->g(Landroid/util/Range;)V

    invoke-virtual {p1}, Landroidx/camera/core/impl/q;->h()Landroidx/camera/core/impl/d;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/camera/core/impl/d;->g()LxY5;

    move-result-object v1

    iget-object v2, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v2, v1}, Landroidx/camera/core/impl/d$a;->b(LxY5;)V

    iget-object v1, p0, Landroidx/camera/core/impl/q$a;->c:Ljava/util/List;

    invoke-virtual {p1}, Landroidx/camera/core/impl/q;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Landroidx/camera/core/impl/q$a;->d:Ljava/util/List;

    invoke-virtual {p1}, Landroidx/camera/core/impl/q;->i()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {p1}, Landroidx/camera/core/impl/q;->g()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/d$a;->a(Ljava/util/Collection;)V

    iget-object v1, p0, Landroidx/camera/core/impl/q$a;->f:Ljava/util/List;

    invoke-virtual {p1}, Landroidx/camera/core/impl/q;->j()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Landroidx/camera/core/impl/q$a;->e:Ljava/util/List;

    invoke-virtual {p1}, Landroidx/camera/core/impl/q;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p1}, Landroidx/camera/core/impl/q;->e()Landroid/hardware/camera2/params/InputConfiguration;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroidx/camera/core/impl/q;->e()Landroid/hardware/camera2/params/InputConfiguration;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/core/impl/q$a;->g:Landroid/hardware/camera2/params/InputConfiguration;

    :cond_1
    iget-object v1, p0, Landroidx/camera/core/impl/q$a;->a:Ljava/util/Set;

    invoke-virtual {p1}, Landroidx/camera/core/impl/q;->f()Ljava/util/List;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {p1}, Landroidx/camera/core/impl/d$a;->m()Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v0}, Landroidx/camera/core/impl/d;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Landroidx/camera/core/impl/q$g;->d()Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v1}, Landroidx/camera/core/impl/d$a;->m()Ljava/util/Set;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "Invalid configuration due to capture request surfaces are not a subset of surfaces"

    const-string v1, "ValidatingBuilder"

    invoke-static {v1, p1}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/camera/core/impl/q$g;->i:Z

    :cond_2
    iget-object p1, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v0}, Landroidx/camera/core/impl/d;->e()Landroidx/camera/core/impl/f;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/d$a;->e(Landroidx/camera/core/impl/f;)V

    return-void
.end method

.method public b()Landroidx/camera/core/impl/q;
    .locals 9

    iget-boolean v0, p0, Landroidx/camera/core/impl/q$g;->i:Z

    if-eqz v0, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->a:Ljava/util/Set;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v0, p0, Landroidx/camera/core/impl/q$g;->h:LnW5;

    invoke-virtual {v0, v2}, LnW5;->d(Ljava/util/List;)V

    new-instance v0, Landroidx/camera/core/impl/q;

    iget-object v3, p0, Landroidx/camera/core/impl/q$a;->c:Ljava/util/List;

    iget-object v4, p0, Landroidx/camera/core/impl/q$a;->d:Ljava/util/List;

    iget-object v5, p0, Landroidx/camera/core/impl/q$a;->f:Ljava/util/List;

    iget-object v6, p0, Landroidx/camera/core/impl/q$a;->e:Ljava/util/List;

    iget-object v1, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v1}, Landroidx/camera/core/impl/d$a;->h()Landroidx/camera/core/impl/d;

    move-result-object v7

    iget-object v8, p0, Landroidx/camera/core/impl/q$a;->g:Landroid/hardware/camera2/params/InputConfiguration;

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Landroidx/camera/core/impl/q;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/core/impl/d;Landroid/hardware/camera2/params/InputConfiguration;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unsupported session configuration combination"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v0}, Landroidx/camera/core/impl/d$a;->i()V

    return-void
.end method

.method public final d()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/DeferrableSurface;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Landroidx/camera/core/impl/q$a;->a:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/q$e;

    invoke-virtual {v2}, Landroidx/camera/core/impl/q$e;->d()Landroidx/camera/core/impl/DeferrableSurface;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, Landroidx/camera/core/impl/q$e;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/DeferrableSurface;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/camera/core/impl/q$g;->j:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/camera/core/impl/q$g;->i:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final f(II)I
    .locals 3

    sget-object v0, Landroidx/camera/core/impl/q$g;->k:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    if-lt v1, v0, :cond_0

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    return p1
.end method

.method public final g(Landroid/util/Range;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    sget-object v0, LBR5;->a:Landroid/util/Range;

    invoke-virtual {p1, v0}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v1}, Landroidx/camera/core/impl/d$a;->l()Landroid/util/Range;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/d$a;->q(Landroid/util/Range;)V

    return-void

    :cond_1
    iget-object v0, p0, Landroidx/camera/core/impl/q$a;->b:Landroidx/camera/core/impl/d$a;

    invoke-virtual {v0}, Landroidx/camera/core/impl/d$a;->l()Landroid/util/Range;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/camera/core/impl/q$g;->i:Z

    const-string p1, "ValidatingBuilder"

    const-string v0, "Different ExpectedFrameRateRange values"

    invoke-static {p1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method
