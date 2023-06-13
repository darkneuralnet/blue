.class public final LK76;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u0008\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0012\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a8\u0006\u000f"
    }
    d2 = {
        "LK76;",
        "",
        "Lco/bird/api/response/ReceiptDetailResponse;",
        "receipt",
        "",
        "LH6;",
        "a",
        "response",
        "c",
        "Lco/bird/api/response/ReceiptDetailLineItem;",
        "item",
        "LG6;",
        "b",
        "<init>",
        "()V",
        "co.bird.android.feature.self-serve-payment"
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
        "SMAP\nTransactionReceiptConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionReceiptConverter.kt\nco/bird/android/feature/selfservepayment/receipt/adapter/TransactionReceiptConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1603#2,9:54\n1855#2:63\n1856#2:65\n1612#2:66\n1#3:64\n*S KotlinDebug\n*F\n+ 1 TransactionReceiptConverter.kt\nco/bird/android/feature/selfservepayment/receipt/adapter/TransactionReceiptConverter\n*L\n24#1:54,9\n24#1:63\n24#1:65\n24#1:66\n24#1:64\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/ReceiptDetailResponse;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/response/ReceiptDetailResponse;",
            ")",
            "Ljava/util/List<",
            "LH6;",
            ">;"
        }
    .end annotation

    const-string v0, "receipt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "converting receipt "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, LK76;->c(Lco/bird/api/response/ReceiptDetailResponse;)LH6;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lco/bird/api/response/ReceiptDetailLineItem;)LG6;
    .locals 7

    invoke-virtual {p1}, Lco/bird/api/response/ReceiptDetailLineItem;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lco/bird/api/response/ReceiptDetailLineItem;->getValueString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_3

    :cond_1
    :goto_0
    new-instance v6, LG6;

    new-instance v1, Lhs4;

    invoke-virtual {p1}, Lco/bird/api/response/ReceiptDetailLineItem;->getTitle()Ljava/lang/String;

    move-result-object v0

    const-string v2, ""

    if-nez v0, :cond_2

    move-object v0, v2

    :cond_2
    invoke-virtual {p1}, Lco/bird/api/response/ReceiptDetailLineItem;->getValueString()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    move-object v2, v3

    :goto_1
    invoke-virtual {p1}, Lco/bird/api/response/ReceiptDetailLineItem;->getKind()Ljava/lang/String;

    move-result-object p1

    const-string v3, "total"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lis4;->d:Lis4;

    goto :goto_2

    :cond_4
    sget-object p1, Lis4;->b:Lis4;

    :goto_2
    invoke-direct {v1, v0, v2, p1}, Lhs4;-><init>(Ljava/lang/String;Ljava/lang/String;Lis4;)V

    sget v2, LMj4;->item_transaction_receipt_item:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v6

    :goto_3
    return-object p1
.end method

.method public final c(Lco/bird/api/response/ReceiptDetailResponse;)LH6;
    .locals 7

    invoke-virtual {p1}, Lco/bird/api/response/ReceiptDetailResponse;->getLineItems()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/api/response/ReceiptDetailLineItem;

    invoke-virtual {p0, v2}, LK76;->b(Lco/bird/api/response/ReceiptDetailLineItem;)LG6;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    move-object v2, p1

    goto :goto_1

    :cond_2
    move-object v2, v0

    :goto_1
    if-eqz v2, :cond_3

    new-instance v0, LH6;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_3
    return-object v0
.end method
