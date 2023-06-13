.class public final Lmy2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Liy2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmy2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0008B1\u0008\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u0016\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u000cR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001bR.\u0010\"\u001a\u001c\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u001f0\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020 0\u001e0\u001d8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010!\u00a8\u0006%"
    }
    d2 = {
        "Lmy2;",
        "Liy2;",
        "",
        "skipAuthTokenRefresh",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/User;",
        "b",
        "Landroid/content/Context;",
        "a",
        "Landroid/content/Context;",
        "context",
        "Lhq;",
        "Lhq;",
        "authTokenManager",
        "Lpv0;",
        "c",
        "Lpv0;",
        "configManager",
        "Llh6;",
        "d",
        "Llh6;",
        "userManager",
        "LRh6;",
        "e",
        "LRh6;",
        "userStream",
        "f",
        "()Z",
        "isLoggedIn",
        "Lio/reactivex/functions/o;",
        "Lio/reactivex/k;",
        "",
        "",
        "()Lio/reactivex/functions/o;",
        "retryWhen",
        "<init>",
        "(Landroid/content/Context;Lhq;Lpv0;Llh6;LRh6;)V",
        "login_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final f:Lmy2$a;

.field public static final g:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "+",
            "Lco/bird/android/model/LoginException;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lhq;

.field public final c:Lpv0;

.field public final d:Llh6;

.field public final e:LRh6;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lmy2$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmy2$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmy2;->f:Lmy2$a;

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, Lco/bird/android/model/LoginException;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-class v2, Lco/bird/android/model/NotLoggedInException;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-class v2, Lco/bird/android/model/UpdateRequiredException;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-class v2, Lco/bird/android/model/UpdateRequestException;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-class v2, Lco/bird/android/model/UserSuspendedException;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-class v2, Lco/bird/android/model/AuthenticationException;

    aput-object v2, v0, v1

    sput-object v0, Lmy2;->g:[Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lhq;Lpv0;Llh6;LRh6;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authTokenManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userStream"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmy2;->a:Landroid/content/Context;

    iput-object p2, p0, Lmy2;->b:Lhq;

    iput-object p3, p0, Lmy2;->c:Lpv0;

    iput-object p4, p0, Lmy2;->d:Llh6;

    iput-object p5, p0, Lmy2;->e:LRh6;

    return-void
.end method

.method public static final synthetic access$getContext$p(Lmy2;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lmy2;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lmy2;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lmy2;->h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lmy2;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final h(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method


# virtual methods
.method public a()Lio/reactivex/functions/o;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/functions/o<",
            "Lio/reactivex/k<",
            "+",
            "Ljava/lang/Throwable;",
            ">;",
            "Lio/reactivex/k<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    sget-object v0, Lmy2;->g:[Ljava/lang/Class;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Class;

    invoke-static {v0}, LSN4;->j([Ljava/lang/Class;)LSN4$f;

    move-result-object v1

    const-wide/16 v2, 0x1f4

    const-wide/16 v4, 0x2710

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/high16 v7, 0x4000000000000000L    # 2.0

    invoke-virtual/range {v1 .. v8}, LSN4$f;->c(JJLjava/util/concurrent/TimeUnit;D)LSN4$f;

    move-result-object v0

    invoke-virtual {v0}, LSN4$f;->a()Lio/reactivex/functions/o;

    move-result-object v0

    const-string v1, "failWhenInstanceOf(*LOGI\u2026DS, 2.0)\n        .build()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Z)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/User;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lmy2;->f()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance p1, Lco/bird/android/model/NotLoggedInException;

    const/4 v0, 0x1

    invoke-direct {p1, v1, v0, v1}, Lco/bird/android/model/NotLoggedInException;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1}, Lio/reactivex/F;->x(Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "error(NotLoggedInException())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    if-eqz p1, :cond_1

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lmy2;->b:Lhq;

    invoke-interface {p1}, Lhq;->i()Lio/reactivex/c;

    move-result-object p1

    :goto_0
    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->X(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    sget-object v0, Lio/reactivex/rxkotlin/e;->a:Lio/reactivex/rxkotlin/e;

    iget-object v2, p0, Lmy2;->c:Lpv0;

    invoke-interface {v2, v1}, Lpv0;->l0(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object v1

    iget-object v2, p0, Lmy2;->d:Llh6;

    invoke-interface {v2}, Llh6;->n1()Lio/reactivex/Observable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lio/reactivex/rxkotlin/e;->c(Lio/reactivex/Observable;Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lmy2$b;

    invoke-direct {v0, p0}, Lmy2$b;-><init>(Lmy2;)V

    new-instance v1, Ljy2;

    invoke-direct {v1, v0}, Ljy2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, Lmy2$c;->g:Lmy2$c;

    new-instance v1, Lky2;

    invoke-direct {v1, v0}, Lky2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, Lmy2$d;->g:Lmy2$d;

    new-instance v1, Lly2;

    invoke-direct {v1, v0}, Lly2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->P(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "override fun verifyLogin\u2026le)\n        }\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lmy2;->b:Lhq;

    invoke-interface {v0}, Lhq;->j()Z

    move-result v0

    return v0
.end method
