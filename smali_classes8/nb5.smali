.class public Lnb5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lsf1;

.field public b:D

.field public c:D

.field public d:D

.field public e:D


# direct methods
.method public constructor <init>(Lsf1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb5;->a:Lsf1;

    invoke-virtual {p1}, Lsf1;->q()D

    move-result-wide v0

    iput-wide v0, p0, Lnb5;->b:D

    invoke-virtual {p1}, Lsf1;->o()D

    move-result-wide v0

    iput-wide v0, p0, Lnb5;->c:D

    invoke-virtual {p1}, Lsf1;->p()D

    move-result-wide v0

    iput-wide v0, p0, Lnb5;->d:D

    invoke-virtual {p1}, Lsf1;->n()D

    move-result-wide v0

    iput-wide v0, p0, Lnb5;->e:D

    return-void
.end method


# virtual methods
.method public a([LyB0;)[LyB0;
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, 0x4

    if-ge v1, v2, :cond_2

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    move v2, v0

    :goto_1
    invoke-virtual {p0, p1, v1, v2}, Lnb5;->b([LyB0;IZ)[LyB0;

    move-result-object p1

    array-length v2, p1

    if-nez v2, :cond_1

    return-object p1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method public final b([LyB0;IZ)[LyB0;
    .locals 6

    new-instance v0, LDB0;

    invoke-direct {v0}, LDB0;-><init>()V

    array-length v1, p1

    add-int/lit8 v1, v1, -0x1

    aget-object v1, p1, v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    array-length v4, p1

    if-ge v3, v4, :cond_3

    aget-object v4, p1, v3

    invoke-virtual {p0, v4, p2}, Lnb5;->f(LyB0;I)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {p0, v1, p2}, Lnb5;->f(LyB0;I)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {p0, v1, v4, p2}, Lnb5;->c(LyB0;LyB0;I)LyB0;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, LDB0;->f(LyB0;Z)V

    :cond_0
    invoke-virtual {v4}, LyB0;->e()LyB0;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, LDB0;->f(LyB0;Z)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v1, p2}, Lnb5;->f(LyB0;I)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {p0, v1, v4, p2}, Lnb5;->c(LyB0;LyB0;I)LyB0;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, LDB0;->f(LyB0;Z)V

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    move-object v1, v4

    goto :goto_0

    :cond_3
    if-eqz p3, :cond_4

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    if-lez p1, :cond_4

    invoke-virtual {v0, v2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LyB0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {v0, p2}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LyB0;

    invoke-virtual {p1, p2}, LyB0;->g(LyB0;)Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {p1}, LyB0;->e()LyB0;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-virtual {v0}, LDB0;->b2()[LyB0;

    move-result-object p1

    return-object p1
.end method

.method public final c(LyB0;LyB0;I)LyB0;
    .locals 2

    if-eqz p3, :cond_2

    const/4 v0, 0x1

    if-eq p3, v0, :cond_1

    const/4 v0, 0x2

    if-eq p3, v0, :cond_0

    new-instance p3, LyB0;

    iget-wide v0, p0, Lnb5;->d:D

    invoke-virtual {p0, p1, p2, v0, v1}, Lnb5;->d(LyB0;LyB0;D)D

    move-result-wide p1

    invoke-direct {p3, v0, v1, p1, p2}, LyB0;-><init>(DD)V

    goto :goto_0

    :cond_0
    new-instance p3, LyB0;

    iget-wide v0, p0, Lnb5;->c:D

    invoke-virtual {p0, p1, p2, v0, v1}, Lnb5;->e(LyB0;LyB0;D)D

    move-result-wide p1

    iget-wide v0, p0, Lnb5;->c:D

    invoke-direct {p3, p1, p2, v0, v1}, LyB0;-><init>(DD)V

    goto :goto_0

    :cond_1
    new-instance p3, LyB0;

    iget-wide v0, p0, Lnb5;->e:D

    invoke-virtual {p0, p1, p2, v0, v1}, Lnb5;->d(LyB0;LyB0;D)D

    move-result-wide p1

    invoke-direct {p3, v0, v1, p1, p2}, LyB0;-><init>(DD)V

    goto :goto_0

    :cond_2
    new-instance p3, LyB0;

    iget-wide v0, p0, Lnb5;->b:D

    invoke-virtual {p0, p1, p2, v0, v1}, Lnb5;->e(LyB0;LyB0;D)D

    move-result-wide p1

    iget-wide v0, p0, Lnb5;->b:D

    invoke-direct {p3, p1, p2, v0, v1}, LyB0;-><init>(DD)V

    :goto_0
    return-object p3
.end method

.method public final d(LyB0;LyB0;D)D
    .locals 6

    iget-wide v0, p2, LyB0;->c:D

    iget-wide v2, p1, LyB0;->c:D

    sub-double/2addr v0, v2

    iget-wide v4, p2, LyB0;->b:D

    iget-wide p1, p1, LyB0;->b:D

    sub-double/2addr v4, p1

    div-double/2addr v0, v4

    sub-double/2addr p3, p1

    mul-double/2addr p3, v0

    add-double/2addr v2, p3

    return-wide v2
.end method

.method public final e(LyB0;LyB0;D)D
    .locals 6

    iget-wide v0, p2, LyB0;->b:D

    iget-wide v2, p1, LyB0;->b:D

    sub-double/2addr v0, v2

    iget-wide v4, p2, LyB0;->c:D

    iget-wide p1, p1, LyB0;->c:D

    sub-double/2addr v4, p1

    div-double/2addr v0, v4

    sub-double/2addr p3, p1

    mul-double/2addr p3, v0

    add-double/2addr v2, p3

    return-wide v2
.end method

.method public final f(LyB0;I)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_2

    if-eq p2, v1, :cond_1

    const/4 v2, 0x2

    if-eq p2, v2, :cond_0

    iget-wide p1, p1, LyB0;->b:D

    iget-wide v2, p0, Lnb5;->d:D

    cmpl-double p1, p1, v2

    if-lez p1, :cond_3

    :goto_0
    move v0, v1

    goto :goto_1

    :cond_0
    iget-wide p1, p1, LyB0;->c:D

    iget-wide v2, p0, Lnb5;->c:D

    cmpg-double p1, p1, v2

    if-gez p1, :cond_3

    goto :goto_0

    :cond_1
    iget-wide p1, p1, LyB0;->b:D

    iget-wide v2, p0, Lnb5;->e:D

    cmpg-double p1, p1, v2

    if-gez p1, :cond_3

    goto :goto_0

    :cond_2
    iget-wide p1, p1, LyB0;->c:D

    iget-wide v2, p0, Lnb5;->b:D

    cmpl-double p1, p1, v2

    if-lez p1, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    return v0
.end method
