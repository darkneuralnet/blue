.class public final LUa5$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUa5;-><init>(LTq4;LEa;Landroid/content/Context;Lfa5;LxG;LsG;Lcom/uber/autodispose/ScopeProvider;LZa5;LDU2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
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
        "SMAP\nRiderTutorialPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiderTutorialPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/RiderTutorialPresenterImpl$customSteps$2\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,298:1\n237#2:299\n*S KotlinDebug\n*F\n+ 1 RiderTutorialPresenter.kt\nco/bird/android/app/feature/ridertutorial/presenter/RiderTutorialPresenterImpl$customSteps$2\n*L\n107#1:299\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LUa5;


# direct methods
.method public constructor <init>(LUa5;)V
    .locals 0

    iput-object p1, p0, LUa5$f;->g:LUa5;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LUa5$f;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    iget-object v0, p0, LUa5$f;->g:LUa5;

    invoke-static {v0}, LUa5;->access$getRiderProfileManager$p(LUa5;)Lfa5;

    move-result-object v0

    invoke-interface {v0}, Lfa5;->f()Lio/reactivex/c;

    move-result-object v0

    const/4 v1, 0x5

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, LYf5;->d0(Lio/reactivex/c;II)Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, LUa5$f;->g:LUa5;

    invoke-static {v1}, LUa5;->access$getScopeProvider$p(LUa5;)Lcom/uber/autodispose/ScopeProvider;

    move-result-object v1

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {v0}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    return-void
.end method
