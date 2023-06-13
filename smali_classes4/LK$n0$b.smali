.class public final LLK$n0$b;
.super Ljj5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLK$n0;->b(Lio/reactivex/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0016\u0010\u000c\u001a\u00020\u00042\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00070\nH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a8\u0006\u000e"
    }
    d2 = {
        "LK$n0$b",
        "Ljj5;",
        "",
        "errorCode",
        "",
        "b",
        "callbackType",
        "Lno/nordicsemi/android/support/v18/scanner/ScanResult;",
        "result",
        "c",
        "",
        "results",
        "a",
        "d",
        "bluetooth_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBirdBluetoothManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdBluetoothManagerImpl.kt\nco/bird/android/manager/bluetooth/BirdBluetoothManagerImpl$scanBatch$1$scanCallback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,969:1\n1855#2,2:970\n*S KotlinDebug\n*F\n+ 1 BirdBluetoothManagerImpl.kt\nco/bird/android/manager/bluetooth/BirdBluetoothManagerImpl$scanBatch$1$scanCallback$1\n*L\n477#1:970,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:Lio/reactivex/y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/y<",
            "Ljava/util/List<",
            "Lco/bird/android/model/Vehicle;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic b:LLK;

.field public final synthetic c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/reactivex/y;LLK;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "Ljava/util/List<",
            "Lco/bird/android/model/Vehicle;",
            ">;>;",
            "LLK;",
            "Ljava/util/Set<",
            "Lco/bird/android/model/Vehicle;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LLK$n0$b;->a:Lio/reactivex/y;

    iput-object p2, p0, LLK$n0$b;->b:LLK;

    iput-object p3, p0, LLK$n0$b;->c:Ljava/util/Set;

    invoke-direct {p0}, Ljj5;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lno/nordicsemi/android/support/v18/scanner/ScanResult;",
            ">;)V"
        }
    .end annotation

    const-string v0, "results"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Ljj5;->a(Ljava/util/List;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lno/nordicsemi/android/support/v18/scanner/ScanResult;

    invoke-virtual {p0, v0}, LLK$n0$b;->d(Lno/nordicsemi/android/support/v18/scanner/ScanResult;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 4

    invoke-super {p0, p1}, Ljj5;->b(I)V

    iget-object p1, p0, LLK$n0$b;->a:Lio/reactivex/y;

    new-instance v0, Lco/bird/android/model/exception/BluetoothException;

    sget-object v1, Lco/bird/android/model/exception/BluetoothException$Reason;->SCAN:Lco/bird/android/model/exception/BluetoothException$Reason;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2, v3}, Lco/bird/android/model/exception/BluetoothException;-><init>(Ljava/lang/Throwable;Lco/bird/android/model/exception/BluetoothException$Reason;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lio/reactivex/j;->onError(Ljava/lang/Throwable;)V

    iget-object p1, p0, LLK$n0$b;->b:LLK;

    invoke-virtual {p1, p0}, LLK;->H2(Ljj5;)V

    return-void
.end method

.method public c(ILno/nordicsemi/android/support/v18/scanner/ScanResult;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Ljj5;->c(ILno/nordicsemi/android/support/v18/scanner/ScanResult;)V

    invoke-virtual {p0, p2}, LLK$n0$b;->d(Lno/nordicsemi/android/support/v18/scanner/ScanResult;)V

    return-void
.end method

.method public final d(Lno/nordicsemi/android/support/v18/scanner/ScanResult;)V
    .locals 3

    iget-object v0, p0, LLK$n0$b;->b:LLK;

    invoke-static {v0}, LLK;->access$getScheduler$p(LLK;)LaY;

    move-result-object v0

    new-instance v1, LLK$n0$b$a;

    iget-object v2, p0, LLK$n0$b;->c:Ljava/util/Set;

    invoke-direct {v1, p1, v2}, LLK$n0$b$a;-><init>(Lno/nordicsemi/android/support/v18/scanner/ScanResult;Ljava/util/Set;)V

    invoke-interface {v0, v1}, LaY;->b(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
