.class public abstract LEs5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroid/hardware/SensorEventListener;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0011\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008&\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0012\u0010\u0019\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\n0\u0014\"\u00020\n\u00a2\u0006\u0004\u00080\u00101J\u0019\u0010\u0005\u001a\u00028\u00002\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0008\u0010\u0008\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u00020\u00072\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0017J\u001a\u0010\u000e\u001a\u00020\u00072\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016R\u001a\u0010\u0013\u001a\u00020\u000f8\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0010\u0010\u0012R\"\u0010\u0019\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\n0\u00148\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001a\u0010!\u001a\u00020\u000c8\u0014X\u0094D\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R(\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\"8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&\"\u0004\u0008\u0015\u0010\'R.\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070)8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008*\u0010+\u001a\u0004\u0008,\u0010-\"\u0004\u0008\u001b\u0010.\u00a8\u00062"
    }
    d2 = {
        "LEs5;",
        "T",
        "Landroid/hardware/SensorEventListener;",
        "Landroid/hardware/SensorEvent;",
        "event",
        "transformEvent",
        "(Landroid/hardware/SensorEvent;)Ljava/lang/Object;",
        "",
        "e",
        "onSensorChanged",
        "Landroid/hardware/Sensor;",
        "sensor",
        "",
        "accuracy",
        "onAccuracyChanged",
        "Landroid/hardware/SensorManager;",
        "b",
        "Landroid/hardware/SensorManager;",
        "()Landroid/hardware/SensorManager;",
        "sensorManager",
        "",
        "c",
        "[Landroid/hardware/Sensor;",
        "getSensors",
        "()[Landroid/hardware/Sensor;",
        "sensors",
        "",
        "d",
        "Z",
        "isRegistered",
        "I",
        "a",
        "()I",
        "delay",
        "Lkotlin/Function0;",
        "f",
        "Lkotlin/jvm/functions/Function0;",
        "getHasObservers",
        "()Lkotlin/jvm/functions/Function0;",
        "(Lkotlin/jvm/functions/Function0;)V",
        "hasObservers",
        "Lkotlin/Function1;",
        "g",
        "Lkotlin/jvm/functions/Function1;",
        "getOnEvent",
        "()Lkotlin/jvm/functions/Function1;",
        "(Lkotlin/jvm/functions/Function1;)V",
        "onEvent",
        "<init>",
        "(Landroid/hardware/SensorManager;[Landroid/hardware/Sensor;)V",
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
        "SMAP\nSensorListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SensorListener.kt\nco/bird/android/manager/sensor/SensorListener\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,49:1\n13579#2,2:50\n13579#2,2:52\n*S KotlinDebug\n*F\n+ 1 SensorListener.kt\nco/bird/android/manager/sensor/SensorListener\n*L\n27#1:50,2\n37#1:52,2\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Landroid/hardware/SensorManager;

.field public final c:[Landroid/hardware/Sensor;

.field public d:Z

.field public final e:I

.field public f:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public g:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public varargs constructor <init>(Landroid/hardware/SensorManager;[Landroid/hardware/Sensor;)V
    .locals 1

    const-string v0, "sensorManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sensors"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEs5;->b:Landroid/hardware/SensorManager;

    iput-object p2, p0, LEs5;->c:[Landroid/hardware/Sensor;

    const/4 p1, 0x3

    iput p1, p0, LEs5;->e:I

    sget-object p1, LEs5$a;->g:LEs5$a;

    iput-object p1, p0, LEs5;->f:Lkotlin/jvm/functions/Function0;

    sget-object p1, LEs5$b;->g:LEs5$b;

    iput-object p1, p0, LEs5;->g:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LEs5;->e:I

    return v0
.end method

.method public final b()Landroid/hardware/SensorManager;
    .locals 1

    iget-object v0, p0, LEs5;->b:Landroid/hardware/SensorManager;

    return-object v0
.end method

.method public final c(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LEs5;->f:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public final d(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LEs5;->g:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public declared-synchronized e()V
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LEs5;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, LEs5;->d:Z

    iget-object v0, p0, LEs5;->c:[Landroid/hardware/Sensor;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-object v4, p0, LEs5;->b:Landroid/hardware/SensorManager;

    invoke-virtual {p0}, LEs5;->a()I

    move-result v5

    invoke-virtual {v4, p0, v3, v5}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 5

    iget-object v0, p0, LEs5;->g:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0, p1}, LEs5;->transformEvent(Landroid/hardware/SensorEvent;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, LEs5;->f:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, LEs5;->c:[Landroid/hardware/Sensor;

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v3, p1, v2

    iget-object v4, p0, LEs5;->b:Landroid/hardware/SensorManager;

    invoke-virtual {v4, p0, v3}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, LEs5;->d:Z

    :cond_1
    return-void
.end method

.method public abstract transformEvent(Landroid/hardware/SensorEvent;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/SensorEvent;",
            ")TT;"
        }
    .end annotation
.end method
