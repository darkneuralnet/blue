.class public final Lco/bird/android/model/ReservationIssueOptionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "toComplaintOption",
        "Lco/bird/android/model/ComplaintOption;",
        "Lco/bird/android/model/ReservationIssueOption;",
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
.method public static final toComplaintOption(Lco/bird/android/model/ReservationIssueOption;)Lco/bird/android/model/ComplaintOption;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/ComplaintOption;

    invoke-virtual {p0}, Lco/bird/android/model/ReservationIssueOption;->getIssue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/ReservationIssueOption;->getDescription()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lco/bird/android/model/ComplaintOption;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
