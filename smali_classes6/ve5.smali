.class public Lve5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lve5$c;
    }
.end annotation


# instance fields
.field public final a:Lio/reactivex/E;

.field public final b:LkX;

.field public final c:Lv41;

.field public final d:LsY2;

.field public final e:Lma4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma4<",
            "Lke5$a;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lve5$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lve5$c<",
            "Lue5;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lve5$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lve5$c<",
            "Lt70<",
            "Ljava/util/UUID;",
            ">;>;"
        }
    .end annotation
.end field

.field public final h:Lve5$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lve5$c<",
            "Lt70<",
            "Ljava/util/UUID;",
            ">;>;"
        }
    .end annotation
.end field

.field public final i:LZt4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZt4<",
            "Lci0;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Lve5$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lve5$c<",
            "Lt70<",
            "Landroid/bluetooth/BluetoothGattDescriptor;",
            ">;>;"
        }
    .end annotation
.end field

.field public final k:Lve5$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lve5$c<",
            "Lt70<",
            "Landroid/bluetooth/BluetoothGattDescriptor;",
            ">;>;"
        }
    .end annotation
.end field

.field public final l:Lve5$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lve5$c<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final m:Lve5$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lve5$c<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Lve5$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lve5$c<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Lio/reactivex/functions/o;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/o<",
            "Lcom/polidea/rxandroidble2/exceptions/BleGattException;",
            "Lio/reactivex/Observable<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final p:Landroid/bluetooth/BluetoothGattCallback;


