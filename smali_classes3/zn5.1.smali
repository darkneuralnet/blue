.class public final Lzn5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxn5;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B!\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0010"
    }
    d2 = {
        "Lzn5;",
        "Lxn5;",
        "LAn5;",
        "a",
        "LAn5;",
        "ui",
        "Lcom/uber/autodispose/ScopeProvider;",
        "b",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "Le13;",
        "c",
        "Le13;",
        "navigator",
        "<init>",
        "(LAn5;Lcom/uber/autodispose/ScopeProvider;Le13;)V",
        "co.bird.android.feature.scrap"
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
        "SMAP\nScrapInspectionCompletePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapInspectionCompletePresenter.kt\nco/bird/android/feature/scrap/dialog/inspectioncomplete/ScrapInspectionCompletePresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,25:1\n180#2:26\n*S KotlinDebug\n*F\n+ 1 ScrapInspectionCompletePresenter.kt\nco/bird/android/feature/scrap/dialog/inspectioncomplete/ScrapInspectionCompletePresenterImpl\n*L\n18#1:26\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LAn5;

.field public final b:Lcom/uber/autodispose/ScopeProvider;

.field public final c:Le13;


# direct methods
.method public constructor <init>(LAn5;Lcom/uber/autodispose/ScopeProvider;Le13;)V
    .locals 1

    const-string v0, "ui"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzn5;->a:LAn5;

    iput-object p2, p0, Lzn5;->b:Lcom/uber/autodispose/ScopeProvider;

    iput-object p3, p0, Lzn5;->c:Le13;

    invoke-interface {p1}, LAn5;->doneClicks()Lio/reactivex/Observable;

    move-result-object p1

    invoke-static {p2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance p2, Lzn5$a;

    invoke-direct {p2, p0}, Lzn5$a;-><init>(Lzn5;)V

    new-instance p3, Lyn5;

    invoke-direct {p3, p2}, Lyn5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, p3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lzn5;->b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$getNavigator$p(Lzn5;)Le13;
    .locals 0

    iget-object p0, p0, Lzn5;->c:Le13;

    return-object p0
.end method

.method public static final synthetic access$getUi$p(Lzn5;)LAn5;
    .locals 0

    iget-object p0, p0, Lzn5;->a:LAn5;

    return-object p0
.end method

.method public static final b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
