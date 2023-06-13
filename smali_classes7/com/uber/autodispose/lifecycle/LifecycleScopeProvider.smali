.class public interface abstract Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/uber/autodispose/ScopeProvider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/uber/autodispose/ScopeProvider;"
    }
.end annotation


# virtual methods
.method public abstract O8()Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction<",
            "TE;>;"
        }
    .end annotation
.end method

.method public T0()Lio/reactivex/h;
    .locals 1

    invoke-static {p0}, Lcom/uber/autodispose/lifecycle/LifecycleScopes;->e(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method

.method public abstract c2()Lio/reactivex/Observable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "TE;>;"
        }
    .end annotation
.end method

.method public abstract peekLifecycle()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation
.end method
