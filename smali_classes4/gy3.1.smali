.class public final Lgy3;
.super LEs5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LEs5<",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\u0005\u001a\u00020\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u000b"
    }
    d2 = {
        "Lgy3;",
        "LEs5;",
        "",
        "Landroid/hardware/SensorEvent;",
        "event",
        "f",
        "(Landroid/hardware/SensorEvent;)Ljava/lang/Float;",
        "Landroid/hardware/SensorManager;",
        "sensorManager",
        "<init>",
        "(Landroid/hardware/SensorManager;)V",
        "co.bird.android.manager.sensor"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/hardware/SensorManager;)V
    .locals 3

    const-string v0, "sensorManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/hardware/Sensor;

    const/4 v1, 0x5

    invoke-virtual {p1, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v1

    const-string v2, "sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-direct {p0, p1, v0}, LEs5;-><init>(Landroid/hardware/SensorManager;[Landroid/hardware/Sensor;)V

    return-void
.end method


# virtual methods
.method public f(Landroid/hardware/SensorEvent;)Ljava/lang/Float;
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lkotlin/collections/ArraysKt;->getOrNull([FI)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic transformEvent(Landroid/hardware/SensorEvent;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lgy3;->f(Landroid/hardware/SensorEvent;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
