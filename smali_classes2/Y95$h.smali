.class public final LY95$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY95;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/RideState;",
        "Lio/reactivex/u<",
        "+",
        "LDU2;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/RideState;",
        "rideState",
        "Lio/reactivex/u;",
        "LDU2;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/RideState;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LY95;


# direct methods
.method public constructor <init>(LY95;)V
    .locals 0

    iput-object p1, p0, LY95$h;->g:LY95;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/RideState;)Lio/reactivex/u;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/RideState;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "LDU2;",
            ">;"
        }
    .end annotation

    const-string v0, "rideState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LY95$h;->g:LY95;

    invoke-static {v0}, LY95;->access$getEvents$p(LY95;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/RideState;->getStatus()Lco/bird/android/model/RideState$Status;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LY95$h;->g:LY95;

    invoke-static {v0}, LY95;->access$getAutoPayPresenter$p(LY95;)Ldagger/Lazy;

    move-result-object v1

    invoke-interface {v1}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "autoPayPresenter.get()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lca5;

    iget-object v2, p0, LY95$h;->g:LY95;

    invoke-virtual {v2}, LxC;->t()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v2

    iget-object v3, p0, LY95$h;->g:LY95;

    invoke-static {v3}, LY95;->access$getActivity$p(LY95;)Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v3

    invoke-static {v0, v1, p1, v2, v3}, LY95;->access$maybeShowModal(LY95;Lca5;Lco/bird/android/model/RideState;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/core/mvp/BaseActivity;)Lio/reactivex/p;

    move-result-object v0

    iget-object v1, p0, LY95$h;->g:LY95;

    invoke-static {v1}, LY95;->access$getReactiveConfig$p(LY95;)LTq4;

    move-result-object v1

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getTutorialV2()Lco/bird/android/model/wire/configs/TutorialV2Config;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/TutorialV2Config;->getEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, LY95$h;->g:LY95;

    invoke-static {v1, p1}, LY95;->access$maybeShowTutorialV2(LY95;Lco/bird/android/model/RideState;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v1, p0, LY95$h;->g:LY95;

    invoke-static {v1}, LY95;->access$getTutorialPresenter$p(LY95;)Ldagger/Lazy;

    move-result-object v2

    invoke-interface {v2}, Ldagger/Lazy;->get()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "tutorialPresenter.get()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lca5;

    iget-object v3, p0, LY95$h;->g:LY95;

    invoke-virtual {v3}, LxC;->t()Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v3

    iget-object v4, p0, LY95$h;->g:LY95;

    invoke-static {v4}, LY95;->access$getActivity$p(LY95;)Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v4

    invoke-static {v1, v2, p1, v3, v4}, LY95;->access$maybeShowModal(LY95;Lca5;Lco/bird/android/model/RideState;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/core/mvp/BaseActivity;)Lio/reactivex/p;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Lio/reactivex/p;->V(Lio/reactivex/u;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/RideState;

    invoke-virtual {p0, p1}, LY95$h;->a(Lco/bird/android/model/RideState;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
