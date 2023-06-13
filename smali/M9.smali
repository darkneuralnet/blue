.class public final LM9;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a5\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a-\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001aA\u0010\u0012\u001a\u00020\u0011*\u00020\u000c2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\"\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\u00018BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0018"
    }
    d2 = {
        "LgV2;",
        "LL9;",
        "alignmentLine",
        "Lk61;",
        "before",
        "after",
        "e",
        "(LgV2;LL9;FF)LgV2;",
        "top",
        "bottom",
        "g",
        "(LgV2;FF)LgV2;",
        "LzO2;",
        "LvO2;",
        "measurable",
        "Lkz0;",
        "constraints",
        "LyO2;",
        "c",
        "(LzO2;LL9;FFLvO2;J)LyO2;",
        "",
        "d",
        "(LL9;)Z",
        "horizontal",
        "foundation-layout_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,325:1\n135#2:326\n135#2:327\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n75#1:326\n121#1:327\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic a(LzO2;LL9;FFLvO2;J)LyO2;
    .locals 0

    invoke-static/range {p0 .. p6}, LM9;->c(LzO2;LL9;FFLvO2;J)LyO2;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LL9;)Z
    .locals 0

    invoke-static {p0}, LM9;->d(LL9;)Z

    move-result p0

    return p0
.end method

