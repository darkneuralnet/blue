.class public final LWo9;
.super Len7;
.source "SourceFile"


# instance fields
.field public final d:Z

.field public final e:Z

.field public final synthetic f:LVq9;


# direct methods
.method public constructor <init>(LVq9;ZZ)V
    .locals 0

    iput-object p1, p0, LWo9;->f:LVq9;

    const-string p1, "log"

    invoke-direct {p0, p1}, Len7;-><init>(Ljava/lang/String;)V

    iput-boolean p2, p0, LWo9;->d:Z

    iput-boolean p3, p0, LWo9;->e:Z

    return-void
.end method


# virtual methods
.method public final d(Lam8;Ljava/util/List;)LXs7;
    .locals 11

    const-string v0, "log"

    const/4 v1, 0x1

    invoke-static {v0, v1, p2}, Lbt8;->i(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LWo9;->f:LVq9;

    invoke-static {v0}, LVq9;->f(LVq9;)LNl9;

    move-result-object v3

    const/4 v4, 0x3

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LXs7;

    invoke-virtual {p1, p2}, Lam8;->b(LXs7;)LXs7;

    move-result-object p1

    invoke-interface {p1}, LXs7;->zzi()Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    iget-boolean v7, p0, LWo9;->d:Z

    iget-boolean v8, p0, LWo9;->e:Z

    invoke-interface/range {v3 .. v8}, LNl9;->a(ILjava/lang/String;Ljava/util/List;ZZ)V

    sget-object p1, LXs7;->h0:LXs7;

    return-object p1

    :cond_0
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXs7;

    invoke-virtual {p1, v0}, Lam8;->b(LXs7;)LXs7;

    move-result-object v0

    invoke-interface {v0}, LXs7;->zzh()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Lbt8;->b(D)I

    move-result v0

    const/4 v2, 0x5

    const/4 v3, 0x2

    if-eq v0, v3, :cond_4

    const/4 v4, 0x3

    if-eq v0, v4, :cond_3

    if-eq v0, v2, :cond_2

    const/4 v5, 0x6

    if-eq v0, v5, :cond_1

    goto :goto_0

    :cond_1
    move v6, v3

    goto :goto_1

    :cond_2
    move v6, v2

    goto :goto_1

    :cond_3
    move v6, v1

    goto :goto_1

    :cond_4
    const/4 v4, 0x4

    :goto_0
    move v6, v4

    :goto_1
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXs7;

    invoke-virtual {p1, v0}, Lam8;->b(LXs7;)LXs7;

    move-result-object v0

    invoke-interface {v0}, LXs7;->zzi()Ljava/lang/String;

    move-result-object v7

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v3, :cond_5

    iget-object p1, p0, LWo9;->f:LVq9;

    invoke-static {p1}, LVq9;->f(LVq9;)LNl9;

    move-result-object v5

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v8

    iget-boolean v9, p0, LWo9;->d:Z

    iget-boolean v10, p0, LWo9;->e:Z

    invoke-interface/range {v5 .. v10}, LNl9;->a(ILjava/lang/String;Ljava/util/List;ZZ)V

    sget-object p1, LXs7;->h0:LXs7;

    return-object p1

    :cond_5
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ge v3, v0, :cond_6

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXs7;

    invoke-virtual {p1, v0}, Lam8;->b(LXs7;)LXs7;

    move-result-object v0

    invoke-interface {v0}, LXs7;->zzi()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    iget-object p1, p0, LWo9;->f:LVq9;

    invoke-static {p1}, LVq9;->f(LVq9;)LNl9;

    move-result-object v5

    iget-boolean v9, p0, LWo9;->d:Z

    iget-boolean v10, p0, LWo9;->e:Z

    invoke-interface/range {v5 .. v10}, LNl9;->a(ILjava/lang/String;Ljava/util/List;ZZ)V

    sget-object p1, LXs7;->h0:LXs7;

    return-object p1
.end method
