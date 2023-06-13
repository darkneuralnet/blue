.class public abstract Lyp6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llc1;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(IILjava/util/List;Ljava/util/List;)Lyp6;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Llc1$a;",
            ">;",
            "Ljava/util/List<",
            "Llc1$c;",
            ">;)",
            "Lyp6;"
        }
    .end annotation

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Should contain at least one VideoProfile."

    invoke-static {v0, v1}, LHZ3;->b(ZLjava/lang/Object;)V

    const/4 v0, 0x0

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Llc1$c;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llc1$a;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object v7, v0

    new-instance v0, Ltu;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    move-object v2, v0

    move v3, p0

    move v4, p1

    invoke-direct/range {v2 .. v8}, Ltu;-><init>(IILjava/util/List;Ljava/util/List;Llc1$a;Llc1$c;)V

    return-object v0
.end method

.method public static f(Llc1;)Lyp6;
    .locals 3

    invoke-interface {p0}, Llc1;->c()I

    move-result v0

    invoke-interface {p0}, Llc1;->a()I

    move-result v1

    invoke-interface {p0}, Llc1;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {p0}, Llc1;->d()Ljava/util/List;

    move-result-object p0

    invoke-static {v0, v1, v2, p0}, Lyp6;->e(IILjava/util/List;Ljava/util/List;)Lyp6;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract g()Llc1$a;
.end method

.method public abstract h()Llc1$c;
.end method
