.class public final Lco/bird/android/app/manager/SmartlockManagerImpl$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/manager/SmartlockManagerImpl;->m(LTk5;Lco/bird/android/model/wire/WirePhysicalLock;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/Observable<",
        "[B>;",
        "Lio/reactivex/B<",
        "+[B>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lio/reactivex/Observable;",
        "",
        "notificationObservable",
        "Lio/reactivex/B;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lio/reactivex/Observable;)Lio/reactivex/B;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/WireSmartlock;

.field public final synthetic h:Lco/bird/android/app/manager/SmartlockManagerImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireSmartlock;Lco/bird/android/app/manager/SmartlockManagerImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$n;->g:Lco/bird/android/model/wire/WireSmartlock;

    iput-object p2, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$n;->h:Lco/bird/android/app/manager/SmartlockManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl$n;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl$n;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl$n;->f(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl$n;->j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)[B
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl$n;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)Lio/reactivex/B;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$smartlock"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "sending token request for lock now..."

    invoke-static {v1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->access$sendTokenRequest(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)Lio/reactivex/F;

    move-result-object p0

    invoke-virtual {p0}, Lio/reactivex/F;->k0()Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
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

.method public static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)[B
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    return-object p0
.end method

.method public static final j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
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


# virtual methods
.method public final invoke(Lio/reactivex/Observable;)Lio/reactivex/B;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/Observable<",
            "[B>;)",
            "Lio/reactivex/B<",
            "+[B>;"
        }
    .end annotation

    const-string v0, "notificationObservable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "notification listener set up"

    invoke-static {v2, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$n;->h:Lco/bird/android/app/manager/SmartlockManagerImpl;

    iget-object v2, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$n;->g:Lco/bird/android/model/wire/WireSmartlock;

    new-instance v3, LgJ5;

    invoke-direct {v3, v1, v2}, LgJ5;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)V

    invoke-static {v3}, Lio/reactivex/Observable;->defer(Ljava/util/concurrent/Callable;)Lio/reactivex/Observable;

    move-result-object v1

    new-instance v2, Lco/bird/android/app/manager/SmartlockManagerImpl$n$a;

    iget-object v3, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$n;->h:Lco/bird/android/app/manager/SmartlockManagerImpl;

    iget-object v4, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$n;->g:Lco/bird/android/model/wire/WireSmartlock;

    invoke-direct {v2, v3, v4}, Lco/bird/android/app/manager/SmartlockManagerImpl$n$a;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)V

    new-instance v3, LhJ5;

    invoke-direct {v3, v2}, LhJ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/Observable;->flatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v1

    iget-object v2, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$n;->g:Lco/bird/android/model/wire/WireSmartlock;

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireSmartlock;->getTokenRequests()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    int-to-long v2, v2

    const-wide/16 v4, 0x1

    sub-long/2addr v2, v4

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x0

    :goto_0
    new-instance v4, Lco/bird/android/app/manager/SmartlockManagerImpl$n$b;

    iget-object v5, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$n;->g:Lco/bird/android/model/wire/WireSmartlock;

    invoke-direct {v4, v5}, Lco/bird/android/app/manager/SmartlockManagerImpl$n$b;-><init>(Lco/bird/android/model/wire/WireSmartlock;)V

    new-instance v5, LiJ5;

    invoke-direct {v5, v4}, LiJ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v2, v3, v5}, Lio/reactivex/Observable;->retry(JLio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object v1

    sget-object v2, Lco/bird/android/app/manager/SmartlockManagerImpl$n$c;->g:Lco/bird/android/app/manager/SmartlockManagerImpl$n$c;

    new-instance v3, LjJ5;

    invoke-direct {v3, v2}, LjJ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1, v3}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v1

    new-array v0, v0, [B

    invoke-virtual {v1, v0}, Lio/reactivex/Observable;->onErrorReturnItem(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {v0, p1}, Lio/reactivex/Observable;->merge(Lio/reactivex/B;Lio/reactivex/B;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lco/bird/android/app/manager/SmartlockManagerImpl$n$d;->g:Lco/bird/android/app/manager/SmartlockManagerImpl$n$d;

    new-instance v1, LkJ5;

    invoke-direct {v1, v0}, LkJ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/Observable;

    invoke-virtual {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl$n;->invoke(Lio/reactivex/Observable;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
