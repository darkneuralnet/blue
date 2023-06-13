.class public final Lco/bird/android/model/filter/KeyBasedAreasFilter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u000e\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0016"
    }
    d2 = {
        "Lco/bird/android/model/filter/KeyBasedAreasFilter;",
        "",
        "birdSelected",
        "",
        "areaKey",
        "",
        "(ZLjava/lang/String;)V",
        "getAreaKey",
        "()Ljava/lang/String;",
        "getBirdSelected",
        "()Z",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "filter",
        "area",
        "Lco/bird/android/model/persistence/Area;",
        "hashCode",
        "",
        "toString",
        "model_release"
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
.field private final areaKey:Ljava/lang/String;

.field private final birdSelected:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1, v0}, Lco/bird/android/model/filter/KeyBasedAreasFilter;-><init>(ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/filter/KeyBasedAreasFilter;->birdSelected:Z

    iput-object p2, p0, Lco/bird/android/model/filter/KeyBasedAreasFilter;->areaKey:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/4 p2, 0x0

    :cond_1
    invoke-direct {p0, p1, p2}, Lco/bird/android/model/filter/KeyBasedAreasFilter;-><init>(ZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/filter/KeyBasedAreasFilter;ZLjava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/filter/KeyBasedAreasFilter;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-boolean p1, p0, Lco/bird/android/model/filter/KeyBasedAreasFilter;->birdSelected:Z

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lco/bird/android/model/filter/KeyBasedAreasFilter;->areaKey:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lco/bird/android/model/filter/KeyBasedAreasFilter;->copy(ZLjava/lang/String;)Lco/bird/android/model/filter/KeyBasedAreasFilter;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/filter/KeyBasedAreasFilter;->birdSelected:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/filter/KeyBasedAreasFilter;->areaKey:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ZLjava/lang/String;)Lco/bird/android/model/filter/KeyBasedAreasFilter;
    .locals 1

    new-instance v0, Lco/bird/android/model/filter/KeyBasedAreasFilter;

    invoke-direct {v0, p1, p2}, Lco/bird/android/model/filter/KeyBasedAreasFilter;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/filter/KeyBasedAreasFilter;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/filter/KeyBasedAreasFilter;

    iget-boolean v1, p0, Lco/bird/android/model/filter/KeyBasedAreasFilter;->birdSelected:Z

    iget-boolean v3, p1, Lco/bird/android/model/filter/KeyBasedAreasFilter;->birdSelected:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/filter/KeyBasedAreasFilter;->areaKey:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/filter/KeyBasedAreasFilter;->areaKey:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final filter(Lco/bird/android/model/persistence/Area;)Z
    .locals 3

    const-string v0, "area"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lco/bird/android/model/filter/KeyBasedAreasFilter;->birdSelected:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/persistence/Area;->getAreaKeys()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v1

    :goto_1
    if-nez v0, :cond_5

    iget-object v0, p0, Lco/bird/android/model/filter/KeyBasedAreasFilter;->areaKey:Ljava/lang/String;

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lco/bird/android/model/persistence/Area;->getAreaKeys()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Lco/bird/android/model/filter/KeyBasedAreasFilter;->areaKey:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-ne p1, v1, :cond_3

    move p1, v1

    goto :goto_2

    :cond_3
    move p1, v2

    :goto_2
    if-eqz p1, :cond_4

    goto :goto_3

    :cond_4
    move v1, v2

    :cond_5
    :goto_3
    return v1
.end method

.method public final getAreaKey()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/filter/KeyBasedAreasFilter;->areaKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getBirdSelected()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/filter/KeyBasedAreasFilter;->birdSelected:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lco/bird/android/model/filter/KeyBasedAreasFilter;->birdSelected:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/filter/KeyBasedAreasFilter;->areaKey:Ljava/lang/String;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-boolean v0, p0, Lco/bird/android/model/filter/KeyBasedAreasFilter;->birdSelected:Z

    iget-object v1, p0, Lco/bird/android/model/filter/KeyBasedAreasFilter;->areaKey:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "KeyBasedAreasFilter(birdSelected="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", areaKey="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
