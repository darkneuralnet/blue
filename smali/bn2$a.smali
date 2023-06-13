.class public final Lbn2$a;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbn2;->d(Lcn2;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LWp5;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "LWp5;",
        "",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2"
    f = "LazyAnimateScroll.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x1
    }
    l = {
        0x89,
        0xe9
    }
    m = "invokeSuspend"
    n = {
        "$this$scroll",
        "loop",
        "anim",
        "loops",
        "targetDistancePx",
        "boundDistancePx",
        "minDistancePx",
        "forward",
        "$this$scroll"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "F$0",
        "F$1",
        "F$2",
        "I$0",
        "L$0"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLazyAnimateScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt\n*L\n1#1,264:1\n1#2:265\n40#3,4:266\n40#3,4:270\n*S KotlinDebug\n*F\n+ 1 LazyAnimateScroll.kt\nandroidx/compose/foundation/lazy/layout/LazyAnimateScrollKt$animateScrollToItem$2\n*L\n129#1:266,4\n230#1:270,4\n*E\n"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:F

.field public l:F

.field public m:F

.field public n:I

.field public o:I

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:I

.field public final synthetic r:Lcn2;

.field public final synthetic s:I


# direct methods
.method public constructor <init>(ILcn2;ILkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcn2;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lbn2$a;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Lbn2$a;->q:I

    iput-object p2, p0, Lbn2$a;->r:Lcn2;

    iput p3, p0, Lbn2$a;->s:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method public static final synthetic e(ZLcn2;II)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbn2$a;->g(ZLcn2;II)Z

    move-result p0

    return p0
.end method

.method public static final g(ZLcn2;II)Z
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p0, :cond_1

    invoke-interface {p1}, Lcn2;->c()I

    move-result p0

    if-le p0, p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lcn2;->c()I

    move-result p0

    if-ne p0, p2, :cond_3

    invoke-interface {p1}, Lcn2;->i()I

    move-result p0

    if-le p0, p3, :cond_3

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lcn2;->c()I

    move-result p0

    if-ge p0, p2, :cond_2

    :goto_0
    move v0, v1

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Lcn2;->c()I

    move-result p0

    if-ne p0, p2, :cond_3

    invoke-interface {p1}, Lcn2;->i()I

    move-result p0

    if-ge p0, p3, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    return v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lbn2$a;

    iget v1, p0, Lbn2$a;->q:I

    iget-object v2, p0, Lbn2$a;->r:Lcn2;

    iget v3, p0, Lbn2$a;->s:I

    invoke-direct {v0, v1, v2, v3, p2}, Lbn2$a;-><init>(ILcn2;ILkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lbn2$a;->p:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(LWp5;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWp5;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lbn2$a;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lbn2$a;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lbn2$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWp5;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lbn2$a;->f(LWp5;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    move-object/from16 v1, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    iget v0, v1, Lbn2$a;->o:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v6, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v6, :cond_1

    if-ne v0, v3, :cond_0

    iget-object v0, v1, Lbn2$a;->p:Ljava/lang/Object;

    check-cast v0, LWp5;

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_c

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, v1, Lbn2$a;->n:I

    iget v7, v1, Lbn2$a;->m:F

    iget v8, v1, Lbn2$a;->l:F

    iget v9, v1, Lbn2$a;->k:F

    iget-object v10, v1, Lbn2$a;->j:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/internal/Ref$IntRef;

    iget-object v11, v1, Lbn2$a;->i:Ljava/lang/Object;

    check-cast v11, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v12, v1, Lbn2$a;->h:Ljava/lang/Object;

    check-cast v12, Lkotlin/jvm/internal/Ref$BooleanRef;

    iget-object v13, v1, Lbn2$a;->p:Ljava/lang/Object;

    check-cast v13, LWp5;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Lec2; {:try_start_0 .. :try_end_0} :catch_0

    move v15, v8

    move v14, v9

    move-object v9, v1

    move-object/from16 v35, v13

    move-object v13, v10

    move-object/from16 v10, v35

    move-object/from16 v36, v12

    move-object v12, v11

    move-object/from16 v11, v36

    goto/16 :goto_7

    :catch_0
    move-exception v0

    move-object v3, v0

    move-object v0, v13

    goto/16 :goto_a

    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v0, v1, Lbn2$a;->p:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, LWp5;

    iget v0, v1, Lbn2$a;->q:I

    int-to-float v8, v0

    cmpl-float v8, v8, v4

    if-ltz v8, :cond_3

    move v8, v6

    goto :goto_0

    :cond_3
    const/4 v8, 0x0

    :goto_0
    if-eqz v8, :cond_10

    :try_start_1
    iget-object v0, v1, Lbn2$a;->r:Lcn2;

    invoke-interface {v0}, Lcn2;->b()Lg01;

    move-result-object v0

    invoke-static {}, Lbn2;->c()F

    move-result v8

    invoke-interface {v0, v8}, Lg01;->T0(F)F

    move-result v0

    iget-object v8, v1, Lbn2$a;->r:Lcn2;

    invoke-interface {v8}, Lcn2;->b()Lg01;

    move-result-object v8

    invoke-static {}, Lbn2;->a()F

    move-result v9

    invoke-interface {v8, v9}, Lg01;->T0(F)F

    move-result v8

    iget-object v9, v1, Lbn2$a;->r:Lcn2;

    invoke-interface {v9}, Lcn2;->b()Lg01;

    move-result-object v9

    invoke-static {}, Lbn2;->b()F

    move-result v10

    invoke-interface {v9, v10}, Lg01;->T0(F)F

    move-result v9

    new-instance v10, Lkotlin/jvm/internal/Ref$BooleanRef;

    invoke-direct {v10}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    iput-boolean v6, v10, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    new-instance v11, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v11}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1e

    const/16 v20, 0x0

    invoke-static/range {v12 .. v20}, Lof;->b(FFJJZILjava/lang/Object;)Lnf;

    move-result-object v12

    iput-object v12, v11, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    iget-object v12, v1, Lbn2$a;->r:Lcn2;

    iget v13, v1, Lbn2$a;->q:I

    invoke-interface {v12, v13}, Lcn2;->e(I)Ljava/lang/Integer;

    move-result-object v12

    if-nez v12, :cond_c

    iget v12, v1, Lbn2$a;->q:I

    iget-object v13, v1, Lbn2$a;->r:Lcn2;

    invoke-interface {v13}, Lcn2;->c()I

    move-result v13

    if-le v12, v13, :cond_4

    move v12, v6

    goto :goto_1

    :cond_4
    const/4 v12, 0x0

    :goto_1
    new-instance v13, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v13}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    iput v6, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I
    :try_end_1
    .catch Lec2; {:try_start_1 .. :try_end_1} :catch_5

    move v14, v0

    move v15, v8

    move v0, v12

    move-object v12, v11

    move-object v11, v10

    move-object v10, v7

    move v7, v9

    move-object v9, v1

    :goto_2
    :try_start_2
    iget-boolean v8, v11, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    if-eqz v8, :cond_f

    iget-object v8, v9, Lbn2$a;->r:Lcn2;

    invoke-interface {v8}, Lcn2;->getItemCount()I

    move-result v8

    if-lez v8, :cond_f

    iget-object v8, v9, Lbn2$a;->r:Lcn2;

    iget v5, v9, Lbn2$a;->q:I

    iget v3, v9, Lbn2$a;->s:I

    invoke-interface {v8, v5, v3}, Lcn2;->a(II)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v5
    :try_end_2
    .catch Lec2; {:try_start_2 .. :try_end_2} :catch_4

    cmpg-float v5, v5, v14

    if-gez v5, :cond_6

    :try_start_3
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    invoke-static {v3, v7}, Ljava/lang/Math;->max(FF)F

    move-result v3
    :try_end_3
    .catch Lec2; {:try_start_3 .. :try_end_3} :catch_1

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    neg-float v3, v3

    goto :goto_3

    :cond_6
    if-eqz v0, :cond_7

    move v3, v14

    goto :goto_3

    :cond_7
    neg-float v3, v14

    :goto_3
    :try_start_4
    iget-object v5, v12, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object/from16 v25, v5

    check-cast v25, Lnf;

    const/16 v26, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x1e

    const/16 v34, 0x0

    invoke-static/range {v25 .. v34}, Lof;->e(Lnf;FFJJZILjava/lang/Object;)Lnf;

    move-result-object v5

    iput-object v5, v12, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    new-instance v5, Lkotlin/jvm/internal/Ref$FloatRef;

    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    iget-object v8, v12, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object/from16 v20, v8

    check-cast v20, Lnf;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    move-result-object v21

    const/16 v22, 0x0

    iget-object v8, v12, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v8, Lnf;

    invoke-virtual {v8}, Lnf;->h()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v8

    cmpg-float v8, v8, v4

    if-nez v8, :cond_8

    move v8, v6

    goto :goto_4

    :cond_8
    const/4 v8, 0x0

    :goto_4
    if-nez v8, :cond_9

    move/from16 v23, v6

    goto :goto_5

    :cond_9
    const/16 v23, 0x0

    :goto_5
    new-instance v25, Lbn2$a$a;

    iget-object v8, v9, Lbn2$a;->r:Lcn2;

    iget v4, v9, Lbn2$a;->q:I

    if-eqz v0, :cond_a

    move/from16 v16, v6

    goto :goto_6

    :cond_a
    const/16 v16, 0x0

    :goto_6
    iget v6, v9, Lbn2$a;->s:I
    :try_end_4
    .catch Lec2; {:try_start_4 .. :try_end_4} :catch_4

    move-object/from16 v17, v8

    move-object/from16 v8, v25

    move-object v1, v9

    move-object/from16 v9, v17

    move-object/from16 p1, v10

    move v10, v4

    move-object v4, v11

    move v11, v3

    move-object v3, v12

    move-object v12, v5

    move-object v5, v13

    move-object/from16 v13, p1

    move-object/from16 v28, v2

    move v2, v14

    move-object v14, v4

    move/from16 v29, v15

    move/from16 v15, v16

    move/from16 v16, v29

    move-object/from16 v17, v5

    move/from16 v18, v6

    move-object/from16 v19, v3

    :try_start_5
    invoke-direct/range {v8 .. v19}, Lbn2$a$a;-><init>(Lcn2;IFLkotlin/jvm/internal/Ref$FloatRef;LWp5;Lkotlin/jvm/internal/Ref$BooleanRef;ZFLkotlin/jvm/internal/Ref$IntRef;ILkotlin/jvm/internal/Ref$ObjectRef;)V
    :try_end_5
    .catch Lec2; {:try_start_5 .. :try_end_5} :catch_3

    const/4 v6, 0x2

    const/4 v8, 0x0

    move-object/from16 v9, p1

    :try_start_6
    iput-object v9, v1, Lbn2$a;->p:Ljava/lang/Object;

    iput-object v4, v1, Lbn2$a;->h:Ljava/lang/Object;

    iput-object v3, v1, Lbn2$a;->i:Ljava/lang/Object;

    iput-object v5, v1, Lbn2$a;->j:Ljava/lang/Object;

    iput v2, v1, Lbn2$a;->k:F

    move/from16 v10, v29

    iput v10, v1, Lbn2$a;->l:F

    iput v7, v1, Lbn2$a;->m:F

    iput v0, v1, Lbn2$a;->n:I

    const/4 v11, 0x1

    iput v11, v1, Lbn2$a;->o:I

    move-object/from16 v16, v20

    move-object/from16 v17, v21

    move-object/from16 v18, v22

    move/from16 v19, v23

    move-object/from16 v20, v25

    move-object/from16 v21, v1

    move/from16 v22, v6

    move-object/from16 v23, v8

    invoke-static/range {v16 .. v23}, LuW5;->j(Lnf;Ljava/lang/Object;Llf;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_6
    .catch Lec2; {:try_start_6 .. :try_end_6} :catch_2

    move-object/from16 v8, v28

    if-ne v6, v8, :cond_b

    return-object v8

    :cond_b
    move v14, v2

    move-object v12, v3

    move-object v11, v4

    move-object v13, v5

    move-object v2, v8

    move v15, v10

    move-object v10, v9

    move-object v9, v1

    :goto_7
    :try_start_7
    iget v1, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    const/4 v3, 0x1

    add-int/2addr v1, v3

    iput v1, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I
    :try_end_7
    .catch Lec2; {:try_start_7 .. :try_end_7} :catch_1

    move-object/from16 v1, p0

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v6, 0x1

    goto/16 :goto_2

    :catch_1
    move-exception v0

    move-object v3, v0

    move-object v1, v9

    move-object v0, v10

    goto :goto_a

    :catch_2
    move-exception v0

    goto :goto_8

    :catch_3
    move-exception v0

    move-object/from16 v9, p1

    :goto_8
    move-object/from16 v8, v28

    move-object v3, v0

    move-object v2, v8

    goto :goto_9

    :catch_4
    move-exception v0

    move-object v8, v2

    move-object v1, v9

    move-object v9, v10

    move-object v3, v0

    :goto_9
    move-object v0, v9

    goto :goto_a

    :cond_c
    :try_start_8
    new-instance v0, Lec2;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v3, v11, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Lnf;

    invoke-direct {v0, v1, v3}, Lec2;-><init>(ILnf;)V

    throw v0
    :try_end_8
    .catch Lec2; {:try_start_8 .. :try_end_8} :catch_5

    :catch_5
    move-exception v0

    move-object/from16 v1, p0

    move-object v3, v0

    move-object v0, v7

    :goto_a
    invoke-virtual {v3}, Lec2;->b()Lnf;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x1e

    const/4 v13, 0x0

    invoke-static/range {v4 .. v13}, Lof;->e(Lnf;FFJJZILjava/lang/Object;)Lnf;

    move-result-object v4

    invoke-virtual {v3}, Lec2;->a()I

    move-result v3

    iget v5, v1, Lbn2$a;->s:I

    add-int/2addr v3, v5

    int-to-float v3, v3

    new-instance v5, Lkotlin/jvm/internal/Ref$FloatRef;

    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v4}, Lnf;->h()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v8

    const/4 v9, 0x0

    cmpg-float v8, v8, v9

    if-nez v8, :cond_d

    const/16 v24, 0x1

    goto :goto_b

    :cond_d
    const/16 v24, 0x0

    :goto_b
    const/4 v8, 0x1

    xor-int/lit8 v8, v24, 0x1

    new-instance v9, Lbn2$a$b;

    invoke-direct {v9, v3, v5, v0}, Lbn2$a$b;-><init>(FLkotlin/jvm/internal/Ref$FloatRef;LWp5;)V

    const/4 v10, 0x2

    const/4 v11, 0x0

    iput-object v0, v1, Lbn2$a;->p:Ljava/lang/Object;

    const/4 v3, 0x0

    iput-object v3, v1, Lbn2$a;->h:Ljava/lang/Object;

    iput-object v3, v1, Lbn2$a;->i:Ljava/lang/Object;

    iput-object v3, v1, Lbn2$a;->j:Ljava/lang/Object;

    const/4 v3, 0x2

    iput v3, v1, Lbn2$a;->o:I

    move-object v3, v4

    move-object v4, v6

    move-object v5, v7

    move v6, v8

    move-object v7, v9

    move-object v8, v1

    move v9, v10

    move-object v10, v11

    invoke-static/range {v3 .. v10}, LuW5;->j(Lnf;Ljava/lang/Object;Llf;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_e

    return-object v2

    :cond_e
    :goto_c
    iget-object v2, v1, Lbn2$a;->r:Lcn2;

    iget v3, v1, Lbn2$a;->q:I

    iget v1, v1, Lbn2$a;->s:I

    invoke-interface {v2, v0, v3, v1}, Lcn2;->f(LWp5;II)V

    :cond_f
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :cond_10
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Index should be non-negative ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
