.class public final LGR8;
.super LTR8;
.source "SourceFile"


# instance fields
.field public final d:Landroid/app/AlarmManager;

.field public e:LTs7;

.field public f:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(LhV8;)V
    .locals 1

    invoke-direct {p0, p1}, LTR8;-><init>(LhV8;)V

    iget-object p1, p0, Lns8;->a:LPn8;

    invoke-virtual {p1}, LPn8;->z()Landroid/content/Context;

    move-result-object p1

    const-string v0, "alarm"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/AlarmManager;

    iput-object p1, p0, LGR8;->d:Landroid/app/AlarmManager;

    return-void
.end method


# virtual methods
.method public final i()Z
    .locals 2

    iget-object v0, p0, LGR8;->d:Landroid/app/AlarmManager;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LGR8;->m()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    :cond_0
    invoke-virtual {p0}, LGR8;->o()V

    const/4 v0, 0x0

    return v0
.end method

.method public final j()V
    .locals 2

    invoke-virtual {p0}, LTR8;->f()V

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v1, "Unscheduling upload"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    iget-object v0, p0, LGR8;->d:Landroid/app/AlarmManager;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LGR8;->m()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    :cond_0
    invoke-virtual {p0}, LGR8;->n()LTs7;

    move-result-object v0

    invoke-virtual {v0}, LTs7;->b()V

    invoke-virtual {p0}, LGR8;->o()V

    return-void
.end method

.method public final k(J)V
    .locals 6

    invoke-virtual {p0}, LTR8;->f()V

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->C()LFg7;

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->z()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LOW8;->a0(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->a()LFc8;

    move-result-object v1

    invoke-virtual {v1}, LFc8;->n()Lec8;

    move-result-object v1

    const-string v2, "Receiver not registered/enabled"

    invoke-virtual {v1, v2}, Lec8;->a(Ljava/lang/String;)V

    :cond_0
    const/4 v1, 0x0

    invoke-static {v0, v1}, LOW8;->b0(Landroid/content/Context;Z)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->n()Lec8;

    move-result-object v0

    const-string v1, "Service not registered/enabled"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0}, LGR8;->j()V

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "Scheduling upload, millis"

    invoke-virtual {v0, v2, v1}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    sget-object v0, La98;->z:LL88;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LL88;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    cmp-long v0, p1, v0

    if-gez v0, :cond_2

    invoke-virtual {p0}, LGR8;->n()LTs7;

    move-result-object v0

    invoke-virtual {v0}, LTs7;->e()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, LGR8;->n()LTs7;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LTs7;->d(J)V

    :cond_2
    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->C()LFg7;

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->z()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "com.google.android.gms.measurement.AppMeasurementJobService"

    invoke-direct {v1, v0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p0}, LGR8;->l()I

    move-result v2

    new-instance v3, Landroid/os/PersistableBundle;

    invoke-direct {v3}, Landroid/os/PersistableBundle;-><init>()V

    const-string v4, "action"

    const-string v5, "com.google.android.gms.measurement.UPLOAD"

    invoke-virtual {v3, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Landroid/app/job/JobInfo$Builder;

    invoke-direct {v4, v2, v1}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    invoke-virtual {v4, p1, p2}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    move-result-object v1

    add-long/2addr p1, p1

    invoke-virtual {v1, p1, p2}, Landroid/app/job/JobInfo$Builder;->setOverrideDeadline(J)Landroid/app/job/JobInfo$Builder;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/app/job/JobInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    move-result-object p1

    const-string p2, "com.google.android.gms"

    const-string v1, "UploadAlarm"

    invoke-static {v0, p1, p2, v1}, LyN7;->a(Landroid/content/Context;Landroid/app/job/JobInfo;Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final l()I
    .locals 2

    iget-object v0, p0, LGR8;->f:Ljava/lang/Integer;

    if-nez v0, :cond_0

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->z()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "measurement"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, LGR8;->f:Ljava/lang/Integer;

    :cond_0
    iget-object v0, p0, LGR8;->f:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public final m()Landroid/app/PendingIntent;
    .locals 4

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->z()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "com.google.android.gms.measurement.AppMeasurementReceiver"

    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    const-string v2, "com.google.android.gms.measurement.UPLOAD"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    sget v2, LiN7;->a:I

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method public final n()LTs7;
    .locals 2

    iget-object v0, p0, LGR8;->e:LTs7;

    if-nez v0, :cond_0

    new-instance v0, LwR8;

    iget-object v1, p0, LIR8;->b:LhV8;

    invoke-virtual {v1}, LhV8;->c0()LPn8;

    move-result-object v1

    invoke-direct {v0, p0, v1}, LwR8;-><init>(LGR8;LQs8;)V

    iput-object v0, p0, LGR8;->e:LTs7;

    :cond_0
    iget-object v0, p0, LGR8;->e:LTs7;

    return-object v0
.end method

.method public final o()V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    iget-object v0, p0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->z()Landroid/content/Context;

    move-result-object v0

    const-string v1, "jobscheduler"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/job/JobScheduler;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LGR8;->l()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/job/JobScheduler;->cancel(I)V

    :cond_0
    return-void
.end method
