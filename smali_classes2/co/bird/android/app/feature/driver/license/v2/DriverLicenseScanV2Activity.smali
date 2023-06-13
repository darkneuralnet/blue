.class public final Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity$a;,
        Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0008\u0010\u0006\u001a\u00020\u0004H\u0014J\u0008\u0010\u0007\u001a\u00020\u0004H\u0014J\u0008\u0010\u0008\u001a\u00020\u0004H\u0014J\"\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0014R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001f"
    }
    d2 = {
        "Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "onResume",
        "onPause",
        "onDestroy",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "onActivityResult",
        "LI71;",
        "B",
        "LI71;",
        "j0",
        "()LI71;",
        "setDriverLicenseScanV2PresenterImplFactory",
        "(LI71;)V",
        "driverLicenseScanV2PresenterImplFactory",
        "Lt71;",
        "C",
        "Lt71;",
        "presenter",
        "<init>",
        "()V",
        "D",
        "a",
        "app_birdRelease"
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
        "SMAP\nDriverLicenseScanV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriverLicenseScanV2Activity.kt\nco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,78:1\n44#2:79\n*S KotlinDebug\n*F\n+ 1 DriverLicenseScanV2Activity.kt\nco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity\n*L\n46#1:79\n*E\n"
    }
.end annotation


# static fields
.field public static final D:Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity$a;

.field public static final E:I


# instance fields
.field public B:LI71;

.field public C:Lt71;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity;->D:Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity$a;

    const/16 v0, 0x8

    sput v0, Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity;->E:I

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/core/mvp/BaseActivity;-><init>(ZLjava/lang/Integer;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public final j0()LI71;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity;->B:LI71;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "driverLicenseScanV2PresenterImplFactory"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lco/bird/android/core/base/BaseCoreActivity;->onActivityResult(IILandroid/content/Intent;)V

    iget-object v0, p0, Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity;->C:Lt71;

    if-nez v0, :cond_0

    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0, p1, p2, p3}, Lt71;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    sget-object p1, LH22;->a:LH22;

    invoke-virtual {p1, p0}, LH22;->u1(Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity;)V

    sget p1, Lcj4;->activity_driver_license_scan_v2:I

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getIdCardTerminology()Lco/bird/android/model/constant/IdCardTerminology;

    move-result-object p1

    sget-object v0, Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getEnableIdCardStringSwap()Z

    move-result p1

    if-eqz p1, :cond_0

    sget p1, Lnl4;->id_card_activity_title:I

    goto :goto_0

    :cond_0
    sget p1, Lnl4;->driver_license_activity_title:I

    goto :goto_0

    :cond_1
    sget p1, Lnl4;->driver_license_or_provisional_activity_title:I

    goto :goto_0

    :cond_2
    sget p1, Lnl4;->driver_license_activity_title:I

    goto :goto_0

    :cond_3
    sget p1, Lnl4;->id_card_activity_title:I

    :goto_0
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setTitle(Ljava/lang/CharSequence;)V

    new-instance v3, LO71;

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getEnableIdCardStringSwap()Z

    move-result p1

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getIdCardTerminology()Lco/bird/android/model/constant/IdCardTerminology;

    move-result-object v0

    invoke-direct {v3, p0, p1, v0}, LO71;-><init>(Lco/bird/android/core/mvp/BaseActivity;ZLco/bird/android/model/constant/IdCardTerminology;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity;->j0()LI71;

    move-result-object v0

    invoke-static {p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v2

    const-string p1, "AndroidLifecycleScopeProvider.from(this)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->w()Le13;

    move-result-object v4

    new-instance v5, LzN5;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "applicationContext"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, p1}, LzN5;-><init>(Landroid/content/Context;)V

    move-object v1, p0

    invoke-interface/range {v0 .. v5}, LI71;->a(Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;LM71;Le13;LzN5;)LG71;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity;->C:Lt71;

    if-nez p1, :cond_4

    const-string p1, "presenter"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_4
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "intent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lt71;->b(Landroid/content/Intent;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity;->C:Lt71;

    if-nez v0, :cond_0

    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0}, Lt71;->onDestroy()V

    invoke-super {p0}, Lco/bird/android/core/mvp/BaseActivity;->onDestroy()V

    return-void
.end method

.method public onPause()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity;->C:Lt71;

    if-nez v0, :cond_0

    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0}, Lt71;->onPause()V

    invoke-super {p0}, Lco/bird/android/core/mvp/BaseActivity;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity;->C:Lt71;

    if-nez v0, :cond_0

    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-interface {v0}, Lt71;->onResume()V

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onResume()V

    return-void
.end method
