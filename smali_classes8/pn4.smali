.class public final Lpn4;
.super Lo0;
.source "SourceFile"

# interfaces
.implements LlX2;


# static fields
.field private static final serialVersionUID:J = -0x7f915e44a4ab05e0L


# instance fields
.field public final e:Lqn4;


# direct methods
.method public constructor <init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V
    .locals 0

    invoke-direct {p0}, Lo0;-><init>()V

    invoke-static {p1, p2}, Lqn4;->m(Ljava/math/BigInteger;Ljava/math/BigInteger;)Lqn4;

    move-result-object p1

    iput-object p1, p0, Lpn4;->e:Lqn4;

    return-void
.end method

.method public constructor <init>(Lqn4;)V
    .locals 0

    invoke-direct {p0}, Lo0;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lpn4;->e:Lqn4;

    return-void
.end method

.method public static p(Lqn4;)Lpn4;
    .locals 1

    new-instance v0, Lpn4;

    invoke-direct {v0, p0}, Lpn4;-><init>(Lqn4;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lae6;

    invoke-virtual {p0, p1}, Lpn4;->j(Lae6;)I

    move-result p1

    return p1
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Lpn4;->e:Lqn4;

    sget-object v1, Lqn4;->m:Lqn4;

    invoke-virtual {v0, v1}, Lqn4;->d(Lqn4;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e(Lo0;)Z
    .locals 1

    instance-of v0, p1, Lpn4;

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of p1, p1, LUY3;

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lpn4;

    if-eqz v0, :cond_1

    check-cast p1, Lpn4;

    iget-object v0, p0, Lpn4;->e:Lqn4;

    iget-object p1, p1, Lpn4;->e:Lqn4;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic g()Lo0;
    .locals 1

    invoke-virtual {p0}, Lpn4;->o()Lpn4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lpn4;->n()Ljava/lang/Number;

    move-result-object v0

    return-object v0
.end method

.method public h(Lo0;)Lo0;
    .locals 3

    instance-of v0, p1, Lpn4;

    if-eqz v0, :cond_0

    check-cast p1, Lpn4;

    invoke-virtual {p0, p1}, Lpn4;->k(Lpn4;)Lo0;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, LUY3;

    if-eqz v0, :cond_1

    check-cast p1, LUY3;

    invoke-virtual {p1}, LUY3;->r()Lpn4;

    move-result-object p1

    invoke-virtual {p0, p1}, Lpn4;->k(Lpn4;)Lo0;

    move-result-object p1

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

    iget-object v0, p0, Lpn4;->e:Lqn4;

    invoke-virtual {v0}, Lqn4;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lpn4;->e:Lqn4;

    aput-object v2, v0, v1

    const-string v1, "x -> x * %s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public j(Lae6;)I
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    instance-of v0, p1, Lpn4;

    if-eqz v0, :cond_1

    check-cast p1, Lpn4;

    iget-object v0, p0, Lpn4;->e:Lqn4;

    iget-object p1, p1, Lpn4;->e:Lqn4;

    invoke-virtual {v0, p1}, Lqn4;->d(Lqn4;)I

    move-result p1

    return p1

    :cond_1
    const-class v0, Lpn4;

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

.method public final k(Lpn4;)Lo0;
    .locals 3

    invoke-virtual {p0}, Lpn4;->l()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p1}, Lpn4;->l()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p0}, Lpn4;->m()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {p1}, Lpn4;->m()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->gcd(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p1, v1}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    sget-object v1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Lo0;->c:Lo0;

    goto :goto_0

    :cond_0
    new-instance v1, Lpn4;

    invoke-direct {v1, v0, p1}, Lpn4;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    move-object p1, v1

    :goto_0
    return-object p1
.end method

.method public l()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lpn4;->e:Lqn4;

    invoke-virtual {v0}, Lqn4;->e()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public m()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lpn4;->e:Lqn4;

    invoke-virtual {v0}, Lqn4;->f()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public n()Ljava/lang/Number;
    .locals 1

    iget-object v0, p0, Lpn4;->e:Lqn4;

    return-object v0
.end method

.method public o()Lpn4;
    .locals 1

    iget-object v0, p0, Lpn4;->e:Lqn4;

    invoke-virtual {v0}, Lqn4;->q()Lqn4;

    move-result-object v0

    invoke-static {v0}, Lpn4;->p(Lqn4;)Lpn4;

    move-result-object v0

    return-object v0
.end method
