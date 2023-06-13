.class public LzE1;
.super Lwf1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010\u0014\n\u0002\u0008\u0006\u0008\u0017\u0018\u00002\u00020\u0001BI\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R.\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@@X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R(\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u00138\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001f"
    }
    d2 = {
        "LzE1;",
        "Lwf1;",
        "",
        "a",
        "",
        "e",
        "Z",
        "getSharedCubemap",
        "()Z",
        "sharedCubemap",
        "Lcom/google/android/filament/Texture;",
        "<set-?>",
        "f",
        "Lcom/google/android/filament/Texture;",
        "getCubemap",
        "()Lcom/google/android/filament/Texture;",
        "setCubemap$sceneview_release",
        "(Lcom/google/android/filament/Texture;)V",
        "cubemap",
        "",
        "g",
        "Ljava/lang/Float;",
        "getIndirectLightIntensity",
        "()Ljava/lang/Float;",
        "indirectLightIntensity",
        "",
        "indirectLightIrradiance",
        "indirectLightSpecularFilter",
        "createSkybox",
        "<init>",
        "(Lcom/google/android/filament/Texture;[FLjava/lang/Float;ZZZ)V",
        "sceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final e:Z

.field public f:Lcom/google/android/filament/Texture;

.field public g:Ljava/lang/Float;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 9

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3f

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, LzE1;-><init>(Lcom/google/android/filament/Texture;[FLjava/lang/Float;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/filament/Texture;[FLjava/lang/Float;ZZZ)V
    .locals 1

    new-instance v0, Lcom/google/android/filament/IndirectLight$Builder;

    invoke-direct {v0}, Lcom/google/android/filament/IndirectLight$Builder;-><init>()V

    if-eqz p1, :cond_2

    if-eqz p4, :cond_0

    invoke-static {}, Ldl1;->e()LWN1;

    move-result-object p4

    invoke-virtual {p4, p1}, LWN1;->e(Lcom/google/android/filament/Texture;)Lcom/google/android/filament/Texture;

    move-result-object p4

    if-nez p5, :cond_1

    invoke-static {p1}, Le36;->b(Lcom/google/android/filament/Texture;)V

    goto :goto_0

    :cond_0
    move-object p4, p1

    :cond_1
    :goto_0
    invoke-virtual {v0, p4}, Lcom/google/android/filament/IndirectLight$Builder;->reflections(Lcom/google/android/filament/Texture;)Lcom/google/android/filament/IndirectLight$Builder;

    :cond_2
    if-eqz p2, :cond_3

    const/4 p4, 0x3

    invoke-virtual {v0, p4, p2}, Lcom/google/android/filament/IndirectLight$Builder;->irradiance(I[F)Lcom/google/android/filament/IndirectLight$Builder;

    :cond_3
    if-eqz p3, :cond_4

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p4

    invoke-virtual {v0, p4}, Lcom/google/android/filament/IndirectLight$Builder;->intensity(F)Lcom/google/android/filament/IndirectLight$Builder;

    :cond_4
    invoke-static {v0}, LD12;->a(Lcom/google/android/filament/IndirectLight$Builder;)Lcom/google/android/filament/IndirectLight;

    move-result-object p4

    const/4 v0, 0x0

    if-eqz p1, :cond_6

    if-eqz p5, :cond_5

    move-object p5, p1

    goto :goto_1

    :cond_5
    move-object p5, v0

    :goto_1
    if-eqz p5, :cond_6

    new-instance v0, Lcom/google/android/filament/Skybox$Builder;

    invoke-direct {v0}, Lcom/google/android/filament/Skybox$Builder;-><init>()V

    invoke-virtual {v0, p5}, Lcom/google/android/filament/Skybox$Builder;->environment(Lcom/google/android/filament/Texture;)Lcom/google/android/filament/Skybox$Builder;

    invoke-static {v0}, LWD5;->a(Lcom/google/android/filament/Skybox$Builder;)Lcom/google/android/filament/Skybox;

    move-result-object v0

    :cond_6
    invoke-direct {p0, p4, v0, p2}, Lwf1;-><init>(Lcom/google/android/filament/IndirectLight;Lcom/google/android/filament/Skybox;[F)V

    iput-boolean p6, p0, LzE1;->e:Z

    iput-object p1, p0, LzE1;->f:Lcom/google/android/filament/Texture;

    iput-object p3, p0, LzE1;->g:Ljava/lang/Float;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/filament/Texture;[FLjava/lang/Float;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p8, v0

    goto :goto_0

    :cond_0
    move-object p8, p1

    :goto_0
    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    move-object v1, v0

    goto :goto_1

    :cond_1
    move-object v1, p2

    :goto_1
    and-int/lit8 p1, p7, 0x4

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, p3

    :goto_2
    and-int/lit8 p1, p7, 0x8

    const/4 p2, 0x1

    if-eqz p1, :cond_3

    move v2, p2

    goto :goto_3

    :cond_3
    move v2, p4

    :goto_3
    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    move v3, p2

    goto :goto_4

    :cond_4
    move v3, p5

    :goto_4
    and-int/lit8 p1, p7, 0x20

    if-eqz p1, :cond_5

    const/4 p6, 0x0

    :cond_5
    move p7, p6

    move-object p1, p0

    move-object p2, p8

    move-object p3, v1

    move-object p4, v0

    move p5, v2

    move p6, v3

    invoke-direct/range {p1 .. p7}, LzE1;-><init>(Lcom/google/android/filament/Texture;[FLjava/lang/Float;ZZZ)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    invoke-super {p0}, Lwf1;->a()V

    iget-boolean v0, p0, LzE1;->e:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    iget-object v0, p0, LzE1;->f:Lcom/google/android/filament/Texture;

    if-eqz v0, :cond_0

    invoke-static {v0}, Le36;->b(Lcom/google/android/filament/Texture;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    iput-object v1, p0, LzE1;->f:Lcom/google/android/filament/Texture;

    :cond_1
    iput-object v1, p0, LzE1;->g:Ljava/lang/Float;

    return-void
.end method
