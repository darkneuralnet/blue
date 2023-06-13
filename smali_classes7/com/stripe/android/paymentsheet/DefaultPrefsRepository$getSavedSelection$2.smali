.class final Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$getSavedSelection$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;->getSavedSelection(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"
    }
    d2 = {
        "LZC0;",
        "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
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
    c = "com.stripe.android.paymentsheet.DefaultPrefsRepository$getSavedSelection$2"
    f = "DefaultPrefsRepository.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDefaultPrefsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultPrefsRepository.kt\ncom/stripe/android/paymentsheet/DefaultPrefsRepository$getSavedSelection$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $isGooglePayAvailable:Z

.field final synthetic $isLinkAvailable:Z

.field label:I

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;ZZLkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;",
            "ZZ",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$getSavedSelection$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$getSavedSelection$2;->this$0:Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;

    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$getSavedSelection$2;->$isGooglePayAvailable:Z

    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$getSavedSelection$2;->$isLinkAvailable:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance p1, Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$getSavedSelection$2;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$getSavedSelection$2;->this$0:Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$getSavedSelection$2;->$isGooglePayAvailable:Z

    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$getSavedSelection$2;->$isLinkAvailable:Z

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$getSavedSelection$2;-><init>(Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;ZZLkotlin/coroutines/Continuation;)V

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
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$getSavedSelection$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$getSavedSelection$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$getSavedSelection$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZC0;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$getSavedSelection$2;->invoke(LZC0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    iget v0, p0, Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$getSavedSelection$2;->label:I

    if-nez v0, :cond_9

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$getSavedSelection$2;->this$0:Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;->access$getPrefs(Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;)Landroid/content/SharedPreferences;

    move-result-object p1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$getSavedSelection$2;->this$0:Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;->access$getKey(Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    move-object v2, p1

    const-string p1, ":"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x5b7b865e

    if-eq v2, v3, :cond_5

    const v3, -0x3d5b96c6

    if-eq v2, v3, :cond_3

    const p1, 0x32affa

    if-eq v2, p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "link"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    sget-object p1, Lcom/stripe/android/paymentsheet/model/SavedSelection$Link;->INSTANCE:Lcom/stripe/android/paymentsheet/model/SavedSelection$Link;

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$getSavedSelection$2;->$isLinkAvailable:Z

    if-eqz v0, :cond_7

    :goto_0
    move-object v1, p1

    goto :goto_1

    :cond_3
    const-string v2, "payment_method"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_7

    new-instance v0, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;-><init>(Ljava/lang/String;)V

    move-object v1, v0

    goto :goto_1

    :cond_5
    const-string p1, "google_pay"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    sget-object p1, Lcom/stripe/android/paymentsheet/model/SavedSelection$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/model/SavedSelection$GooglePay;

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$getSavedSelection$2;->$isGooglePayAvailable:Z

    if-eqz v0, :cond_7

    goto :goto_0

    :cond_7
    :goto_1
    if-nez v1, :cond_8

    sget-object v1, Lcom/stripe/android/paymentsheet/model/SavedSelection$None;->INSTANCE:Lcom/stripe/android/paymentsheet/model/SavedSelection$None;

    :cond_8
    return-object v1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
