.class public final Lv65;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llv1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B/\u0008\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u0013\u0012\u0008\u0008\u0001\u0010\u001a\u001a\u00020\u0017\u0012\u0008\u0008\u0001\u0010\u001e\u001a\u00020\u001b\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006H\u0016J\u000e\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0006H\u0016J\u000e\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\u0010\u0010\"\u00a8\u0006&"
    }
    d2 = {
        "Lv65;",
        "Llv1;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "Lio/reactivex/Observable;",
        "",
        "Bk",
        "",
        "g7",
        "LEi0;",
        "m7",
        "LGi0;",
        "rc",
        "LVa5;",
        "b",
        "LVa5;",
        "presenterFactory",
        "Lcom/uber/autodispose/ScopeProvider;",
        "c",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "LZa5;",
        "d",
        "LZa5;",
        "ui",
        "Lco/bird/android/model/ridertutorial/TutorialKind;",
        "e",
        "Lco/bird/android/model/ridertutorial/TutorialKind;",
        "tutorialKind",
        "LOa5;",
        "f",
        "Lkotlin/Lazy;",
        "()LOa5;",
        "presenter",
        "<init>",
        "(LVa5;Lcom/uber/autodispose/ScopeProvider;LZa5;Lco/bird/android/model/ridertutorial/TutorialKind;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:LVa5;

.field public final c:Lcom/uber/autodispose/ScopeProvider;

.field public final d:LZa5;

.field public final e:Lco/bird/android/model/ridertutorial/TutorialKind;

.field public final f:Lkotlin/Lazy;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LVa5;Lcom/uber/autodispose/ScopeProvider;LZa5;Lco/bird/android/model/ridertutorial/TutorialKind;)V
    .locals 1

    const-string v0, "presenterFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tutorialKind"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv65;->b:LVa5;

    iput-object p2, p0, Lv65;->c:Lcom/uber/autodispose/ScopeProvider;

    iput-object p3, p0, Lv65;->d:LZa5;

    iput-object p4, p0, Lv65;->e:Lco/bird/android/model/ridertutorial/TutorialKind;

    new-instance p1, Lv65$a;

    invoke-direct {p1, p0}, Lv65$a;-><init>(Lv65;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lv65;->f:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lv65;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getPresenterFactory$p(Lv65;)LVa5;
    .locals 0

    iget-object p0, p0, Lv65;->b:LVa5;

    return-object p0
.end method

.method public static final synthetic access$getScopeProvider$p(Lv65;)Lcom/uber/autodispose/ScopeProvider;
    .locals 0

    iget-object p0, p0, Lv65;->c:Lcom/uber/autodispose/ScopeProvider;

    return-object p0
.end method

.method public static final synthetic access$getUi$p(Lv65;)LZa5;
    .locals 0

    iget-object p0, p0, Lv65;->d:LZa5;

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public Bk()Lio/reactivex/Observable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lv65;->b()LOa5;

    move-result-object v0

    invoke-interface {v0}, LOa5;->observeDone()Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, Lv65$b;->g:Lv65$b;

    new-instance v2, Lu65;

    invoke-direct {v2, v1}, Lu65;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "presenter.observeDone().map { true }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final b()LOa5;
    .locals 1

    iget-object v0, p0, Lv65;->f:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LOa5;

    return-object v0
.end method

.method public g7()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "just(true)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public m7()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LEi0;",
            ">;"
        }
    .end annotation

    sget-object v0, LEi0;->d:LEi0;

    invoke-static {v0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "just(CheckoutProceedType.NONE)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Llv1$a;->b(Llv1;IILandroid/content/Intent;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-virtual {p0}, Lv65;->b()LOa5;

    move-result-object p1

    iget-object v0, p0, Lv65;->e:Lco/bird/android/model/ridertutorial/TutorialKind;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, LOa5$a;->onCreate$default(LOa5;Lco/bird/android/model/ridertutorial/TutorialKind;Lco/bird/android/model/constant/BirdModel;ILjava/lang/Object;)V

    return-void
.end method

.method public onDestroy()V
    .locals 0

    invoke-static {p0}, Llv1$a;->d(Llv1;)V

    return-void
.end method

.method public onLowMemory()V
    .locals 0

    invoke-static {p0}, Llv1$a;->e(Llv1;)V

    return-void
.end method

.method public onPause()V
    .locals 0

    invoke-static {p0}, Llv1$a;->f(Llv1;)V

    return-void
.end method

.method public onResume()V
    .locals 0

    invoke-static {p0}, Llv1$a;->g(Llv1;)V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1}, Llv1$a;->h(Llv1;Landroid/os/Bundle;)V

    return-void
.end method

.method public onStart()V
    .locals 0

    invoke-static {p0}, Llv1$a;->i(Llv1;)V

    return-void
.end method

.method public onStop()V
    .locals 0

    invoke-static {p0}, Llv1$a;->j(Llv1;)V

    return-void
.end method

.method public rc()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LGi0;",
            ">;"
        }
    .end annotation

    sget-object v0, LGi0;->d:LGi0;

    invoke-static {v0}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "just(CheckoutReverseType.NONE)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public z5()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Llv1$a;->a(Llv1;)Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method
