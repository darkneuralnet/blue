.class public final Lco/bird/android/model/wire/WireZoneFlightSheetDetails;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B)\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u001c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001b"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireZoneFlightSheetDetails;",
        "",
        "zoneSummary",
        "Lco/bird/android/model/wire/WireZoneSummary;",
        "zoneStatus",
        "Lco/bird/android/model/wire/WireZoneStatus;",
        "detailSections",
        "",
        "Lco/bird/android/model/wire/WireZoneDetails;",
        "(Lco/bird/android/model/wire/WireZoneSummary;Lco/bird/android/model/wire/WireZoneStatus;Ljava/util/List;)V",
        "getDetailSections",
        "()Ljava/util/List;",
        "getZoneStatus",
        "()Lco/bird/android/model/wire/WireZoneStatus;",
        "getZoneSummary",
        "()Lco/bird/android/model/wire/WireZoneSummary;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "model-wire_release"
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
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "detail_sections"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireZoneDetails;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "detail_sections"
    .end annotation
.end field

.field private final zoneStatus:Lco/bird/android/model/wire/WireZoneStatus;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "zone_status"
    .end annotation

    .annotation runtime Lft5;
        value = "zone_status"
    .end annotation
.end field

.field private final zoneSummary:Lco/bird/android/model/wire/WireZoneSummary;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "zone_summary"
    .end annotation

    .annotation runtime Lft5;
        value = "zone_summary"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;-><init>(Lco/bird/android/model/wire/WireZoneSummary;Lco/bird/android/model/wire/WireZoneStatus;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/wire/WireZoneSummary;Lco/bird/android/model/wire/WireZoneStatus;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireZoneSummary;",
            "Lco/bird/android/model/wire/WireZoneStatus;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireZoneDetails;",
            ">;)V"
        }
    .end annotation

    const-string v0, "zoneSummary"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoneStatus"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailSections"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->zoneSummary:Lco/bird/android/model/wire/WireZoneSummary;

    iput-object p2, p0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->zoneStatus:Lco/bird/android/model/wire/WireZoneStatus;

    iput-object p3, p0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->detailSections:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/WireZoneSummary;Lco/bird/android/model/wire/WireZoneStatus;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    new-instance p1, Lco/bird/android/model/wire/WireZoneSummary;

    const/4 p5, 0x0

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-direct {p1, p5, v1, v0, v1}, Lco/bird/android/model/wire/WireZoneSummary;-><init>(ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    new-instance p2, Lco/bird/android/model/wire/WireZoneStatus;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3f

    const/4 v8, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v8}, Lco/bird/android/model/wire/WireZoneStatus;-><init>(ILjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireZoneFlightSheetIcon;Lco/bird/android/model/constant/ColoredIcon;Lco/bird/android/model/wire/WireThemedColors;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p3

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;-><init>(Lco/bird/android/model/wire/WireZoneSummary;Lco/bird/android/model/wire/WireZoneStatus;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireZoneFlightSheetDetails;Lco/bird/android/model/wire/WireZoneSummary;Lco/bird/android/model/wire/WireZoneStatus;Ljava/util/List;ILjava/lang/Object;)Lco/bird/android/model/wire/WireZoneFlightSheetDetails;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->zoneSummary:Lco/bird/android/model/wire/WireZoneSummary;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->zoneStatus:Lco/bird/android/model/wire/WireZoneStatus;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->detailSections:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->copy(Lco/bird/android/model/wire/WireZoneSummary;Lco/bird/android/model/wire/WireZoneStatus;Ljava/util/List;)Lco/bird/android/model/wire/WireZoneFlightSheetDetails;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/wire/WireZoneSummary;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->zoneSummary:Lco/bird/android/model/wire/WireZoneSummary;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/wire/WireZoneStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->zoneStatus:Lco/bird/android/model/wire/WireZoneStatus;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireZoneDetails;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->detailSections:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/wire/WireZoneSummary;Lco/bird/android/model/wire/WireZoneStatus;Ljava/util/List;)Lco/bird/android/model/wire/WireZoneFlightSheetDetails;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireZoneSummary;",
            "Lco/bird/android/model/wire/WireZoneStatus;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireZoneDetails;",
            ">;)",
            "Lco/bird/android/model/wire/WireZoneFlightSheetDetails;"
        }
    .end annotation

    const-string v0, "zoneSummary"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoneStatus"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detailSections"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;-><init>(Lco/bird/android/model/wire/WireZoneSummary;Lco/bird/android/model/wire/WireZoneStatus;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;

    iget-object v1, p0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->zoneSummary:Lco/bird/android/model/wire/WireZoneSummary;

    iget-object v3, p1, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->zoneSummary:Lco/bird/android/model/wire/WireZoneSummary;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->zoneStatus:Lco/bird/android/model/wire/WireZoneStatus;

    iget-object v3, p1, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->zoneStatus:Lco/bird/android/model/wire/WireZoneStatus;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->detailSections:Ljava/util/List;

    iget-object p1, p1, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->detailSections:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getDetailSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireZoneDetails;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->detailSections:Ljava/util/List;

    return-object v0
.end method

.method public final getZoneStatus()Lco/bird/android/model/wire/WireZoneStatus;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->zoneStatus:Lco/bird/android/model/wire/WireZoneStatus;

    return-object v0
.end method

.method public final getZoneSummary()Lco/bird/android/model/wire/WireZoneSummary;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->zoneSummary:Lco/bird/android/model/wire/WireZoneSummary;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->zoneSummary:Lco/bird/android/model/wire/WireZoneSummary;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireZoneSummary;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->zoneStatus:Lco/bird/android/model/wire/WireZoneStatus;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireZoneStatus;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->detailSections:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->zoneSummary:Lco/bird/android/model/wire/WireZoneSummary;

    iget-object v1, p0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->zoneStatus:Lco/bird/android/model/wire/WireZoneStatus;

    iget-object v2, p0, Lco/bird/android/model/wire/WireZoneFlightSheetDetails;->detailSections:Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WireZoneFlightSheetDetails(zoneSummary="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", zoneStatus="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", detailSections="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
