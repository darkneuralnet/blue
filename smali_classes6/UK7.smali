.class public final synthetic LUK7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk69;


# instance fields
.field public final synthetic a:LfM7;

.field public final synthetic b:Lcom/google/android/gms/recaptcha/RecaptchaAction;

.field public final synthetic c:LOU7;

.field public final synthetic d:Lcom/google/android/gms/recaptcha/RecaptchaHandle;


# direct methods
.method public synthetic constructor <init>(LfM7;Lcom/google/android/gms/recaptcha/RecaptchaAction;LOU7;Lcom/google/android/gms/recaptcha/RecaptchaHandle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUK7;->a:LfM7;

    iput-object p2, p0, LUK7;->b:Lcom/google/android/gms/recaptcha/RecaptchaAction;

    iput-object p3, p0, LUK7;->c:LOU7;

    iput-object p4, p0, LUK7;->d:Lcom/google/android/gms/recaptcha/RecaptchaHandle;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)LMb9;
    .locals 4

    iget-object v0, p0, LUK7;->a:LfM7;

    iget-object v1, p0, LUK7;->b:Lcom/google/android/gms/recaptcha/RecaptchaAction;

    iget-object v2, p0, LUK7;->c:LOU7;

    iget-object v3, p0, LUK7;->d:Lcom/google/android/gms/recaptcha/RecaptchaHandle;

    check-cast p1, Lq28;

    invoke-virtual {v0, v1, v2, v3, p1}, LfM7;->b(Lcom/google/android/gms/recaptcha/RecaptchaAction;LOU7;Lcom/google/android/gms/recaptcha/RecaptchaHandle;Lq28;)LMb9;

    move-result-object p1

    return-object p1
.end method
