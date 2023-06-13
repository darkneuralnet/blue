.class public LHW3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LwA3;

.field public b:LbC1;

.field public c:Ljava/util/List;


# direct methods
.method public constructor <init>(LwA3;LbC1;LMW3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, LHW3;->c:Ljava/util/List;

    iput-object p1, p0, LHW3;->a:LwA3;

    iput-object p2, p0, LHW3;->b:LbC1;

    return-void
.end method


# virtual methods
.method public a(I)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1}, LHW3;->b(I)V

    iget-object p1, p0, LHW3;->c:Ljava/util/List;

    return-object p1
.end method

.method public final b(I)V
    .locals 3

    iget-object v0, p0, LHW3;->a:LwA3;

    invoke-virtual {v0}, LwA3;->j()LlV3;

    move-result-object v0

    invoke-virtual {v0}, LlV3;->g()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LD83;

    invoke-virtual {v1}, LSD1;->e()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, LD83;->l()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, LD83;->k()Lz91;

    move-result-object v2

    invoke-virtual {v2}, Lz91;->d()I

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, 0x1

    if-ne p1, v2, :cond_0

    :cond_3
    invoke-virtual {v1}, LSD1;->b()LSl2;

    move-result-object v2

    invoke-static {v2, p1}, LwA3;->r(LSl2;I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, LHW3;->c(LD83;)V

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final c(LD83;)V
    .locals 1

    invoke-virtual {p1}, LD83;->j()LyB0;

    move-result-object p1

    iget-object v0, p0, LHW3;->a:LwA3;

    invoke-virtual {v0, p1}, LwA3;->p(LyB0;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LHW3;->b:LbC1;

    invoke-virtual {v0, p1}, LbC1;->t(LyB0;)LFW3;

    move-result-object p1

    iget-object v0, p0, LHW3;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
