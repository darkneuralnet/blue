.class public final Lcom/google/android/filament/utils/KTX1Loader;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/filament/utils/KTX1Loader$Options;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\nJ \u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\nJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u0008J)\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 J)\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 J)\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 J!\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0010H\u0082 \u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/google/android/filament/utils/KTX1Loader;",
        "",
        "()V",
        "createIndirectLight",
        "Lcom/google/android/filament/IndirectLight;",
        "engine",
        "Lcom/google/android/filament/Engine;",
        "buffer",
        "Ljava/nio/Buffer;",
        "options",
        "Lcom/google/android/filament/utils/KTX1Loader$Options;",
        "createSkybox",
        "Lcom/google/android/filament/Skybox;",
        "createTexture",
        "Lcom/google/android/filament/Texture;",
        "getSphericalHarmonics",
        "",
        "nCreateIndirectLight",
        "",
        "nativeEngine",
        "remaining",
        "",
        "srgb",
        "",
        "nCreateKTXTexture",
        "nCreateSkybox",
        "nGetSphericalHarmonics",
        "outSphericalHarmonics",
        "Options",
        "filament-utils-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/google/android/filament/utils/KTX1Loader;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/filament/utils/KTX1Loader;

    invoke-direct {v0}, Lcom/google/android/filament/utils/KTX1Loader;-><init>()V

    sput-object v0, Lcom/google/android/filament/utils/KTX1Loader;->INSTANCE:Lcom/google/android/filament/utils/KTX1Loader;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic createIndirectLight$default(Lcom/google/android/filament/utils/KTX1Loader;Lcom/google/android/filament/Engine;Ljava/nio/Buffer;Lcom/google/android/filament/utils/KTX1Loader$Options;ILjava/lang/Object;)Lcom/google/android/filament/IndirectLight;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    new-instance p3, Lcom/google/android/filament/utils/KTX1Loader$Options;

    invoke-direct {p3}, Lcom/google/android/filament/utils/KTX1Loader$Options;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/filament/utils/KTX1Loader;->createIndirectLight(Lcom/google/android/filament/Engine;Ljava/nio/Buffer;Lcom/google/android/filament/utils/KTX1Loader$Options;)Lcom/google/android/filament/IndirectLight;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createSkybox$default(Lcom/google/android/filament/utils/KTX1Loader;Lcom/google/android/filament/Engine;Ljava/nio/Buffer;Lcom/google/android/filament/utils/KTX1Loader$Options;ILjava/lang/Object;)Lcom/google/android/filament/Skybox;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    new-instance p3, Lcom/google/android/filament/utils/KTX1Loader$Options;

    invoke-direct {p3}, Lcom/google/android/filament/utils/KTX1Loader$Options;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/filament/utils/KTX1Loader;->createSkybox(Lcom/google/android/filament/Engine;Ljava/nio/Buffer;Lcom/google/android/filament/utils/KTX1Loader$Options;)Lcom/google/android/filament/Skybox;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic createTexture$default(Lcom/google/android/filament/utils/KTX1Loader;Lcom/google/android/filament/Engine;Ljava/nio/Buffer;Lcom/google/android/filament/utils/KTX1Loader$Options;ILjava/lang/Object;)Lcom/google/android/filament/Texture;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    new-instance p3, Lcom/google/android/filament/utils/KTX1Loader$Options;

    invoke-direct {p3}, Lcom/google/android/filament/utils/KTX1Loader$Options;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/filament/utils/KTX1Loader;->createTexture(Lcom/google/android/filament/Engine;Ljava/nio/Buffer;Lcom/google/android/filament/utils/KTX1Loader$Options;)Lcom/google/android/filament/Texture;

    move-result-object p0

    return-object p0
.end method

.method private final native nCreateIndirectLight(JLjava/nio/Buffer;IZ)J
.end method

.method private final native nCreateKTXTexture(JLjava/nio/Buffer;IZ)J
.end method

.method private final native nCreateSkybox(JLjava/nio/Buffer;IZ)J
.end method

.method private final native nGetSphericalHarmonics(Ljava/nio/Buffer;I[F)Z
.end method


# virtual methods
.method public final createIndirectLight(Lcom/google/android/filament/Engine;Ljava/nio/Buffer;Lcom/google/android/filament/utils/KTX1Loader$Options;)Lcom/google/android/filament/IndirectLight;
    .locals 7

    const-string v0, "engine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buffer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/filament/Engine;->getNativeObject()J

    move-result-wide v2

    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    move-result v5

    invoke-virtual {p3}, Lcom/google/android/filament/utils/KTX1Loader$Options;->getSrgb()Z

    move-result v6

    move-object v1, p0

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lcom/google/android/filament/utils/KTX1Loader;->nCreateIndirectLight(JLjava/nio/Buffer;IZ)J

    move-result-wide p1

    new-instance p3, Lcom/google/android/filament/IndirectLight;

    invoke-direct {p3, p1, p2}, Lcom/google/android/filament/IndirectLight;-><init>(J)V

    return-object p3
.end method

.method public final createSkybox(Lcom/google/android/filament/Engine;Ljava/nio/Buffer;Lcom/google/android/filament/utils/KTX1Loader$Options;)Lcom/google/android/filament/Skybox;
    .locals 7

    const-string v0, "engine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buffer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/filament/Engine;->getNativeObject()J

    move-result-wide v2

    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    move-result v5

    invoke-virtual {p3}, Lcom/google/android/filament/utils/KTX1Loader$Options;->getSrgb()Z

    move-result v6

    move-object v1, p0

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lcom/google/android/filament/utils/KTX1Loader;->nCreateSkybox(JLjava/nio/Buffer;IZ)J

    move-result-wide p1

    new-instance p3, Lcom/google/android/filament/Skybox;

    invoke-direct {p3, p1, p2}, Lcom/google/android/filament/Skybox;-><init>(J)V

    return-object p3
.end method

.method public final createTexture(Lcom/google/android/filament/Engine;Ljava/nio/Buffer;Lcom/google/android/filament/utils/KTX1Loader$Options;)Lcom/google/android/filament/Texture;
    .locals 7

    const-string v0, "engine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buffer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/filament/Engine;->getNativeObject()J

    move-result-wide v2

    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    move-result v5

    invoke-virtual {p3}, Lcom/google/android/filament/utils/KTX1Loader$Options;->getSrgb()Z

    move-result v6

    move-object v1, p0

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lcom/google/android/filament/utils/KTX1Loader;->nCreateKTXTexture(JLjava/nio/Buffer;IZ)J

    move-result-wide p1

    new-instance p3, Lcom/google/android/filament/Texture;

    invoke-direct {p3, p1, p2}, Lcom/google/android/filament/Texture;-><init>(J)V

    return-object p3
.end method

.method public final getSphericalHarmonics(Ljava/nio/Buffer;)[F
    .locals 2

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x1b

    new-array v0, v0, [F

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    invoke-direct {p0, p1, v1, v0}, Lcom/google/android/filament/utils/KTX1Loader;->nGetSphericalHarmonics(Ljava/nio/Buffer;I[F)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
