.class public interface abstract Lg01;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008g\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0017\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\n\u001a\u00020\t*\u00020\u0002H\u0017\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0019\u0010\u000c\u001a\u00020\u0003*\u00020\tH\u0017\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u0006*\u00020\tH\u0017\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\u00020\u0002*\u00020\u0006H\u0017\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001c\u0010\u0012\u001a\u00020\u0002*\u00020\u0003H\u0017\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0005J\u0019\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0017\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u0013*\u00020\u0014H\u0017\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00038&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u00038&X\u00a7\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u001e\u0010\u001b\u001a\u0004\u0008\u001d\u0010\u0019\u00f8\u0001\u0003\u0082\u0002\u0015\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\n\u0002\u0008!\n\u0004\u0008!0\u0001\u00a8\u0006 \u00c0\u0006\u0003"
    }
    d2 = {
        "Lg01;",
        "",
        "Lk61;",
        "",
        "T0",
        "(F)F",
        "",
        "F0",
        "(F)I",
        "LM26;",
        "s0",
        "(F)J",
        "I0",
        "(J)F",
        "V0",
        "(J)I",
        "w",
        "(I)F",
        "x",
        "Lo61;",
        "LxB5;",
        "z",
        "(J)J",
        "j",
        "b",
        "()F",
        "getDensity$annotations",
        "()V",
        "density",
        "R0",
        "getFontScale$annotations",
        "fontScale",
        "ui-unit_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,163:1\n1#2:164\n174#3:165\n174#3:166\n473#3:167\n152#4:168\n*S KotlinDebug\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n*L\n114#1:165\n124#1:166\n147#1:167\n157#1:168\n*E\n"
    }
.end annotation


# virtual methods
.method public F0(F)I
    .locals 1

    invoke-interface {p0, p1}, Lg01;->T0(F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const p1, 0x7fffffff

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result p1

    :goto_0
    return p1
.end method

.method public I0(J)F
    .locals 4

    invoke-static {p1, p2}, LM26;->g(J)J

    move-result-wide v0

    sget-object v2, LO26;->b:LO26$a;

    invoke-virtual {v2}, LO26$a;->b()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LO26;->g(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, LM26;->h(J)F

    move-result p1

    invoke-interface {p0}, Lg01;->R0()F

    move-result p2

    mul-float/2addr p1, p2

    invoke-interface {p0}, Lg01;->b()F

    move-result p2

    mul-float/2addr p1, p2

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Only Sp can convert to Px"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract R0()F
.end method

.method public T0(F)F
    .locals 1

    invoke-interface {p0}, Lg01;->b()F

    move-result v0

    mul-float/2addr p1, v0

    return p1
.end method

.method public V0(J)I
    .locals 0

    invoke-interface {p0, p1, p2}, Lg01;->I0(J)F

    move-result p1

    invoke-static {p1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result p1

    return p1
.end method

.method public abstract b()F
.end method

.method public j(J)J
    .locals 2

    sget-object v0, LxB5;->b:LxB5$a;

    invoke-virtual {v0}, LxB5$a;->a()J

    move-result-wide v0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {p1, p2}, LxB5;->i(J)F

    move-result v0

    invoke-interface {p0, v0}, Lg01;->x(F)F

    move-result v0

    invoke-static {p1, p2}, LxB5;->g(J)F

    move-result p1

    invoke-interface {p0, p1}, Lg01;->x(F)F

    move-result p1

    invoke-static {v0, p1}, Lm61;->b(FF)J

    move-result-wide p1

    goto :goto_1

    :cond_1
    sget-object p1, Lo61;->b:Lo61$a;

    invoke-virtual {p1}, Lo61$a;->a()J

    move-result-wide p1

    :goto_1
    return-wide p1
.end method

.method public s0(F)J
    .locals 2

    invoke-interface {p0}, Lg01;->R0()F

    move-result v0

    div-float/2addr p1, v0

    invoke-static {p1}, LN26;->e(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public w(I)F
    .locals 1

    int-to-float p1, p1

    invoke-interface {p0}, Lg01;->b()F

    move-result v0

    div-float/2addr p1, v0

    invoke-static {p1}, Lk61;->g(F)F

    move-result p1

    return p1
.end method

.method public x(F)F
    .locals 1

    invoke-interface {p0}, Lg01;->b()F

    move-result v0

    div-float/2addr p1, v0

    invoke-static {p1}, Lk61;->g(F)F

    move-result p1

    return p1
.end method

.method public z(J)J
    .locals 2

    sget-object v0, Lo61;->b:Lo61$a;

    invoke-virtual {v0}, Lo61$a;->a()J

    move-result-wide v0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {p1, p2}, Lo61;->h(J)F

    move-result v0

    invoke-interface {p0, v0}, Lg01;->T0(F)F

    move-result v0

    invoke-static {p1, p2}, Lo61;->g(J)F

    move-result p1

    invoke-interface {p0, p1}, Lg01;->T0(F)F

    move-result p1

    invoke-static {v0, p1}, LCB5;->a(FF)J

    move-result-wide p1

    goto :goto_1

    :cond_1
    sget-object p1, LxB5;->b:LxB5$a;

    invoke-virtual {p1}, LxB5$a;->a()J

    move-result-wide p1

    :goto_1
    return-wide p1
.end method
