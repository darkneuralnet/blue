.class public final Lco/bird/android/feature/vehiclepricing/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/vehiclepricing/c;->a:Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;

    return-void
.end method

.method public static a(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;)Lco/bird/android/feature/vehiclepricing/c;
    .locals 1

    new-instance v0, Lco/bird/android/feature/vehiclepricing/c;

    invoke-direct {v0, p0}, Lco/bird/android/feature/vehiclepricing/c;-><init>(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;)V

    return-object v0
.end method

.method public static b(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;)Z
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;->b()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public c()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/vehiclepricing/c;->a:Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;

    invoke-static {v0}, Lco/bird/android/feature/vehiclepricing/c;->b(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/vehiclepricing/c;->c()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
