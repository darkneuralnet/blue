.class public final Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0015"
    }
    d2 = {
        "Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;",
        "",
        "location",
        "Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
        "createdAt",
        "Lorg/joda/time/DateTime;",
        "(Lco/bird/android/model/persistence/nestedstructures/Geolocation;Lorg/joda/time/DateTime;)V",
        "getCreatedAt",
        "()Lorg/joda/time/DateTime;",
        "getLocation",
        "()Lco/bird/android/model/persistence/nestedstructures/Geolocation;",
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
.field private final createdAt:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "created_at"
    .end annotation

    .annotation runtime Lft5;
        value = "created_at"
    .end annotation
.end field

.field private final location:Lco/bird/android/model/persistence/nestedstructures/Geolocation;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "location"
    .end annotation

    .annotation runtime Lft5;
        value = "location"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/model/persistence/nestedstructures/Geolocation;Lorg/joda/time/DateTime;)V
    .locals 1

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;->location:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    iput-object p2, p0, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;->createdAt:Lorg/joda/time/DateTime;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/persistence/nestedstructures/Geolocation;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object p2

    const-string p3, "now()"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1, p2}, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;-><init>(Lco/bird/android/model/persistence/nestedstructures/Geolocation;Lorg/joda/time/DateTime;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Lorg/joda/time/DateTime;ILjava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;->location:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;->createdAt:Lorg/joda/time/DateTime;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;->copy(Lco/bird/android/model/persistence/nestedstructures/Geolocation;Lorg/joda/time/DateTime;)Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/persistence/nestedstructures/Geolocation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;->location:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    return-object v0
.end method

.method public final component2()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;->createdAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/persistence/nestedstructures/Geolocation;Lorg/joda/time/DateTime;)Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;
    .locals 1

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;

    invoke-direct {v0, p1, p2}, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;-><init>(Lco/bird/android/model/persistence/nestedstructures/Geolocation;Lorg/joda/time/DateTime;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;->location:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    iget-object v3, p1, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;->location:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;->createdAt:Lorg/joda/time/DateTime;

    iget-object p1, p1, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;->createdAt:Lorg/joda/time/DateTime;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getCreatedAt()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;->createdAt:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getLocation()Lco/bird/android/model/persistence/nestedstructures/Geolocation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;->location:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;->location:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/Geolocation;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;->createdAt:Lorg/joda/time/DateTime;

    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;->location:Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    iget-object v1, p0, Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;->createdAt:Lorg/joda/time/DateTime;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BirdLocationTrack(location="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", createdAt="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
