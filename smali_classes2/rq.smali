.class public final Lrq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhq;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "CheckResult"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrq$b;,
        Lrq$c;,
        Lrq$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 12\u00020\u0001:\u00032*?B!\u0008\u0007\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u0010;\u001a\u000209\u00a2\u0006\u0004\u0008N\u0010OJ\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002J\u000e\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001a\u0010\u0011\u001a\u00020\u00082\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0016\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0016\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u001e\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170\u00160\u0007H\u0002J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0002J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0013H\u0002J\u0008\u0010\u001c\u001a\u00020\nH\u0002J\u000c\u0010\u001e\u001a\u00020\u001d*\u00020\u0013H\u0002J\u001a\u0010!\u001a\u0004\u0018\u00010\u001f*\u0004\u0018\u00010\u001f2\u0008\u0010 \u001a\u0004\u0018\u00010\u0017H\u0002J-\u0010\'\u001a\u00020\u00052#\u0010&\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003\u00a2\u0006\u000c\u0008#\u0012\u0008\u0008$\u0012\u0004\u0008\u0008(%\u0012\u0004\u0012\u00020\u00050\"H\u0016J/\u0010)\u001a\u00020\u00052%\u0010\u0004\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u001f\u00a2\u0006\u000c\u0008#\u0012\u0008\u0008$\u0012\u0004\u0008\u0008((\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\"H\u0016J\n\u0010*\u001a\u0004\u0018\u00010\u0003H\u0016J\u0008\u0010+\u001a\u00020\u001dH\u0016J8\u0010.\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010,2!\u0010&\u001a\u001d\u0012\u0013\u0012\u00110\u0008\u00a2\u0006\u000c\u0008#\u0012\u0008\u0008$\u0012\u0004\u0008\u0008(-\u0012\u0004\u0012\u00028\u00000\"H\u0016\u00a2\u0006\u0004\u0008.\u0010/J\u0008\u00101\u001a\u000200H\u0016J\u0008\u00102\u001a\u000200H\u0016J\u0008\u00103\u001a\u000200H\u0016J\u0008\u00104\u001a\u000200H\u0016R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u0010:R\'\u0010A\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001f0=0<8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008*\u0010>\u001a\u0004\u0008?\u0010@R\'\u0010B\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030=0<8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008?\u0010>\u001a\u0004\u00086\u0010@R \u0010E\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001f0=0C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u0010DR \u0010F\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030=0C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u0010DR\u0014\u0010I\u001a\u00020G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010HR\u001a\u0010K\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010J\u00a8\u0006P"
    }
    d2 = {
        "Lrq;",
        "Lhq;",
        "Lkotlin/Function0;",
        "",
        "update",
        "",
        "O",
        "Lio/reactivex/F;",
        "LNp;",
        "z",
        "Lrq$b;",
        "authState",
        "Lrq$d;",
        "C",
        "legacyToken",
        "LH1;",
        "errorIfNotPresent",
        "E",
        "y",
        "Lcom/auth0/android/jwt/JWT;",
        "refreshJwt",
        "H",
        "LHM4;",
        "Lco/bird/android/model/TokenPair;",
        "K",
        "token",
        "F",
        "G",
        "v",
        "",
        "D",
        "Lco/bird/android/model/TokenPairState;",
        "newTokenPair",
        "N",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "lastAuthHeader",
        "action",
        "k",
        "tokenPair",
        "h",
        "c",
        "j",
        "T",
        "authHeaderResult",
        "g",
        "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "Lio/reactivex/c;",
        "i",
        "b",
        "e",
        "f",
        "Lgl;",
        "a",
        "Lgl;",
        "appPreference",
        "LLp;",
        "LLp;",
        "authClient",
        "LZ84;",
        "Lco/bird/android/buava/Optional;",
        "Lkotlin/Lazy;",
        "d",
        "()LZ84;",
        "tokenPairState",
        "legacyAuthToken",
        "La94;",
        "La94;",
        "mutableTokenPairState",
        "mutableLegacyAuthToken",
        "Ljava/util/concurrent/locks/ReentrantReadWriteLock;",
        "Ljava/util/concurrent/locks/ReentrantReadWriteLock;",
        "lock",
        "Lio/reactivex/F;",
        "sharedAuthHeaderSingle",
        "LRh6;",
        "userStream",
        "<init>",
        "(Lgl;LRh6;LLp;)V",
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
        "SMAP\nAuthTokenManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthTokenManagerImpl.kt\nco/bird/android/auth/manager/AuthTokenManagerImpl\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,282:1\n9#2,4:283\n1#3:287\n*S KotlinDebug\n*F\n+ 1 AuthTokenManagerImpl.kt\nco/bird/android/auth/manager/AuthTokenManagerImpl\n*L\n99#1:283,4\n*E\n"
    }
