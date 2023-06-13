.class public final Lco/bird/android/model/exception/BluetoothException;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/exception/BluetoothException$Reason;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\nB\u0019\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lco/bird/android/model/exception/BluetoothException;",
        "Ljava/lang/RuntimeException;",
        "Lkotlin/RuntimeException;",
        "cause",
        "",
        "reason",
        "Lco/bird/android/model/exception/BluetoothException$Reason;",
        "(Ljava/lang/Throwable;Lco/bird/android/model/exception/BluetoothException$Reason;)V",
        "getReason",
        "()Lco/bird/android/model/exception/BluetoothException$Reason;",
        "Reason",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final reason:Lco/bird/android/model/exception/BluetoothException$Reason;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;Lco/bird/android/model/exception/BluetoothException$Reason;)V
    .locals 1

    const-string v0, "reason"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    iput-object p2, p0, Lco/bird/android/model/exception/BluetoothException;->reason:Lco/bird/android/model/exception/BluetoothException$Reason;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Throwable;Lco/bird/android/model/exception/BluetoothException$Reason;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lco/bird/android/model/exception/BluetoothException;-><init>(Ljava/lang/Throwable;Lco/bird/android/model/exception/BluetoothException$Reason;)V

    return-void
.end method


# virtual methods
.method public final getReason()Lco/bird/android/model/exception/BluetoothException$Reason;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/exception/BluetoothException;->reason:Lco/bird/android/model/exception/BluetoothException$Reason;

    return-object v0
.end method
