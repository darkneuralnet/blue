.class public final LQX5;
.super LDX5$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQX5$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LDX5$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LDX5$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, LDX5$a;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LQX5;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public static varargs u([LDX5$a;)LDX5$a;
    .locals 1

    new-instance v0, LQX5;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, LQX5;-><init>(Ljava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public m(LDX5;)V
    .locals 2

    iget-object v0, p0, LQX5;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LDX5$a;

    invoke-virtual {v1, p1}, LDX5$a;->m(LDX5;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public n(LDX5;)V
    .locals 2

    iget-object v0, p0, LQX5;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LDX5$a;

    invoke-virtual {v1, p1}, LDX5$a;->n(LDX5;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public o(LDX5;)V
    .locals 2

    iget-object v0, p0, LQX5;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LDX5$a;

    invoke-virtual {v1, p1}, LDX5$a;->o(LDX5;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public p(LDX5;)V
    .locals 2

    iget-object v0, p0, LQX5;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LDX5$a;

    invoke-virtual {v1, p1}, LDX5$a;->p(LDX5;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public q(LDX5;)V
    .locals 2

    iget-object v0, p0, LQX5;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LDX5$a;

    invoke-virtual {v1, p1}, LDX5$a;->q(LDX5;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public r(LDX5;)V
    .locals 2

    iget-object v0, p0, LQX5;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LDX5$a;

    invoke-virtual {v1, p1}, LDX5$a;->r(LDX5;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public s(LDX5;)V
    .locals 2

    iget-object v0, p0, LQX5;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LDX5$a;

    invoke-virtual {v1, p1}, LDX5$a;->s(LDX5;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public t(LDX5;Landroid/view/Surface;)V
    .locals 2

    iget-object v0, p0, LQX5;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LDX5$a;

    invoke-virtual {v1, p1, p2}, LDX5$a;->t(LDX5;Landroid/view/Surface;)V

    goto :goto_0

    :cond_0
    return-void
.end method
