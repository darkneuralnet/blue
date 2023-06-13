.class public final Lcom/airbnb/mvrx/FlowExtensionsKt$assertOneActiveSubscription$observer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVX0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/mvrx/FlowExtensionsKt;->b(LEu1;LLifecycleOwner;Ljava/util/Set;Ljava/lang/String;)LEu1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "com/airbnb/mvrx/FlowExtensionsKt$assertOneActiveSubscription$observer$1",
        "LVX0;",
        "LLifecycleOwner;",
        "owner",
        "",
        "onCreate",
        "onDestroy",
        "mvrx_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/Set;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$assertOneActiveSubscription$observer$1;->b:Ljava/util/Set;

    iput-object p2, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$assertOneActiveSubscription$observer$1;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$assertOneActiveSubscription$observer$1;->b:Ljava/util/Set;

    iget-object v0, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$assertOneActiveSubscription$observer$1;->c:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$assertOneActiveSubscription$observer$1;->b:Ljava/util/Set;

    iget-object v0, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$assertOneActiveSubscription$observer$1;->c:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object v0, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$assertOneActiveSubscription$observer$1;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/airbnb/mvrx/FlowExtensionsKt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onDestroy(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$assertOneActiveSubscription$observer$1;->b:Ljava/util/Set;

    iget-object v0, p0, Lcom/airbnb/mvrx/FlowExtensionsKt$assertOneActiveSubscription$observer$1;->c:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method
