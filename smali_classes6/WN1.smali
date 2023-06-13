.class public final LWN1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0016\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u001b\u0010\u000c\u001a\u00020\u00088FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\t\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\t\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0019"
    }
    d2 = {
        "LWN1;",
        "",
        "Lcom/google/android/filament/Texture;",
        "skybox",
        "kotlin.jvm.PlatformType",
        "e",
        "",
        "a",
        "Lcom/google/android/filament/utils/IBLPrefilterContext;",
        "Lkotlin/Lazy;",
        "b",
        "()Lcom/google/android/filament/utils/IBLPrefilterContext;",
        "context",
        "Lcom/google/android/filament/utils/IBLPrefilterContext$EquirectangularToCubemap;",
        "c",
        "()Lcom/google/android/filament/utils/IBLPrefilterContext$EquirectangularToCubemap;",
        "equirectangularToCubemap",
        "Lcom/google/android/filament/utils/IBLPrefilterContext$SpecularFilter;",
        "d",
        "()Lcom/google/android/filament/utils/IBLPrefilterContext$SpecularFilter;",
        "specularFilter",
        "Lcom/google/android/filament/Engine;",
        "engine",
        "<init>",
        "(Lcom/google/android/filament/Engine;)V",
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
.field public final a:Lkotlin/Lazy;

.field public final b:Lkotlin/Lazy;

.field public final c:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/google/android/filament/Engine;)V
    .locals 1

    const-string v0, "engine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LWN1$a;

    invoke-direct {v0, p1}, LWN1$a;-><init>(Lcom/google/android/filament/Engine;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LWN1;->a:Lkotlin/Lazy;

    new-instance p1, LWN1$b;

    invoke-direct {p1, p0}, LWN1$b;-><init>(LWN1;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LWN1;->b:Lkotlin/Lazy;

    new-instance p1, LWN1$c;

    invoke-direct {p1, p0}, LWN1$c;-><init>(LWN1;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LWN1;->c:Lkotlin/Lazy;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-virtual {p0}, LWN1;->d()Lcom/google/android/filament/utils/IBLPrefilterContext$SpecularFilter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/utils/IBLPrefilterContext$SpecularFilter;->destroy()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    :try_start_1
    invoke-virtual {p0}, LWN1;->c()Lcom/google/android/filament/utils/IBLPrefilterContext$EquirectangularToCubemap;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/utils/IBLPrefilterContext$EquirectangularToCubemap;->destroy()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    :try_start_2
    invoke-virtual {p0}, LWN1;->b()Lcom/google/android/filament/utils/IBLPrefilterContext;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/utils/IBLPrefilterContext;->destroy()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    return-void
.end method

.method public final b()Lcom/google/android/filament/utils/IBLPrefilterContext;
    .locals 1

    iget-object v0, p0, LWN1;->a:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/filament/utils/IBLPrefilterContext;

    return-object v0
.end method

.method public final c()Lcom/google/android/filament/utils/IBLPrefilterContext$EquirectangularToCubemap;
    .locals 1

    iget-object v0, p0, LWN1;->b:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/filament/utils/IBLPrefilterContext$EquirectangularToCubemap;

    return-object v0
.end method

.method public final d()Lcom/google/android/filament/utils/IBLPrefilterContext$SpecularFilter;
    .locals 1

    iget-object v0, p0, LWN1;->c:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/filament/utils/IBLPrefilterContext$SpecularFilter;

    return-object v0
.end method

.method public final e(Lcom/google/android/filament/Texture;)Lcom/google/android/filament/Texture;
    .locals 1

    const-string v0, "skybox"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LWN1;->d()Lcom/google/android/filament/utils/IBLPrefilterContext$SpecularFilter;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/filament/utils/IBLPrefilterContext$SpecularFilter;->run(Lcom/google/android/filament/Texture;)Lcom/google/android/filament/Texture;

    move-result-object p1

    return-object p1
.end method
