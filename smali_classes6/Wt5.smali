.class public final synthetic LWt5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# instance fields
.field public final synthetic b:Landroid/bluetooth/BluetoothGatt;


# direct methods
.method public synthetic constructor <init>(Landroid/bluetooth/BluetoothGatt;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWt5;->b:Landroid/bluetooth/BluetoothGatt;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LWt5;->b:Landroid/bluetooth/BluetoothGatt;

    check-cast p1, Ljava/lang/Long;

    invoke-static {v0, p1}, LYt5;->j(Landroid/bluetooth/BluetoothGatt;Ljava/lang/Long;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method
