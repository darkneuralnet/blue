.class public final Lyq$a;
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
        "Ljava/lang/String;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "",
        "kotlin.jvm.PlatformType",
        "optionalLegacyAuthToken",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAuthTokensDebuggerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthTokensDebuggerPresenter.kt\nco/bird/android/app/feature/settings/auth/AuthTokensDebuggerPresenter$onCreate$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lyq;


# direct methods
.method public constructor <init>(Lyq;)V
    .locals 0

    iput-object p1, p0, Lyq$a;->g:Lyq;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lyq$a;->g:Lyq;

    invoke-static {v0}, Lyq;->access$getUi$p(Lyq;)LCq;

    move-result-object v0

    if-eqz p1, :cond_0

    new-instance v1, Lcom/auth0/android/jwt/JWT;

    invoke-direct {v1, p1}, Lcom/auth0/android/jwt/JWT;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lph2;->d(Lcom/auth0/android/jwt/JWT;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "--"

    if-nez v1, :cond_1

    move-object v1, v2

    :cond_1
    invoke-interface {v0, v1}, LCq;->f(Ljava/lang/String;)V

    iget-object v0, p0, Lyq$a;->g:Lyq;

    invoke-static {v0}, Lyq;->access$getUi$p(Lyq;)LCq;

    move-result-object v0

    if-nez p1, :cond_2

    move-object p1, v2

    :cond_2
    invoke-interface {v0, p1}, LCq;->e(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, Lyq$a;->a(Lco/bird/android/buava/Optional;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
