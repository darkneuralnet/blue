.class final Lcom/stripe/android/stripe3ds2/views/ImageRepository$getImage$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/stripe3ds2/views/ImageRepository;->getImage$3ds2sdk_release(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Landroid/graphics/Bitmap;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "LZC0;",
        "Landroid/graphics/Bitmap;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.stripe3ds2.views.ImageRepository$getImage$2"
    f = "ImageRepository.kt"
    i = {}
    l = {
        0x21
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $imageUrl:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/stripe/android/stripe3ds2/views/ImageRepository;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/views/ImageRepository;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/stripe/android/stripe3ds2/views/ImageRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/stripe3ds2/views/ImageRepository$getImage$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ImageRepository$getImage$2;->$imageUrl:Ljava/lang/String;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/views/ImageRepository$getImage$2;->this$0:Lcom/stripe/android/stripe3ds2/views/ImageRepository;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance p1, Lcom/stripe/android/stripe3ds2/views/ImageRepository$getImage$2;

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ImageRepository$getImage$2;->$imageUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ImageRepository$getImage$2;->this$0:Lcom/stripe/android/stripe3ds2/views/ImageRepository;

    invoke-direct {p1, v0, v1, p2}, Lcom/stripe/android/stripe3ds2/views/ImageRepository$getImage$2;-><init>(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/views/ImageRepository;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZC0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/stripe3ds2/views/ImageRepository$getImage$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/stripe3ds2/views/ImageRepository$getImage$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/stripe3ds2/views/ImageRepository$getImage$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/stripe3ds2/views/ImageRepository$getImage$2;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/stripe/android/stripe3ds2/views/ImageRepository$getImage$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ImageRepository$getImage$2;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ImageRepository$getImage$2;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/stripe/android/stripe3ds2/views/ImageRepository;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ImageRepository$getImage$2;->$imageUrl:Ljava/lang/String;

    if-eqz p1, :cond_3

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ImageRepository$getImage$2;->this$0:Lcom/stripe/android/stripe3ds2/views/ImageRepository;

    invoke-static {v1, p1}, Lcom/stripe/android/stripe3ds2/views/ImageRepository;->access$getLocalImage(Lcom/stripe/android/stripe3ds2/views/ImageRepository;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v3

    if-nez v3, :cond_4

    iput-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ImageRepository$getImage$2;->L$0:Ljava/lang/Object;

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ImageRepository$getImage$2;->L$1:Ljava/lang/Object;

    iput v2, p0, Lcom/stripe/android/stripe3ds2/views/ImageRepository$getImage$2;->label:I

    invoke-static {v1, p1, p0}, Lcom/stripe/android/stripe3ds2/views/ImageRepository;->access$getRemoteImage(Lcom/stripe/android/stripe3ds2/views/ImageRepository;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    move-object p1, v2

    :goto_0
    move-object v3, p1

    check-cast v3, Landroid/graphics/Bitmap;

    invoke-static {v1, v0, v3}, Lcom/stripe/android/stripe3ds2/views/ImageRepository;->access$cacheImage(Lcom/stripe/android/stripe3ds2/views/ImageRepository;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :cond_4
    :goto_1
    return-object v3
.end method
