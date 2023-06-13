.class public Lay0$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lay0;->d()Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Landroid/bluetooth/BluetoothGatt;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lay0;


# direct methods
.method public constructor <init>(Lay0;)V
    .locals 0

    iput-object p1, p0, Lay0$e;->b:Lay0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/bluetooth/BluetoothGatt;
    .locals 2

    iget-object v0, p0, Lay0$e;->b:Lay0;

    iget-object v0, v0, Lay0;->h:Lxy0;

    sget-object v1, Lke5$a;->d:Lke5$a;

    invoke-interface {v0, v1}, Lxy0;->a(Lke5$a;)V

    iget-object v0, p0, Lay0$e;->b:Lay0;

    iget-object v0, v0, Lay0;->e:LkX;

    invoke-virtual {v0}, LkX;->a()Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lay0$e;->a()Landroid/bluetooth/BluetoothGatt;

    move-result-object v0

    return-object v0
.end method
