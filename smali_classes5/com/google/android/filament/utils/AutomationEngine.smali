.class public Lcom/google/android/filament/utils/AutomationEngine;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/filament/utils/AutomationEngine$ViewerOptions;,
        Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;,
        Lcom/google/android/filament/utils/AutomationEngine$Options;
    }
.end annotation


# instance fields
.field private mColorGrading:Lcom/google/android/filament/ColorGrading;

.field private final mNativeObject:J


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/filament/utils/AutomationEngine;->nCreateDefaultAutomationEngine()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/filament/utils/AutomationEngine;->mNativeObject:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Couldn\'t create AutomationEngine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/filament/utils/AutomationEngine;->nCreateAutomationEngine(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/filament/utils/AutomationEngine;->mNativeObject:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Couldn\'t create AutomationEngine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static native nApplySettings(JJLjava/lang/String;J[JJI[IJJJ)V
.end method

.method private static native nCreateAutomationEngine(Ljava/lang/String;)J
.end method

.method private static native nCreateDefaultAutomationEngine()J
.end method

.method private static native nDestroy(J)V
.end method

.method private static native nGetColorGrading(JJ)J
.end method

.method private static native nGetViewerOptions(JLjava/lang/Object;)V
.end method

.method private static native nSetOptions(JFIZ)V
.end method

.method private static native nShouldClose(J)Z
.end method

.method private static native nSignalBatchMode(J)V
.end method

.method private static native nStartBatchMode(J)V
.end method

.method private static native nStartRunning(J)V
.end method

.method private static native nStopRunning(J)V
.end method

