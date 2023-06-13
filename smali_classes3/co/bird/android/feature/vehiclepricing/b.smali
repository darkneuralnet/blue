.class public final Lco/bird/android/feature/vehiclepricing/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lco/bird/android/core/mvp/BaseActivity;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/vehiclepricing/b;->a:Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;

    return-void
.end method

.method public static a(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;)Lco/bird/android/core/mvp/BaseActivity;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;->a()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/core/mvp/BaseActivity;

    return-object p0
.end method

.method public static b(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;)Lco/bird/android/feature/vehiclepricing/b;
    .locals 1

    new-instance v0, Lco/bird/android/feature/vehiclepricing/b;

    invoke-direct {v0, p0}, Lco/bird/android/feature/vehiclepricing/b;-><init>(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;)V

    return-object v0
.end method


# virtual methods
.method public c()Lco/bird/android/core/mvp/BaseActivity;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/vehiclepricing/b;->a:Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;

    invoke-static {v0}, Lco/bird/android/feature/vehiclepricing/b;->a(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;)Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/vehiclepricing/b;->c()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    return-object v0
.end method
