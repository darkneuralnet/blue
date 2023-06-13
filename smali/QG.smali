.class public final LQG;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQG$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\u0006B\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\u0003\u001a\u00020\u0002J1\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u000eJ\u0018\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0002R<\u0010\u0017\u001a*\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u0014j\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0007`\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0016\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "LQG;",
        "",
        "",
        "cardNumber",
        "",
        "e",
        "a",
        "",
        "LT11;",
        "c",
        "publicKey",
        "Lcom/adyen/checkout/card/CardConfiguration;",
        "cardConfiguration",
        "b",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/card/CardConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "d",
        "Lcom/adyen/checkout/card/api/model/BinLookupResponse;",
        "f",
        "binLookupResponse",
        "g",
        "Ljava/util/HashMap;",
        "Lkotlin/collections/HashMap;",
        "Ljava/util/HashMap;",
        "cachedBinLookup",
        "<init>",
        "()V",
        "card_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
.end annotation


# static fields
.field public static final b:LQG$a;


# instance fields
.field public final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "LT11;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LQG$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LQG$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LQG;->b:LQG$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LQG;->a:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "cardNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LQG;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LQG;->a:Ljava/util/HashMap;

    invoke-virtual {p0, p1}, LQG;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/card/CardConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/adyen/checkout/card/CardConfiguration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "LT11;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, LQG$b;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, LQG$b;

    iget v1, v0, LQG$b;->l:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LQG$b;->l:I

    goto :goto_0

    :cond_0
    new-instance v0, LQG$b;

    invoke-direct {v0, p0, p4}, LQG$b;-><init>(LQG;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p4, v0, LQG$b;->j:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LQG$b;->l:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LQG$b;->i:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p2, v0, LQG$b;->h:Ljava/lang/Object;

    check-cast p2, LQG;

    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iput-object p0, v0, LQG$b;->h:Ljava/lang/Object;

    iput-object p1, v0, LQG$b;->i:Ljava/lang/Object;

    iput v3, v0, LQG$b;->l:I

    invoke-virtual {p0, p1, p2, p3, v0}, LQG;->f(Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/card/CardConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    move-object p2, p0

    :goto_1
    check-cast p4, Lcom/adyen/checkout/card/api/model/BinLookupResponse;

    invoke-virtual {p2, p4}, LQG;->g(Lcom/adyen/checkout/card/api/model/BinLookupResponse;)Ljava/util/List;

    move-result-object p3

    iget-object p4, p2, LQG;->a:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, LQG;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p4, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p3
.end method

.method public final c(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "LT11;",
            ">;"
        }
    .end annotation

    const-string v0, "cardNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LQG;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LQG;->a:Ljava/util/HashMap;

    invoke-virtual {p0, p1}, LQG;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "BinLookupRepository does not contain card number"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Card number too small card number"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    sget-object v0, LKx5;->a:LKx5;

    const/16 v1, 0xb

    invoke-static {p1, v1}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LKx5;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "cardNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v0, 0xb

    if-lt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;Lcom/adyen/checkout/card/CardConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/adyen/checkout/card/CardConfiguration;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/adyen/checkout/card/api/model/BinLookupResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LQG$c;

    const/4 v1, 0x0

    invoke-direct {v0, p3, p1, p2, v1}, LQG$c;-><init>(Lcom/adyen/checkout/card/CardConfiguration;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, p4}, LaD0;->e(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final g(Lcom/adyen/checkout/card/api/model/BinLookupResponse;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/adyen/checkout/card/api/model/BinLookupResponse;",
            ")",
            "Ljava/util/List<",
            "LT11;",
            ">;"
        }
    .end annotation

    invoke-static {}, LRG;->a()Ljava/lang/String;

    move-result-object v0

    const-string v1, "handleBinLookupResponse"

    invoke-static {v0, v1}, LCx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, LRG;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez p1, :cond_0

    move-object v2, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/adyen/checkout/card/api/model/BinLookupResponse;->getBrands()Ljava/util/List;

    move-result-object v2

    :goto_0
    const-string v3, "Brands: "

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, LCx2;->f(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_1

    move-object p1, v1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lcom/adyen/checkout/card/api/model/BinLookupResponse;->getBrands()Ljava/util/List;

    move-result-object p1

    :goto_1
    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_2
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/adyen/checkout/card/api/model/Brand;

    invoke-virtual {v2}, Lcom/adyen/checkout/card/api/model/Brand;->getBrand()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_4

    move-object v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/adyen/checkout/card/api/model/Brand;->getBrand()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LXf0;->b(Ljava/lang/String;)LXf0;

    move-result-object v3

    if-nez v3, :cond_5

    sget-object v3, LXf0;->K:LXf0;

    invoke-virtual {v2}, Lcom/adyen/checkout/card/api/model/Brand;->getBrand()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, LXf0;->e(Ljava/lang/String;)V

    :cond_5
    move-object v6, v3

    const-string v3, "CardType.getByBrandName(brandResponse.brand) ?: CardType.UNKNOWN.apply { txVariant = brandResponse.brand }"

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, LT11;

    const/4 v7, 0x1

    invoke-virtual {v2}, Lcom/adyen/checkout/card/api/model/Brand;->c()Ljava/lang/Boolean;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    sget-object v4, Lcom/adyen/checkout/card/api/model/Brand$c;->c:Lcom/adyen/checkout/card/api/model/Brand$c$a;

    invoke-virtual {v2}, Lcom/adyen/checkout/card/api/model/Brand;->b()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_6

    sget-object v5, Lcom/adyen/checkout/card/api/model/Brand$c;->d:Lcom/adyen/checkout/card/api/model/Brand$c;

    invoke-virtual {v5}, Lcom/adyen/checkout/card/api/model/Brand$c;->b()Ljava/lang/String;

    move-result-object v5

    :cond_6
    invoke-virtual {v4, v5}, Lcom/adyen/checkout/card/api/model/Brand$c$a;->a(Ljava/lang/String;)Lcom/adyen/checkout/card/api/model/Brand$c;

    move-result-object v9

    invoke-virtual {v2}, Lcom/adyen/checkout/card/api/model/Brand;->d()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_7

    sget-object v2, Lcom/adyen/checkout/card/api/model/Brand$c;->d:Lcom/adyen/checkout/card/api/model/Brand$c;

    invoke-virtual {v2}, Lcom/adyen/checkout/card/api/model/Brand$c;->b()Ljava/lang/String;

    move-result-object v2

    :cond_7
    invoke-virtual {v4, v2}, Lcom/adyen/checkout/card/api/model/Brand$c$a;->a(Ljava/lang/String;)Lcom/adyen/checkout/card/api/model/Brand$c;

    move-result-object v10

    move-object v5, v3

    invoke-direct/range {v5 .. v10}, LT11;-><init>(LXf0;ZZLcom/adyen/checkout/card/api/model/Brand$c;Lcom/adyen/checkout/card/api/model/Brand$c;)V

    :goto_4
    if-eqz v3, :cond_3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    return-object v0
.end method
