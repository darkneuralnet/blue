.class public final LDs1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAs1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0096\u0001J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u0096\u0001J\u000f\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0002H\u0096\u0001J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005J\u0008\u0010\u000e\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0012\u00a8\u0006\u0016"
    }
    d2 = {
        "LDs1;",
        "LAs1;",
        "Lio/reactivex/Observable;",
        "Lco/bird/android/model/wire/WireBird;",
        "f",
        "",
        "birdId",
        "",
        "refresh",
        "Lio/reactivex/c;",
        "d",
        "",
        "a",
        "b",
        "onResume",
        "LAs1;",
        "delegate",
        "Lcom/uber/autodispose/ScopeProvider;",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "<init>",
        "(LAs1;Lcom/uber/autodispose/ScopeProvider;)V",
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
        "SMAP\nFlightSheetFragmentPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlightSheetFragmentPresenter.kt\nco/bird/android/flightsheet/dialogs/FlightSheetFragmentPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,23:1\n237#2:24\n*S KotlinDebug\n*F\n+ 1 FlightSheetFragmentPresenter.kt\nco/bird/android/flightsheet/dialogs/FlightSheetFragmentPresenter\n*L\n15#1:24\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LAs1;

.field public final b:Lcom/uber/autodispose/ScopeProvider;


# direct methods
.method public constructor <init>(LAs1;Lcom/uber/autodispose/ScopeProvider;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDs1;->a:LAs1;

    iput-object p2, p0, LDs1;->b:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method


# virtual methods
.method public a()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LDs1;->a:LAs1;

    invoke-interface {v0}, LAs1;->a()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 3

    const-string v0, "birdId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, LAs1$a;->populateFlightSheet$default(LAs1;Ljava/lang/String;ZILjava/lang/Object;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, LDs1;->b:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    return-void
.end method

.method public d(Ljava/lang/String;Z)Lio/reactivex/c;
    .locals 1

    const-string v0, "birdId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LDs1;->a:LAs1;

    invoke-interface {v0, p1, p2}, LAs1;->d(Ljava/lang/String;Z)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public f()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LDs1;->a:LAs1;

    invoke-interface {v0}, LAs1;->f()Lio/reactivex/Observable;

    move-result-object v0

    return-object v0
.end method

.method public onResume()V
    .locals 1

    iget-object v0, p0, LDs1;->a:LAs1;

    invoke-interface {v0}, LAs1;->onResume()V

    return-void
.end method
