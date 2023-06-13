.class public Lgp1$a;
.super Lcf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgp1;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf1<",
        "Lco/bird/android/model/persistence/FleetListVehicle;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lgp1;


# direct methods
.method public constructor <init>(Lgp1;LEb5;)V
    .locals 0

    iput-object p1, p0, Lgp1$a;->d:Lgp1;

    invoke-direct {p0, p2}, Lcf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `fleet_list_vehicle` (`vehicle_id`,`title`,`icon`,`icon_color`,`icon_background_color`,`caption`,`caption_color`,`caption_2`,`caption_2_color`,`notification`,`complication`,`action`,`facet_index`,`background_color`,`list`,`fleet_id`,`section`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/FleetListVehicle;

    invoke-virtual {p0, p1, p2}, Lgp1$a;->p(LqV5;Lco/bird/android/model/persistence/FleetListVehicle;)V

    return-void
.end method

.method public p(LqV5;Lco/bird/android/model/persistence/FleetListVehicle;)V
    .locals 2

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getVehicleId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getVehicleId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getTitle()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    sget-object v0, Lco/bird/android/persistence/common/impl/Converters;->a:Lco/bird/android/persistence/common/impl/Converters;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getIcon()Lco/bird/android/model/constant/ClientIcon;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->j(Lco/bird/android/model/constant/ClientIcon;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getIconColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->n(Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_3

    :cond_3
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_3
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getIconBackgroundColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->n(Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_4

    :cond_4
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_4
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getCaption()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_5

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getCaption()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_5
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getCaptionColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->n(Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_6

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_6

    :cond_6
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_6
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getCaption2()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_7

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getCaption2()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_7
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getCaption2Color()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->n(Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x9

    if-nez v0, :cond_8

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_8

    :cond_8
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_8
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getNotification()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_9

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_9

    :cond_9
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getNotification()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_9
    sget-object v0, Lvq1;->a:Lvq1;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getComplication()Lco/bird/android/model/persistence/nestedstructures/FleetListComplication;

    move-result-object v0

    invoke-static {v0}, Lvq1;->k(Lco/bird/android/model/persistence/nestedstructures/FleetListComplication;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xb

    if-nez v0, :cond_a

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_a

    :cond_a
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_a
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getAction()Lco/bird/android/model/persistence/nestedstructures/FleetListAction;

    move-result-object v0

    invoke-static {v0}, Lvq1;->j(Lco/bird/android/model/persistence/nestedstructures/FleetListAction;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xc

    if-nez v0, :cond_b

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_b

    :cond_b
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_b
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getFacetIndex()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lvq1;->p(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xd

    if-nez v0, :cond_c

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_c

    :cond_c
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_c
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getBackgroundColor()Lco/bird/android/model/persistence/nestedstructures/ThemedColors;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->n(Lco/bird/android/model/persistence/nestedstructures/ThemedColors;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xe

    if-nez v0, :cond_d

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_d

    :cond_d
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_d
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getList()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xf

    if-nez v0, :cond_e

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_e

    :cond_e
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getList()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_e
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getFleetId()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    if-nez v0, :cond_f

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_f

    :cond_f
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getFleetId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_f
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getSection()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x11

    if-nez v0, :cond_10

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_10

    :cond_10
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FleetListVehicle;->getSection()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_10
    return-void
.end method
