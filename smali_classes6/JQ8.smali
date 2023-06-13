.class public final LJQ8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:LcR8;


# direct methods
.method public constructor <init>(LcR8;)V
    .locals 0

    iput-object p1, p0, LJQ8;->a:LcR8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, LJQ8;->a:LcR8;

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, LJQ8;->a:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->F()LIh8;

    move-result-object v0

    iget-object v1, p0, LJQ8;->a:LcR8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LIh8;->s(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LJQ8;->a:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->F()LIh8;

    move-result-object v0

    iget-object v0, v0, LIh8;->l:LVf8;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LVf8;->a(Z)V

    new-instance v0, Landroid/app/ActivityManager$RunningAppProcessInfo;

    invoke-direct {v0}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    invoke-static {v0}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    iget v0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v1, 0x64

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LJQ8;->a:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->a()LFc8;

    move-result-object v0

    invoke-virtual {v0}, LFc8;->s()Lec8;

    move-result-object v0

    const-string v1, "Detected application was in foreground"

    invoke-virtual {v0, v1}, Lec8;->a(Ljava/lang/String;)V

    iget-object v0, p0, LJQ8;->a:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->currentTimeMillis()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, LJQ8;->c(JZ)V

    :cond_0
    return-void
.end method

.method public final b(JZ)V
    .locals 3

    iget-object v0, p0, LJQ8;->a:LcR8;

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, LJQ8;->a:LcR8;

    invoke-static {v0}, LcR8;->m(LcR8;)V

    iget-object v0, p0, LJQ8;->a:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->F()LIh8;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LIh8;->s(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LJQ8;->a:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->F()LIh8;

    move-result-object v0

    iget-object v0, v0, LIh8;->l:LVf8;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LVf8;->a(Z)V

    invoke-static {}, Ltk9;->b()Z

    iget-object v0, p0, LJQ8;->a:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, La98;->p0:LL88;

    invoke-virtual {v0, v1, v2}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LJQ8;->a:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->y()Lla8;

    move-result-object v0

    invoke-virtual {v0}, Lla8;->s()V

    :cond_0
    iget-object v0, p0, LJQ8;->a:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->F()LIh8;

    move-result-object v0

    iget-object v0, v0, LIh8;->o:Lzg8;

    invoke-virtual {v0, p1, p2}, Lzg8;->b(J)V

    iget-object v0, p0, LJQ8;->a:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->F()LIh8;

    move-result-object v0

    iget-object v0, v0, LIh8;->l:LVf8;

    invoke-virtual {v0}, LVf8;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1, p2, p3}, LJQ8;->c(JZ)V

    :cond_1
    return-void
.end method

.method public final c(JZ)V
    .locals 9
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    iget-object v0, p0, LJQ8;->a:LcR8;

    invoke-virtual {v0}, Lns8;->e()V

    iget-object v0, p0, LJQ8;->a:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->l()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LJQ8;->a:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->F()LIh8;

    move-result-object v0

    iget-object v0, v0, LIh8;->o:Lzg8;

    invoke-virtual {v0, p1, p2}, Lzg8;->b(J)V

    iget-object v0, p0, LJQ8;->a:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->A()Lcom/google/android/gms/common/util/Clock;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/Clock;->elapsedRealtime()J

    move-result-wide v0

    iget-object v2, p0, LJQ8;->a:LcR8;

    iget-object v2, v2, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->a()LFc8;

    move-result-object v2

    invoke-virtual {v2}, LFc8;->s()Lec8;

    move-result-object v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "Session started, time"

    invoke-virtual {v2, v1, v0}, Lec8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide/16 v0, 0x3e8

    div-long v0, p1, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, LJQ8;->a:LcR8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->I()LRC8;

    move-result-object v2

    const-string v3, "auto"

    const-string v4, "_sid"

    move-object v5, v0

    move-wide v6, p1

    invoke-virtual/range {v2 .. v7}, LRC8;->M(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    iget-object v1, p0, LJQ8;->a:LcR8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->F()LIh8;

    move-result-object v1

    iget-object v1, v1, LIh8;->p:Lzg8;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lzg8;->b(J)V

    iget-object v1, p0, LJQ8;->a:LcR8;

    iget-object v1, v1, Lns8;->a:LPn8;

    invoke-virtual {v1}, LPn8;->F()LIh8;

    move-result-object v1

    iget-object v1, v1, LIh8;->l:LVf8;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, LVf8;->a(Z)V

    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-string v2, "_sid"

    invoke-virtual {v8, v2, v0, v1}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    iget-object v0, p0, LJQ8;->a:LcR8;

    iget-object v0, v0, Lns8;->a:LPn8;

    invoke-virtual {v0}, LPn8;->w()Lgl7;

    move-result-object v0

    sget-object v1, La98;->d0:LL88;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p3, :cond_1

    const-string p3, "_aib"

    const-wide/16 v0, 0x1

    invoke-virtual {v8, p3, v0, v1}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_1
    iget-object p3, p0, LJQ8;->a:LcR8;

    iget-object p3, p3, Lns8;->a:LPn8;

    invoke-virtual {p3}, LPn8;->I()LRC8;

    move-result-object v3

    const-string v4, "auto"

    const-string v5, "_s"

    move-wide v6, p1

    invoke-virtual/range {v3 .. v8}, LRC8;->s(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V

    invoke-static {}, Lic9;->b()Z

    iget-object p3, p0, LJQ8;->a:LcR8;

    iget-object p3, p3, Lns8;->a:LPn8;

    invoke-virtual {p3}, LPn8;->w()Lgl7;

    move-result-object p3

    sget-object v0, La98;->g0:LL88;

    invoke-virtual {p3, v2, v0}, Lgl7;->y(Ljava/lang/String;LL88;)Z

    move-result p3

    if-eqz p3, :cond_2

    iget-object p3, p0, LJQ8;->a:LcR8;

    iget-object p3, p3, Lns8;->a:LPn8;

    invoke-virtual {p3}, LPn8;->F()LIh8;

    move-result-object p3

    iget-object p3, p3, LIh8;->u:Lsh8;

    invoke-virtual {p3}, Lsh8;->a()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    const-string v0, "_ffr"

    invoke-virtual {v6, v0, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p3, p0, LJQ8;->a:LcR8;

    iget-object p3, p3, Lns8;->a:LPn8;

    invoke-virtual {p3}, LPn8;->I()LRC8;

    move-result-object v1

    const-string v2, "auto"

    const-string v3, "_ssr"

    move-wide v4, p1

    invoke-virtual/range {v1 .. v6}, LRC8;->s(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V

    :cond_2
    return-void
.end method
