.class public final Lno/nordicsemi/android/ble/exception/RequestFailedException;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field public final b:Lno/nordicsemi/android/ble/u0;

.field public final c:I


# direct methods
.method public constructor <init>(Lno/nordicsemi/android/ble/u0;I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Request failed with status "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lno/nordicsemi/android/ble/exception/RequestFailedException;->b:Lno/nordicsemi/android/ble/u0;

    iput p2, p0, Lno/nordicsemi/android/ble/exception/RequestFailedException;->c:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lno/nordicsemi/android/ble/exception/RequestFailedException;->c:I

    return v0
.end method
