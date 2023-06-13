.class public final Led;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u001aa\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\rH\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001aW\u0010\u0012\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0011\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0013"
    }
    d2 = {
        "LRW2;",
        "Lme0;",
        "canvas",
        "La30;",
        "brush",
        "",
        "alpha",
        "LPx5;",
        "shadow",
        "LR06;",
        "decoration",
        "LJ61;",
        "drawStyle",
        "LLW;",
        "blendMode",
        "",
        "a",
        "(LRW2;Lme0;La30;FLPx5;LR06;LJ61;I)V",
        "b",
        "ui-text_release"
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
        "SMAP\nAndroidMultiParagraphDraw.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMultiParagraphDraw.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDrawKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,97:1\n33#2,6:98\n33#2,6:104\n33#2,6:110\n*S KotlinDebug\n*F\n+ 1 AndroidMultiParagraphDraw.kt\nandroidx/compose/ui/text/platform/AndroidMultiParagraphDrawKt\n*L\n55#1:98,6\n62#1:104,6\n93#1:110,6\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(LRW2;Lme0;La30;FLPx5;LR06;LJ61;I)V
    .locals 16

    move-object/from16 v8, p1

    move-object/from16 v0, p2

    const-string v1, "$this$drawMultiParagraph"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "canvas"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "brush"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p1 .. p1}, Lme0;->v()V

    invoke-virtual/range {p0 .. p0}, LRW2;->v()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v3, 0x1

    if-gt v1, v3, :cond_0

    invoke-static/range {p0 .. p7}, Led;->b(LRW2;Lme0;La30;FLPx5;LR06;LJ61;I)V

    goto/16 :goto_2

    :cond_0
    instance-of v1, v0, LpN5;

    if-eqz v1, :cond_1

    invoke-static/range {p0 .. p7}, Led;->b(LRW2;Lme0;La30;FLPx5;LR06;LJ61;I)V

    goto/16 :goto_2

    :cond_1
    instance-of v1, v0, LLx5;

    if-eqz v1, :cond_3

    invoke-virtual/range {p0 .. p0}, LRW2;->v()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    const/4 v9, 0x0

    move v5, v4

    move v6, v9

    move v7, v6

    :goto_0
    if-ge v5, v3, :cond_2

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LyE3;

    invoke-virtual {v10}, LyE3;->e()LxE3;

    move-result-object v11

    invoke-interface {v11}, LxE3;->getHeight()F

    move-result v11

    add-float/2addr v7, v11

    invoke-virtual {v10}, LyE3;->e()LxE3;

    move-result-object v10

    invoke-interface {v10}, LxE3;->getWidth()F

    move-result v10

    invoke-static {v6, v10}, Ljava/lang/Math;->max(FF)F

    move-result v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    check-cast v0, LLx5;

    invoke-static {v6, v7}, LCB5;->a(FF)J

    move-result-wide v5

    invoke-virtual {v0, v5, v6}, LLx5;->b(J)Landroid/graphics/Shader;

    move-result-object v10

    new-instance v11, Landroid/graphics/Matrix;

    invoke-direct {v11}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v10, v11}, Landroid/graphics/Shader;->getLocalMatrix(Landroid/graphics/Matrix;)Z

    invoke-virtual/range {p0 .. p0}, LRW2;->v()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v13

    move v14, v4

    :goto_1
    if-ge v14, v13, :cond_3

    invoke-interface {v12, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, LyE3;

    invoke-virtual {v15}, LyE3;->e()LxE3;

    move-result-object v0

    invoke-static {v10}, Lb30;->a(Landroid/graphics/Shader;)LLx5;

    move-result-object v2

    move-object/from16 v1, p1

    move/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    invoke-interface/range {v0 .. v7}, LxE3;->r(Lme0;La30;FLPx5;LR06;LJ61;I)V

    invoke-virtual {v15}, LyE3;->e()LxE3;

    move-result-object v0

    invoke-interface {v0}, LxE3;->getHeight()F

    move-result v0

    invoke-interface {v8, v9, v0}, Lme0;->b(FF)V

    invoke-virtual {v15}, LyE3;->e()LxE3;

    move-result-object v0

    invoke-interface {v0}, LxE3;->getHeight()F

    move-result v0

    neg-float v0, v0

    invoke-virtual {v11, v9, v0}, Landroid/graphics/Matrix;->setTranslate(FF)V

    invoke-virtual {v10, v11}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    invoke-interface/range {p1 .. p1}, Lme0;->p()V

    return-void
.end method

.method public static final b(LRW2;Lme0;La30;FLPx5;LR06;LJ61;I)V
    .locals 12

    invoke-virtual {p0}, LRW2;->v()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LyE3;

    invoke-virtual {v3}, LyE3;->e()LxE3;

    move-result-object v4

    move-object v5, p1

    move-object v6, p2

    move v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    move/from16 v11, p7

    invoke-interface/range {v4 .. v11}, LxE3;->r(Lme0;La30;FLPx5;LR06;LJ61;I)V

    invoke-virtual {v3}, LyE3;->e()LxE3;

    move-result-object v3

    invoke-interface {v3}, LxE3;->getHeight()F

    move-result v3

    const/4 v4, 0x0

    invoke-interface {p1, v4, v3}, Lme0;->b(FF)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
