.class public final Lco/bird/api/request/RadarTagVersionBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\t\u00a8\u0006\u0018"
    }
    d2 = {
        "Lco/bird/api/request/RadarTagVersionBody;",
        "",
        "major",
        "",
        "minor",
        "fix",
        "time",
        "(IIII)V",
        "getFix",
        "()I",
        "getMajor",
        "getMinor",
        "getTime",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
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
.field private final fix:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "fix"
    .end annotation

    .annotation runtime Lft5;
        value = "fix"
    .end annotation
.end field

.field private final major:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "major"
    .end annotation

    .annotation runtime Lft5;
        value = "major"
    .end annotation
.end field

.field private final minor:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "minor"
    .end annotation

    .annotation runtime Lft5;
        value = "minor"
    .end annotation
.end field

.field private final time:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "time"
    .end annotation

    .annotation runtime Lft5;
        value = "time"
    .end annotation
.end field


# direct methods
.method public constructor <init>(IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lco/bird/api/request/RadarTagVersionBody;->major:I

    iput p2, p0, Lco/bird/api/request/RadarTagVersionBody;->minor:I

    iput p3, p0, Lco/bird/api/request/RadarTagVersionBody;->fix:I

    iput p4, p0, Lco/bird/api/request/RadarTagVersionBody;->time:I

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/request/RadarTagVersionBody;IIIIILjava/lang/Object;)Lco/bird/api/request/RadarTagVersionBody;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lco/bird/api/request/RadarTagVersionBody;->major:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lco/bird/api/request/RadarTagVersionBody;->minor:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lco/bird/api/request/RadarTagVersionBody;->fix:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lco/bird/api/request/RadarTagVersionBody;->time:I

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/api/request/RadarTagVersionBody;->copy(IIII)Lco/bird/api/request/RadarTagVersionBody;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lco/bird/api/request/RadarTagVersionBody;->major:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lco/bird/api/request/RadarTagVersionBody;->minor:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/bird/api/request/RadarTagVersionBody;->fix:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lco/bird/api/request/RadarTagVersionBody;->time:I

    return v0
.end method

.method public final copy(IIII)Lco/bird/api/request/RadarTagVersionBody;
    .locals 1

    new-instance v0, Lco/bird/api/request/RadarTagVersionBody;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/api/request/RadarTagVersionBody;-><init>(IIII)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/request/RadarTagVersionBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/request/RadarTagVersionBody;

    iget v1, p0, Lco/bird/api/request/RadarTagVersionBody;->major:I

    iget v3, p1, Lco/bird/api/request/RadarTagVersionBody;->major:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lco/bird/api/request/RadarTagVersionBody;->minor:I

    iget v3, p1, Lco/bird/api/request/RadarTagVersionBody;->minor:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lco/bird/api/request/RadarTagVersionBody;->fix:I

    iget v3, p1, Lco/bird/api/request/RadarTagVersionBody;->fix:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lco/bird/api/request/RadarTagVersionBody;->time:I

    iget p1, p1, Lco/bird/api/request/RadarTagVersionBody;->time:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getFix()I
    .locals 1

    iget v0, p0, Lco/bird/api/request/RadarTagVersionBody;->fix:I

    return v0
.end method

.method public final getMajor()I
    .locals 1

    iget v0, p0, Lco/bird/api/request/RadarTagVersionBody;->major:I

    return v0
.end method

.method public final getMinor()I
    .locals 1

    iget v0, p0, Lco/bird/api/request/RadarTagVersionBody;->minor:I

    return v0
.end method

.method public final getTime()I
    .locals 1

    iget v0, p0, Lco/bird/api/request/RadarTagVersionBody;->time:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lco/bird/api/request/RadarTagVersionBody;->major:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/api/request/RadarTagVersionBody;->minor:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/api/request/RadarTagVersionBody;->fix:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/api/request/RadarTagVersionBody;->time:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lco/bird/api/request/RadarTagVersionBody;->major:I

    iget v1, p0, Lco/bird/api/request/RadarTagVersionBody;->minor:I

    iget v2, p0, Lco/bird/api/request/RadarTagVersionBody;->fix:I

    iget v3, p0, Lco/bird/api/request/RadarTagVersionBody;->time:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "RadarTagVersionBody(major="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", minor="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", fix="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", time="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
