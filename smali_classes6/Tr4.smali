.class public final LTr4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "LSr4;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lve5;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Landroid/bluetooth/BluetoothGatt;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LL46;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;LZ94;LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lve5;",
            ">;",
            "LZ94<",
            "Landroid/bluetooth/BluetoothGatt;",
            ">;",
            "LZ94<",
            "LL46;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTr4;->a:LZ94;

    iput-object p2, p0, LTr4;->b:LZ94;

    iput-object p3, p0, LTr4;->c:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;LZ94;)LTr4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Lve5;",
            ">;",
            "LZ94<",
            "Landroid/bluetooth/BluetoothGatt;",
            ">;",
            "LZ94<",
            "LL46;",
            ">;)",
            "LTr4;"
        }
    .end annotation

    new-instance v0, LTr4;

    invoke-direct {v0, p0, p1, p2}, LTr4;-><init>(LZ94;LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(Lve5;Landroid/bluetooth/BluetoothGatt;LL46;)LSr4;
    .locals 1

    new-instance v0, LSr4;

    invoke-direct {v0, p0, p1, p2}, LSr4;-><init>(Lve5;Landroid/bluetooth/BluetoothGatt;LL46;)V

    return-object v0
.end method


# virtual methods
.method public b()LSr4;
    .locals 3

    iget-object v0, p0, LTr4;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lve5;

    iget-object v1, p0, LTr4;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothGatt;

    iget-object v2, p0, LTr4;->c:LZ94;

    invoke-interface {v2}, LZ94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LL46;

    invoke-static {v0, v1, v2}, LTr4;->c(Lve5;Landroid/bluetooth/BluetoothGatt;LL46;)LSr4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LTr4;->b()LSr4;

    move-result-object v0

    return-object v0
.end method
