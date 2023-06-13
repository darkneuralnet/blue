.class public final Lqd5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lpd5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Landroid/bluetooth/BluetoothAdapter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Landroid/bluetooth/BluetoothAdapter;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqd5;->a:LZ94;

    return-void
.end method

.method public static a(LZ94;)Lqd5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Landroid/bluetooth/BluetoothAdapter;",
            ">;)",
            "Lqd5;"
        }
    .end annotation

    new-instance v0, Lqd5;

    invoke-direct {v0, p0}, Lqd5;-><init>(LZ94;)V

    return-object v0
.end method

.method public static c(Landroid/bluetooth/BluetoothAdapter;)Lpd5;
    .locals 1

    new-instance v0, Lpd5;

    invoke-direct {v0, p0}, Lpd5;-><init>(Landroid/bluetooth/BluetoothAdapter;)V

    return-object v0
.end method


# virtual methods
.method public b()Lpd5;
    .locals 1

    iget-object v0, p0, Lqd5;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothAdapter;

    invoke-static {v0}, Lqd5;->c(Landroid/bluetooth/BluetoothAdapter;)Lpd5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lqd5;->b()Lpd5;

    move-result-object v0

    return-object v0
.end method
