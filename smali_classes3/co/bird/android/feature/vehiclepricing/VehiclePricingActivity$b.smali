.class public final Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
    includes = {
        Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$c;
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\n\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0007J\u0008\u0010\n\u001a\u00020\tH\u0007R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000c\u00a8\u0006\u0010"
    }
    d2 = {
        "Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;",
        "",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "a",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;",
        "LRE;",
        "c",
        "Lco/bird/android/model/VehiclePricingDetails;",
        "d",
        "",
        "b",
        "Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity;",
        "Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity;)V",
        "vehicle-pricing_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;->a:Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity;

    return-void
.end method


# virtual methods
.method public final a()Lco/bird/android/core/mvp/BaseActivity;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;->a:Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity;

    return-object v0
.end method

.method public final b()Z
    .locals 3
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;->a:Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "vehicle_pricing_from_scan"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final c()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;->a:Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity;

    return-object v0
.end method

.method public final d()Lco/bird/android/model/VehiclePricingDetails;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity$b;->a:Lco/bird/android/feature/vehiclepricing/VehiclePricingActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "vehicle_pricing_details"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/VehiclePricingDetails;

    return-object v0
.end method
