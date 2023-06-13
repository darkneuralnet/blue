.class public final Lcom/stripe/android/core/injection/CoroutineContextModule;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0007J\u0008\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/stripe/android/core/injection/CoroutineContextModule;",
        "",
        "()V",
        "provideUIContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "provideWorkContext",
        "stripe-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final provideUIContext()Lkotlin/coroutines/CoroutineContext;
    .locals 1
    .annotation runtime Lcom/stripe/android/core/injection/UIContext;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    invoke-static {}, LT41;->c()LpG2;

    move-result-object v0

    return-object v0
.end method

.method public final provideWorkContext()Lkotlin/coroutines/CoroutineContext;
    .locals 1
    .annotation runtime Lcom/stripe/android/core/injection/IOContext;
    .end annotation

    .annotation runtime Ldagger/Provides;
    .end annotation

    invoke-static {}, LT41;->b()LSC0;

    move-result-object v0

    return-object v0
.end method
