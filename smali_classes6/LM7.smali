.class public final LLM7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LmO7;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-static {p1}, LmO7;->a(Landroid/content/Context;)LmO7;

    move-result-object p1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLM7;->a:LmO7;

    return-void
.end method

.method public static synthetic a(Lnj7;Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p0, p1, v0}, Lnj7;->o4(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/internal/recaptcha/zzai;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-string p1, "RecaptchaOPInit"

    invoke-static {p1, p0}, LHo7;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final b(Lnj7;Ljava/lang/String;Ljava/lang/String;LOU7;)V
    .locals 1

    iget-object v0, p0, LLM7;->a:LmO7;

    invoke-virtual {v0, p2, p3, p4}, LmO7;->c(Ljava/lang/String;Ljava/lang/String;LOU7;)LMb9;

    move-result-object p4

    new-instance v0, LvM7;

    invoke-direct {v0, p0, p1, p2, p3}, LvM7;-><init>(LLM7;Lnj7;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, LeP7;->b:Ljava/util/concurrent/ExecutorService;

    invoke-static {p4, v0, p1}, Lva9;->m(LMb9;LM99;Ljava/util/concurrent/Executor;)V

    return-void
.end method
