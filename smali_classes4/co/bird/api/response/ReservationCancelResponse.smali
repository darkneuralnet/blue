.class public final Lco/bird/api/response/ReservationCancelResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u001c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0016"
    }
    d2 = {
        "Lco/bird/api/response/ReservationCancelResponse;",
        "",
        "reservation",
        "Lco/bird/android/model/Reservation;",
        "reservationIssues",
        "",
        "Lco/bird/android/model/ReservationIssueOption;",
        "(Lco/bird/android/model/Reservation;Ljava/util/List;)V",
        "getReservation",
        "()Lco/bird/android/model/Reservation;",
        "getReservationIssues",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "co.bird.android.api"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final reservation:Lco/bird/android/model/Reservation;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "wire_reservation"
    .end annotation

    .annotation runtime Lft5;
        value = "wire_reservation"
    .end annotation
.end field

.field private final reservationIssues:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "reservation_issues"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/ReservationIssueOption;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "reservation_issues"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/model/Reservation;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Reservation;",
            "Ljava/util/List<",
            "Lco/bird/android/model/ReservationIssueOption;",
            ">;)V"
        }
    .end annotation

    const-string v0, "reservation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reservationIssues"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/response/ReservationCancelResponse;->reservation:Lco/bird/android/model/Reservation;

    iput-object p2, p0, Lco/bird/api/response/ReservationCancelResponse;->reservationIssues:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/Reservation;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    :cond_0
    invoke-direct {p0, p1, p2}, Lco/bird/api/response/ReservationCancelResponse;-><init>(Lco/bird/android/model/Reservation;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/ReservationCancelResponse;Lco/bird/android/model/Reservation;Ljava/util/List;ILjava/lang/Object;)Lco/bird/api/response/ReservationCancelResponse;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lco/bird/api/response/ReservationCancelResponse;->reservation:Lco/bird/android/model/Reservation;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lco/bird/api/response/ReservationCancelResponse;->reservationIssues:Ljava/util/List;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lco/bird/api/response/ReservationCancelResponse;->copy(Lco/bird/android/model/Reservation;Ljava/util/List;)Lco/bird/api/response/ReservationCancelResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/Reservation;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/ReservationCancelResponse;->reservation:Lco/bird/android/model/Reservation;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/ReservationIssueOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/response/ReservationCancelResponse;->reservationIssues:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/Reservation;Ljava/util/List;)Lco/bird/api/response/ReservationCancelResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Reservation;",
            "Ljava/util/List<",
            "Lco/bird/android/model/ReservationIssueOption;",
            ">;)",
            "Lco/bird/api/response/ReservationCancelResponse;"
        }
    .end annotation

    const-string v0, "reservation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reservationIssues"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/response/ReservationCancelResponse;

    invoke-direct {v0, p1, p2}, Lco/bird/api/response/ReservationCancelResponse;-><init>(Lco/bird/android/model/Reservation;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/ReservationCancelResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/ReservationCancelResponse;

    iget-object v1, p0, Lco/bird/api/response/ReservationCancelResponse;->reservation:Lco/bird/android/model/Reservation;

    iget-object v3, p1, Lco/bird/api/response/ReservationCancelResponse;->reservation:Lco/bird/android/model/Reservation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/response/ReservationCancelResponse;->reservationIssues:Ljava/util/List;

    iget-object p1, p1, Lco/bird/api/response/ReservationCancelResponse;->reservationIssues:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getReservation()Lco/bird/android/model/Reservation;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/ReservationCancelResponse;->reservation:Lco/bird/android/model/Reservation;

    return-object v0
.end method

.method public final getReservationIssues()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/ReservationIssueOption;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/response/ReservationCancelResponse;->reservationIssues:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/api/response/ReservationCancelResponse;->reservation:Lco/bird/android/model/Reservation;

    invoke-virtual {v0}, Lco/bird/android/model/Reservation;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/ReservationCancelResponse;->reservationIssues:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lco/bird/api/response/ReservationCancelResponse;->reservation:Lco/bird/android/model/Reservation;

    iget-object v1, p0, Lco/bird/api/response/ReservationCancelResponse;->reservationIssues:Ljava/util/List;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ReservationCancelResponse(reservation="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", reservationIssues="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
