.class public final Lcom/stripe/android/stripe3ds2/observability/DefaultSentryConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/observability/SentryConfig;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\r\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0006\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/observability/DefaultSentryConfig;",
        "Lcom/stripe/android/stripe3ds2/observability/SentryConfig;",
        "()V",
        "key",
        "",
        "getKey",
        "()Ljava/lang/String;",
        "projectId",
        "getProjectId",
        "secret",
        "getSecret",
        "version",
        "getVersion",
        "getTimestamp",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/stripe3ds2/observability/DefaultSentryConfig;

.field private static final key:Ljava/lang/String;

.field private static final projectId:Ljava/lang/String;

.field private static final secret:Ljava/lang/String;

.field private static final version:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/stripe3ds2/observability/DefaultSentryConfig;

    invoke-direct {v0}, Lcom/stripe/android/stripe3ds2/observability/DefaultSentryConfig;-><init>()V

    sput-object v0, Lcom/stripe/android/stripe3ds2/observability/DefaultSentryConfig;->INSTANCE:Lcom/stripe/android/stripe3ds2/observability/DefaultSentryConfig;

    const-string v0, "426"

    sput-object v0, Lcom/stripe/android/stripe3ds2/observability/DefaultSentryConfig;->projectId:Ljava/lang/String;

    const-string v0, "dcb428fea25c40e7b99f81ae5981ee6a"

    sput-object v0, Lcom/stripe/android/stripe3ds2/observability/DefaultSentryConfig;->key:Ljava/lang/String;

    const-string v0, "deca87e736574c5c83c07314051fd93a"

    sput-object v0, Lcom/stripe/android/stripe3ds2/observability/DefaultSentryConfig;->secret:Ljava/lang/String;

    const-string v0, "7"

    sput-object v0, Lcom/stripe/android/stripe3ds2/observability/DefaultSentryConfig;->version:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getKey()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/stripe3ds2/observability/DefaultSentryConfig;->key:Ljava/lang/String;

    return-object v0
.end method

.method public getProjectId()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/stripe3ds2/observability/DefaultSentryConfig;->projectId:Ljava/lang/String;

    return-object v0
.end method

.method public getSecret()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/stripe3ds2/observability/DefaultSentryConfig;->secret:Ljava/lang/String;

    return-object v0
.end method

.method public getTimestamp()Ljava/lang/String;
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J

    move-result-wide v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v4

    sub-long/2addr v0, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v2, 0x2e

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/stripe/android/stripe3ds2/observability/DefaultSentryConfig;->version:Ljava/lang/String;

    return-object v0
.end method
