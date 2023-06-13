.class public final LTi2;
.super Lyi2;
.source "SourceFile"


# instance fields
.field public final b:LUr2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LUr2<",
            "Ljava/lang/String;",
            "Lyi2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lyi2;-><init>()V

    new-instance v0, LUr2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LUr2;-><init>(Z)V

    iput-object v0, p0, LTi2;->b:LUr2;

    return-void
.end method


# virtual methods
.method public entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Lyi2;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LTi2;->b:LUr2;

    invoke-virtual {v0}, LUr2;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_1

    instance-of v0, p1, LTi2;

    if-eqz v0, :cond_0

    check-cast p1, LTi2;

    iget-object p1, p1, LTi2;->b:LUr2;

    iget-object v0, p0, LTi2;->b:LUr2;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LTi2;->b:LUr2;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public w(Ljava/lang/String;Lyi2;)V
    .locals 1

    iget-object v0, p0, LTi2;->b:LUr2;

    if-nez p2, :cond_0

    sget-object p2, LQi2;->b:LQi2;

    :cond_0
    invoke-virtual {v0, p1, p2}, LUr2;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public x(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-nez p2, :cond_0

    sget-object p2, LQi2;->b:LQi2;

    goto :goto_0

    :cond_0
    new-instance v0, LZi2;

    invoke-direct {v0, p2}, LZi2;-><init>(Ljava/lang/String;)V

    move-object p2, v0

    :goto_0
    invoke-virtual {p0, p1, p2}, LTi2;->w(Ljava/lang/String;Lyi2;)V

    return-void
.end method

.method public y(Ljava/lang/String;)Lyi2;
    .locals 1

    iget-object v0, p0, LTi2;->b:LUr2;

    invoke-virtual {v0, p1}, LUr2;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lyi2;

    return-object p1
.end method

.method public z(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, LTi2;->b:LUr2;

    invoke-virtual {v0, p1}, LUr2;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
