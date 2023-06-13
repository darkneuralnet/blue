.class public interface abstract LVn2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LzO2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008w\u0018\u00002\u00020\u0001J+\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001c\u0010\u000b\u001a\u00020\n*\u00020\u0002H\u0017\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001c\u0010\u000e\u001a\u00020\n*\u00020\rH\u0017\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0017\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u0010*\u00020\u0011H\u0017\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0013\u0082\u0001\u0001\u0015\u00f8\u0001\u0003\u0082\u0002\u0015\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\n\u0002\u0008!\n\u0004\u0008!0\u0001\u00a8\u0006\u0016\u00c0\u0006\u0001"
    }
    d2 = {
        "LVn2;",
        "LzO2;",
        "",
        "index",
        "Lkz0;",
        "constraints",
        "",
        "LOU3;",
        "M",
        "(IJ)Ljava/util/List;",
        "Lk61;",
        "w",
        "(I)F",
        "",
        "x",
        "(F)F",
        "Lo61;",
        "LxB5;",
        "z",
        "(J)J",
        "j",
        "LWn2;",
        "foundation_release"
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
        "SMAP\nLazyLayoutMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,147:1\n1#2:148\n174#3:149\n174#3:150\n473#3:151\n152#4:152\n*S KotlinDebug\n*F\n+ 1 LazyLayoutMeasureScope.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope\n*L\n70#1:149\n73#1:150\n85#1:151\n92#1:152\n*E\n"
    }
.end annotation


# virtual methods
.method public abstract M(IJ)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ)",
            "Ljava/util/List<",
            "LOU3;",
            ">;"
        }
    .end annotation
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

    invoke-interface {p0, v0}, LVn2;->x(F)F

    move-result v0

    invoke-static {p1, p2}, LxB5;->g(J)F

    move-result p1

    invoke-interface {p0, p1}, LVn2;->x(F)F

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
