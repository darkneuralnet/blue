.class public final Lky0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Landroid/bluetooth/BluetoothGatt;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LkX;",
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
            "LkX;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lky0;->a:LZ94;

    return-void
.end method

.method public static a(LZ94;)Lky0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "LkX;",
            ">;)",
            "Lky0;"
        }
    .end annotation

    new-instance v0, Lky0;

    invoke-direct {v0, p0}, Lky0;-><init>(LZ94;)V

    return-object v0
.end method

.method public static c(LkX;)Landroid/bluetooth/BluetoothGatt;
    .locals 0

    invoke-static {p0}, Lhy0;->c(LkX;)Landroid/bluetooth/BluetoothGatt;

    move-result-object p0

    invoke-static {p0}, LyZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/bluetooth/BluetoothGatt;

    return-object p0
.end method


# virtual methods
.method public b()Landroid/bluetooth/BluetoothGatt;
    .locals 1

    iget-object v0, p0, Lky0;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LkX;

    invoke-static {v0}, Lky0;->c(LkX;)Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lky0;->b()Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    return-object v0
.end method
