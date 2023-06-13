.class public final Ld10$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LxO2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld10;->d(LK9;Z)LxO2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n"
    }
    d2 = {
        "LzO2;",
        "",
        "LvO2;",
        "measurables",
        "Lkz0;",
        "constraints",
        "LyO2;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt$boxMeasurePolicy$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,287:1\n49#2,6:288\n49#2,6:294\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt$boxMeasurePolicy$1\n*L\n135#1:288,6\n155#1:294,6\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:LK9;


# direct methods
.method public constructor <init>(ZLK9;)V
    .locals 0

    iput-boolean p1, p0, Ld10$c;->a:Z

    iput-object p2, p0, Ld10$c;->b:LK9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LzO2;Ljava/util/List;J)LyO2;
    .locals 18
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

    move-object/from16 v3, p2

    const-string v1, "$this$MeasurePolicy"

    move-object/from16 v9, p1

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "measurables"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static/range {p3 .. p4}, Lkz0;->p(J)I

    move-result v3

    invoke-static/range {p3 .. p4}, Lkz0;->o(J)I

    move-result v4

    const/4 v5, 0x0

    sget-object v6, Ld10$c$a;->g:Ld10$c$a;

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, LzO2;->Y(LzO2;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LyO2;

    move-result-object v1

    return-object v1

    :cond_0
    iget-boolean v1, v0, Ld10$c;->a:Z

    if-eqz v1, :cond_1

    move-wide/from16 v1, p3

    goto :goto_0

    :cond_1
    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0xa

    const/16 v17, 0x0

    move-wide/from16 v10, p3

    invoke-static/range {v10 .. v17}, Lkz0;->e(JIIIIILjava/lang/Object;)J

    move-result-wide v1

    :goto_0
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-ne v4, v5, :cond_3

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LvO2;

    invoke-static {v4}, Ld10;->b(LvO2;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-interface {v4, v1, v2}, LvO2;->P0(J)LOU3;

    move-result-object v1

    invoke-static/range {p3 .. p4}, Lkz0;->p(J)I

    move-result v2

    invoke-virtual {v1}, LOU3;->i1()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static/range {p3 .. p4}, Lkz0;->o(J)I

    move-result v3

    invoke-virtual {v1}, LOU3;->d1()I

    move-result v5

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    move v10, v3

    move-object v3, v1

    move v1, v2

    goto :goto_1

    :cond_2
    invoke-static/range {p3 .. p4}, Lkz0;->p(J)I

    move-result v1

    invoke-static/range {p3 .. p4}, Lkz0;->o(J)I

    move-result v2

    sget-object v3, Lkz0;->b:Lkz0$a;

    invoke-static/range {p3 .. p4}, Lkz0;->p(J)I

    move-result v5

    invoke-static/range {p3 .. p4}, Lkz0;->o(J)I

    move-result v6

    invoke-virtual {v3, v5, v6}, Lkz0$a;->c(II)J

    move-result-wide v5

    invoke-interface {v4, v5, v6}, LvO2;->P0(J)LOU3;

    move-result-object v3

    move v10, v2

    :goto_1
    const/4 v11, 0x0

    new-instance v12, Ld10$c$b;

    iget-object v8, v0, Ld10$c;->b:LK9;

    move-object v2, v12

    move-object/from16 v5, p1

    move v6, v1

    move v7, v10

    invoke-direct/range {v2 .. v8}, Ld10$c$b;-><init>(LOU3;LvO2;LzO2;IILK9;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object/from16 v2, p1

    move v3, v1

    move v4, v10

    move-object v5, v11

    move-object v6, v12

    invoke-static/range {v2 .. v8}, LzO2;->Y(LzO2;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LyO2;

    move-result-object v1

    return-object v1

    :cond_3
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v4

    new-array v4, v4, [LOU3;

    new-instance v7, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    invoke-static/range {p3 .. p4}, Lkz0;->p(J)I

    move-result v8

    iput v8, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    new-instance v8, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v8}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    invoke-static/range {p3 .. p4}, Lkz0;->o(J)I

    move-result v10

    iput v10, v8, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v10

    move v11, v6

    move v12, v11

    :goto_2
    if-ge v11, v10, :cond_5

    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LvO2;

    invoke-static {v13}, Ld10;->b(LvO2;)Z

    move-result v14

    if-nez v14, :cond_4

    invoke-interface {v13, v1, v2}, LvO2;->P0(J)LOU3;

    move-result-object v13

    aput-object v13, v4, v11

    iget v14, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual {v13}, LOU3;->i1()I

    move-result v15

    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    move-result v14

    iput v14, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget v14, v8, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual {v13}, LOU3;->d1()I

    move-result v13

    invoke-static {v14, v13}, Ljava/lang/Math;->max(II)I

    move-result v13

    iput v13, v8, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    goto :goto_3

    :cond_4
    move v12, v5

    :goto_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_5
    if-eqz v12, :cond_9

    iget v1, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const v2, 0x7fffffff

    if-eq v1, v2, :cond_6

    move v5, v1

    goto :goto_4

    :cond_6
    move v5, v6

    :goto_4
    iget v10, v8, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-eq v10, v2, :cond_7

    move v2, v10

    goto :goto_5

    :cond_7
    move v2, v6

    :goto_5
    invoke-static {v5, v1, v2, v10}, Lnz0;->a(IIII)J

    move-result-wide v1

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v5

    :goto_6
    if-ge v6, v5, :cond_9

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LvO2;

    invoke-static {v10}, Ld10;->b(LvO2;)Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v10, v1, v2}, LvO2;->P0(J)LOU3;

    move-result-object v10

    aput-object v10, v4, v6

    :cond_8
    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_9
    iget v10, v7, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget v11, v8, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/4 v12, 0x0

    new-instance v13, Ld10$c$c;

    iget-object v14, v0, Ld10$c;->b:LK9;

    move-object v1, v13

    move-object v2, v4

    move-object/from16 v3, p2

    move-object/from16 v4, p1

    move-object v5, v7

    move-object v6, v8

    move-object v7, v14

    invoke-direct/range {v1 .. v7}, Ld10$c$c;-><init>([LOU3;Ljava/util/List;LzO2;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;LK9;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object/from16 v2, p1

    move v3, v10

    move v4, v11

    move-object v5, v12

    move-object v6, v13

    invoke-static/range {v2 .. v8}, LzO2;->Y(LzO2;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LyO2;

    move-result-object v1

    return-object v1
.end method
