.class public Lx62;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/o<",
        "Lxe5;",
        "LTk5;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lse5;


# direct methods
.method public constructor <init>(Lse5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx62;->b:Lse5;

    return-void
.end method


# virtual methods
.method public a(Lxe5;)LTk5;
    .locals 9

    new-instance v8, LTk5;

    iget-object v0, p0, Lx62;->b:Lse5;

    invoke-virtual {p1}, Lxe5;->a()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lse5;->a(Ljava/lang/String;)Lne5;

    move-result-object v1

    invoke-virtual {p1}, Lxe5;->b()I

    move-result v2

    invoke-virtual {p1}, Lxe5;->d()J

    move-result-wide v3

    invoke-virtual {p1}, Lxe5;->c()Lkj5;

    move-result-object v5

    invoke-virtual {p1}, Lxe5;->getScanRecord()LCk5;

    move-result-object v6

    invoke-virtual {p1}, Lxe5;->e()LY92;

    move-result-object v7

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LTk5;-><init>(Lne5;IJLkj5;LCk5;LY92;)V

    return-object v8
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, Lxe5;

    invoke-virtual {p0, p1}, Lx62;->a(Lxe5;)LTk5;

    move-result-object p1

    return-object p1
.end method
