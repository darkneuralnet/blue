.class public final LGa2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a*\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0000*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "Lco/bird/android/model/IssueType;",
        "",
        "",
        "Lco/bird/android/model/Issue;",
        "existingIssues",
        "a",
        "repair_release"
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
        "SMAP\nIssueType+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IssueType+.kt\nco/bird/android/feature/repair/extensions/IssueType_Kt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1549#2:45\n1620#2,2:46\n1549#2:48\n1620#2,3:49\n1622#2:52\n*S KotlinDebug\n*F\n+ 1 IssueType+.kt\nco/bird/android/feature/repair/extensions/IssueType_Kt\n*L\n17#1:45\n17#1:46,2\n29#1:48\n29#1:49,3\n17#1:52\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/IssueType;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lco/bird/android/model/Issue;",
            ">;)",
            "Ljava/util/List<",
            "Lco/bird/android/model/Issue;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "existingIssues"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lco/bird/android/model/IssueType;

    invoke-virtual {v5}, Lco/bird/android/model/IssueType;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/Issue;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lco/bird/android/model/Issue;->getId()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_1

    :cond_0
    const-string v6, ""

    :cond_1
    const/4 v12, 0x0

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lco/bird/android/model/Issue;->getStatus()Lco/bird/android/model/IssueStatus;

    move-result-object v7

    goto :goto_1

    :cond_2
    move-object v7, v12

    :goto_1
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lco/bird/android/model/Issue;->getStatusDisplay()Ljava/lang/String;

    move-result-object v8

    goto :goto_2

    :cond_3
    move-object v8, v12

    :goto_2
    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lco/bird/android/model/Issue;->getStatusReason()Lco/bird/android/model/constant/IssueStatusReason;

    move-result-object v9

    goto :goto_3

    :cond_4
    move-object v9, v12

    :goto_3
    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lco/bird/android/model/Issue;->getStatusReasonDisplay()Ljava/lang/String;

    move-result-object v10

    goto :goto_4

    :cond_5
    move-object v10, v12

    :goto_4
    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lco/bird/android/model/Issue;->getSource()Lco/bird/android/model/IssueCreateSource;

    move-result-object v4

    move-object v11, v4

    goto :goto_5

    :cond_6
    move-object v11, v12

    :goto_5
    invoke-static/range {v5 .. v11}, Lco/bird/android/model/extension/IssueType_Kt;->toIssue(Lco/bird/android/model/IssueType;Ljava/lang/String;Lco/bird/android/model/IssueStatus;Ljava/lang/String;Lco/bird/android/model/constant/IssueStatusReason;Ljava/lang/String;Lco/bird/android/model/IssueCreateSource;)Lco/bird/android/model/Issue;

    move-result-object v13

    invoke-virtual {v13}, Lco/bird/android/model/Issue;->getSubtypes()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v4, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v14, v6

    check-cast v14, Lco/bird/android/model/Issue;

    invoke-virtual {v14}, Lco/bird/android/model/Issue;->getIssueTypeId()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lco/bird/android/model/Issue;

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Lco/bird/android/model/Issue;->getId()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_8

    :cond_7
    invoke-virtual {v14}, Lco/bird/android/model/Issue;->getId()Ljava/lang/String;

    move-result-object v7

    :cond_8
    move-object v15, v7

    if-eqz v6, :cond_9

    invoke-virtual {v6}, Lco/bird/android/model/Issue;->getStatus()Lco/bird/android/model/IssueStatus;

    move-result-object v7

    move-object/from16 v20, v7

    goto :goto_7

    :cond_9
    move-object/from16 v20, v12

    :goto_7
    if-eqz v6, :cond_a

    invoke-virtual {v6}, Lco/bird/android/model/Issue;->getStatusDisplay()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v21, v7

    goto :goto_8

    :cond_a
    move-object/from16 v21, v12

    :goto_8
    if-eqz v6, :cond_b

    invoke-virtual {v6}, Lco/bird/android/model/Issue;->getStatusReason()Lco/bird/android/model/constant/IssueStatusReason;

    move-result-object v7

    move-object/from16 v33, v7

    goto :goto_9

    :cond_b
    move-object/from16 v33, v12

    :goto_9
    if-eqz v6, :cond_c

    invoke-virtual {v6}, Lco/bird/android/model/Issue;->getStatusReasonDisplay()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v23, v7

    goto :goto_a

    :cond_c
    move-object/from16 v23, v12

    :goto_a
    if-eqz v6, :cond_d

    invoke-virtual {v6}, Lco/bird/android/model/Issue;->getSource()Lco/bird/android/model/IssueCreateSource;

    move-result-object v6

    move-object/from16 v24, v6

    goto :goto_b

    :cond_d
    move-object/from16 v24, v12

    :goto_b
    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const v34, 0x3fc9e

    const/16 v35, 0x0

    invoke-static/range {v14 .. v35}, Lco/bird/android/model/Issue;->copy$default(Lco/bird/android/model/Issue;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/IssueStatus;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/IssueCreateSource;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/wire/WireServiceCenterCampaign;Lco/bird/android/model/constant/IssueStatusReason;ILjava/lang/Object;)Lco/bird/android/model/Issue;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :cond_e
    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const v33, 0x6ffff

    const/16 v34, 0x0

    move-object/from16 v30, v5

    invoke-static/range {v13 .. v34}, Lco/bird/android/model/Issue;->copy$default(Lco/bird/android/model/Issue;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/IssueStatus;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/IssueCreateSource;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lco/bird/android/model/wire/WireServiceCenterCampaign;Lco/bird/android/model/constant/IssueStatusReason;ILjava/lang/Object;)Lco/bird/android/model/Issue;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_f
    return-object v2
.end method
