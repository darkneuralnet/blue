.class public LEI6$j;
.super Lbf1;
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
        "Lbf1<",
        "Lco/bird/android/model/persistence/ZoneData;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:LEI6;


# direct methods
.method public constructor <init>(LEI6;LEb5;)V
    .locals 0

    iput-object p1, p0, LEI6$j;->d:LEI6;

    invoke-direct {p0, p2}, Lbf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE OR IGNORE `zone_data` SET `zone_id` = ?,`overlay` = ?,`annotation` = ?,`selectability` = ?,`data_updated_at` = ? WHERE `zone_id` = ?"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/ZoneData;

    invoke-virtual {p0, p1, p2}, LEI6$j;->m(LqV5;Lco/bird/android/model/persistence/ZoneData;)V

    return-void
.end method

.method public m(LqV5;Lco/bird/android/model/persistence/ZoneData;)V
    .locals 3

    invoke-virtual {p2}, Lco/bird/android/model/persistence/ZoneData;->getZoneId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/ZoneData;->getZoneId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    sget-object v0, LBI6;->a:LBI6;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/ZoneData;->getOverlay()Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;

    move-result-object v0

    invoke-static {v0}, LBI6;->c(Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lco/bird/android/model/persistence/ZoneData;->getAnnotation()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;

    move-result-object v0

    invoke-static {v0}, LBI6;->b(Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/ZoneData;->getSelectability()Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_3

    :cond_3
    iget-object v0, p0, LEI6$j;->d:LEI6;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/ZoneData;->getSelectability()Lco/bird/android/model/constant/OperatorMapZoneSelectability;

    move-result-object v2

    invoke-static {v0, v2}, LEI6;->x(LEI6;Lco/bird/android/model/constant/OperatorMapZoneSelectability;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_3
    sget-object v0, Lco/bird/android/persistence/common/impl/Converters;->a:Lco/bird/android/persistence/common/impl/Converters;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/ZoneData;->getDataUpdatedAt()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->e(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_4

    :cond_4
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_4
    invoke-virtual {p2}, Lco/bird/android/model/persistence/ZoneData;->getZoneId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_5

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p2}, Lco/bird/android/model/persistence/ZoneData;->getZoneId()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_5
    return-void
.end method
