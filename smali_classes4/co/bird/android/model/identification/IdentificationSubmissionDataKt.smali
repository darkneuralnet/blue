.class public final Lco/bird/android/model/identification/IdentificationSubmissionDataKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001\u00a8\u0006\u0004"
    }
    d2 = {
        "toSubmissionData",
        "Lco/bird/android/model/identification/IdentificationSubmissionData;",
        "Lco/bird/android/model/wire/WireIdentificationSubmissionData;",
        "toWire",
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


# direct methods
.method public static final toSubmissionData(Lco/bird/android/model/wire/WireIdentificationSubmissionData;)Lco/bird/android/model/identification/IdentificationSubmissionData;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/identification/IdentificationSubmissionData;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireIdentificationSubmissionData;->getBarcode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireIdentificationSubmissionData;->getDocumentFront()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireIdentificationSubmissionData;->getDocumentBack()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireIdentificationSubmissionData;->getSelfiePhoto()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireIdentificationSubmissionData;->getSelfieVideo()Ljava/util/List;

    move-result-object v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/identification/IdentificationSubmissionData;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public static final toWire(Lco/bird/android/model/identification/IdentificationSubmissionData;)Lco/bird/android/model/wire/WireIdentificationSubmissionData;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireIdentificationSubmissionData;

    invoke-virtual {p0}, Lco/bird/android/model/identification/IdentificationSubmissionData;->getBarcode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/identification/IdentificationSubmissionData;->getDocumentFront()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/identification/IdentificationSubmissionData;->getDocumentBack()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/identification/IdentificationSubmissionData;->getSelfiePhoto()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/identification/IdentificationSubmissionData;->getSelfieVideo()Ljava/util/List;

    move-result-object v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/wire/WireIdentificationSubmissionData;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method
