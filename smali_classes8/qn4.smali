.class public final Lqn4;
.super Ljava/lang/Number;
.source "SourceFile"


# static fields
.field public static k:C = '\u00f7'

.field public static final l:Lqn4;

.field public static final m:Lqn4;

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:I

.field public final e:Ljava/math/BigInteger;

.field public final f:Ljava/math/BigInteger;

.field public final g:I

.field public final h:Z

.field public transient i:Ljava/math/BigDecimal;

.field public transient j:Ljava/lang/Long;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-static {v0}, Lqn4;->o(Ljava/math/BigInteger;)Lqn4;

    move-result-object v0

    sput-object v0, Lqn4;->l:Lqn4;

    sget-object v0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-static {v0}, Lqn4;->o(Ljava/math/BigInteger;)Lqn4;

    move-result-object v0

    sput-object v0, Lqn4;->m:Lqn4;

    return-void
.end method

.method public constructor <init>(ILjava/math/BigInteger;Ljava/math/BigInteger;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Number;-><init>()V

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    iput-object v1, p0, Lqn4;->b:Ljava/lang/Object;

    new-array v1, v0, [Ljava/lang/Object;

    iput-object v1, p0, Lqn4;->c:Ljava/lang/Object;

    iput p1, p0, Lqn4;->d:I

    iput-object p2, p0, Lqn4;->e:Ljava/math/BigInteger;

    iput-object p3, p0, Lqn4;->f:Ljava/math/BigInteger;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v0

    const/4 p1, 0x1

    aput-object p2, v1, p1

    const/4 p1, 0x2

    aput-object p3, v1, p1

    invoke-static {v1}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lqn4;->g:I

    sget-object p1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {p1, p3}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Lqn4;->h:Z

    return-void
.end method

.method public static j(D)Lqn4;
    .locals 0

    invoke-static {p0, p1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    move-result-object p0

    invoke-static {p0}, Lqn4;->l(Ljava/math/BigDecimal;)Lqn4;

    move-result-object p0

    return-object p0
.end method

.method public static k(JJ)Lqn4;
    .locals 0

    invoke-static {p0, p1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p0

    invoke-static {p2, p3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {p0, p1}, Lqn4;->m(Ljava/math/BigInteger;Ljava/math/BigInteger;)Lqn4;

    move-result-object p0

    return-object p0
.end method

.method public static l(Ljava/math/BigDecimal;)Lqn4;
    .locals 2

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/math/BigDecimal;->scale()I

    move-result v0

    if-gtz v0, :cond_0

    invoke-virtual {p0}, Ljava/math/BigDecimal;->toBigIntegerExact()Ljava/math/BigInteger;

    move-result-object p0

    invoke-static {p0}, Lqn4;->o(Ljava/math/BigInteger;)Lqn4;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/math/BigDecimal;->unscaledValue()Ljava/math/BigInteger;

    move-result-object p0

    sget-object v1, Ljava/math/BigInteger;->TEN:Ljava/math/BigInteger;

    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->pow(I)Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {p0, v0}, Lqn4;->m(Ljava/math/BigInteger;Ljava/math/BigInteger;)Lqn4;

    move-result-object p0

    return-object p0
.end method

.method public static m(Ljava/math/BigInteger;Ljava/math/BigInteger;)Lqn4;
    .locals 3

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lqn4;->o(Ljava/math/BigInteger;)Lqn4;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Ljava/math/BigInteger;->signum()I

    move-result v0

    invoke-virtual {p1}, Ljava/math/BigInteger;->signum()I

    move-result v1

    mul-int/2addr v0, v1

    if-nez v0, :cond_1

    sget-object p0, Lqn4;->l:Lqn4;

    return-object p0

    :cond_1
    invoke-virtual {p0}, Ljava/math/BigInteger;->abs()Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p1}, Ljava/math/BigInteger;->abs()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->gcd(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    new-instance v2, Lqn4;

    invoke-virtual {p0, v1}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p1, v1}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-direct {v2, v0, p0, p1}, Lqn4;-><init>(ILjava/math/BigInteger;Ljava/math/BigInteger;)V

    return-object v2

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "cannot initalize a rational number with divisor equal to ZERO"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static n(J)Lqn4;
    .locals 0

    invoke-static {p0, p1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p0

    invoke-static {p0}, Lqn4;->o(Ljava/math/BigInteger;)Lqn4;

    move-result-object p0

    return-object p0
.end method

.method public static o(Ljava/math/BigInteger;)Lqn4;
    .locals 3

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lqn4;

    invoke-virtual {p0}, Ljava/math/BigInteger;->signum()I

    move-result v1

    invoke-virtual {p0}, Ljava/math/BigInteger;->abs()Ljava/math/BigInteger;

    move-result-object p0

    sget-object v2, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-direct {v0, v1, p0, v2}, Lqn4;-><init>(ILjava/math/BigInteger;Ljava/math/BigInteger;)V

    return-object v0
.end method


# virtual methods
.method public a()Lqn4;
    .locals 4

    iget v0, p0, Lqn4;->d:I

    if-gez v0, :cond_0

    new-instance v0, Lqn4;

    iget-object v1, p0, Lqn4;->e:Ljava/math/BigInteger;

    iget-object v2, p0, Lqn4;->f:Ljava/math/BigInteger;

    const/4 v3, 0x1

    invoke-direct {v0, v3, v1, v2}, Lqn4;-><init>(ILjava/math/BigInteger;Ljava/math/BigInteger;)V

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    return-object v0
.end method

.method public b(Lqn4;)Lqn4;
    .locals 5

    iget-object v0, p0, Lqn4;->e:Ljava/math/BigInteger;

    iget-object v1, p0, Lqn4;->f:Ljava/math/BigInteger;

    iget-object v2, p1, Lqn4;->e:Ljava/math/BigInteger;

    iget-object v3, p1, Lqn4;->f:Ljava/math/BigInteger;

    iget v4, p0, Lqn4;->d:I

    if-gez v4, :cond_0

    invoke-virtual {v0}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object v0

    :cond_0
    iget p1, p1, Lqn4;->d:I

    if-gez p1, :cond_1

    invoke-virtual {v2}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object v2

    :cond_1
    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v1, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {p1, v0}, Lqn4;->m(Ljava/math/BigInteger;Ljava/math/BigInteger;)Lqn4;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/math/BigDecimal;
    .locals 4

    iget-object v0, p0, Lqn4;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lqn4;->i:Ljava/math/BigDecimal;

    if-nez v1, :cond_0

    new-instance v1, Ljava/math/BigDecimal;

    iget-object v2, p0, Lqn4;->e:Ljava/math/BigInteger;

    invoke-direct {v1, v2}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    new-instance v2, Ljava/math/BigDecimal;

    iget-object v3, p0, Lqn4;->f:Ljava/math/BigInteger;

    invoke-direct {v2, v3}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    sget-object v3, Lt80;->c:Ljava/math/MathContext;

    invoke-virtual {v1, v2, v3}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;Ljava/math/MathContext;)Ljava/math/BigDecimal;

    move-result-object v1

    iput-object v1, p0, Lqn4;->i:Ljava/math/BigDecimal;

    iget v2, p0, Lqn4;->d:I

    if-gez v2, :cond_0

    invoke-virtual {v1}, Ljava/math/BigDecimal;->negate()Ljava/math/BigDecimal;

    move-result-object v1

    iput-object v1, p0, Lqn4;->i:Ljava/math/BigDecimal;

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lqn4;->i:Ljava/math/BigDecimal;

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public d(Lqn4;)I
    .locals 3

    iget v0, p0, Lqn4;->d:I

    iget v1, p1, Lqn4;->d:I

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    if-nez v0, :cond_1

    iget v0, p0, Lqn4;->d:I

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v0, p0, Lqn4;->e:Ljava/math/BigInteger;

    iget-object v1, p0, Lqn4;->f:Ljava/math/BigInteger;

    iget-object v2, p1, Lqn4;->e:Ljava/math/BigInteger;

    iget-object p1, p1, Lqn4;->f:Ljava/math/BigInteger;

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result p1

    iget v0, p0, Lqn4;->d:I

    if-lez v0, :cond_2

    goto :goto_0

    :cond_2
    neg-int p1, p1

    :goto_0
    return p1
.end method

.method public doubleValue()D
    .locals 2

    invoke-virtual {p0}, Lqn4;->c()Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public e()Ljava/math/BigInteger;
    .locals 1

    iget v0, p0, Lqn4;->d:I

    if-gez v0, :cond_0

    iget-object v0, p0, Lqn4;->e:Ljava/math/BigInteger;

    invoke-virtual {v0}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqn4;->e:Ljava/math/BigInteger;

    :goto_0
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lqn4;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lqn4;

    invoke-virtual {p0}, Lqn4;->c()Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {p1}, Lqn4;->c()Ljava/math/BigDecimal;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f()Ljava/math/BigInteger;
    .locals 1

    iget-object v0, p0, Lqn4;->f:Ljava/math/BigInteger;

    return-object v0
.end method

.method public floatValue()F
    .locals 2

    invoke-virtual {p0}, Lqn4;->doubleValue()D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lqn4;->h:Z

    return v0
.end method

.method public final h(ZC)Ljava/lang/String;
    .locals 1

    iget v0, p0, Lqn4;->d:I

    if-nez v0, :cond_0

    const-string p1, "0"

    return-object p1

    :cond_0
    iget-boolean v0, p0, Lqn4;->h:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lqn4;->e()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    if-eqz p1, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lqn4;->e()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lqn4;->f:Ljava/math/BigInteger;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p0}, Lqn4;->c()Ljava/math/BigDecimal;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lqn4;->g:I

    return v0
.end method

.method public i()Lqn4;
    .locals 4

    new-instance v0, Lqn4;

    iget v1, p0, Lqn4;->d:I

    neg-int v1, v1

    iget-object v2, p0, Lqn4;->e:Ljava/math/BigInteger;

    iget-object v3, p0, Lqn4;->f:Ljava/math/BigInteger;

    invoke-direct {v0, v1, v2, v3}, Lqn4;-><init>(ILjava/math/BigInteger;Ljava/math/BigInteger;)V

    return-object v0
.end method

.method public intValue()I
    .locals 2

    invoke-virtual {p0}, Lqn4;->longValue()J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method public longValue()J
    .locals 3

    iget-object v0, p0, Lqn4;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lqn4;->j:Ljava/lang/Long;

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lqn4;->r()I

    move-result v1

    if-gez v1, :cond_0

    iget-object v1, p0, Lqn4;->e:Ljava/math/BigInteger;

    invoke-virtual {v1}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object v1

    iget-object v2, p0, Lqn4;->f:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lqn4;->e:Ljava/math/BigInteger;

    iget-object v2, p0, Lqn4;->f:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v1

    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, p0, Lqn4;->j:Ljava/lang/Long;

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lqn4;->j:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public p(I)Lqn4;
    .locals 4

    if-nez p1, :cond_1

    iget p1, p0, Lqn4;->d:I

    if-eqz p1, :cond_0

    sget-object p1, Lqn4;->m:Lqn4;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    const-string v0, "0^0 is not defined"

    invoke-direct {p1, v0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v0, p0, Lqn4;->d:I

    if-nez v0, :cond_2

    sget-object p1, Lqn4;->l:Lqn4;

    return-object p1

    :cond_2
    and-int/lit8 v1, p1, 0x1

    const/4 v2, 0x1

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    if-gez v0, :cond_5

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v0, -0x1

    move v2, v0

    :cond_5
    :goto_1
    if-lez p1, :cond_6

    new-instance v0, Lqn4;

    iget-object v1, p0, Lqn4;->e:Ljava/math/BigInteger;

    invoke-virtual {v1, p1}, Ljava/math/BigInteger;->pow(I)Ljava/math/BigInteger;

    move-result-object v1

    iget-object v3, p0, Lqn4;->f:Ljava/math/BigInteger;

    invoke-virtual {v3, p1}, Ljava/math/BigInteger;->pow(I)Ljava/math/BigInteger;

    move-result-object p1

    invoke-direct {v0, v2, v1, p1}, Lqn4;-><init>(ILjava/math/BigInteger;Ljava/math/BigInteger;)V

    return-object v0

    :cond_6
    new-instance v0, Lqn4;

    iget-object v1, p0, Lqn4;->f:Ljava/math/BigInteger;

    invoke-virtual {v1, p1}, Ljava/math/BigInteger;->pow(I)Ljava/math/BigInteger;

    move-result-object v1

    iget-object v3, p0, Lqn4;->e:Ljava/math/BigInteger;

    invoke-virtual {v3, p1}, Ljava/math/BigInteger;->pow(I)Ljava/math/BigInteger;

    move-result-object p1

    invoke-direct {v0, v2, v1, p1}, Lqn4;-><init>(ILjava/math/BigInteger;Ljava/math/BigInteger;)V

    return-object v0
.end method

.method public q()Lqn4;
    .locals 4

    new-instance v0, Lqn4;

    iget v1, p0, Lqn4;->d:I

    iget-object v2, p0, Lqn4;->f:Ljava/math/BigInteger;

    iget-object v3, p0, Lqn4;->e:Ljava/math/BigInteger;

    invoke-direct {v0, v1, v2, v3}, Lqn4;-><init>(ILjava/math/BigInteger;Ljava/math/BigInteger;)V

    return-object v0
.end method

.method public r()I
    .locals 1

    iget v0, p0, Lqn4;->d:I

    return v0
.end method

.method public s(C)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, Lqn4;->h(ZC)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    const/4 v0, 0x0

    sget-char v1, Lqn4;->k:C

    invoke-virtual {p0, v0, v1}, Lqn4;->h(ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
