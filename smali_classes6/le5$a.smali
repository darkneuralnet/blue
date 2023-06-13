.class public Lle5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lle5;->e(Ljava/util/UUID;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/o<",
        "Lue5;",
        "Lio/reactivex/F<",
        "+",
        "Landroid/bluetooth/BluetoothGattCharacteristic;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Ljava/util/UUID;

.field public final synthetic c:Lle5;


# direct methods
.method public constructor <init>(Lle5;Ljava/util/UUID;)V
    .locals 0

    iput-object p1, p0, Lle5$a;->c:Lle5;

    iput-object p2, p0, Lle5$a;->b:Ljava/util/UUID;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lue5;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lue5;",
            ")",
            "Lio/reactivex/F<",
            "+",
            "Landroid/bluetooth/BluetoothGattCharacteristic;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lle5$a;->b:Ljava/util/UUID;

    invoke-virtual {p1, v0}, Lue5;->b(Ljava/util/UUID;)Lio/reactivex/F;

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

    check-cast p1, Lue5;

    invoke-virtual {p0, p1}, Lle5$a;->a(Lue5;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method
