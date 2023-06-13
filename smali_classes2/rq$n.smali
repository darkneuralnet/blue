.class public final Lrq$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrq;->K(Lio/reactivex/F;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "Lco/bird/android/model/TokenPair;",
        ">;",
        "LNp;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LHM4;",
        "Lco/bird/android/model/TokenPair;",
        "response",
        "LNp;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LHM4;)LNp;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lrq;


# direct methods
.method public constructor <init>(Lrq;)V
    .locals 0

    iput-object p1, p0, Lrq$n;->g:Lrq;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)LNp;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/android/model/TokenPair;",
            ">;)",
            "LNp;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LHM4;->b()I

    move-result v0

    div-int/lit8 v0, v0, 0x64

    invoke-virtual {p1}, LHM4;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p1, LNp$a;

    iget-object v0, p0, Lrq$n;->g:Lrq;

    invoke-virtual {v0}, Lrq;->d()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/TokenPairState;

    invoke-virtual {v1}, Lco/bird/android/model/TokenPairState;->getTokenPair()Lco/bird/android/model/TokenPair;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/TokenPair;->getAccessJwt()Lcom/auth0/android/jwt/JWT;

    move-result-object v1

    invoke-static {v0, v1}, Lrq;->access$makeV2Header(Lrq;Lcom/auth0/android/jwt/JWT;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, LNp$a;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    sget-object p1, LH1$d;->a:LH1$d;

    goto :goto_0

    :cond_1
    new-instance v0, LH1$c;

    invoke-virtual {p1}, LHM4;->h()Lokhttp3/Response;

    move-result-object p1

    const-string v1, "response.raw()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, LH1$c;-><init>(Lokhttp3/Response;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, Lrq$n;->a(LHM4;)LNp;

    move-result-object p1

    return-object p1
.end method
