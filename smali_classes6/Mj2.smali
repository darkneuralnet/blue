.class public final LMj2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a.\u0010\t\u001a\u00020\u0008*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u001a*\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\nH\u0007\u001a$\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u001a$\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/google/android/filament/utils/KTX1Loader;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/lifecycle/f;",
        "lifecycle",
        "",
        "iblKtxFileLocation",
        "skyboxKtxFileLocation",
        "Lwf1;",
        "f",
        "Ljava/nio/Buffer;",
        "iblKtxBuffer",
        "skyboxKtxBuffer",
        "LLj2;",
        "a",
        "buffer",
        "Lcom/google/android/filament/utils/KTX1Loader$Options;",
        "options",
        "Lcom/google/android/filament/IndirectLight;",
        "b",
        "Lcom/google/android/filament/Skybox;",
        "d",
        "sceneview_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public static final a(Lcom/google/android/filament/utils/KTX1Loader;Landroidx/lifecycle/f;Ljava/nio/Buffer;Ljava/nio/Buffer;)LLj2;
    .locals 8
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, LMj2;->c(Lcom/google/android/filament/utils/KTX1Loader;Landroidx/lifecycle/f;Ljava/nio/Buffer;Lcom/google/android/filament/utils/KTX1Loader$Options;ILjava/lang/Object;)Lcom/google/android/filament/IndirectLight;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/nio/Buffer;->rewind()Ljava/nio/Buffer;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p0, p2}, Lcom/google/android/filament/utils/KTX1Loader;->getSphericalHarmonics(Ljava/nio/Buffer;)[F

    move-result-object p2

    goto :goto_1

    :cond_1
    move-object p2, v0

    :goto_1
    if-eqz p3, :cond_2

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    invoke-static/range {v2 .. v7}, LMj2;->e(Lcom/google/android/filament/utils/KTX1Loader;Landroidx/lifecycle/f;Ljava/nio/Buffer;Lcom/google/android/filament/utils/KTX1Loader$Options;ILjava/lang/Object;)Lcom/google/android/filament/Skybox;

    move-result-object v0

    :cond_2
    new-instance p0, LLj2;

    invoke-direct {p0, v1, v0, p2}, LLj2;-><init>(Lcom/google/android/filament/IndirectLight;Lcom/google/android/filament/Skybox;[F)V

    return-object p0
.end method

.method public static final b(Lcom/google/android/filament/utils/KTX1Loader;Landroidx/lifecycle/f;Ljava/nio/Buffer;Lcom/google/android/filament/utils/KTX1Loader$Options;)Lcom/google/android/filament/IndirectLight;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buffer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ldl1;->c()Lcom/google/android/filament/Engine;

    move-result-object v0

    invoke-virtual {p0, v0, p2, p3}, Lcom/google/android/filament/utils/KTX1Loader;->createIndirectLight(Lcom/google/android/filament/Engine;Ljava/nio/Buffer;Lcom/google/android/filament/utils/KTX1Loader$Options;)Lcom/google/android/filament/IndirectLight;

    move-result-object p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    new-instance v6, LMj2$a;

    invoke-direct {v6, p0, p2}, LMj2$a;-><init>(Lcom/google/android/filament/utils/KTX1Loader;Lcom/google/android/filament/IndirectLight;)V

    const/16 v7, 0x1f

    const/4 v8, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v8}, Lcom/gorisse/thomas/lifecycle/LifecycleKt;->b(Landroidx/lifecycle/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-object p2
.end method

.method public static synthetic c(Lcom/google/android/filament/utils/KTX1Loader;Landroidx/lifecycle/f;Ljava/nio/Buffer;Lcom/google/android/filament/utils/KTX1Loader$Options;ILjava/lang/Object;)Lcom/google/android/filament/IndirectLight;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    new-instance p3, Lcom/google/android/filament/utils/KTX1Loader$Options;

    invoke-direct {p3}, Lcom/google/android/filament/utils/KTX1Loader$Options;-><init>()V

    :cond_0
    invoke-static {p0, p1, p2, p3}, LMj2;->b(Lcom/google/android/filament/utils/KTX1Loader;Landroidx/lifecycle/f;Ljava/nio/Buffer;Lcom/google/android/filament/utils/KTX1Loader$Options;)Lcom/google/android/filament/IndirectLight;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/google/android/filament/utils/KTX1Loader;Landroidx/lifecycle/f;Ljava/nio/Buffer;Lcom/google/android/filament/utils/KTX1Loader$Options;)Lcom/google/android/filament/Skybox;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buffer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ldl1;->c()Lcom/google/android/filament/Engine;

    move-result-object v0

    invoke-virtual {p0, v0, p2, p3}, Lcom/google/android/filament/utils/KTX1Loader;->createSkybox(Lcom/google/android/filament/Engine;Ljava/nio/Buffer;Lcom/google/android/filament/utils/KTX1Loader$Options;)Lcom/google/android/filament/Skybox;

    move-result-object p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    new-instance v6, LMj2$b;

    invoke-direct {v6, p0, p2}, LMj2$b;-><init>(Lcom/google/android/filament/utils/KTX1Loader;Lcom/google/android/filament/Skybox;)V

    const/16 v7, 0x1f

    const/4 v8, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v8}, Lcom/gorisse/thomas/lifecycle/LifecycleKt;->b(Landroidx/lifecycle/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-object p2
.end method

.method public static synthetic e(Lcom/google/android/filament/utils/KTX1Loader;Landroidx/lifecycle/f;Ljava/nio/Buffer;Lcom/google/android/filament/utils/KTX1Loader$Options;ILjava/lang/Object;)Lcom/google/android/filament/Skybox;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    new-instance p3, Lcom/google/android/filament/utils/KTX1Loader$Options;

    invoke-direct {p3}, Lcom/google/android/filament/utils/KTX1Loader$Options;-><init>()V

    :cond_0
    invoke-static {p0, p1, p2, p3}, LMj2;->d(Lcom/google/android/filament/utils/KTX1Loader;Landroidx/lifecycle/f;Ljava/nio/Buffer;Lcom/google/android/filament/utils/KTX1Loader$Options;)Lcom/google/android/filament/Skybox;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lcom/google/android/filament/utils/KTX1Loader;Landroid/content/Context;Landroidx/lifecycle/f;Ljava/lang/String;Ljava/lang/String;)Lwf1;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iblKtxFileLocation"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, LmM4;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/nio/ByteBuffer;

    move-result-object p3

    if-eqz p4, :cond_0

    invoke-static {p1, p4}, LmM4;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/nio/ByteBuffer;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p0, p2, p3, p1}, LMj2;->a(Lcom/google/android/filament/utils/KTX1Loader;Landroidx/lifecycle/f;Ljava/nio/Buffer;Ljava/nio/Buffer;)LLj2;

    move-result-object p0

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    :cond_2
    return-object p0
.end method

.method public static synthetic g(Lcom/google/android/filament/utils/KTX1Loader;Landroid/content/Context;Landroidx/lifecycle/f;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lwf1;
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, LMj2;->f(Lcom/google/android/filament/utils/KTX1Loader;Landroid/content/Context;Landroidx/lifecycle/f;Ljava/lang/String;Ljava/lang/String;)Lwf1;

    move-result-object p0

    return-object p0
.end method
