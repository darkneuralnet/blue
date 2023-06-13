.class final Lco/bird/android/model/VehicleConnection$writeData$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/model/VehicleConnection$DefaultImpls;->writeData(Lco/bird/android/model/VehicleConnection;[BLjava/util/UUID;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Long;",
        "Lio/reactivex/K<",
        "+[B>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0004\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/K;",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Long;)Lio/reactivex/K;",
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
.field final synthetic $characteristicUuid:Ljava/util/UUID;

.field final synthetic $data:[B

.field final synthetic $dataIndex:Lkotlin/jvm/internal/Ref$IntRef;

.field final synthetic $writeLength:Lkotlin/jvm/internal/Ref$IntRef;

.field final synthetic this$0:Lco/bird/android/model/VehicleConnection;


# direct methods
.method public constructor <init>(Lco/bird/android/model/VehicleConnection;[BLkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Ljava/util/UUID;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/model/VehicleConnection$writeData$1;->this$0:Lco/bird/android/model/VehicleConnection;

    iput-object p2, p0, Lco/bird/android/model/VehicleConnection$writeData$1;->$data:[B

    iput-object p3, p0, Lco/bird/android/model/VehicleConnection$writeData$1;->$dataIndex:Lkotlin/jvm/internal/Ref$IntRef;

    iput-object p4, p0, Lco/bird/android/model/VehicleConnection$writeData$1;->$writeLength:Lkotlin/jvm/internal/Ref$IntRef;

    iput-object p5, p0, Lco/bird/android/model/VehicleConnection$writeData$1;->$characteristicUuid:Ljava/util/UUID;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Long;)Lio/reactivex/K;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            ")",
            "Lio/reactivex/K<",
            "+[B>;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/model/VehicleConnection$writeData$1;->this$0:Lco/bird/android/model/VehicleConnection;

    iget-object v0, p0, Lco/bird/android/model/VehicleConnection$writeData$1;->$data:[B

    iget-object v1, p0, Lco/bird/android/model/VehicleConnection$writeData$1;->$dataIndex:Lkotlin/jvm/internal/Ref$IntRef;

    iget v1, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget-object v2, p0, Lco/bird/android/model/VehicleConnection$writeData$1;->$writeLength:Lkotlin/jvm/internal/Ref$IntRef;

    iget v2, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static {p1, v0, v1, v2}, Lco/bird/android/model/VehicleConnection$DefaultImpls;->access$subBytes(Lco/bird/android/model/VehicleConnection;[BII)[B

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/model/VehicleConnection$writeData$1;->this$0:Lco/bird/android/model/VehicleConnection;

    invoke-interface {v0}, Lco/bird/android/model/VehicleConnection;->getRxBleConnection()Lke5;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/model/VehicleConnection$writeData$1;->$characteristicUuid:Ljava/util/UUID;

    invoke-interface {v0, v1, p1}, Lke5;->c(Ljava/util/UUID;[B)Lio/reactivex/F;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/model/VehicleConnection$writeData$1;->this$0:Lco/bird/android/model/VehicleConnection;

    invoke-interface {v1, p1}, Lco/bird/android/model/VehicleConnection;->toHex([B)Ljava/util/List;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "writing chunk: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/model/VehicleConnection$writeData$1;->$dataIndex:Lkotlin/jvm/internal/Ref$IntRef;

    iget v1, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget-object v2, p0, Lco/bird/android/model/VehicleConnection$writeData$1;->$writeLength:Lkotlin/jvm/internal/Ref$IntRef;

    iget v3, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/2addr v1, v3

    iput v1, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget-object p1, p0, Lco/bird/android/model/VehicleConnection$writeData$1;->$data:[B

    array-length p1, p1

    sub-int/2addr p1, v1

    const/16 v1, 0x10

    invoke-static {p1, v1}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result p1

    iput p1, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lco/bird/android/model/VehicleConnection$writeData$1;->invoke(Ljava/lang/Long;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
