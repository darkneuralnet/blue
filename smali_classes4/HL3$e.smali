.class public final LHL3$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LHL3;->a(Lio/reactivex/F;)Lio/reactivex/p;
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
        "TT;>;",
        "Lio/reactivex/u<",
        "+",
        "LHM4<",
        "TT;>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0005*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0002 \u0005* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0005*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0004\"\u0008\u0008\u0000\u0010\u0001*\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lco/bird/api/response/WirePaymentActionRequiredResponse;",
        "T",
        "LHM4;",
        "response",
        "Lio/reactivex/u;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LHM4;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LHL3;


# direct methods
.method public constructor <init>(LHL3;)V
    .locals 0

    iput-object p1, p0, LHL3$e;->g:LHL3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)Lio/reactivex/u;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "TT;>;)",
            "Lio/reactivex/u<",
            "+",
            "LHM4<",
            "TT;>;>;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LHM4;->b()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handling response with status code "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " in payment authorization handler"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, LHM4;->b()I

    move-result v0

    const/16 v2, 0x12f

    if-ne v0, v2, :cond_2

    invoke-virtual {p1}, LHM4;->e()Lokhttp3/ResponseBody;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, LHL3$e;->g:LHL3;

    invoke-static {v0}, LHL3;->access$getDeserializer$p(LHL3;)Lwi2;

    move-result-object v0

    const-class v2, Lco/bird/api/response/BaseWirePaymentActionRequiredResponse;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Lwi2;->c(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/api/response/BaseWirePaymentActionRequiredResponse;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "encountered a response code of 303, attempting to handle payment action now"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, LHL3$e;->g:LHL3;

    invoke-static {v0, p1}, LHL3;->access$handlePaymentResponse(LHL3;Lco/bird/api/response/WirePaymentActionRequiredResponse;)Lio/reactivex/c;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/c;->f0()Lio/reactivex/p;

    move-result-object p1

    goto :goto_2

    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "expected body containing wire payment action required response but none found"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/p;->v(Ljava/lang/Throwable;)Lio/reactivex/p;

    move-result-object p1

    return-object p1

    :cond_2
    const/16 v2, 0xc8

    if-gt v2, v0, :cond_3

    const/16 v2, 0x12c

    if-ge v0, v2, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    move v0, v1

    :goto_1
    if-eqz v0, :cond_4

    invoke-static {p1}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_2

    :cond_4
    iget-object v0, p0, LHL3$e;->g:LHL3;

    invoke-static {v0}, LHL3;->access$getDeserializer$p(LHL3;)Lwi2;

    move-result-object v0

    invoke-static {p1, v0}, Lco/bird/api/error/RetrofitException;->d(LHM4;Lwi2;)Lco/bird/api/error/RetrofitException;

    move-result-object p1

    const-string v0, "mapping request response to exception to return from payment authorization handler "

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Lio/reactivex/p;->v(Ljava/lang/Throwable;)Lio/reactivex/p;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LHL3$e;->a(LHM4;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
