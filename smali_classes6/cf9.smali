.class public abstract Lcf9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhq9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType::",
        "LNp9;",
        ">",
        "Ljava/lang/Object;",
        "Lhq9<",
        "TMessageType;>;"
    }
.end annotation


# static fields
.field public static final a:Lsk9;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lsk9;->a()Lsk9;

    move-result-object v0

    sput-object v0, Lcf9;->a:Lsk9;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final e(LNp9;)LNp9;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TMessageType;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/recaptcha/zzrr;
        }
    .end annotation

    if-eqz p0, :cond_1

    invoke-interface {p0}, LPp9;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/recaptcha/zztq;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/recaptcha/zztq;-><init>(LNp9;)V

    new-instance v1, Lcom/google/android/gms/internal/recaptcha/zzrr;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/recaptcha/zzrr;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/recaptcha/zzrr;->h(LNp9;)Lcom/google/android/gms/internal/recaptcha/zzrr;

    throw v1

    :cond_1
    :goto_0
    return-object p0
.end method


# virtual methods
.method public final bridge synthetic b(Ljava/io/InputStream;Lsk9;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/recaptcha/zzrr;
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcf9;->d(Ljava/io/InputStream;Lsk9;)LNp9;

    move-result-object p1

    invoke-static {p1}, Lcf9;->e(LNp9;)LNp9;

    return-object p1
.end method

.method public final bridge synthetic c(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/recaptcha/zzrr;
        }
    .end annotation

    sget-object v0, Lcf9;->a:Lsk9;

    invoke-virtual {p0, p1, v0}, Lcf9;->d(Ljava/io/InputStream;Lsk9;)LNp9;

    move-result-object p1

    invoke-static {p1}, Lcf9;->e(LNp9;)LNp9;

    return-object p1
.end method

.method public final d(Ljava/io/InputStream;Lsk9;)LNp9;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Lsk9;",
            ")TMessageType;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/recaptcha/zzrr;
        }
    .end annotation

    sget v0, Lti9;->d:I

    const/4 v0, 0x0

    if-nez p1, :cond_0

    sget-object p1, LFn9;->c:[B

    array-length v1, p1

    invoke-static {p1, v0, v0, v0}, Lti9;->g([BIIZ)Lti9;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v1, Lli9;

    const/16 v2, 0x1000

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lli9;-><init>(Ljava/io/InputStream;ILvh9;)V

    move-object p1, v1

    :goto_0
    invoke-interface {p0, p1, p2}, Lhq9;->a(Lti9;Lsk9;)Ljava/lang/Object;

    move-result-object p2

    :try_start_0
    invoke-virtual {p1, v0}, Lti9;->A(I)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/recaptcha/zzrr; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/recaptcha/zzrr;->h(LNp9;)Lcom/google/android/gms/internal/recaptcha/zzrr;

    throw p1
.end method
