.class public final Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider$UntilEventFunction;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
        "Landroidx/lifecycle/f$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final d:Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction<",
            "Landroidx/lifecycle/f$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction<",
            "Landroidx/lifecycle/f$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LXc;

    invoke-direct {v0}, LXc;-><init>()V

    sput-object v0, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->d:Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/f;Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/f;",
            "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction<",
            "Landroidx/lifecycle/f$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable;

    invoke-direct {v0, p1}, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable;-><init>(Landroidx/lifecycle/f;)V

    iput-object v0, p0, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->c:Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable;

    iput-object p2, p0, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b:Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;

    return-void
.end method

.method public static synthetic a(Landroidx/lifecycle/f$a;)Landroidx/lifecycle/f$a;
    .locals 0

    invoke-static {p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->m(Landroidx/lifecycle/f$a;)Landroidx/lifecycle/f$a;

    move-result-object p0

    return-object p0
.end method

.method public static b(LLifecycleOwner;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;
    .locals 0

    invoke-interface {p0}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p0

    invoke-static {p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->j(Landroidx/lifecycle/f;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object p0

    return-object p0
.end method

.method public static e(LLifecycleOwner;Landroidx/lifecycle/f$a;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;
    .locals 0

    invoke-interface {p0}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p0

    invoke-static {p0, p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->k(Landroidx/lifecycle/f;Landroidx/lifecycle/f$a;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object p0

    return-object p0
.end method

.method public static i(LLifecycleOwner;Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LLifecycleOwner;",
            "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction<",
            "Landroidx/lifecycle/f$a;",
            ">;)",
            "Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;"
        }
    .end annotation

    invoke-interface {p0}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p0

    invoke-static {p0, p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->l(Landroidx/lifecycle/f;Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object p0

    return-object p0
.end method

.method public static j(Landroidx/lifecycle/f;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;
    .locals 1

    sget-object v0, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->d:Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;

    invoke-static {p0, v0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->l(Landroidx/lifecycle/f;Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object p0

    return-object p0
.end method

.method public static k(Landroidx/lifecycle/f;Landroidx/lifecycle/f$a;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;
    .locals 1

    new-instance v0, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider$UntilEventFunction;

    invoke-direct {v0, p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider$UntilEventFunction;-><init>(Landroidx/lifecycle/f$a;)V

    invoke-static {p0, v0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->l(Landroidx/lifecycle/f;Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object p0

    return-object p0
.end method

.method public static l(Landroidx/lifecycle/f;Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/f;",
            "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction<",
            "Landroidx/lifecycle/f$a;",
            ">;)",
            "Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;"
        }
    .end annotation

    new-instance v0, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    invoke-direct {v0, p0, p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;-><init>(Landroidx/lifecycle/f;Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;)V

    return-object v0
.end method

.method public static synthetic m(Landroidx/lifecycle/f$a;)Landroidx/lifecycle/f$a;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/uber/autodispose/OutsideScopeException;
        }
    .end annotation

    sget-object v0, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider$1;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    sget-object p0, Landroidx/lifecycle/f$a;->ON_STOP:Landroidx/lifecycle/f$a;

    return-object p0

    :cond_0
    new-instance v0, Lcom/uber/autodispose/lifecycle/LifecycleEndedException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Lifecycle has ended! Last event was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/uber/autodispose/lifecycle/LifecycleEndedException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Landroidx/lifecycle/f$a;->ON_PAUSE:Landroidx/lifecycle/f$a;

    return-object p0

    :cond_2
    sget-object p0, Landroidx/lifecycle/f$a;->ON_STOP:Landroidx/lifecycle/f$a;

    return-object p0

    :cond_3
    sget-object p0, Landroidx/lifecycle/f$a;->ON_DESTROY:Landroidx/lifecycle/f$a;

    return-object p0
.end method


# virtual methods
.method public O8()Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction<",
            "Landroidx/lifecycle/f$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->b:Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;

    return-object v0
.end method

.method public T0()Lio/reactivex/h;
    .locals 1

    invoke-static {p0}, Lcom/uber/autodispose/lifecycle/LifecycleScopes;->e(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method

.method public c2()Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "Landroidx/lifecycle/f$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->c:Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable;

    return-object v0
.end method

.method public n()Landroidx/lifecycle/f$a;
    .locals 1

    iget-object v0, p0, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->c:Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable;

    invoke-virtual {v0}, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable;->a()V

    iget-object v0, p0, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->c:Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable;

    invoke-virtual {v0}, Lcom/uber/autodispose/android/lifecycle/LifecycleEventsObservable;->c()Landroidx/lifecycle/f$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic peekLifecycle()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->n()Landroidx/lifecycle/f$a;

    move-result-object v0

    return-object v0
.end method
