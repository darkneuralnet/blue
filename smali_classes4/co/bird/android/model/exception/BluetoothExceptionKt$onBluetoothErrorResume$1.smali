.class final Lco/bird/android/model/exception/BluetoothExceptionKt$onBluetoothErrorResume$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/model/exception/BluetoothExceptionKt;->onBluetoothErrorResume(Lio/reactivex/Observable;Lco/bird/android/model/exception/BluetoothException$Reason;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lio/reactivex/B<",
        "+TT;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00030\u0003\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "T",
        "",
        "t",
        "Lio/reactivex/B;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Throwable;)Lio/reactivex/B;",
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
.field final synthetic $reason:Lco/bird/android/model/exception/BluetoothException$Reason;


# direct methods
.method public constructor <init>(Lco/bird/android/model/exception/BluetoothException$Reason;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/model/exception/BluetoothExceptionKt$onBluetoothErrorResume$1;->$reason:Lco/bird/android/model/exception/BluetoothException$Reason;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Throwable;)Lio/reactivex/B;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            ")",
            "Lio/reactivex/B<",
            "+TT;>;"
        }
    .end annotation

    const-string v0, "t"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lco/bird/android/model/exception/BluetoothException;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v0, Lco/bird/android/model/exception/BluetoothException;

    iget-object v1, p0, Lco/bird/android/model/exception/BluetoothExceptionKt$onBluetoothErrorResume$1;->$reason:Lco/bird/android/model/exception/BluetoothException$Reason;

    invoke-direct {v0, p1, v1}, Lco/bird/android/model/exception/BluetoothException;-><init>(Ljava/lang/Throwable;Lco/bird/android/model/exception/BluetoothException$Reason;)V

    invoke-static {v0}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lco/bird/android/model/exception/BluetoothExceptionKt$onBluetoothErrorResume$1;->invoke(Ljava/lang/Throwable;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
