.class public final Lno/nordicsemi/android/ble/u0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LyT5;
.implements LDj1;
.implements Lj72;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lno/nordicsemi/android/ble/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lno/nordicsemi/android/ble/u0;


# direct methods
.method public constructor <init>(Lno/nordicsemi/android/ble/u0;)V
    .locals 0

    iput-object p1, p0, Lno/nordicsemi/android/ble/u0$b;->b:Lno/nordicsemi/android/ble/u0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lno/nordicsemi/android/ble/u0$b;->a:I

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    iput p2, p0, Lno/nordicsemi/android/ble/u0$b;->a:I

    iget-object p1, p0, Lno/nordicsemi/android/ble/u0$b;->b:Lno/nordicsemi/android/ble/u0;

    iget-object p1, p1, Lno/nordicsemi/android/ble/u0;->c:Landroid/os/ConditionVariable;

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    return-void
.end method

.method public b()V
    .locals 1

    const v0, -0xf4240

    iput v0, p0, Lno/nordicsemi/android/ble/u0$b;->a:I

    iget-object v0, p0, Lno/nordicsemi/android/ble/u0$b;->b:Lno/nordicsemi/android/ble/u0;

    iget-object v0, v0, Lno/nordicsemi/android/ble/u0;->c:Landroid/os/ConditionVariable;

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->open()V

    return-void
.end method

.method public c(Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    iget-object p1, p0, Lno/nordicsemi/android/ble/u0$b;->b:Lno/nordicsemi/android/ble/u0;

    iget-object p1, p1, Lno/nordicsemi/android/ble/u0;->c:Landroid/os/ConditionVariable;

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    return-void
.end method

.method public d()Z
    .locals 1

    iget v0, p0, Lno/nordicsemi/android/ble/u0$b;->a:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
