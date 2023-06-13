.class public final LpF1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LmF1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\"\u0010\u0008\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J*\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u000f\u00a8\u0006\u0013"
    }
    d2 = {
        "LpF1;",
        "LmF1;",
        "",
        "Lco/bird/android/model/persistence/HardCountScan;",
        "scans",
        "Lio/reactivex/F;",
        "",
        "LH6;",
        "a",
        "Lco/bird/android/model/persistence/HardCountEntity;",
        "hardCounts",
        "Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;",
        "category",
        "b",
        "Landroid/content/Context;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "co.bird.android.feature.hardcount"
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
        "SMAP\nHardCountDetailsConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountDetailsConverter.kt\nco/bird/android/feature/hardcount/details/adapters/HardCountDetailsConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1549#2:81\n1620#2,2:82\n1622#2:85\n1549#2:86\n1620#2,3:87\n1#3:84\n*S KotlinDebug\n*F\n+ 1 HardCountDetailsConverter.kt\nco/bird/android/feature/hardcount/details/adapters/HardCountDetailsConverterImpl\n*L\n31#1:81\n31#1:82,2\n31#1:85\n47#1:86\n47#1:87,3\n*E\n"
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

    iput-object p1, p0, LpF1;->a:Landroid/content/Context;

    return-void
.end method

.method public static synthetic c(Ljava/util/Collection;Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;LpF1;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, LpF1;->e(Ljava/util/Collection;Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;LpF1;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/util/Collection;LpF1;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, LpF1;->f(Ljava/util/Collection;LpF1;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/util/Collection;Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;LpF1;)Ljava/util/List;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "$hardCounts"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "$category"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "this$0"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/persistence/HardCountEntity;

    sget-object v5, Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;->UNIDENTIFIABLE:Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-ne v1, v5, :cond_0

    move v5, v6

    goto :goto_1

    :cond_0
    move v5, v7

    :goto_1
    iget-object v8, v2, LpF1;->a:Landroid/content/Context;

    sget v9, LDf4;->errorRed:I

    invoke-static {v8, v9}, LNA0;->c(Landroid/content/Context;I)I

    move-result v8

    iget-object v9, v2, LpF1;->a:Landroid/content/Context;

    sget v10, LDf4;->primaryText:I

    invoke-static {v9, v10}, LNA0;->c(Landroid/content/Context;I)I

    move-result v9

    invoke-virtual {v4}, Lco/bird/android/model/persistence/HardCountEntity;->getScanIdentifier()Ljava/lang/String;

    move-result-object v11

    if-eqz v5, :cond_1

    iget-object v10, v2, LpF1;->a:Landroid/content/Context;

    sget v12, Lnl4;->hard_count_unidentifiable:I

    invoke-virtual {v10, v12}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    goto :goto_2

    :cond_1
    iget-object v10, v2, LpF1;->a:Landroid/content/Context;

    sget v12, Lnl4;->hard_count_pending:I

    invoke-virtual {v10, v12}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    :goto_2
    move-object v12, v10

    if-eqz v5, :cond_2

    move/from16 v18, v8

    goto :goto_3

    :cond_2
    move/from16 v18, v9

    :goto_3
    const/4 v9, 0x0

    if-eqz v5, :cond_3

    iget-object v10, v2, LpF1;->a:Landroid/content/Context;

    sget v13, Lrg4;->ic_filled_missing:I

    invoke-static {v10, v13}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v10

    move-object v13, v10

    goto :goto_4

    :cond_3
    move-object v13, v9

    :goto_4
    if-eqz v5, :cond_4

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    move-object/from16 v17, v8

    goto :goto_5

    :cond_4
    move-object/from16 v17, v9

    :goto_5
    if-nez v1, :cond_5

    move/from16 v16, v6

    goto :goto_6

    :cond_5
    move/from16 v16, v7

    :goto_6
    if-eqz v5, :cond_7

    invoke-virtual {v4}, Lco/bird/android/model/persistence/HardCountEntity;->getScanErrorCode()Lco/bird/android/model/constant/InventoryScanningError;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v4}, Lco/bird/android/model/persistence/HardCountEntity;->getScanErrorCode()Lco/bird/android/model/constant/InventoryScanningError;

    move-result-object v4

    invoke-static {v4}, Lco/bird/android/model/constant/InventoryScanningErrorKt;->isValidSerialNotInDB(Lco/bird/android/model/constant/InventoryScanningError;)Z

    move-result v4

    if-nez v4, :cond_7

    :cond_6
    move/from16 v19, v6

    goto :goto_7

    :cond_7
    move/from16 v19, v7

    :goto_7
    new-instance v5, LqH1;

    const-string v4, "if (unidentified) {\n    \u2026ount_pending)\n          }"

    invoke-static {v12, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v20, 0x18

    const/16 v21, 0x0

    move-object v10, v5

    invoke-direct/range {v10 .. v21}, LqH1;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/util/Collection;Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;ZLjava/lang/Integer;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, LG6;

    sget v6, Lej4;->item_hard_count:I

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v4, v10

    invoke-direct/range {v4 .. v9}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_8
    invoke-static {v3}, LqF1;->access$toAdapterSections(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static final f(Ljava/util/Collection;LpF1;)Ljava/util/List;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "$scans"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "this$0"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/persistence/HardCountScan;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/HardCountScan;->getScanIdentifier()Ljava/lang/String;

    move-result-object v5

    iget-object v4, v1, LpF1;->a:Landroid/content/Context;

    sget v6, Lnl4;->hard_count_scanned:I

    invoke-virtual {v4, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    iget-object v4, v1, LpF1;->a:Landroid/content/Context;

    sget v7, LDf4;->primaryText:I

    invoke-static {v4, v7}, LNA0;->c(Landroid/content/Context;I)I

    move-result v12

    invoke-virtual {v3}, Lco/bird/android/model/persistence/HardCountScan;->getModel()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    sget-object v4, Lco/bird/android/model/constant/BirdModel;->Companion:Lco/bird/android/model/constant/BirdModel$Companion;

    invoke-virtual {v4, v3}, Lco/bird/android/model/constant/BirdModel$Companion;->fromString(Ljava/lang/String;)Lco/bird/android/model/constant/BirdModel;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v4, v1, LpF1;->a:Landroid/content/Context;

    invoke-static {v3, v4}, LPM;->a(Lco/bird/android/model/constant/BirdModel;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    move-object v7, v3

    new-instance v3, LqH1;

    const-string v4, "getString(L.string.hard_count_scanned)"

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/16 v14, 0x178

    const/4 v15, 0x0

    move-object v4, v3

    invoke-direct/range {v4 .. v15}, LqH1;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/util/Collection;Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;ZLjava/lang/Integer;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, LG6;

    sget v15, Lej4;->item_hard_count:I

    const/16 v16, 0x0

    const/16 v17, 0x4

    const/16 v18, 0x0

    move-object v13, v4

    move-object v14, v3

    invoke-direct/range {v13 .. v18}, LG6;-><init>(Ljava/lang/Object;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v2}, LqF1;->access$toAdapterSections(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/Collection;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lco/bird/android/model/persistence/HardCountScan;",
            ">;)",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "scans"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LoF1;

    invoke-direct {v0, p1, p0}, LoF1;-><init>(Ljava/util/Collection;LpF1;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "fromCallable {\n      sca\u2026toAdapterSections()\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b(Ljava/util/Collection;Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lco/bird/android/model/persistence/HardCountEntity;",
            ">;",
            "Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;",
            ")",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "hardCounts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "category"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LnF1;

    invoke-direct {v0, p1, p2, p0}, LnF1;-><init>(Ljava/util/Collection;Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;LpF1;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    const-string p2, "fromCallable {\n      har\u2026toAdapterSections()\n    }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
