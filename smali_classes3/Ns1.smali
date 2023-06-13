.class public final LNs1;
.super Lf1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf1<",
        "LOs1;",
        "LPs1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\u00a8\u0006\r"
    }
    d2 = {
        "LNs1;",
        "Lf1;",
        "LOs1;",
        "LPs1;",
        "renderer",
        "",
        "n",
        "Lgl;",
        "e",
        "Lgl;",
        "preference",
        "<init>",
        "(Lgl;)V",
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
        "SMAP\nFlightSheetQuickCaptureReadyPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetQuickCaptureReadyPresenter.kt\nco/bird/android/flightsheet/dialogs/quickcapture/FlightSheetQuickCaptureReadyPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,22:1\n180#2:23\n*S KotlinDebug\n*F\n+ 1 FlightSheetQuickCaptureReadyPresenter.kt\nco/bird/android/flightsheet/dialogs/quickcapture/FlightSheetQuickCaptureReadyPresenter\n*L\n18#1:23\n*E\n"
    }
.end annotation


# instance fields
.field public final e:Lgl;


# direct methods
.method public constructor <init>(Lgl;)V
    .locals 4

    const-string v0, "preference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LPs1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, LPs1;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v0}, Lf1;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LNs1;->e:Lgl;

    return-void
.end method

.method public static final synthetic access$getPreference$p(LNs1;)Lgl;
    .locals 0

    iget-object p0, p0, LNs1;->e:Lgl;

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LNs1;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic consume(Lrx4;)V
    .locals 0

    check-cast p1, LOs1;

    invoke-virtual {p0, p1}, LNs1;->n(LOs1;)V

    return-void
.end method

.method public n(LOs1;)V
    .locals 2

    const-string v0, "renderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lf1;->consume(Lrx4;)V

    new-instance v0, LNs1$a;

    invoke-direct {v0, p0}, LNs1$a;-><init>(LNs1;)V

    invoke-virtual {p0, v0}, Lf1;->i(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1}, LOs1;->G8()Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p0}, Lf1;->j()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v0, LNs1$b;

    invoke-direct {v0, p0}, LNs1$b;-><init>(LNs1;)V

    new-instance v1, LMs1;

    invoke-direct {v1, v0}, LMs1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method
