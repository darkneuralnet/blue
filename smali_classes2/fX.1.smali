.class public final LfX;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LhY;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ldr4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static a(Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;LhY;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;->a:LhY;

    return-void
.end method

.method public static b(Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;Ldr4;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;->b:Ldr4;

    return-void
.end method

.method public static d(Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;Lgl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;->c:Lgl;

    return-void
.end method

.method public static e(Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;LTq4;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;->d:LTq4;

    return-void
.end method


# virtual methods
.method public c(Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;)V
    .locals 1

    iget-object v0, p0, LfX;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LhY;

    invoke-static {p1, v0}, LfX;->a(Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;LhY;)V

    iget-object v0, p0, LfX;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldr4;

    invoke-static {p1, v0}, LfX;->b(Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;Ldr4;)V

    iget-object v0, p0, LfX;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgl;

    invoke-static {p1, v0}, LfX;->d(Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;Lgl;)V

    iget-object v0, p0, LfX;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LTq4;

    invoke-static {p1, v0}, LfX;->e(Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;LTq4;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;

    invoke-virtual {p0, p1}, LfX;->c(Lco/bird/android/app/feature/bluetooth/BluetoothDiscoveryReceiver;)V

    return-void
.end method
