.class public LgA3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LWa0;

.field public final c:LTi1;

.field public final d:Lxh1;

.field public final e:LPY5;


# direct methods
.method public constructor <init>(Ljava/lang/String;LWa0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, LTi1;

    invoke-static {v0}, LS21;->a(Ljava/lang/Class;)LSe4;

    move-result-object v0

    check-cast v0, LTi1;

    iput-object v0, p0, LgA3;->c:LTi1;

    new-instance v0, LPY5;

    invoke-direct {v0}, LPY5;-><init>()V

    iput-object v0, p0, LgA3;->e:LPY5;

    iput-object p1, p0, LgA3;->a:Ljava/lang/String;

    iput-object p2, p0, LgA3;->b:LWa0;

    new-instance p2, Lxh1;

    invoke-direct {p2, p1}, Lxh1;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, LgA3;->d:Lxh1;

    return-void
.end method

.method public static c(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    return-object p0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method


# virtual methods
.method public final a([Landroid/util/Size;I)[Landroid/util/Size;
    .locals 1

    iget-object v0, p0, LgA3;->c:LTi1;

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {v0, p2}, LTi1;->d(I)[Landroid/util/Size;

    move-result-object p2

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-static {p1, p2}, LgA3;->c(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Landroid/util/Size;

    invoke-interface {p1, p2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/util/Size;

    return-object p1
.end method

.method public b([Landroid/util/Size;I)[Landroid/util/Size;
    .locals 0

    invoke-virtual {p0, p1, p2}, LgA3;->a([Landroid/util/Size;I)[Landroid/util/Size;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LgA3;->e([Landroid/util/Size;I)[Landroid/util/Size;

    move-result-object p1

    invoke-virtual {p0, p1}, LgA3;->d([Landroid/util/Size;)[Landroid/util/Size;

    move-result-object p1

    return-object p1
.end method

.method public final d([Landroid/util/Size;)[Landroid/util/Size;
    .locals 8

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, LgA3;->e:LPY5;

    iget-object v2, p0, LgA3;->a:Ljava/lang/String;

    iget-object v3, p0, LgA3;->b:LWa0;

    invoke-virtual {v1, v2, v3}, LPY5;->a(Ljava/lang/String;LWa0;)I

    move-result v1

    if-eqz v1, :cond_3

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    move-object v2, v0

    goto :goto_0

    :cond_1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v2, LTp0;

    invoke-direct {v2}, LTp0;-><init>()V

    invoke-static {v1, v2}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Size;

    new-instance v2, Landroid/util/Rational;

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v3

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v1

    invoke-direct {v2, v3, v1}, Landroid/util/Rational;-><init>(II)V

    goto :goto_0

    :cond_2
    sget-object v2, LJo;->c:Landroid/util/Rational;

    goto :goto_0

    :cond_3
    sget-object v2, LJo;->a:Landroid/util/Rational;

    :goto_0
    if-nez v2, :cond_4

    return-object p1

    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v3, p1

    const/4 v4, 0x0

    move v5, v4

    :goto_1
    if-ge v5, v3, :cond_6

    aget-object v6, p1, v5

    invoke-static {v6, v2}, LJo;->a(Landroid/util/Size;Landroid/util/Rational;)Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_6
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_7

    return-object v0

    :cond_7
    new-array p1, v4, [Landroid/util/Size;

    invoke-interface {v1, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/util/Size;

    return-object p1
.end method

.method public final e([Landroid/util/Size;I)[Landroid/util/Size;
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, LgA3;->d:Lxh1;

    invoke-virtual {v1, p2}, Lxh1;->a(I)Ljava/util/List;

    move-result-object p2

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v1, p2}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    return-object v0

    :cond_1
    const/4 p1, 0x0

    new-array p1, p1, [Landroid/util/Size;

    invoke-interface {v1, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/util/Size;

    return-object p1
.end method
