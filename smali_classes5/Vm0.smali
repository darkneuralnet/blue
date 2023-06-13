.class public LVm0;
.super Lji0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lji0<",
        "LUm0;",
        ">;"
    }
.end annotation


# instance fields
.field public c:Lvx;


# direct methods
.method public constructor <init>(LUm0;Ltx;)V
    .locals 0

    invoke-direct {p0, p1}, Lji0;-><init>(Lyx;)V

    invoke-interface {p2}, Ltx;->q()Lsx;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, Lvx;

    invoke-direct {p1, p2}, Lvx;-><init>(Ltx;)V

    :goto_0
    iput-object p1, p0, LVm0;->c:Lvx;

    return-void
.end method


# virtual methods
.method public h(FFF)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFF)",
            "Ljava/util/List<",
            "LOM1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lji0;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lji0;->a:Lyx;

    check-cast v0, LUm0;

    invoke-interface {v0}, LUm0;->l()LTm0;

    move-result-object v0

    invoke-virtual {v0}, LTm0;->s()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_4

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lii0;

    iget-object v4, p0, LVm0;->c:Lvx;

    if-eqz v4, :cond_0

    instance-of v5, v3, Lsx;

    if-eqz v5, :cond_0

    invoke-virtual {v4, p2, p3}, Lvx;->a(FF)LOM1;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3, v2}, LOM1;->l(I)V

    iget-object v4, p0, Lji0;->b:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_0
    invoke-virtual {v3}, Lii0;->e()I

    move-result v3

    move v4, v1

    :goto_1
    if-ge v4, v3, :cond_3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lxx;

    invoke-virtual {v5, v4}, Lii0;->d(I)LoO1;

    move-result-object v5

    invoke-interface {v5}, LoO1;->Q()Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_3

    :cond_1
    sget-object v6, LTS0$a;->d:LTS0$a;

    invoke-virtual {p0, v5, v4, p1, v6}, Lji0;->b(LoO1;IFLTS0$a;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LOM1;

    invoke-virtual {v6, v2}, LOM1;->l(I)V

    iget-object v7, p0, Lji0;->b:Ljava/util/List;

    invoke-interface {v7, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lji0;->b:Ljava/util/List;

    return-object p1
.end method
