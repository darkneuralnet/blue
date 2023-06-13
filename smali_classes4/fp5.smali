.class public final Lfp5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u00a8\u0006\u0006"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireScrapOrderView;",
        "Lco/bird/android/model/persistence/ScrapOrderView;",
        "a",
        "Lco/bird/android/model/wire/WireOrderItemViewDetail;",
        "Lco/bird/android/model/persistence/nestedstructures/OrderItemViewDetail;",
        "b",
        "co.bird.android.repository.scrap-order-view"
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
        "SMAP\nScrapOrderViewConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderViewConversion.kt\nco/bird/android/repository/scraporderview/converters/ScrapOrderViewConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n1549#2:28\n1620#2,3:29\n*S KotlinDebug\n*F\n+ 1 ScrapOrderViewConversion.kt\nco/bird/android/repository/scraporderview/converters/ScrapOrderViewConversionKt\n*L\n13#1:28\n13#1:29,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/WireScrapOrderView;)Lco/bird/android/model/persistence/ScrapOrderView;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireScrapOrderView;->getOrderId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireScrapOrderView;->getContainerOrderId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireScrapOrderView;->getDetails()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireOrderItemViewDetail;

    invoke-static {v1}, Lfp5;->b(Lco/bird/android/model/wire/WireOrderItemViewDetail;)Lco/bird/android/model/persistence/nestedstructures/OrderItemViewDetail;

    move-result-object v1

    invoke-interface {v4, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireScrapOrderView;->getQuantity()I

    move-result v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireScrapOrderView;->getBolUploaded()Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireScrapOrderView;->getBolStatusText()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireScrapOrderView;->getBolStatusColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object p0

    invoke-static {p0}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v8

    new-instance p0, Lco/bird/android/model/persistence/ScrapOrderView;

    move-object v1, p0

    invoke-direct/range {v1 .. v8}, Lco/bird/android/model/persistence/ScrapOrderView;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/Boolean;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)V

    return-object p0
.end method

.method public static final b(Lco/bird/android/model/wire/WireOrderItemViewDetail;)Lco/bird/android/model/persistence/nestedstructures/OrderItemViewDetail;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/OrderItemViewDetail;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOrderItemViewDetail;->getDetail()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOrderItemViewDetail;->getColor()Ljava/lang/Integer;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lco/bird/android/model/persistence/nestedstructures/OrderItemViewDetail;-><init>(Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method
