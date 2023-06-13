.class public final LKN7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LvN7;


# direct methods
.method public constructor <init>(LAR7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final close(JJJJ)V
    .locals 0

    return-void
.end method

.method public final getAnalyticsLogs(J)[B
    .locals 0

    const/4 p1, 0x0

    new-array p1, p1, [B

    return-object p1
.end method

.method public final initialize([BJJJJ)J
    .locals 0

    const-wide/16 p1, 0x1

    return-wide p1
.end method

.method public final initializeFrameBufferReleaseCallback(J)J
    .locals 0

    const-wide/16 p1, 0x1

    return-wide p1
.end method

.method public final initializeFrameManager()J
    .locals 2

    const-wide/16 v0, 0x1

    return-wide v0
.end method

.method public final initializeResultsCallback()J
    .locals 2

    const-wide/16 v0, 0x1

    return-wide v0
.end method

.method public final process(JJJ[BIIII)[B
    .locals 0

    invoke-static {}, LSZ7;->F()LSZ7;

    move-result-object p1

    invoke-virtual {p1}, Lys7;->e()[B

    move-result-object p1

    return-object p1
.end method

.method public final processBitmap(JJLandroid/graphics/Bitmap;IIII)[B
    .locals 0

    invoke-static {}, LSZ7;->F()LSZ7;

    move-result-object p1

    invoke-virtual {p1}, Lys7;->e()[B

    move-result-object p1

    return-object p1
.end method

.method public final processYuvFrame(JJLjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IIIIII)[B
    .locals 0

    invoke-static {}, LSZ7;->F()LSZ7;

    move-result-object p1

    invoke-virtual {p1}, Lys7;->e()[B

    move-result-object p1

    return-object p1
.end method

.method public final start(J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/libraries/vision/visionkit/pipeline/PipelineException;
        }
    .end annotation

    return-void
.end method

.method public final stop(J)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final waitUntilIdle(J)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/libraries/vision/visionkit/pipeline/PipelineException;
        }
    .end annotation

    return-void
.end method

.method public final zza()V
    .locals 0

    return-void
.end method
