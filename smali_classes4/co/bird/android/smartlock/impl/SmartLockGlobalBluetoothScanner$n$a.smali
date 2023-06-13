.class public final Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n;->invoke(Lkotlin/Pair;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

.field public final synthetic h:LsE5;

.field public final synthetic i:Lcy0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcy0<",
            "LjI5;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:LuE5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuE5<",
            "LjI5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;LsE5;Lcy0;LuE5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;",
            "LsE5;",
            "Lcy0<",
            "LjI5;",
            ">;",
            "LuE5<",
            "LjI5;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n$a;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

    iput-object p2, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n$a;->h:LsE5;

    iput-object p3, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n$a;->i:Lcy0;

    iput-object p4, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n$a;->j:LuE5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n$a;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error received during ble unlock request (DISCONNECTING): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n$a;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

    invoke-static {v0}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->access$getSmartLockManager$p(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;)LhF5;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n$a;->h:LsE5;

    new-instance v2, Lco/bird/android/smartlock/api/SmartLockUnlockWrappedException;

    const-string v3, "it"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, p1}, Lco/bird/android/smartlock/api/SmartLockUnlockWrappedException;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v0, v1, v2}, LhF5;->b(LsE5;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n$a;->g:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n$a;->i:Lcy0;

    invoke-virtual {v0}, Lcy0;->c()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    const-string v1, "connectableDevice.device.address"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v1

    const-string v2, "now()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$a;->b:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$a;

    invoke-static {p1, v0, v1, v2}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;->access$recordAction(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$a;)V

    iget-object p1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$n$a;->j:LuE5;

    invoke-virtual {p1}, LxU;->x()Lno/nordicsemi/android/ble/p0;

    move-result-object p1

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/A0;->k()V

    return-void
.end method
