.class public final Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;,
        Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0017\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u001f\u0008\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tB\u001f\u0008\u0001\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000cJ\u0011\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0008\u0010\u0010\u001a\u00020\u000eH\u0002R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;",
        "Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;",
        "context",
        "Landroid/content/Context;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V",
        "appVersion",
        "",
        "(Landroid/content/Context;ILkotlin/coroutines/CoroutineContext;)V",
        "store",
        "Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;",
        "(Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;ILkotlin/coroutines/CoroutineContext;)V",
        "get",
        "Lcom/stripe/android/stripe3ds2/init/AppInfo;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "initAppInfo",
        "Companion",
        "Store",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static final Companion:Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Companion;

.field private static final INVALID_VERSION_CODE:I = -0x1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final appVersion:I

.field private final store:Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->Companion:Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILkotlin/coroutines/CoroutineContext;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store$Default;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store$Default;-><init>(Landroid/content/Context;ILkotlin/coroutines/CoroutineContext;)V

    invoke-direct {p0, v0, p2, p3}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;-><init>(Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;ILkotlin/coroutines/CoroutineContext;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->Companion:Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Companion;

    invoke-static {v0, p1}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Companion;->access$getAppVersion(Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Companion;Landroid/content/Context;)I

    move-result v0

    invoke-direct {p0, p1, v0, p2}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;-><init>(Landroid/content/Context;ILkotlin/coroutines/CoroutineContext;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;ILkotlin/coroutines/CoroutineContext;)V
    .locals 7

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->store:Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;

    iput p2, p0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->appVersion:I

    invoke-static {p3}, LaD0;->a(Lkotlin/coroutines/CoroutineContext;)LZC0;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$1;

    const/4 p1, 0x0

    invoke-direct {v4, p0, p1}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$1;-><init>(Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method

.method public static final synthetic access$getAppVersion$p(Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;)I
    .locals 0

    iget p0, p0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->appVersion:I

    return p0
.end method

.method public static final synthetic access$getStore$p(Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;)Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->store:Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;

    return-object p0
.end method

.method public static final synthetic access$initAppInfo(Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;)Lcom/stripe/android/stripe3ds2/init/AppInfo;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->initAppInfo()Lcom/stripe/android/stripe3ds2/init/AppInfo;

    move-result-object p0

    return-object p0
.end method

.method private final initAppInfo()Lcom/stripe/android/stripe3ds2/init/AppInfo;
    .locals 3

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/AppInfo;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "randomUUID().toString()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, p0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->appVersion:I

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/stripe3ds2/init/AppInfo;-><init>(Ljava/lang/String;I)V

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->store:Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;

    invoke-interface {v1, v0}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;->save(Lcom/stripe/android/stripe3ds2/init/AppInfo;)V

    return-object v0
.end method


# virtual methods
.method public get(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/stripe3ds2/init/AppInfo;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;

    iget v1, v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;-><init>(Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->store:Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;

    iput-object p0, v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$get$1;->label:I

    invoke-interface {p1, v0}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;->get(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    check-cast p1, Lcom/stripe/android/stripe3ds2/init/AppInfo;

    if-nez p1, :cond_4

    invoke-direct {v0}, Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;->initAppInfo()Lcom/stripe/android/stripe3ds2/init/AppInfo;

    move-result-object p1

    :cond_4
    return-object p1
.end method
