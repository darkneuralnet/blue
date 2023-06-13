.class public final Lco/bird/android/manager/bluetooth/internal/a$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/bluetooth/internal/a;->c0(Lco/bird/android/model/Vehicle;Lkotlin/jvm/functions/Function1;Lco/bird/android/manager/bluetooth/internal/a$c;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/H<",
        "Lco/bird/android/model/Vehicle;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lio/reactivex/H;",
        "Lco/bird/android/model/Vehicle;",
        "emitter",
        "",
        "invoke",
        "(Lio/reactivex/H;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lco/bird/android/model/Vehicle;

.field public final synthetic j:Lco/bird/android/manager/bluetooth/internal/a;

.field public final synthetic k:Lco/bird/android/manager/bluetooth/internal/a$c;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/manager/bluetooth/internal/a$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/Vehicle;",
            "Lco/bird/android/manager/bluetooth/internal/a;",
            "Lco/bird/android/manager/bluetooth/internal/a$c;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/a$h;->g:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lco/bird/android/manager/bluetooth/internal/a$h;->h:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/manager/bluetooth/internal/a$h;->i:Lco/bird/android/model/Vehicle;

    iput-object p4, p0, Lco/bird/android/manager/bluetooth/internal/a$h;->j:Lco/bird/android/manager/bluetooth/internal/a;

    iput-object p5, p0, Lco/bird/android/manager/bluetooth/internal/a$h;->k:Lco/bird/android/manager/bluetooth/internal/a$c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/a$c;Lio/reactivex/H;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lco/bird/android/manager/bluetooth/internal/a$h;->c(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/a$c;Lio/reactivex/H;Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic b(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/a$c;Lio/reactivex/H;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lco/bird/android/manager/bluetooth/internal/a$h;->d(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/a$c;Lio/reactivex/H;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static final c(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/a$c;Lio/reactivex/H;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 6

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$loggingInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$emitter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lco/bird/android/manager/bluetooth/internal/a$c;->a()Ljava/lang/String;

    move-result-object p4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " - fail called, status: "

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p0, p1, p4}, Lco/bird/android/manager/bluetooth/internal/a;->access$trace(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    new-instance p0, Lco/bird/android/manager/bluetooth/internal/VehicleException;

    sget-object v1, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->f:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const/4 v2, 0x0

    invoke-virtual {p2}, Lco/bird/android/manager/bluetooth/internal/a$c;->a()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Failed to write "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " status: "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/manager/bluetooth/internal/VehicleException;-><init>(Lco/bird/android/manager/bluetooth/internal/VehicleException$a;Lco/bird/android/manager/bluetooth/internal/c;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p3, p0}, Lio/reactivex/H;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final d(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/a$c;Lio/reactivex/H;Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$loggingInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$emitter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lco/bird/android/manager/bluetooth/internal/a$c;->a()Ljava/lang/String;

    move-result-object p2

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " - write completed"

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p1, p2}, Lco/bird/android/manager/bluetooth/internal/a;->access$trace(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    invoke-interface {p3, p1}, Lio/reactivex/H;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/H;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/bluetooth/internal/a$h;->invoke(Lio/reactivex/H;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/reactivex/H;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/H<",
            "Lco/bird/android/model/Vehicle;",
            ">;)V"
        }
    .end annotation

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/a$h;->g:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lco/bird/android/manager/bluetooth/internal/a$h;->h:Ljava/lang/String;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/manager/bluetooth/internal/a$h;->i:Lco/bird/android/model/Vehicle;

    invoke-virtual {v1}, Lco/bird/android/model/Vehicle;->getAuthenticated()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lco/bird/android/manager/bluetooth/internal/a$h;->j:Lco/bird/android/manager/bluetooth/internal/a;

    iget-object v2, p0, Lco/bird/android/manager/bluetooth/internal/a$h;->i:Lco/bird/android/model/Vehicle;

    iget-object v3, p0, Lco/bird/android/manager/bluetooth/internal/a$h;->k:Lco/bird/android/manager/bluetooth/internal/a$c;

    invoke-virtual {v3}, Lco/bird/android/manager/bluetooth/internal/a$c;->a()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " - writing command"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lco/bird/android/manager/bluetooth/internal/a;->access$trace(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/manager/bluetooth/internal/a$h;->j:Lco/bird/android/manager/bluetooth/internal/a;

    invoke-static {v1}, Lco/bird/android/manager/bluetooth/internal/a;->access$getCommandCharacteristic$p(Lco/bird/android/manager/bluetooth/internal/a;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object v2

    sget-object v3, Lkotlin/text/Charsets;->US_ASCII:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v3, "this as java.lang.String).getBytes(charset)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2, v0}, Lco/bird/android/manager/bluetooth/internal/a;->access$writeCharacteristic(Lco/bird/android/manager/bluetooth/internal/a;Landroid/bluetooth/BluetoothGattCharacteristic;[B)Lno/nordicsemi/android/ble/D0;

    move-result-object v0

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/D0;->W()Lno/nordicsemi/android/ble/D0;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/manager/bluetooth/internal/a$h;->j:Lco/bird/android/manager/bluetooth/internal/a;

    iget-object v2, p0, Lco/bird/android/manager/bluetooth/internal/a$h;->i:Lco/bird/android/model/Vehicle;

    iget-object v3, p0, Lco/bird/android/manager/bluetooth/internal/a$h;->k:Lco/bird/android/manager/bluetooth/internal/a$c;

    new-instance v4, LDv;

    invoke-direct {v4, v1, v2, v3, p1}, LDv;-><init>(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/a$c;Lio/reactivex/H;)V

    invoke-virtual {v0, v4}, Lno/nordicsemi/android/ble/D0;->M(LDj1;)Lno/nordicsemi/android/ble/D0;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/manager/bluetooth/internal/a$h;->j:Lco/bird/android/manager/bluetooth/internal/a;

    iget-object v2, p0, Lco/bird/android/manager/bluetooth/internal/a$h;->i:Lco/bird/android/model/Vehicle;

    iget-object v3, p0, Lco/bird/android/manager/bluetooth/internal/a$h;->k:Lco/bird/android/manager/bluetooth/internal/a$c;

    new-instance v4, LEv;

    invoke-direct {v4, v1, v2, v3, p1}, LEv;-><init>(Lco/bird/android/manager/bluetooth/internal/a;Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/a$c;Lio/reactivex/H;)V

    invoke-virtual {v0, v4}, Lno/nordicsemi/android/ble/D0;->L(LyT5;)Lno/nordicsemi/android/ble/D0;

    move-result-object p1

    invoke-virtual {p1}, Lno/nordicsemi/android/ble/u0;->k()V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
