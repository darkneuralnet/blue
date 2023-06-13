.class public final LoG3$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LoG3;->a(Ljava/util/List;Landroid/location/Location;Ljava/lang/Integer;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Comparator;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "a",
        "kotlin.jvm.PlatformType",
        "b",
        "compare",
        "(Ljava/lang/Object;Ljava/lang/Object;)I",
        "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ParkingNest+.kt\nco/bird/android/library/extension/ParkingNest_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,328:1\n9#2:329\n10#2,6:331\n1#3:330\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Landroid/location/Location;


# direct methods
.method public constructor <init>(Landroid/location/Location;)V
    .locals 0

    iput-object p1, p0, LoG3$a;->b:Landroid/location/Location;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;TT;)I"
        }
    .end annotation

    check-cast p1, Lco/bird/android/model/ParkingNest;

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNest;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireLocation;->fromLocation()Landroid/location/Location;

    move-result-object v0

    invoke-static {v0}, Lcm2;->a(Landroid/location/Location;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const-string v1, ""

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/ParkingNest;->getShape()Lco/bird/android/model/Polygon;

    move-result-object p1

    invoke-static {p1}, LJX3;->a(Lco/bird/android/model/Polygon;)Lco/bird/android/model/Point;

    move-result-object p1

    new-instance v0, Landroid/location/Location;

    invoke-direct {v0, v1}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    iget-wide v3, p1, Lco/bird/android/model/Point;->y:D

    invoke-virtual {v0, v3, v4}, Landroid/location/Location;->setLatitude(D)V

    iget-wide v3, p1, Lco/bird/android/model/Point;->x:D

    invoke-virtual {v0, v3, v4}, Landroid/location/Location;->setLongitude(D)V

    :cond_1
    iget-object p1, p0, LoG3$a;->b:Landroid/location/Location;

    invoke-virtual {v0, p1}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    check-cast p2, Lco/bird/android/model/ParkingNest;

    invoke-virtual {p2}, Lco/bird/android/model/ParkingNest;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireLocation;->fromLocation()Landroid/location/Location;

    move-result-object v0

    invoke-static {v0}, Lcm2;->a(Landroid/location/Location;)Z

    move-result v3

    if-eqz v3, :cond_2

    move-object v2, v0

    :cond_2
    if-nez v2, :cond_3

    invoke-virtual {p2}, Lco/bird/android/model/ParkingNest;->getShape()Lco/bird/android/model/Polygon;

    move-result-object p2

    invoke-static {p2}, LJX3;->a(Lco/bird/android/model/Polygon;)Lco/bird/android/model/Point;

    move-result-object p2

    new-instance v2, Landroid/location/Location;

    invoke-direct {v2, v1}, Landroid/location/Location;-><init>(Ljava/lang/String;)V

    iget-wide v0, p2, Lco/bird/android/model/Point;->y:D

    invoke-virtual {v2, v0, v1}, Landroid/location/Location;->setLatitude(D)V

    iget-wide v0, p2, Lco/bird/android/model/Point;->x:D

    invoke-virtual {v2, v0, v1}, Landroid/location/Location;->setLongitude(D)V

    :cond_3
    iget-object p2, p0, LoG3$a;->b:Landroid/location/Location;

    invoke-virtual {v2, p2}, Landroid/location/Location;->distanceTo(Landroid/location/Location;)F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/comparisons/ComparisonsKt;->compareValues(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1
.end method
