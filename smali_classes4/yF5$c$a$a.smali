.class public final LyF5$c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQS0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LyF5$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0007\u001a\u00020\u0006\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lno/nordicsemi/android/ble/callback/profile/ProfileReadResponse;",
        "T",
        "Landroid/bluetooth/BluetoothDevice;",
        "device",
        "Lno/nordicsemi/android/ble/data/Data;",
        "data",
        "",
        "b",
        "(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nValueChangedCallbackExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueChangedCallbackExt.kt\nno/nordicsemi/android/ble/ktx/ValueChangedCallbackExtKt$asValidResponseFlow$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Ln74;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln74<",
            "Lco/bird/android/smartlock/impl/SmartlockSolebeNotificationResponse;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln74;)V
    .locals 0

    iput-object p1, p0, LyF5$c$a$a;->b:Ln74;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V
    .locals 2

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lco/bird/android/smartlock/impl/SmartlockSolebeNotificationResponse;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lno/nordicsemi/android/ble/callback/profile/ProfileReadResponse;

    invoke-virtual {v1, p1, p2}, Lno/nordicsemi/android/ble/response/ReadResponse;->b(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V

    invoke-virtual {v1}, Lno/nordicsemi/android/ble/callback/profile/ProfileReadResponse;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lno/nordicsemi/android/ble/callback/profile/ProfileReadResponse;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object p1, p0, LyF5$c$a$a;->b:Ln74;

    invoke-interface {p1, v0}, Lys5;->h(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    return-void
.end method
