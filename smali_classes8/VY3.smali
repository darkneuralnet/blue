.class public final LVY3;
.super Lo0;
.source "SourceFile"

# interfaces
.implements LlX2;


# static fields
.field public static final i:LVY3;

.field private static final serialVersionUID:J = 0x4565ad22e9801f66L


# instance fields
.field public final e:Ljava/lang/Object;

.field public final f:I

.field public final g:I

.field public transient h:Ljava/lang/Number;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x1

    invoke-static {v0}, LVY3;->l(I)LVY3;

    move-result-object v0

    sput-object v0, LVY3;->i:LVY3;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Lo0;-><init>()V

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    iput-object v1, p0, LVY3;->e:Ljava/lang/Object;

    iput p1, p0, LVY3;->f:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v0

    invoke-static {v1}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, LVY3;->g:I

    return-void
.end method

.method public static l(I)LVY3;
    .locals 1

    new-instance v0, LVY3;

    invoke-direct {v0, p0}, LVY3;-><init>(I)V

    return-object v0
.end method


# virtual methods
.method public D()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lae6;

    invoke-virtual {p0, p1}, LVY3;->j(Lae6;)I

    move-result p1

    return p1
.end method

.method public d()Z
    .locals 1

    iget v0, p0, LVY3;->f:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e(Lo0;)Z
    .locals 0

    instance-of p1, p1, LVY3;

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lae6;

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Lae6;

    invoke-virtual {p0}, LVY3;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Lae6;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    :cond_1
    instance-of v1, p1, LVY3;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    check-cast p1, LVY3;

    iget v1, p0, LVY3;->f:I

    iget p1, p1, LVY3;->f:I

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
    .locals 2

    new-instance v0, LVY3;

    iget v1, p0, LVY3;->f:I

    neg-int v1, v1

    invoke-direct {v0, v1}, LVY3;-><init>(I)V

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LVY3;->k()Ljava/lang/Number;

    move-result-object v0

    return-object v0
.end method

.method public h(Lo0;)Lo0;
    .locals 2

    new-instance v0, LVY3;

    iget v1, p0, LVY3;->f:I

    check-cast p1, LVY3;

    iget p1, p1, LVY3;->f:I

    add-int/2addr v1, p1

    invoke-direct {v0, v1}, LVY3;-><init>(I)V

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LVY3;->g:I

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, LVY3;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "x -> x * \u03c0^%s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public j(Lae6;)I
    .locals 2

    const/4 v0, 0x0

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, LVY3;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Lae6;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    :cond_1
    instance-of v0, p1, LVY3;

    if-eqz v0, :cond_2

    check-cast p1, LVY3;

    iget v0, p0, LVY3;->f:I

    iget p1, p1, LVY3;->f:I

    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1

    :cond_2
    const-class v0, LVY3;

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

.method public k()Ljava/lang/Number;
    .locals 3

    iget-object v0, p0, LVY3;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LVY3;->h:Ljava/lang/Number;

    if-nez v1, :cond_1

    sget-object v1, Lt80;->c:Ljava/math/MathContext;

    invoke-virtual {v1}, Ljava/math/MathContext;->getPrecision()I

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lt80$a;->f(I)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-static {v1}, Lp80;->c(Ljava/lang/Number;)Lp80;

    move-result-object v1

    iget v2, p0, LVY3;->f:I

    invoke-virtual {v1, v2}, Lp80;->e(I)Lp80;

    move-result-object v1

    invoke-virtual {v1}, Lp80;->d()Ljava/lang/Number;

    move-result-object v1

    iput-object v1, p0, LVY3;->h:Ljava/lang/Number;

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/ArithmeticException;

    const-string v2, "Pi multiplication with unlimited precision"

    invoke-direct {v1, v2}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LVY3;->h:Ljava/lang/Number;

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
