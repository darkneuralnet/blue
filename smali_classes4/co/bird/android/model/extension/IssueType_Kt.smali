.class public final Lco/bird/android/model/extension/IssueType_Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aP\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u001a\u001c\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "toIssue",
        "Lco/bird/android/model/Issue;",
        "Lco/bird/android/model/IssueType;",
        "id",
        "",
        "status",
        "Lco/bird/android/model/IssueStatus;",
        "statusDisplay",
        "statusReason",
        "Lco/bird/android/model/constant/IssueStatusReason;",
        "statusReasonDisplay",
        "source",
        "Lco/bird/android/model/IssueCreateSource;",
        "toQCInspection",
        "Lco/bird/android/model/QCInspection;",
        "workOrderId",
        "Lco/bird/android/model/constant/QCStatus;",
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
        "SMAP\nIssueType+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssueType+.kt\nco/bird/android/model/extension/IssueType_Kt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n1549#2:49\n1620#2,3:50\n*S KotlinDebug\n*F\n+ 1 IssueType+.kt\nco/bird/android/model/extension/IssueType_Kt\n*L\n44#1:49\n44#1:50,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final toIssue(Lco/bird/android/model/IssueType;Ljava/lang/String;Lco/bird/android/model/IssueStatus;Ljava/lang/String;Lco/bird/android/model/constant/IssueStatusReason;Ljava/lang/String;Lco/bird/android/model/IssueCreateSource;)Lco/bird/android/model/Issue;
    .locals 27

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/IssueType;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/IssueType;->getDisplay()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/IssueType;->getDescription()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/IssueType;->getParentId()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/IssueType;->getAssetId()Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/IssueType;->getSubtypes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v11, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v18, v3

    check-cast v18, Lco/bird/android/model/IssueType;

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x3f

    const/16 v26, 0x0

    invoke-static/range {v18 .. v26}, Lco/bird/android/model/extension/IssueType_Kt;->toIssue$default(Lco/bird/android/model/IssueType;Ljava/lang/String;Lco/bird/android/model/IssueStatus;Ljava/lang/String;Lco/bird/android/model/constant/IssueStatusReason;Ljava/lang/String;Lco/bird/android/model/IssueCreateSource;ILjava/lang/Object;)Lco/bird/android/model/Issue;

    move-result-object v3

    invoke-interface {v11, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/IssueType;->getWireCampaign()Lco/bird/android/model/wire/WireServiceCenterCampaign;

    move-result-object v19

    new-instance v0, Lco/bird/android/model/Issue;

    move-object v1, v0

    const/4 v3, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v21, 0x3c82

    const/16 v22, 0x0

    move-object/from16 v2, p1

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-object/from16 v10, p5

    move-object/from16 v18, v11

    move-object/from16 v11, p6

    move-object/from16 v20, p4

    invoke-direct/range {v1 .. v22}, Lco/bird/android/model/Issue;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/IssueStatus;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/IssueCreateSource;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/wire/WireServiceCenterCampaign;Lco/bird/android/model/constant/IssueStatusReason;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static synthetic toIssue$default(Lco/bird/android/model/IssueType;Ljava/lang/String;Lco/bird/android/model/IssueStatus;Ljava/lang/String;Lco/bird/android/model/constant/IssueStatusReason;Ljava/lang/String;Lco/bird/android/model/IssueCreateSource;ILjava/lang/Object;)Lco/bird/android/model/Issue;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    const-string p1, ""

    :cond_0
    and-int/lit8 p8, p7, 0x2

    const/4 v0, 0x0

    if-eqz p8, :cond_1

    move-object p8, v0

    goto :goto_0

    :cond_1
    move-object p8, p2

    :goto_0
    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    move-object v1, v0

    goto :goto_1

    :cond_2
    move-object v1, p3

    :goto_1
    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    move-object v2, v0

    goto :goto_2

    :cond_3
    move-object v2, p4

    :goto_2
    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    move-object v3, v0

    goto :goto_3

    :cond_4
    move-object v3, p5

    :goto_3
    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    goto :goto_4

    :cond_5
    move-object v0, p6

    :goto_4
    move-object p2, p0

    move-object p3, p1

    move-object p4, p8

    move-object p5, v1

    move-object p6, v2

    move-object p7, v3

    move-object p8, v0

    invoke-static/range {p2 .. p8}, Lco/bird/android/model/extension/IssueType_Kt;->toIssue(Lco/bird/android/model/IssueType;Ljava/lang/String;Lco/bird/android/model/IssueStatus;Ljava/lang/String;Lco/bird/android/model/constant/IssueStatusReason;Ljava/lang/String;Lco/bird/android/model/IssueCreateSource;)Lco/bird/android/model/Issue;

    move-result-object p0

    return-object p0
.end method

.method public static final toQCInspection(Lco/bird/android/model/IssueType;Ljava/lang/String;Lco/bird/android/model/constant/QCStatus;)Lco/bird/android/model/QCInspection;
    .locals 13

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workOrderId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/QCInspection;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v1, "randomUUID().toString()"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/IssueType;->getDisplay()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {p0}, Lco/bird/android/model/IssueType;->getId()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    sget-object v8, Lco/bird/android/model/constant/QCKind;->ISSUE:Lco/bird/android/model/constant/QCKind;

    const/4 v10, 0x0

    const/16 v11, 0x124

    const/4 v12, 0x0

    move-object v1, v0

    move-object v5, p1

    move-object v9, p2

    invoke-direct/range {v1 .. v12}, Lco/bird/android/model/QCInspection;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/QCKind;Lco/bird/android/model/constant/QCStatus;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static synthetic toQCInspection$default(Lco/bird/android/model/IssueType;Ljava/lang/String;Lco/bird/android/model/constant/QCStatus;ILjava/lang/Object;)Lco/bird/android/model/QCInspection;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lco/bird/android/model/constant/QCStatus;->OPEN:Lco/bird/android/model/constant/QCStatus;

    :cond_0
    invoke-static {p0, p1, p2}, Lco/bird/android/model/extension/IssueType_Kt;->toQCInspection(Lco/bird/android/model/IssueType;Ljava/lang/String;Lco/bird/android/model/constant/QCStatus;)Lco/bird/android/model/QCInspection;

    move-result-object p0

    return-object p0
.end method
