.class public final LPp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOp;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\u0008*\u00020\u00022\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR!\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0010\u001a\u0004\u0008\u000b\u0010\u0011R\"\u0010\u0017\u001a\u0010\u0012\u000c\u0012\n \u0014*\u0004\u0018\u00010\u000f0\u000f0\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "LPp;",
        "LOp;",
        "Lokhttp3/Interceptor$Chain;",
        "chain",
        "Lokhttp3/Response;",
        "intercept",
        "",
        "authHeader",
        "LnJ4;",
        "b",
        "Lhq;",
        "a",
        "Lhq;",
        "authTokenManager",
        "Lio/reactivex/Observable;",
        "LMp;",
        "Lkotlin/Lazy;",
        "()Lio/reactivex/Observable;",
        "authErrors",
        "Lio/reactivex/subjects/d;",
        "kotlin.jvm.PlatformType",
        "c",
        "Lio/reactivex/subjects/d;",
        "authErrorsSubject",
        "<init>",
        "(Lhq;)V",
        "auth_release"
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
        "SMAP\nAuthInterceptorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthInterceptorImpl.kt\nco/bird/android/auth/api/interceptor/AuthInterceptorImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lhq;

.field public final b:Lkotlin/Lazy;

.field public final c:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "LMp;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhq;)V
    .locals 1

    const-string v0, "authTokenManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPp;->a:Lhq;

    new-instance p1, LPp$a;

    invoke-direct {p1, p0}, LPp$a;-><init>(LPp;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, LPp;->b:Lkotlin/Lazy;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object p1

    const-string v0, "create<AuthError>()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LPp;->c:Lio/reactivex/subjects/d;

    return-void
.end method

.method public static final synthetic access$getAuthErrorsSubject$p(LPp;)Lio/reactivex/subjects/d;
    .locals 0

    iget-object p0, p0, LPp;->c:Lio/reactivex/subjects/d;

    return-object p0
.end method

.method public static final synthetic access$performRequestWithAuthHeader(LPp;Lokhttp3/Interceptor$Chain;Ljava/lang/String;)LnJ4;
    .locals 0

    invoke-virtual {p0, p1, p2}, LPp;->b(Lokhttp3/Interceptor$Chain;Ljava/lang/String;)LnJ4;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lio/reactivex/Observable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/Observable<",
            "LMp;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LPp;->b:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-authErrors>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lio/reactivex/Observable;

    return-object v0
.end method

.method public final b(Lokhttp3/Interceptor$Chain;Ljava/lang/String;)LnJ4;
    .locals 5

    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    xor-int/2addr v3, v1

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, v2

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {v0}, Lokhttp3/Request;->newBuilder()Lokhttp3/Request$Builder;

    move-result-object v3

    const-string v4, "Authorization"

    invoke-virtual {v3, v4, p2}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p2

    invoke-virtual {p2}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p2

    if-nez p2, :cond_2

    :cond_1
    move-object p2, v0

    :cond_2
    invoke-interface {p1, p2}, Lokhttp3/Interceptor$Chain;->proceed(Lokhttp3/Request;)Lokhttp3/Response;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/Response;->code()I

    move-result v3

    const/16 v4, 0x191

    if-ne v3, v4, :cond_5

    const-class v3, LS92;

    invoke-virtual {v0, v3}, Lokhttp3/Request;->tag(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LS92;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LS92;->a()Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_3

    const-class v2, LTe3;

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LTe3;

    :cond_3
    new-instance v0, LMp$b;

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    invoke-direct {v0, p2, v1}, LMp$b;-><init>(Lokhttp3/Request;Z)V

    move-object v2, v0

    :cond_5
    new-instance p2, LnJ4$a;

    invoke-direct {p2, p1, v2}, LnJ4$a;-><init>(Lokhttp3/Response;LMp$b;)V

    return-object p2
.end method

.method public intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 3

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LPp;->a:Lhq;

    new-instance v1, LPp$b;

    invoke-direct {v1, p0, p1}, LPp$b;-><init>(LPp;Lokhttp3/Interceptor$Chain;)V

    invoke-interface {v0, v1}, Lhq;->g(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LnJ4;

    invoke-virtual {v0}, LnJ4;->getAuthError()LMp;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v2, p0, LPp;->c:Lio/reactivex/subjects/d;

    invoke-virtual {v2, v1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_0
    instance-of v1, v0, LnJ4$a;

    if-eqz v1, :cond_1

    check-cast v0, LnJ4$a;

    invoke-virtual {v0}, LnJ4$a;->c()Lokhttp3/Response;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, v0, LnJ4$b;

    if-eqz v0, :cond_2

    new-instance v0, Lco/bird/android/coreinterface/manager/AuthRejectionException;

    invoke-interface {p1}, Lokhttp3/Interceptor$Chain;->request()Lokhttp3/Request;

    move-result-object p1

    invoke-direct {v0, p1}, Lco/bird/android/coreinterface/manager/AuthRejectionException;-><init>(Lokhttp3/Request;)V

    throw v0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
