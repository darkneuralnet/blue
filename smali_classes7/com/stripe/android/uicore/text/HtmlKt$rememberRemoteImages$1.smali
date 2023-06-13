.class final Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/text/HtmlKt;->rememberRemoteImages-XiPi2c8(LDf;Ljava/util/Map;Lcom/stripe/android/uicore/image/StripeImageLoader;ILkotlin/jvm/functions/Function0;LEt0;I)LsP5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LZC0;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.uicore.text.HtmlKt$rememberRemoteImages$1"
    f = "Html.kt"
    i = {}
    l = {
        0xa7
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHtml.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Html.kt\ncom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,433:1\n1549#2:434\n1620#2,3:435\n1603#2,9:438\n1855#2:447\n1856#2:449\n1612#2:450\n1238#2,4:453\n1#3:448\n442#4:451\n392#4:452\n*S KotlinDebug\n*F\n+ 1 Html.kt\ncom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1\n*L\n161#1:434\n161#1:435,3\n167#1:438,9\n167#1:447\n167#1:449\n167#1:450\n172#1:453,4\n167#1:448\n172#1:451\n172#1:452\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $imageAlign:I

.field final synthetic $localDensity:Lg01;

.field final synthetic $onLoaded:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $remoteImages:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LL22;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $remoteUrls:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LDf$b<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $stripeImageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Ljava/util/List;LGX2;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/uicore/image/StripeImageLoader;Lg01;ILkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LDf$b<",
            "Ljava/lang/String;",
            ">;>;",
            "LGX2<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LL22;",
            ">;>;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/stripe/android/uicore/image/StripeImageLoader;",
            "Lg01;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->$remoteUrls:Ljava/util/List;

    iput-object p2, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->$remoteImages:LGX2;

    iput-object p3, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->$onLoaded:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->$stripeImageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iput-object p5, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->$localDensity:Lg01;

    iput p6, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->$imageAlign:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9
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

    new-instance v8, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;

    iget-object v1, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->$remoteUrls:Ljava/util/List;

    iget-object v2, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->$remoteImages:LGX2;

    iget-object v3, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->$onLoaded:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->$stripeImageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iget-object v5, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->$localDensity:Lg01;

    iget v6, p0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->$imageAlign:I

    move-object v0, v8

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;-><init>(Ljava/util/List;LGX2;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/uicore/image/StripeImageLoader;Lg01;ILkotlin/coroutines/Continuation;)V

    iput-object p1, v8, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->L$0:Ljava/lang/Object;

    return-object v8
.end method

.method public final invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v2, v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->L$0:Ljava/lang/Object;

    check-cast v2, LZC0;

    iget-object v5, v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->$remoteUrls:Ljava/util/List;

    check-cast v5, Ljava/lang/Iterable;

    iget-object v11, v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->$stripeImageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v5, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v12, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LDf$b;

    const/4 v6, 0x0

    const/4 v7, 0x0

    new-instance v8, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$deferred$1$1;

    invoke-direct {v8, v5, v11, v3}, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$deferred$1$1;-><init>(LDf$b;Lcom/stripe/android/uicore/image/StripeImageLoader;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    move-object v5, v2

    invoke-static/range {v5 .. v10}, LX30;->b(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LhZ0;

    move-result-object v5

    invoke-interface {v12, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iput v4, v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->label:I

    invoke-static {v12, v0}, LVu;->a(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast v2, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lkotlin/Pair;

    invoke-virtual {v5}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/Bitmap;

    if-eqz v6, :cond_5

    new-instance v7, Lkotlin/Pair;

    invoke-virtual {v5}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v7, v5, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    move-object v7, v3

    :goto_3
    if-eqz v7, :cond_4

    invoke-interface {v1, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    invoke-static {v1}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->$remoteImages:LGX2;

    iget-object v3, v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->$localDensity:Lg01;

    iget v12, v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->$imageAlign:I

    iget-object v13, v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->$stripeImageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    new-instance v14, Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v5

    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v5

    invoke-direct {v14, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v15, v5

    check-cast v15, Ljava/util/Map$Entry;

    invoke-interface {v15}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v15}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    int-to-float v5, v5

    invoke-interface {v15}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    int-to-float v6, v6

    invoke-static {v5, v6}, LCB5;->a(FF)J

    move-result-wide v5

    int-to-float v7, v4

    invoke-interface {v3}, Lg01;->b()F

    move-result v8

    div-float/2addr v7, v8

    invoke-static {v5, v6, v7}, LxB5;->l(JF)J

    move-result-wide v8

    new-instance v10, LL22;

    new-instance v6, LTU3;

    invoke-static {v8, v9}, LxB5;->i(J)F

    move-result v5

    invoke-static {v5}, LN26;->e(F)J

    move-result-wide v16

    invoke-static {v8, v9}, LxB5;->g(J)F

    move-result v5

    invoke-static {v5}, LN26;->e(F)J

    move-result-wide v18

    const/16 v20, 0x0

    move-object v5, v6

    move-object/from16 v21, v6

    move-wide/from16 v6, v16

    move-wide/from16 v22, v8

    move-wide/from16 v8, v18

    move-object/from16 v24, v10

    move v10, v12

    move-object/from16 v25, v11

    move-object/from16 v11, v20

    invoke-direct/range {v5 .. v11}, LTU3;-><init>(JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1$1;

    move-wide/from16 v6, v22

    invoke-direct {v5, v15, v13, v6, v7}, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1$1$1;-><init>(Ljava/util/Map$Entry;Lcom/stripe/android/uicore/image/StripeImageLoader;J)V

    const v6, 0x33320e15

    invoke-static {v6, v4, v5}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object v5

    move-object/from16 v7, v21

    move-object/from16 v6, v24

    invoke-direct {v6, v7, v5}, LL22;-><init>(LTU3;Lkotlin/jvm/functions/Function3;)V

    move-object/from16 v5, v25

    invoke-interface {v14, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_7
    invoke-interface {v2, v14}, LGX2;->setValue(Ljava/lang/Object;)V

    iget-object v1, v0, Lcom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1;->$onLoaded:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method
