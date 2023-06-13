.class public final Lgi3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lfi3;",
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
            "LPx2;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LL46;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lio/reactivex/E;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lio/reactivex/E;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LSr4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;LZ94;LZ94;LZ94;LZ94;LZ94;LZ94;)V
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
            "LPx2;",
            ">;",
            "LZ94<",
            "LL46;",
            ">;",
            "LZ94<",
            "Lio/reactivex/E;",
            ">;",
            "LZ94<",
            "Lio/reactivex/E;",
            ">;",
            "LZ94<",
            "LSr4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgi3;->a:LZ94;

    iput-object p2, p0, Lgi3;->b:LZ94;

    iput-object p3, p0, Lgi3;->c:LZ94;

    iput-object p4, p0, Lgi3;->d:LZ94;

    iput-object p5, p0, Lgi3;->e:LZ94;

    iput-object p6, p0, Lgi3;->f:LZ94;

    iput-object p7, p0, Lgi3;->g:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;LZ94;LZ94;LZ94;LZ94;LZ94;)Lgi3;
    .locals 9
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
            "LPx2;",
            ">;",
            "LZ94<",
            "LL46;",
            ">;",
            "LZ94<",
            "Lio/reactivex/E;",
            ">;",
            "LZ94<",
            "Lio/reactivex/E;",
            ">;",
            "LZ94<",
            "LSr4;",
            ">;)",
            "Lgi3;"
        }
    .end annotation

    new-instance v8, Lgi3;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lgi3;-><init>(LZ94;LZ94;LZ94;LZ94;LZ94;LZ94;LZ94;)V

    return-object v8
.end method

.method public static c(Lve5;Landroid/bluetooth/BluetoothGatt;LPx2;LL46;Lio/reactivex/E;Lio/reactivex/E;LZ94;)Lfi3;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lve5;",
            "Landroid/bluetooth/BluetoothGatt;",
            "LPx2;",
            "LL46;",
            "Lio/reactivex/E;",
            "Lio/reactivex/E;",
            "LZ94<",
            "LSr4;",
            ">;)",
            "Lfi3;"
        }
    .end annotation

    new-instance v8, Lfi3;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lfi3;-><init>(Lve5;Landroid/bluetooth/BluetoothGatt;LPx2;LL46;Lio/reactivex/E;Lio/reactivex/E;LZ94;)V

    return-object v8
.end method


# virtual methods
.method public b()Lfi3;
    .locals 8

    iget-object v0, p0, Lgi3;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lve5;

    iget-object v0, p0, Lgi3;->b:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/bluetooth/BluetoothGatt;

    iget-object v0, p0, Lgi3;->c:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LPx2;

    iget-object v0, p0, Lgi3;->d:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LL46;

    iget-object v0, p0, Lgi3;->e:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lio/reactivex/E;

    iget-object v0, p0, Lgi3;->f:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lio/reactivex/E;

    iget-object v7, p0, Lgi3;->g:LZ94;

    invoke-static/range {v1 .. v7}, Lgi3;->c(Lve5;Landroid/bluetooth/BluetoothGatt;LPx2;LL46;Lio/reactivex/E;Lio/reactivex/E;LZ94;)Lfi3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgi3;->b()Lfi3;

    move-result-object v0

    return-object v0
.end method
