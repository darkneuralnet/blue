.class public final LGt7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgs4;


# static fields
.field public static final h:LDV7;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LLM7;

.field public final c:LfM7;

.field public final d:LhK7;

.field public final e:LiX7;

.field public final f:Lf08;

.field public final g:LOU7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, LRV7;->a()LDV7;

    move-result-object v0

    sput-object v0, LGt7;->h:LDV7;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LLM7;LfM7;LhK7;LiX7;Lf08;LOU7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGt7;->a:Landroid/content/Context;

    iput-object p2, p0, LGt7;->b:LLM7;

    iput-object p3, p0, LGt7;->c:LfM7;

    iput-object p4, p0, LGt7;->d:LhK7;

    iput-object p5, p0, LGt7;->e:LiX7;

    iput-object p6, p0, LGt7;->f:Lf08;

    iput-object p7, p0, LGt7;->g:LOU7;

    return-void
.end method

.method public static a(Landroid/content/Context;)LGt7;
    .locals 9

    new-instance v8, LGt7;

    new-instance v2, LLM7;

    invoke-direct {v2, p0}, LLM7;-><init>(Landroid/content/Context;)V

    new-instance v3, LfM7;

    invoke-direct {v3, p0}, LfM7;-><init>(Landroid/content/Context;)V

    new-instance v4, LhK7;

    invoke-direct {v4}, LhK7;-><init>()V

    new-instance v5, LiX7;

    sget-object v0, LGt7;->h:LDV7;

    invoke-direct {v5, v0}, LiX7;-><init>(LDV7;)V

    new-instance v6, Lf08;

    invoke-direct {v6, p0, v0}, Lf08;-><init>(Landroid/content/Context;LDV7;)V

    invoke-static {}, LOU7;->b()LOU7;

    move-result-object v7

    move-object v0, v8

    move-object v1, p0

    invoke-direct/range {v0 .. v7}, LGt7;-><init>(Landroid/content/Context;LLM7;LfM7;LhK7;LiX7;Lf08;LOU7;)V

    return-object v8
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/recaptcha/RecaptchaHandle;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    if-eqz p1, :cond_0

    new-instance v1, Lzp7;

    invoke-direct {v1, p0, v0}, Lzp7;-><init>(LGt7;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iget-object v2, p0, LGt7;->b:LLM7;

    iget-object v3, p0, LGt7;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, LGt7;->g:LOU7;

    invoke-virtual {v2, v1, p1, v3, v4}, LLM7;->b(Lnj7;Ljava/lang/String;Ljava/lang/String;LOU7;)V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Cannot call init with a null site key."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g(Lcom/google/android/gms/recaptcha/RecaptchaHandle;Lcom/google/android/gms/recaptcha/RecaptchaAction;)Lcom/google/android/gms/tasks/Task;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/recaptcha/RecaptchaHandle;",
            "Lcom/google/android/gms/recaptcha/RecaptchaAction;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lcom/google/android/gms/recaptcha/RecaptchaResultData;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    new-instance v1, Lsq7;

    invoke-direct {v1, p0, v0}, Lsq7;-><init>(LGt7;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iget-object v2, p0, LGt7;->a:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/google/android/gms/recaptcha/RecaptchaHandle;->v()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, LaZ7;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LGt7;->c:LfM7;

    new-instance v4, Lcom/google/android/gms/recaptcha/RecaptchaAction;

    invoke-direct {v4, p2, v2}, Lcom/google/android/gms/recaptcha/RecaptchaAction;-><init>(Lcom/google/android/gms/recaptcha/RecaptchaAction;Ljava/lang/String;)V

    iget-object p2, p0, LGt7;->g:LOU7;

    invoke-virtual {v3, v1, p1, v4, p2}, LfM7;->e(Lzh7;Lcom/google/android/gms/recaptcha/RecaptchaHandle;Lcom/google/android/gms/recaptcha/RecaptchaAction;LOU7;)V

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Cannot call execute with a null RecaptchaHandle or a null RecaptchaAction. Make sure to call init first."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
