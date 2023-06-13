.class public final LTJ4$f$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTJ4$f;->c(Lkotlin/Pair;)Lio/reactivex/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;",
        "kotlin.jvm.PlatformType",
        "status",
        "",
        "a",
        "(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRequirementPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequirementPresenter.kt\nco/bird/android/app/feature/ride/presenter/RequirementPresenterImpl$go$5$1\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,664:1\n218#2:665\n*S KotlinDebug\n*F\n+ 1 RequirementPresenter.kt\nco/bird/android/app/feature/ride/presenter/RequirementPresenterImpl$go$5$1\n*L\n403#1:665\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LgU1;

.field public final synthetic h:LTJ4;


# direct methods
.method public constructor <init>(LgU1;LTJ4;)V
    .locals 0

    iput-object p1, p0, LTJ4$f$a;->g:LgU1;

    iput-object p2, p0, LTJ4$f$a;->h:LTJ4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V
    .locals 1

    iget-object p1, p0, LTJ4$f$a;->g:LgU1;

    invoke-virtual {p1}, Lcom/google/android/material/bottomsheet/b;->dismiss()V

    iget-object p1, p0, LTJ4$f$a;->h:LTJ4;

    invoke-static {p1}, LTJ4;->access$checkRequirementsInternal(LTJ4;)Lio/reactivex/p;

    move-result-object p1

    iget-object v0, p0, LTJ4$f$a;->h:LTJ4;

    invoke-static {v0}, LTJ4;->access$getScopeProvider$p(LTJ4;)Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/p;->b(Lio/reactivex/q;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/MaybeSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/MaybeSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;

    invoke-virtual {p0, p1}, LTJ4$f$a;->a(Lco/bird/android/model/identification/IdentificationIntentPermissionStatus;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
