.class public final LH00;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH00$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a8\u0006\n"
    }
    d2 = {
        "LH00;",
        "",
        "Lco/bird/android/model/persistence/BountyFlightSheetDetails;",
        "bountyFlightSheetDetails",
        "Lio/reactivex/F;",
        "",
        "LH6;",
        "b",
        "<init>",
        "()V",
        "flight-sheet_release"
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
        "SMAP\nBountyFlightSheetConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyFlightSheetConverter.kt\nco/bird/android/flightsheet/BountyFlightSheetConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1549#2:70\n1620#2,2:71\n1549#2:73\n1620#2,3:74\n1549#2:77\n1620#2,3:78\n1622#2:81\n*S KotlinDebug\n*F\n+ 1 BountyFlightSheetConverter.kt\nco/bird/android/flightsheet/BountyFlightSheetConverter\n*L\n22#1:70\n22#1:71,2\n38#1:73\n38#1:74,3\n54#1:77\n54#1:78,3\n22#1:81\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, LH00;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljava/util/List;)Ljava/util/List;
    .locals 1

    const-string v0, "$adapterSections"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/persistence/BountyFlightSheetDetails;)Lio/reactivex/F;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/persistence/BountyFlightSheetDetails;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "bountyFlightSheetDetails"

    move-object/from16 v7, p1

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v8, v0, [LH6;

    new-instance v9, LH6;

    new-array v10, v0, [LG6;

    new-instance v11, LG6;

    sget v3, LZj4;->item_bounty_flight_sheet_header:I

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v11

    move-object/from16 v2, p1

    invoke-direct/range {v1 .. v6}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v12, 0x0

    aput-object v11, v10, v12

    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    move-object v1, v9

    invoke-direct/range {v1 .. v6}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v9, v8, v12

    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/persistence/BountyFlightSheetDetails;->getSections()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSection;

    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSection;->getType()Lco/bird/android/model/constant/BountyFlightSheetSectionType;

    move-result-object v6

    sget-object v7, LH00$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v7, v6

    if-eq v6, v0, :cond_9

    const/4 v7, 0x2

    if-eq v6, v7, :cond_5

    const/4 v7, 0x3

    if-eq v6, v7, :cond_0

    new-instance v5, LH6;

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x6

    const/16 v18, 0x0

    move-object v13, v5

    invoke-direct/range {v13 .. v18}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_4

    :cond_0
    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSection;->getPhotos()Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionPhotos;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionPhotos;->getTitle()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_1

    new-instance v6, LG6;

    sget v15, LZj4;->item_bounty_flight_sheet_section_photo_header:I

    const/16 v16, 0x0

    const/16 v17, 0x4

    const/16 v18, 0x0

    move-object v13, v6

    invoke-direct/range {v13 .. v18}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    move-object v15, v6

    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSection;->getPhotos()Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionPhotos;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionPhotos;->getPhotoUrls()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_3

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v5, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v17, v7

    check-cast v17, Ljava/lang/String;

    new-instance v7, LG6;

    sget v18, LZj4;->item_bounty_flight_sheet_photo:I

    const/16 v19, 0x0

    const/16 v20, 0x4

    const/16 v21, 0x0

    move-object/from16 v16, v7

    invoke-direct/range {v16 .. v21}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v5

    if-nez v5, :cond_4

    :cond_3
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    :cond_4
    move-object v14, v5

    new-instance v5, LH6;

    const/16 v16, 0x0

    const/16 v17, 0x4

    const/16 v18, 0x0

    move-object v13, v5

    invoke-direct/range {v13 .. v18}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_4

    :cond_5
    new-instance v13, LG6;

    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSection;->getVehicleList()Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionVehicleList;

    move-result-object v7

    sget v8, LZj4;->item_bounty_flight_sheet_section_vehicle_list:I

    const/4 v9, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    move-object v6, v13

    invoke-direct/range {v6 .. v11}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSection;->getVehicleList()Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionVehicleList;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionVehicleList;->getVehicles()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_7

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v5, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v15, v7

    check-cast v15, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetVehicle;

    new-instance v7, LG6;

    sget v16, LZj4;->item_vehicle_involved:I

    const/16 v17, 0x0

    const/16 v18, 0x4

    const/16 v19, 0x0

    move-object v14, v7

    invoke-direct/range {v14 .. v19}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v5

    if-nez v5, :cond_8

    :cond_7
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    :cond_8
    move-object v7, v5

    new-instance v5, LH6;

    const/4 v9, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    move-object v6, v5

    move-object v8, v13

    invoke-direct/range {v6 .. v11}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_4

    :cond_9
    new-instance v6, LH6;

    new-array v7, v0, [LG6;

    new-instance v8, LG6;

    invoke-virtual {v5}, Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSection;->getText()Lco/bird/android/model/persistence/nestedstructures/BountyFlightSheetSectionText;

    move-result-object v14

    sget v15, LZj4;->item_bounty_flight_sheet_section_text:I

    const/16 v16, 0x0

    const/16 v17, 0x4

    const/16 v18, 0x0

    move-object v13, v8

    invoke-direct/range {v13 .. v18}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v8, v7, v12

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x6

    const/16 v19, 0x0

    move-object v14, v6

    invoke-direct/range {v14 .. v19}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v6

    :goto_4
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_a
    invoke-interface {v1, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance v0, LG00;

    invoke-direct {v0, v1}, LG00;-><init>(Ljava/util/List;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "fromCallable { adapterSections }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
