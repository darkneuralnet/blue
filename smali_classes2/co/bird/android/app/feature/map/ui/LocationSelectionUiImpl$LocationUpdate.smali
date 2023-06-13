.class final Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LocationUpdate"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0082\u0008\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0014"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;",
        "",
        "location",
        "Lco/bird/android/model/wire/WireLocation;",
        "indirect",
        "",
        "(Lco/bird/android/model/wire/WireLocation;Z)V",
        "getIndirect",
        "()Z",
        "getLocation",
        "()Lco/bird/android/model/wire/WireLocation;",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "co.bird.android.feature.map"
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
.field private final indirect:Z

.field private final location:Lco/bird/android/model/wire/WireLocation;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireLocation;Z)V
    .locals 1

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;->location:Lco/bird/android/model/wire/WireLocation;

    iput-boolean p2, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;->indirect:Z

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;Lco/bird/android/model/wire/WireLocation;ZILjava/lang/Object;)Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;->location:Lco/bird/android/model/wire/WireLocation;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;->indirect:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;->copy(Lco/bird/android/model/wire/WireLocation;Z)Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/wire/WireLocation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;->location:Lco/bird/android/model/wire/WireLocation;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;->indirect:Z

    return v0
.end method

.method public final copy(Lco/bird/android/model/wire/WireLocation;Z)Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;
    .locals 1

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;

    invoke-direct {v0, p1, p2}, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;-><init>(Lco/bird/android/model/wire/WireLocation;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;->location:Lco/bird/android/model/wire/WireLocation;

    iget-object v3, p1, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;->location:Lco/bird/android/model/wire/WireLocation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;->indirect:Z

    iget-boolean p1, p1, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;->indirect:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getIndirect()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;->indirect:Z

    return v0
.end method

.method public final getLocation()Lco/bird/android/model/wire/WireLocation;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;->location:Lco/bird/android/model/wire/WireLocation;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;->location:Lco/bird/android/model/wire/WireLocation;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireLocation;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;->indirect:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;->location:Lco/bird/android/model/wire/WireLocation;

    iget-boolean v1, p0, Lco/bird/android/app/feature/map/ui/LocationSelectionUiImpl$LocationUpdate;->indirect:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "LocationUpdate(location="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", indirect="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
