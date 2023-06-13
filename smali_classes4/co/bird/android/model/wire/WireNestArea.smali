.class public final Lco/bird/android/model/wire/WireNestArea;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0015"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireNestArea;",
        "",
        "location",
        "Lco/bird/android/model/wire/WireLocation;",
        "radius",
        "",
        "(Lco/bird/android/model/wire/WireLocation;D)V",
        "getLocation",
        "()Lco/bird/android/model/wire/WireLocation;",
        "getRadius",
        "()D",
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
.field private final location:Lco/bird/android/model/wire/WireLocation;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "location"
    .end annotation

    .annotation runtime Lft5;
        value = "location"
    .end annotation
.end field

.field private final radius:D
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "radius"
    .end annotation

    .annotation runtime Lft5;
        value = "radius"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/wire/WireNestArea;-><init>(Lco/bird/android/model/wire/WireLocation;DILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/wire/WireLocation;D)V
    .locals 1

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/WireNestArea;->location:Lco/bird/android/model/wire/WireLocation;

    iput-wide p2, p0, Lco/bird/android/model/wire/WireNestArea;->radius:D

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/WireLocation;DILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    new-instance v0, Lco/bird/android/model/wire/WireLocation;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0x1ff

    const/4 v14, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v14}, Lco/bird/android/model/wire/WireLocation;-><init>(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object/from16 v0, p1

    :goto_0
    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_1

    const-wide/16 v1, 0x0

    move-object v3, p0

    goto :goto_1

    :cond_1
    move-object v3, p0

    move-wide/from16 v1, p2

    :goto_1
    invoke-direct {p0, v0, v1, v2}, Lco/bird/android/model/wire/WireNestArea;-><init>(Lco/bird/android/model/wire/WireLocation;D)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireNestArea;Lco/bird/android/model/wire/WireLocation;DILjava/lang/Object;)Lco/bird/android/model/wire/WireNestArea;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/bird/android/model/wire/WireNestArea;->location:Lco/bird/android/model/wire/WireLocation;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    iget-wide p2, p0, Lco/bird/android/model/wire/WireNestArea;->radius:D

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/model/wire/WireNestArea;->copy(Lco/bird/android/model/wire/WireLocation;D)Lco/bird/android/model/wire/WireNestArea;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/wire/WireLocation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireNestArea;->location:Lco/bird/android/model/wire/WireLocation;

    return-object v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/WireNestArea;->radius:D

    return-wide v0
.end method

.method public final copy(Lco/bird/android/model/wire/WireLocation;D)Lco/bird/android/model/wire/WireNestArea;
    .locals 1

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireNestArea;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/android/model/wire/WireNestArea;-><init>(Lco/bird/android/model/wire/WireLocation;D)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireNestArea;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireNestArea;

    iget-object v1, p0, Lco/bird/android/model/wire/WireNestArea;->location:Lco/bird/android/model/wire/WireLocation;

    iget-object v3, p1, Lco/bird/android/model/wire/WireNestArea;->location:Lco/bird/android/model/wire/WireLocation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lco/bird/android/model/wire/WireNestArea;->radius:D

    iget-wide v5, p1, Lco/bird/android/model/wire/WireNestArea;->radius:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getLocation()Lco/bird/android/model/wire/WireLocation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireNestArea;->location:Lco/bird/android/model/wire/WireLocation;

    return-object v0
.end method

.method public final getRadius()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/WireNestArea;->radius:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/WireNestArea;->location:Lco/bird/android/model/wire/WireLocation;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireLocation;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/wire/WireNestArea;->radius:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lco/bird/android/model/wire/WireNestArea;->location:Lco/bird/android/model/wire/WireLocation;

    iget-wide v1, p0, Lco/bird/android/model/wire/WireNestArea;->radius:D

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WireNestArea(location="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", radius="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
