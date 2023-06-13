.class public final Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/cards/CardAccountRangeRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J#\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R \u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00118\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;",
        "Lcom/stripe/android/cards/CardAccountRangeRepository;",
        "Lcom/stripe/android/cards/CardNumber$Unvalidated;",
        "cardNumber",
        "Lcom/stripe/android/model/AccountRange;",
        "getAccountRange",
        "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "getAccountRanges",
        "Lcom/stripe/android/cards/CardAccountRangeSource;",
        "inMemorySource",
        "Lcom/stripe/android/cards/CardAccountRangeSource;",
        "remoteSource",
        "staticSource",
        "Lcom/stripe/android/cards/CardAccountRangeStore;",
        "store",
        "Lcom/stripe/android/cards/CardAccountRangeStore;",
        "LEu1;",
        "",
        "loading",
        "LEu1;",
        "getLoading",
        "()LEu1;",
        "<init>",
        "(Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardAccountRangeStore;)V",
        "payments-core_release"
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
        "SMAP\nDefaultCardAccountRangeRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultCardAccountRangeRepository.kt\ncom/stripe/android/cards/DefaultCardAccountRangeRepository\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,48:1\n287#2:49\n288#2:54\n37#3:50\n36#3,3:51\n106#4:55\n*S KotlinDebug\n*F\n+ 1 DefaultCardAccountRangeRepository.kt\ncom/stripe/android/cards/DefaultCardAccountRangeRepository\n*L\n37#1:49\n37#1:54\n37#1:50\n37#1:51,3\n37#1:55\n*E\n"
    }
.end annotation


# instance fields
.field private final inMemorySource:Lcom/stripe/android/cards/CardAccountRangeSource;

.field private final loading:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final remoteSource:Lcom/stripe/android/cards/CardAccountRangeSource;

.field private final staticSource:Lcom/stripe/android/cards/CardAccountRangeSource;

.field private final store:Lcom/stripe/android/cards/CardAccountRangeStore;


