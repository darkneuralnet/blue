.class public final LRD3;
.super LT42;
.source "SourceFile"

# interfaces
.implements LBm2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u00012\u00020\u0002B(\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017\u00a2\u0006\u0002\u0008\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ)\u0010\t\u001a\u00020\u0008*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0008\u0010\u000c\u001a\u00020\u000bH\u0016J\u0013\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002R\u0017\u0010\u0016\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u001e"
    }
    d2 = {
        "LRD3;",
        "LBm2;",
        "LT42;",
        "LzO2;",
        "LvO2;",
        "measurable",
        "Lkz0;",
        "constraints",
        "LyO2;",
        "f",
        "(LzO2;LvO2;J)LyO2;",
        "",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "LPD3;",
        "c",
        "LPD3;",
        "a",
        "()LPD3;",
        "paddingValues",
        "Lkotlin/Function1;",
        "LS42;",
        "",
        "Lkotlin/ExtensionFunctionType;",
        "inspectorInfo",
        "<init>",
        "(LPD3;Lkotlin/jvm/functions/Function1;)V",
        "foundation-layout_release"
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
        "SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n155#2:437\n155#2:438\n155#2:439\n155#2:440\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n*L\n405#1:437\n406#1:438\n407#1:439\n408#1:440\n*E\n"
    }
.end annotation


# instance fields
.field public final c:LPD3;


# direct methods
.method public constructor <init>(LPD3;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LPD3;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LS42;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "paddingValues"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inspectorInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, LT42;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, LRD3;->c:LPD3;

    return-void
.end method


# virtual methods
.method public final a()LPD3;
    .locals 1

    iget-object v0, p0, LRD3;->c:LPD3;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LRD3;

    if-eqz v0, :cond_0

    check-cast p1, LRD3;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v0, p0, LRD3;->c:LPD3;

    iget-object p1, p1, LRD3;->c:LPD3;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(LzO2;LvO2;J)LyO2;
    .locals 10

    const-string v0, "$this$measure"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LRD3;->c:LPD3;

    invoke-interface {p1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v1

    invoke-interface {v0, v1}, LPD3;->b(Lpm2;)F

    move-result v0

    const/4 v1, 0x0

    int-to-float v2, v1

    invoke-static {v2}, Lk61;->g(F)F

    move-result v3

    invoke-static {v0, v3}, Lk61;->f(FF)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, LRD3;->c:LPD3;

    invoke-interface {v0}, LPD3;->d()F

    move-result v0

    invoke-static {v2}, Lk61;->g(F)F

    move-result v3

    invoke-static {v0, v3}, Lk61;->f(FF)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, LRD3;->c:LPD3;

    invoke-interface {p1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v3

    invoke-interface {v0, v3}, LPD3;->c(Lpm2;)F

    move-result v0

    invoke-static {v2}, Lk61;->g(F)F

    move-result v3

    invoke-static {v0, v3}, Lk61;->f(FF)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, LRD3;->c:LPD3;

    invoke-interface {v0}, LPD3;->a()F

    move-result v0

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v0, v2}, Lk61;->f(FF)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    if-eqz v1, :cond_1

    iget-object v0, p0, LRD3;->c:LPD3;

    invoke-interface {p1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v1

    invoke-interface {v0, v1}, LPD3;->b(Lpm2;)F

    move-result v0

    invoke-interface {p1, v0}, Lg01;->F0(F)I

    move-result v0

    iget-object v1, p0, LRD3;->c:LPD3;

    invoke-interface {p1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v2

    invoke-interface {v1, v2}, LPD3;->c(Lpm2;)F

    move-result v1

    invoke-interface {p1, v1}, Lg01;->F0(F)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, LRD3;->c:LPD3;

    invoke-interface {v1}, LPD3;->d()F

    move-result v1

    invoke-interface {p1, v1}, Lg01;->F0(F)I

    move-result v1

    iget-object v2, p0, LRD3;->c:LPD3;

    invoke-interface {v2}, LPD3;->a()F

    move-result v2

    invoke-interface {p1, v2}, Lg01;->F0(F)I

    move-result v2

    add-int/2addr v1, v2

    neg-int v2, v0

    neg-int v3, v1

    invoke-static {p3, p4, v2, v3}, Lnz0;->h(JII)J

    move-result-wide v2

    invoke-interface {p2, v2, v3}, LvO2;->P0(J)LOU3;

    move-result-object p2

    invoke-virtual {p2}, LOU3;->i1()I

    move-result v2

    add-int/2addr v2, v0

    invoke-static {p3, p4, v2}, Lnz0;->g(JI)I

    move-result v4

    invoke-virtual {p2}, LOU3;->d1()I

    move-result v0

    add-int/2addr v0, v1

    invoke-static {p3, p4, v0}, Lnz0;->f(JI)I

    move-result v5

    const/4 v6, 0x0

    new-instance v7, LRD3$a;

    invoke-direct {v7, p2, p1, p0}, LRD3$a;-><init>(LOU3;LzO2;LRD3;)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v9}, LzO2;->Y(LzO2;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LyO2;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Padding must be non-negative"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LRD3;->c:LPD3;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
