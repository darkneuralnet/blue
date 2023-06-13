.class public LzB0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEB0;
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0xcb44a778db18e0aL


# instance fields
.field public b:I

.field public c:I

.field public d:[LyB0;


# direct methods
.method public constructor <init>(II)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, LzB0;->b:I

    const/4 v0, 0x0

    iput v0, p0, LzB0;->c:I

    new-array v1, p1, [LyB0;

    iput-object v1, p0, LzB0;->d:[LyB0;

    iput p2, p0, LzB0;->b:I

    :goto_0
    if-ge v0, p1, :cond_0

    iget-object v1, p0, LzB0;->d:[LyB0;

    invoke-static {p2}, LMB0;->a(I)LyB0;

    move-result-object v2

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(III)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, LzB0;->b:I

    const/4 v0, 0x0

    iput v0, p0, LzB0;->c:I

    new-array v1, p1, [LyB0;

    iput-object v1, p0, LzB0;->d:[LyB0;

    iput p2, p0, LzB0;->b:I

    iput p3, p0, LzB0;->c:I

    :goto_0
    if-ge v0, p1, :cond_0

    iget-object p2, p0, LzB0;->d:[LyB0;

    invoke-interface {p0}, LEB0;->R()LyB0;

    move-result-object p3

    aput-object p3, p2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>([LyB0;)V
    .locals 2

    invoke-static {p1}, LBB0;->a([LyB0;)I

    move-result v0

    invoke-static {p1}, LBB0;->e([LyB0;)I

    move-result v1

    invoke-direct {p0, p1, v0, v1}, LzB0;-><init>([LyB0;II)V

    return-void
.end method

.method public constructor <init>([LyB0;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, LzB0;->b:I

    iput p3, p0, LzB0;->c:I

    if-nez p1, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [LyB0;

    iput-object p1, p0, LzB0;->d:[LyB0;

    goto :goto_0

    :cond_0
    iput-object p1, p0, LzB0;->d:[LyB0;

    :goto_0
    return-void
.end method


# virtual methods
.method public F()I
    .locals 1

    iget v0, p0, LzB0;->b:I

    return v0
.end method

.method public N0(I)D
    .locals 2

    iget-object v0, p0, LzB0;->d:[LyB0;

    aget-object p1, v0, p1

    iget-wide v0, p1, LyB0;->c:D

    return-wide v0
.end method

.method public T(ILyB0;)V
    .locals 1

    iget-object v0, p0, LzB0;->d:[LyB0;

    aget-object p1, v0, p1

    invoke-virtual {p2, p1}, LyB0;->o(LyB0;)V

    return-void
.end method

.method public W0(I)D
    .locals 2

    invoke-interface {p0}, LEB0;->k2()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LzB0;->d:[LyB0;

    aget-object p1, v0, p1

    invoke-virtual {p1}, LyB0;->m()D

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    return-wide v0
.end method

.method public a3(II)D
    .locals 1

    if-eqz p2, :cond_1

    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    iget-object v0, p0, LzB0;->d:[LyB0;

    aget-object p1, v0, p1

    invoke-virtual {p1, p2}, LyB0;->j(I)D

    move-result-wide p1

    return-wide p1

    :cond_0
    iget-object p2, p0, LzB0;->d:[LyB0;

    aget-object p1, p2, p1

    iget-wide p1, p1, LyB0;->c:D

    return-wide p1

    :cond_1
    iget-object p2, p0, LzB0;->d:[LyB0;

    aget-object p1, p2, p1

    iget-wide p1, p1, LyB0;->b:D

    return-wide p1
.end method

.method public b2()[LyB0;
    .locals 1

    iget-object v0, p0, LzB0;->d:[LyB0;

    return-object v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LzB0;->d()LzB0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic copy()LEB0;
    .locals 1

    invoke-virtual {p0}, LzB0;->d()LzB0;

    move-result-object v0

    return-object v0
.end method

.method public d()LzB0;
    .locals 4

    invoke-virtual {p0}, LzB0;->size()I

    move-result v0

    new-array v0, v0, [LyB0;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LzB0;->d:[LyB0;

    array-length v2, v2

    if-ge v1, v2, :cond_0

    invoke-interface {p0}, LEB0;->R()LyB0;

    move-result-object v2

    iget-object v3, p0, LzB0;->d:[LyB0;

    aget-object v3, v3, v1

    invoke-virtual {v2, v3}, LyB0;->o(LyB0;)V

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, LzB0;

    iget v2, p0, LzB0;->b:I

    iget v3, p0, LzB0;->c:I

    invoke-direct {v1, v0, v2, v3}, LzB0;-><init>([LyB0;II)V

    return-object v1
.end method

.method public e3()I
    .locals 1

    iget v0, p0, LzB0;->c:I

    return v0
.end method

.method public m0(Lsf1;)Lsf1;
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LzB0;->d:[LyB0;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    aget-object v1, v1, v0

    invoke-virtual {p1, v1}, Lsf1;->k(LyB0;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method public n2(I)D
    .locals 2

    iget-object v0, p0, LzB0;->d:[LyB0;

    aget-object p1, v0, p1

    iget-wide v0, p1, LyB0;->b:D

    return-wide v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, LzB0;->d:[LyB0;

    array-length v0, v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LzB0;->d:[LyB0;

    array-length v1, v0

    if-lez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x11

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v0, 0x28

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v0, p0, LzB0;->d:[LyB0;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    :goto_0
    iget-object v2, p0, LzB0;->d:[LyB0;

    array-length v2, v2

    if-ge v0, v2, :cond_0

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LzB0;->d:[LyB0;

    aget-object v2, v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/16 v0, 0x29

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, "()"

    return-object v0
.end method

.method public u(I)LyB0;
    .locals 1

    iget-object v0, p0, LzB0;->d:[LyB0;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public v3(I)D
    .locals 2

    invoke-interface {p0}, LEB0;->K2()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LzB0;->d:[LyB0;

    aget-object p1, v0, p1

    invoke-virtual {p1}, LyB0;->h()D

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    return-wide v0
.end method

.method public y1(IID)V
    .locals 1

    if-eqz p2, :cond_1

    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    iget-object v0, p0, LzB0;->d:[LyB0;

    aget-object p1, v0, p1

    invoke-virtual {p1, p2, p3, p4}, LyB0;->p(ID)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, LzB0;->d:[LyB0;

    aget-object p1, p2, p1

    iput-wide p3, p1, LyB0;->c:D

    goto :goto_0

    :cond_1
    iget-object p2, p0, LzB0;->d:[LyB0;

    aget-object p1, p2, p1

    iput-wide p3, p1, LyB0;->b:D

    :goto_0
    return-void
.end method
