.class public final LgM1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ(\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00022\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\n\u00a8\u0006\u000e"
    }
    d2 = {
        "LgM1;",
        "",
        "",
        "Lco/bird/android/model/persistence/HibernationSessionVehicle;",
        "scannedVehicles",
        "Lco/bird/android/model/persistence/Bird;",
        "birds",
        "LH6;",
        "a",
        "Landroid/content/Context;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "hibernation-scan_release"
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
        "SMAP\nHibernationScanConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HibernationScanConverter.kt\nco/bird/android/feature/hibernationscan/adapter/HibernationScanConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1549#2:61\n1620#2,2:62\n288#2,2:64\n1622#2:66\n1774#2,4:67\n*S KotlinDebug\n*F\n+ 1 HibernationScanConverter.kt\nco/bird/android/feature/hibernationscan/adapter/HibernationScanConverter\n*L\n21#1:61\n21#1:62,2\n22#1:64,2\n21#1:66\n42#1:67,4\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LgM1;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/HibernationSessionVehicle;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/Bird;",
            ">;)",
            "Ljava/util/List<",
            "LH6;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "scannedVehicles"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "birds"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v1

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/persistence/HibernationSessionVehicle;

    move-object v8, v2

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v11, v9

    check-cast v11, Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v11}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6}, Lco/bird/android/model/persistence/HibernationSessionVehicle;->getBirdId()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    goto :goto_1

    :cond_1
    move-object v9, v10

    :goto_1
    move-object v12, v9

    check-cast v12, Lco/bird/android/model/persistence/Bird;

    new-instance v8, LHM1;

    if-eqz v12, :cond_2

    invoke-virtual {v12}, Lco/bird/android/model/persistence/Bird;->getCode()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_3

    :cond_2
    const-string v9, ""

    :cond_3
    move-object v13, v9

    if-eqz v12, :cond_4

    invoke-virtual {v12}, Lco/bird/android/model/persistence/Bird;->getBatteryLevel()I

    move-result v7

    :cond_4
    move v14, v7

    invoke-virtual {v6}, Lco/bird/android/model/persistence/HibernationSessionVehicle;->getCategory()Lco/bird/android/model/constant/VehicleHibernationCategory;

    move-result-object v15

    invoke-virtual {v6}, Lco/bird/android/model/persistence/HibernationSessionVehicle;->getTitle()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v6}, Lco/bird/android/model/persistence/HibernationSessionVehicle;->getCategory()Lco/bird/android/model/constant/VehicleHibernationCategory;

    move-result-object v7

    iget-object v9, v0, LgM1;->a:Landroid/content/Context;

    invoke-static {v7, v9}, LhM1;->access$titleColor(Lco/bird/android/model/constant/VehicleHibernationCategory;Landroid/content/Context;)I

    move-result v17

    invoke-virtual {v6}, Lco/bird/android/model/persistence/HibernationSessionVehicle;->getRetryMessage()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v6}, Lco/bird/android/model/persistence/HibernationSessionVehicle;->getInfoMessage()Lco/bird/android/model/persistence/nestedstructures/HibernationMessage;

    move-result-object v19

    invoke-virtual {v6}, Lco/bird/android/model/persistence/HibernationSessionVehicle;->getRetryMessage()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_6

    iget-object v6, v0, LgM1;->a:Landroid/content/Context;

    sget v7, Lrg4;->ic_more:I

    invoke-static {v6, v7}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v10

    :cond_5
    :goto_2
    move-object/from16 v20, v10

    goto :goto_3

    :cond_6
    invoke-virtual {v6}, Lco/bird/android/model/persistence/HibernationSessionVehicle;->getInfoMessage()Lco/bird/android/model/persistence/nestedstructures/HibernationMessage;

    move-result-object v6

    if-eqz v6, :cond_5

    iget-object v6, v0, LgM1;->a:Landroid/content/Context;

    sget v7, Lrg4;->ic_info:I

    invoke-static {v6, v7}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v10

    goto :goto_2

    :goto_3
    move-object v11, v8

    invoke-direct/range {v11 .. v20}, LHM1;-><init>(Lco/bird/android/model/persistence/Bird;Ljava/lang/String;ILco/bird/android/model/constant/VehicleHibernationCategory;Ljava/lang/String;ILjava/lang/String;Lco/bird/android/model/persistence/nestedstructures/HibernationMessage;Landroid/graphics/drawable/Drawable;)V

    new-instance v6, LG6;

    sget v15, Lgj4;->item_hibernation_vehicle:I

    const/16 v16, 0x0

    const/16 v17, 0x4

    const/16 v18, 0x0

    move-object v13, v6

    move-object v14, v8

    invoke-direct/range {v13 .. v18}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_7
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v10

    instance-of v2, v3, Ljava/util/Collection;

    if-eqz v2, :cond_8

    move-object v2, v3

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_9
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/persistence/HibernationSessionVehicle;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/HibernationSessionVehicle;->getCategory()Lco/bird/android/model/constant/VehicleHibernationCategory;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/constant/VehicleHibernationCategory;->isFailed()Z

    move-result v3

    if-eqz v3, :cond_9

    add-int/lit8 v7, v7, 0x1

    if-gez v7, :cond_9

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    goto :goto_4

    :cond_a
    :goto_5
    new-instance v11, LG6;

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    sget v3, Lgj4;->item_hibernation_header:I

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v11

    invoke-direct/range {v1 .. v6}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, LH6;

    const/4 v12, 0x0

    const/4 v13, 0x4

    const/4 v14, 0x0

    move-object v9, v1

    invoke-direct/range {v9 .. v14}, LH6;-><init>(Ljava/util/List;LG6;LG6;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    return-object v1
.end method
