.class public final LYs1$k;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYs1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "k"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\"\u0010\u0010\u001a\u0010\u0012\u000c\u0012\n \r*\u0004\u0018\u00010\u000c0\u000c0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0013\u001a\u0010\u0012\u000c\u0012\n \r*\u0004\u0018\u00010\u00110\u00110\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u000f\u00a8\u0006\u0018"
    }
    d2 = {
        "LYs1$k;",
        "Lw1;",
        "",
        "onAttachedToWindow",
        "",
        "position",
        "bind",
        "Lbc2;",
        "b",
        "Lbc2;",
        "binding",
        "Lio/reactivex/subjects/a;",
        "Lco/bird/android/model/constant/QuickCaptureState;",
        "kotlin.jvm.PlatformType",
        "c",
        "Lio/reactivex/subjects/a;",
        "stateSubject",
        "Lorg/joda/time/DateTime;",
        "d",
        "timeoutSubject",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LYs1;Landroid/view/View;)V",
        "flight-sheet_release"
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
        "SMAP\nFlightSheetV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$QuickCaptureViewHolder\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 4 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 5 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,669:1\n41#2:670\n180#3:671\n18#4:672\n18#4:678\n9#5,4:673\n9#5,4:679\n1#6:677\n*S KotlinDebug\n*F\n+ 1 FlightSheetV2Adapter.kt\nco/bird/android/flightsheet/v2/adapters/FlightSheetV2Adapter$QuickCaptureViewHolder\n*L\n334#1:670\n334#1:671\n353#1:672\n297#1:678\n353#1:673,4\n297#1:679,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lbc2;

.field public final c:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Lco/bird/android/model/constant/QuickCaptureState;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lio/reactivex/subjects/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/a<",
            "Lorg/joda/time/DateTime;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic e:LYs1;