.method public static final c(LzO2;LL9;FFLvO2;J)LyO2;
    .locals 14

    move-object v0, p0

    move/from16 v3, p2

    move/from16 v1, p3

    invoke-static {p1}, LM9;->d(LL9;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xb

    const/4 v11, 0x0

    move-wide/from16 v4, p5

    invoke-static/range {v4 .. v11}, Lkz0;->e(JIIIIILjava/lang/Object;)J

    move-result-wide v4

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xe

    const/4 v13, 0x0

    move-wide/from16 v6, p5

    invoke-static/range {v6 .. v13}, Lkz0;->e(JIIIIILjava/lang/Object;)J

    move-result-wide v4

    :goto_0
    move-object/from16 v2, p4

    invoke-interface {v2, v4, v5}, LvO2;->P0(J)LOU3;

    move-result-object v7

    move-object v2, p1

    invoke-interface {v7, p1}, LAO2;->v(LL9;)I

    move-result v4

    const/high16 v5, -0x80000000

    const/4 v6, 0x0

    if-eq v4, v5, :cond_1

    goto :goto_1

    :cond_1
    move v4, v6

    :goto_1
    invoke-static {p1}, LM9;->d(LL9;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v7}, LOU3;->d1()I

    move-result v5

    goto :goto_2

    :cond_2
    invoke-virtual {v7}, LOU3;->i1()I

    move-result v5

    :goto_2
    invoke-static {p1}, LM9;->d(LL9;)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-static/range {p5 .. p6}, Lkz0;->m(J)I

    move-result v8

    goto :goto_3

    :cond_3
    invoke-static/range {p5 .. p6}, Lkz0;->n(J)I

    move-result v8

    :goto_3
    sget-object v9, Lk61;->c:Lk61$a;

    invoke-virtual {v9}, Lk61$a;->c()F

    move-result v10

    invoke-static {v3, v10}, Lk61;->i(FF)Z

    move-result v10

    if-nez v10, :cond_4

    invoke-interface {p0, v3}, Lg01;->F0(F)I

    move-result v10

    goto :goto_4

    :cond_4
    move v10, v6

    :goto_4
    sub-int/2addr v10, v4

    sub-int/2addr v8, v5

    invoke-static {v10, v6, v8}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v10

    invoke-virtual {v9}, Lk61$a;->c()F

    move-result v9

    invoke-static {v1, v9}, Lk61;->i(FF)Z

    move-result v9

    if-nez v9, :cond_5

    invoke-interface {p0, v1}, Lg01;->F0(F)I

    move-result v1

    goto :goto_5

    :cond_5
    move v1, v6

    :goto_5
    sub-int/2addr v1, v5

    add-int/2addr v1, v4

    sub-int/2addr v8, v10

    invoke-static {v1, v6, v8}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v6

    invoke-static {p1}, LM9;->d(LL9;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v7}, LOU3;->i1()I

    move-result v1

    goto :goto_6

    :cond_6
    invoke-virtual {v7}, LOU3;->i1()I

    move-result v1

    add-int/2addr v1, v10

    add-int/2addr v1, v6

    invoke-static/range {p5 .. p6}, Lkz0;->p(J)I

    move-result v4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    :goto_6
    move v9, v1

    invoke-static {p1}, LM9;->d(LL9;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v7}, LOU3;->d1()I

    move-result v1

    add-int/2addr v1, v10

    add-int/2addr v1, v6

    invoke-static/range {p5 .. p6}, Lkz0;->o(J)I

    move-result v4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_7

    :cond_7
    invoke-virtual {v7}, LOU3;->d1()I

    move-result v1

    :goto_7
    move v11, v1

    const/4 v12, 0x0

    new-instance v13, LM9$a;

    move-object v1, v13

    move-object v2, p1

    move/from16 v3, p2

    move v4, v10

    move v5, v9

    move v8, v11

    invoke-direct/range {v1 .. v8}, LM9$a;-><init>(LL9;FIIILOU3;I)V

    const/4 v1, 0x4

    const/4 v2, 0x0

    move p1, v9

    move/from16 p2, v11

    move-object/from16 p3, v12

    move-object/from16 p4, v13

    move/from16 p5, v1

    move-object/from16 p6, v2

    invoke-static/range {p0 .. p6}, LzO2;->Y(LzO2;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LyO2;

    move-result-object v0

    return-object v0
.end method

.method public static final d(LL9;)Z
    .locals 0

    instance-of p0, p0, LYM1;

    return p0
.end method

.method public static final e(LgV2;LL9;FF)LgV2;
    .locals 7

    const-string v0, "$this$paddingFrom"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alignmentLine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LO9;

    invoke-static {}, LK32;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, LM9$b;

    invoke-direct {v1, p1, p2, p3}, LM9$b;-><init>(LL9;FF)V

    goto :goto_0

    :cond_0
    invoke-static {}, LK32;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    :goto_0
    move-object v5, v1

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p1

    move v3, p2

    move v4, p3

    invoke-direct/range {v1 .. v6}, LO9;-><init>(LL9;FFLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(LgV2;LL9;FFILjava/lang/Object;)LgV2;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Lk61;->c:Lk61$a;

    invoke-virtual {p2}, Lk61$a;->c()F

    move-result p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    sget-object p3, Lk61;->c:Lk61$a;

    invoke-virtual {p3}, Lk61$a;->c()F

    move-result p3

    :cond_1
    invoke-static {p0, p1, p2, p3}, LM9;->e(LgV2;LL9;FF)LgV2;

    move-result-object p0

    return-object p0
.end method

.method public static final g(LgV2;FF)LgV2;
    .locals 8

    const-string v0, "$this$paddingFromBaseline"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lk61;->c:Lk61$a;

    invoke-virtual {v0}, Lk61$a;->c()F

    move-result v1

    invoke-static {p1, v1}, Lk61;->i(FF)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v2, LgV2;->b0:LgV2$a;

    invoke-static {}, LN9;->a()LYM1;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move v4, p1

    invoke-static/range {v2 .. v7}, LM9;->f(LgV2;LL9;FFILjava/lang/Object;)LgV2;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, LgV2;->b0:LgV2$a;

    :goto_0
    invoke-interface {p0, p1}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p0

    invoke-virtual {v0}, Lk61$a;->c()F

    move-result p1

    invoke-static {p2, p1}, Lk61;->i(FF)Z

    move-result p1

    if-nez p1, :cond_1

    sget-object v0, LgV2;->b0:LgV2$a;

    invoke-static {}, LN9;->b()LYM1;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    move v3, p2

    invoke-static/range {v0 .. v5}, LM9;->f(LgV2;LL9;FFILjava/lang/Object;)LgV2;

    move-result-object p1

    goto :goto_1

    :cond_1
    sget-object p1, LgV2;->b0:LgV2$a;

    :goto_1
    invoke-interface {p0, p1}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p0

    return-object p0
.end method
