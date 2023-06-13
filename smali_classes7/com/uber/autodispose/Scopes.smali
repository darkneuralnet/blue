.class public final Lcom/uber/autodispose/Scopes;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/uber/autodispose/ScopeProvider;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0}, Lcom/uber/autodispose/Scopes;->c(Lcom/uber/autodispose/ScopeProvider;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lcom/uber/autodispose/ScopeProvider;)Lio/reactivex/c;
    .locals 1

    new-instance v0, LXm5;

    invoke-direct {v0, p0}, LXm5;-><init>(Lcom/uber/autodispose/ScopeProvider;)V

    invoke-static {v0}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/uber/autodispose/ScopeProvider;)Lio/reactivex/h;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    :try_start_0
    invoke-interface {p0}, Lcom/uber/autodispose/ScopeProvider;->T0()Lio/reactivex/h;

    move-result-object p0
    :try_end_0
    .catch Lcom/uber/autodispose/OutsideScopeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-static {}, Lcom/uber/autodispose/AutoDisposePlugins;->a()Lio/reactivex/functions/g;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lio/reactivex/functions/g;->accept(Ljava/lang/Object;)V

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lio/reactivex/c;->F(Ljava/lang/Throwable;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method
