.class public final Lcom/amazonaws/retry/RetryPolicy;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;,
        Lcom/amazonaws/retry/RetryPolicy$RetryCondition;
    }
.end annotation


# instance fields
.field private final backoffStrategy:Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;

.field private final honorMaxErrorRetryInClientConfig:Z

.field private final maxErrorRetry:I

.field private final retryCondition:Lcom/amazonaws/retry/RetryPolicy$RetryCondition;


# direct methods
.method public constructor <init>(Lcom/amazonaws/retry/RetryPolicy$RetryCondition;Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    sget-object p1, Lcom/amazonaws/retry/PredefinedRetryPolicies;->DEFAULT_RETRY_CONDITION:Lcom/amazonaws/retry/RetryPolicy$RetryCondition;

    :cond_0
    if-nez p2, :cond_1

    sget-object p2, Lcom/amazonaws/retry/PredefinedRetryPolicies;->DEFAULT_BACKOFF_STRATEGY:Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;

    :cond_1
    if-ltz p3, :cond_2

    iput-object p1, p0, Lcom/amazonaws/retry/RetryPolicy;->retryCondition:Lcom/amazonaws/retry/RetryPolicy$RetryCondition;

    iput-object p2, p0, Lcom/amazonaws/retry/RetryPolicy;->backoffStrategy:Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;

    iput p3, p0, Lcom/amazonaws/retry/RetryPolicy;->maxErrorRetry:I

    iput-boolean p4, p0, Lcom/amazonaws/retry/RetryPolicy;->honorMaxErrorRetryInClientConfig:Z

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Please provide a non-negative value for maxErrorRetry."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public getBackoffStrategy()Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/retry/RetryPolicy;->backoffStrategy:Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;

    return-object v0
.end method

.method public getMaxErrorRetry()I
    .locals 1

    iget v0, p0, Lcom/amazonaws/retry/RetryPolicy;->maxErrorRetry:I

    return v0
.end method

.method public getRetryCondition()Lcom/amazonaws/retry/RetryPolicy$RetryCondition;
    .locals 1

    iget-object v0, p0, Lcom/amazonaws/retry/RetryPolicy;->retryCondition:Lcom/amazonaws/retry/RetryPolicy$RetryCondition;

    return-object v0
.end method

.method public isMaxErrorRetryInClientConfigHonored()Z
    .locals 1

    iget-boolean v0, p0, Lcom/amazonaws/retry/RetryPolicy;->honorMaxErrorRetryInClientConfig:Z

    return v0
.end method
