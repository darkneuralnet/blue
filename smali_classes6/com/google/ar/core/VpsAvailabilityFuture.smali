.class public Lcom/google/ar/core/VpsAvailabilityFuture;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/ar/core/VpsAvailabilityFuture$CallbackWrapper;
    }
.end annotation


# instance fields
.field final nativeCallbackContext:J

.field final nativeFuture:J

.field final nativeSymbolTableHandle:J

.field final session:Lcom/google/ar/core/Session;


# direct methods
.method public constructor <init>(Lcom/google/ar/core/Session;JJ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/ar/core/VpsAvailabilityFuture;->session:Lcom/google/ar/core/Session;

    iget-wide v0, p1, Lcom/google/ar/core/Session;->nativeSymbolTableHandle:J

    iput-wide v0, p0, Lcom/google/ar/core/VpsAvailabilityFuture;->nativeSymbolTableHandle:J

    iput-wide p2, p0, Lcom/google/ar/core/VpsAvailabilityFuture;->nativeFuture:J

    iput-wide p4, p0, Lcom/google/ar/core/VpsAvailabilityFuture;->nativeCallbackContext:J

    return-void
.end method

.method public static native nativeReleaseFuture(JJ)V
.end method


# virtual methods
.method public cancel()Z
    .locals 8

    iget-object v0, p0, Lcom/google/ar/core/VpsAvailabilityFuture;->session:Lcom/google/ar/core/Session;

    iget-wide v2, v0, Lcom/google/ar/core/Session;->nativeWrapperHandle:J

    iget-wide v4, p0, Lcom/google/ar/core/VpsAvailabilityFuture;->nativeFuture:J

    iget-wide v6, p0, Lcom/google/ar/core/VpsAvailabilityFuture;->nativeCallbackContext:J

    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Lcom/google/ar/core/VpsAvailabilityFuture;->nativeCancel(JJJ)Z

    move-result v0

    return v0
.end method

.method public finalize()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-wide v0, p0, Lcom/google/ar/core/VpsAvailabilityFuture;->nativeSymbolTableHandle:J

    iget-wide v2, p0, Lcom/google/ar/core/VpsAvailabilityFuture;->nativeFuture:J

    invoke-static {v0, v1, v2, v3}, Lcom/google/ar/core/VpsAvailabilityFuture;->nativeReleaseFuture(JJ)V

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void
.end method

.method public getResult()Lcom/google/ar/core/VpsAvailability;
    .locals 4

    iget-object v0, p0, Lcom/google/ar/core/VpsAvailabilityFuture;->session:Lcom/google/ar/core/Session;

    iget-wide v0, v0, Lcom/google/ar/core/Session;->nativeWrapperHandle:J

    iget-wide v2, p0, Lcom/google/ar/core/VpsAvailabilityFuture;->nativeFuture:J

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/google/ar/core/VpsAvailabilityFuture;->nativeGetResult(JJ)I

    move-result v0

    invoke-static {v0}, Lcom/google/ar/core/VpsAvailability;->forNumber(I)Lcom/google/ar/core/VpsAvailability;

    move-result-object v0

    return-object v0
.end method

.method public getState()Lcom/google/ar/core/FutureState;
    .locals 4

    iget-object v0, p0, Lcom/google/ar/core/VpsAvailabilityFuture;->session:Lcom/google/ar/core/Session;

    iget-wide v0, v0, Lcom/google/ar/core/Session;->nativeWrapperHandle:J

    iget-wide v2, p0, Lcom/google/ar/core/VpsAvailabilityFuture;->nativeFuture:J

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/google/ar/core/VpsAvailabilityFuture;->nativeGetState(JJ)I

    move-result v0

    invoke-static {v0}, Lcom/google/ar/core/FutureState;->forNumber(I)Lcom/google/ar/core/FutureState;

    move-result-object v0

    return-object v0
.end method

.method public native nativeCancel(JJJ)Z
.end method

.method public native nativeGetResult(JJ)I
.end method

.method public native nativeGetState(JJ)I
.end method
