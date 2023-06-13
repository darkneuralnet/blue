.class public final LZD1;
.super LEs5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LEs5<",
        "Lco/bird/android/model/GravityVector;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0012\u0010\u0005\u001a\u00020\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016\u00a8\u0006\n"
    }
    d2 = {
        "LZD1;",
        "LEs5;",
        "Lco/bird/android/model/GravityVector;",
        "Landroid/hardware/SensorEvent;",
        "event",
        "f",
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

    const/16 v1, 0x9

    invoke-virtual {p1, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v1

    const-string v2, "sensorManager.getDefault\u2026nsor(Sensor.TYPE_GRAVITY)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-direct {p0, p1, v0}, LEs5;-><init>(Landroid/hardware/SensorManager;[Landroid/hardware/Sensor;)V

    return-void
.end method


# virtual methods
.method public f(Landroid/hardware/SensorEvent;)Lco/bird/android/model/GravityVector;
    .locals 5

    new-instance v0, Lco/bird/android/model/GravityVector;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-object v2, p1, Landroid/hardware/SensorEvent;->values:[F

    if-eqz v2, :cond_0

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lkotlin/collections/ArraysKt;->getOrNull([FI)Ljava/lang/Float;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eqz p1, :cond_1

    iget-object v3, p1, Landroid/hardware/SensorEvent;->values:[F

    if-eqz v3, :cond_1

    const/4 v4, 0x1

    invoke-static {v3, v4}, Lkotlin/collections/ArraysKt;->getOrNull([FI)Ljava/lang/Float;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    if-eqz p1, :cond_2

    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    if-eqz p1, :cond_2

    const/4 v4, 0x2

    invoke-static {p1, v4}, Lkotlin/collections/ArraysKt;->getOrNull([FI)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    :cond_2
    invoke-direct {v0, v2, v3, v1}, Lco/bird/android/model/GravityVector;-><init>(FFF)V

    return-object v0
.end method

.method public bridge synthetic transformEvent(Landroid/hardware/SensorEvent;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LZD1;->f(Landroid/hardware/SensorEvent;)Lco/bird/android/model/GravityVector;

    move-result-object p1

    return-object p1
.end method
