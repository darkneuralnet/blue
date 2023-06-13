.class public final Lyq$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyq;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/TokenPairState;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/TokenPairState;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/buava/Optional;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lyq;


# direct methods
.method public constructor <init>(Lyq;)V
    .locals 0

    iput-object p1, p0, Lyq$b;->g:Lyq;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/TokenPairState;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/TokenPairState;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/TokenPairState;->getTokenPair()Lco/bird/android/model/TokenPair;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    iget-object v1, p0, Lyq$b;->g:Lyq;

    invoke-static {v1}, Lyq;->access$getUi$p(Lyq;)LCq;

    move-result-object v1

    const/4 v2, 0x2

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/TokenPair;->getAccessJwt()Lcom/auth0/android/jwt/JWT;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {v3}, Lph2;->d(Lcom/auth0/android/jwt/JWT;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v0

    :goto_1
    const-string v4, "--"

    if-nez v3, :cond_2

    move-object v3, v4

    :cond_2
    invoke-interface {v1, v3}, LCq;->i(Ljava/lang/String;)V

    iget-object v1, p0, Lyq$b;->g:Lyq;

    invoke-static {v1}, Lyq;->access$getUi$p(Lyq;)LCq;

    move-result-object v1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/TokenPair;->getRefreshJwt()Lcom/auth0/android/jwt/JWT;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-static {v3}, Lph2;->d(Lcom/auth0/android/jwt/JWT;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object v0

    :cond_3
    if-nez v0, :cond_4

    move-object v0, v4

    :cond_4
    invoke-interface {v1, v0}, LCq;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lyq$b;->g:Lyq;

    invoke-static {v0}, Lyq;->access$getUi$p(Lyq;)LCq;

    move-result-object v0

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lco/bird/android/model/TokenPair;->getAccessJwt()Lcom/auth0/android/jwt/JWT;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/auth0/android/jwt/JWT;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    :cond_5
    move-object v1, v4

    :cond_6
    invoke-interface {v0, v1}, LCq;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lyq$b;->g:Lyq;

    invoke-static {v0}, Lyq;->access$getUi$p(Lyq;)LCq;

    move-result-object v0

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lco/bird/android/model/TokenPair;->getRefreshJwt()Lcom/auth0/android/jwt/JWT;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/auth0/android/jwt/JWT;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_7

    goto :goto_2

    :cond_7
    move-object v4, p1

    :cond_8
    :goto_2
    invoke-interface {v0, v4}, LCq;->g(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, Lyq$b;->a(Lco/bird/android/buava/Optional;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
