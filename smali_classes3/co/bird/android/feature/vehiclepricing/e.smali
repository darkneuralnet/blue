.class public final Lco/bird/android/feature/vehiclepricing/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lco/bird/android/model/VehiclePricingDetails;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/vehiclepricing/e;->a:Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;

    return-void
.end method

.method public static a(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;)Lco/bird/android/feature/vehiclepricing/e;
    .locals 1

    new-instance v0, Lco/bird/android/feature/vehiclepricing/e;

    invoke-direct {v0, p0}, Lco/bird/android/feature/vehiclepricing/e;-><init>(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;)Lco/bird/android/model/VehiclePricingDetails;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;->d()Lco/bird/android/model/VehiclePricingDetails;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()Lco/bird/android/model/VehiclePricingDetails;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/vehiclepricing/e;->a:Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;

    invoke-static {v0}, Lco/bird/android/feature/vehiclepricing/e;->c(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;)Lco/bird/android/model/VehiclePricingDetails;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/vehiclepricing/e;->b()Lco/bird/android/model/VehiclePricingDetails;

    move-result-object v0

    return-object v0
.end method