# direct methods
.method public constructor <init>(Lio/reactivex/E;LkX;Lv41;LsY2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    iput-object v0, p0, Lve5;->e:Lma4;

    new-instance v0, Lve5$c;

    invoke-direct {v0}, Lve5$c;-><init>()V

    iput-object v0, p0, Lve5;->f:Lve5$c;

    new-instance v0, Lve5$c;

    invoke-direct {v0}, Lve5$c;-><init>()V

    iput-object v0, p0, Lve5;->g:Lve5$c;

    new-instance v0, Lve5$c;

    invoke-direct {v0}, Lve5$c;-><init>()V

    iput-object v0, p0, Lve5;->h:Lve5$c;

    invoke-static {}, Lma4;->g()Lma4;

    move-result-object v0

    invoke-virtual {v0}, LZt4;->c()LZt4;

    move-result-object v0

    iput-object v0, p0, Lve5;->i:LZt4;

    new-instance v0, Lve5$c;

    invoke-direct {v0}, Lve5$c;-><init>()V

    iput-object v0, p0, Lve5;->j:Lve5$c;

    new-instance v0, Lve5$c;

    invoke-direct {v0}, Lve5$c;-><init>()V

    iput-object v0, p0, Lve5;->k:Lve5$c;

    new-instance v0, Lve5$c;

    invoke-direct {v0}, Lve5$c;-><init>()V

    iput-object v0, p0, Lve5;->l:Lve5$c;

    new-instance v0, Lve5$c;

    invoke-direct {v0}, Lve5$c;-><init>()V

    iput-object v0, p0, Lve5;->m:Lve5$c;

    new-instance v0, Lve5$c;

    invoke-direct {v0}, Lve5$c;-><init>()V

    iput-object v0, p0, Lve5;->n:Lve5$c;

    new-instance v0, Lve5$a;

    invoke-direct {v0, p0}, Lve5$a;-><init>(Lve5;)V

    iput-object v0, p0, Lve5;->o:Lio/reactivex/functions/o;

    new-instance v0, Lve5$b;

    invoke-direct {v0, p0}, Lve5$b;-><init>(Lve5;)V

    iput-object v0, p0, Lve5;->p:Landroid/bluetooth/BluetoothGattCallback;

    iput-object p1, p0, Lve5;->a:Lio/reactivex/E;

    iput-object p2, p0, Lve5;->b:LkX;

    iput-object p3, p0, Lve5;->c:Lv41;

    iput-object p4, p0, Lve5;->d:LsY2;

    return-void
.end method

.method public static i(I)Z
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static j(I)Lke5$a;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    sget-object p0, Lke5$a;->e:Lke5$a;

    return-object p0

    :cond_0
    sget-object p0, Lke5$a;->f:Lke5$a;

    return-object p0

    :cond_1
    sget-object p0, Lke5$a;->d:Lke5$a;

    return-object p0

    :cond_2
    sget-object p0, Lke5$a;->c:Lke5$a;

    return-object p0
.end method

.method public static l(Lve5$c;Landroid/bluetooth/BluetoothGatt;ILuU;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lve5$c<",
            "*>;",
            "Landroid/bluetooth/BluetoothGatt;",
            "I",
            "LuU;",
            ")Z"
        }
    .end annotation

    invoke-static {p2}, Lve5;->i(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/polidea/rxandroidble2/exceptions/BleGattException;

    invoke-direct {v0, p1, p2, p3}, Lcom/polidea/rxandroidble2/exceptions/BleGattException;-><init>(Landroid/bluetooth/BluetoothGatt;ILuU;)V

    invoke-static {p0, v0}, Lve5;->o(Lve5$c;Lcom/polidea/rxandroidble2/exceptions/BleGattException;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static m(Lve5$c;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;ILuU;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lve5$c<",
            "*>;",
            "Landroid/bluetooth/BluetoothGatt;",
            "Landroid/bluetooth/BluetoothGattCharacteristic;",
            "I",
            "LuU;",
            ")Z"
        }
    .end annotation

    invoke-static {p3}, Lve5;->i(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/polidea/rxandroidble2/exceptions/BleGattCharacteristicException;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/polidea/rxandroidble2/exceptions/BleGattCharacteristicException;-><init>(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;ILuU;)V

    invoke-static {p0, v0}, Lve5;->o(Lve5$c;Lcom/polidea/rxandroidble2/exceptions/BleGattException;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static n(Lve5$c;Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;ILuU;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lve5$c<",
            "*>;",
            "Landroid/bluetooth/BluetoothGatt;",
            "Landroid/bluetooth/BluetoothGattDescriptor;",
            "I",
            "LuU;",
            ")Z"
        }
    .end annotation

    invoke-static {p3}, Lve5;->i(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/polidea/rxandroidble2/exceptions/BleGattDescriptorException;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/polidea/rxandroidble2/exceptions/BleGattDescriptorException;-><init>(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;ILuU;)V

    invoke-static {p0, v0}, Lve5;->o(Lve5$c;Lcom/polidea/rxandroidble2/exceptions/BleGattException;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static o(Lve5$c;Lcom/polidea/rxandroidble2/exceptions/BleGattException;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lve5$c<",
            "*>;",
            "Lcom/polidea/rxandroidble2/exceptions/BleGattException;",
            ")Z"
        }
    .end annotation

    iget-object p0, p0, Lve5$c;->b:Lma4;

    invoke-virtual {p0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public a()Landroid/bluetooth/BluetoothGattCallback;
    .locals 1

    iget-object v0, p0, Lve5;->p:Landroid/bluetooth/BluetoothGattCallback;

    return-object v0
.end method

.method public b()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lci0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lve5;->c:Lv41;

    invoke-virtual {v0}, Lv41;->b()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, Lve5;->i:LZt4;

    invoke-static {v0, v1}, Lio/reactivex/Observable;->merge(Lio/reactivex/B;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, Lve5;->a:Lio/reactivex/E;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Lio/reactivex/Observable;->delay(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public c()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lt70<",
            "Ljava/util/UUID;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lve5;->h:Lve5$c;

    invoke-virtual {p0, v0}, Lve5;->p(Lve5$c;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, Lve5;->a:Lio/reactivex/E;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Lio/reactivex/Observable;->delay(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public d()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lke5$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lve5;->e:Lma4;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, Lve5;->a:Lio/reactivex/E;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Lio/reactivex/Observable;->delay(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public e()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lt70<",
            "Landroid/bluetooth/BluetoothGattDescriptor;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lve5;->k:Lve5$c;

    invoke-virtual {p0, v0}, Lve5;->p(Lve5$c;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, Lve5;->a:Lio/reactivex/E;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Lio/reactivex/Observable;->delay(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public f()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lve5;->m:Lve5$c;

    invoke-virtual {p0, v0}, Lve5;->p(Lve5$c;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, Lve5;->a:Lio/reactivex/E;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Lio/reactivex/Observable;->delay(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public g()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lve5;->l:Lve5$c;

    invoke-virtual {p0, v0}, Lve5;->p(Lve5$c;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, Lve5;->a:Lio/reactivex/E;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Lio/reactivex/Observable;->delay(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public h()Lio/reactivex/Observable;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lue5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lve5;->f:Lve5$c;

    invoke-virtual {p0, v0}, Lve5;->p(Lve5$c;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, Lve5;->a:Lio/reactivex/E;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Lio/reactivex/Observable;->delay(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public k()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lve5;->c:Lv41;

    invoke-virtual {v0}, Lv41;->b()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final p(Lve5$c;)Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lve5$c<",
            "TT;>;)",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lve5;->c:Lv41;

    invoke-virtual {v0}, Lv41;->b()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p1, Lve5$c;->a:Lma4;

    iget-object p1, p1, Lve5$c;->b:Lma4;

    iget-object v2, p0, Lve5;->o:Lio/reactivex/functions/o;

    invoke-virtual {p1, v2}, Lio/reactivex/Observable;->flatMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lio/reactivex/Observable;->merge(Lio/reactivex/B;Lio/reactivex/B;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
