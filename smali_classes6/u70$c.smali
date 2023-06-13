.class public Lu70$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu70;->b(Landroid/bluetooth/BluetoothGattDescriptor;)Lio/reactivex/functions/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/q<",
        "Lt70<",
        "Landroid/bluetooth/BluetoothGattDescriptor;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Landroid/bluetooth/BluetoothGattDescriptor;


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothGattDescriptor;)V
    .locals 0

    iput-object p1, p0, Lu70$c;->b:Landroid/bluetooth/BluetoothGattDescriptor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lt70;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt70<",
            "Landroid/bluetooth/BluetoothGattDescriptor;",
            ">;)Z"
        }
    .end annotation

    iget-object p1, p1, Lt70;->a:Ljava/lang/Object;

    check-cast p1, Landroid/bluetooth/BluetoothGattDescriptor;

    iget-object v0, p0, Lu70$c;->b:Landroid/bluetooth/BluetoothGattDescriptor;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, Lt70;

    invoke-virtual {p0, p1}, Lu70$c;->a(Lt70;)Z

    move-result p1

    return p1
.end method
