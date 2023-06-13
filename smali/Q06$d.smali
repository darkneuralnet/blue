.class public final LQ06$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LxO2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ06;-><init>(LF26;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\u0008*\u00020\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\"\u0010\u000f\u001a\u00020\r*\u00020\u000b2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0011\u001a\u00020\r*\u00020\u000b2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016J\"\u0010\u0012\u001a\u00020\r*\u00020\u000b2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J\"\u0010\u0013\u001a\u00020\r*\u00020\u000b2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00032\u0006\u0010\u0010\u001a\u00020\rH\u0016\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0014"
    }
    d2 = {
        "Q06$d",
        "LxO2;",
        "LzO2;",
        "",
        "LvO2;",
        "measurables",
        "Lkz0;",
        "constraints",
        "LyO2;",
        "a",
        "(LzO2;Ljava/util/List;J)LyO2;",
        "LZ62;",
        "LX62;",
        "",
        "height",
        "c",
        "width",
        "e",
        "b",
        "d",
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
        "SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$measurePolicy$1\n+ 2 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,702:1\n80#2,3:703\n83#2:710\n84#2:712\n85#2:714\n69#3,4:706\n74#3:713\n1#4:711\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController$measurePolicy$1\n*L\n343#1:703,3\n343#1:710\n343#1:712\n343#1:714\n343#1:706,4\n343#1:713\n343#1:711\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:LQ06;


# direct methods
.method public constructor <init>(LQ06;)V
    .locals 0

    iput-object p1, p0, LQ06$d;->a:LQ06;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LzO2;Ljava/util/List;J)LyO2;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LzO2;",
            "Ljava/util/List<",
            "+",
            "LvO2;",
            ">;J)",
            "LyO2;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "$this$measure"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "measurables"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, LQ06$d;->a:LQ06;

    invoke-virtual {v3}, LQ06;->h()LF26;

    move-result-object v3

    invoke-virtual {v3}, LF26;->c()Lkotlin/Unit;

    iget-object v3, v0, LQ06$d;->a:LQ06;

    invoke-virtual {v3}, LQ06;->h()LF26;

    move-result-object v3

    invoke-virtual {v3}, LF26;->d()Li26;

    move-result-object v3

    iget-object v4, v0, LQ06$d;->a:LQ06;

    invoke-virtual {v4}, LQ06;->h()LF26;

    move-result-object v4

    invoke-virtual {v4}, LF26;->i()LT06;

    move-result-object v4

    invoke-interface/range {p1 .. p1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v5

    move-wide/from16 v6, p3

    invoke-virtual {v4, v6, v7, v5, v3}, LT06;->m(JLpm2;Li26;)Li26;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    iget-object v5, v0, LQ06$d;->a:LQ06;

    invoke-virtual {v5}, LQ06;->h()LF26;

    move-result-object v5

    invoke-virtual {v5}, LF26;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v5

    invoke-interface {v5, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v3, :cond_0

    iget-object v5, v0, LQ06$d;->a:LQ06;

    invoke-virtual {v3}, Li26;->k()Lg26;

    move-result-object v3

    invoke-virtual {v3}, Lg26;->j()LDf;

    move-result-object v3

    invoke-virtual {v4}, Li26;->k()Lg26;

    move-result-object v6

    invoke-virtual {v6}, Lg26;->j()LDf;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v5}, LQ06;->a(LQ06;)LVr5;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v5}, LQ06;->h()LF26;

    move-result-object v5

    invoke-virtual {v5}, LF26;->h()J

    move-result-wide v5

    invoke-interface {v3, v5, v6}, LVr5;->i(J)V

    :cond_0
    iget-object v3, v0, LQ06$d;->a:LQ06;

    invoke-virtual {v3}, LQ06;->h()LF26;

    move-result-object v3

    invoke-virtual {v3, v4}, LF26;->m(Li26;)V

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v4}, Li26;->z()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-lt v3, v5, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_5

    invoke-virtual {v4}, Li26;->z()Ljava/util/List;

    move-result-object v3

    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v8

    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_4

    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LOs4;

    if-eqz v10, :cond_2

    new-instance v11, Lkotlin/Pair;

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LvO2;

    const/4 v13, 0x0

    invoke-virtual {v10}, LOs4;->o()F

    move-result v14

    float-to-double v14, v14

    invoke-static {v14, v15}, Ljava/lang/Math;->floor(D)D

    move-result-wide v14

    double-to-float v14, v14

    float-to-int v14, v14

    const/4 v15, 0x0

    invoke-virtual {v10}, LOs4;->h()F

    move-result v6

    move/from16 v19, v8

    float-to-double v7, v6

    invoke-static {v7, v8}, Ljava/lang/Math;->floor(D)D

    move-result-wide v6

    double-to-float v6, v6

    float-to-int v6, v6

    const/16 v17, 0x5

    const/16 v18, 0x0

    move/from16 v16, v6

    invoke-static/range {v13 .. v18}, Lnz0;->b(IIIIILjava/lang/Object;)J

    move-result-wide v6

    invoke-interface {v12, v6, v7}, LvO2;->P0(J)LOU3;

    move-result-object v6

    invoke-virtual {v10}, LOs4;->i()F

    move-result v7

    invoke-static {v7}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v7

    invoke-virtual {v10}, LOs4;->l()F

    move-result v8

    invoke-static {v8}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v8

    invoke-static {v7, v8}, LB52;->a(II)J

    move-result-wide v7

    invoke-static {v7, v8}, LA52;->b(J)LA52;

    move-result-object v7

    invoke-direct {v11, v6, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    move/from16 v19, v8

    const/4 v11, 0x0

    :goto_2
    if-eqz v11, :cond_3

    invoke-interface {v5, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v9, v9, 0x1

    move/from16 v8, v19

    goto :goto_1

    :cond_4
    invoke-virtual {v4}, Li26;->A()J

    move-result-wide v2

    invoke-static {v2, v3}, LG52;->g(J)I

    move-result v2

    invoke-virtual {v4}, Li26;->A()J

    move-result-wide v6

    invoke-static {v6, v7}, LG52;->f(J)I

    move-result v3

    const/4 v6, 0x2

    new-array v6, v6, [Lkotlin/Pair;

    invoke-static {}, LN9;->a()LYM1;

    move-result-object v7

    invoke-virtual {v4}, Li26;->g()F

    move-result v8

    invoke-static {v8}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    const/4 v8, 0x0

    aput-object v7, v6, v8

    invoke-static {}, LN9;->b()LYM1;

    move-result-object v7

    invoke-virtual {v4}, Li26;->j()F

    move-result v4

    invoke-static {v4}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v7, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v7, 0x1

    aput-object v4, v6, v7

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v4

    new-instance v6, LQ06$d$a;

    invoke-direct {v6, v5}, LQ06$d$a;-><init>(Ljava/util/List;)V

    invoke-interface {v1, v2, v3, v4, v6}, LzO2;->O0(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)LyO2;

    move-result-object v1

    return-object v1

    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Check failed."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public b(LZ62;Ljava/util/List;I)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ62;",
            "Ljava/util/List<",
            "+",
            "LX62;",
            ">;I)I"
        }
    .end annotation

    const-string p3, "<this>"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "measurables"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LQ06$d;->a:LQ06;

    invoke-virtual {p2}, LQ06;->h()LF26;

    move-result-object p2

    invoke-virtual {p2}, LF26;->i()LT06;

    move-result-object p2

    invoke-interface {p1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object p1

    invoke-virtual {p2, p1}, LT06;->o(Lpm2;)V

    iget-object p1, p0, LQ06$d;->a:LQ06;

    invoke-virtual {p1}, LQ06;->h()LF26;

    move-result-object p1

    invoke-virtual {p1}, LF26;->i()LT06;

    move-result-object p1

    invoke-virtual {p1}, LT06;->c()I

    move-result p1

    return p1
.end method

.method public c(LZ62;Ljava/util/List;I)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ62;",
            "Ljava/util/List<",
            "+",
            "LX62;",
            ">;I)I"
        }
    .end annotation

    const-string p3, "<this>"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "measurables"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LQ06$d;->a:LQ06;

    invoke-virtual {p2}, LQ06;->h()LF26;

    move-result-object p2

    invoke-virtual {p2}, LF26;->i()LT06;

    move-result-object p2

    invoke-interface {p1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object p1

    invoke-virtual {p2, p1}, LT06;->o(Lpm2;)V

    iget-object p1, p0, LQ06$d;->a:LQ06;

    invoke-virtual {p1}, LQ06;->h()LF26;

    move-result-object p1

    invoke-virtual {p1}, LF26;->i()LT06;

    move-result-object p1

    invoke-virtual {p1}, LT06;->e()I

    move-result p1

    return p1
.end method

.method public d(LZ62;Ljava/util/List;I)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ62;",
            "Ljava/util/List<",
            "+",
            "LX62;",
            ">;I)I"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurables"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LQ06$d;->a:LQ06;

    invoke-virtual {p2}, LQ06;->h()LF26;

    move-result-object p2

    invoke-virtual {p2}, LF26;->i()LT06;

    move-result-object v0

    const/4 p2, 0x0

    const v1, 0x7fffffff

    invoke-static {p2, p3, p2, v1}, Lnz0;->a(IIII)J

    move-result-wide v1

    invoke-interface {p1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, LT06;->n(LT06;JLpm2;Li26;ILjava/lang/Object;)Li26;

    move-result-object p1

    invoke-virtual {p1}, Li26;->A()J

    move-result-wide p1

    invoke-static {p1, p2}, LG52;->f(J)I

    move-result p1

    return p1
.end method

.method public e(LZ62;Ljava/util/List;I)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ62;",
            "Ljava/util/List<",
            "+",
            "LX62;",
            ">;I)I"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurables"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LQ06$d;->a:LQ06;

    invoke-virtual {p2}, LQ06;->h()LF26;

    move-result-object p2

    invoke-virtual {p2}, LF26;->i()LT06;

    move-result-object v0

    const/4 p2, 0x0

    const v1, 0x7fffffff

    invoke-static {p2, p3, p2, v1}, Lnz0;->a(IIII)J

    move-result-wide v1

    invoke-interface {p1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, LT06;->n(LT06;JLpm2;Li26;ILjava/lang/Object;)Li26;

    move-result-object p1

    invoke-virtual {p1}, Li26;->A()J

    move-result-wide p1

    invoke-static {p1, p2}, LG52;->f(J)I

    move-result p1

    return p1
.end method
