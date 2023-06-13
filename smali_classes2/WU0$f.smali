.class public final LWU0$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWU0;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "input",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDebugPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugPresenter.kt\nco/bird/android/app/feature/settings/settings/DebugPresenterImpl$showMotMotDialog$1\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,158:1\n237#2:159\n*S KotlinDebug\n*F\n+ 1 DebugPresenter.kt\nco/bird/android/app/feature/settings/settings/DebugPresenterImpl$showMotMotDialog$1\n*L\n112#1:159\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LWU0;


# direct methods
.method public constructor <init>(LWU0;)V
    .locals 0

    iput-object p1, p0, LWU0$f;->g:LWU0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LWU0$f;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(LWU0;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, LWU0$f;->c(LWU0;Ljava/lang/String;)V

    return-void
.end method

.method public static final c(LWU0;Ljava/lang/String;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LWU0;->access$getNavigator$p(LWU0;)Le13;

    move-result-object p0

    invoke-interface {p0, p1}, Le13;->f0(Ljava/lang/String;)V

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LWU0$f;->invoke(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 3

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LWU0$f;->g:LWU0;

    invoke-static {v0}, LWU0;->access$getWebArchiveManager$p(LWU0;)LAz6;

    move-result-object v0

    invoke-interface {v0, p1}, LAz6;->b(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, LWU0$f;->g:LWU0;

    invoke-static {v1}, LWU0;->access$getScopeProvider$p(LWU0;)Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v1

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/CompletableSubscribeProxy;

    iget-object v1, p0, LWU0$f;->g:LWU0;

    new-instance v2, LXU0;

    invoke-direct {v2, v1, p1}, LXU0;-><init>(LWU0;Ljava/lang/String;)V

    new-instance p1, LWU0$f$a;

    iget-object v1, p0, LWU0$f;->g:LWU0;

    invoke-direct {p1, v1}, LWU0$f$a;-><init>(LWU0;)V

    new-instance v1, LYU0;

    invoke-direct {v1, p1}, LYU0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2, v1}, Lcom/uber/autodispose/CompletableSubscribeProxy;->e(Lio/reactivex/functions/a;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method
