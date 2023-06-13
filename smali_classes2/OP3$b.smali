.class public final LOP3$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOP3;->f(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lio/reactivex/K<",
        "+",
        "Lkotlin/Unit;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0006\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)Lio/reactivex/K;",
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
.field public final synthetic g:LOP3;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LOP3;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LOP3$b;->g:LOP3;

    iput-object p2, p0, LOP3$b;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lkotlin/Unit;)Lio/reactivex/K;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Unit;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LOP3$b;->g:LOP3;

    invoke-static {p1}, LOP3;->access$getReactiveConfig$p(LOP3;)LTq4;

    move-result-object p1

    invoke-virtual {p1}, LTq4;->f8()LZ84;

    move-result-object p1

    invoke-virtual {p1}, LZ84;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getPaymentConfig()Lco/bird/android/model/wire/configs/PaymentConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/PaymentConfig;->getPaymentProviderEndpointVersions()Ljava/util/Map;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    sget-object v1, Lco/bird/android/model/constant/PaymentProvider;->BRAINTREE:Lco/bird/android/model/constant/PaymentProvider;

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x3

    if-ne p1, v1, :cond_2

    iget-object p1, p0, LOP3$b;->g:LOP3;

    invoke-static {p1}, LOP3;->access$getPaymentManagerV3$p(LOP3;)LVM3;

    move-result-object p1

    iget-object v1, p0, LOP3$b;->h:Ljava/lang/String;

    invoke-interface {p1, v1}, LVM3;->u(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    goto :goto_2

    :cond_2
    :goto_1
    iget-object p1, p0, LOP3$b;->g:LOP3;

    invoke-static {p1}, LOP3;->access$getPaymentManagerV2$p(LOP3;)LAM3;

    move-result-object p1

    sget-object v1, Lco/bird/android/model/constant/PaymentProvider;->BRAINTREE:Lco/bird/android/model/constant/PaymentProvider;

    invoke-interface {p1, v1}, LAM3;->f(Lco/bird/android/model/constant/PaymentProvider;)Lio/reactivex/c;

    move-result-object p1

    :goto_2
    const-string v1, "when (reactiveConfig.con\u2026ider.BRAINTREE)\n        }"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LOP3$b;->g:LOP3;

    invoke-static {v1}, LOP3;->access$getUi$p(LOP3;)LSP3;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v1, v2, v3, v0}, LsD;->progress$default(Lio/reactivex/c;LS74;IILjava/lang/Object;)Lio/reactivex/c;

    move-result-object p1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LOP3$b;->invoke(Lkotlin/Unit;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
