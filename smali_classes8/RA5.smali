.class public LRA5;
.super LI91;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/List;

.field public b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LI91;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LRA5;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;LWq5;Z)V
    .locals 0

    if-eqz p3, :cond_0

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p3}, LRA5;->e(Ljava/util/List;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LRA5;->d(Ljava/util/List;)V

    :goto_0
    invoke-virtual {p0, p2}, LRA5;->f(LWq5;)V

    return-void
.end method

.method public b(Ljava/util/List;Ljava/util/List;LWq5;)V
    .locals 0

    invoke-virtual {p0, p1, p1}, LRA5;->e(Ljava/util/List;Ljava/lang/Object;)V

    invoke-virtual {p0, p2, p2}, LRA5;->e(Ljava/util/List;Ljava/lang/Object;)V

    invoke-virtual {p0, p3}, LRA5;->f(LWq5;)V

    return-void
.end method

.method public final c(Lq91;Ljava/lang/Object;)V
    .locals 7

    invoke-virtual {p1}, Lq91;->q()LEV2;

    move-result-object p1

    invoke-virtual {p1}, LEV2;->e()[I

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_0

    new-instance v2, LCV2;

    invoke-direct {v2, p1, v1}, LCV2;-><init>(LEV2;I)V

    new-instance v3, LAW5;

    invoke-virtual {p1, v1}, LEV2;->d(I)D

    move-result-wide v4

    invoke-direct {v3, p2, v4, v5, v2}, LAW5;-><init>(Ljava/lang/Object;DLjava/lang/Object;)V

    iget-object v2, p0, LRA5;->a:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, LRA5;->a:Ljava/util/List;

    new-instance v4, LAW5;

    invoke-virtual {p1, v1}, LEV2;->c(I)D

    move-result-wide v5

    invoke-direct {v4, v5, v6, v3}, LAW5;-><init>(DLAW5;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d(Ljava/util/List;)V
    .locals 1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq91;

    invoke-virtual {p0, v0, v0}, LRA5;->c(Lq91;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final e(Ljava/util/List;Ljava/lang/Object;)V
    .locals 1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq91;

    invoke-virtual {p0, v0, p2}, LRA5;->c(Lq91;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final f(LWq5;)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, LRA5;->b:I

    invoke-virtual {p0}, LRA5;->g()V

    :goto_0
    iget-object v1, p0, LRA5;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, LRA5;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LAW5;

    invoke-virtual {v1}, LAW5;->e()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, LAW5;->a()I

    move-result v2

    invoke-virtual {p0, v0, v2, v1, p1}, LRA5;->h(IILAW5;LWq5;)V

    :cond_0
    invoke-virtual {p1}, LWq5;->g()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final g()V
    .locals 3

    iget-object v0, p0, LRA5;->a:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LRA5;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, LRA5;->a:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LAW5;

    invoke-virtual {v1}, LAW5;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, LAW5;->b()LAW5;

    move-result-object v1

    invoke-virtual {v1, v0}, LAW5;->g(I)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final h(IILAW5;LWq5;)V
    .locals 3

    invoke-virtual {p3}, LAW5;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LCV2;

    :goto_0
    if-ge p1, p2, :cond_1

    iget-object v1, p0, LRA5;->a:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LAW5;

    invoke-virtual {v1}, LAW5;->e()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, LAW5;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LCV2;

    invoke-virtual {p3, v1}, LAW5;->f(LAW5;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0, v2, p4}, LCV2;->a(LCV2;LWq5;)V

    iget v1, p0, LRA5;->b:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, LRA5;->b:I

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method
