.class public LEI6$i;
.super Lcf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEI6;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf1<",
        "Lco/bird/android/model/persistence/ZoneRegion;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:LEI6;


# direct methods
.method public constructor <init>(LEI6;LEb5;)V
    .locals 0

    iput-object p1, p0, LEI6$i;->d:LEI6;

    invoke-direct {p0, p2}, Lcf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `zone_regions` (`zone_id`,`region`,`center_point`,`region_updated_at`) VALUES (?,?,?,?)"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/ZoneRegion;

    invoke-virtual {p0, p1, p2}, LEI6$i;->p(LqV5;Lco/bird/android/model/persistence/ZoneRegion;)V

    return-void
.end method

.method public p(LqV5;Lco/bird/android/model/persistence/ZoneRegion;)V
    .locals 2

    invoke-virtual {p2}, Lco/bird/android/model/persistence/ZoneRegion;->getZoneId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/ZoneRegion;->getZoneId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    sget-object v0, LBI6;->a:LBI6;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/ZoneRegion;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object v0

    invoke-static {v0}, LBI6;->a(Lco/bird/android/model/Polygon;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    sget-object v0, Lco/bird/android/persistence/common/impl/Converters;->a:Lco/bird/android/persistence/common/impl/Converters;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/ZoneRegion;->getCenterPoint()Lco/bird/android/model/Point;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->i(Lco/bird/android/model/Point;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/ZoneRegion;->getRegionUpdatedAt()Lorg/joda/time/DateTime;

    move-result-object p2

    invoke-static {p2}, Lco/bird/android/persistence/common/impl/Converters;->e(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x4

    if-nez p2, :cond_3

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_3

    :cond_3
    invoke-interface {p1, v0, p2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_3
    return-void
.end method
