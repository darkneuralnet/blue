.class public LcL$g;
.super Lcf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LcL;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf1<",
        "Lco/bird/android/model/persistence/Bird;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:LcL;


# direct methods
.method public constructor <init>(LcL;LEb5;)V
    .locals 0

    iput-object p1, p0, LcL$g;->d:LcL;

    invoke-direct {p0, p2}, Lcf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `bird` (`id`,`model`,`task_id`,`battery_level`,`estimated_range`,`distance`,`location`,`code`,`sticker_id`,`serial_number`,`disconnected`,`accident`,`submerged`,`lost`,`locked`,`ack_locked`,`captive`,`gps_fix`,`broken`,`label`,`actions`,`bounty_id`,`bounty_price`,`bounty_currency`,`bounty_lost`,`bounty_overdue`,`bounty_kind`,`brand_name`,`task_kind`,`gps_at`,`tracked_at`,`token`,`bluetooth`,`cellular`,`started_at`,`due_at`,`asleep`,`imei`,`board_protocol`,`physical_lock`,`physical_locks`,`priority_collect`,`down`,`needs_inspection`,`partner_id`,`nest_id`,`last_ride_ended_at`,`partner_bird_state`,`peril`,`deliverable`,`lifecycle`,`offline`,`license`,`area_key`,`nest_purpose`,`private_bird`,`scanned_at`,`badge_type`,`bounty_reasons`,`ephemeral_id`,`ble_mac_address`,`has_helmet`,`location_updated_at`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/Bird;

    invoke-virtual {p0, p1, p2}, LcL$g;->p(LqV5;Lco/bird/android/model/persistence/Bird;)V

    return-void
.end method

.method public p(LqV5;Lco/bird/android/model/persistence/Bird;)V
    .locals 4

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getModel()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getModel()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getTaskId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getTaskId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getBatteryLevel()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x4

    invoke-interface {p1, v2, v0, v1}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getEstimatedRange()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getEstimatedRange()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    :goto_3
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getDistance()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x6

    invoke-interface {p1, v2, v0, v1}, LoV5;->S0(IJ)V

    sget-object v0, Lco/bird/android/persistence/common/impl/Converters;->a:Lco/bird/android/persistence/common/impl/Converters;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getLocation()Lco/bird/android/model/persistence/nestedstructures/Geolocation;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->m(Lco/bird/android/model/persistence/nestedstructures/Geolocation;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_4

    :cond_4
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_4
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getCode()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_5

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getCode()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_5
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getStickerId()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x9

    if-nez v0, :cond_6

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getStickerId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_6
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getSerialNumber()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_7

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getSerialNumber()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_7
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getDisconnected()Z

    move-result v0

    const/16 v1, 0xb

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getCollect()Z

    move-result v0

    const/16 v1, 0xc

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getSubmerged()Z

    move-result v0

    const/16 v1, 0xd

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getLost()Z

    move-result v0

    const/16 v1, 0xe

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getLocked()Z

    move-result v0

    const/16 v1, 0xf

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getAckLocked()Z

    move-result v0

    const/16 v1, 0x10

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getCaptive()Z

    move-result v0

    const/16 v1, 0x11

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getGpsFix()Z

    move-result v0

    const/16 v1, 0x12

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getBroken()Z

    move-result v0

    const/16 v1, 0x13

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    sget-object v0, LaL;->a:LaL;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getLabel()Lco/bird/android/model/persistence/nestedstructures/BirdLabel;

    move-result-object v0

    invoke-static {v0}, LaL;->o(Lco/bird/android/model/persistence/nestedstructures/BirdLabel;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x14

    if-nez v0, :cond_8

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_8

    :cond_8
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_8
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getActions()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LaL;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x15

    if-nez v0, :cond_9

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_9

    :cond_9
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_9
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getBountyId()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x16

    if-nez v0, :cond_a

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_a

    :cond_a
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getBountyId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_a
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getBountyPrice()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x17

    if-nez v0, :cond_b

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_b

    :cond_b
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getBountyPrice()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    :goto_b
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getBountyCurrency()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x18

    if-nez v0, :cond_c

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_c

    :cond_c
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getBountyCurrency()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_c
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getBountyLost()Z

    move-result v0

    const/16 v1, 0x19

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getBountyOverdue()Z

    move-result v0

    const/16 v1, 0x1a

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getBountyKind()Lco/bird/android/model/constant/BountyKind;

    move-result-object v0

    invoke-static {v0}, LaL;->k(Lco/bird/android/model/constant/BountyKind;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1b

    if-nez v0, :cond_d

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_d

    :cond_d
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_d
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getBrandName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1c

    if-nez v0, :cond_e

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_e

    :cond_e
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getBrandName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_e
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getTaskKind()Lco/bird/android/model/constant/BirdTaskKind;

    move-result-object v0

    invoke-static {v0}, LaL;->j(Lco/bird/android/model/constant/BirdTaskKind;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1d

    if-nez v0, :cond_f

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_f

    :cond_f
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_f
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getGpsAt()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->e(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1e

    if-nez v0, :cond_10

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_10

    :cond_10
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_10
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getTrackedAt()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->e(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x1f

    if-nez v0, :cond_11

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_11

    :cond_11
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_11
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getToken()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x20

    if-nez v0, :cond_12

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_12

    :cond_12
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getToken()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_12
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getBluetooth()Z

    move-result v0

    const/16 v1, 0x21

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getCellular()Z

    move-result v0

    const/16 v1, 0x22

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getStartedAt()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->e(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x23

    if-nez v0, :cond_13

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_13

    :cond_13
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_13
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getDueAt()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->e(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x24

    if-nez v0, :cond_14

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_14

    :cond_14
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_14
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getAsleep()Z

    move-result v0

    const/16 v1, 0x25

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getImei()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x26

    if-nez v0, :cond_15

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_15

    :cond_15
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getImei()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_15
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getBoardProtocol()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_16

    const/16 v0, 0x27

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_16

    :cond_16
    const/16 v0, 0x27

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getBoardProtocol()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, LoV5;->G0(ILjava/lang/String;)V

    :goto_16
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getPhysicalLock()Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;

    move-result-object v0

    invoke-static {v0}, LaL;->r(Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_17

    const/16 v0, 0x28

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_17

    :cond_17
    const/16 v1, 0x28

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_17
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getPhysicalLocks()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LaL;->t(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_18

    const/16 v0, 0x29

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_18

    :cond_18
    const/16 v1, 0x29

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_18
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getPriorityCollect()Z

    move-result v0

    const/16 v1, 0x2a

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getDown()Z

    move-result v0

    const/16 v1, 0x2b

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getNeedsInspection()Z

    move-result v0

    const/16 v1, 0x2c

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getPartnerId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_19

    const/16 v0, 0x2d

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_19

    :cond_19
    const/16 v0, 0x2d

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getPartnerId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, LoV5;->G0(ILjava/lang/String;)V

    :goto_19
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getNestId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1a

    const/16 v0, 0x2e

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_1a

    :cond_1a
    const/16 v0, 0x2e

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getNestId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1a
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getLastRideEndedAt()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->e(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1b

    const/16 v0, 0x2f

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_1b

    :cond_1b
    const/16 v1, 0x2f

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1b
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getPartnerBirdState()Lco/bird/android/model/constant/PartnerBirdState;

    move-result-object v0

    invoke-static {v0}, LaL;->n(Lco/bird/android/model/constant/PartnerBirdState;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1c

    const/16 v0, 0x30

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_1c

    :cond_1c
    const/16 v1, 0x30

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1c
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getPeril()Z

    move-result v0

    const/16 v1, 0x31

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getDeliverable()Z

    move-result v0

    const/16 v1, 0x32

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getLifecycle()Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    move-result-object v0

    invoke-static {v0}, LaL;->q(Lco/bird/android/model/persistence/nestedstructures/Lifecycle;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1d

    const/16 v0, 0x33

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_1d

    :cond_1d
    const/16 v1, 0x33

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1d
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getOffline()Z

    move-result v0

    const/16 v1, 0x34

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, LoV5;->S0(IJ)V

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getLicense()Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;

    move-result-object v0

    invoke-static {v0}, LaL;->p(Lco/bird/android/model/persistence/nestedstructures/BirdLicenseView;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1e

    const/16 v0, 0x35

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_1e

    :cond_1e
    const/16 v1, 0x35

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1e
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getAreaKey()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1f

    const/16 v0, 0x36

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_1f

    :cond_1f
    const/16 v0, 0x36

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getAreaKey()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1f
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getNestPurpose()Lco/bird/android/model/constant/NestPurpose;

    move-result-object v0

    invoke-static {v0}, LaL;->m(Lco/bird/android/model/constant/NestPurpose;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_20

    const/16 v0, 0x37

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_20

    :cond_20
    const/16 v1, 0x37

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_20
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getPrivateBird()Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

    move-result-object v0

    invoke-static {v0}, LaL;->s(Lco/bird/android/model/persistence/nestedstructures/PrivateBird;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_21

    const/16 v0, 0x38

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_21

    :cond_21
    const/16 v1, 0x38

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_21
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getScannedAt()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/persistence/common/impl/Converters;->e(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_22

    const/16 v0, 0x39

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_22

    :cond_22
    const/16 v1, 0x39

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_22
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getBadgeType()Lco/bird/android/model/constant/MapPinBadge;

    move-result-object v0

    invoke-static {v0}, LaL;->l(Lco/bird/android/model/constant/MapPinBadge;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_23

    const/16 v0, 0x3a

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_23

    :cond_23
    const/16 v1, 0x3a

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_23
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getBountyReasons()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LaL;->h(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_24

    const/16 v0, 0x3b

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_24

    :cond_24
    const/16 v1, 0x3b

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_24
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getEphemeralId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_25

    const/16 v0, 0x3c

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_25

    :cond_25
    const/16 v0, 0x3c

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getEphemeralId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, LoV5;->G0(ILjava/lang/String;)V

    :goto_25
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getBleMacAddress()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_26

    const/16 v0, 0x3d

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_26

    :cond_26
    const/16 v0, 0x3d

    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getBleMacAddress()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, LoV5;->G0(ILjava/lang/String;)V

    :goto_26
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getHasHelmet()Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_27

    const/4 v0, 0x0

    goto :goto_27

    :cond_27
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getHasHelmet()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_27
    if-nez v0, :cond_28

    const/16 v0, 0x3e

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_28

    :cond_28
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x3e

    invoke-interface {p1, v2, v0, v1}, LoV5;->S0(IJ)V

    :goto_28
    invoke-virtual {p2}, Lco/bird/android/model/persistence/Bird;->getLocationUpdatedAt()Lorg/joda/time/DateTime;

    move-result-object p2

    invoke-static {p2}, Lco/bird/android/persistence/common/impl/Converters;->e(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_29

    const/16 p2, 0x3f

    invoke-interface {p1, p2}, LoV5;->m1(I)V

    goto :goto_29

    :cond_29
    const/16 v0, 0x3f

    invoke-interface {p1, v0, p2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_29
    return-void
.end method
