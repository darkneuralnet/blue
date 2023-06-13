.class public final Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a;\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0016\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0012"
    }
    d2 = {
        "",
        "text",
        "LgV2;",
        "modifier",
        "Lpm0;",
        "color",
        "LG26;",
        "style",
        "",
        "HyperlinkedText-cf5BqRc",
        "(Ljava/lang/String;LgV2;JLG26;LEt0;II)V",
        "HyperlinkedText",
        "",
        "Lcom/stripe/android/ui/core/elements/LinkAnnotation;",
        "extractLinkAnnotations",
        "Ljava/util/regex/Pattern;",
        "urlPattern",
        "Ljava/util/regex/Pattern;",
        "payments-ui-core_release"
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
        "SMAP\nHyperlinkedText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HyperlinkedText.kt\ncom/stripe/android/ui/core/elements/HyperlinkedTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n76#2:102\n76#2:103\n25#3:104\n36#3:111\n36#3:121\n1057#4,6:105\n1057#4,3:112\n1060#4,3:118\n1057#4,6:122\n916#5:115\n1855#6,2:116\n*S KotlinDebug\n*F\n+ 1 HyperlinkedText.kt\ncom/stripe/android/ui/core/elements/HyperlinkedTextKt\n*L\n25#1:102\n27#1:103\n28#1:104\n32#1:111\n62#1:121\n28#1:105,6\n32#1:112,3\n32#1:118,3\n62#1:122,6\n33#1:115\n35#1:116,2\n*E\n"
    }
.end annotation


