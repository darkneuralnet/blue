.class public final Lco/bird/android/app/feature/autopay/a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/autopay/a;->a(Lco/bird/android/model/RideState;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/core/mvp/BaseActivity;)Lio/reactivex/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/Balance;",
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
        "Lco/bird/android/model/Balance;",
        "balance",
        "Lio/reactivex/u;",
        "LDU2;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/Balance;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/configs/RideConfig;

.field public final synthetic h:Lco/bird/android/app/feature/autopay/a;

.field public final synthetic i:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:Lco/bird/android/core/mvp/BaseActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/app/feature/autopay/a;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/core/mvp/BaseActivity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/configs/RideConfig;",
            "Lco/bird/android/app/feature/autopay/a;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Lco/bird/android/core/mvp/BaseActivity;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/app/feature/autopay/a$a;->g:Lco/bird/android/model/wire/configs/RideConfig;

    iput-object p2, p0, Lco/bird/android/app/feature/autopay/a$a;->h:Lco/bird/android/app/feature/autopay/a;

    iput-object p3, p0, Lco/bird/android/app/feature/autopay/a$a;->i:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    iput-object p4, p0, Lco/bird/android/app/feature/autopay/a$a;->j:Lco/bird/android/core/mvp/BaseActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/Balance;)Lio/reactivex/u;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Balance;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "LDU2;",
            ">;"
        }
    .end annotation

    const-string v0, "balance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/autopay/a$a;->g:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getAutoPayPromptFirst()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Lco/bird/android/app/feature/autopay/a$a;->g:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getAutoPayRefillAmount()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/Balance;->getAutoPayAskedAt()Lorg/joda/time/DateTime;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lco/bird/android/app/feature/autopay/a$a;->h:Lco/bird/android/app/feature/autopay/a;

    iget-object v0, p0, Lco/bird/android/app/feature/autopay/a$a;->i:Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    iget-object v2, p0, Lco/bird/android/app/feature/autopay/a$a;->j:Lco/bird/android/core/mvp/BaseActivity;

    invoke-virtual {p1, v0, v2, v1}, Lco/bird/android/app/feature/autopay/a;->d(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Lco/bird/android/core/mvp/BaseActivity;Z)LDU2;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/autopay/a$a;->g:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getAutoPayPromptFirst()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lco/bird/android/app/feature/autopay/a$a;->g:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getAutoPayRefillAmount()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/Balance;->getAutoPayAskedAt()Lorg/joda/time/DateTime;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lco/bird/android/app/feature/autopay/a$a;->g:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RideConfig;->getAutoPayExpName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 p1, 0x2

    new-array p1, p1, [Lio/reactivex/c;

    iget-object v0, p0, Lco/bird/android/app/feature/autopay/a$a;->h:Lco/bird/android/app/feature/autopay/a;

    invoke-static {v0}, Lco/bird/android/app/feature/autopay/a;->access$getExperimentManager$p(Lco/bird/android/app/feature/autopay/a;)Lqi1;

    move-result-object v0

    iget-object v2, p0, Lco/bird/android/app/feature/autopay/a$a;->g:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/RideConfig;->getAutoPayExpName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Lqi1;->a(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object v0

    const/4 v2, 0x0

    aput-object v0, p1, v2

    iget-object v0, p0, Lco/bird/android/app/feature/autopay/a$a;->h:Lco/bird/android/app/feature/autopay/a;

    invoke-static {v0}, Lco/bird/android/app/feature/autopay/a;->access$getUserManager$p(Lco/bird/android/app/feature/autopay/a;)Llh6;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Llh6$a;->updateAutoPay$default(Llh6;ZZLjava/lang/String;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/F;->h0()Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object v0

    aput-object v0, p1, v1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lio/reactivex/c;->L(Ljava/lang/Iterable;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->k(Lio/reactivex/u;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Balance;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/autopay/a$a;->a(Lco/bird/android/model/Balance;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
