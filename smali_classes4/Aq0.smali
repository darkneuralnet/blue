.class public final LAq0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0008\u001a\u00020\u0007*\u00020\u0006\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\t\u001a\n\u0010\r\u001a\u00020\u000c*\u00020\t\u00a8\u0006\u000e"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;",
        "Lco/bird/android/model/persistence/ComplaintResolutionForm;",
        "c",
        "Lco/bird/android/model/wire/WireComplaintActionTakenRequiredField;",
        "Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;",
        "a",
        "Lco/bird/android/model/wire/WireComplaintIssueOption;",
        "Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;",
        "b",
        "Lco/bird/android/model/persistence/ComplaintResolution;",
        "Lco/bird/api/request/ComplaintResolutionSubmissionRequest;",
        "d",
        "Lco/bird/api/request/ComplaintResolutionUpdateRequest;",
        "e",
        "co.bird.android.repository.complaint-resolution"
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
        "SMAP\nComplaintResolutionConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionConversion.kt\nco/bird/android/repository/complaintresolution/converter/ComplaintResolutionConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n1549#2:61\n1620#2,3:62\n1549#2:65\n1620#2,3:66\n1549#2:69\n1620#2,3:70\n1549#2:73\n1620#2,3:74\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionConversion.kt\nco/bird/android/repository/complaintresolution/converter/ComplaintResolutionConversionKt\n*L\n15#1:61\n15#1:62,3\n16#1:65\n16#1:66,3\n17#1:69\n17#1:70,3\n18#1:73\n18#1:74,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/WireComplaintActionTakenRequiredField;)Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireComplaintActionTakenRequiredField;->getField()Lco/bird/android/model/constant/ComplaintResolutionField;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireComplaintActionTakenRequiredField;->getRequired()Z

    move-result p0

    invoke-direct {v0, v1, p0}, Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;-><init>(Lco/bird/android/model/constant/ComplaintResolutionField;Z)V

    return-object v0
.end method

.method public static final b(Lco/bird/android/model/wire/WireComplaintIssueOption;)Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireComplaintIssueOption;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireComplaintIssueOption;->getLabel()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final c(Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;)Lco/bird/android/model/persistence/ComplaintResolutionForm;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;->getActionTakenRequiredFields()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireComplaintActionTakenRequiredField;

    invoke-static {v3}, LAq0;->a(Lco/bird/android/model/wire/WireComplaintActionTakenRequiredField;)Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;->getNoActionTakenRequiredFields()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lco/bird/android/model/wire/WireComplaintActionTakenRequiredField;

    invoke-static {v4}, LAq0;->a(Lco/bird/android/model/wire/WireComplaintActionTakenRequiredField;)Lco/bird/android/model/persistence/nestedstructures/ComplaintActionTakenRequiredField;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;->getIssueOptions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/wire/WireComplaintIssueOption;

    invoke-static {v5}, LAq0;->b(Lco/bird/android/model/wire/WireComplaintIssueOption;)Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;->getActionTakenOptions()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireComplaintIssueOption;

    invoke-static {v2}, LAq0;->b(Lco/bird/android/model/wire/WireComplaintIssueOption;)Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    new-instance p0, Lco/bird/android/model/persistence/ComplaintResolutionForm;

    invoke-direct {p0, v1, v3, v4, v0}, Lco/bird/android/model/persistence/ComplaintResolutionForm;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object p0
.end method

.method public static final d(Lco/bird/android/model/persistence/ComplaintResolution;)Lco/bird/api/request/ComplaintResolutionSubmissionRequest;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/request/ComplaintResolutionSubmissionRequest;

    invoke-virtual {p0}, Lco/bird/android/model/persistence/ComplaintResolution;->getComplaintIds()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/persistence/ComplaintResolution;->getSituation()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/persistence/ComplaintResolution;->getBeforePhotoAssetId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/persistence/ComplaintResolution;->getAfterPhotoAssetId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/persistence/ComplaintResolution;->getIssues()Ljava/util/List;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/persistence/ComplaintResolution;->getActionTaken()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lco/bird/android/model/persistence/ComplaintResolution;->getVehicleIdsInvolved()Ljava/util/List;

    move-result-object v8

    invoke-virtual {p0}, Lco/bird/android/model/persistence/ComplaintResolution;->getAdditionalNotes()Ljava/lang/String;

    move-result-object v9

    move-object v1, v0

    invoke-direct/range {v1 .. v9}, Lco/bird/api/request/ComplaintResolutionSubmissionRequest;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final e(Lco/bird/android/model/persistence/ComplaintResolution;)Lco/bird/api/request/ComplaintResolutionUpdateRequest;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/request/ComplaintResolutionUpdateRequest;

    invoke-virtual {p0}, Lco/bird/android/model/persistence/ComplaintResolution;->getComplaintIds()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/persistence/ComplaintResolution;->getBeforePhotoAssetId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/persistence/ComplaintResolution;->getAfterPhotoAssetId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/persistence/ComplaintResolution;->getIssues()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/persistence/ComplaintResolution;->getActionTaken()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/persistence/ComplaintResolution;->getVehicleIdsInvolved()Ljava/util/List;

    move-result-object v7

    invoke-virtual {p0}, Lco/bird/android/model/persistence/ComplaintResolution;->getAdditionalNotes()Ljava/lang/String;

    move-result-object v8

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lco/bird/api/request/ComplaintResolutionUpdateRequest;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v0
.end method
