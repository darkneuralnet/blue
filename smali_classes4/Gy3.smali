.class public final LGy3;
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
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0019\u0010\u0005\u001a\u00020\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0014X\u0094D\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0015"
    }
    d2 = {
        "LGy3;",
        "LEs5;",
        "",
        "Landroid/hardware/SensorEvent;",
        "event",
        "f",
        "(Landroid/hardware/SensorEvent;)Ljava/lang/Float;",
        "Ldr4;",
        "h",
        "Ldr4;",
        "locationManager",
        "",
        "i",
        "I",
        "a",
        "()I",
        "delay",
        "Landroid/hardware/SensorManager;",
        "sensorManager",
        "<init>",
        "(Landroid/hardware/SensorManager;Ldr4;)V",
        "co.bird.android.manager.sensor"
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
        "SMAP\nOrientationV1SensorListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrientationV1SensorListener.kt\nco/bird/android/manager/sensor/OrientationV1SensorListener\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"
    }
.end annotation


# instance fields
.field public final h:Ldr4;

.field public final i:I


# direct methods
.method public constructor <init>(Landroid/hardware/SensorManager;Ldr4;)V
    .locals 4

    const-string v0, "sensorManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v1, v0, [Landroid/hardware/Sensor;

    const/4 v2, 0x3

    invoke-virtual {p1, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v2

    const-string v3, "sensorManager.getDefault\u2026(Sensor.TYPE_ORIENTATION)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, p1, v1}, LEs5;-><init>(Landroid/hardware/SensorManager;[Landroid/hardware/Sensor;)V

    iput-object p2, p0, LGy3;->h:Ldr4;

    iput v0, p0, LGy3;->i:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LGy3;->i:I

    return v0
.end method

.method public f(Landroid/hardware/SensorEvent;)Ljava/lang/Float;
    .locals 2

    if-eqz p1, :cond_1

    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    aget p1, p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    invoke-virtual {p0}, LEs5;->b()Landroid/hardware/SensorManager;

    move-result-object v0

    iget-object v1, p0, LGy3;->h:Ldr4;

    invoke-interface {v1}, Ldr4;->p()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/Location;

    invoke-static {v0, v1}, LHy3;->a(Landroid/hardware/SensorManager;Landroid/location/Location;)Landroid/hardware/GeomagneticField;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/GeomagneticField;->getDeclination()F

    move-result v0

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic transformEvent(Landroid/hardware/SensorEvent;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LGy3;->f(Landroid/hardware/SensorEvent;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
