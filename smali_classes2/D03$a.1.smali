.class public final LD03$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD03;->I0(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LFQ3;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LFQ3;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(LFQ3;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:I

.field public final synthetic h:LD03;


# direct methods
.method public constructor <init>(ILD03;)V
    .locals 0

    iput p1, p0, LD03$a;->g:I

    iput-object p2, p0, LD03$a;->h:LD03;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LFQ3;)V
    .locals 8

    iget v0, p0, LD03$a;->g:I

    sget v1, Lvi4;->nav_bulk_scan:I

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, LFQ3;->a()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, LD03$a;->h:LD03;

    invoke-virtual {v0}, LD03;->G0()Le13;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xf

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, Le13$a;->goToBulkScanner$default(Le13;Lco/bird/android/model/constant/BulkScanPurpose;Lco/bird/android/model/OperatorScanIntent;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)V

    goto/16 :goto_0

    :cond_0
    sget v1, Lvi4;->nav_wake_vehicles:I

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, LFQ3;->a()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, LD03$a;->h:LD03;

    invoke-virtual {v0}, LD03;->G0()Le13;

    move-result-object v0

    invoke-interface {v0}, Le13;->p3()V

    goto/16 :goto_0

    :cond_1
    sget v1, Lvi4;->nav_command_center:I

    if-ne v0, v1, :cond_2

    iget-object v0, p0, LD03$a;->h:LD03;

    invoke-virtual {v0}, LD03;->G0()Le13;

    move-result-object v0

    invoke-interface {v0}, Le13;->l2()V

    goto :goto_0

    :cond_2
    sget v1, Lvi4;->nav_inventory:I

    if-ne v0, v1, :cond_3

    iget-object v0, p0, LD03$a;->h:LD03;

    invoke-virtual {v0}, LD03;->G0()Le13;

    move-result-object v0

    invoke-interface {v0}, Le13;->h()V

    goto :goto_0

    :cond_3
    sget v1, Lvi4;->nav_whitelist:I

    if-ne v0, v1, :cond_4

    iget-object v0, p0, LD03$a;->h:LD03;

    invoke-virtual {v0}, LD03;->G0()Le13;

    move-result-object v0

    invoke-interface {v0}, Le13;->g4()V

    goto :goto_0

    :cond_4
    sget v1, Lvi4;->nav_scrap_order:I

    if-ne v0, v1, :cond_5

    iget-object v0, p0, LD03$a;->h:LD03;

    invoke-virtual {v0}, LD03;->G0()Le13;

    move-result-object v0

    invoke-interface {v0}, Le13;->z()V

    goto :goto_0

    :cond_5
    sget v1, Lvi4;->nav_vehicle_inventory_check_in:I

    if-ne v0, v1, :cond_6

    iget-object v0, p0, LD03$a;->h:LD03;

    invoke-virtual {v0}, LD03;->G0()Le13;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/VehicleInventoryAction;->CHECK_IN:Lco/bird/android/model/constant/VehicleInventoryAction;

    invoke-interface {v0, v1}, Le13;->q1(Lco/bird/android/model/constant/VehicleInventoryAction;)V

    goto :goto_0

    :cond_6
    sget v1, Lvi4;->nav_vehicle_inventory_check_out:I

    if-ne v0, v1, :cond_7

    iget-object v0, p0, LD03$a;->h:LD03;

    invoke-virtual {v0}, LD03;->G0()Le13;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/VehicleInventoryAction;->CHECK_OUT:Lco/bird/android/model/constant/VehicleInventoryAction;

    invoke-interface {v0, v1}, Le13;->q1(Lco/bird/android/model/constant/VehicleInventoryAction;)V

    goto :goto_0

    :cond_7
    sget v1, Lvi4;->nav_vehicle_inventory_pick_up:I

    if-ne v0, v1, :cond_8

    iget-object v0, p0, LD03$a;->h:LD03;

    invoke-virtual {v0}, LD03;->G0()Le13;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/VehicleInventoryAction;->PICK_UP:Lco/bird/android/model/constant/VehicleInventoryAction;

    invoke-interface {v0, v1}, Le13;->q1(Lco/bird/android/model/constant/VehicleInventoryAction;)V

    goto :goto_0

    :cond_8
    sget v1, Lvi4;->nav_vehicle_inventory_drop_off:I

    if-ne v0, v1, :cond_9

    iget-object v0, p0, LD03$a;->h:LD03;

    invoke-virtual {v0}, LD03;->G0()Le13;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/VehicleInventoryAction;->DROP_OFF:Lco/bird/android/model/constant/VehicleInventoryAction;

    invoke-interface {v0, v1}, Le13;->q1(Lco/bird/android/model/constant/VehicleInventoryAction;)V

    :cond_9
    :goto_0
    invoke-virtual {p1}, LFQ3;->a()Z

    move-result p1

    if-nez p1, :cond_a

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "User denied camera permission!"

    invoke-static {v0, p1}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_a
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LFQ3;

    invoke-virtual {p0, p1}, LD03$a;->a(LFQ3;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
