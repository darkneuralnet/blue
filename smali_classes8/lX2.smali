.class public interface abstract LlX2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lae6;
.implements LNj6;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lae6;",
        "LNj6<",
        "Ljava/lang/Number;",
        ">;",
        "Ljava/lang/Comparable<",
        "Lae6;",
        ">;"
    }
.end annotation


# direct methods
.method public static M2(Ljava/lang/Number;)LlX2;
    .locals 3

    invoke-static {}, Lt80;->c()Lsd3;

    move-result-object v0

    invoke-interface {v0, p0}, Lsd3;->a(Ljava/lang/Number;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, LlX2;->identity()LlX2;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {v0, p0}, Lsd3;->d(Ljava/lang/Number;)Ljava/lang/Number;

    move-result-object p0

    instance-of v1, p0, Lqn4;

    if-eqz v1, :cond_1

    check-cast p0, Lqn4;

    invoke-static {p0}, LlX2;->a1(Lqn4;)LlX2;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-interface {v0, p0}, Lsd3;->c(Ljava/lang/Number;)Z

    move-result v1

    const-string v2, "not yet supported"

    if-eqz v1, :cond_4

    instance-of v1, p0, Ljava/math/BigInteger;

    if-eqz v1, :cond_2

    check-cast p0, Ljava/math/BigInteger;

    invoke-static {p0}, Lqn4;->o(Ljava/math/BigInteger;)Lqn4;

    move-result-object p0

    invoke-static {p0}, LlX2;->a1(Lqn4;)LlX2;

    move-result-object p0

    return-object p0

    :cond_2
    instance-of v0, v0, LcY0;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lqn4;->n(J)Lqn4;

    move-result-object p0

    invoke-static {p0}, LlX2;->a1(Lqn4;)LlX2;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p0, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    instance-of v0, p0, Ljava/lang/Double;

    if-nez v0, :cond_7

    instance-of v0, p0, Ljava/lang/Float;

    if-eqz v0, :cond_5

    goto :goto_0

    :cond_5
    instance-of v0, p0, Ljava/math/BigDecimal;

    if-eqz v0, :cond_6

    check-cast p0, Ljava/math/BigDecimal;

    invoke-static {p0}, Lqn4;->l(Ljava/math/BigDecimal;)Lqn4;

    move-result-object p0

    invoke-static {p0}, LlX2;->a1(Lqn4;)LlX2;

    move-result-object p0

    return-object p0

    :cond_6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p0, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, LlX2;->t0(D)LlX2;

    move-result-object p0

    return-object p0
.end method

.method public static a1(Lqn4;)LlX2;
    .locals 1

    sget-object v0, Lqn4;->m:Lqn4;

    invoke-virtual {p0, v0}, Lqn4;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LlX2;->identity()LlX2;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lpn4;->p(Lqn4;)Lpn4;

    move-result-object p0

    return-object p0
.end method

.method public static identity()LlX2;
    .locals 1

    sget-object v0, LmW1;->b:LmW1;

    return-object v0
.end method

.method public static l1(JJ)LlX2;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lqn4;->k(JJ)Lqn4;

    move-result-object p0

    invoke-static {p0}, LlX2;->a1(Lqn4;)LlX2;

    move-result-object p0

    return-object p0
.end method

.method public static t0(D)LlX2;
    .locals 2

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpl-double v0, p0, v0

    if-nez v0, :cond_0

    invoke-static {}, LlX2;->identity()LlX2;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0, p1}, Lqn4;->j(D)Lqn4;

    move-result-object p0

    invoke-static {p0}, LlX2;->a1(Lqn4;)LlX2;

    move-result-object p0

    return-object p0
.end method

.method public static w0(LWZ3;)LlX2;
    .locals 2

    if-nez p0, :cond_0

    invoke-static {}, LlX2;->identity()LlX2;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, LWZ3;->b()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-interface {p0}, LWZ3;->getValue()Ljava/lang/Number;

    move-result-object p0

    invoke-static {p0}, LlX2;->M2(Ljava/lang/Number;)LlX2;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {}, Lt80;->c()Lsd3;

    move-result-object v0

    invoke-interface {p0}, LWZ3;->getValue()Ljava/lang/Number;

    move-result-object v1

    invoke-interface {v0, v1}, Lsd3;->c(Ljava/lang/Number;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {p0}, LWZ3;->getValue()Ljava/lang/Number;

    move-result-object v1

    invoke-interface {p0}, LWZ3;->b()I

    move-result p0

    invoke-interface {v0, v1, p0}, Lsd3;->k(Ljava/lang/Number;I)Ljava/lang/Number;

    move-result-object p0

    invoke-static {p0}, LlX2;->M2(Ljava/lang/Number;)LlX2;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {p0}, LUY3;->p(LWZ3;)LUY3;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public D()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public Y2()Ljava/lang/Number;
    .locals 1

    invoke-interface {p0}, LNj6;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    return-object v0
.end method