# direct methods
.method public constructor <init>(LYs1;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYs1$k;->e:LYs1;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lbc2;->a(Landroid/view/View;)Lbc2;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYs1$k;->b:Lbc2;

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object p1

    const-string p2, "create<QuickCaptureState>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYs1$k;->c:Lio/reactivex/subjects/a;

    invoke-static {}, Lio/reactivex/subjects/a;->e()Lio/reactivex/subjects/a;

    move-result-object p1

    const-string p2, "create<DateTime>()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYs1$k;->d:Lio/reactivex/subjects/a;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, LYs1$k;->p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LYs1$k;->q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lorg/joda/time/DateTime;
    .locals 0

    invoke-static {p0, p1, p2}, LYs1$k;->o(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lorg/joda/time/DateTime;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, LYs1$k;->n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LYs1$k;->m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic k(LYs1$k;)Lbc2;
    .locals 0

    iget-object p0, p0, LYs1$k;->b:Lbc2;

    return-object p0
.end method

.method public static final synthetic l(LYs1$k;LYs1;)Lco/bird/android/model/QuickCaptureButton;
    .locals 0

    invoke-static {p0, p1}, LYs1$k;->r(LYs1$k;LYs1;)Lco/bird/android/model/QuickCaptureButton;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final o(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;)Lorg/joda/time/DateTime;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/joda/time/DateTime;

    return-object p0
.end method

.method public static final p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method

.method public static final q(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final r(LYs1$k;LYs1;)Lco/bird/android/model/QuickCaptureButton;
    .locals 1

    invoke-virtual {p0}, Lw1;->getSafePosition()Ljava/lang/Integer;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-static {p1}, LYs1;->access$getAdapterData(LYs1;)LE6;

    move-result-object p1

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-virtual {p1, p0}, LE6;->e(I)LG6;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, LG6;->c()Ljava/lang/Object;

    move-result-object p0

    instance-of p1, p0, Lco/bird/android/model/QuickCaptureButton;

    if-eqz p1, :cond_0

    move-object v0, p0

    :cond_0
    check-cast v0, Lco/bird/android/model/QuickCaptureButton;

    :cond_1
    return-object v0
.end method


# virtual methods
.method public bind(I)V
    .locals 6

    iget-object v0, p0, LYs1$k;->e:LYs1;

    invoke-static {v0}, LYs1;->access$getAdapterData(LYs1;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/QuickCaptureButton;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, Lco/bird/android/model/QuickCaptureButton;

    if-eqz p1, :cond_1

    iget-object v0, p0, LYs1$k;->e:LYs1;

    iget-object v2, p0, LYs1$k;->d:Lio/reactivex/subjects/a;

    invoke-virtual {p1}, Lco/bird/android/model/QuickCaptureButton;->getTimeout()Lorg/joda/time/DateTime;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    iget-object v2, p0, LYs1$k;->c:Lio/reactivex/subjects/a;

    invoke-virtual {p1}, Lco/bird/android/model/QuickCaptureButton;->getState()Lco/bird/android/model/constant/QuickCaptureState;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    iget-object v2, p0, LYs1$k;->b:Lbc2;

    iget-object v2, v2, Lbc2;->b:Landroid/widget/Button;

    invoke-virtual {p1}, Lco/bird/android/model/QuickCaptureButton;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v0}, LYs1;->access$getButtonsInProgress$p(LYs1;)Ljava/util/Set;

    move-result-object p1

    const-class v2, Lco/bird/android/model/QuickCaptureButton;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    iget-object v2, p0, LYs1$k;->b:Lbc2;

    iget-object v2, v2, Lbc2;->d:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    const-string v3, "binding.qcProgressBar"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v2, p1, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v2, p0, LYs1$k;->b:Lbc2;

    iget-object v2, v2, Lbc2;->b:Landroid/widget/Button;

    const-string v5, "binding.button"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    xor-int/lit8 p1, p1, 0x1

    invoke-static {v2, p1, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    invoke-static {v0}, LYs1;->access$getBottomSheet$p(LYs1;)Lco/bird/android/bottomsheet/BaseBottomSheet;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, LYs1$k;->b:Lbc2;

    invoke-virtual {v0}, Lbc2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "binding.root"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "quick_capture"

    invoke-virtual {p1, v1, v0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->n(Ljava/lang/CharSequence;Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 4

    iget-object v0, p0, LYs1$k;->b:Lbc2;

    iget-object v0, v0, Lbc2;->b:Landroid/widget/Button;

    const-string v1, "binding.button"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LYs1$k$a;

    iget-object v2, p0, LYs1$k;->e:LYs1;

    invoke-direct {v1, v2, p0}, LYs1$k$a;-><init>(LYs1;LYs1$k;)V

    invoke-static {v0, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, LYs1$k;->c:Lio/reactivex/subjects/a;

    invoke-virtual {v0}, Lio/reactivex/Observable;->distinctUntilChanged()Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, LYs1$k$b;

    iget-object v2, p0, LYs1$k;->e:LYs1;

    invoke-direct {v1, v2, p0}, LYs1$k$b;-><init>(LYs1;LYs1$k;)V

    new-instance v2, Lat1;

    invoke-direct {v2, v1}, Lat1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, LYs1$k$c;->g:LYs1$k$c;

    new-instance v2, Lbt1;

    invoke-direct {v2, v1}, Lbt1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v0

    const-wide/16 v1, 0x64

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lio/reactivex/Observable;->delay(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, LYs1$k;->d:Lio/reactivex/subjects/a;

    sget-object v2, LYs1$k$d;->g:LYs1$k$d;

    new-instance v3, Lct1;

    invoke-direct {v3, v2}, Lct1;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v0, v1, v3}, Lio/reactivex/Observable;->withLatestFrom(Lio/reactivex/B;Lio/reactivex/functions/c;)Lio/reactivex/Observable;

    move-result-object v0

    sget-object v1, LYs1$k$e;->g:LYs1$k$e;

    new-instance v2, Ldt1;

    invoke-direct {v2, v1}, Ldt1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->switchMap(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "class FlightSheetV2Adapt\u2026null)\n      }\n    }\n  }\n}"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LYs1$k;->b:Lbc2;

    invoke-virtual {v1}, Lbc2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    const-string v2, "binding.root"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/uber/autodispose/android/ViewScopeProvider;->a(Landroid/view/View;)Lcom/uber/autodispose/ScopeProvider;

    move-result-object v1

    const-string v2, "ViewScopeProvider.from(this)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, LYs1$k$f;

    iget-object v2, p0, LYs1$k;->e:LYs1;

    invoke-direct {v1, p0, v2}, LYs1$k$f;-><init>(LYs1$k;LYs1;)V

    new-instance v2, Let1;

    invoke-direct {v2, v1}, Let1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method
