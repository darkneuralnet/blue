.class public final LyH3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LvH3;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LyH3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0005B\'\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u0008\u0012\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\r\u00a8\u0006\u0012"
    }
    d2 = {
        "LyH3;",
        "LvH3;",
        "",
        "c",
        "Lcom/uber/autodispose/ScopeProvider;",
        "a",
        "Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "LCH3;",
        "b",
        "LCH3;",
        "ui",
        "Le13;",
        "Le13;",
        "navigator",
        "<init>",
        "(Lcom/uber/autodispose/ScopeProvider;LCH3;Le13;)V",
        "d",
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
        "SMAP\nParkingRulesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParkingRulesPresenter.kt\nco/bird/android/app/feature/ride/parking/ParkingRulesPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,48:1\n180#2:49\n180#2:50\n*S KotlinDebug\n*F\n+ 1 ParkingRulesPresenter.kt\nco/bird/android/app/feature/ride/parking/ParkingRulesPresenterImpl\n*L\n37#1:49\n42#1:50\n*E\n"
    }
.end annotation


# static fields
.field public static final d:LyH3$a;

.field public static final e:I


# instance fields
.field public final a:Lcom/uber/autodispose/ScopeProvider;

.field public final b:LCH3;

.field public final c:Le13;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LyH3$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LyH3$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LyH3;->d:LyH3$a;

    const/16 v0, 0x8

    sput v0, LyH3;->e:I

    return-void
.end method

.method public constructor <init>(Lcom/uber/autodispose/ScopeProvider;LCH3;Le13;)V
    .locals 1

    const-string v0, "scopeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LyH3;->a:Lcom/uber/autodispose/ScopeProvider;

    iput-object p2, p0, LyH3;->b:LCH3;

    iput-object p3, p0, LyH3;->c:Le13;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LyH3;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$getNavigator$p(LyH3;)Le13;
    .locals 0

    iget-object p0, p0, LyH3;->c:Le13;

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LyH3;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 4

    iget-object v0, p0, LyH3;->b:LCH3;

    invoke-interface {v0}, LCH3;->Rj()V

    iget-object v0, p0, LyH3;->b:LCH3;

    invoke-interface {v0}, LCH3;->z6()V

    iget-object v0, p0, LyH3;->b:LCH3;

    invoke-interface {v0}, LCH3;->u()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, LyH3;->a:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v2, LyH3$b;

    invoke-direct {v2, p0}, LyH3$b;-><init>(LyH3;)V

    new-instance v3, LwH3;

    invoke-direct {v3, v2}, LwH3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    iget-object v0, p0, LyH3;->b:LCH3;

    invoke-interface {v0}, LCH3;->ma()Lio/reactivex/Observable;

    move-result-object v0

    iget-object v2, p0, LyH3;->a:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, LyH3$c;

    invoke-direct {v1, p0}, LyH3$c;-><init>(LyH3;)V

    new-instance v2, LxH3;

    invoke-direct {v2, v1}, LxH3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method
