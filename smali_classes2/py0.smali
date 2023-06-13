.class public final Lpy0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loy0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpy0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Loy0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 \u000c*\u0004\u0008\u0000\u0010\u00012\u00020\u0002:\u0001\u000bB\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0008H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0008H\u0016J\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00140\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0015R#\u0010\u001b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00140\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "Lpy0;",
        "T",
        "Loy0;",
        "Landroid/bluetooth/BluetoothDevice;",
        "device",
        "",
        "c",
        "b",
        "",
        "reason",
        "f",
        "a",
        "d",
        "e",
        "value",
        "h",
        "(Ljava/lang/Object;)V",
        "g",
        "()Ljava/lang/Object;",
        "LGX2;",
        "",
        "LGX2;",
        "_status",
        "LtP5;",
        "LtP5;",
        "getStatus",
        "()LtP5;",
        "status",
        "Ljava/lang/Object;",
        "lastValue",
        "<init>",
        "()V",
        "interface_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final d:Lpy0$a;


# instance fields
.field public final a:LGX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGX2<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpy0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpy0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpy0;->d:Lpy0$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LoW1;

    invoke-direct {v0}, LoW1;-><init>()V

    invoke-static {v0}, LvP5;->a(Ljava/lang/Object;)LGX2;

    move-result-object v0

    iput-object v0, p0, Lpy0;->a:LGX2;

    invoke-static {v0}, LVu1;->b(LGX2;)LtP5;

    move-result-object v0

    iput-object v0, p0, Lpy0;->b:LtP5;

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothDevice;)V
    .locals 3

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "BLE-CONNECTION"

    invoke-static {v0}, Lg46;->k(Ljava/lang/String;)Lg46$b;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDeviceReady()"

    invoke-virtual {v0, v2, v1}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lpy0;->a:LGX2;

    new-instance v1, LzT5;

    iget-object v2, p0, Lpy0;->c:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v1, p1, v2}, LzT5;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Landroid/bluetooth/BluetoothDevice;)V
    .locals 3

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "BLE-CONNECTION"

    invoke-static {v0}, Lg46;->k(Ljava/lang/String;)Lg46$b;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDeviceConnected()"

    invoke-virtual {v0, v2, v1}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lpy0;->a:LGX2;

    new-instance v1, Ldy0;

    invoke-direct {v1, p1}, Ldy0;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public c(Landroid/bluetooth/BluetoothDevice;)V
    .locals 3

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "BLE-CONNECTION"

    invoke-static {v0}, Lg46;->k(Ljava/lang/String;)Lg46$b;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDeviceConnecting()"

    invoke-virtual {v0, v2, v1}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lpy0;->a:LGX2;

    new-instance v1, Ley0;

    invoke-direct {v1, p1}, Ley0;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-interface {v0, v1}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public d(Landroid/bluetooth/BluetoothDevice;)V
    .locals 2

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "BLE-CONNECTION"

    invoke-static {p1}, Lg46;->k(Ljava/lang/String;)Lg46$b;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onDeviceDisconnecting()"

    invoke-virtual {p1, v1, v0}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public e(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 3

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "BLE-CONNECTION"

    invoke-static {v0}, Lg46;->k(Ljava/lang/String;)Lg46$b;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDeviceDisconnected(), reason: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lpy0;->a:LGX2;

    if-eqz p2, :cond_2

    const/4 v1, 0x3

    if-eq p2, v1, :cond_1

    const/4 v1, 0x4

    if-eq p2, v1, :cond_0

    new-instance p2, Lke6;

    invoke-direct {p2, p1}, Lke6;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    goto :goto_0

    :cond_0
    new-instance p2, LuU2;

    invoke-direct {p2, p1}, LuU2;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    goto :goto_0

    :cond_1
    new-instance p2, LNr2;

    invoke-virtual {p0}, Lpy0;->g()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p2, p1, v1}, LNr2;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    new-instance p2, Lu41;

    invoke-direct {p2, p1}, Lu41;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    :goto_0
    invoke-interface {v0, p2}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public f(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 3

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "BLE-CONNECTION"

    invoke-static {v0}, Lg46;->k(Ljava/lang/String;)Lg46$b;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onDeviceFailedToConnect(), reason: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p2, v1}, Lg46$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p2, p0, Lpy0;->a:LGX2;

    new-instance v0, LuU2;

    invoke-direct {v0, p1}, LuU2;-><init>(Landroid/bluetooth/BluetoothDevice;)V

    invoke-interface {p2, v0}, LGX2;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final g()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lpy0;->a:LGX2;

    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LzT5;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, LzT5;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LzT5;->b()Ljava/lang/Object;

    move-result-object v2

    :cond_1
    return-object v2
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iput-object p1, p0, Lpy0;->c:Ljava/lang/Object;

    iget-object v0, p0, Lpy0;->a:LGX2;

    invoke-interface {v0}, LGX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LzT5;

    if-eqz v1, :cond_0

    check-cast v0, LzT5;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lpy0;->a:LGX2;

    new-instance v2, LzT5;

    invoke-virtual {v0}, LG21;->a()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    invoke-direct {v2, v0, p1}, LzT5;-><init>(Landroid/bluetooth/BluetoothDevice;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, LGX2;->setValue(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
