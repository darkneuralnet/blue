.class public final Lco/bird/android/model/CannotCaptureReports;
.super Lco/bird/android/model/FlightSheetButton;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/FlightSheetActionButton;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0004H\u00c6\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\rH\u00d6\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\rX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0019"
    }
    d2 = {
        "Lco/bird/android/model/CannotCaptureReports;",
        "Lco/bird/android/model/FlightSheetButton;",
        "Lco/bird/android/model/FlightSheetActionButton;",
        "bird",
        "Lco/bird/android/model/persistence/Bird;",
        "(Lco/bird/android/model/persistence/Bird;)V",
        "action",
        "Lco/bird/android/model/constant/FlightSheetAction;",
        "getAction",
        "()Lco/bird/android/model/constant/FlightSheetAction;",
        "getBird",
        "()Lco/bird/android/model/persistence/Bird;",
        "text",
        "",
        "getText",
        "()Ljava/lang/String;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
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
.field private final action:Lco/bird/android/model/constant/FlightSheetAction;

.field private final bird:Lco/bird/android/model/persistence/Bird;

.field private final text:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lco/bird/android/model/persistence/Bird;)V
    .locals 1

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lco/bird/android/model/FlightSheetButton;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lco/bird/android/model/CannotCaptureReports;->bird:Lco/bird/android/model/persistence/Bird;

    const-string p1, ""

    iput-object p1, p0, Lco/bird/android/model/CannotCaptureReports;->text:Ljava/lang/String;

    sget-object p1, Lco/bird/android/model/constant/FlightSheetAction;->CANNOT_CAPTURE_REPORTS:Lco/bird/android/model/constant/FlightSheetAction;

    iput-object p1, p0, Lco/bird/android/model/CannotCaptureReports;->action:Lco/bird/android/model/constant/FlightSheetAction;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/CannotCaptureReports;Lco/bird/android/model/persistence/Bird;ILjava/lang/Object;)Lco/bird/android/model/CannotCaptureReports;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lco/bird/android/model/CannotCaptureReports;->bird:Lco/bird/android/model/persistence/Bird;

    :cond_0
    invoke-virtual {p0, p1}, Lco/bird/android/model/CannotCaptureReports;->copy(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/CannotCaptureReports;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/persistence/Bird;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/CannotCaptureReports;->bird:Lco/bird/android/model/persistence/Bird;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/CannotCaptureReports;
    .locals 1

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/CannotCaptureReports;

    invoke-direct {v0, p1}, Lco/bird/android/model/CannotCaptureReports;-><init>(Lco/bird/android/model/persistence/Bird;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/CannotCaptureReports;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/CannotCaptureReports;

    iget-object v1, p0, Lco/bird/android/model/CannotCaptureReports;->bird:Lco/bird/android/model/persistence/Bird;

    iget-object p1, p1, Lco/bird/android/model/CannotCaptureReports;->bird:Lco/bird/android/model/persistence/Bird;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getAction()Lco/bird/android/model/constant/FlightSheetAction;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/CannotCaptureReports;->action:Lco/bird/android/model/constant/FlightSheetAction;

    return-object v0
.end method

.method public getBird()Lco/bird/android/model/persistence/Bird;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/CannotCaptureReports;->bird:Lco/bird/android/model/persistence/Bird;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/CannotCaptureReports;->text:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/CannotCaptureReports;->bird:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v0}, Lco/bird/android/model/persistence/Bird;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/CannotCaptureReports;->bird:Lco/bird/android/model/persistence/Bird;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CannotCaptureReports(bird="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
