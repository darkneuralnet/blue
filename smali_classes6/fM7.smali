.class public final LfM7;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/util/concurrent/ExecutorService;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LDV7;

.field public final c:LmO7;

.field public final d:LdS7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, LeP7;->b:Ljava/util/concurrent/ExecutorService;

    sput-object v0, LfM7;->e:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-static {}, LRV7;->a()LDV7;

    move-result-object v0

    invoke-static {p1}, LmO7;->a(Landroid/content/Context;)LmO7;

    move-result-object v1

    invoke-static {p1}, LdS7;->a(Landroid/content/Context;)LdS7;

    move-result-object v2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LfM7;->a:Landroid/content/Context;

    iput-object v0, p0, LfM7;->b:LDV7;

    iput-object v1, p0, LfM7;->c:LmO7;

    iput-object v2, p0, LfM7;->d:LdS7;

    return-void
.end method

.method public static synthetic d(Lzh7;Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p0, p1, v0}, Lzh7;->B(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/internal/recaptcha/zzx;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-string p1, "RecaptchaOPExecute"

    invoke-static {p1, p0}, LHo7;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/android/gms/recaptcha/RecaptchaHandle;Ljava/lang/String;Lcom/google/android/gms/recaptcha/RecaptchaAction;JLjava/util/Map;LXT7;Ljava/lang/String;)LMb9;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p3}, Lcom/google/android/gms/recaptcha/RecaptchaAction;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/google/android/gms/recaptcha/RecaptchaAction;->E()Ljava/lang/String;

    move-result-object p3

    new-instance v1, LCI7;

    invoke-static {}, LeP7;->a()Ljava/lang/String;

    move-result-object v2

    sget-object v3, LfM7;->e:Ljava/util/concurrent/ExecutorService;

    invoke-static {}, Lou9;->x()Lou9;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, LCI7;-><init>(Ljava/lang/String;Ljava/util/concurrent/ExecutorService;LEm9;)V

    invoke-static {}, Lku9;->y()LEt9;

    move-result-object v2

    invoke-virtual {v2, p2}, LEt9;->C(Ljava/lang/String;)LEt9;

    invoke-virtual {v2, v0}, LEt9;->B(Ljava/lang/String;)LEt9;

    invoke-virtual {v2, p4, p5}, LEt9;->J(J)LEt9;

    invoke-virtual {v2, p3}, LEt9;->I(Ljava/lang/String;)LEt9;

    invoke-virtual {v2, p8}, LEt9;->H(Ljava/lang/String;)LEt9;

    invoke-virtual {v2, p6}, LEt9;->y(Ljava/util/Map;)LEt9;

    const/4 p2, 0x1

    invoke-virtual {v2, p2}, LEt9;->G(Z)LEt9;

    invoke-virtual {p7}, LXT7;->a()LvQ8;

    move-result-object p2

    invoke-virtual {v2, p2}, LEt9;->A(Ljava/util/Map;)LEt9;

    invoke-virtual {p7}, LXT7;->b()Lwu9;

    move-result-object p2

    invoke-virtual {v2, p2}, LEt9;->D(Lwu9;)LEt9;

    invoke-virtual {v2}, Lbm9;->q()LEm9;

    move-result-object p2

    check-cast p2, Lku9;

    invoke-virtual {v1, p2}, LCI7;->a(LEm9;)LMb9;

    move-result-object p2

    new-instance p3, LEK7;

    invoke-direct {p3, p0, p1, p8}, LEK7;-><init>(LfM7;Lcom/google/android/gms/recaptcha/RecaptchaHandle;Ljava/lang/String;)V

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {p2, p3, p1}, Lva9;->j(LMb9;LYH8;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic b(Lcom/google/android/gms/recaptcha/RecaptchaAction;LOU7;Lcom/google/android/gms/recaptcha/RecaptchaHandle;Lq28;)LMb9;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p4}, Lq28;->C()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, LfM7;->b:LDV7;

    invoke-interface {v0}, LDV7;->zza()LKr9;

    move-result-object v0

    invoke-static {v0}, Lgt9;->b(LKr9;)LKr9;

    invoke-virtual {v0}, LKr9;->x()J

    move-result-wide v1

    const-wide/16 v4, 0x3e8

    invoke-static {v1, v2, v4, v5}, LS19;->b(JJ)J

    move-result-wide v1

    invoke-virtual {v0}, LKr9;->w()I

    move-result v0

    int-to-long v4, v0

    const-wide/32 v6, 0xf4240

    div-long/2addr v4, v6

    invoke-static {v1, v2, v4, v5}, LS19;->a(JJ)J

    move-result-wide v5

    invoke-virtual {p4}, Lq28;->D()Ljava/util/List;

    move-result-object p4

    invoke-virtual {p1}, Lcom/google/android/gms/recaptcha/RecaptchaAction;->u()Landroid/os/Bundle;

    move-result-object v0

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {p4, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    instance-of v8, v4, Ljava/lang/String;

    if-eqz v8, :cond_0

    check-cast v4, Ljava/lang/String;

    invoke-interface {v7, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/recaptcha/zzbi;

    const-string p2, "Only string values are allowed as an additional arg in RecaptchaAction"

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/recaptcha/zzbi;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/recaptcha/zzbi;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    new-instance p3, Ljava/lang/StringBuilder;

    add-int/lit8 p2, p2, 0x3c

    invoke-direct {p3, p2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string p2, "AdditionalArgs key[ \""

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\" ] is not accepted by reCATPCHA server"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/recaptcha/zzbi;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p4, p0, LfM7;->a:Landroid/content/Context;

    invoke-virtual {p2, p4}, LOU7;->a(Landroid/content/Context;)LXT7;

    move-result-object v8

    iget-object p2, p0, LfM7;->d:LdS7;

    invoke-virtual {p3}, Lcom/google/android/gms/recaptcha/RecaptchaHandle;->v()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3}, Lcom/google/android/gms/recaptcha/RecaptchaHandle;->u()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, p4, v0}, LdS7;->b(Ljava/lang/String;Ljava/lang/String;)LMb9;

    move-result-object p2

    new-instance p4, LkL7;

    move-object v0, p4

    move-object v1, p0

    move-object v2, p3

    move-object v4, p1

    invoke-direct/range {v0 .. v8}, LkL7;-><init>(LfM7;Lcom/google/android/gms/recaptcha/RecaptchaHandle;Ljava/lang/String;Lcom/google/android/gms/recaptcha/RecaptchaAction;JLjava/util/Map;LXT7;)V

    sget-object p1, LfM7;->e:Ljava/util/concurrent/ExecutorService;

    invoke-static {p2, p4, p1}, Lva9;->k(LMb9;Lk69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic c(Lcom/google/android/gms/recaptcha/RecaptchaHandle;Ljava/lang/String;Lou9;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LfM7;->d:LdS7;

    invoke-virtual {p1}, Lcom/google/android/gms/recaptcha/RecaptchaHandle;->v()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/recaptcha/RecaptchaHandle;->u()Ljava/lang/String;

    move-result-object p1

    const-string v2, "RecaptchaOPExecute"

    invoke-virtual {v0, v1, p1, p2, v2}, LdS7;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LMb9;

    invoke-virtual {p3}, Lou9;->y()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lzh7;Lcom/google/android/gms/recaptcha/RecaptchaHandle;Lcom/google/android/gms/recaptcha/RecaptchaAction;LOU7;)V
    .locals 4

    iget-object v0, p0, LfM7;->c:LmO7;

    invoke-virtual {p2}, Lcom/google/android/gms/recaptcha/RecaptchaHandle;->v()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/google/android/gms/recaptcha/RecaptchaHandle;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p4}, LmO7;->c(Ljava/lang/String;Ljava/lang/String;LOU7;)LMb9;

    move-result-object v0

    sget-object v1, LzL7;->a:LzL7;

    invoke-static {v1}, LKD8;->c(Lk69;)Lk69;

    move-result-object v1

    invoke-static {}, LHc9;->b()Ljava/util/concurrent/Executor;

    move-result-object v2

    const-class v3, Ljava/lang/Exception;

    invoke-static {v0, v3, v1, v2}, Lva9;->c(LMb9;Ljava/lang/Class;Lk69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object v0

    new-instance v1, LUK7;

    invoke-direct {v1, p0, p3, p4, p2}, LUK7;-><init>(LfM7;Lcom/google/android/gms/recaptcha/RecaptchaAction;LOU7;Lcom/google/android/gms/recaptcha/RecaptchaHandle;)V

    invoke-static {v1}, LKD8;->c(Lk69;)Lk69;

    move-result-object p2

    sget-object p3, LfM7;->e:Ljava/util/concurrent/ExecutorService;

    invoke-static {v0, p2, p3}, Lva9;->k(LMb9;Lk69;Ljava/util/concurrent/Executor;)LMb9;

    move-result-object p2

    new-instance p4, LPL7;

    invoke-direct {p4, p0, p1}, LPL7;-><init>(LfM7;Lzh7;)V

    invoke-static {p2, p4, p3}, Lva9;->m(LMb9;LM99;Ljava/util/concurrent/Executor;)V

    return-void
.end method
