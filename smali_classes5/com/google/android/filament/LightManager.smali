.class public Lcom/google/android/filament/LightManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/filament/LightManager$Builder;,
        Lcom/google/android/filament/LightManager$ShadowCascades;,
        Lcom/google/android/filament/LightManager$ShadowOptions;,
        Lcom/google/android/filament/LightManager$Type;
    }
.end annotation


# static fields
.field public static final EFFICIENCY_FLUORESCENT:F = 0.0878f

.field public static final EFFICIENCY_HALOGEN:F = 0.0707f

.field public static final EFFICIENCY_INCANDESCENT:F = 0.022f

.field public static final EFFICIENCY_LED:F = 0.1171f

.field private static final sTypeValues:[Lcom/google/android/filament/LightManager$Type;


# instance fields
.field private mNativeObject:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/android/filament/LightManager$Type;->values()[Lcom/google/android/filament/LightManager$Type;

    move-result-object v0

    sput-object v0, Lcom/google/android/filament/LightManager;->sTypeValues:[Lcom/google/android/filament/LightManager$Type;

    return-void
.end method

.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    return-void
.end method

.method public static synthetic access$000([FI)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/filament/LightManager;->nComputeUniformSplits([FI)V

    return-void
.end method

.method public static synthetic access$100([FIFF)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/filament/LightManager;->nComputeLogSplits([FIFF)V

    return-void
.end method

.method public static synthetic access$1000(JFFF)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/android/filament/LightManager;->nBuilderColor(JFFF)V

    return-void
.end method

.method public static synthetic access$1100(JF)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/filament/LightManager;->nBuilderIntensity(JF)V

    return-void
.end method

.method public static synthetic access$1200(JFF)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/filament/LightManager;->nBuilderIntensity(JFF)V

    return-void
.end method

.method public static synthetic access$1300(JF)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/filament/LightManager;->nBuilderIntensityCandela(JF)V

    return-void
.end method

.method public static synthetic access$1400(JF)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/filament/LightManager;->nBuilderFalloff(JF)V

    return-void
.end method

.method public static synthetic access$1500(JFF)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/filament/LightManager;->nBuilderSpotLightCone(JFF)V

    return-void
.end method

.method public static synthetic access$1600(JF)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/filament/LightManager;->nBuilderAngularRadius(JF)V

    return-void
.end method

.method public static synthetic access$1700(JF)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/filament/LightManager;->nBuilderHaloSize(JF)V

    return-void
.end method

.method public static synthetic access$1800(JF)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/filament/LightManager;->nBuilderHaloFalloff(JF)V

    return-void
.end method

.method public static synthetic access$1900(JJI)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/android/filament/LightManager;->nBuilderBuild(JJI)Z

    move-result p0

    return p0
.end method

.method public static synthetic access$200([FIFFF)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/android/filament/LightManager;->nComputePracticalSplits([FIFFF)V

    return-void
.end method

.method public static synthetic access$2000(J)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/filament/LightManager;->nDestroyBuilder(J)V

    return-void
.end method

.method public static synthetic access$300(I)J
    .locals 2

    invoke-static {p0}, Lcom/google/android/filament/LightManager;->nCreateBuilder(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic access$400(JIZ)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/google/android/filament/LightManager;->nBuilderLightChannel(JIZ)V

    return-void
.end method

.method public static synthetic access$500(JZ)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/filament/LightManager;->nBuilderCastShadows(JZ)V

    return-void
.end method

.method public static synthetic access$600(JII[FFFFFFZZFFZIFZFF)V
    .locals 0

    invoke-static/range {p0 .. p19}, Lcom/google/android/filament/LightManager;->nBuilderShadowOptions(JII[FFFFFFZZFFZIFZFF)V

    return-void
.end method

.method public static synthetic access$700(JZ)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/filament/LightManager;->nBuilderCastLight(JZ)V

    return-void
.end method

.method public static synthetic access$800(JFFF)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/android/filament/LightManager;->nBuilderPosition(JFFF)V

    return-void
.end method

.method public static synthetic access$900(JFFF)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/google/android/filament/LightManager;->nBuilderDirection(JFFF)V

    return-void
.end method

.method private static native nBuilderAngularRadius(JF)V
.end method

.method private static native nBuilderBuild(JJI)Z
.end method

.method private static native nBuilderCastLight(JZ)V
.end method

.method private static native nBuilderCastShadows(JZ)V
.end method

.method private static native nBuilderColor(JFFF)V
.end method

.method private static native nBuilderDirection(JFFF)V
.end method

.method private static native nBuilderFalloff(JF)V
.end method

.method private static native nBuilderHaloFalloff(JF)V
.end method

.method private static native nBuilderHaloSize(JF)V
.end method

.method private static native nBuilderIntensity(JF)V
.end method

.method private static native nBuilderIntensity(JFF)V
.end method

.method private static native nBuilderIntensityCandela(JF)V
.end method

.method private static native nBuilderLightChannel(JIZ)V
.end method

.method private static native nBuilderPosition(JFFF)V
.end method

.method private static native nBuilderShadowOptions(JII[FFFFFFZZFFZIFZFF)V
.end method

.method private static native nBuilderSpotLightCone(JFF)V
.end method

.method private static native nComputeLogSplits([FIFF)V
.end method

.method private static native nComputePracticalSplits([FIFFF)V
.end method

.method private static native nComputeUniformSplits([FI)V
.end method

.method private static native nCreateBuilder(I)J
.end method

.method private static native nDestroy(JI)V
.end method

.method private static native nDestroyBuilder(J)V
.end method

.method private static native nGetColor(JI[F)V
.end method

.method private static native nGetComponentCount(J)I
.end method

.method private static native nGetDirection(JI[F)V
.end method

.method private static native nGetFalloff(JI)F
.end method

.method private static native nGetInnerConeAngle(JI)F
.end method

.method private static native nGetInstance(JI)I
.end method

.method private static native nGetIntensity(JI)F
.end method

.method private static native nGetLightChannel(JII)Z
.end method

.method private static native nGetOuterConeAngle(JI)F
.end method

.method private static native nGetPosition(JI[F)V
.end method

.method private static native nGetSunAngularRadius(JI)F
.end method

.method private static native nGetSunHaloFalloff(JI)F
.end method

.method private static native nGetSunHaloSize(JI)F
.end method

.method private static native nGetType(JI)I
.end method

.method private static native nHasComponent(JI)Z
.end method

.method private static native nIsShadowCaster(JI)Z
.end method

.method private static native nSetColor(JIFFF)V
.end method

.method private static native nSetDirection(JIFFF)V
.end method

.method private static native nSetFalloff(JIF)V
.end method

.method private static native nSetIntensity(JIF)V
.end method

.method private static native nSetIntensity(JIFF)V
.end method

.method private static native nSetIntensityCandela(JIF)V
.end method

.method private static native nSetLightChannel(JIIZ)V
.end method

.method private static native nSetPosition(JIFFF)V
.end method

.method private static native nSetShadowCaster(JIZ)V
.end method

.method private static native nSetSpotLightCone(JIFF)V
.end method

.method private static native nSetSunAngularRadius(JIF)V
.end method

.method private static native nSetSunHaloFalloff(JIF)V
.end method

.method private static native nSetSunHaloSize(JIF)V
.end method


# virtual methods
.method public destroy(I)V
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/Entity;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/LightManager;->nDestroy(JI)V

    return-void
.end method

.method public getColor(I[F)[F
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    invoke-static {p2}, Lcom/google/android/filament/Asserts;->assertFloat3([F)[F

    move-result-object p2

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1, p2}, Lcom/google/android/filament/LightManager;->nGetColor(JI[F)V

    return-object p2
.end method

.method public getComponentCount()I
    .locals 2

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1}, Lcom/google/android/filament/LightManager;->nGetComponentCount(J)I

    move-result v0

    return v0
.end method

.method public getDirection(I[F)[F
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    invoke-static {p2}, Lcom/google/android/filament/Asserts;->assertFloat3([F)[F

    move-result-object p2

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1, p2}, Lcom/google/android/filament/LightManager;->nGetDirection(JI[F)V

    return-object p2
.end method

.method public getFalloff(I)F
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/LightManager;->nGetFalloff(JI)F

    move-result p1

    return p1
.end method

.method public getInnerConeAngle(I)F
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/LightManager;->nGetInnerConeAngle(JI)F

    move-result p1

    return p1
.end method

.method public getInstance(I)I
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/Entity;
        .end annotation
    .end param
    .annotation build Lcom/google/android/filament/EntityInstance;
    .end annotation

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/LightManager;->nGetInstance(JI)I

    move-result p1

    return p1
.end method

.method public getIntensity(I)F
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/LightManager;->nGetIntensity(JI)F

    move-result p1

    return p1
.end method

.method public getLightChannel(II)Z
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1, p2}, Lcom/google/android/filament/LightManager;->nGetLightChannel(JII)Z

    move-result p1

    return p1
.end method

.method public getNativeObject()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    return-wide v0
.end method

.method public getOuterConeAngle(I)F
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/LightManager;->nGetOuterConeAngle(JI)F

    move-result p1

    return p1
.end method

.method public getPosition(I[F)[F
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    invoke-static {p2}, Lcom/google/android/filament/Asserts;->assertFloat3([F)[F

    move-result-object p2

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1, p2}, Lcom/google/android/filament/LightManager;->nGetPosition(JI[F)V

    return-object p2
.end method

.method public getSunAngularRadius(I)F
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/LightManager;->nGetSunAngularRadius(JI)F

    move-result p1

    return p1
.end method

.method public getSunHaloFalloff(I)F
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/LightManager;->nGetSunHaloFalloff(JI)F

    move-result p1

    return p1
.end method

.method public getSunHaloSize(I)F
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/LightManager;->nGetSunHaloSize(JI)F

    move-result p1

    return p1
.end method

.method public getType(I)Lcom/google/android/filament/LightManager$Type;
    .locals 3
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    sget-object v0, Lcom/google/android/filament/LightManager;->sTypeValues:[Lcom/google/android/filament/LightManager$Type;

    iget-wide v1, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v1, v2, p1}, Lcom/google/android/filament/LightManager;->nGetType(JI)I

    move-result p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public hasComponent(I)Z
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/Entity;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/LightManager;->nHasComponent(JI)Z

    move-result p1

    return p1
.end method

.method public isDirectional(I)Z
    .locals 1
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lcom/google/android/filament/LightManager;->getType(I)Lcom/google/android/filament/LightManager$Type;

    move-result-object p1

    sget-object v0, Lcom/google/android/filament/LightManager$Type;->DIRECTIONAL:Lcom/google/android/filament/LightManager$Type;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/google/android/filament/LightManager$Type;->SUN:Lcom/google/android/filament/LightManager$Type;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public isPointLight(I)Z
    .locals 1
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lcom/google/android/filament/LightManager;->getType(I)Lcom/google/android/filament/LightManager$Type;

    move-result-object p1

    sget-object v0, Lcom/google/android/filament/LightManager$Type;->POINT:Lcom/google/android/filament/LightManager$Type;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public isShadowCaster(I)Z
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1}, Lcom/google/android/filament/LightManager;->nIsShadowCaster(JI)Z

    move-result p1

    return p1
.end method

.method public isSpotLight(I)Z
    .locals 1
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Lcom/google/android/filament/LightManager;->getType(I)Lcom/google/android/filament/LightManager$Type;

    move-result-object p1

    sget-object v0, Lcom/google/android/filament/LightManager$Type;->SPOT:Lcom/google/android/filament/LightManager$Type;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/google/android/filament/LightManager$Type;->FOCUSED_SPOT:Lcom/google/android/filament/LightManager$Type;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public setColor(IFFF)V
    .locals 6
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lcom/google/android/filament/LightManager;->nSetColor(JIFFF)V

    return-void
.end method

.method public setDirection(IFFF)V
    .locals 6
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lcom/google/android/filament/LightManager;->nSetDirection(JIFFF)V

    return-void
.end method

.method public setFalloff(IF)V
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1, p2}, Lcom/google/android/filament/LightManager;->nSetFalloff(JIF)V

    return-void
.end method

.method public setIntensity(IF)V
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1, p2}, Lcom/google/android/filament/LightManager;->nSetIntensity(JIF)V

    return-void
.end method

.method public setIntensity(IFF)V
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1, p2, p3}, Lcom/google/android/filament/LightManager;->nSetIntensity(JIFF)V

    return-void
.end method

.method public setIntensityCandela(IF)V
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1, p2}, Lcom/google/android/filament/LightManager;->nSetIntensityCandela(JIF)V

    return-void
.end method

.method public setLightChannel(IIZ)V
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1, p2, p3}, Lcom/google/android/filament/LightManager;->nSetLightChannel(JIIZ)V

    return-void
.end method

.method public setPosition(IFFF)V
    .locals 6
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v0 .. v5}, Lcom/google/android/filament/LightManager;->nSetPosition(JIFFF)V

    return-void
.end method

.method public setShadowCaster(IZ)V
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1, p2}, Lcom/google/android/filament/LightManager;->nSetShadowCaster(JIZ)V

    return-void
.end method

.method public setSpotLightCone(IFF)V
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1, p2, p3}, Lcom/google/android/filament/LightManager;->nSetSpotLightCone(JIFF)V

    return-void
.end method

.method public setSunAngularRadius(IF)V
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1, p2}, Lcom/google/android/filament/LightManager;->nSetSunAngularRadius(JIF)V

    return-void
.end method

.method public setSunHaloFalloff(IF)V
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1, p2}, Lcom/google/android/filament/LightManager;->nSetSunHaloFalloff(JIF)V

    return-void
.end method

.method public setSunHaloSize(IF)V
    .locals 2
    .param p1    # I
        .annotation build Lcom/google/android/filament/EntityInstance;
        .end annotation
    .end param

    iget-wide v0, p0, Lcom/google/android/filament/LightManager;->mNativeObject:J

    invoke-static {v0, v1, p1, p2}, Lcom/google/android/filament/LightManager;->nSetSunHaloSize(JIF)V

    return-void
.end method
