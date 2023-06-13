.class public final Lre5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lqe5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LGy0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "LAG<",
            "Lke5$a;",
            ">;>;"
        }
    .end annotation
.end field

.field public final d:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lvi0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;LZ94;LZ94;LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;",
            "LZ94<",
            "LGy0;",
            ">;",
            "LZ94<",
            "LAG<",
            "Lke5$a;",
            ">;>;",
            "LZ94<",
            "Lvi0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lre5;->a:LZ94;

    iput-object p2, p0, Lre5;->b:LZ94;

    iput-object p3, p0, Lre5;->c:LZ94;

    iput-object p4, p0, Lre5;->d:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;LZ94;LZ94;)Lre5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;",
            "LZ94<",
            "LGy0;",
            ">;",
            "LZ94<",
            "LAG<",
            "Lke5$a;",
            ">;>;",
            "LZ94<",
            "Lvi0;",
            ">;)",
            "Lre5;"
        }
    .end annotation

    new-instance v0, Lre5;

    invoke-direct {v0, p0, p1, p2, p3}, Lre5;-><init>(LZ94;LZ94;LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(Landroid/bluetooth/BluetoothDevice;LGy0;LAG;Lvi0;)Lqe5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "LGy0;",
            "LAG<",
            "Lke5$a;",
            ">;",
            "Lvi0;",
            ")",
            "Lqe5;"
        }
    .end annotation

    new-instance v0, Lqe5;

    invoke-direct {v0, p0, p1, p2, p3}, Lqe5;-><init>(Landroid/bluetooth/BluetoothDevice;LGy0;LAG;Lvi0;)V

    return-object v0
.end method


# virtual methods
.method public b()Lqe5;
    .locals 4

    iget-object v0, p0, Lre5;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/BluetoothDevice;

    iget-object v1, p0, Lre5;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LGy0;

    iget-object v2, p0, Lre5;->c:LZ94;

    invoke-interface {v2}, LZ94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LAG;

    iget-object v3, p0, Lre5;->d:LZ94;

    invoke-interface {v3}, LZ94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lvi0;

    invoke-static {v0, v1, v2, v3}, Lre5;->c(Landroid/bluetooth/BluetoothDevice;LGy0;LAG;Lvi0;)Lqe5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lre5;->b()Lqe5;

    move-result-object v0

    return-object v0
.end method