# direct methods
.method public constructor <init>(Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardAccountRangeStore;)V
    .locals 1

    const-string v0, "inMemorySource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remoteSource"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "staticSource"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "store"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;->inMemorySource:Lcom/stripe/android/cards/CardAccountRangeSource;

    iput-object p2, p0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;->remoteSource:Lcom/stripe/android/cards/CardAccountRangeSource;

    iput-object p3, p0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;->staticSource:Lcom/stripe/android/cards/CardAccountRangeSource;

    iput-object p4, p0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;->store:Lcom/stripe/android/cards/CardAccountRangeStore;

    const/4 p4, 0x3

    new-array p4, p4, [LEu1;

    invoke-interface {p1}, Lcom/stripe/android/cards/CardAccountRangeSource;->getLoading()LEu1;

    move-result-object p1

    const/4 v0, 0x0

    aput-object p1, p4, v0

    const/4 p1, 0x1

    invoke-interface {p2}, Lcom/stripe/android/cards/CardAccountRangeSource;->getLoading()LEu1;

    move-result-object p2

    aput-object p2, p4, p1

    const/4 p1, 0x2

    invoke-interface {p3}, Lcom/stripe/android/cards/CardAccountRangeSource;->getLoading()LEu1;

    move-result-object p2

    aput-object p2, p4, p1

    invoke-static {p4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    new-array p2, v0, [LEu1;

    invoke-interface {p1, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, [LEu1;

    new-instance p2, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$special$$inlined$combine$1;

    invoke-direct {p2, p1}, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$special$$inlined$combine$1;-><init>([LEu1;)V

    iput-object p2, p0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;->loading:LEu1;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public getAccountRange(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/cards/CardNumber$Unvalidated;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/AccountRange;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;

    iget v1, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;-><init>(Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->label:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/cards/CardNumber$Unvalidated;

    iget-object v2, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object p1, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/cards/CardNumber$Unvalidated;

    iget-object v2, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    iget-object p1, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/cards/CardNumber$Unvalidated;

    iget-object v2, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getBin()Lcom/stripe/android/cards/Bin;

    move-result-object p2

    if-eqz p2, :cond_c

    iget-object v2, p0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;->store:Lcom/stripe/android/cards/CardAccountRangeStore;

    iput-object p0, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->L$1:Ljava/lang/Object;

    iput v6, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->label:I

    invoke-interface {v2, p2, v0}, Lcom/stripe/android/cards/CardAccountRangeStore;->contains(Lcom/stripe/android/cards/Bin;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    return-object v1

    :cond_6
    move-object v2, p0

    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_8

    iget-object p2, v2, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;->inMemorySource:Lcom/stripe/android/cards/CardAccountRangeSource;

    iput-object v2, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->L$1:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->label:I

    invoke-interface {p2, p1, v0}, Lcom/stripe/android/cards/CardAccountRangeSource;->getAccountRange(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    return-object v1

    :cond_7
    :goto_2
    check-cast p2, Lcom/stripe/android/model/AccountRange;

    goto :goto_4

    :cond_8
    iget-object p2, v2, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;->remoteSource:Lcom/stripe/android/cards/CardAccountRangeSource;

    iput-object v2, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->label:I

    invoke-interface {p2, p1, v0}, Lcom/stripe/android/cards/CardAccountRangeSource;->getAccountRange(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_9

    return-object v1

    :cond_9
    :goto_3
    check-cast p2, Lcom/stripe/android/model/AccountRange;

    :goto_4
    if-nez p2, :cond_b

    iget-object p2, v2, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;->staticSource:Lcom/stripe/android/cards/CardAccountRangeSource;

    iput-object v7, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRange$1;->label:I

    invoke-interface {p2, p1, v0}, Lcom/stripe/android/cards/CardAccountRangeSource;->getAccountRange(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_a

    return-object v1

    :cond_a
    :goto_5
    check-cast p2, Lcom/stripe/android/model/AccountRange;

    :cond_b
    move-object v7, p2

    :cond_c
    return-object v7
.end method

.method public getAccountRanges(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/cards/CardNumber$Unvalidated;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/AccountRange;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;

    iget v1, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;-><init>(Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->label:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/cards/CardNumber$Unvalidated;

    iget-object v2, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object p1, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/cards/CardNumber$Unvalidated;

    iget-object v2, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    iget-object p1, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/stripe/android/cards/CardNumber$Unvalidated;

    iget-object v2, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/stripe/android/cards/CardNumber$Unvalidated;->getBin()Lcom/stripe/android/cards/Bin;

    move-result-object p2

    if-eqz p2, :cond_c

    iget-object v2, p0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;->store:Lcom/stripe/android/cards/CardAccountRangeStore;

    iput-object p0, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->L$1:Ljava/lang/Object;

    iput v6, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->label:I

    invoke-interface {v2, p2, v0}, Lcom/stripe/android/cards/CardAccountRangeStore;->contains(Lcom/stripe/android/cards/Bin;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    return-object v1

    :cond_6
    move-object v2, p0

    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_8

    iget-object p2, v2, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;->inMemorySource:Lcom/stripe/android/cards/CardAccountRangeSource;

    iput-object v2, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->L$1:Ljava/lang/Object;

    iput v5, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->label:I

    invoke-interface {p2, p1, v0}, Lcom/stripe/android/cards/CardAccountRangeSource;->getAccountRanges(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    return-object v1

    :cond_7
    :goto_2
    check-cast p2, Ljava/util/List;

    goto :goto_4

    :cond_8
    iget-object p2, v2, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;->remoteSource:Lcom/stripe/android/cards/CardAccountRangeSource;

    iput-object v2, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->label:I

    invoke-interface {p2, p1, v0}, Lcom/stripe/android/cards/CardAccountRangeSource;->getAccountRanges(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_9

    return-object v1

    :cond_9
    :goto_3
    check-cast p2, Ljava/util/List;

    :goto_4
    if-nez p2, :cond_b

    iget-object p2, v2, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;->staticSource:Lcom/stripe/android/cards/CardAccountRangeSource;

    iput-object v7, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository$getAccountRanges$1;->label:I

    invoke-interface {p2, p1, v0}, Lcom/stripe/android/cards/CardAccountRangeSource;->getAccountRanges(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_a

    return-object v1

    :cond_a
    :goto_5
    check-cast p2, Ljava/util/List;

    :cond_b
    move-object v7, p2

    :cond_c
    return-object v7
.end method

.method public getLoading()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;->loading:LEu1;

    return-object v0
.end method
