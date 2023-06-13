.class public final Lco/bird/android/feature/ar/parking/VpsParkingActivity;
.super Lco/bird/android/core/map/BaseMapActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/ar/parking/VpsParkingActivity$a;,
        Lco/bird/android/feature/ar/parking/VpsParkingActivity$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001:\u0002,-B\u0007\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0007\u001a\u00020\u0004H\u0014J\u0008\u0010\u0008\u001a\u00020\u0004H\u0016J*\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\t8\u0014X\u0094D\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0018\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8TX\u0094\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u001b\u0010)\u001a\u00020%8TX\u0094\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008&\u0010!\u001a\u0004\u0008\'\u0010(\u00a8\u0006."
    }
    d2 = {
        "Lco/bird/android/feature/ar/parking/VpsParkingActivity;",
        "Lco/bird/android/core/map/BaseMapActivity;",
        "LcD1;",
        "map",
        "",
        "onMapReady",
        "A0",
        "onPause",
        "onBackPressed",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "q0",
        "Lnv6;",
        "H",
        "Lnv6;",
        "C0",
        "()Lnv6;",
        "setPresenterFactory",
        "(Lnv6;)V",
        "presenterFactory",
        "Lfv6;",
        "I",
        "Lfv6;",
        "presenter",
        "J",
        "o0",
        "()I",
        "layoutResource",
        "Ls6;",
        "K",
        "Lkotlin/Lazy;",
        "B0",
        "()Ls6;",
        "layoutBinding",
        "Lcom/google/android/gms/maps/MapView;",
        "P",
        "n0",
        "()Lcom/google/android/gms/maps/MapView;",
        "googleMapView",
        "<init>",
        "()V",
        "a",
        "b",
        "co.bird.android.feature.ar-parking"
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
        "SMAP\nVpsParkingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VpsParkingActivity.kt\nco/bird/android/feature/ar/parking/VpsParkingActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,117:1\n44#2:118\n*S KotlinDebug\n*F\n+ 1 VpsParkingActivity.kt\nco/bird/android/feature/ar/parking/VpsParkingActivity\n*L\n57#1:118\n*E\n"
    }
.end annotation


# instance fields
.field public H:Lnv6;

.field public I:Lfv6;

.field public final J:I

.field public final K:Lkotlin/Lazy;

.field public final P:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lco/bird/android/core/map/BaseMapActivity;-><init>(Z)V

    sget-object v0, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    new-instance v1, Lco/bird/android/feature/ar/parking/VpsParkingActivity$d;

    invoke-direct {v1, p0}, Lco/bird/android/feature/ar/parking/VpsParkingActivity$d;-><init>(Lco/bird/android/feature/ar/parking/VpsParkingActivity;)V

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, p0, Lco/bird/android/feature/ar/parking/VpsParkingActivity;->K:Lkotlin/Lazy;

    new-instance v1, Lco/bird/android/feature/ar/parking/VpsParkingActivity$c;

    invoke-direct {v1, p0}, Lco/bird/android/feature/ar/parking/VpsParkingActivity$c;-><init>(Lco/bird/android/feature/ar/parking/VpsParkingActivity;)V

    invoke-static {v0, v1}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lco/bird/android/feature/ar/parking/VpsParkingActivity;->P:Lkotlin/Lazy;

    return-void
.end method


# virtual methods
.method public A0(LcD1;)V
    .locals 1

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lco/bird/android/core/map/BaseMapActivity;->A0(LcD1;)V

    iget-object v0, p0, Lco/bird/android/feature/ar/parking/VpsParkingActivity;->I:Lfv6;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lfv6;->Y(LcD1;)V

    :cond_0
    return-void
.end method

.method public B0()Ls6;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/ar/parking/VpsParkingActivity;->K:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls6;

    return-object v0
.end method

.method public final C0()Lnv6;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/ar/parking/VpsParkingActivity;->H:Lnv6;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenterFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic getLayoutBinding()LKp6;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/ar/parking/VpsParkingActivity;->B0()Ls6;

    move-result-object v0

    return-object v0
.end method

.method public n0()Lcom/google/android/gms/maps/MapView;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/ar/parking/VpsParkingActivity;->P:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/MapView;

    return-object v0
.end method

.method public o0()I
    .locals 1

    iget v0, p0, Lco/bird/android/feature/ar/parking/VpsParkingActivity;->J:I

    return v0
.end method

.method public onBackPressed()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/ar/parking/VpsParkingActivity;->I:Lfv6;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lfv6;->V()V

    :cond_0
    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onBackPressed()V

    return-void
.end method

.method public onMapReady(LcD1;)V
    .locals 14

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lco/bird/android/core/map/BaseMapActivity;->onMapReady(LcD1;)V

    new-instance v3, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;

    invoke-direct {v3, p1}, Lco/bird/android/app/feature/map/ui/ReactiveMapEventImpl;-><init>(LcD1;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "ride"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v11, v0

    check-cast v11, Lco/bird/android/model/wire/WireRide;

    new-instance v12, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object v0

    invoke-virtual {v11}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v1

    invoke-static {v0, v1}, LUq4;->c(LTq4;Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/wire/configs/Config;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRiderMapConfig()Lco/bird/android/model/wire/configs/MobileMapConfigView;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->R()Ldr4;

    move-result-object v6

    move-object v1, v12

    move-object v2, p1

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;-><init>(LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/uber/autodispose/ScopeProvider;Lco/bird/android/model/wire/configs/MobileMapConfigView;Ldr4;)V

    new-instance v13, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getParkingConfig()Lco/bird/android/model/wire/configs/ParkingConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/ParkingConfig;->getEnableRiderParkingNestRadius()Z

    move-result v0

    invoke-direct {v13, p0, p1, v0}, Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;-><init>(Landroid/content/Context;LcD1;Z)V

    invoke-static {}, Lco/bird/android/feature/ar/parking/a;->a()Lco/bird/android/feature/ar/parking/VpsParkingActivity$a$a;

    move-result-object v4

    sget-object v0, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v2, "application"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v5

    invoke-static {p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v7

    const-string v0, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/feature/ar/parking/VpsParkingActivity;->B0()Ls6;

    move-result-object v8

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->x()LDQ3;

    move-result-object v10

    move-object v6, p0

    move-object v9, p1

    invoke-interface/range {v4 .. v13}, Lco/bird/android/feature/ar/parking/VpsParkingActivity$a$a;->a(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Ls6;LcD1;LDQ3;Lco/bird/android/model/wire/WireRide;Lco/bird/android/app/feature/map/ui/renderer/MapPolygonableRenderer;Lco/bird/android/app/feature/map/ui/renderer/ParkingNestRenderer;)Lco/bird/android/feature/ar/parking/VpsParkingActivity$a;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/ar/parking/VpsParkingActivity$a;->a(Lco/bird/android/feature/ar/parking/VpsParkingActivity;)V

    invoke-virtual {p0}, Lco/bird/android/feature/ar/parking/VpsParkingActivity;->C0()Lnv6;

    move-result-object p1

    invoke-interface {p1}, Lnv6;->create()Lfv6;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/feature/ar/parking/VpsParkingActivity;->I:Lfv6;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lfv6;->W()V

    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/ar/parking/VpsParkingActivity;->I:Lfv6;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lfv6;->X()V

    :cond_0
    invoke-super {p0}, Lco/bird/android/core/map/BaseMapActivity;->onPause()V

    return-void
.end method

.method public q0(IILandroid/content/Intent;LcD1;)V
    .locals 1

    const-string v0, "map"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Lco/bird/android/core/map/BaseMapActivity;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method
