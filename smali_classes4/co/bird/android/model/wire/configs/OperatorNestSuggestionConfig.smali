.class public final Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0012\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0008\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000b\u00a8\u0006\u001b"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;",
        "",
        "enabled",
        "",
        "maxNestDistanceFromUserMeters",
        "",
        "maxNestCapacity",
        "",
        "photoRequired",
        "(ZDIZ)V",
        "getEnabled",
        "()Z",
        "getMaxNestCapacity",
        "()I",
        "getMaxNestDistanceFromUserMeters",
        "()D",
        "getPhotoRequired",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
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
.field private final enabled:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enabled"
    .end annotation

    .annotation runtime Lft5;
        value = "enabled"
    .end annotation
.end field

.field private final maxNestCapacity:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "max_nest_capacity"
    .end annotation

    .annotation runtime Lft5;
        value = "max_nest_capacity"
    .end annotation
.end field

.field private final maxNestDistanceFromUserMeters:D
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "max_nest_distance_from_user_meters"
    .end annotation

    .annotation runtime Lft5;
        value = "max_nest_distance_from_user_meters"
    .end annotation
.end field

.field private final photoRequired:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "photo_required"
    .end annotation

    .annotation runtime Lft5;
        value = "photo_required"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xf

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;-><init>(ZDIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZDIZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->enabled:Z

    iput-wide p2, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->maxNestDistanceFromUserMeters:D

    iput p4, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->maxNestCapacity:I

    iput-boolean p5, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->photoRequired:Z

    return-void
.end method

.method public synthetic constructor <init>(ZDIZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p7, v0

    goto :goto_0

    :cond_0
    move p7, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    const-wide/high16 p2, 0x4059000000000000L    # 100.0

    :cond_1
    move-wide v1, p2

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    const/16 p4, 0x63

    :cond_2
    move v3, p4

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    move p6, v0

    goto :goto_1

    :cond_3
    move p6, p5

    :goto_1
    move-object p1, p0

    move p2, p7

    move-wide p3, v1

    move p5, v3

    invoke-direct/range {p1 .. p6}, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;-><init>(ZDIZ)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;ZDIZILjava/lang/Object;)Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-boolean p1, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->enabled:Z

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-wide p2, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->maxNestDistanceFromUserMeters:D

    :cond_1
    move-wide v0, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget p4, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->maxNestCapacity:I

    :cond_2
    move p7, p4

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-boolean p5, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->photoRequired:Z

    :cond_3
    move v2, p5

    move-object p2, p0

    move p3, p1

    move-wide p4, v0

    move p6, p7

    move p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->copy(ZDIZ)Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->enabled:Z

    return v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->maxNestDistanceFromUserMeters:D

    return-wide v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->maxNestCapacity:I

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->photoRequired:Z

    return v0
.end method

.method public final copy(ZDIZ)Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;
    .locals 7

    new-instance v6, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;

    move-object v0, v6

    move v1, p1

    move-wide v2, p2

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;-><init>(ZDIZ)V

    return-object v6
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->enabled:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->enabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->maxNestDistanceFromUserMeters:D

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->maxNestDistanceFromUserMeters:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->maxNestCapacity:I

    iget v3, p1, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->maxNestCapacity:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->photoRequired:Z

    iget-boolean p1, p1, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->photoRequired:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->enabled:Z

    return v0
.end method

.method public final getMaxNestCapacity()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->maxNestCapacity:I

    return v0
.end method

.method public final getMaxNestDistanceFromUserMeters()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->maxNestDistanceFromUserMeters:D

    return-wide v0
.end method

.method public final getPhotoRequired()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->photoRequired:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->enabled:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-wide v2, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->maxNestDistanceFromUserMeters:D

    invoke-static {v2, v3}, Ljava/lang/Double;->hashCode(D)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->maxNestCapacity:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->photoRequired:Z

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->enabled:Z

    iget-wide v1, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->maxNestDistanceFromUserMeters:D

    iget v3, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->maxNestCapacity:I

    iget-boolean v4, p0, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->photoRequired:Z

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "OperatorNestSuggestionConfig(enabled="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", maxNestDistanceFromUserMeters="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", maxNestCapacity="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", photoRequired="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
