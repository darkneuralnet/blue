.class public final synthetic LCv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQS0;


# instance fields
.field public final synthetic b:Lco/bird/android/manager/bluetooth/internal/a;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/manager/bluetooth/internal/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCv;->b:Lco/bird/android/manager/bluetooth/internal/a;

    return-void
.end method


# virtual methods
.method public final b(Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V
    .locals 1

    iget-object v0, p0, LCv;->b:Lco/bird/android/manager/bluetooth/internal/a;

    invoke-static {v0, p1, p2}, Lco/bird/android/manager/bluetooth/internal/a$d;->h5(Lco/bird/android/manager/bluetooth/internal/a;Landroid/bluetooth/BluetoothDevice;Lno/nordicsemi/android/ble/data/Data;)V

    return-void
.end method
