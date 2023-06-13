.class public Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Lcom/google/android/apps/common/proguard/UsedByNative;
    value = "pipeline_jni.cc"
.end annotation


# static fields
.field private static final ROOT_CAUSE_DELIMITER:Ljava/lang/String; = "#vk "


# instance fields
.field private final statusCode:Lv07;

.field private final statusMessage:Ljava/lang/String;

.field private final visionkitStatus:Lg27;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 2

    invoke-static {}, Lv07;->values()[Lv07;

    move-result-object v0

    aget-object v0, v0, p1

    invoke-virtual {v0}, Lv07;->a()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lv07;->values()[Lv07;

    move-result-object v0

    aget-object p1, v0, p1

    iput-object p1, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException;->statusCode:Lv07;

    iput-object p2, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException;->statusMessage:Ljava/lang/String;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException;->visionkitStatus:Lg27;

    return-void
.end method

.method private constructor <init>(Lg27;)V
    .locals 3

    invoke-static {}, Lv07;->values()[Lv07;

    move-result-object v0

    invoke-virtual {p1}, Lg27;->E()I

    move-result v1

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lv07;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lg27;->H()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lv07;->values()[Lv07;

    move-result-object v0

    invoke-virtual {p1}, Lg27;->E()I

    move-result v1

    aget-object v0, v0, v1

    iput-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException;->statusCode:Lv07;

    invoke-virtual {p1}, Lg27;->H()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException;->statusMessage:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException;->visionkitStatus:Lg27;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lcom/google/android/apps/common/proguard/UsedByNative;
        value = "pipeline_jni.cc"
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;
        }
    .end annotation

    invoke-static {}, LOa7;->a()LOa7;

    move-result-object v0

    invoke-static {p1, v0}, Lg27;->G([BLOa7;)Lg27;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException;-><init>(Lg27;)V

    return-void
.end method


# virtual methods
.method public getComponentStatuses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LiS6;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException;->visionkitStatus:Lg27;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg27;->I()Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, LX57;->o()LX57;

    move-result-object v0

    return-object v0
.end method

.method public getRootCauseMessage()LI57;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LI57<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException;->statusMessage:Ljava/lang/String;

    const-string v1, "#vk "

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v1}, LO57;->b(Ljava/lang/String;)LO57;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException;->statusMessage:Ljava/lang/String;

    invoke-virtual {v0, v1}, LO57;->c(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v0

    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_2

    move-object v0, v1

    :goto_0
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, LI57;->e(Ljava/lang/Object;)LI57;

    move-result-object v0

    return-object v0

    :cond_3
    invoke-static {}, LI57;->d()LI57;

    move-result-object v0

    return-object v0
.end method

.method public getStatusCode()Lv07;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException;->statusCode:Lv07;

    return-object v0
.end method

.method public getStatusMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/vision/visionkit/pipeline/alt/PipelineException;->statusMessage:Ljava/lang/String;

    return-object v0
.end method
