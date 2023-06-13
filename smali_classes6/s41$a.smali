.class public Ls41$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/I;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls41;->b(Lio/reactivex/y;Ldd4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/I<",
        "Landroid/bluetooth/BluetoothGatt;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lio/reactivex/y;

.field public final synthetic c:Ldd4;

.field public final synthetic d:Ls41;


# direct methods
.method public constructor <init>(Ls41;Lio/reactivex/y;Ldd4;)V
    .locals 0

    iput-object p1, p0, Ls41$a;->d:Ls41;

    iput-object p2, p0, Ls41$a;->b:Lio/reactivex/y;

    iput-object p3, p0, Ls41$a;->c:Ldd4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothGatt;)V
    .locals 2

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->close()V

    iget-object p1, p0, Ls41$a;->d:Ls41;

    iget-object v0, p0, Ls41$a;->b:Lio/reactivex/y;

    iget-object v1, p0, Ls41$a;->c:Ldd4;

    invoke-virtual {p1, v0, v1}, Ls41;->d(Lio/reactivex/j;Ldd4;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Disconnect operation has been executed but finished with an error - considering disconnected."

    invoke-static {p1, v1, v0}, Lye5;->s(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Ls41$a;->d:Ls41;

    iget-object v0, p0, Ls41$a;->b:Lio/reactivex/y;

    iget-object v1, p0, Ls41$a;->c:Ldd4;

    invoke-virtual {p1, v0, v1}, Ls41;->d(Lio/reactivex/j;Ldd4;)V

    return-void
.end method

.method public onSubscribe(Lio/reactivex/disposables/c;)V
    .locals 0

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/bluetooth/BluetoothGatt;

    invoke-virtual {p0, p1}, Ls41$a;->a(Landroid/bluetooth/BluetoothGatt;)V

    return-void
.end method
