.class public LMP2;
.super LuX2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LMP2$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LuX2<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:Lph5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lph5<",
            "Landroidx/lifecycle/LiveData<",
            "*>;",
            "LMP2$a<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LuX2;-><init>()V

    new-instance v0, Lph5;

    invoke-direct {v0}, Lph5;-><init>()V

    iput-object v0, p0, LMP2;->a:Lph5;

    return-void
.end method


# virtual methods
.method public b(Landroidx/lifecycle/LiveData;Lfe3;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/lifecycle/LiveData<",
            "TS;>;",
            "Lfe3<",
            "-TS;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_4

    new-instance v0, LMP2$a;

    invoke-direct {v0, p1, p2}, LMP2$a;-><init>(Landroidx/lifecycle/LiveData;Lfe3;)V

    iget-object v1, p0, LMP2;->a:Lph5;

    invoke-virtual {v1, p1, v0}, Lph5;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LMP2$a;

    if-eqz p1, :cond_1

    iget-object v1, p1, LMP2$a;->c:Lfe3;

    if-ne v1, p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "This source was already added with the different observer"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->hasActiveObservers()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v0}, LMP2$a;->a()V

    :cond_3
    return-void

    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "source cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(Landroidx/lifecycle/LiveData;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/lifecycle/LiveData<",
            "TS;>;)V"
        }
    .end annotation

    iget-object v0, p0, LMP2;->a:Lph5;

    invoke-virtual {v0, p1}, Lph5;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LMP2$a;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LMP2$a;->b()V

    :cond_0
    return-void
.end method

.method public onActive()V
    .locals 2

    iget-object v0, p0, LMP2;->a:Lph5;

    invoke-virtual {v0}, Lph5;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LMP2$a;

    invoke-virtual {v1}, LMP2$a;->a()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onInactive()V
    .locals 2

    iget-object v0, p0, LMP2;->a:Lph5;

    invoke-virtual {v0}, Lph5;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LMP2$a;

    invoke-virtual {v1}, LMP2$a;->b()V

    goto :goto_0

    :cond_0
    return-void
.end method
