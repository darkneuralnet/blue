.class final Lco/bird/android/app/feature/map/ui/RichPolygonArea;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0082\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u001d\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\t\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0018"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/ui/RichPolygonArea;",
        "",
        "Lzp0;",
        "component1",
        "Lco/bird/android/model/persistence/Area;",
        "component2",
        "commonPolygon",
        "area",
        "copy",
        "",
        "toString",
        "",
        "hashCode",
        "other",
        "",
        "equals",
        "Lzp0;",
        "getCommonPolygon",
        "()Lzp0;",
        "Lco/bird/android/model/persistence/Area;",
        "getArea",
        "()Lco/bird/android/model/persistence/Area;",
        "<init>",
        "(Lzp0;Lco/bird/android/model/persistence/Area;)V",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final area:Lco/bird/android/model/persistence/Area;

.field private final commonPolygon:Lzp0;


# direct methods
.method public constructor <init>(Lzp0;Lco/bird/android/model/persistence/Area;)V
    .locals 1

    const-string v0, "commonPolygon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "area"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/ui/RichPolygonArea;->commonPolygon:Lzp0;

    iput-object p2, p0, Lco/bird/android/app/feature/map/ui/RichPolygonArea;->area:Lco/bird/android/model/persistence/Area;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/app/feature/map/ui/RichPolygonArea;Lzp0;Lco/bird/android/model/persistence/Area;ILjava/lang/Object;)Lco/bird/android/app/feature/map/ui/RichPolygonArea;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lco/bird/android/app/feature/map/ui/RichPolygonArea;->commonPolygon:Lzp0;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lco/bird/android/app/feature/map/ui/RichPolygonArea;->area:Lco/bird/android/model/persistence/Area;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lco/bird/android/app/feature/map/ui/RichPolygonArea;->copy(Lzp0;Lco/bird/android/model/persistence/Area;)Lco/bird/android/app/feature/map/ui/RichPolygonArea;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lzp0;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/RichPolygonArea;->commonPolygon:Lzp0;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/persistence/Area;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/RichPolygonArea;->area:Lco/bird/android/model/persistence/Area;

    return-object v0
.end method

.method public final copy(Lzp0;Lco/bird/android/model/persistence/Area;)Lco/bird/android/app/feature/map/ui/RichPolygonArea;
    .locals 1

    const-string v0, "commonPolygon"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "area"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/app/feature/map/ui/RichPolygonArea;

    invoke-direct {v0, p1, p2}, Lco/bird/android/app/feature/map/ui/RichPolygonArea;-><init>(Lzp0;Lco/bird/android/model/persistence/Area;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/app/feature/map/ui/RichPolygonArea;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/app/feature/map/ui/RichPolygonArea;

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/RichPolygonArea;->commonPolygon:Lzp0;

    iget-object v3, p1, Lco/bird/android/app/feature/map/ui/RichPolygonArea;->commonPolygon:Lzp0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/RichPolygonArea;->area:Lco/bird/android/model/persistence/Area;

    iget-object p1, p1, Lco/bird/android/app/feature/map/ui/RichPolygonArea;->area:Lco/bird/android/model/persistence/Area;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getArea()Lco/bird/android/model/persistence/Area;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/RichPolygonArea;->area:Lco/bird/android/model/persistence/Area;

    return-object v0
.end method

.method public final getCommonPolygon()Lzp0;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/RichPolygonArea;->commonPolygon:Lzp0;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/RichPolygonArea;->commonPolygon:Lzp0;

    invoke-virtual {v0}, Lzp0;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/RichPolygonArea;->area:Lco/bird/android/model/persistence/Area;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/Area;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lco/bird/android/app/feature/map/ui/RichPolygonArea;->commonPolygon:Lzp0;

    iget-object v1, p0, Lco/bird/android/app/feature/map/ui/RichPolygonArea;->area:Lco/bird/android/model/persistence/Area;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RichPolygonArea(commonPolygon="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", area="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
