.class public Lcom/google/android/libraries/barhopper/BarhopperV3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final c:Ljava/lang/String; = "BarhopperV3"


# instance fields
.field public b:J


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "barhopper_v3"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method private native closeNative(J)V
.end method

.method private native createNative()J
.end method

.method private native createNativeWithClientOptions([B)J
.end method

.method public static f([B)LAy;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    invoke-static {}, LJ28;->a()LJ28;

    move-result-object v0

    invoke-static {p0, v0}, LAy;->I([BLJ28;)LAy;

    move-result-object p0
    :try_end_0
    .catch Lcom/google/android/gms/internal/mlkit_vision_barcode_bundled/zzeo; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Received unexpected BarhopperResponse buffer: {0}"

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private native recognizeBitmapNative(JLandroid/graphics/Bitmap;Lcom/google/android/libraries/barhopper/RecognitionOptions;)[B
.end method

.method private native recognizeBufferNative(JIILjava/nio/ByteBuffer;Lcom/google/android/libraries/barhopper/RecognitionOptions;)[B
.end method

.method private native recognizeNative(JII[BLcom/google/android/libraries/barhopper/RecognitionOptions;)[B
.end method

.method private native recognizeStridedBufferNative(JIIILjava/nio/ByteBuffer;Lcom/google/android/libraries/barhopper/RecognitionOptions;)[B
.end method

.method private native recognizeStridedNative(JIII[BLcom/google/android/libraries/barhopper/RecognitionOptions;)[B
.end method


# virtual methods
.method public a(LBy;)V
    .locals 5

    iget-wide v0, p0, Lcom/google/android/libraries/barhopper/BarhopperV3;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    :try_start_0
    invoke-interface {p1}, Ldj8;->l()I

    move-result v0

    new-array v1, v0, [B

    const/4 v4, 0x0

    invoke-static {v1, v4, v0}, Lr18;->a([BII)Lr18;

    move-result-object v0

    invoke-interface {p1, v0}, Ldj8;->z(Lr18;)V

    invoke-virtual {v0}, Lr18;->b()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-direct {p0, v1}, Lcom/google/android/libraries/barhopper/BarhopperV3;->createNativeWithClientOptions([B)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/libraries/barhopper/BarhopperV3;->b:J

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed to create native context with client options."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Serializing "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to a byte array threw an IOException (should never happen)."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    sget-object p1, Lcom/google/android/libraries/barhopper/BarhopperV3;->c:Ljava/lang/String;

    const-string v0, "Native context already exists."

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public b(IILjava/nio/ByteBuffer;Lcom/google/android/libraries/barhopper/RecognitionOptions;)LAy;
    .locals 7

    iget-wide v1, p0, Lcom/google/android/libraries/barhopper/BarhopperV3;->b:J

    const-wide/16 v3, 0x0

    cmp-long v0, v1, v3

    if-eqz v0, :cond_0

    move-object v0, p0

    move v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/libraries/barhopper/BarhopperV3;->recognizeBufferNative(JIILjava/nio/ByteBuffer;Lcom/google/android/libraries/barhopper/RecognitionOptions;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/libraries/barhopper/BarhopperV3;->f([B)LAy;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Native context does not exist."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(II[BLcom/google/android/libraries/barhopper/RecognitionOptions;)LAy;
    .locals 7

    iget-wide v1, p0, Lcom/google/android/libraries/barhopper/BarhopperV3;->b:J

    const-wide/16 v3, 0x0

    cmp-long v0, v1, v3

    if-eqz v0, :cond_0

    move-object v0, p0

    move v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/libraries/barhopper/BarhopperV3;->recognizeNative(JII[BLcom/google/android/libraries/barhopper/RecognitionOptions;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/libraries/barhopper/BarhopperV3;->f([B)LAy;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Native context does not exist."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public close()V
    .locals 5

    iget-wide v0, p0, Lcom/google/android/libraries/barhopper/BarhopperV3;->b:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    invoke-direct {p0, v0, v1}, Lcom/google/android/libraries/barhopper/BarhopperV3;->closeNative(J)V

    iput-wide v2, p0, Lcom/google/android/libraries/barhopper/BarhopperV3;->b:J

    :cond_0
    return-void
.end method

.method public d(Landroid/graphics/Bitmap;Lcom/google/android/libraries/barhopper/RecognitionOptions;)LAy;
    .locals 4

    iget-wide v0, p0, Lcom/google/android/libraries/barhopper/BarhopperV3;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    if-eq v0, v1, :cond_0

    sget-object v0, Lcom/google/android/libraries/barhopper/BarhopperV3;->c:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isMutable()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    :cond_0
    iget-wide v0, p0, Lcom/google/android/libraries/barhopper/BarhopperV3;->b:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/google/android/libraries/barhopper/BarhopperV3;->recognizeBitmapNative(JLandroid/graphics/Bitmap;Lcom/google/android/libraries/barhopper/RecognitionOptions;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/libraries/barhopper/BarhopperV3;->f([B)LAy;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Native context does not exist."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
