.class public Lla1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lla1$c;
    }
.end annotation


# instance fields
.field public a:Lsf1;

.field public b:I

.field public c:I

.field public d:D

.field public e:D

.field public f:[[Lla1$c;

.field public g:Z

.field public h:Z

.field public i:D


# direct methods
.method public constructor <init>(Lsf1;II)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lla1;->g:Z

    iput-boolean v0, p0, Lla1;->h:Z

    const-wide/high16 v1, 0x7ff8000000000000L    # Double.NaN

    iput-wide v1, p0, Lla1;->i:D

    iput-object p1, p0, Lla1;->a:Lsf1;

    iput p2, p0, Lla1;->b:I

    iput p3, p0, Lla1;->c:I

    invoke-virtual {p1}, Lsf1;->r()D

    move-result-wide v1

    int-to-double v3, p2

    div-double/2addr v1, v3

    iput-wide v1, p0, Lla1;->d:D

    invoke-virtual {p1}, Lsf1;->m()D

    move-result-wide v1

    int-to-double v3, p3

    div-double/2addr v1, v3

    iput-wide v1, p0, Lla1;->e:D

    iget-wide v3, p0, Lla1;->d:D

    const-wide/16 v5, 0x0

    cmpg-double p1, v3, v5

    const/4 v3, 0x1

    if-gtz p1, :cond_0

    iput v3, p0, Lla1;->b:I

    :cond_0
    cmpg-double p1, v1, v5

    if-gtz p1, :cond_1

    iput v3, p0, Lla1;->c:I

    :cond_1
    const/4 p1, 0x2

    new-array p1, p1, [I

    aput p3, p1, v3

    aput p2, p1, v0

    const-class p2, Lla1$c;

    invoke-static {p2, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [[Lla1$c;

    iput-object p1, p0, Lla1;->f:[[Lla1$c;

    return-void
.end method

.method public static c(LWB1;LWB1;)Lla1;
    .locals 3

    invoke-virtual {p0}, LWB1;->Z()Lsf1;

    move-result-object v0

    invoke-virtual {v0}, Lsf1;->c()Lsf1;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsf1;->l(Lsf1;)V

    :cond_0
    new-instance v1, Lla1;

    const/4 v2, 0x3

    invoke-direct {v1, v0, v2, v2}, Lla1;-><init>(Lsf1;II)V

    invoke-virtual {v1, p0}, Lla1;->b(LWB1;)V

    if-eqz p1, :cond_1

    invoke-virtual {v1, p1}, Lla1;->b(LWB1;)V

    :cond_1
    return-object v1
.end method


# virtual methods
.method public a(DDD)V
    .locals 7

    invoke-static {p5, p6}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lla1;->h:Z

    const/4 v6, 0x1

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-virtual/range {v1 .. v6}, Lla1;->d(DDZ)Lla1$c;

    move-result-object p1

    invoke-virtual {p1, p5, p6}, Lla1$c;->a(D)V

    return-void
.end method

.method public b(LWB1;)V
    .locals 1

    new-instance v0, Lla1$a;

    invoke-direct {v0, p0}, Lla1$a;-><init>(Lla1;)V

    invoke-virtual {p1, v0}, LWB1;->e(LGB0;)V

    return-void
.end method

.method public final d(DDZ)Lla1$c;
    .locals 5

    iget v0, p0, Lla1;->b:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-le v0, v2, :cond_0

    iget-object v0, p0, Lla1;->a:Lsf1;

    invoke-virtual {v0}, Lsf1;->p()D

    move-result-wide v3

    sub-double/2addr p1, v3

    iget-wide v3, p0, Lla1;->d:D

    div-double/2addr p1, v3

    double-to-int p1, p1

    iget p2, p0, Lla1;->b:I

    sub-int/2addr p2, v2

    invoke-static {p1, v1, p2}, LaN2;->a(III)I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    iget p2, p0, Lla1;->c:I

    if-le p2, v2, :cond_1

    iget-object p2, p0, Lla1;->a:Lsf1;

    invoke-virtual {p2}, Lsf1;->q()D

    move-result-wide v3

    sub-double/2addr p3, v3

    iget-wide v3, p0, Lla1;->e:D

    div-double/2addr p3, v3

    double-to-int p2, p3

    iget p3, p0, Lla1;->c:I

    sub-int/2addr p3, v2

    invoke-static {p2, v1, p3}, LaN2;->a(III)I

    move-result v1

    :cond_1
    iget-object p2, p0, Lla1;->f:[[Lla1$c;

    aget-object p2, p2, p1

    aget-object p2, p2, v1

    if-eqz p5, :cond_2

    if-nez p2, :cond_2

    new-instance p2, Lla1$c;

    invoke-direct {p2}, Lla1$c;-><init>()V

    iget-object p3, p0, Lla1;->f:[[Lla1$c;

    aget-object p1, p3, p1

    aput-object p2, p1, v1

    :cond_2
    return-object p2
.end method

.method public e(DD)D
    .locals 7

    iget-boolean v0, p0, Lla1;->g:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lla1;->f()V

    :cond_0
    const/4 v6, 0x0

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-virtual/range {v1 .. v6}, Lla1;->d(DDZ)Lla1$c;

    move-result-object p1

    if-nez p1, :cond_1

    iget-wide p1, p0, Lla1;->i:D

    return-wide p1

    :cond_1
    invoke-virtual {p1}, Lla1$c;->c()D

    move-result-wide p1

    return-wide p1
.end method

.method public final f()V
    .locals 8

    const/4 v0, 0x1

    iput-boolean v0, p0, Lla1;->g:Z

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    move v3, v0

    move v4, v3

    :goto_0
    iget-object v5, p0, Lla1;->f:[[Lla1$c;

    array-length v5, v5

    if-ge v3, v5, :cond_2

    move v5, v0

    :goto_1
    iget-object v6, p0, Lla1;->f:[[Lla1$c;

    aget-object v7, v6, v0

    array-length v7, v7

    if-ge v5, v7, :cond_1

    aget-object v6, v6, v3

    aget-object v6, v6, v5

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Lla1$c;->b()V

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v6}, Lla1$c;->c()D

    move-result-wide v6

    add-double/2addr v1, v6

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const-wide/high16 v5, 0x7ff8000000000000L    # Double.NaN

    iput-wide v5, p0, Lla1;->i:D

    if-lez v4, :cond_3

    int-to-double v3, v4

    div-double/2addr v1, v3

    iput-wide v1, p0, Lla1;->i:D

    :cond_3
    return-void
.end method

.method public g(LWB1;)V
    .locals 1

    iget-boolean v0, p0, Lla1;->h:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lla1;->g:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lla1;->f()V

    :cond_1
    new-instance v0, Lla1$b;

    invoke-direct {v0, p0}, Lla1$b;-><init>(Lla1;)V

    invoke-virtual {p1, v0}, LWB1;->e(LGB0;)V

    return-void
.end method
