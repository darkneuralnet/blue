.class public final Lkh6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldh6;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000c\u0010\t\u001a\u00020\u0002*\u00020\u0008H\u0002R\u0014\u0010\u000c\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\"\u0010\u001d\u001a\u0010\u0012\u000c\u0012\n \u001a*\u0004\u0018\u00010\u00020\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001c\u0010 \u001a\n \u001a*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006)"
    }
    d2 = {
        "Lkh6;",
        "Ldh6;",
        "",
        "restartProcess",
        "Lio/reactivex/c;",
        "a",
        "k",
        "n",
        "LMp$b;",
        "p",
        "Landroid/content/Context;",
        "Landroid/content/Context;",
        "context",
        "LRh6;",
        "b",
        "LRh6;",
        "userStream",
        "Llh6;",
        "c",
        "Llh6;",
        "userManager",
        "Le13;",
        "d",
        "Le13;",
        "navigator",
        "LAG;",
        "kotlin.jvm.PlatformType",
        "e",
        "LAG;",
        "shouldRestartProcess",
        "f",
        "Lio/reactivex/c;",
        "sharedLogoutCompletable",
        "LOp;",
        "authInterceptor",
        "LTq4;",
        "config",
        "Lhq;",
        "authTokenManager",
        "<init>",
        "(Landroid/content/Context;LOp;LTq4;Lhq;LRh6;Llh6;Le13;)V",
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
        "SMAP\nUserLogoutManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserLogoutManagerImpl.kt\nco/bird/android/app/manager/UserLogoutManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,111:1\n237#2:112\n*S KotlinDebug\n*F\n+ 1 UserLogoutManagerImpl.kt\nco/bird/android/app/manager/UserLogoutManagerImpl\n*L\n61#1:112\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LRh6;

.field public final c:Llh6;

.field public final d:Le13;

.field public final e:LAG;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LAG<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lio/reactivex/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LOp;LTq4;Lhq;LRh6;Llh6;Le13;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authInterceptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "authTokenManager"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "userStream"

    invoke-static {p5, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "userManager"

    invoke-static {p6, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "navigator"

    invoke-static {p7, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkh6;->a:Landroid/content/Context;

    iput-object p5, p0, Lkh6;->b:LRh6;

    iput-object p6, p0, Lkh6;->c:Llh6;

    iput-object p7, p0, Lkh6;->d:Le13;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, LAG;->h(Ljava/lang/Object;)LAG;

    move-result-object p1

    const-string p3, "createDefault(false)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lkh6;->e:LAG;

    invoke-virtual {p0}, Lkh6;->k()Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/c;->h0()Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->share()Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/c;

    move-result-object p1

    iput-object p1, p0, Lkh6;->f:Lio/reactivex/c;

    invoke-interface {p2}, LOp;->a()Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, Lkh6$a;

    invoke-direct {p2, p0}, Lkh6$a;-><init>(Lkh6;)V

    new-instance p3, Leh6;

    invoke-direct {p3, p2}, Leh6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, Lkh6$b;

    invoke-direct {p2, p0}, Lkh6$b;-><init>(Lkh6;)V

    new-instance p3, Lfh6;

    invoke-direct {p3, p2}, Lfh6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->flatMapCompletable(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/c;->T()Lio/reactivex/c;

    move-result-object p1

    const-string p2, "authInterceptor.authErro\u2026lers.io())\n      .retry()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/uber/autodispose/ScopeProvider;->g0:Lcom/uber/autodispose/ScopeProvider;

    const-string p3, "UNBOUND"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/reactivex/c;->n(Lio/reactivex/d;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "this.`as`(AutoDispose.au\u2026isposable<Any>(provider))"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/CompletableSubscribeProxy;

    invoke-interface {p1}, Lcom/uber/autodispose/CompletableSubscribeProxy;->subscribe()Lio/reactivex/disposables/c;

    return-void
.end method

.method public static final synthetic access$getShouldRestartProcess$p(Lkh6;)LAG;
    .locals 0

    iget-object p0, p0, Lkh6;->e:LAG;

    return-object p0
.end method

.method public static final synthetic access$performLogout(Lkh6;Z)Lio/reactivex/c;
    .locals 0

    invoke-virtual {p0, p1}, Lkh6;->n(Z)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$shouldLogUserOut(Lkh6;LMp$b;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lkh6;->p(LMp$b;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lkh6;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lkh6;->l(Lkh6;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lkh6;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lkh6;->m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, Lkh6;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(ZLkh6;)V
    .locals 0

    invoke-static {p0, p1}, Lkh6;->o(ZLkh6;)V

    return-void
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lkh6;->j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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

.method public static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final l(Lkh6;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lkh6;->b:LRh6;

    invoke-interface {p0}, LRh6;->g()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final o(ZLkh6;)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    new-instance p0, Landroid/content/Intent;

    iget-object v2, p1, Lkh6;->a:Landroid/content/Context;

    const-class v3, Lco/bird/android/app/feature/main/MainActivity;

    invoke-direct {p0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const v2, 0x10008000

    invoke-virtual {p0, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    iget-object p1, p1, Lkh6;->a:Landroid/content/Context;

    new-array v0, v0, [Landroid/content/Intent;

    aput-object p0, v0, v1

    invoke-static {p1, v0}, Lcom/jakewharton/processphoenix/ProcessPhoenix;->b(Landroid/content/Context;[Landroid/content/Intent;)V

    goto :goto_0

    :cond_0
    iget-object p0, p1, Lkh6;->d:Le13;

    const/4 p1, 0x0

    invoke-static {p0, v1, v0, p1}, Le13$a;->goToMain$default(Le13;ZILjava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Z)Lio/reactivex/c;
    .locals 2

    iget-object v0, p0, Lkh6;->f:Lio/reactivex/c;

    new-instance v1, Lkh6$c;

    invoke-direct {v1, p0, p1}, Lkh6$c;-><init>(Lkh6;Z)V

    new-instance p1, Lhh6;

    invoke-direct {p1, v1}, Lhh6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/c;->E(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "override fun logout(rest\u2026startProcess)\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final k()Lio/reactivex/c;
    .locals 3

    new-instance v0, Lih6;

    invoke-direct {v0, p0}, Lih6;-><init>(Lkh6;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "fromCallable {\n      userStream.isLoggedIn\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lkh6;->e:LAG;

    invoke-static {v0, v1}, LYf5;->s0(Lio/reactivex/F;Lio/reactivex/B;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lkh6$d;

    invoke-direct {v1, p0}, Lkh6$d;-><init>(Lkh6;)V

    new-instance v2, Ljh6;

    invoke-direct {v2, v1}, Ljh6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "private fun logoutIntern\u2026ss)\n        }\n      }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final n(Z)Lio/reactivex/c;
    .locals 2

    iget-object v0, p0, Lkh6;->c:Llh6;

    invoke-interface {v0}, Llh6;->b()Lio/reactivex/c;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/c;->P(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object v0

    new-instance v1, Lgh6;

    invoke-direct {v1, p1, p0}, Lgh6;-><init>(ZLkh6;)V

    invoke-virtual {v0, v1}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "userManager.logout()\n   \u2026oMain()\n        }\n      }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final p(LMp$b;)Z
    .locals 1

    invoke-virtual {p1}, LMp$b;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LMp$b;->b()Lokhttp3/Request;

    move-result-object p1

    const-string v0, "Authorization"

    invoke-virtual {p1, v0}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
