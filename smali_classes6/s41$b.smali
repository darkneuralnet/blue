.class public Ls41$b;
.super Lio/reactivex/F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls41;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/F<",
        "Landroid/bluetooth/BluetoothGatt;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Landroid/bluetooth/BluetoothGatt;

.field public final c:Lve5;

.field public final d:Lio/reactivex/E;


# direct methods
.method public constructor <init>(Landroid/bluetooth/BluetoothGatt;Lve5;Lio/reactivex/E;)V
    .locals 0

    invoke-direct {p0}, Lio/reactivex/F;-><init>()V

    iput-object p1, p0, Ls41$b;->b:Landroid/bluetooth/BluetoothGatt;

    iput-object p2, p0, Ls41$b;->c:Lve5;

    iput-object p3, p0, Ls41$b;->d:Lio/reactivex/E;

    return-void
.end method


# virtual methods
.method public X(Lio/reactivex/I;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/I<",
            "-",
            "Landroid/bluetooth/BluetoothGatt;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ls41$b;->c:Lve5;

    invoke-virtual {v0}, Lve5;->d()Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, Ls41$b$b;

    invoke-direct {v1, p0}, Ls41$b$b;-><init>(Ls41$b;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Ls41$b$a;

    invoke-direct {v1, p0}, Ls41$b$a;-><init>(Ls41$b;)V

    invoke-virtual {v0, v1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/reactivex/F;->a(Lio/reactivex/I;)V

    iget-object p1, p0, Ls41$b;->d:Lio/reactivex/E;

    invoke-virtual {p1}, Lio/reactivex/E;->b()Lio/reactivex/E$c;

    move-result-object p1

    new-instance v0, Ls41$b$c;

    invoke-direct {v0, p0}, Ls41$b$c;-><init>(Ls41$b;)V

    invoke-virtual {p1, v0}, Lio/reactivex/E$c;->b(Ljava/lang/Runnable;)Lio/reactivex/disposables/c;

    return-void
.end method
