.class public final Lag;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0008\u001a\u00020\u0007*\u00020\u0006\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\t\u001a\n\u0010\u000e\u001a\u00020\r*\u00020\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireAnnouncement;",
        "Lco/bird/android/model/persistence/Announcement;",
        "a",
        "Lco/bird/android/model/wire/WireAnnouncementPage;",
        "Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;",
        "c",
        "Lco/bird/android/model/wire/WireAnnouncementContextParameters;",
        "Lco/bird/android/model/persistence/nestedstructures/AnnouncementContextParameters;",
        "b",
        "Lco/bird/android/model/wire/WireLegacyAsset;",
        "Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;",
        "e",
        "Lco/bird/android/model/wire/WireAssetMedia;",
        "Lco/bird/android/model/persistence/nestedstructures/AssetMedia;",
        "d",
        "co.bird.android.repository.announcement"
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
        "SMAP\nAnnouncementConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnouncementConversion.kt\nco/bird/android/repository/announcement/converters/AnnouncementConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1549#2:71\n1620#2,3:72\n*S KotlinDebug\n*F\n+ 1 AnnouncementConversion.kt\nco/bird/android/repository/announcement/converters/AnnouncementConversionKt\n*L\n35#1:71\n35#1:72,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/WireAnnouncement;)Lco/bird/android/model/persistence/Announcement;
    .locals 24

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireAnnouncement;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireAnnouncement;->getContext()Lco/bird/android/model/constant/AnnouncementContext;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireAnnouncement;->getContextParameters()Lco/bird/android/model/wire/WireAnnouncementContextParameters;

    move-result-object v0

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lag;->b(Lco/bird/android/model/wire/WireAnnouncementContextParameters;)Lco/bird/android/model/persistence/nestedstructures/AnnouncementContextParameters;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v4

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireAnnouncement;->getDisplayType()Lco/bird/android/model/constant/AnnouncementDisplayType;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireAnnouncement;->getContentType()Lco/bird/android/model/constant/AnnouncementContentType;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireAnnouncement;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireAnnouncement;->getTitleAsset()Lco/bird/android/model/wire/WireLegacyAsset;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-static {v8}, Lag;->e(Lco/bird/android/model/wire/WireLegacyAsset;)Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object v8

    goto :goto_1

    :cond_1
    move-object v8, v4

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireAnnouncement;->getMessage()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireAnnouncement;->getMessageUrl()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireAnnouncement;->getButtonText()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireAnnouncement;->getAnalyticsTitle()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireAnnouncement;->getButtonUrl()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireAnnouncement;->getOpenInWebview()Ljava/lang/Boolean;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireAnnouncement;->getAuxiliaryTitle()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireAnnouncement;->getAuxiliaryBody()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireAnnouncement;->getAuxiliaryAsset()Lco/bird/android/model/wire/WireLegacyAsset;

    move-result-object v17

    if-eqz v17, :cond_2

    invoke-static/range {v17 .. v17}, Lag;->e(Lco/bird/android/model/wire/WireLegacyAsset;)Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object v17

    goto :goto_2

    :cond_2
    move-object/from16 v17, v4

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireAnnouncement;->getShareContent()Ljava/lang/String;

    move-result-object v18

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireAnnouncement;->getLearnMoreUrl()Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireAnnouncement;->getPages()Ljava/util/List;

    move-result-object v20

    if-eqz v20, :cond_4

    move-object/from16 v4, v20

    check-cast v4, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v20, v15

    const/16 v15, 0xa

    invoke-static {v4, v15}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v1, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lco/bird/android/model/wire/WireAnnouncementPage;

    invoke-static {v15}, Lag;->c(Lco/bird/android/model/wire/WireAnnouncementPage;)Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;

    move-result-object v15

    invoke-interface {v1, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    move-object/from16 v22, v1

    goto :goto_4

    :cond_4
    move-object/from16 v20, v15

    move-object/from16 v22, v4

    :goto_4
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/wire/WireAnnouncement;->getNavigationTitle()Ljava/lang/String;

    move-result-object v21

    new-instance v23, Lco/bird/android/model/persistence/Announcement;

    move-object/from16 v1, v23

    move-object v4, v0

    move-object/from16 v15, v20

    move-object/from16 v20, v22

    invoke-direct/range {v1 .. v21}, Lco/bird/android/model/persistence/Announcement;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/AnnouncementContext;Lco/bird/android/model/persistence/nestedstructures/AnnouncementContextParameters;Lco/bird/android/model/constant/AnnouncementDisplayType;Lco/bird/android/model/constant/AnnouncementContentType;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v23
.end method

.method public static final b(Lco/bird/android/model/wire/WireAnnouncementContextParameters;)Lco/bird/android/model/persistence/nestedstructures/AnnouncementContextParameters;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/AnnouncementContextParameters;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireAnnouncementContextParameters;->getMinThreshold()Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireAnnouncementContextParameters;->getMaxThreshold()Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireAnnouncementContextParameters;->getMinDuration()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireAnnouncementContextParameters;->getMaxDuration()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireAnnouncementContextParameters;->getRole()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireAnnouncementContextParameters;->getOperatorRole()Ljava/lang/String;

    move-result-object v7

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/persistence/nestedstructures/AnnouncementContextParameters;-><init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final c(Lco/bird/android/model/wire/WireAnnouncementPage;)Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireAnnouncementPage;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireAnnouncementPage;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireAnnouncementPage;->getTitleAsset()Lco/bird/android/model/wire/WireLegacyAsset;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lag;->e(Lco/bird/android/model/wire/WireLegacyAsset;)Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-direct {v0, v1, v2, p0}, Lco/bird/android/model/persistence/nestedstructures/AnnouncementPage;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;)V

    return-object v0
.end method

.method public static final d(Lco/bird/android/model/wire/WireAssetMedia;)Lco/bird/android/model/persistence/nestedstructures/AssetMedia;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireAssetMedia;->getMediaId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireAssetMedia;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireAssetMedia;->getMediaUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireAssetMedia;->getMediaType()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lco/bird/android/model/persistence/nestedstructures/AssetMedia;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final e(Lco/bird/android/model/wire/WireLegacyAsset;)Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLegacyAsset;->getKind()Lco/bird/android/model/constant/AssetKind;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLegacyAsset;->getMedia()Lco/bird/android/model/wire/WireAssetMedia;

    move-result-object p0

    invoke-static {p0}, Lag;->d(Lco/bird/android/model/wire/WireAssetMedia;)Lco/bird/android/model/persistence/nestedstructures/AssetMedia;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lco/bird/android/model/persistence/nestedstructures/LegacyAsset;-><init>(Lco/bird/android/model/constant/AssetKind;Lco/bird/android/model/persistence/nestedstructures/AssetMedia;)V

    return-object v0
.end method
