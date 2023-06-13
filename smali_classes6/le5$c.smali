.class public Lle5$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lle5;->c(Ljava/util/UUID;[B)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/o<",
        "Landroid/bluetooth/BluetoothGattCharacteristic;",
        "Lio/reactivex/K<",
        "+[B>;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:[B

.field public final synthetic c:Lle5;


# direct methods
.method public constructor <init>(Lle5;[B)V
    .locals 0

    iput-object p1, p0, Lle5$c;->c:Lle5;

    iput-object p2, p0, Lle5$c;->b:[B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothGattCharacteristic;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothGattCharacteristic;",
            ")",
            "Lio/reactivex/K<",
            "+[B>;"
        }
    .end annotation

    iget-object v0, p0, Lle5$c;->c:Lle5;

    iget-object v1, p0, Lle5$c;->b:[B

    invoke-virtual {v0, p1, v1}, Lle5;->g(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, Landroid/bluetooth/BluetoothGattCharacteristic;

    invoke-virtual {p0, p1}, Lle5$c;->a(Landroid/bluetooth/BluetoothGattCharacteristic;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
