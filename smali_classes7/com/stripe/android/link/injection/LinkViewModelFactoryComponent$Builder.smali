.class public interface abstract Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Component$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008g\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0012\u0010\u0006\u001a\u00020\u00002\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u0018\u0010\u0008\u001a\u00020\u00002\u000e\u0008\u0001\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\'J\u0018\u0010\u000b\u001a\u00020\u00002\u000e\u0008\u0001\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000cH\'J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH\'J\u001a\u0010\u000f\u001a\u00020\u00002\u0010\u0008\u0001\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000cH\'\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;",
        "",
        "build",
        "Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent;",
        "context",
        "Landroid/content/Context;",
        "enableLogging",
        "",
        "productUsage",
        "",
        "",
        "publishableKeyProvider",
        "Lkotlin/Function0;",
        "starterArgs",
        "Lcom/stripe/android/link/LinkActivityContract$Args;",
        "stripeAccountIdProvider",
        "link_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract build()Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent;
.end method

.method public abstract context(Landroid/content/Context;)Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract enableLogging(Z)Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract productUsage(Ljava/util/Set;)Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;"
        }
    .end annotation
.end method

.method public abstract publishableKeyProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;"
        }
    .end annotation
.end method

.method public abstract starterArgs(Lcom/stripe/android/link/LinkActivityContract$Args;)Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract stripeAccountIdProvider(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/link/injection/LinkViewModelFactoryComponent$Builder;"
        }
    .end annotation
.end method
