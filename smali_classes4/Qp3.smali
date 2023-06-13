.class public final LQp3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004\u001a\n\u0010\n\u001a\u00020\t*\u00020\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireOperatorOrderViewSection;",
        "Lco/bird/android/model/persistence/OperatorOrderViewSection;",
        "b",
        "Lco/bird/android/model/wire/WireOperatorOrderView;",
        "",
        "section",
        "Lco/bird/android/model/persistence/OperatorOrderView;",
        "a",
        "Lco/bird/android/model/wire/WireOperatorOrderViewDetail;",
        "Lco/bird/android/model/persistence/nestedstructures/OperatorOrderViewDetail;",
        "c",
        "co.bird.android.repository.operator-order-view"
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
        "SMAP\nOperatorOrderViewConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderViewConversion.kt\nco/bird/android/repository/operatororderview/converters/OperatorOrderViewConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1549#2:44\n1620#2,3:45\n*S KotlinDebug\n*F\n+ 1 OperatorOrderViewConversion.kt\nco/bird/android/repository/operatororderview/converters/OperatorOrderViewConversionKt\n*L\n24#1:44\n24#1:45,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/WireOperatorOrderView;Ljava/lang/String;)Lco/bird/android/model/persistence/OperatorOrderView;
    .locals 16

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "section"

    move-object/from16 v11, p1

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireOperatorOrderView;->getOrderId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireOperatorOrderView;->getAppointmentDate()Lorg/joda/time/DateTime;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireOperatorOrderView;->getLocationName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireOperatorOrderView;->getLocationAddress()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireOperatorOrderView;->getDetails()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v0, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/model/wire/WireOperatorOrderViewDetail;

    invoke-static {v7}, LQp3;->c(Lco/bird/android/model/wire/WireOperatorOrderViewDetail;)Lco/bird/android/model/persistence/nestedstructures/OperatorOrderViewDetail;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireOperatorOrderView;->getInstructions()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireOperatorOrderView;->getType()Lco/bird/android/model/constant/OperatorOrderViewType;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireOperatorOrderView;->getListDescription()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireOperatorOrderView;->getQuantity()I

    move-result v10

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireOperatorOrderView;->getBolStatusText()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireOperatorOrderView;->getBolStatusColor()Lco/bird/android/model/wire/WireThemedColors;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, LqB0;->f(Lco/bird/android/model/wire/WireThemedColors;)Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    move-object v13, v0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireOperatorOrderView;->getBolUploaded()Z

    move-result v14

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireOperatorOrderView;->getContainerOrderId()Ljava/lang/String;

    move-result-object v15

    new-instance v0, Lco/bird/android/model/persistence/OperatorOrderView;

    move-object v1, v0

    move-object/from16 v11, p1

    invoke-direct/range {v1 .. v15}, Lco/bird/android/model/persistence/OperatorOrderView;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lco/bird/android/model/constant/OperatorOrderViewType;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ThemedColors;ZLjava/lang/String;)V

    return-object v0
.end method

.method public static final b(Lco/bird/android/model/wire/WireOperatorOrderViewSection;)Lco/bird/android/model/persistence/OperatorOrderViewSection;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/OperatorOrderViewSection;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorOrderViewSection;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorOrderViewSection;->getIdx()I

    move-result p0

    invoke-direct {v0, v1, p0}, Lco/bird/android/model/persistence/OperatorOrderViewSection;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method

.method public static final c(Lco/bird/android/model/wire/WireOperatorOrderViewDetail;)Lco/bird/android/model/persistence/nestedstructures/OperatorOrderViewDetail;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/OperatorOrderViewDetail;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorOrderViewDetail;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireOperatorOrderViewDetail;->getDetail()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lco/bird/android/model/persistence/nestedstructures/OperatorOrderViewDetail;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
