.class public final Lco/bird/android/model/persistence/ZoneFlightSheetDetails;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J7\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001f"
    }
    d2 = {
        "Lco/bird/android/model/persistence/ZoneFlightSheetDetails;",
        "",
        "zoneId",
        "",
        "zoneSummary",
        "Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;",
        "zoneStatus",
        "Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;",
        "detailSections",
        "",
        "Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;",
        "(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;Ljava/util/List;)V",
        "getDetailSections",
        "()Ljava/util/List;",
        "getZoneId",
        "()Ljava/lang/String;",
        "getZoneStatus",
        "()Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;",
        "getZoneSummary",
        "()Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "model-persistence_release"
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
.field private final detailSections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;",
            ">;"
        }
    .end annotation
.end field

.field private final zoneId:Ljava/lang/String;

.field private final zoneStatus:Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;

.field private final zoneSummary:Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;",
            "Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;",
            ">;)V"
        }
    .end annotation

    const-string v0, "zoneId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoneSummary"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoneStatus"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailSections"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneId:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneSummary:Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;

    iput-object p3, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneStatus:Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;

    iput-object p4, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->detailSections:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/ZoneFlightSheetDetails;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;Ljava/util/List;ILjava/lang/Object;)Lco/bird/android/model/persistence/ZoneFlightSheetDetails;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneSummary:Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneStatus:Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->detailSections:Ljava/util/List;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->copy(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;Ljava/util/List;)Lco/bird/android/model/persistence/ZoneFlightSheetDetails;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneSummary:Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneStatus:Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->detailSections:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;Ljava/util/List;)Lco/bird/android/model/persistence/ZoneFlightSheetDetails;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;",
            "Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;",
            ">;)",
            "Lco/bird/android/model/persistence/ZoneFlightSheetDetails;"
        }
    .end annotation

    const-string v0, "zoneId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoneSummary"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoneStatus"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailSections"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;-><init>(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;

    iget-object v1, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneSummary:Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;

    iget-object v3, p1, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneSummary:Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneStatus:Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;

    iget-object v3, p1, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneStatus:Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->detailSections:Ljava/util/List;

    iget-object p1, p1, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->detailSections:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getDetailSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/nestedstructures/ZoneDetails;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->detailSections:Ljava/util/List;

    return-object v0
.end method

.method public final getZoneId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneId:Ljava/lang/String;

    return-object v0
.end method

.method public final getZoneStatus()Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneStatus:Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;

    return-object v0
.end method

.method public final getZoneSummary()Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneSummary:Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneSummary:Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneStatus:Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->detailSections:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneId:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneSummary:Lco/bird/android/model/persistence/nestedstructures/ZoneSummary;

    iget-object v2, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->zoneStatus:Lco/bird/android/model/persistence/nestedstructures/ZoneStatus;

    iget-object v3, p0, Lco/bird/android/model/persistence/ZoneFlightSheetDetails;->detailSections:Ljava/util/List;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ZoneFlightSheetDetails(zoneId="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", zoneSummary="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", zoneStatus="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", detailSections="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
