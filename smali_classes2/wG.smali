.class public final LwG;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUa5$b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B%\u0008\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0008\u0001\u0010\u000c\u001a\u00020\t\u0012\u0008\u0008\u0001\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004H\u0016R\u0014\u0010\u0008\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0007R\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0013"
    }
    d2 = {
        "LwG;",
        "LUa5$b;",
        "",
        "a",
        "Lio/reactivex/Observable;",
        "closeImmediately",
        "Lfa5;",
        "Lfa5;",
        "riderProfileManager",
        "Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;",
        "b",
        "Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;",
        "beginnerModeTopView",
        "Lcom/uber/autodispose/ScopeProvider;",
        "c",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "<init>",
        "(Lfa5;Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;Lcom/uber/autodispose/ScopeProvider;)V",
        "app_birdRelease"
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
        "SMAP\nBeginnerModeTopViewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginnerModeTopViewPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/BeginnerModeTopViewPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,42:1\n180#2:43\n*S KotlinDebug\n*F\n+ 1 BeginnerModeTopViewPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/BeginnerModeTopViewPresenterImpl\n*L\n30#1:43\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lfa5;

.field public final b:Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;

.field public final c:Lcom/uber/autodispose/ScopeProvider;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lfa5;Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;Lcom/uber/autodispose/ScopeProvider;)V
    .locals 1

    const-string v0, "riderProfileManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "beginnerModeTopView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LwG;->a:Lfa5;

    iput-object p2, p0, LwG;->b:Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;

    iput-object p3, p0, LwG;->c:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method

.method public static final synthetic access$getBeginnerModeTopView$p(LwG;)Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;
    .locals 0

    iget-object p0, p0, LwG;->b:Lco/bird/android/app/feature/ridertutorial/widget/BeginnerModeTopView;

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LwG;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, LwG;->a:Lfa5;

    invoke-interface {v0}, Lfa5;->a()LZ84;

    move-result-object v0

    invoke-static {v0}, LYf5;->S(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, LwG;->c:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, LwG$a;

    invoke-direct {v1, p0}, LwG$a;-><init>(LwG;)V

    new-instance v2, LvG;

    invoke-direct {v2, v1}, LvG;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public closeImmediately()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "empty<Unit>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
