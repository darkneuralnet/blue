.class public final LIy3;
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
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0014\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0019\u0010\u0005\u001a\u00020\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u000c\u001a\u00020\u00078\u0014X\u0094D\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u000f\u00a8\u0006\u001b"
    }
    d2 = {
        "LIy3;",
        "LEs5;",
        "",
        "Landroid/hardware/SensorEvent;",
        "event",
        "f",
        "(Landroid/hardware/SensorEvent;)Ljava/lang/Float;",
        "",
        "h",
        "I",
        "a",
        "()I",
        "delay",
        "",
        "i",
        "[F",
        "gravityReadings",
        "j",
        "magneticReadings",
        "k",
        "rotationMatrix",
        "l",
        "orientationAngles",
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


# instance fields
.field public final h:I

.field public final i:[F

.field public final j:[F

.field public final k:[F

.field public final l:[F


# direct methods
.method public constructor <init>(Landroid/hardware/SensorManager;)V
    .locals 5

    const-string v0, "sensorManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    new-array v1, v0, [Landroid/hardware/Sensor;

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v3

    const-string v4, "sensorManager.getDefault\u2026ensor.TYPE_ACCELEROMETER)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    aput-object v3, v1, v4

    invoke-virtual {p1, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    const-string v3, "sensorManager.getDefault\u2026nsor.TYPE_MAGNETIC_FIELD)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object v0, v1, v2

    invoke-direct {p0, p1, v1}, LEs5;-><init>(Landroid/hardware/SensorManager;[Landroid/hardware/Sensor;)V

    iput v2, p0, LIy3;->h:I

    const/4 p1, 0x3

    new-array v0, p1, [F

    iput-object v0, p0, LIy3;->i:[F

    new-array v0, p1, [F

    iput-object v0, p0, LIy3;->j:[F

    const/16 v0, 0x9

    new-array v0, v0, [F

    iput-object v0, p0, LIy3;->k:[F

    new-array p1, p1, [F

    iput-object p1, p0, LIy3;->l:[F

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LIy3;->h:I

    return v0
.end method

.method public f(Landroid/hardware/SensorEvent;)Ljava/lang/Float;
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/hardware/Sensor;->getType()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    const/4 v2, 0x3

    const/4 v3, 0x0

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_2

    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    iget-object v1, p0, LIy3;->i:[F

    invoke-static {p1, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_2

    :cond_2
    :goto_1
    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v4, 0x2

    if-ne v1, v4, :cond_4

    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    iget-object v1, p0, LIy3;->j:[F

    invoke-static {p1, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_4
    :goto_2
    iget-object p1, p0, LIy3;->k:[F

    iget-object v1, p0, LIy3;->i:[F

    iget-object v2, p0, LIy3;->j:[F

    invoke-static {p1, v0, v1, v2}, Landroid/hardware/SensorManager;->getRotationMatrix([F[F[F[F)Z

    iget-object p1, p0, LIy3;->k:[F

    iget-object v0, p0, LIy3;->l:[F

    invoke-static {p1, v0}, Landroid/hardware/SensorManager;->getOrientation([F[F)[F

    iget-object p1, p0, LIy3;->l:[F

    aget p1, p1, v3

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v0

    double-to-float p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic transformEvent(Landroid/hardware/SensorEvent;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LIy3;->f(Landroid/hardware/SensorEvent;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
