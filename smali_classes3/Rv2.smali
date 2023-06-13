.class public final LRv2;
.super Lf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf1<",
        "LSv2;",
        "LTv2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0008\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#\u00a8\u0006\'"
    }
    d2 = {
        "LRv2;",
        "Lf1;",
        "LSv2;",
        "LTv2;",
        "renderer",
        "",
        "r",
        "LEa;",
        "e",
        "LEa;",
        "analyticsManager",
        "Le13;",
        "f",
        "Le13;",
        "navigator",
        "Lgl;",
        "g",
        "Lgl;",
        "preference",
        "Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;",
        "h",
        "Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;",
        "autocompleteSupportFragment",
        "",
        "i",
        "Lkotlin/Lazy;",
        "w",
        "()Ljava/lang/String;",
        "sessionId",
        "",
        "j",
        "Z",
        "attemptedPlaceSearch",
        "Lg46$b;",
        "v",
        "()Lg46$b;",
        "logger",
        "<init>",
        "(LEa;Le13;Lgl;Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;)V",
        "locals-survey_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLocalsSurveyPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalsSurveyPresenter.kt\nco/bird/android/feature/localssurvey/LocalsSurveyPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,121:1\n180#2:122\n180#2:123\n180#2:124\n*S KotlinDebug\n*F\n+ 1 LocalsSurveyPresenter.kt\nco/bird/android/feature/localssurvey/LocalsSurveyPresenter\n*L\n36#1:122\n104#1:123\n113#1:124\n*E\n"
    }
.end annotation


# instance fields
.field public final e:LEa;

.field public final f:Le13;

.field public final g:Lgl;

.field public final h:Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

.field public final i:Lkotlin/Lazy;

.field public j:Z


# direct methods
.method public constructor <init>(LEa;Le13;Lgl;Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;)V
    .locals 1

    const-string v0, "analyticsManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preference"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autocompleteSupportFragment"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li22;->a:Li22;

    invoke-direct {p0, v0}, Lf1;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LRv2;->e:LEa;

    iput-object p2, p0, LRv2;->f:Le13;

    iput-object p3, p0, LRv2;->g:Lgl;

    iput-object p4, p0, LRv2;->h:Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    sget-object p1, LRv2$f;->g:LRv2$f;

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LRv2;->i:Lkotlin/Lazy;

    return-void
.end method

.method public static final synthetic access$getAnalyticsManager$p(LRv2;)LEa;
    .locals 0

    iget-object p0, p0, LRv2;->e:LEa;

    return-object p0
.end method

.method public static final synthetic access$getAttemptedPlaceSearch$p(LRv2;)Z
    .locals 0

    iget-boolean p0, p0, LRv2;->j:Z

    return p0
.end method

.method public static final synthetic access$getAutocompleteSupportFragment$p(LRv2;)Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;
    .locals 0

    iget-object p0, p0, LRv2;->h:Lcom/google/android/libraries/places/widget/AutocompleteSupportFragment;

    return-object p0
.end method

.method public static final synthetic access$getLogger(LRv2;)Lg46$b;
    .locals 0

    invoke-virtual {p0}, LRv2;->v()Lg46$b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getNavigator$p(LRv2;)Le13;
    .locals 0

    iget-object p0, p0, LRv2;->f:Le13;

    return-object p0
.end method

.method public static final synthetic access$getPreference$p(LRv2;)Lgl;
    .locals 0

    iget-object p0, p0, LRv2;->g:Lgl;

    return-object p0
.end method

.method public static final synthetic access$getSessionId(LRv2;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, LRv2;->w()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setAttemptedPlaceSearch$p(LRv2;Z)V
    .locals 0

    iput-boolean p1, p0, LRv2;->j:Z

    return-void
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LRv2;->u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LRv2;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LRv2;->t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LRv2;->s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LRv2;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic consume(Lrx4;)V
    .locals 0

    check-cast p1, LSv2;

    invoke-virtual {p0, p1}, LRv2;->r(LSv2;)V

    return-void
.end method

.method public r(LSv2;)V
    .locals 5

    const-string v0, "renderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lf1;->consume(Lrx4;)V

    invoke-virtual {p0}, Lf1;->l()Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v1

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, LRv2$a;

    invoke-direct {v2, p0}, LRv2$a;-><init>(LRv2;)V

    new-instance v3, LMv2;

    invoke-direct {v3, v2}, LMv2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p1}, LSv2;->w8()Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v2

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, LRv2$b;

    invoke-direct {v2, p0}, LRv2$b;-><init>(LRv2;)V

    new-instance v3, LNv2;

    invoke-direct {v3, v2}, LNv2;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v2, LRv2$c;

    invoke-direct {v2, p0}, LRv2$c;-><init>(LRv2;)V

    new-instance v4, LOv2;

    invoke-direct {v4, v2}, LOv2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3, v4}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    invoke-interface {p1}, LSv2;->L()Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, LRv2$d;

    invoke-direct {v0, p0}, LRv2$d;-><init>(LRv2;)V

    new-instance v1, LPv2;

    invoke-direct {v1, v0}, LPv2;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v0, LRv2$e;

    invoke-direct {v0, p0}, LRv2$e;-><init>(LRv2;)V

    new-instance v2, LQv2;

    invoke-direct {v2, v0}, LQv2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final v()Lg46$b;
    .locals 2

    const-string v0, "LocalsSurvey"

    invoke-static {v0}, Lg46;->k(Ljava/lang/String;)Lg46$b;

    move-result-object v0

    const-string v1, "tag(\"LocalsSurvey\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final w()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LRv2;->i:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
