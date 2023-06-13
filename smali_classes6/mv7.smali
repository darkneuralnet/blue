.class public final synthetic Lmv7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/RemoteCall;


# instance fields
.field public final synthetic a:LvE7;

.field public final synthetic b:Lcom/google/android/gms/recaptcha/RecaptchaHandle;

.field public final synthetic c:Lcom/google/android/gms/recaptcha/RecaptchaAction;


# direct methods
.method public synthetic constructor <init>(LvE7;Lcom/google/android/gms/recaptcha/RecaptchaHandle;Lcom/google/android/gms/recaptcha/RecaptchaAction;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmv7;->a:LvE7;

    iput-object p2, p0, Lmv7;->b:Lcom/google/android/gms/recaptcha/RecaptchaHandle;

    iput-object p3, p0, Lmv7;->c:Lcom/google/android/gms/recaptcha/RecaptchaAction;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lmv7;->a:LvE7;

    iget-object v1, p0, Lmv7;->b:Lcom/google/android/gms/recaptcha/RecaptchaHandle;

    iget-object v2, p0, Lmv7;->c:Lcom/google/android/gms/recaptcha/RecaptchaAction;

    check-cast p1, LmF7;

    check-cast p2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0, v1, v2, p1, p2}, LvE7;->i(Lcom/google/android/gms/recaptcha/RecaptchaHandle;Lcom/google/android/gms/recaptcha/RecaptchaAction;LmF7;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
