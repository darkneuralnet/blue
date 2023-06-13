.class public final Lco/bird/android/app/feature/locale/ApplicationForegroundLocaleUpdater;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFq2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0008\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\n\u00a8\u0006\u000e"
    }
    d2 = {
        "Lco/bird/android/app/feature/locale/ApplicationForegroundLocaleUpdater;",
        "LFq2;",
        "",
        "onApplicationStart",
        "Llh6;",
        "b",
        "Llh6;",
        "userManager",
        "LRh6;",
        "c",
        "LRh6;",
        "userStream",
        "<init>",
        "(Llh6;LRh6;)V",
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
.field public final b:Llh6;

.field public final c:LRh6;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Llh6;LRh6;)V
    .locals 1

    const-string v0, "userManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userStream"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/locale/ApplicationForegroundLocaleUpdater;->b:Llh6;

    iput-object p2, p0, Lco/bird/android/app/feature/locale/ApplicationForegroundLocaleUpdater;->c:LRh6;

    return-void
.end method


# virtual methods
.method public final onApplicationStart()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    .annotation runtime Landroidx/lifecycle/l;
        value = .enum Landroidx/lifecycle/f$a;->ON_START:Landroidx/lifecycle/f$a;
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/locale/ApplicationForegroundLocaleUpdater;->c:LRh6;

    invoke-interface {v0}, LRh6;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lco/bird/android/app/feature/locale/ApplicationForegroundLocaleUpdater;->c:LRh6;

    invoke-interface {v0}, LRh6;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, LFv2;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Updating user\'s locale on application start."

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/app/feature/locale/ApplicationForegroundLocaleUpdater;->b:Llh6;

    invoke-static {}, LFv2;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Llh6;->S(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object v0

    const-string v1, "userManager.updateUserLo\u2026\n      .onErrorComplete()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lco/bird/android/app/feature/locale/ApplicationForegroundLocaleUpdater$a;->g:Lco/bird/android/app/feature/locale/ApplicationForegroundLocaleUpdater$a;

    sget-object v2, Lco/bird/android/app/feature/locale/ApplicationForegroundLocaleUpdater$b;->g:Lco/bird/android/app/feature/locale/ApplicationForegroundLocaleUpdater$b;

    invoke-static {v0, v1, v2}, Lio/reactivex/rxkotlin/i;->d(Lio/reactivex/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lio/reactivex/disposables/c;

    :cond_1
    :goto_0
    return-void
.end method
