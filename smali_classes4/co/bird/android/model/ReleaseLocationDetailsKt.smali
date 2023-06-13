.class public final Lco/bird/android/model/ReleaseLocationDetailsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a \u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n\u001a&\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004*\u0008\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\t\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "hour",
        "",
        "Ljava/util/Calendar;",
        "toReleaseLocationDetails",
        "",
        "Lco/bird/android/model/ReleaseLocationDetails;",
        "Lco/bird/android/model/AvailableDeliveries;",
        "user",
        "Lco/bird/android/model/User;",
        "config",
        "Lco/bird/android/model/wire/configs/DeliveryConfig;",
        "Lco/bird/android/model/wire/WireDrop;",
        "Lco/bird/android/model/wire/configs/Config;",
        "active",
        "",
        "model_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nReleaseLocationDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseLocationDetails.kt\nco/bird/android/model/ReleaseLocationDetailsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,206:1\n1549#2:207\n1620#2,3:208\n1549#2:211\n1620#2,3:212\n1549#2:215\n1620#2,3:216\n*S KotlinDebug\n*F\n+ 1 ReleaseLocationDetails.kt\nco/bird/android/model/ReleaseLocationDetailsKt\n*L\n194#1:207\n194#1:208,3\n198#1:211\n198#1:212,3\n199#1:215\n199#1:216,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final hour(Ljava/util/Calendar;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xb

    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    move-result p0

    return p0
.end method

.method public static final toReleaseLocationDetails(Lco/bird/android/model/AvailableDeliveries;Lco/bird/android/model/User;Lco/bird/android/model/wire/configs/DeliveryConfig;)Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/AvailableDeliveries;",
            "Lco/bird/android/model/User;",
            "Lco/bird/android/model/wire/configs/DeliveryConfig;",
            ")",
            "Ljava/util/List<",
            "Lco/bird/android/model/ReleaseLocationDetails;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    move-object/from16 v14, p2

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/AvailableDeliveries;->getDeliveries()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    const/16 v13, 0xa

    invoke-static {v0, v13}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v15, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lco/bird/android/model/Delivery;

    new-instance v12, Lco/bird/android/model/DeliveryReleaseLocationDetails;

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v16, 0xf4

    const/16 v17, 0x0

    move-object v3, v12

    move-object/from16 v4, p2

    move-object/from16 v18, v12

    move/from16 v12, v16

    move-object/from16 v16, v0

    move v0, v13

    move-object/from16 v13, v17

    invoke-direct/range {v3 .. v13}, Lco/bird/android/model/DeliveryReleaseLocationDetails;-><init>(Lco/bird/android/model/wire/configs/DeliveryConfig;Lco/bird/android/model/Delivery;Ljava/lang/String;ZLco/bird/android/model/constant/NestPurpose;Ljava/lang/String;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v18

    invoke-interface {v15, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v13, v0

    move-object/from16 v0, v16

    goto :goto_0

    :cond_0
    move v0, v13

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/AvailableDeliveries;->getCurrentRoute()Lco/bird/android/model/DeliveryRoute;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lco/bird/android/model/DeliveryRoute;->getDeliveries()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_2

    check-cast v1, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v13, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lco/bird/android/model/Delivery;

    new-instance v1, Lco/bird/android/model/DeliveryReleaseLocationDetails;

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/User;->getId()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xf0

    const/16 v16, 0x0

    move-object v3, v1

    move-object/from16 v4, p2

    move-object/from16 p0, v0

    move-object v0, v13

    move-object/from16 v13, v16

    invoke-direct/range {v3 .. v13}, Lco/bird/android/model/DeliveryReleaseLocationDetails;-><init>(Lco/bird/android/model/wire/configs/DeliveryConfig;Lco/bird/android/model/Delivery;Ljava/lang/String;ZLco/bird/android/model/constant/NestPurpose;Ljava/lang/String;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v13, v0

    move-object/from16 v0, p0

    goto :goto_1

    :cond_1
    move-object v0, v13

    goto :goto_2

    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/lang/Iterable;

    :goto_2
    invoke-static {v15, v13}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static final toReleaseLocationDetails(Ljava/util/List;Lco/bird/android/model/wire/configs/Config;Z)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireDrop;",
            ">;",
            "Lco/bird/android/model/wire/configs/Config;",
            "Z)",
            "Ljava/util/List<",
            "Lco/bird/android/model/ReleaseLocationDetails;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireDrop;

    new-instance v2, Lco/bird/android/model/DropReleaseLocationDetails;

    invoke-direct {v2, p1, v1, p2}, Lco/bird/android/model/DropReleaseLocationDetails;-><init>(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/wire/WireDrop;Z)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method
