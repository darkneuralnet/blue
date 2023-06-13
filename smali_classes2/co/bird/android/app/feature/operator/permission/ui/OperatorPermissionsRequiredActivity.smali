.class public final Lco/bird/android/app/feature/operator/permission/ui/OperatorPermissionsRequiredActivity;
.super Lco/bird/android/core/mvp/BaseActivity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0008\u0010\u0006\u001a\u00020\u0004H\u0016J\u0008\u0010\u0007\u001a\u00020\u0004H\u0014J\u0008\u0010\u0008\u001a\u00020\u0004H\u0014R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006\'"
    }
    d2 = {
        "Lco/bird/android/app/feature/operator/permission/ui/OperatorPermissionsRequiredActivity;",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "onBackPressed",
        "onStart",
        "onDestroy",
        "LGQ3;",
        "B",
        "LGQ3;",
        "m0",
        "()LGQ3;",
        "setPresenter",
        "(LGQ3;)V",
        "presenter",
        "Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;",
        "C",
        "Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;",
        "j0",
        "()Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;",
        "setBluetoothEnableChangeReceiver",
        "(Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;)V",
        "bluetoothEnableChangeReceiver",
        "Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;",
        "D",
        "Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;",
        "k0",
        "()Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;",
        "setLocationEnableChangeReceiver",
        "(Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;)V",
        "locationEnableChangeReceiver",
        "LaZ2;",
        "E",
        "LaZ2;",
        "navigationDrawerPresenter",
        "<init>",
        "()V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public B:LGQ3;

.field public C:Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;

.field public D:Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;

.field public E:LaZ2;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/core/mvp/BaseActivity;-><init>(ZLjava/lang/Integer;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public final j0()Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/OperatorPermissionsRequiredActivity;->C:Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "bluetoothEnableChangeReceiver"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final k0()Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/OperatorPermissionsRequiredActivity;->D:Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "locationEnableChangeReceiver"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final m0()LGQ3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/operator/permission/ui/OperatorPermissionsRequiredActivity;->B:LGQ3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onBackPressed()V
    .locals 0

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    sget v0, LCl4;->LightAppTheme_NoActionBar:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->setTheme(I)V

    invoke-super {p0, p1}, Lco/bird/android/core/mvp/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Ly4;->c(Landroid/view/LayoutInflater;)Ly4;

    move-result-object v4

    const-string p1, "inflate(layoutInflater)"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ly4;->b()Landroidx/drawerlayout/widget/DrawerLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-static {}, Lco/bird/android/app/feature/operator/permission/ui/a;->a()Lco/bird/android/app/feature/operator/permission/ui/b$a;

    move-result-object v0

    sget-object p1, LoG2;->a:LoG2;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v2, "application"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->Z()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/core/mvp/BaseActivity;->x()LDQ3;

    move-result-object v5

    move-object v2, p0

    invoke-interface/range {v0 .. v5}, Lco/bird/android/app/feature/operator/permission/ui/b$a;->a(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Ly4;LDQ3;)Lco/bird/android/app/feature/operator/permission/ui/b;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/app/feature/operator/permission/ui/b;->a(Lco/bird/android/app/feature/operator/permission/ui/OperatorPermissionsRequiredActivity;)V

    iget-object p1, p0, Lco/bird/android/app/feature/operator/permission/ui/OperatorPermissionsRequiredActivity;->E:LaZ2;

    if-nez p1, :cond_0

    const-string p1, "navigationDrawerPresenter"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p1}, LaZ2;->a()V

    invoke-virtual {p0}, Lco/bird/android/app/feature/operator/permission/ui/OperatorPermissionsRequiredActivity;->k0()Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;

    move-result-object p1

    sget-object v0, Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;->d:Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver$a;

    invoke-virtual {v0}, Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver$a;->a()Landroid/content/IntentFilter;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    invoke-virtual {p0}, Lco/bird/android/app/feature/operator/permission/ui/OperatorPermissionsRequiredActivity;->j0()Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;

    move-result-object p1

    sget-object v0, Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;->c:Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver$a;

    invoke-virtual {v0}, Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver$a;->a()Landroid/content/IntentFilter;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lco/bird/android/core/mvp/BaseActivity;->onDestroy()V

    invoke-virtual {p0}, Lco/bird/android/app/feature/operator/permission/ui/OperatorPermissionsRequiredActivity;->k0()Lco/bird/android/app/feature/operator/activity/LocationEnableChangeReceiver;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    invoke-virtual {p0}, Lco/bird/android/app/feature/operator/permission/ui/OperatorPermissionsRequiredActivity;->j0()Lco/bird/android/app/feature/operator/activity/BluetoothEnableChangeReceiver;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStart()V

    invoke-virtual {p0}, Lco/bird/android/app/feature/operator/permission/ui/OperatorPermissionsRequiredActivity;->m0()LGQ3;

    move-result-object v0

    invoke-interface {v0}, LGQ3;->onStart()V

    return-void
.end method
