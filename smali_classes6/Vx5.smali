.class public LVx5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LVx5$c;,
        LVx5$b;,
        LVx5$d;,
        LVx5$a;
    }
.end annotation


# instance fields
.field public b:I

.field public final c:LVx5$d;

.field public final d:LVx5$a;

.field public e:Landroid/hardware/SensorManager;

.field public f:Landroid/hardware/Sensor;


# direct methods
.method public constructor <init>(LVx5$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xd

    iput v0, p0, LVx5;->b:I

    new-instance v0, LVx5$d;

    invoke-direct {v0}, LVx5$d;-><init>()V

    iput-object v0, p0, LVx5;->c:LVx5$d;

    iput-object p1, p0, LVx5;->d:LVx5$a;

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/SensorEvent;)Z
    .locals 7

    iget-object p1, p1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v0, 0x0

    aget v1, p1, v0

    const/4 v2, 0x1

    aget v3, p1, v2

    const/4 v4, 0x2

    aget p1, p1, v4

    mul-float/2addr v1, v1

    mul-float/2addr v3, v3

    add-float/2addr v1, v3

    mul-float/2addr p1, p1

    add-float/2addr v1, p1

    float-to-double v3, v1

    iget p1, p0, LVx5;->b:I

    mul-int/2addr p1, p1

    int-to-double v5, p1

    cmpl-double p1, v3, v5

    if-lez p1, :cond_0

    move v0, v2

    :cond_0
    return v0
.end method

.method public b(Landroid/hardware/SensorManager;I)Z
    .locals 2

    iget-object v0, p0, LVx5;->f:Landroid/hardware/Sensor;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v0

    iput-object v0, p0, LVx5;->f:Landroid/hardware/Sensor;

    if-eqz v0, :cond_1

    iput-object p1, p0, LVx5;->e:Landroid/hardware/SensorManager;

    invoke-virtual {p1, p0, v0, p2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    :cond_1
    iget-object p1, p0, LVx5;->f:Landroid/hardware/Sensor;

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, LVx5;->f:Landroid/hardware/Sensor;

    if-eqz v0, :cond_0

    iget-object v0, p0, LVx5;->c:LVx5$d;

    invoke-virtual {v0}, LVx5$d;->b()V

    iget-object v0, p0, LVx5;->e:Landroid/hardware/SensorManager;

    iget-object v1, p0, LVx5;->f:Landroid/hardware/Sensor;

    invoke-virtual {v0, p0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    const/4 v0, 0x0

    iput-object v0, p0, LVx5;->e:Landroid/hardware/SensorManager;

    iput-object v0, p0, LVx5;->f:Landroid/hardware/Sensor;

    :cond_0
    return-void
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 3

    invoke-virtual {p0, p1}, LVx5;->a(Landroid/hardware/SensorEvent;)Z

    move-result v0

    iget-wide v1, p1, Landroid/hardware/SensorEvent;->timestamp:J

    iget-object p1, p0, LVx5;->c:LVx5$d;

    invoke-virtual {p1, v1, v2, v0}, LVx5$d;->a(JZ)V

    iget-object p1, p0, LVx5;->c:LVx5$d;

    invoke-virtual {p1}, LVx5$d;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LVx5;->c:LVx5$d;

    invoke-virtual {p1}, LVx5$d;->b()V

    iget-object p1, p0, LVx5;->d:LVx5$a;

    invoke-interface {p1}, LVx5$a;->a()V

    :cond_0
    return-void
.end method
