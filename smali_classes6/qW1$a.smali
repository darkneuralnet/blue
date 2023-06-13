.class public LqW1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LqW1;->a(Landroid/bluetooth/BluetoothGattCharacteristic;I)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/bluetooth/BluetoothGattCharacteristic;

.field public final synthetic c:I

.field public final synthetic d:LqW1;


# direct methods
.method public constructor <init>(LqW1;Landroid/bluetooth/BluetoothGattCharacteristic;I)V
    .locals 0

    iput-object p1, p0, LqW1$a;->d:LqW1;

    iput-object p2, p0, LqW1$a;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    iput p3, p0, LqW1$a;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, LqW1$a;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothGattCharacteristic;->getProperties()I

    move-result v0

    iget v1, p0, LqW1$a;->c:I

    and-int/2addr v0, v1

    if-nez v0, :cond_1

    iget-object v0, p0, LqW1$a;->d:LqW1;

    iget-object v0, v0, LqW1;->a:LsW1;

    iget-object v2, p0, LqW1$a;->b:Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {v0, v2, v1}, LsW1;->a(Landroid/bluetooth/BluetoothGattCharacteristic;I)Lcom/polidea/rxandroidble2/internal/BleIllegalOperationException;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    throw v0

    :cond_1
    :goto_0
    return-void
.end method
