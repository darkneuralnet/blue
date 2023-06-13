.class public Lf32;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[LWB1;

.field public b:LNW3;

.field public c:LNW3;

.field public d:[Z


# direct methods
.method public constructor <init>(LWB1;LWB1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v1, v0, [Z

    iput-object v1, p0, Lf32;->d:[Z

    new-array v0, v0, [LWB1;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    iput-object v0, p0, Lf32;->a:[LWB1;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lf32;->b(I)I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lf32;->b(I)I

    move-result v1

    if-ne v1, v2, :cond_1

    return v0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method public b(I)I
    .locals 1

    iget-object v0, p0, Lf32;->a:[LWB1;

    aget-object p1, v0, p1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    invoke-virtual {p1}, LWB1;->F()I

    move-result p1

    return p1
.end method

.method public c(I)Lsf1;
    .locals 1

    iget-object v0, p0, Lf32;->a:[LWB1;

    aget-object p1, v0, p1

    invoke-virtual {p1}, LWB1;->Z()Lsf1;

    move-result-object p1

    return-object p1
.end method

.method public d(I)LWB1;
    .locals 1

    iget-object v0, p0, Lf32;->a:[LWB1;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final e(I)LNW3;
    .locals 1

    if-nez p1, :cond_1

    iget-object v0, p0, Lf32;->b:LNW3;

    if-nez v0, :cond_0

    new-instance v0, Lw12;

    invoke-virtual {p0, p1}, Lf32;->d(I)LWB1;

    move-result-object p1

    invoke-direct {v0, p1}, Lw12;-><init>(LWB1;)V

    iput-object v0, p0, Lf32;->b:LNW3;

    :cond_0
    iget-object p1, p0, Lf32;->b:LNW3;

    return-object p1

    :cond_1
    iget-object v0, p0, Lf32;->c:LNW3;

    if-nez v0, :cond_2

    new-instance v0, Lw12;

    invoke-virtual {p0, p1}, Lf32;->d(I)LWB1;

    move-result-object p1

    invoke-direct {v0, p1}, Lw12;-><init>(LWB1;)V

    iput-object v0, p0, Lf32;->c:LNW3;

    :cond_2
    iget-object p1, p0, Lf32;->c:LNW3;

    return-object p1
.end method

.method public f(I)Z
    .locals 1

    iget-object v0, p0, Lf32;->a:[LWB1;

    aget-object p1, v0, p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LWB1;->F()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public g()Z
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lf32;->b(I)I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v2}, Lf32;->b(I)I

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    move v0, v2

    :cond_1
    return v0
.end method

.method public h()Z
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lf32;->b(I)I

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lf32;->a:[LWB1;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    if-eqz v1, :cond_0

    invoke-virtual {p0, v2}, Lf32;->b(I)I

    move-result v1

    if-nez v1, :cond_0

    move v0, v2

    :cond_0
    return v0
.end method

.method public i(I)Z
    .locals 1

    iget-object v0, p0, Lf32;->a:[LWB1;

    aget-object p1, v0, p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LWB1;->F()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public j(I)Z
    .locals 1

    invoke-virtual {p0, p1}, Lf32;->b(I)I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k()Z
    .locals 2

    iget-object v0, p0, Lf32;->a:[LWB1;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public l(ILyB0;)I
    .locals 2

    iget-object v0, p0, Lf32;->d:[Z

    aget-boolean v0, v0, p1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, Lf32;->d(I)LWB1;

    move-result-object v0

    invoke-virtual {v0}, LWB1;->r0()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lf32;->d:[Z

    aget-boolean v0, v0, p1

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lf32;->e(I)LNW3;

    move-result-object p1

    invoke-interface {p1, p2}, LNW3;->a(LyB0;)I

    move-result p1

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method public m(IZ)V
    .locals 1

    iget-object v0, p0, Lf32;->d:[Z

    aput-boolean p2, v0, p1

    return-void
.end method
