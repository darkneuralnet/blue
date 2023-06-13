.class public final LP04$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP04;->O()V
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
        "Lco/bird/api/request/BraintreeTokenResponse;",
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
        "LHM4;",
        "Lco/bird/api/request/BraintreeTokenResponse;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(LHM4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LP04;


# direct methods
.method public constructor <init>(LP04;)V
    .locals 0

    iput-object p1, p0, LP04$k;->g:LP04;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/api/request/BraintreeTokenResponse;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, LHM4;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/api/request/BraintreeTokenResponse;

    if-eqz p1, :cond_1

    iget-object v0, p0, LP04$k;->g:LP04;

    new-instance v1, LzE0;

    invoke-virtual {p1}, Lco/bird/api/request/BraintreeTokenResponse;->getToken()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, LzE0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lf1;->h(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LP04$k;->g:LP04;

    new-instance v0, LHt2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LHt2;-><init>(Z)V

    invoke-virtual {p1, v0}, Lf1;->h(Ljava/lang/Object;)V

    iget-object p1, p0, LP04$k;->g:LP04;

    new-instance v0, Lpg1;

    sget v1, Lnl4;->error_generic_body:I

    invoke-direct {v0, v1}, Lpg1;-><init>(I)V

    invoke-virtual {p1, v0}, Lf1;->h(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LP04$k;->a(LHM4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
