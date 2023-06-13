.class public final Lco/bird/android/feature/vehiclepricing/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
        "LRE;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/vehiclepricing/d;->a:Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;

    return-void
.end method

.method public static a(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;)Lco/bird/android/feature/vehiclepricing/d;
    .locals 1

    new-instance v0, Lco/bird/android/feature/vehiclepricing/d;

    invoke-direct {v0, p0}, Lco/bird/android/feature/vehiclepricing/d;-><init>(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;)Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;",
            ")",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;->c()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    return-object p0
.end method


# virtual methods
.method public b()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/vehiclepricing/d;->a:Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;

    invoke-static {v0}, Lco/bird/android/feature/vehiclepricing/d;->c(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;)Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/vehiclepricing/d;->b()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v0

    return-object v0
.end method
