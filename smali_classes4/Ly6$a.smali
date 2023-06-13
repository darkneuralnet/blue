.class public LLy6$a;
.super Lcf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLy6;-><init>(LEb5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcf1<",
        "Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:LLy6;


# direct methods
.method public constructor <init>(LLy6;LEb5;)V
    .locals 0

    iput-object p1, p0, LLy6$a;->d:LLy6;

    invoke-direct {p0, p2}, Lcf1;-><init>(LEb5;)V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `warehouse_flight_sheets` (`warehouse_id`,`summary`,`status`,`warehouse_details`,`vehicle_details`) VALUES (?,?,?,?,?)"

    return-object v0
.end method

.method public bridge synthetic i(LqV5;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;

    invoke-virtual {p0, p1, p2}, LLy6$a;->p(LqV5;Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;)V

    return-void
.end method

.method public p(LqV5;Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;)V
    .locals 2

    invoke-virtual {p2}, Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;->getWarehouseId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;->getWarehouseId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_0
    sget-object v0, LJy6;->a:LJy6;

    invoke-virtual {p2}, Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;->getSummary()Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;

    move-result-object v0

    invoke-static {v0}, LJy6;->c(Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;->getStatus()Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;

    move-result-object v0

    invoke-static {v0}, LJy6;->b(Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_2

    :cond_2
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p2}, Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;->getWarehouseDetails()Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;

    move-result-object v0

    invoke-static {v0}, LJy6;->a(Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, LoV5;->m1(I)V

    goto :goto_3

    :cond_3
    invoke-interface {p1, v1, v0}, LoV5;->G0(ILjava/lang/String;)V

    :goto_3
    invoke-virtual {p2}, Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;->getVehicleDetails()Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;

    move-result-object p2

    invoke-static {p2}, LJy6;->d(Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x5

    if-nez p2, :cond_4

    invoke-interface {p1, v0}, LoV5;->m1(I)V

    goto :goto_4

    :cond_4
    invoke-interface {p1, v0, p2}, LoV5;->G0(ILjava/lang/String;)V

    :goto_4
    return-void
.end method
