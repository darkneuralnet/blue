.class public final LSk6;
.super LrA;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "LSk6;",
        "LrA;",
        "LG6;",
        "adapterItem",
        "",
        "b",
        "<init>",
        "()V",
        "co.bird.android.feature.commandcenter"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nVehicleDetailsAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleDetailsAdapterDiff.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,26:1\n18#2:27\n18#2:32\n9#3,4:28\n9#3,4:33\n*S KotlinDebug\n*F\n+ 1 VehicleDetailsAdapterDiff.kt\nco/bird/android/feature/commandcenter/vehicledetails/adapters/VehicleDetailsAdapterDiff\n*L\n17#1:27\n20#1:32\n17#1:28,4\n20#1:33,4\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LrA;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LG6;)Ljava/lang/String;
    .locals 4

    const-string v0, "adapterItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LG6;->b()I

    move-result v0

    sget v1, Lnj4;->item_vehicle_summary:I

    if-ne v0, v1, :cond_0

    const-string p1, "info"

    goto :goto_1

    :cond_0
    sget v1, LUi4;->item_command_center_service_center:I

    if-ne v0, v1, :cond_1

    const-string p1, "service"

    goto :goto_1

    :cond_1
    sget v1, LUi4;->item_command_center_past_work_order:I

    const-string v2, ""

    const/4 v3, 0x0

    if-ne v0, v1, :cond_4

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LbJ3;

    if-eqz v0, :cond_2

    move-object v3, p1

    :cond_2
    check-cast v3, LbJ3;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, LbJ3;->b()Lco/bird/android/model/PastWorkOrderButton;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/PastWorkOrderButton;->getWorkOrder()Lco/bird/android/model/WorkOrder;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/WorkOrder;->getId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_7

    :cond_3
    :goto_0
    move-object p1, v2

    goto :goto_1

    :cond_4
    sget v1, LUi4;->item_button_drop_down_brand_outline:I

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/UpdateServiceProgressButton;

    if-eqz v0, :cond_5

    move-object v3, p1

    :cond_5
    check-cast v3, Lco/bird/android/model/UpdateServiceProgressButton;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lco/bird/android/model/UpdateServiceProgressButton;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_6
    invoke-super {p0, p1}, LrA;->b(LG6;)Ljava/lang/String;

    move-result-object p1

    :cond_7
    :goto_1
    return-object p1
.end method
