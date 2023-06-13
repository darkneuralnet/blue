.class public LKM$b;
.super Lcf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKM;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf1<",
        "Lco/bird/android/model/persistence/BirdMapMarker;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:LKM;


# direct methods
.method public constructor <init>(LKM;LEb5;)V
    .locals 0

    iput-object p1, p0, LKM$b;->d:LKM;

    invoke-direct {p0, p2}, Lcf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `bird_map_markers` (`id`,`battery_level`,`location`,`code`,`fleet_marker`,`filter_hash`,`updated_at`) VALUES (?,?,?,?,?,?,?)"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/BirdMapMarker;

    invoke-virtual {p0, p1, p2}, LKM$b;->p(LqV5;Lco/bird/android/model/persistence/BirdMapMarker;)V

    return-void
.end method

.method public p(LqV5;Lco/bird/android/model/persistence/BirdMapMarker;)V
    .locals 3

    invoke-virtual {p2}, Lco/bird/android/model/persistence/BirdMapMarker;->getId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/BirdMapMarker;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/BirdMapMarker;->getBatteryLevel()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x2

    invoke-interface {p1, v2, v0, v1}, LoV5;->S0(IJ)V

    sget-object v0, Lco/bird/android/persistence/common/impl/Converters;->a:Lco/bird/android/persistence/common/impl/Converters;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/BirdMapMarker;->getLocation()Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->m(Lco/bird/android/model/persistence/nestedstructures/Geolocation;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lco/bird/android/model/persistence/BirdMapMarker;->getCode()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/BirdMapMarker;->getCode()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/BirdMapMarker;->getFleetMarker()Lco/bird/android/model/persistence/FleetMarker;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->k(Lco/bird/android/model/persistence/FleetMarker;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_3

    :cond_3
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_3
    invoke-virtual {p2}, Lco/bird/android/model/persistence/BirdMapMarker;->getFilterHash()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, Lco/bird/android/model/persistence/BirdMapMarker;->getFilterHash()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_4
    invoke-virtual {p2}, Lco/bird/android/model/persistence/BirdMapMarker;->getUpdatedAt()Lorg/joda/time/DateTime;

    move-result-object p2

    invoke-static {p2}, Lco/bird/android/persistence/common/impl/Converters;->e(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x7

    if-nez p2, :cond_5

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_5

    :cond_5
    invoke-interface {p1, v0, p2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_5
    return-void
.end method
