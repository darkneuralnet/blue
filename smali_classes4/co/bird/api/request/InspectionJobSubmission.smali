.class public final Lco/bird/api/request/InspectionJobSubmission;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J5\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001a"
    }
    d2 = {
        "Lco/bird/api/request/InspectionJobSubmission;",
        "",
        "inspectionId",
        "",
        "pointId",
        "inspectionPhotoUrl",
        "result",
        "Lco/bird/android/model/constant/BirdInspectionResult;",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdInspectionResult;)V",
        "getInspectionId",
        "()Ljava/lang/String;",
        "getInspectionPhotoUrl",
        "getPointId",
        "getResult",
        "()Lco/bird/android/model/constant/BirdInspectionResult;",
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
.field private final inspectionId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "inspection_id"
    .end annotation

    .annotation runtime Lft5;
        value = "inspection_id"
    .end annotation
.end field

.field private final inspectionPhotoUrl:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "inspection_photo_url"
    .end annotation

    .annotation runtime Lft5;
        value = "inspection_photo_url"
    .end annotation
.end field

.field private final pointId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "point_id"
    .end annotation

    .annotation runtime Lft5;
        value = "point_id"
    .end annotation
.end field

.field private final result:Lco/bird/android/model/constant/BirdInspectionResult;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "result"
    .end annotation

    .annotation runtime Lft5;
        value = "result"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdInspectionResult;)V
    .locals 1

    const-string v0, "inspectionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pointId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/request/InspectionJobSubmission;->inspectionId:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/api/request/InspectionJobSubmission;->pointId:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/api/request/InspectionJobSubmission;->inspectionPhotoUrl:Ljava/lang/String;

    iput-object p4, p0, Lco/bird/api/request/InspectionJobSubmission;->result:Lco/bird/android/model/constant/BirdInspectionResult;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdInspectionResult;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move-object p4, v0

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/api/request/InspectionJobSubmission;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdInspectionResult;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/request/InspectionJobSubmission;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdInspectionResult;ILjava/lang/Object;)Lco/bird/api/request/InspectionJobSubmission;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/api/request/InspectionJobSubmission;->inspectionId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/api/request/InspectionJobSubmission;->pointId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/api/request/InspectionJobSubmission;->inspectionPhotoUrl:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lco/bird/api/request/InspectionJobSubmission;->result:Lco/bird/android/model/constant/BirdInspectionResult;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/api/request/InspectionJobSubmission;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdInspectionResult;)Lco/bird/api/request/InspectionJobSubmission;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/InspectionJobSubmission;->inspectionId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/InspectionJobSubmission;->pointId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/InspectionJobSubmission;->inspectionPhotoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lco/bird/android/model/constant/BirdInspectionResult;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/InspectionJobSubmission;->result:Lco/bird/android/model/constant/BirdInspectionResult;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdInspectionResult;)Lco/bird/api/request/InspectionJobSubmission;
    .locals 1

    const-string v0, "inspectionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pointId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/request/InspectionJobSubmission;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/api/request/InspectionJobSubmission;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdInspectionResult;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/request/InspectionJobSubmission;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/request/InspectionJobSubmission;

    iget-object v1, p0, Lco/bird/api/request/InspectionJobSubmission;->inspectionId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/request/InspectionJobSubmission;->inspectionId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/request/InspectionJobSubmission;->pointId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/request/InspectionJobSubmission;->pointId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/request/InspectionJobSubmission;->inspectionPhotoUrl:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/request/InspectionJobSubmission;->inspectionPhotoUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/api/request/InspectionJobSubmission;->result:Lco/bird/android/model/constant/BirdInspectionResult;

    iget-object p1, p1, Lco/bird/api/request/InspectionJobSubmission;->result:Lco/bird/android/model/constant/BirdInspectionResult;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getInspectionId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/InspectionJobSubmission;->inspectionId:Ljava/lang/String;

    return-object v0
.end method

.method public final getInspectionPhotoUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/InspectionJobSubmission;->inspectionPhotoUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getPointId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/InspectionJobSubmission;->pointId:Ljava/lang/String;

    return-object v0
.end method

.method public final getResult()Lco/bird/android/model/constant/BirdInspectionResult;
    .locals 1

    iget-object v0, p0, Lco/bird/api/request/InspectionJobSubmission;->result:Lco/bird/android/model/constant/BirdInspectionResult;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/api/request/InspectionJobSubmission;->inspectionId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/InspectionJobSubmission;->pointId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/InspectionJobSubmission;->inspectionPhotoUrl:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/request/InspectionJobSubmission;->result:Lco/bird/android/model/constant/BirdInspectionResult;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/api/request/InspectionJobSubmission;->inspectionId:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/api/request/InspectionJobSubmission;->pointId:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/api/request/InspectionJobSubmission;->inspectionPhotoUrl:Ljava/lang/String;

    iget-object v3, p0, Lco/bird/api/request/InspectionJobSubmission;->result:Lco/bird/android/model/constant/BirdInspectionResult;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "InspectionJobSubmission(inspectionId="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", pointId="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", inspectionPhotoUrl="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", result="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
