.class public final LVX;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LUX;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Landroid/bluetooth/BluetoothManager;",
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
            "Landroid/bluetooth/BluetoothManager;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVX;->a:LZ94;

    return-void
.end method

.method public static a(LZ94;)LVX;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Landroid/bluetooth/BluetoothManager;",
            ">;)",
            "LVX;"
        }
    .end annotation

    new-instance v0, LVX;

    invoke-direct {v0, p0}, LVX;-><init>(LZ94;)V

    return-object v0
.end method

.method public static c(Landroid/bluetooth/BluetoothManager;)LUX;
    .locals 1

    new-instance v0, LUX;

    invoke-direct {v0, p0}, LUX;-><init>(Landroid/bluetooth/BluetoothManager;)V

    return-object v0
.end method


# virtual methods
.method public b()LUX;
    .locals 1

    iget-object v0, p0, LVX;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothManager;

    invoke-static {v0}, LVX;->c(Landroid/bluetooth/BluetoothManager;)LUX;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LVX;->b()LUX;

    move-result-object v0

    return-object v0
.end method
