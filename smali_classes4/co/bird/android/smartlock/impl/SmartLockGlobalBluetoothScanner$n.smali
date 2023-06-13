.class public final Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->N(Lio/reactivex/p;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lcy0<",
        "LjI5;",
        ">;+",
        "LsE5;",
        ">;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lcy0;",
        "LjI5;",
        "LsE5;",
        "<name for destructuring parameter 0>",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Pair;)Lio/reactivex/h;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;


# direct methods
.method public constructor <init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;LsE5;Lcy0;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n;->c(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;LsE5;Lcy0;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final c(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;LsE5;Lcy0;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$smartLock"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$connectableDevice"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Successfully unlocked ble smartlock"

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p0}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->access$getSmartLockManager$p(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)LhF5;

    move-result-object v0

    sget-object v1, LwE5;->j:LwE5;

    invoke-interface {v0, p1, v1}, LhF5;->a(LsE5;LwE5;)V

    invoke-virtual {p2}, Lcy0;->c()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object p1

    const-string p2, "connectableDevice.device.address"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object p2

    const-string v0, "now()"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$a;->b:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$a;

    invoke-static {p0, p1, p2, v0}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->access$recordAction(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$a;)V

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Lkotlin/Pair;)Lio/reactivex/h;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lcy0<",
            "LjI5;",
            ">;",
            "LsE5;",
            ">;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcy0;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LsE5;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Received a connectableDevice "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcy0;->d()LVy;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type co.bird.android.smartlock.api.SmartLockDeviceManager<co.bird.android.smartlock.api.SmartlockData>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LuE5;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, LuE5;->U(Z)Lio/reactivex/c;

    move-result-object v2

    new-instance v3, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n$a;

    iget-object v4, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

    invoke-direct {v3, v4, p1, v0, v1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n$a;-><init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;LsE5;Lcy0;LuE5;)V

    new-instance v1, LWE5;

    invoke-direct {v1, v3}, LWE5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v1

    iget-object v2, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

    new-instance v3, LXE5;

    invoke-direct {v3, v2, p1, v0}, LXE5;-><init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;LsE5;Lcy0;)V

    invoke-virtual {v1, v3}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n;->invoke(Lkotlin/Pair;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
