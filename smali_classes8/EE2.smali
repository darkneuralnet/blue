.class public LEE2;
.super LlB5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LEE2$a;
    }
.end annotation


# instance fields
.field public b:Ljava/util/List;

.field public c:LNN5;

.field public d:I

.field public e:Ljava/util/Collection;

.field public f:I

.field public g:D


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LlB5;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LEE2;->b:Ljava/util/List;

    new-instance v0, Lch5;

    invoke-direct {v0}, Lch5;-><init>()V

    iput-object v0, p0, LEE2;->c:LNN5;

    const/4 v0, 0x0

    iput v0, p0, LEE2;->d:I

    iput v0, p0, LEE2;->f:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LEE2;->g:D

    return-void
.end method

.method public constructor <init>(LVq5;D)V
    .locals 0

    invoke-direct {p0, p1}, LlB5;-><init>(LVq5;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LEE2;->b:Ljava/util/List;

    new-instance p1, Lch5;

    invoke-direct {p1}, Lch5;-><init>()V

    iput-object p1, p0, LEE2;->c:LNN5;

    const/4 p1, 0x0

    iput p1, p0, LEE2;->d:I

    iput p1, p0, LEE2;->f:I

    iput-wide p2, p0, LEE2;->g:D

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Collection;)V
    .locals 1

    iput-object p1, p0, LEE2;->e:Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcr5;

    invoke-virtual {p0, v0}, LEE2;->d(Lcr5;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LEE2;->e()V

    return-void
.end method

.method public b()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, LEE2;->e:Ljava/util/Collection;

    invoke-static {v0}, LS83;->g(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final d(Lcr5;)V
    .locals 4

    invoke-interface {p1}, Lcr5;->h()[LyB0;

    move-result-object v0

    invoke-static {v0, p1}, LDV2;->b([LyB0;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBV2;

    iget v1, p0, LEE2;->d:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LEE2;->d:I

    invoke-virtual {v0, v1}, LBV2;->i(I)V

    iget-object v1, p0, LEE2;->c:LNN5;

    iget-wide v2, p0, LEE2;->g:D

    invoke-virtual {v0, v2, v3}, LBV2;->d(D)Lsf1;

    move-result-object v2

    invoke-interface {v1, v2, v0}, LNN5;->a(Lsf1;Ljava/lang/Object;)V

    iget-object v1, p0, LEE2;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 7

    new-instance v0, LEE2$a;

    iget-object v1, p0, LlB5;->a:LVq5;

    invoke-direct {v0, v1}, LEE2$a;-><init>(LVq5;)V

    iget-object v1, p0, LEE2;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LBV2;

    iget-wide v3, p0, LEE2;->g:D

    invoke-virtual {v2, v3, v4}, LBV2;->d(D)Lsf1;

    move-result-object v3

    iget-object v4, p0, LEE2;->c:LNN5;

    invoke-interface {v4, v3}, LNN5;->b(Lsf1;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LBV2;

    invoke-virtual {v4}, LBV2;->e()I

    move-result v5

    invoke-virtual {v2}, LBV2;->e()I

    move-result v6

    if-le v5, v6, :cond_2

    iget-wide v5, p0, LEE2;->g:D

    invoke-virtual {v2, v4, v5, v6, v0}, LBV2;->b(LBV2;DLGV2;)V

    iget v4, p0, LEE2;->f:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, LEE2;->f:I

    :cond_2
    iget-object v4, p0, LlB5;->a:LVq5;

    invoke-interface {v4}, LVq5;->isDone()Z

    move-result v4

    if-eqz v4, :cond_1

    :cond_3
    return-void
.end method