.end annotation


# static fields
.field public static final i:Lrq$c;


# instance fields
.field public final a:Lgl;

.field public final b:LLp;

.field public final c:Lkotlin/Lazy;

.field public final d:Lkotlin/Lazy;

.field public final e:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/TokenPairState;",
            ">;>;"
        }
    .end annotation
.end field

.field public final f:La94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La94<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public final g:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field public final h:Lio/reactivex/F;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/F<",
            "LNp;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrq$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrq$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lrq;->i:Lrq$c;

    return-void
.end method

.method public constructor <init>(Lgl;LRh6;LLp;)V
    .locals 3

    const-string v0, "appPreference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userStream"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "authClient"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrq;->a:Lgl;

    iput-object p3, p0, Lrq;->b:LLp;

    new-instance p3, Lrq$o;

    invoke-direct {p3, p0}, Lrq$o;-><init>(Lrq;)V

    invoke-static {p3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p3

    iput-object p3, p0, Lrq;->c:Lkotlin/Lazy;

    new-instance p3, Lrq$h;

    invoke-direct {p3, p0}, Lrq$h;-><init>(Lrq;)V

    invoke-static {p3}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p3

    iput-object p3, p0, Lrq;->d:Lkotlin/Lazy;

    sget-object p3, La94;->h:La94$a;

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p1}, Lgl;->D0()Lco/bird/android/model/TokenPairState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v1

    new-instance v2, Lrq$j;

    invoke-direct {v2, p0}, Lrq$j;-><init>(Lrq;)V

    invoke-virtual {p3, v1, v2}, La94$a;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)La94;

    move-result-object v1

    iput-object v1, p0, Lrq;->e:La94;

    invoke-virtual {p1}, Lgl;->D()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    new-instance v0, Lrq$i;

    invoke-direct {v0, p0}, Lrq$i;-><init>(Lrq;)V

    invoke-virtual {p3, p1, v0}, La94$a;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)La94;

    move-result-object p1

    iput-object p1, p0, Lrq;->f:La94;

    new-instance p1, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    const/4 p3, 0x1

    invoke-direct {p1, p3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>(Z)V

    iput-object p1, p0, Lrq;->g:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {p0}, Lrq;->z()Lio/reactivex/F;

    move-result-object p1

    invoke-static {p1}, LYf5;->i0(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    iput-object p1, p0, Lrq;->h:Lio/reactivex/F;

    invoke-interface {p2}, LRh6;->i()Lio/reactivex/Observable;

    move-result-object p1

    new-instance p2, Lrq$a;

    invoke-direct {p2, p0}, Lrq$a;-><init>(Lrq;)V

    new-instance p3, Liq;

    invoke-direct {p3, p2}, Liq;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public static final A(Lrq;)Lrq$b;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lrq;->v()Lrq$b;

    move-result-object p0

    return-object p0
.end method

.method public static final B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final I(Lrq;)Lkotlin/Unit;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lrq$k;->g:Lrq$k;

    invoke-virtual {p0, v0}, Lrq;->h(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final J(Lrq;)Lkotlin/Unit;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrq$l;

    invoke-direct {v0, p0}, Lrq$l;-><init>(Lrq;)V

    invoke-virtual {p0, v0}, Lrq;->h(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final L(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LNp;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LNp;

    return-object p0
.end method

.method public static final M(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic access$exchangeTokens(Lrq;Ljava/lang/String;)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0, p1}, Lrq;->y(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getAppPreference$p(Lrq;)Lgl;
    .locals 0

    iget-object p0, p0, Lrq;->a:Lgl;

    return-object p0
.end method

.method public static final synthetic access$getCurrentAuthHeader(Lrq;Lrq$b;)Lrq$d;
    .locals 0

    invoke-virtual {p0, p1}, Lrq;->C(Lrq$b;)Lrq$d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMutableLegacyAuthToken$p(Lrq;)La94;
    .locals 0

    iget-object p0, p0, Lrq;->f:La94;

    return-object p0
.end method

.method public static final synthetic access$getMutableTokenPairState$p(Lrq;)La94;
    .locals 0

    iget-object p0, p0, Lrq;->e:La94;

    return-object p0
.end method

.method public static final synthetic access$makeV2Header(Lrq;Lcom/auth0/android/jwt/JWT;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lrq;->G(Lcom/auth0/android/jwt/JWT;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$refreshAccessToken(Lrq;Lcom/auth0/android/jwt/JWT;)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0, p1}, Lrq;->H(Lcom/auth0/android/jwt/JWT;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$update(Lrq;Lco/bird/android/model/TokenPairState;Lco/bird/android/model/TokenPair;)Lco/bird/android/model/TokenPairState;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lrq;->N(Lco/bird/android/model/TokenPairState;Lco/bird/android/model/TokenPair;)Lco/bird/android/model/TokenPairState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lrq;)Lrq$b;
    .locals 0

    invoke-static {p0}, Lrq;->A(Lrq;)Lrq$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lrq;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lrq;->J(Lrq;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lrq;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lrq;->x(Lrq;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lrq;->B(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LNp;
    .locals 0

    invoke-static {p0, p1}, Lrq;->L(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)LNp;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lrq;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lrq;->w(Lrq;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lrq;->M(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic s(Lrq;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lrq;->I(Lrq;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lrq;->u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final u(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final w(Lrq;)Lkotlin/Unit;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lrq$e;->g:Lrq$e;

    invoke-virtual {p0, v0}, Lrq;->O(Lkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final x(Lrq;)Lkotlin/Unit;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lrq$f;->g:Lrq$f;

    invoke-virtual {p0, v0}, Lrq;->h(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final C(Lrq$b;)Lrq$d;
    .locals 13

    invoke-virtual {p1}, Lrq$b;->b()Lco/bird/android/model/TokenPairState;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lrq$d;

    invoke-virtual {p1}, Lrq$b;->a()Ljava/lang/String;

    move-result-object v1

    sget-object v2, LH1$a;->a:LH1$a;

    invoke-virtual {p0, v1, v2}, Lrq;->E(Ljava/lang/String;LH1;)LNp;

    move-result-object v2

    invoke-virtual {p1}, Lrq$b;->a()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lrq$d;-><init>(LNp;Ljava/lang/String;Lcom/auth0/android/jwt/JWT;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    invoke-virtual {p1}, Lrq$b;->b()Lco/bird/android/model/TokenPairState;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/TokenPairState;->getRefreshRequested()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lrq$b;->b()Lco/bird/android/model/TokenPairState;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/TokenPairState;->getTokenPair()Lco/bird/android/model/TokenPair;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/TokenPair;->getAccessJwt()Lcom/auth0/android/jwt/JWT;

    move-result-object v0

    invoke-virtual {p0, v0}, Lrq;->D(Lcom/auth0/android/jwt/JWT;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lrq$d;

    new-instance v2, LNp$a;

    invoke-virtual {p1}, Lrq$b;->b()Lco/bird/android/model/TokenPairState;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/TokenPairState;->getTokenPair()Lco/bird/android/model/TokenPair;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/TokenPair;->getAccessJwt()Lcom/auth0/android/jwt/JWT;

    move-result-object p1

    invoke-virtual {p0, p1}, Lrq;->G(Lcom/auth0/android/jwt/JWT;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, LNp$a;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lrq$d;-><init>(LNp;Ljava/lang/String;Lcom/auth0/android/jwt/JWT;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_1
    invoke-virtual {p1}, Lrq$b;->b()Lco/bird/android/model/TokenPairState;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/TokenPairState;->getTokenPair()Lco/bird/android/model/TokenPair;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/TokenPair;->getRefreshJwt()Lcom/auth0/android/jwt/JWT;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lph2;->c(Lcom/auth0/android/jwt/JWT;I)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance p1, Lrq$d;

    sget-object v2, LH1$e;->a:LH1$e;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lrq$d;-><init>(LNp;Ljava/lang/String;Lcom/auth0/android/jwt/JWT;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_2
    new-instance v0, Lrq$d;

    new-instance v8, LNp$a;

    invoke-virtual {p1}, Lrq$b;->b()Lco/bird/android/model/TokenPairState;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/TokenPairState;->getTokenPair()Lco/bird/android/model/TokenPair;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/TokenPair;->getAccessJwt()Lcom/auth0/android/jwt/JWT;

    move-result-object v1

    invoke-virtual {p0, v1}, Lrq;->G(Lcom/auth0/android/jwt/JWT;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v8, v1}, LNp$a;-><init>(Ljava/lang/String;)V

    const/4 v9, 0x0

    invoke-virtual {p1}, Lrq$b;->b()Lco/bird/android/model/TokenPairState;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/TokenPairState;->getTokenPair()Lco/bird/android/model/TokenPair;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/TokenPair;->getRefreshJwt()Lcom/auth0/android/jwt/JWT;

    move-result-object v10

    const/4 v11, 0x2

    const/4 v12, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lrq$d;-><init>(LNp;Ljava/lang/String;Lcom/auth0/android/jwt/JWT;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final D(Lcom/auth0/android/jwt/JWT;)Z
    .locals 3

    invoke-virtual {p1}, Lcom/auth0/android/jwt/JWT;->c()Ljava/util/Date;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v0

    const/16 v1, 0x258

    invoke-virtual {v0, v1}, Lorg/joda/time/DateTime;->plusSeconds(I)Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lorg/joda/time/base/AbstractInstant;->isAfter(J)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final E(Ljava/lang/String;LH1;)LNp;
    .locals 0

    if-eqz p1, :cond_0

    new-instance p2, LNp$a;

    invoke-virtual {p0, p1}, Lrq;->F(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, LNp$a;-><init>(Ljava/lang/String;)V

    :cond_0
    return-object p2
.end method

.method public final F(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bird "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final G(Lcom/auth0/android/jwt/JWT;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bearer "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final H(Lcom/auth0/android/jwt/JWT;)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/auth0/android/jwt/JWT;",
            ")",
            "Lio/reactivex/F<",
            "LNp;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lrq;->b:LLp;

    invoke-virtual {p0, p1}, Lrq;->G(Lcom/auth0/android/jwt/JWT;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, LLp;->a(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p0, p1}, Lrq;->K(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final K(Lio/reactivex/F;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/F<",
            "LHM4<",
            "Lco/bird/android/model/TokenPair;",
            ">;>;)",
            "Lio/reactivex/F<",
            "LNp;",
            ">;"
        }
    .end annotation

    new-instance v0, Lrq$m;

    invoke-direct {v0, p0}, Lrq$m;-><init>(Lrq;)V

    new-instance v1, Ljq;

    invoke-direct {v1, v0}, Ljq;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->w(Lio/reactivex/functions/g;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lrq$n;

    invoke-direct {v0, p0}, Lrq$n;-><init>(Lrq;)V

    new-instance v1, Lkq;

    invoke-direct {v1, v0}, Lkq;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "private fun Single<Respo\u2026())\n        }\n      }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final N(Lco/bird/android/model/TokenPairState;Lco/bird/android/model/TokenPair;)Lco/bird/android/model/TokenPairState;
    .locals 3

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 v2, 0x2

    invoke-static {p1, p2, v1, v2, v0}, Lco/bird/android/model/TokenPairState;->copy$default(Lco/bird/android/model/TokenPairState;Lco/bird/android/model/TokenPair;ZILjava/lang/Object;)Lco/bird/android/model/TokenPairState;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    new-instance p1, Lco/bird/android/model/TokenPairState;

    invoke-direct {p1, p2, v1}, Lco/bird/android/model/TokenPairState;-><init>(Lco/bird/android/model/TokenPair;Z)V

    :cond_1
    move-object v0, p1

    :cond_2
    return-object v0
.end method

.method public final O(Lkotlin/jvm/functions/Function0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lrq;->g:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    const-string v1, "lock.writeLock()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v1, p0, Lrq;->f:La94;

    sget-object v2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-virtual {v1, p1}, La94;->accept(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public a()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lrq;->d:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public b()Lio/reactivex/c;
    .locals 2

    new-instance v0, Lqq;

    invoke-direct {v0, p0}, Lqq;-><init>(Lrq;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "fromCallable {\n      upd\u2026eTokenPair { null }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lrq;->v()Lrq$b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lrq;->C(Lrq$b;)Lrq$d;

    move-result-object v0

    invoke-virtual {v0}, Lrq$d;->a()LNp;

    move-result-object v0

    instance-of v1, v0, LNp$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    check-cast v0, LNp$a;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LNp$a;->b()Ljava/lang/String;

    move-result-object v2

    :cond_1
    return-object v2
.end method

.method public d()LZ84;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/TokenPairState;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lrq;->c:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ84;

    return-object v0
.end method

.method public e()Lio/reactivex/c;
    .locals 2

    new-instance v0, Loq;

    invoke-direct {v0, p0}, Loq;-><init>(Lrq;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "fromCallable {\n      upd\u2026yAuthToken { null }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public f()Lio/reactivex/c;
    .locals 2

    new-instance v0, Lpq;

    invoke-direct {v0, p0}, Lpq;-><init>(Lrq;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "fromCallable {\n      upd\u2026wTokenPair)\n      }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public g(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LNp;",
            "+TT;>;)TT;"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrq;->g:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    const-string v1, "lock.readLock()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v1, p0, Lrq;->h:Lio/reactivex/F;

    invoke-virtual {v1}, Lio/reactivex/F;->g()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "sharedAuthHeaderSingle.blockingGet()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public h(Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lco/bird/android/model/TokenPairState;",
            "Lco/bird/android/model/TokenPairState;",
            ">;)V"
        }
    .end annotation

    const-string v0, "update"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrq;->g:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    const-string v1, "lock.writeLock()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v1, p0, Lrq;->e:La94;

    sget-object v2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p0}, Lrq;->d()LZ84;

    move-result-object v3

    invoke-virtual {v3}, LZ84;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/buava/Optional;

    invoke-virtual {v3}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, p1}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    invoke-virtual {v1, p1}, La94;->accept(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public i()Lio/reactivex/c;
    .locals 2

    new-instance v0, Lnq;

    invoke-direct {v0, p0}, Lnq;-><init>(Lrq;)V

    invoke-static {v0}, Lio/reactivex/c;->H(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "fromCallable {\n      upd\u2026Requested = true) }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public j()Z
    .locals 2

    invoke-virtual {p0}, Lrq;->d()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/TokenPairState;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Lco/bird/android/model/TokenPairState;->getTokenPair()Lco/bird/android/model/TokenPair;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/TokenPair;->getRefreshJwt()Lcom/auth0/android/jwt/JWT;

    move-result-object v0

    invoke-static {v0, v1}, Lph2;->c(Lcom/auth0/android/jwt/JWT;I)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public k(Lkotlin/jvm/functions/Function1;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrq;->g:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    const-string v1, "lock.writeLock()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {p0}, Lrq;->c()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lrq;->f:La94;

    sget-object v3, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v3}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v4

    invoke-virtual {v2, v4}, La94;->accept(Ljava/lang/Object;)V

    iget-object v2, p0, Lrq;->e:La94;

    invoke-virtual {v3}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v3

    invoke-virtual {v2, v3}, La94;->accept(Ljava/lang/Object;)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1
.end method

.method public final v()Lrq$b;
    .locals 3

    new-instance v0, Lrq$b;

    invoke-virtual {p0}, Lrq;->a()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0}, Lrq;->d()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/buava/Optional;

    invoke-virtual {v2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/TokenPairState;

    invoke-direct {v0, v1, v2}, Lrq$b;-><init>(Ljava/lang/String;Lco/bird/android/model/TokenPairState;)V

    return-object v0
.end method

.method public final y(Ljava/lang/String;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "LNp;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lrq;->b:LLp;

    new-instance v1, Luh1;

    invoke-direct {v1, p1}, Luh1;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LLp;->b(Luh1;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p0, p1}, Lrq;->K(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final z()Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "LNp;",
            ">;"
        }
    .end annotation

    new-instance v0, Llq;

    invoke-direct {v0, p0}, Llq;-><init>(Lrq;)V

    invoke-static {v0}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lrq$g;

    invoke-direct {v1, p0}, Lrq$g;-><init>(Lrq;)V

    new-instance v2, Lmq;

    invoke-direct {v2, v1}, Lmq;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object v0

    const-string v1, "private fun getAuthHeade\u2026lt)\n        }\n      }\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
