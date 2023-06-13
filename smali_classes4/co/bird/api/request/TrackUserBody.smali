.class public final Lco/bird/api/request/TrackUserBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0015\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0016\u0010\u0008\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000b\u00a8\u0006\u001f"
    }
    d2 = {
        "Lco/bird/api/request/TrackUserBody;",
        "",
        "latitude",
        "",
        "longitude",
        "heading",
        "speed",
        "altitude",
        "accuracy",
        "(DDDDDD)V",
        "getAccuracy",
        "()D",
        "getAltitude",
        "getHeading",
        "getLatitude",
        "getLongitude",
        "getSpeed",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
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
.field private final accuracy:D
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "accuracy"
    .end annotation

    .annotation runtime Lft5;
        value = "accuracy"
    .end annotation
.end field

.field private final altitude:D
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "altitude"
    .end annotation

    .annotation runtime Lft5;
        value = "altitude"
    .end annotation
.end field

.field private final heading:D
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "heading"
    .end annotation

    .annotation runtime Lft5;
        value = "heading"
    .end annotation
.end field

.field private final latitude:D
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "latitude"
    .end annotation

    .annotation runtime Lft5;
        value = "latitude"
    .end annotation
.end field

.field private final longitude:D
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "longitude"
    .end annotation

    .annotation runtime Lft5;
        value = "longitude"
    .end annotation
.end field

.field private final speed:D
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "speed"
    .end annotation

    .annotation runtime Lft5;
        value = "speed"
    .end annotation
.end field


# direct methods
.method public constructor <init>(DDDDDD)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lco/bird/api/request/TrackUserBody;->latitude:D

    iput-wide p3, p0, Lco/bird/api/request/TrackUserBody;->longitude:D

    iput-wide p5, p0, Lco/bird/api/request/TrackUserBody;->heading:D

    iput-wide p7, p0, Lco/bird/api/request/TrackUserBody;->speed:D

    iput-wide p9, p0, Lco/bird/api/request/TrackUserBody;->altitude:D

    iput-wide p11, p0, Lco/bird/api/request/TrackUserBody;->accuracy:D

    return-void
.end method

.method public synthetic constructor <init>(DDDDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    and-int/lit8 v0, p13, 0x10

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    move-wide v12, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v12, p9

    :goto_0
    and-int/lit8 v0, p13, 0x20

    if-eqz v0, :cond_1

    move-wide v14, v1

    goto :goto_1

    :cond_1
    move-wide/from16 v14, p11

    :goto_1
    move-object/from16 v3, p0

    move-wide/from16 v4, p1

    move-wide/from16 v6, p3

    move-wide/from16 v8, p5

    move-wide/from16 v10, p7

    invoke-direct/range {v3 .. v15}, Lco/bird/api/request/TrackUserBody;-><init>(DDDDDD)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/request/TrackUserBody;DDDDDDILjava/lang/Object;)Lco/bird/api/request/TrackUserBody;
    .locals 13

    move-object v0, p0

    and-int/lit8 v1, p13, 0x1

    if-eqz v1, :cond_0

    iget-wide v1, v0, Lco/bird/api/request/TrackUserBody;->latitude:D

    goto :goto_0

    :cond_0
    move-wide v1, p1

    :goto_0
    and-int/lit8 v3, p13, 0x2

    if-eqz v3, :cond_1

    iget-wide v3, v0, Lco/bird/api/request/TrackUserBody;->longitude:D

    goto :goto_1

    :cond_1
    move-wide/from16 v3, p3

    :goto_1
    and-int/lit8 v5, p13, 0x4

    if-eqz v5, :cond_2

    iget-wide v5, v0, Lco/bird/api/request/TrackUserBody;->heading:D

    goto :goto_2

    :cond_2
    move-wide/from16 v5, p5

    :goto_2
    and-int/lit8 v7, p13, 0x8

    if-eqz v7, :cond_3

    iget-wide v7, v0, Lco/bird/api/request/TrackUserBody;->speed:D

    goto :goto_3

    :cond_3
    move-wide/from16 v7, p7

    :goto_3
    and-int/lit8 v9, p13, 0x10

    if-eqz v9, :cond_4

    iget-wide v9, v0, Lco/bird/api/request/TrackUserBody;->altitude:D

    goto :goto_4

    :cond_4
    move-wide/from16 v9, p9

    :goto_4
    and-int/lit8 v11, p13, 0x20

    if-eqz v11, :cond_5

    iget-wide v11, v0, Lco/bird/api/request/TrackUserBody;->accuracy:D

    goto :goto_5

    :cond_5
    move-wide/from16 v11, p11

    :goto_5
    move-wide p1, v1

    move-wide/from16 p3, v3

    move-wide/from16 p5, v5

    move-wide/from16 p7, v7

    move-wide/from16 p9, v9

    move-wide/from16 p11, v11

    invoke-virtual/range {p0 .. p12}, Lco/bird/api/request/TrackUserBody;->copy(DDDDDD)Lco/bird/api/request/TrackUserBody;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lco/bird/api/request/TrackUserBody;->latitude:D

    return-wide v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lco/bird/api/request/TrackUserBody;->longitude:D

    return-wide v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lco/bird/api/request/TrackUserBody;->heading:D

    return-wide v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lco/bird/api/request/TrackUserBody;->speed:D

    return-wide v0
.end method

.method public final component5()D
    .locals 2

    iget-wide v0, p0, Lco/bird/api/request/TrackUserBody;->altitude:D

    return-wide v0
.end method

.method public final component6()D
    .locals 2

    iget-wide v0, p0, Lco/bird/api/request/TrackUserBody;->accuracy:D

    return-wide v0
.end method

.method public final copy(DDDDDD)Lco/bird/api/request/TrackUserBody;
    .locals 14

    new-instance v13, Lco/bird/api/request/TrackUserBody;

    move-object v0, v13

    move-wide v1, p1

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move-wide/from16 v9, p9

    move-wide/from16 v11, p11

    invoke-direct/range {v0 .. v12}, Lco/bird/api/request/TrackUserBody;-><init>(DDDDDD)V

    return-object v13
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/request/TrackUserBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/request/TrackUserBody;

    iget-wide v3, p0, Lco/bird/api/request/TrackUserBody;->latitude:D

    iget-wide v5, p1, Lco/bird/api/request/TrackUserBody;->latitude:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lco/bird/api/request/TrackUserBody;->longitude:D

    iget-wide v5, p1, Lco/bird/api/request/TrackUserBody;->longitude:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lco/bird/api/request/TrackUserBody;->heading:D

    iget-wide v5, p1, Lco/bird/api/request/TrackUserBody;->heading:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lco/bird/api/request/TrackUserBody;->speed:D

    iget-wide v5, p1, Lco/bird/api/request/TrackUserBody;->speed:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lco/bird/api/request/TrackUserBody;->altitude:D

    iget-wide v5, p1, Lco/bird/api/request/TrackUserBody;->altitude:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lco/bird/api/request/TrackUserBody;->accuracy:D

    iget-wide v5, p1, Lco/bird/api/request/TrackUserBody;->accuracy:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAccuracy()D
    .locals 2

    iget-wide v0, p0, Lco/bird/api/request/TrackUserBody;->accuracy:D

    return-wide v0
.end method

.method public final getAltitude()D
    .locals 2

    iget-wide v0, p0, Lco/bird/api/request/TrackUserBody;->altitude:D

    return-wide v0
.end method

.method public final getHeading()D
    .locals 2

    iget-wide v0, p0, Lco/bird/api/request/TrackUserBody;->heading:D

    return-wide v0
.end method

.method public final getLatitude()D
    .locals 2

    iget-wide v0, p0, Lco/bird/api/request/TrackUserBody;->latitude:D

    return-wide v0
.end method

.method public final getLongitude()D
    .locals 2

    iget-wide v0, p0, Lco/bird/api/request/TrackUserBody;->longitude:D

    return-wide v0
.end method

.method public final getSpeed()D
    .locals 2

    iget-wide v0, p0, Lco/bird/api/request/TrackUserBody;->speed:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lco/bird/api/request/TrackUserBody;->latitude:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/api/request/TrackUserBody;->longitude:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/api/request/TrackUserBody;->heading:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/api/request/TrackUserBody;->speed:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/api/request/TrackUserBody;->altitude:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/api/request/TrackUserBody;->accuracy:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-wide v0, p0, Lco/bird/api/request/TrackUserBody;->latitude:D

    iget-wide v2, p0, Lco/bird/api/request/TrackUserBody;->longitude:D

    iget-wide v4, p0, Lco/bird/api/request/TrackUserBody;->heading:D

    iget-wide v6, p0, Lco/bird/api/request/TrackUserBody;->speed:D

    iget-wide v8, p0, Lco/bird/api/request/TrackUserBody;->altitude:D

    iget-wide v10, p0, Lco/bird/api/request/TrackUserBody;->accuracy:D

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "TrackUserBody(latitude="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", longitude="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", heading="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", speed="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", altitude="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", accuracy="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
