.class public LcY0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsd3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LcY0$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Number;)Z
    .locals 1

    invoke-static {p1}, LcY0$a;->d(Ljava/lang/Number;)LcY0$a;

    move-result-object v0

    invoke-static {v0}, LcY0$a;->b(LcY0$a;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, LcY0;->b(Ljava/lang/Number;Ljava/lang/Number;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public b(Ljava/lang/Number;Ljava/lang/Number;)I
    .locals 4

    invoke-static {p1}, LcY0$a;->d(Ljava/lang/Number;)LcY0$a;

    move-result-object v0

    invoke-static {p2}, LcY0$a;->d(Ljava/lang/Number;)LcY0$a;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    if-le v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {p0, v1, p2, v0, p1}, LcY0;->n(LcY0$a;Ljava/lang/Number;LcY0$a;Ljava/lang/Number;)I

    move-result p1

    neg-int p1, p1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v0, p1, v1, p2}, LcY0;->n(LcY0$a;Ljava/lang/Number;LcY0$a;Ljava/lang/Number;)I

    move-result p1

    :goto_1
    return p1
.end method

.method public c(Ljava/lang/Number;)Z
    .locals 1

    invoke-static {p1}, LcY0$a;->d(Ljava/lang/Number;)LcY0$a;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, LcY0;->p(LcY0$a;Ljava/lang/Number;)Z

    move-result p1

    return p1
.end method

.method public d(Ljava/lang/Number;)Ljava/lang/Number;
    .locals 6

    instance-of v0, p1, Ljava/lang/Integer;

    if-nez v0, :cond_a

    instance-of v0, p1, Ljava/util/concurrent/atomic/AtomicInteger;

    if-nez v0, :cond_a

    instance-of v0, p1, Ljava/lang/Short;

    if-nez v0, :cond_a

    instance-of v0, p1, Ljava/lang/Byte;

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, Ljava/lang/Double;

    if-nez v0, :cond_7

    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, LcY0;->q(Ljava/lang/Number;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0, p1}, LcY0;->m(Ljava/lang/Number;)I

    move-result v0

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_2
    const/16 v1, 0x3f

    if-ge v0, v1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    :cond_3
    return-object p1

    :cond_4
    instance-of v0, p1, Ljava/math/BigDecimal;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Ljava/math/BigDecimal;

    :try_start_0
    invoke-virtual {v0}, Ljava/math/BigDecimal;->toBigIntegerExact()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p0, v0}, LcY0;->d(Ljava/lang/Number;)Ljava/lang/Number;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p1

    :cond_5
    instance-of v0, p1, Lqn4;

    if-eqz v0, :cond_6

    move-object v0, p1

    check-cast v0, Lqn4;

    invoke-virtual {v0}, Lqn4;->g()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Lqn4;->e()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p0, p1}, LcY0;->d(Ljava/lang/Number;)Ljava/lang/Number;

    move-result-object p1

    :cond_6
    return-object p1

    :cond_7
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isFinite(D)Z

    move-result v2

    if-eqz v2, :cond_9

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    rem-double v2, v0, v2

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-nez v2, :cond_8

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {p0, p1}, LcY0;->d(Ljava/lang/Number;)Ljava/lang/Number;

    move-result-object p1

    :cond_8
    return-object p1

    :cond_9
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-virtual {p0, p1}, LcY0;->u(Ljava/lang/Number;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_a
    :goto_1
    return-object p1
.end method

.method public e(Ljava/lang/Number;)Z
    .locals 1

    invoke-static {p1}, LcY0$a;->d(Ljava/lang/Number;)LcY0$a;

    move-result-object v0

    invoke-static {v0}, LcY0$a;->a(LcY0$a;)Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, LcY0;->b(Ljava/lang/Number;Ljava/lang/Number;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f(Ljava/lang/Number;)Ljava/lang/Number;
    .locals 2

    invoke-virtual {p0, p1}, LcY0;->q(Ljava/lang/Number;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {p0, p1}, LcY0;->o(Ljava/lang/Number;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {v0, p1}, Lqn4;->m(Ljava/math/BigInteger;Ljava/math/BigInteger;)Lqn4;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Ljava/math/BigDecimal;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/math/BigDecimal;

    invoke-static {p1}, Lqn4;->l(Ljava/math/BigDecimal;)Lqn4;

    move-result-object p1

    invoke-virtual {p1}, Lqn4;->q()Lqn4;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Lqn4;

    if-eqz v0, :cond_2

    check-cast p1, Lqn4;

    invoke-virtual {p1}, Lqn4;->q()Lqn4;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_3

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lqn4;->j(D)Lqn4;

    move-result-object p1

    invoke-virtual {p1}, Lqn4;->q()Lqn4;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lqn4;->j(D)Lqn4;

    move-result-object p1

    invoke-virtual {p1}, Lqn4;->q()Lqn4;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-virtual {p0, p1}, LcY0;->t(Ljava/lang/Number;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1
.end method

.method public g(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/Number;
    .locals 4

    invoke-static {p1}, LcY0$a;->d(Ljava/lang/Number;)LcY0$a;

    move-result-object v0

    invoke-static {p2}, LcY0$a;->d(Ljava/lang/Number;)LcY0$a;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    if-le v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {p0, v1, p2, v0, p1}, LcY0;->l(LcY0$a;Ljava/lang/Number;LcY0$a;Ljava/lang/Number;)Ljava/lang/Number;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v0, p1, v1, p2}, LcY0;->l(LcY0$a;Ljava/lang/Number;LcY0$a;Ljava/lang/Number;)Ljava/lang/Number;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public h(Ljava/lang/Number;)Ljava/lang/Number;
    .locals 4

    instance-of v0, p1, Ljava/math/BigInteger;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/math/BigInteger;

    invoke-virtual {p1}, Ljava/math/BigInteger;->abs()Ljava/math/BigInteger;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Ljava/math/BigDecimal;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/math/BigDecimal;

    invoke-virtual {p1}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Lqn4;

    if-eqz v0, :cond_2

    check-cast p1, Lqn4;

    invoke-virtual {p1}, Lqn4;->a()Lqn4;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_3

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_4

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of v0, p1, Ljava/lang/Long;

    if-nez v0, :cond_b

    instance-of v0, p1, Ljava/util/concurrent/atomic/AtomicLong;

    if-eqz v0, :cond_5

    goto :goto_1

    :cond_5
    instance-of v0, p1, Ljava/lang/Integer;

    if-nez v0, :cond_9

    instance-of v0, p1, Ljava/util/concurrent/atomic/AtomicInteger;

    if-eqz v0, :cond_6

    goto :goto_0

    :cond_6
    instance-of v0, p1, Ljava/lang/Short;

    if-nez v0, :cond_7

    instance-of v0, p1, Ljava/lang/Byte;

    if-eqz v0, :cond_8

    :cond_7
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    :cond_8
    invoke-virtual {p0, p1}, LcY0;->t(Ljava/lang/Number;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_9
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_a

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :cond_a
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_b
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long p1, v0, v2

    if-nez p1, :cond_c

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->abs()Ljava/math/BigInteger;

    move-result-object p1

    return-object p1

    :cond_c
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public i(Ljava/lang/Number;)I
    .locals 2

    instance-of v0, p1, Ljava/math/BigInteger;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/math/BigInteger;

    invoke-virtual {p1}, Ljava/math/BigInteger;->signum()I

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, Ljava/math/BigDecimal;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/math/BigDecimal;

    invoke-virtual {p1}, Ljava/math/BigDecimal;->signum()I

    move-result p1

    return p1

    :cond_1
    instance-of v0, p1, Lqn4;

    if-eqz v0, :cond_2

    check-cast p1, Lqn4;

    invoke-virtual {p1}, Lqn4;->r()I

    move-result p1

    return p1

    :cond_2
    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_3

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->signum(D)D

    move-result-wide v0

    double-to-int p1, v0

    return p1

    :cond_3
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_4

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result p1

    float-to-int p1, p1

    return p1

    :cond_4
    instance-of v0, p1, Ljava/lang/Long;

    if-nez v0, :cond_8

    instance-of v0, p1, Ljava/util/concurrent/atomic/AtomicLong;

    if-eqz v0, :cond_5

    goto :goto_1

    :cond_5
    instance-of v0, p1, Ljava/lang/Integer;

    if-nez v0, :cond_7

    instance-of v0, p1, Ljava/util/concurrent/atomic/AtomicInteger;

    if-nez v0, :cond_7

    instance-of v0, p1, Ljava/lang/Short;

    if-nez v0, :cond_7

    instance-of v0, p1, Ljava/lang/Byte;

    if-eqz v0, :cond_6

    goto :goto_0

    :cond_6
    invoke-virtual {p0, p1}, LcY0;->t(Ljava/lang/Number;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_7
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->signum(I)I

    move-result p1

    return p1

    :cond_8
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->signum(J)I

    move-result p1

    return p1
.end method

.method public j(Ljava/lang/Number;)Ljava/lang/Number;
    .locals 4

    instance-of v0, p1, Ljava/math/BigInteger;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/math/BigInteger;

    invoke-virtual {p1}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Ljava/math/BigDecimal;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/math/BigDecimal;

    invoke-virtual {p1}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Lqn4;

    if-eqz v0, :cond_2

    check-cast p1, Lqn4;

    invoke-virtual {p1}, Lqn4;->i()Lqn4;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_3

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    neg-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_4

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    neg-float p1, p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of v0, p1, Ljava/lang/Long;

    if-nez v0, :cond_d

    instance-of v0, p1, Ljava/util/concurrent/atomic/AtomicLong;

    if-eqz v0, :cond_5

    goto :goto_1

    :cond_5
    instance-of v0, p1, Ljava/lang/Integer;

    if-nez v0, :cond_b

    instance-of v0, p1, Ljava/util/concurrent/atomic/AtomicInteger;

    if-eqz v0, :cond_6

    goto :goto_0

    :cond_6
    instance-of v0, p1, Ljava/lang/Short;

    if-eqz v0, :cond_8

    move-object v0, p1

    check-cast v0, Ljava/lang/Short;

    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    move-result v0

    const/16 v1, -0x8000

    if-ne v0, v1, :cond_7

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    neg-int p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_7
    neg-int p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of v0, p1, Ljava/lang/Byte;

    if-eqz v0, :cond_a

    move-object v0, p1

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    int-to-short v0, v0

    const/16 v1, -0x80

    if-ne v0, v1, :cond_9

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    neg-int p1, p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_9
    neg-int p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_a
    invoke-virtual {p0, p1}, LcY0;->t(Ljava/lang/Number;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_b
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_c

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    neg-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :cond_c
    neg-int p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_d
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long p1, v0, v2

    if-nez p1, :cond_e

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object p1

    return-object p1

    :cond_e
    neg-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public k(Ljava/lang/Number;I)Ljava/lang/Number;
    .locals 1

    const/4 v0, 0x1

    if-nez p2, :cond_1

    invoke-virtual {p0, p1}, LcY0;->e(Ljava/lang/Number;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    const-string p2, "0^0 is not defined"

    invoke-direct {p1, p2}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    if-ne p2, v0, :cond_2

    return-object p1

    :cond_2
    instance-of v0, p1, Ljava/math/BigInteger;

    if-nez v0, :cond_8

    instance-of v0, p1, Ljava/lang/Long;

    if-nez v0, :cond_8

    instance-of v0, p1, Ljava/util/concurrent/atomic/AtomicLong;

    if-nez v0, :cond_8

    instance-of v0, p1, Ljava/lang/Integer;

    if-nez v0, :cond_8

    instance-of v0, p1, Ljava/util/concurrent/atomic/AtomicInteger;

    if-nez v0, :cond_8

    instance-of v0, p1, Ljava/lang/Short;

    if-nez v0, :cond_8

    instance-of v0, p1, Ljava/lang/Byte;

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    instance-of v0, p1, Ljava/math/BigDecimal;

    if-eqz v0, :cond_4

    check-cast p1, Ljava/math/BigDecimal;

    sget-object v0, Lt80;->c:Ljava/math/MathContext;

    invoke-virtual {p1, p2, v0}, Ljava/math/BigDecimal;->pow(ILjava/math/MathContext;)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of v0, p1, Lqn4;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lqn4;

    invoke-virtual {v0, p2}, Lqn4;->p(I)Lqn4;

    :cond_5
    instance-of v0, p1, Ljava/lang/Double;

    if-nez v0, :cond_7

    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_6

    goto :goto_0

    :cond_6
    invoke-virtual {p0, p1}, LcY0;->t(Ljava/lang/Number;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_7
    :goto_0
    invoke-virtual {p0, p1}, LcY0;->r(Ljava/lang/Number;)Ljava/math/BigDecimal;

    move-result-object p1

    sget-object v0, Lt80;->c:Ljava/math/MathContext;

    invoke-virtual {p1, p2, v0}, Ljava/math/BigDecimal;->pow(ILjava/math/MathContext;)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1

    :cond_8
    :goto_1
    invoke-virtual {p0, p1}, LcY0;->o(Ljava/lang/Number;)Ljava/math/BigInteger;

    move-result-object p1

    if-lez p2, :cond_9

    invoke-virtual {p1, p2}, Ljava/math/BigInteger;->pow(I)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1

    :cond_9
    invoke-static {p1}, Lqn4;->o(Ljava/math/BigInteger;)Lqn4;

    move-result-object p1

    invoke-virtual {p1, p2}, Lqn4;->p(I)Lqn4;

    move-result-object p1

    return-object p1
.end method

.method public final l(LcY0$a;Ljava/lang/Number;LcY0$a;Ljava/lang/Number;)Ljava/lang/Number;
    .locals 0

    invoke-virtual {p1}, LcY0$a;->c()Z

    move-result p1

    if-eqz p1, :cond_2

    instance-of p1, p2, Ljava/math/BigInteger;

    if-eqz p1, :cond_0

    check-cast p2, Ljava/math/BigInteger;

    invoke-virtual {p0, p4}, LcY0;->o(Ljava/lang/Number;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p2}, LcY0;->m(Ljava/lang/Number;)I

    move-result p1

    invoke-virtual {p0, p4}, LcY0;->m(Ljava/lang/Number;)I

    move-result p3

    invoke-static {p1, p3}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    const/16 p3, 0x3f

    if-ge p1, p3, :cond_1

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    invoke-virtual {p4}, Ljava/lang/Number;->longValue()J

    move-result-wide p3

    add-long/2addr p1, p3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p0, p2}, LcY0;->o(Ljava/lang/Number;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p0, p4}, LcY0;->o(Ljava/lang/Number;)Ljava/math/BigInteger;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, p2, Lqn4;

    if-eqz p1, :cond_4

    instance-of p1, p4, Lqn4;

    if-eqz p1, :cond_3

    check-cast p2, Lqn4;

    check-cast p4, Lqn4;

    invoke-virtual {p2, p4}, Lqn4;->b(Lqn4;)Lqn4;

    move-result-object p1

    return-object p1

    :cond_3
    check-cast p2, Lqn4;

    invoke-virtual {p0, p4}, LcY0;->o(Ljava/lang/Number;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {p1}, Lqn4;->o(Ljava/math/BigInteger;)Lqn4;

    move-result-object p1

    invoke-virtual {p2, p1}, Lqn4;->b(Lqn4;)Lqn4;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, p2, Ljava/math/BigDecimal;

    if-eqz p1, :cond_9

    instance-of p1, p4, Ljava/math/BigDecimal;

    if-eqz p1, :cond_5

    check-cast p2, Ljava/math/BigDecimal;

    check-cast p4, Ljava/math/BigDecimal;

    sget-object p1, Lt80;->c:Ljava/math/MathContext;

    invoke-virtual {p2, p4, p1}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;Ljava/math/MathContext;)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of p1, p4, Ljava/lang/Double;

    if-nez p1, :cond_8

    instance-of p1, p4, Ljava/lang/Float;

    if-eqz p1, :cond_6

    goto :goto_0

    :cond_6
    instance-of p1, p4, Lqn4;

    if-eqz p1, :cond_7

    check-cast p2, Ljava/math/BigDecimal;

    check-cast p4, Lqn4;

    invoke-virtual {p4}, Lqn4;->c()Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1

    :cond_7
    check-cast p2, Ljava/math/BigDecimal;

    invoke-virtual {p4}, Ljava/lang/Number;->longValue()J

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1

    :cond_8
    :goto_0
    check-cast p2, Ljava/math/BigDecimal;

    invoke-virtual {p4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object p1

    sget-object p3, Lt80;->c:Ljava/math/MathContext;

    invoke-virtual {p2, p1, p3}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;Ljava/math/MathContext;)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1

    :cond_9
    instance-of p1, p4, Ljava/lang/Double;

    if-nez p1, :cond_d

    instance-of p1, p4, Ljava/lang/Float;

    if-eqz p1, :cond_a

    goto :goto_1

    :cond_a
    instance-of p1, p4, Lqn4;

    if-eqz p1, :cond_b

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object p1

    check-cast p4, Lqn4;

    invoke-virtual {p4}, Lqn4;->c()Ljava/math/BigDecimal;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1

    :cond_b
    instance-of p1, p4, Ljava/math/BigInteger;

    if-eqz p1, :cond_c

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object p1

    new-instance p2, Ljava/math/BigDecimal;

    check-cast p4, Ljava/math/BigInteger;

    invoke-direct {p2, p4}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1

    :cond_c
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {p4}, Ljava/lang/Number;->longValue()J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1

    :cond_d
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {p4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1
.end method

.method public final m(Ljava/lang/Number;)I
    .locals 4

    instance-of v0, p1, Ljava/math/BigInteger;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/math/BigInteger;

    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long p1, v0, v2

    if-nez p1, :cond_1

    const/16 p1, 0x3f

    return p1

    :cond_1
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result p1

    rsub-int/lit8 p1, p1, 0x40

    return p1
.end method

.method public final n(LcY0$a;Ljava/lang/Number;LcY0$a;Ljava/lang/Number;)I
    .locals 0

    invoke-virtual {p1}, LcY0$a;->c()Z

    move-result p1

    if-eqz p1, :cond_1

    instance-of p1, p2, Ljava/math/BigInteger;

    if-eqz p1, :cond_0

    check-cast p2, Ljava/math/BigInteger;

    invoke-virtual {p0, p4}, LcY0;->o(Ljava/lang/Number;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    invoke-virtual {p4}, Ljava/lang/Number;->longValue()J

    move-result-wide p3

    invoke-static {p1, p2, p3, p4}, Ljava/lang/Long;->compare(JJ)I

    move-result p1

    return p1

    :cond_1
    instance-of p1, p2, Lqn4;

    if-eqz p1, :cond_3

    instance-of p1, p4, Lqn4;

    if-eqz p1, :cond_2

    check-cast p2, Lqn4;

    check-cast p4, Lqn4;

    invoke-virtual {p2, p4}, Lqn4;->d(Lqn4;)I

    move-result p1

    return p1

    :cond_2
    check-cast p2, Lqn4;

    invoke-virtual {p0, p4}, LcY0;->o(Ljava/lang/Number;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {p1}, Lqn4;->o(Ljava/math/BigInteger;)Lqn4;

    move-result-object p1

    invoke-virtual {p2, p1}, Lqn4;->d(Lqn4;)I

    move-result p1

    return p1

    :cond_3
    instance-of p1, p2, Ljava/math/BigDecimal;

    if-eqz p1, :cond_8

    instance-of p1, p4, Ljava/math/BigDecimal;

    if-eqz p1, :cond_4

    check-cast p2, Ljava/math/BigDecimal;

    check-cast p4, Ljava/math/BigDecimal;

    invoke-virtual {p2, p4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p1

    return p1

    :cond_4
    instance-of p1, p4, Ljava/lang/Double;

    if-nez p1, :cond_7

    instance-of p1, p4, Ljava/lang/Float;

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_5
    instance-of p1, p4, Lqn4;

    if-eqz p1, :cond_6

    check-cast p2, Ljava/math/BigDecimal;

    check-cast p4, Lqn4;

    invoke-virtual {p4}, Lqn4;->c()Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p1

    return p1

    :cond_6
    check-cast p2, Ljava/math/BigDecimal;

    invoke-virtual {p4}, Ljava/lang/Number;->longValue()J

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p1

    return p1

    :cond_7
    :goto_0
    check-cast p2, Ljava/math/BigDecimal;

    invoke-virtual {p4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p1

    return p1

    :cond_8
    instance-of p1, p4, Ljava/lang/Double;

    if-nez p1, :cond_c

    instance-of p1, p4, Ljava/lang/Float;

    if-eqz p1, :cond_9

    goto :goto_1

    :cond_9
    instance-of p1, p4, Lqn4;

    if-eqz p1, :cond_a

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object p1

    check-cast p4, Lqn4;

    invoke-virtual {p4}, Lqn4;->c()Ljava/math/BigDecimal;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p1

    return p1

    :cond_a
    instance-of p1, p4, Ljava/math/BigInteger;

    if-eqz p1, :cond_b

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object p1

    new-instance p2, Ljava/math/BigDecimal;

    check-cast p4, Ljava/math/BigInteger;

    invoke-direct {p2, p4}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p1

    return p1

    :cond_b
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {p4}, Ljava/lang/Number;->longValue()J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result p1

    return p1

    :cond_c
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p1

    invoke-virtual {p4}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p3

    invoke-static {p1, p2, p3, p4}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    return p1
.end method

.method public final o(Ljava/lang/Number;)Ljava/math/BigInteger;
    .locals 2

    instance-of v0, p1, Ljava/math/BigInteger;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/math/BigInteger;

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p1

    return-object p1
.end method

.method public final p(LcY0$a;Ljava/lang/Number;)Z
    .locals 4

    invoke-virtual {p1}, LcY0$a;->c()Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p2, Lqn4;

    if-eqz p1, :cond_1

    check-cast p2, Lqn4;

    invoke-virtual {p2}, Lqn4;->g()Z

    move-result p1

    return p1

    :cond_1
    instance-of p1, p2, Ljava/math/BigDecimal;

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    check-cast p2, Ljava/math/BigDecimal;

    invoke-virtual {p2}, Ljava/math/BigDecimal;->scale()I

    move-result p1

    if-gtz p1, :cond_2

    return v0

    :cond_2
    :try_start_0
    invoke-virtual {p2}, Ljava/math/BigDecimal;->toBigIntegerExact()Ljava/math/BigInteger;
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    return v1

    :cond_3
    instance-of p1, p2, Ljava/lang/Double;

    if-nez p1, :cond_5

    instance-of p1, p2, Ljava/lang/Float;

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {p0, p2}, LcY0;->t(Ljava/lang/Number;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_5
    :goto_0
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p1

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    rem-double/2addr p1, v2

    const-wide/16 v2, 0x0

    cmpl-double p1, p1, v2

    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    move v0, v1

    :goto_1
    return v0
.end method

.method public final q(Ljava/lang/Number;)Z
    .locals 0

    invoke-static {p1}, LcY0$a;->d(Ljava/lang/Number;)LcY0$a;

    move-result-object p1

    invoke-virtual {p1}, LcY0$a;->c()Z

    move-result p1

    return p1
.end method

.method public final r(Ljava/lang/Number;)Ljava/math/BigDecimal;
    .locals 2

    instance-of v0, p1, Ljava/math/BigDecimal;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/math/BigDecimal;

    return-object p1

    :cond_0
    instance-of v0, p1, Ljava/math/BigInteger;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/math/BigDecimal;

    check-cast p1, Ljava/math/BigInteger;

    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Ljava/lang/Long;

    if-nez v0, :cond_6

    instance-of v0, p1, Ljava/util/concurrent/atomic/AtomicLong;

    if-nez v0, :cond_6

    instance-of v0, p1, Ljava/lang/Integer;

    if-nez v0, :cond_6

    instance-of v0, p1, Ljava/util/concurrent/atomic/AtomicInteger;

    if-nez v0, :cond_6

    instance-of v0, p1, Ljava/lang/Short;

    if-nez v0, :cond_6

    instance-of v0, p1, Ljava/lang/Byte;

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    instance-of v0, p1, Ljava/lang/Double;

    if-nez v0, :cond_5

    instance-of v0, p1, Ljava/lang/Float;

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    instance-of v0, p1, Lqn4;

    if-eqz v0, :cond_4

    invoke-virtual {p0}, LcY0;->s()Ljava/lang/IllegalStateException;

    move-result-object p1

    throw p1

    :cond_4
    invoke-virtual {p0, p1}, LcY0;->t(Ljava/lang/Number;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_5
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object p1

    return-object p1
.end method

.method public final s()Ljava/lang/IllegalStateException;
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Implementation Error: Code was reached that is expected unreachable"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    return-object v1
.end method

.method public final t(Ljava/lang/Number;)Ljava/lang/IllegalArgumentException;
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const-string p1, "Unsupported number type \'%s\' in number system \'%s\'"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final u(Ljava/lang/Number;)Ljava/lang/IllegalArgumentException;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x2

    aput-object p1, v0, v1

    const-string p1, "Unsupported number value \'%s\' of type \'%s\' in number system \'%s\'"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
