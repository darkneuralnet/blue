.class public final LIp0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEp0;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "CheckResult"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B!\u0008\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000e\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0003H\u0002J\u0008\u0010\u000e\u001a\u00020\u0008H\u0002J\u0008\u0010\u000f\u001a\u00020\u0003H\u0002R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0014R \u0010\u0019\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00170\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00170\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0018\u00a8\u0006 "
    }
    d2 = {
        "LIp0;",
        "LEp0;",
        "Lio/reactivex/F;",
        "",
        "b",
        "optedIn",
        "",
        "optedInString",
        "",
        "a",
        "fromSignUp",
        "Lio/reactivex/c;",
        "c",
        "i",
        "h",
        "j",
        "LDp0;",
        "LDp0;",
        "client",
        "LEa;",
        "LEa;",
        "analyticsManager",
        "La94;",
        "Lco/bird/android/buava/Optional;",
        "La94;",
        "mutableOptedInStatus",
        "d",
        "mutableOptedInString",
        "LRh6;",
        "userStream",
        "<init>",
        "(LDp0;LEa;LRh6;)V",
        "communication-opt-in_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LDp0;

.field public final b:LEa;

.field public final c:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field public final d:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LDp0;LEa;LRh6;)V
    .locals 2

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userStream"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIp0;->a:LDp0;

    iput-object p2, p0, LIp0;->b:LEa;

    invoke-interface {p3}, LRh6;->i()Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, LIp0$a;

    invoke-direct {p2, p0}, LIp0$a;-><init>(LIp0;)V

    new-instance p3, LFp0;

    invoke-direct {p3, p2}, LFp0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    sget-object p1, La94;->h:La94$a;

    sget-object p2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p2}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p3

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, p3, v0, v1, v0}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p3

    iput-object p3, p0, LIp0;->c:La94;

    invoke-virtual {p2}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p2

    invoke-static {p1, p2, v0, v1, v0}, La94$a;->create$default(La94$a;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)La94;

    move-result-object p1

    iput-object p1, p0, LIp0;->d:La94;

    return-void
.end method

.method public static final synthetic access$reset(LIp0;)V
    .locals 0

    invoke-virtual {p0}, LIp0;->h()V

    return-void
.end method

.method public static synthetic d(LIp0;Z)V
    .locals 0

    invoke-static {p0, p1}, LIp0;->k(LIp0;Z)V

    return-void
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LIp0;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LIp0;->l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final k(LIp0;Z)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LIp0;->i(Z)V

    return-void
.end method

.method public static final l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(ZLjava/lang/String;)V
    .locals 2

    const-string v0, "optedInString"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LIp0;->c:La94;

    sget-object v1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v1, p1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-virtual {v0, p1}, La94;->accept(Ljava/lang/Object;)V

    iget-object p1, p0, LIp0;->d:La94;

    invoke-virtual {v1, p2}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p2

    invoke-virtual {p1, p2}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public b()Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LIp0;->a:LDp0;

    invoke-interface {v0}, LDp0;->a()Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public c(Z)Lio/reactivex/c;
    .locals 4

    invoke-virtual {p0}, LIp0;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LIp0;->a:LDp0;

    new-instance v1, Lco/bird/api/request/CommunicationOptInRequestBody;

    iget-object v2, p0, LIp0;->c:La94;

    invoke-virtual {v2}, La94;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/buava/Optional;

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-object v3, p0, LIp0;->d:La94;

    invoke-virtual {v3}, La94;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/buava/Optional;

    invoke-virtual {v3}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lco/bird/api/request/CommunicationOptInRequestBody;-><init>(ZLjava/lang/String;)V

    invoke-interface {v0, v1}, LDp0;->b(Lco/bird/api/request/CommunicationOptInRequestBody;)Lio/reactivex/c;

    move-result-object v0

    new-instance v1, LGp0;

    invoke-direct {v1, p0, p1}, LGp0;-><init>(LIp0;Z)V

    invoke-virtual {v0, v1}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    sget-object v0, LIp0$b;->g:LIp0$b;

    new-instance v1, LHp0;

    invoke-direct {v1, v0}, LHp0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object p1

    const-string v0, "{\n      client.updateOpt\u2026 .onErrorComplete()\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    const-string v0, "{\n      Completable.complete()\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, LIp0;->c:La94;

    invoke-virtual {v0}, La94;->j()V

    iget-object v0, p0, LIp0;->d:La94;

    invoke-virtual {v0}, La94;->j()V

    return-void
.end method

.method public final i(Z)V
    .locals 3

    iget-object v0, p0, LIp0;->c:La94;

    invoke-virtual {v0}, La94;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LIp0;->b:LEa;

    new-instance v1, Lco/bird/android/model/analytics/MarketingEmailsOptedIn;

    iget-object v2, p0, LIp0;->d:La94;

    invoke-virtual {v2}, La94;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/buava/Optional;

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz p1, :cond_0

    sget-object p1, Lco/bird/android/model/analytics/MarketingEmailsOptedIn$Source;->EMAIL_SIGNUP:Lco/bird/android/model/analytics/MarketingEmailsOptedIn$Source;

    goto :goto_0

    :cond_0
    sget-object p1, Lco/bird/android/model/analytics/MarketingEmailsOptedIn$Source;->SETTINGS:Lco/bird/android/model/analytics/MarketingEmailsOptedIn$Source;

    :goto_0
    invoke-direct {v1, v2, p1}, Lco/bird/android/model/analytics/MarketingEmailsOptedIn;-><init>(Ljava/lang/String;Lco/bird/android/model/analytics/MarketingEmailsOptedIn$Source;)V

    invoke-interface {v0, v1}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    goto :goto_2

    :cond_1
    iget-object v0, p0, LIp0;->b:LEa;

    new-instance v1, Lco/bird/android/model/analytics/MarketingEmailsOptedOut;

    iget-object v2, p0, LIp0;->d:La94;

    invoke-virtual {v2}, La94;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/buava/Optional;

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz p1, :cond_2

    sget-object p1, Lco/bird/android/model/analytics/MarketingEmailsOptedOut$Source;->EMAIL_SIGNUP:Lco/bird/android/model/analytics/MarketingEmailsOptedOut$Source;

    goto :goto_1

    :cond_2
    sget-object p1, Lco/bird/android/model/analytics/MarketingEmailsOptedOut$Source;->SETTINGS:Lco/bird/android/model/analytics/MarketingEmailsOptedOut$Source;

    :goto_1
    invoke-direct {v1, v2, p1}, Lco/bird/android/model/analytics/MarketingEmailsOptedOut;-><init>(Ljava/lang/String;Lco/bird/android/model/analytics/MarketingEmailsOptedOut$Source;)V

    invoke-interface {v0, v1}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    :goto_2
    return-void
.end method

.method public final j()Z
    .locals 1

    iget-object v0, p0, LIp0;->c:La94;

    invoke-virtual {v0}, La94;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LIp0;->d:La94;

    invoke-virtual {v0}, La94;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
