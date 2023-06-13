.class public Ls41$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls41$b;->X(Lio/reactivex/I;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/o<",
        "Lke5$a;",
        "Landroid/bluetooth/BluetoothGatt;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Ls41$b;


# direct methods
.method public constructor <init>(Ls41$b;)V
    .locals 0

    iput-object p1, p0, Ls41$b$a;->b:Ls41$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lke5$a;)Landroid/bluetooth/BluetoothGatt;
    .locals 0

    iget-object p1, p0, Ls41$b$a;->b:Ls41$b;

    iget-object p1, p1, Ls41$b;->b:Landroid/bluetooth/BluetoothGatt;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    check-cast p1, Lke5$a;

    invoke-virtual {p0, p1}, Ls41$b$a;->a(Lke5$a;)Landroid/bluetooth/BluetoothGatt;

    move-result-object p1

    return-object p1
.end method
