.class public final Lco/bird/android/model/wire/WireBountyFlightSheetSection;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u00c6\u0003J7\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0018\u0010\u0008\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001f"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireBountyFlightSheetSection;",
        "",
        "type",
        "Lco/bird/android/model/constant/BountyFlightSheetSectionType;",
        "text",
        "Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;",
        "vehicleList",
        "Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;",
        "photos",
        "Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;",
        "(Lco/bird/android/model/constant/BountyFlightSheetSectionType;Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;)V",
        "getPhotos",
        "()Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;",
        "getText",
        "()Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;",
        "getType",
        "()Lco/bird/android/model/constant/BountyFlightSheetSectionType;",
        "getVehicleList",
        "()Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;",
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
.field private final photos:Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "photos"
    .end annotation

    .annotation runtime Lft5;
        value = "photos"
    .end annotation
.end field

.field private final text:Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "text"
    .end annotation

    .annotation runtime Lft5;
        value = "text"
    .end annotation
.end field

.field private final type:Lco/bird/android/model/constant/BountyFlightSheetSectionType;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "type"
    .end annotation

    .annotation runtime Lft5;
        value = "type"
    .end annotation
.end field

.field private final vehicleList:Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "vehicle_list"
    .end annotation

    .annotation runtime Lft5;
        value = "vehicle_list"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/model/constant/BountyFlightSheetSectionType;Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->type:Lco/bird/android/model/constant/BountyFlightSheetSectionType;

    iput-object p2, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->text:Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;

    iput-object p3, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->vehicleList:Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;

    iput-object p4, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->photos:Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/constant/BountyFlightSheetSectionType;Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/model/wire/WireBountyFlightSheetSection;-><init>(Lco/bird/android/model/constant/BountyFlightSheetSectionType;Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireBountyFlightSheetSection;Lco/bird/android/model/constant/BountyFlightSheetSectionType;Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;ILjava/lang/Object;)Lco/bird/android/model/wire/WireBountyFlightSheetSection;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->type:Lco/bird/android/model/constant/BountyFlightSheetSectionType;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->text:Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->vehicleList:Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->photos:Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->copy(Lco/bird/android/model/constant/BountyFlightSheetSectionType;Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;)Lco/bird/android/model/wire/WireBountyFlightSheetSection;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/constant/BountyFlightSheetSectionType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->type:Lco/bird/android/model/constant/BountyFlightSheetSectionType;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->text:Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->vehicleList:Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->photos:Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/constant/BountyFlightSheetSectionType;Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;)Lco/bird/android/model/wire/WireBountyFlightSheetSection;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/model/wire/WireBountyFlightSheetSection;-><init>(Lco/bird/android/model/constant/BountyFlightSheetSectionType;Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireBountyFlightSheetSection;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireBountyFlightSheetSection;

    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->type:Lco/bird/android/model/constant/BountyFlightSheetSectionType;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->type:Lco/bird/android/model/constant/BountyFlightSheetSectionType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->text:Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->text:Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->vehicleList:Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;

    iget-object v3, p1, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->vehicleList:Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->photos:Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;

    iget-object p1, p1, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->photos:Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getPhotos()Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->photos:Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;

    return-object v0
.end method

.method public final getText()Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->text:Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;

    return-object v0
.end method

.method public final getType()Lco/bird/android/model/constant/BountyFlightSheetSectionType;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->type:Lco/bird/android/model/constant/BountyFlightSheetSectionType;

    return-object v0
.end method

.method public final getVehicleList()Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->vehicleList:Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->type:Lco/bird/android/model/constant/BountyFlightSheetSectionType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->text:Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->vehicleList:Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->photos:Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->type:Lco/bird/android/model/constant/BountyFlightSheetSectionType;

    iget-object v1, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->text:Lco/bird/android/model/wire/WireBountyFlightSheetSectionText;

    iget-object v2, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->vehicleList:Lco/bird/android/model/wire/WireBountyFlightSheetSectionVehicleList;

    iget-object v3, p0, Lco/bird/android/model/wire/WireBountyFlightSheetSection;->photos:Lco/bird/android/model/wire/WireBountyFlightSheetSectionPhotos;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "WireBountyFlightSheetSection(type="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", text="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", vehicleList="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", photos="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