.method private static native nTick(JJJ[JJF)V
.end method


# virtual methods
.method public applySettings(Lcom/google/android/filament/Engine;Ljava/lang/String;Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;)V
    .locals 21

    move-object/from16 v0, p3

    iget-object v1, v0, Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;->view:Lcom/google/android/filament/View;

    if-eqz v1, :cond_4

    iget-object v1, v0, Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;->renderer:Lcom/google/android/filament/Renderer;

    if-eqz v1, :cond_4

    iget-object v1, v0, Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;->lightManager:Lcom/google/android/filament/LightManager;

    if-eqz v1, :cond_3

    iget-object v1, v0, Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;->scene:Lcom/google/android/filament/Scene;

    if-eqz v1, :cond_3

    iget-object v1, v0, Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;->materials:[Lcom/google/android/filament/MaterialInstance;

    if-eqz v1, :cond_0

    array-length v1, v1

    new-array v2, v1, [J

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    iget-object v4, v0, Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;->materials:[Lcom/google/android/filament/MaterialInstance;

    aget-object v4, v4, v3

    invoke-virtual {v4}, Lcom/google/android/filament/MaterialInstance;->getNativeObject()J

    move-result-wide v4

    aput-wide v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    move-object v10, v2

    iget-object v1, v0, Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;->view:Lcom/google/android/filament/View;

    invoke-virtual {v1}, Lcom/google/android/filament/View;->getNativeObject()J

    move-result-wide v8

    iget-object v1, v0, Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;->indirectLight:Lcom/google/android/filament/IndirectLight;

    if-nez v1, :cond_2

    const-wide/16 v1, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/filament/IndirectLight;->getNativeObject()J

    move-result-wide v1

    :goto_1
    move-wide v11, v1

    iget-object v1, v0, Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;->lightManager:Lcom/google/android/filament/LightManager;

    invoke-virtual {v1}, Lcom/google/android/filament/LightManager;->getNativeObject()J

    move-result-wide v15

    iget-object v1, v0, Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;->scene:Lcom/google/android/filament/Scene;

    invoke-virtual {v1}, Lcom/google/android/filament/Scene;->getNativeObject()J

    move-result-wide v17

    iget-object v1, v0, Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;->renderer:Lcom/google/android/filament/Renderer;

    invoke-virtual {v1}, Lcom/google/android/filament/Renderer;->getNativeObject()J

    move-result-wide v19

    move-object/from16 v1, p0

    iget-wide v3, v1, Lcom/google/android/filament/utils/AutomationEngine;->mNativeObject:J

    invoke-virtual/range {p1 .. p1}, Lcom/google/android/filament/Engine;->getNativeObject()J

    move-result-wide v5

    iget v13, v0, Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;->sunlight:I

    iget-object v14, v0, Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;->assetLights:[I

    move-object/from16 v7, p2

    invoke-static/range {v3 .. v20}, Lcom/google/android/filament/utils/AutomationEngine;->nApplySettings(JJLjava/lang/String;J[JJI[IJJJ)V

    return-void

    :cond_3
    move-object/from16 v1, p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Must provide a LightManager and Scene"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    move-object/from16 v1, p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Must provide a View and Renderer"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public finalize()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-wide v0, p0, Lcom/google/android/filament/utils/AutomationEngine;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/utils/AutomationEngine;->nDestroy(J)V

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void
.end method

.method public getColorGrading(Lcom/google/android/filament/Engine;)Lcom/google/android/filament/ColorGrading;
    .locals 4

    iget-wide v0, p0, Lcom/google/android/filament/utils/AutomationEngine;->mNativeObject:J

    invoke-virtual {p1}, Lcom/google/android/filament/Engine;->getNativeObject()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/filament/utils/AutomationEngine;->nGetColorGrading(JJ)J

    move-result-wide v0

    iget-object p1, p0, Lcom/google/android/filament/utils/AutomationEngine;->mColorGrading:Lcom/google/android/filament/ColorGrading;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/filament/ColorGrading;->getNativeObject()J

    move-result-wide v2

    cmp-long p1, v2, v0

    if-eqz p1, :cond_2

    :cond_0
    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/google/android/filament/ColorGrading;

    invoke-direct {p1, v0, v1}, Lcom/google/android/filament/ColorGrading;-><init>(J)V

    :goto_0
    iput-object p1, p0, Lcom/google/android/filament/utils/AutomationEngine;->mColorGrading:Lcom/google/android/filament/ColorGrading;

    :cond_2
    iget-object p1, p0, Lcom/google/android/filament/utils/AutomationEngine;->mColorGrading:Lcom/google/android/filament/ColorGrading;

    return-object p1
.end method

.method public getViewerOptions()Lcom/google/android/filament/utils/AutomationEngine$ViewerOptions;
    .locals 3

    new-instance v0, Lcom/google/android/filament/utils/AutomationEngine$ViewerOptions;

    invoke-direct {v0}, Lcom/google/android/filament/utils/AutomationEngine$ViewerOptions;-><init>()V

    iget-wide v1, p0, Lcom/google/android/filament/utils/AutomationEngine;->mNativeObject:J

    invoke-static {v1, v2, v0}, Lcom/google/android/filament/utils/AutomationEngine;->nGetViewerOptions(JLjava/lang/Object;)V

    return-object v0
.end method

.method public setOptions(Lcom/google/android/filament/utils/AutomationEngine$Options;)V
    .locals 4

    iget-wide v0, p0, Lcom/google/android/filament/utils/AutomationEngine;->mNativeObject:J

    iget v2, p1, Lcom/google/android/filament/utils/AutomationEngine$Options;->sleepDuration:F

    iget v3, p1, Lcom/google/android/filament/utils/AutomationEngine$Options;->minFrameCount:I

    iget-boolean p1, p1, Lcom/google/android/filament/utils/AutomationEngine$Options;->verbose:Z

    invoke-static {v0, v1, v2, v3, p1}, Lcom/google/android/filament/utils/AutomationEngine;->nSetOptions(JFIZ)V

    return-void
.end method

.method public shouldClose()Z
    .locals 2

    iget-wide v0, p0, Lcom/google/android/filament/utils/AutomationEngine;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/utils/AutomationEngine;->nShouldClose(J)Z

    move-result v0

    return v0
.end method

.method public signalBatchMode()V
    .locals 2

    iget-wide v0, p0, Lcom/google/android/filament/utils/AutomationEngine;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/utils/AutomationEngine;->nSignalBatchMode(J)V

    return-void
.end method

.method public startBatchMode()V
    .locals 2

    iget-wide v0, p0, Lcom/google/android/filament/utils/AutomationEngine;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/utils/AutomationEngine;->nStartBatchMode(J)V

    return-void
.end method

.method public startRunning()V
    .locals 2

    iget-wide v0, p0, Lcom/google/android/filament/utils/AutomationEngine;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/utils/AutomationEngine;->nStartRunning(J)V

    return-void
.end method

.method public stopRunning()V
    .locals 2

    iget-wide v0, p0, Lcom/google/android/filament/utils/AutomationEngine;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/utils/AutomationEngine;->nStopRunning(J)V

    return-void
.end method

.method public tick(Lcom/google/android/filament/Engine;Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;F)V
    .locals 12

    iget-object v0, p2, Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;->view:Lcom/google/android/filament/View;

    if-eqz v0, :cond_2

    iget-object v0, p2, Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;->renderer:Lcom/google/android/filament/Renderer;

    if-eqz v0, :cond_2

    iget-object v0, p2, Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;->materials:[Lcom/google/android/filament/MaterialInstance;

    if-eqz v0, :cond_0

    array-length v0, v0

    new-array v1, v0, [J

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p2, Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;->materials:[Lcom/google/android/filament/MaterialInstance;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Lcom/google/android/filament/MaterialInstance;->getNativeObject()J

    move-result-wide v3

    aput-wide v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    move-object v8, v1

    iget-object v0, p2, Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;->view:Lcom/google/android/filament/View;

    invoke-virtual {v0}, Lcom/google/android/filament/View;->getNativeObject()J

    move-result-wide v6

    iget-object p2, p2, Lcom/google/android/filament/utils/AutomationEngine$ViewerContent;->renderer:Lcom/google/android/filament/Renderer;

    invoke-virtual {p2}, Lcom/google/android/filament/Renderer;->getNativeObject()J

    move-result-wide v9

    iget-wide v2, p0, Lcom/google/android/filament/utils/AutomationEngine;->mNativeObject:J

    invoke-virtual {p1}, Lcom/google/android/filament/Engine;->getNativeObject()J

    move-result-wide v4

    move v11, p3

    invoke-static/range {v2 .. v11}, Lcom/google/android/filament/utils/AutomationEngine;->nTick(JJJ[JJF)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Must provide a View and Renderer"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
