.class public final LJ21;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Landroid/bluetooth/BluetoothDevice;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lpd5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Ljava/lang/String;",
            ">;",
            "LZ94<",
            "Lpd5;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ21;->a:LZ94;

    iput-object p2, p0, LJ21;->b:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;)LJ21;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Ljava/lang/String;",
            ">;",
            "LZ94<",
            "Lpd5;",
            ">;)",
            "LJ21;"
        }
    .end annotation

    new-instance v0, LJ21;

    invoke-direct {v0, p0, p1}, LJ21;-><init>(LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;Lpd5;)Landroid/bluetooth/BluetoothDevice;
    .locals 0

    invoke-static {p0, p1}, LI21;->a(Ljava/lang/String;Lpd5;)Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    invoke-static {p0}, LyZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/bluetooth/BluetoothDevice;

    return-object p0
.end method


# virtual methods
.method public b()Landroid/bluetooth/BluetoothDevice;
    .locals 2

    iget-object v0, p0, LJ21;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, LJ21;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpd5;

    invoke-static {v0, v1}, LJ21;->c(Ljava/lang/String;Lpd5;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJ21;->b()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method
