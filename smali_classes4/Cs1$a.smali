.class public LCs1$a;
.super Lcf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCs1;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf1<",
        "Lco/bird/android/model/persistence/FlightSheetDetails;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:LCs1;


# direct methods
.method public constructor <init>(LCs1;LEb5;)V
    .locals 0

    iput-object p1, p0, LCs1$a;->d:LCs1;

    invoke-direct {p0, p2}, Lcf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `flight_sheet` (`vehicle_id`,`context`,`banner`,`vehicle_summary`,`commands`,`action_sections`,`info_sections`,`ride_history`,`task_order_info`,`ride_ratings`) VALUES (?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/FlightSheetDetails;

    invoke-virtual {p0, p1, p2}, LCs1$a;->p(LqV5;Lco/bird/android/model/persistence/FlightSheetDetails;)V

    return-void
.end method

.method public p(LqV5;Lco/bird/android/model/persistence/FlightSheetDetails;)V
    .locals 2

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FlightSheetDetails;->getVehicleId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FlightSheetDetails;->getVehicleId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    sget-object v0, Lys1;->a:Lys1;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/FlightSheetDetails;->getContext()Lco/bird/android/model/constant/FlightSheetContext;

    move-result-object v0

    invoke-static {v0}, Lys1;->m(Lco/bird/android/model/constant/FlightSheetContext;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FlightSheetDetails;->getBanner()Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;

    move-result-object v0

    invoke-static {v0}, Lys1;->n(Lco/bird/android/model/persistence/nestedstructures/FlightSheetBanner;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FlightSheetDetails;->getVehicleSummary()Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;

    move-result-object v0

    invoke-static {v0}, Lys1;->r(Lco/bird/android/model/persistence/nestedstructures/FlightSheetVehicleSummary;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_3

    :cond_3
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_3
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FlightSheetDetails;->getCommands()Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;

    move-result-object v0

    invoke-static {v0}, Lys1;->o(Lco/bird/android/model/persistence/nestedstructures/FlightSheetCommands;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_4

    :cond_4
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_4
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FlightSheetDetails;->getActionSections()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lys1;->d(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_5

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_5

    :cond_5
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_5
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FlightSheetDetails;->getInfoSections()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lys1;->h(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_6

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_6

    :cond_6
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_6
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FlightSheetDetails;->getRideHistory()Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;

    move-result-object v0

    invoke-static {v0}, Lys1;->p(Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    if-nez v0, :cond_7

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_7

    :cond_7
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_7
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FlightSheetDetails;->getTaskOrderInfo()Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;

    move-result-object v0

    invoke-static {v0}, Lys1;->s(Lco/bird/android/model/persistence/nestedstructures/TaskOrderInfo;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x9

    if-nez v0, :cond_8

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_8

    :cond_8
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_8
    invoke-virtual {p2}, Lco/bird/android/model/persistence/FlightSheetDetails;->getRideRatings()Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;

    move-result-object p2

    invoke-static {p2}, Lys1;->q(Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideRatings;)Ljava/lang/String;

    move-result-object p2

    const/16 v0, 0xa

    if-nez p2, :cond_9

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_9

    :cond_9
    invoke-interface {p1, v0, p2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_9
    return-void
.end method
