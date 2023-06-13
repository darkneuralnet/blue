.class public Lay0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/L;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lay0;->g()Lio/reactivex/L;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/L<",
        "Landroid/bluetooth/BluetoothGatt;",
        "Landroid/bluetooth/BluetoothGatt;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lay0;


# direct methods
.method public constructor <init>(Lay0;)V
    .locals 0

    iput-object p1, p0, Lay0$b;->a:Lay0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/reactivex/F;)Lio/reactivex/F;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/F<",
            "Landroid/bluetooth/BluetoothGatt;",
            ">;)",
            "Lio/reactivex/F<",
            "Landroid/bluetooth/BluetoothGatt;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lay0$b;->a:Lay0;

    iget-boolean v1, v0, Lay0;->g:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lay0;->f:LL46;

    iget-wide v3, v1, LL46;->a:J

    iget-object v5, v1, LL46;->b:Ljava/util/concurrent/TimeUnit;

    iget-object v6, v1, LL46;->c:Lio/reactivex/E;

    invoke-virtual {v0}, Lay0;->f()Lio/reactivex/F;

    move-result-object v7

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Lio/reactivex/F;->c0(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic c(Lio/reactivex/F;)Lio/reactivex/K;
    .locals 0

    invoke-virtual {p0, p1}, Lay0$b;->a(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method
