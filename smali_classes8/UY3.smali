.class public final LUY3;
.super Lo0;
.source "SourceFile"

# interfaces
.implements LlX2;


# static fields
.field private static final serialVersionUID:J = 0x31393bdcf2196764L


# instance fields
.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:Lqn4;


# direct methods
.method public constructor <init>(II)V
    .locals 2

    invoke-direct {p0}, Lo0;-><init>()V

    if-eqz p1, :cond_0

    iput p1, p0, LUY3;->e:I

    iput p2, p0, LUY3;->f:I

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v1

    const/4 p1, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v0, p1

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, LUY3;->g:I

    invoke-virtual {p0}, LUY3;->j()Lqn4;

    move-result-object p1

    iput-object p1, p0, LUY3;->h:Lqn4;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "base cannot be zero (because 0^0 is undefined)"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static p(LWZ3;)LUY3;
    .locals 1

    invoke-interface {p0}, LWZ3;->getValue()Ljava/lang/Number;

    move-result-object v0

    invoke-interface {p0}, LWZ3;->b()I

    move-result p0

    invoke-static {v0, p0}, LUY3;->q(Ljava/lang/Number;I)LUY3;

    move-result-object p0

    return-object p0
.end method

.method public static q(Ljava/lang/Number;I)LUY3;
    .locals 1

    new-instance v0, LUY3;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-direct {v0, p0, p1}, LUY3;-><init>(II)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lae6;

    invoke-virtual {p0, p1}, LUY3;->k(Lae6;)I

    move-result p1

    return p1
.end method

.method public d()Z
    .locals 2

    iget v0, p0, LUY3;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    iget v0, p0, LUY3;->f:I

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public e(Lo0;)Z
    .locals 1

    instance-of v0, p1, LUY3;

    if-eqz v0, :cond_1

    check-cast p1, LUY3;

    iget p1, p1, LUY3;->e:I

    iget v0, p0, LUY3;->e:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_1
    instance-of p1, p1, Lpn4;

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lae6;

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Lae6;

    invoke-virtual {p0}, LUY3;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Lae6;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    :cond_1
    instance-of v1, p1, LUY3;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    check-cast p1, LUY3;

    iget v1, p0, LUY3;->e:I

    iget v3, p1, LUY3;->e:I

    if-ne v1, v3, :cond_2

    iget v1, p0, LUY3;->f:I

    iget p1, p1, LUY3;->f:I

    if-ne v1, p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0

    :cond_3
    return v2
.end method

.method public g()Lo0;
    .locals 3

    new-instance v0, LUY3;

    iget v1, p0, LUY3;->e:I

    iget v2, p0, LUY3;->f:I

    neg-int v2, v2

    invoke-direct {v0, v1, v2}, LUY3;-><init>(II)V

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUY3;->o()Ljava/lang/Number;

    move-result-object v0

    return-object v0
.end method

.method public h(Lo0;)Lo0;
    .locals 3

    instance-of v0, p1, LUY3;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LUY3;

    iget v1, p0, LUY3;->e:I

    iget v2, v0, LUY3;->e:I

    if-ne v1, v2, :cond_0

    invoke-virtual {p0, v0}, LUY3;->l(LUY3;)LUY3;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lpn4;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LUY3;->r()Lpn4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo0;->c(Lae6;)Lae6;

    move-result-object p1

    check-cast p1, Lo0;

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string p1, "%s.simpleCompose() not handled for converter %s"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LUY3;->g:I

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 4

    iget v0, p0, LUY3;->e:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-gez v0, :cond_0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v2

    iget v0, p0, LUY3;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v1

    const-string v0, "x -> x * (%s)^%s"

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v2

    iget v0, p0, LUY3;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v1

    const-string v0, "x -> x * %s^%s"

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lqn4;
    .locals 2

    iget v0, p0, LUY3;->f:I

    if-nez v0, :cond_0

    sget-object v0, Lqn4;->m:Lqn4;

    return-object v0

    :cond_0
    iget v0, p0, LUY3;->e:I

    int-to-long v0, v0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    iget v1, p0, LUY3;->f:I

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->pow(I)Ljava/math/BigInteger;

    move-result-object v0

    iget v1, p0, LUY3;->f:I

    if-lez v1, :cond_1

    invoke-static {v0}, Lqn4;->o(Ljava/math/BigInteger;)Lqn4;

    move-result-object v0

    return-object v0

    :cond_1
    sget-object v1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-static {v1, v0}, Lqn4;->m(Ljava/math/BigInteger;Ljava/math/BigInteger;)Lqn4;

    move-result-object v0

    return-object v0
.end method

.method public k(Lae6;)I
    .locals 2

    const/4 v0, 0x0

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, LUY3;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Lae6;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    :cond_1
    instance-of v0, p1, LUY3;

    if-eqz v0, :cond_3

    check-cast p1, LUY3;

    iget v0, p0, LUY3;->e:I

    iget v1, p1, LUY3;->e:I

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_2

    return v0

    :cond_2
    iget v0, p0, LUY3;->f:I

    iget p1, p1, LUY3;->f:I

    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1

    :cond_3
    const-class v0, LUY3;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final l(LUY3;)LUY3;
    .locals 3

    new-instance v0, LUY3;

    iget v1, p0, LUY3;->e:I

    iget v2, p0, LUY3;->f:I

    iget p1, p1, LUY3;->f:I

    add-int/2addr v2, p1

    invoke-direct {v0, v1, v2}, LUY3;-><init>(II)V

    return-object v0
.end method

.method public m()I
    .locals 1

    iget v0, p0, LUY3;->e:I

    return v0
.end method

.method public n()I
    .locals 1

    iget v0, p0, LUY3;->f:I

    return v0
.end method

.method public o()Ljava/lang/Number;
    .locals 1

    iget-object v0, p0, LUY3;->h:Lqn4;

    return-object v0
.end method

.method public r()Lpn4;
    .locals 2

    new-instance v0, Lpn4;

    iget-object v1, p0, LUY3;->h:Lqn4;

    invoke-direct {v0, v1}, Lpn4;-><init>(Lqn4;)V

    return-object v0
.end method