# static fields
.field private static final urlPattern:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "(https?://[a-z0-9.-]+\\.[a-z]{2,3}(?:/\\S*?(?=\\.*(?:\\s|$)))?)"

    const/16 v1, 0x2a

    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    const-string v1, "compile(\n    \"(https?://\u2026ILINE or Pattern.DOTALL\n)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt;->urlPattern:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static final HyperlinkedText-cf5BqRc(Ljava/lang/String;LgV2;JLG26;LEt0;II)V
    .locals 35

    move-object/from16 v1, p0

    move/from16 v6, p6

    const-string v0, "text"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x63a0af46

    move-object/from16 v2, p5

    invoke-interface {v2, v0}, LEt0;->u(I)LEt0;

    move-result-object v2

    and-int/lit8 v3, p7, 0x1

    const/4 v4, 0x2

    if-eqz v3, :cond_0

    or-int/lit8 v3, v6, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v6, 0xe

    if-nez v3, :cond_2

    invoke-interface {v2, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    move v3, v4

    :goto_0
    or-int/2addr v3, v6

    goto :goto_1

    :cond_2
    move v3, v6

    :goto_1
    and-int/lit8 v5, p7, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v6, 0x70

    if-nez v7, :cond_5

    move-object/from16 v7, p1

    invoke-interface {v2, v7}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v3, v8

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v7, p1

    :goto_4
    and-int/lit8 v8, p7, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v3, v3, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v9, v6, 0x380

    if-nez v9, :cond_8

    move-wide/from16 v9, p2

    invoke-interface {v2, v9, v10}, LEt0;->s(J)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_5

    :cond_7
    const/16 v11, 0x80

    :goto_5
    or-int/2addr v3, v11

    goto :goto_7

    :cond_8
    :goto_6
    move-wide/from16 v9, p2

    :goto_7
    and-int/lit16 v11, v6, 0x1c00

    if-nez v11, :cond_b

    and-int/lit8 v11, p7, 0x8

    if-nez v11, :cond_9

    move-object/from16 v11, p4

    invoke-interface {v2, v11}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_8

    :cond_9
    move-object/from16 v11, p4

    :cond_a
    const/16 v12, 0x400

    :goto_8
    or-int/2addr v3, v12

    goto :goto_9

    :cond_b
    move-object/from16 v11, p4

    :goto_9
    and-int/lit16 v12, v3, 0x16db

    const/16 v13, 0x492

    if-ne v12, v13, :cond_d

    invoke-interface {v2}, LEt0;->b()Z

    move-result v12

    if-nez v12, :cond_c

    goto :goto_a

    :cond_c
    invoke-interface {v2}, LEt0;->k()V

    move-object v5, v7

    move-wide v3, v9

    goto/16 :goto_10

    :cond_d
    :goto_a
    invoke-interface {v2}, LEt0;->J()V

    and-int/lit8 v12, v6, 0x1

    if-eqz v12, :cond_10

    invoke-interface {v2}, LEt0;->l()Z

    move-result v12

    if-eqz v12, :cond_e

    goto :goto_c

    :cond_e
    invoke-interface {v2}, LEt0;->k()V

    and-int/lit8 v5, p7, 0x8

    if-eqz v5, :cond_f

    and-int/lit16 v3, v3, -0x1c01

    :cond_f
    move-object v5, v7

    move-wide/from16 v32, v9

    move v7, v3

    :goto_b
    move-object v3, v11

    goto :goto_e

    :cond_10
    :goto_c
    if-eqz v5, :cond_11

    sget-object v5, LgV2;->b0:LgV2$a;

    goto :goto_d

    :cond_11
    move-object v5, v7

    :goto_d
    if-eqz v8, :cond_12

    sget-object v7, Lpm0;->b:Lpm0$a;

    invoke-virtual {v7}, Lpm0$a;->g()J

    move-result-wide v7

    move-wide v9, v7

    :cond_12
    and-int/lit8 v7, p7, 0x8

    if-eqz v7, :cond_13

    invoke-static {}, Lc26;->f()LU94;

    move-result-object v7

    invoke-interface {v2, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LG26;

    and-int/lit16 v3, v3, -0x1c01

    move-wide/from16 v32, v9

    move-object/from16 v34, v7

    move v7, v3

    move-object/from16 v3, v34

    goto :goto_e

    :cond_13
    move v7, v3

    move-wide/from16 v32, v9

    goto :goto_b

    :goto_e
    invoke-interface {v2}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v8

    if-eqz v8, :cond_14

    const/4 v8, -0x1

    const-string v9, "com.stripe.android.ui.core.elements.HyperlinkedText (HyperlinkedText.kt:20)"

    invoke-static {v0, v7, v8, v9}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_14
    invoke-static {}, Lhu0;->p()LU94;

    move-result-object v0

    invoke-interface {v2, v0}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDf6;

    const v8, -0x1d58f75c

    invoke-interface {v2, v8}, LEt0;->F(I)V

    invoke-interface {v2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, LEt0;->a:LEt0$a;

    invoke-virtual {v9}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v10

    const/4 v11, 0x0

    if-ne v8, v10, :cond_15

    invoke-static {v11, v11, v4, v11}, LGM5;->h(Ljava/lang/Object;LEM5;ILjava/lang/Object;)LEX2;

    move-result-object v8

    invoke-interface {v2, v8}, LEt0;->z(Ljava/lang/Object;)V

    :cond_15
    invoke-interface {v2}, LEt0;->Q()V

    check-cast v8, LEX2;

    const v4, 0x44faf204

    invoke-interface {v2, v4}, LEt0;->F(I)V

    invoke-interface {v2, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v10

    invoke-interface {v2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v12

    if-nez v10, :cond_16

    invoke-virtual {v9}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v12, v9, :cond_18

    :cond_16
    new-instance v9, LDf$a;

    const/4 v10, 0x0

    const/4 v12, 0x1

    invoke-direct {v9, v10, v12, v11}, LDf$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v9, v1}, LDf$a;->i(Ljava/lang/String;)V

    invoke-static/range {p0 .. p0}, Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt;->access$extractLinkAnnotations(Ljava/lang/String;)Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_f
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_17

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/stripe/android/ui/core/elements/LinkAnnotation;

    invoke-virtual {v12}, Lcom/stripe/android/ui/core/elements/LinkAnnotation;->getUrl()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12}, Lcom/stripe/android/ui/core/elements/LinkAnnotation;->getStart()I

    move-result v14

    invoke-virtual {v12}, Lcom/stripe/android/ui/core/elements/LinkAnnotation;->getEnd()I

    move-result v12

    const-string v15, "URL"

    invoke-virtual {v9, v15, v13, v14, v12}, LDf$a;->a(Ljava/lang/String;Ljava/lang/String;II)V

    goto :goto_f

    :cond_17
    invoke-virtual {v9}, LDf$a;->l()LDf;

    move-result-object v12

    invoke-interface {v2, v12}, LEt0;->z(Ljava/lang/Object;)V

    :cond_18
    invoke-interface {v2}, LEt0;->Q()V

    move-object v9, v12

    check-cast v9, LDf;

    sget-object v10, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    new-instance v12, Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt$HyperlinkedText$1;

    invoke-direct {v12, v8, v9, v0, v11}, Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt$HyperlinkedText$1;-><init>(LEX2;LDf;LDf6;Lkotlin/coroutines/Continuation;)V

    invoke-static {v5, v10, v12}, LzW5;->c(LgV2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)LgV2;

    move-result-object v0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-interface {v2, v4}, LEt0;->F(I)V

    invoke-interface {v2, v8}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v10

    if-nez v4, :cond_19

    sget-object v4, LEt0;->a:LEt0$a;

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v10, v4, :cond_1a

    :cond_19
    new-instance v10, Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt$HyperlinkedText$2$1;

    invoke-direct {v10, v8}, Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt$HyperlinkedText$2$1;-><init>(LEX2;)V

    invoke-interface {v2, v10}, LEt0;->z(Ljava/lang/Object;)V

    :cond_1a
    invoke-interface {v2}, LEt0;->Q()V

    move-object/from16 v26, v10

    check-cast v26, Lkotlin/jvm/functions/Function1;

    and-int/lit16 v4, v7, 0x380

    move/from16 v29, v4

    shl-int/lit8 v4, v7, 0x9

    const/high16 v7, 0x380000

    and-int v30, v4, v7

    const/16 v31, 0x7ff8

    move-object v7, v9

    move-object v8, v0

    move-wide/from16 v9, v32

    move-object/from16 v27, v3

    move-object/from16 v28, v2

    invoke-static/range {v7 .. v31}, Lc26;->b(LDf;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-static {}, LQt0;->Y()V

    :cond_1b
    move-object v11, v3

    move-wide/from16 v3, v32

    :goto_10
    invoke-interface {v2}, LEt0;->w()LWm5;

    move-result-object v8

    if-nez v8, :cond_1c

    goto :goto_11

    :cond_1c
    new-instance v9, Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt$HyperlinkedText$3;

    move-object v0, v9

    move-object/from16 v1, p0

    move-object v2, v5

    move-object v5, v11

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt$HyperlinkedText$3;-><init>(Ljava/lang/String;LgV2;JLG26;II)V

    invoke-interface {v8, v9}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_11
    return-void
.end method

.method public static final synthetic access$extractLinkAnnotations(Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt;->extractLinkAnnotations(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final extractLinkAnnotations(Ljava/lang/String;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/LinkAnnotation;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/stripe/android/ui/core/elements/HyperlinkedTextKt;->urlPattern:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/util/regex/Matcher;->start(I)I

    move-result v2

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    move-result v3

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    const-string v5, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "http://"

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v4, v5, v6, v7, v8}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    const-string v5, "https://"

    invoke-static {v4, v5, v6, v7, v8}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :cond_0
    new-instance v5, Lcom/stripe/android/ui/core/elements/LinkAnnotation;

    invoke-direct {v5, v4, v2, v3}, Lcom/stripe/android/ui/core/elements/LinkAnnotation;-><init>(Ljava/lang/String;II)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method
