.class public final Lhs7;
.super Len7;
.source "SourceFile"


# instance fields
.field public final d:Ljava/util/List;

.field public final e:Ljava/util/List;

.field public f:Lam8;


# direct methods
.method public constructor <init>(Lhs7;)V
    .locals 2

    iget-object v0, p1, Len7;->b:Ljava/lang/String;

    invoke-direct {p0, v0}, Len7;-><init>(Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lhs7;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lhs7;->d:Ljava/util/List;

    iget-object v1, p1, Lhs7;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lhs7;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lhs7;->e:Ljava/util/List;

    iget-object v1, p1, Lhs7;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p1, Lhs7;->f:Lam8;

    iput-object p1, p0, Lhs7;->f:Lam8;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lam8;)V
    .locals 0

    invoke-direct {p0, p1}, Len7;-><init>(Ljava/lang/String;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lhs7;->d:Ljava/util/List;

    iput-object p4, p0, Lhs7;->f:Lam8;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LXs7;

    iget-object p4, p0, Lhs7;->d:Ljava/util/List;

    invoke-interface {p2}, LXs7;->zzi()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p4, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Lhs7;->e:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final d(Lam8;Ljava/util/List;)LXs7;
    .locals 4

    iget-object v0, p0, Lhs7;->f:Lam8;

    invoke-virtual {v0}, Lam8;->a()Lam8;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lhs7;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lhs7;->d:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LXs7;

    invoke-virtual {p1, v3}, Lam8;->b(LXs7;)LXs7;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lam8;->e(Ljava/lang/String;LXs7;)V

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lhs7;->d:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v3, LXs7;->h0:LXs7;

    invoke-virtual {v0, v2, v3}, Lam8;->e(Ljava/lang/String;LXs7;)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lhs7;->e:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LXs7;

    invoke-virtual {v0, p2}, Lam8;->b(LXs7;)LXs7;

    move-result-object v1

    instance-of v2, v1, LLt7;

    if-eqz v2, :cond_3

    invoke-virtual {v0, p2}, Lam8;->b(LXs7;)LXs7;

    move-result-object v1

    :cond_3
    instance-of p2, v1, Lnl7;

    if-eqz p2, :cond_2

    check-cast v1, Lnl7;

    invoke-virtual {v1}, Lnl7;->a()LXs7;

    move-result-object p1

    return-object p1

    :cond_4
    sget-object p1, LXs7;->h0:LXs7;

    return-object p1
.end method

.method public final zzd()LXs7;
    .locals 1

    new-instance v0, Lhs7;

    invoke-direct {v0, p0}, Lhs7;-><init>(Lhs7;)V

    return-object v0
.end method
