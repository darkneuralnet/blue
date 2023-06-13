.class public Lu70;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/UUID;)Lio/reactivex/functions/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            ")",
            "Lio/reactivex/functions/q<",
            "-",
            "Lt70<",
            "Ljava/util/UUID;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lu70$a;

    invoke-direct {v0, p0}, Lu70$a;-><init>(Ljava/util/UUID;)V

    return-object v0
.end method

.method public static b(Landroid/bluetooth/BluetoothGattDescriptor;)Lio/reactivex/functions/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothGattDescriptor;",
            ")",
            "Lio/reactivex/functions/q<",
            "-",
            "Lt70<",
            "Landroid/bluetooth/BluetoothGattDescriptor;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Lu70$c;

    invoke-direct {v0, p0}, Lu70$c;-><init>(Landroid/bluetooth/BluetoothGattDescriptor;)V

    return-object v0
.end method

.method public static c()Lio/reactivex/functions/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/functions/o<",
            "Lt70<",
            "*>;[B>;"
        }
    .end annotation

    new-instance v0, Lu70$b;

    invoke-direct {v0}, Lu70$b;-><init>()V

    return-object v0
.end method
