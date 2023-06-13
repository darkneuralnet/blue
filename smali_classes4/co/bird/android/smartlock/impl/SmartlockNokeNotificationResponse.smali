.class public final Lco/bird/android/smartlock/impl/SmartlockNokeNotificationResponse;
.super Lco/bird/android/smartlock/impl/SmartlockNokeDataCallback;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0018\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R$\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\t\u0010\u000b\"\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0011"
    }
    d2 = {
        "Lco/bird/android/smartlock/impl/SmartlockNokeNotificationResponse;",
        "Lco/bird/android/smartlock/impl/SmartlockNokeDataCallback;",
        "Landroid/os/Parcelable;",
        "Landroid/bluetooth/BluetoothDevice;",
        "device",
        "",
        "data",
        "",
        "a",
        "e",
        "[B",
        "()[B",
        "setUnparsedNotificationByteArray",
        "([B)V",
        "unparsedNotificationByteArray",
        "<init>",
        "()V",
        "impl_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public e:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/smartlock/impl/SmartlockNokeDataCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 1

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "data"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lco/bird/android/smartlock/impl/SmartlockNokeNotificationResponse;->e:[B

    return-void
.end method

.method public final e()[B
    .locals 1

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartlockNokeNotificationResponse;->e:[B

    return-object v0
.end method
