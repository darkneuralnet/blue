.class public LK33$a;
.super Lcf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK33;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf1<",
        "Lco/bird/android/model/persistence/NestFlightSheetDetails;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:LK33;


# direct methods
.method public constructor <init>(LK33;LEb5;)V
    .locals 0

    iput-object p1, p0, LK33$a;->d:LK33;

    invoke-direct {p0, p2}, Lcf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `nest_flight_sheet` (`nest_id`,`nest_summary`,`nest_birdle`,`nest_status`,`nest_images`,`nest_capacity`,`nest_details`,`vehicle_details`,`nest_buttons`,`claim_details`,`nest_allowed_vehicles`,`new_claim_error_message`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/NestFlightSheetDetails;

    invoke-virtual {p0, p1, p2}, LK33$a;->p(LqV5;Lco/bird/android/model/persistence/NestFlightSheetDetails;)V

    return-void
.end method

.method public p(LqV5;Lco/bird/android/model/persistence/NestFlightSheetDetails;)V
    .locals 2

    invoke-virtual {p2}, Lco/bird/android/model/persistence/NestFlightSheetDetails;->getNestId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/NestFlightSheetDetails;->getNestId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    sget-object v0, LI33;->a:LI33;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/NestFlightSheetDetails;->getNestSummary()Lco/bird/android/model/persistence/nestedstructures/NestSummary;

    move-result-object v0

    invoke-static {v0}, LI33;->j(Lco/bird/android/model/persistence/nestedstructures/NestSummary;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lco/bird/android/model/persistence/NestFlightSheetDetails;->getNestBirdle()Lco/bird/android/model/persistence/nestedstructures/NestBirdle;

    move-result-object v0

    invoke-static {v0}, LI33;->d(Lco/bird/android/model/persistence/nestedstructures/NestBirdle;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/NestFlightSheetDetails;->getNestStatus()Lco/bird/android/model/persistence/nestedstructures/NestStatus;

    move-result-object v0

    invoke-static {v0}, LI33;->i(Lco/bird/android/model/persistence/nestedstructures/NestStatus;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_3

    :cond_3
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_3
    invoke-virtual {p2}, Lco/bird/android/model/persistence/NestFlightSheetDetails;->getNestImages()Lco/bird/android/model/persistence/nestedstructures/NestImages;

    move-result-object v0

    invoke-static {v0}, LI33;->h(Lco/bird/android/model/persistence/nestedstructures/NestImages;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_4

    :cond_4
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_4
    invoke-virtual {p2}, Lco/bird/android/model/persistence/NestFlightSheetDetails;->getNestCapacity()Lco/bird/android/model/persistence/nestedstructures/NestCapacity;

    move-result-object v0

    invoke-static {v0}, LI33;->f(Lco/bird/android/model/persistence/nestedstructures/NestCapacity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_5

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_5

    :cond_5
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_5
    invoke-virtual {p2}, Lco/bird/android/model/persistence/NestFlightSheetDetails;->getNestDetails()Lco/bird/android/model/persistence/nestedstructures/NestDetails;

    move-result-object v0

    invoke-static {v0}, LI33;->g(Lco/bird/android/model/persistence/nestedstructures/NestDetails;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_6

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_6

    :cond_6
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_6
    invoke-virtual {p2}, Lco/bird/android/model/persistence/NestFlightSheetDetails;->getVehicleDetails()Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;

    move-result-object v0

    invoke-static {v0}, LI33;->k(Lco/bird/android/model/persistence/nestedstructures/NestVehicleDetails;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_7

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_7

    :cond_7
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_7
    invoke-virtual {p2}, Lco/bird/android/model/persistence/NestFlightSheetDetails;->getNestButtons()Lco/bird/android/model/persistence/nestedstructures/NestButtons;

    move-result-object v0

    invoke-static {v0}, LI33;->e(Lco/bird/android/model/persistence/nestedstructures/NestButtons;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x9

    if-nez v0, :cond_8

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_8

    :cond_8
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_8
    invoke-virtual {p2}, Lco/bird/android/model/persistence/NestFlightSheetDetails;->getClaimDetails()Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;

    move-result-object v0

    invoke-static {v0}, LI33;->b(Lco/bird/android/model/persistence/nestedstructures/ClaimDetails;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    if-nez v0, :cond_9

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_9

    :cond_9
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_9
    invoke-virtual {p2}, Lco/bird/android/model/persistence/NestFlightSheetDetails;->getNestAllowedVehicles()Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;

    move-result-object v0

    invoke-static {v0}, LI33;->c(Lco/bird/android/model/persistence/nestedstructures/NestAllowedVehicleDetails;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xb

    if-nez v0, :cond_a

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_a

    :cond_a
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_a
    invoke-virtual {p2}, Lco/bird/android/model/persistence/NestFlightSheetDetails;->getNewClaimErrorMessage()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xc

    if-nez v0, :cond_b

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_b

    :cond_b
    invoke-virtual {p2}, Lco/bird/android/model/persistence/NestFlightSheetDetails;->getNewClaimErrorMessage()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_b
    return-void
.end method
