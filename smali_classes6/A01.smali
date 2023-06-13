.class public LA01;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lqy0;

.field public final b:Lei3;


# direct methods
.method public constructor <init>(Lqy0;Lei3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA01;->a:Lqy0;

    iput-object p2, p0, LA01;->b:Lei3;

    return-void
.end method


# virtual methods
.method public a(Landroid/bluetooth/BluetoothGattDescriptor;[B)Lio/reactivex/c;
    .locals 2

    iget-object v0, p0, LA01;->a:Lqy0;

    iget-object v1, p0, LA01;->b:Lei3;

    invoke-interface {v1, p1, p2}, Lei3;->a(Landroid/bluetooth/BluetoothGattDescriptor;[B)Lz01;

    move-result-object p1

    invoke-interface {v0, p1}, LKk0;->a(LYh3;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method
