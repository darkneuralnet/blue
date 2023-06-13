.class public interface abstract LEB0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# virtual methods
.method public abstract F()I
.end method

.method public K2()Z
    .locals 1

    invoke-interface {p0}, LEB0;->e3()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract N0(I)D
.end method

.method public R()LyB0;
    .locals 2

    invoke-interface {p0}, LEB0;->F()I

    move-result v0

    invoke-interface {p0}, LEB0;->e3()I

    move-result v1

    invoke-static {v0, v1}, LMB0;->b(II)LyB0;

    move-result-object v0

    return-object v0
.end method

.method public abstract T(ILyB0;)V
.end method

.method public W0(I)D
    .locals 2

    invoke-interface {p0}, LEB0;->k2()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-interface {p0, p1, v0}, LEB0;->a3(II)D

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    return-wide v0
.end method

.method public abstract a3(II)D
.end method

.method public abstract b2()[LyB0;
.end method

.method public abstract copy()LEB0;
.end method

.method public e3()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public k2()Z
    .locals 2

    invoke-interface {p0}, LEB0;->F()I

    move-result v0

    invoke-interface {p0}, LEB0;->e3()I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x2

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract m0(Lsf1;)Lsf1;
.end method

.method public abstract n2(I)D
.end method

.method public abstract size()I
.end method

.method public abstract u(I)LyB0;
.end method

.method public v3(I)D
    .locals 2

    invoke-interface {p0}, LEB0;->K2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, LEB0;->F()I

    move-result v0

    invoke-interface {p0}, LEB0;->e3()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-interface {p0, p1, v0}, LEB0;->a3(II)D

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    return-wide v0
.end method

.method public abstract y1(IID)V
.end method
