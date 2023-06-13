.class public final LQA1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ+\u0010\u0008\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0016\u0010\u000c\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0006\u0010\u000b\u001a\u00020\n\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000f"
    }
    d2 = {
        "LQA1;",
        "",
        "Landroid/content/Context;",
        "context",
        "",
        "glbFileLocation",
        "Lcom/google/android/filament/gltfio/FilamentAsset;",
        "Lio/github/sceneview/model/Model;",
        "b",
        "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Ljava/nio/Buffer;",
        "buffer",
        "a",
        "<init>",
        "()V",
        "sceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final a:LQA1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LQA1;

    invoke-direct {v0}, LQA1;-><init>()V

    sput-object v0, LQA1;->a:LQA1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/nio/Buffer;)Lcom/google/android/filament/gltfio/FilamentAsset;
    .locals 1

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ldl1;->b()Lcom/google/android/filament/gltfio/AssetLoader;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/filament/gltfio/AssetLoader;->createAsset(Ljava/nio/Buffer;)Lcom/google/android/filament/gltfio/FilamentAsset;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {}, Ldl1;->i()Lcom/google/android/filament/gltfio/ResourceLoader;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/filament/gltfio/ResourceLoader;->loadResources(Lcom/google/android/filament/gltfio/FilamentAsset;)Lcom/google/android/filament/gltfio/ResourceLoader;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final b(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/google/android/filament/gltfio/FilamentAsset;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LQA1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LQA1$a;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, p2, v0, p3}, LmM4;->d(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
