.class public final synthetic LzL7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk69;


# static fields
.field public static final synthetic a:LzL7;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, LzL7;

    invoke-direct {v0}, LzL7;-><init>()V

    sput-object v0, LzL7;->a:LzL7;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)LMb9;
    .locals 1

    check-cast p1, Ljava/lang/Exception;

    sget-object v0, LfM7;->e:Ljava/util/concurrent/ExecutorService;

    instance-of v0, p1, Lcom/google/android/gms/recaptcha/RecaptchaNetworkException;

    if-nez v0, :cond_1

    instance-of v0, p1, Lcom/google/android/gms/recaptcha/HttpStatusException;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/recaptcha/zzby;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/recaptcha/zzby;-><init>(Ljava/lang/Exception;)V

    invoke-static {v0}, Lva9;->e(Ljava/lang/Throwable;)LMb9;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, Lcom/google/android/gms/internal/recaptcha/zzbx;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/recaptcha/zzbx;-><init>(Ljava/lang/Exception;)V

    invoke-static {v0}, Lva9;->e(Ljava/lang/Throwable;)LMb9;

    move-result-object p1

    :goto_1
    return-object p1
.end method
