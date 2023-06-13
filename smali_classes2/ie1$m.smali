.class public final Lie1$m;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lie1;->M(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/SetupIntentStatus;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/SetupIntentStatus;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/SetupIntentStatus;",
        "setupIntentStatus",
        "Lio/reactivex/u;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Lco/bird/android/model/SetupIntentStatus;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lie1;


# direct methods
.method public constructor <init>(Lie1;)V
    .locals 0

    iput-object p1, p0, Lie1$m;->g:Lie1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lie1$m;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/SetupIntentStatus;
    .locals 0

    invoke-static {p0, p1}, Lie1$m;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/SetupIntentStatus;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/SetupIntentStatus;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/SetupIntentStatus;

    return-object p0
.end method


# virtual methods
.method public final c(Lco/bird/android/model/SetupIntentStatus;)Lio/reactivex/u;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/SetupIntentStatus;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/SetupIntentStatus;",
            ">;"
        }
    .end annotation

    const-string v0, "setupIntentStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/model/SetupIntentStatus;->SETUP_INTENT_ERROR:Lco/bird/android/model/SetupIntentStatus;

    if-eq p1, v0, :cond_1

    sget-object v0, Lco/bird/android/model/SetupIntentStatus;->ATTACH_PAYMENT_ERROR:Lco/bird/android/model/SetupIntentStatus;

    if-eq p1, v0, :cond_1

    sget-object v0, Lco/bird/android/model/SetupIntentStatus;->UNEXPECTED:Lco/bird/android/model/SetupIntentStatus;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lie1$m;->g:Lie1;

    invoke-static {v0}, Lie1;->access$getPaymentManagerV2$p(Lie1;)LAM3;

    move-result-object v0

    invoke-interface {v0}, LAM3;->h()Lio/reactivex/c;

    move-result-object v0

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->j0()Lio/reactivex/p;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lie1$m;->g:Lie1;

    invoke-static {v0}, Lie1;->access$getReactiveConfig$p(Lie1;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getPaymentConfig()Lco/bird/android/model/wire/configs/PaymentConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/PaymentConfig;->getEnablePaypal()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iget-object v0, p0, Lie1$m;->g:Lie1;

    invoke-static {v0}, Lie1;->access$getReactiveConfig$p(Lie1;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getPaymentConfig()Lco/bird/android/model/wire/configs/PaymentConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/PaymentConfig;->getSuggestPaypalOnPaymentAddError()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lie1$m;->g:Lie1;

    invoke-static {v0}, Lie1;->access$getUi$p(Lie1;)Lpe1;

    move-result-object v0

    sget-object v2, LwN3;->d:LwN3;

    invoke-interface {v0, v2, v1, v1}, LH31;->birdDialog(LNy;ZZ)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lie1$m$a;

    iget-object v2, p0, Lie1$m;->g:Lie1;

    invoke-direct {v1, v2, p1}, Lie1$m$a;-><init>(Lie1;Lco/bird/android/model/SetupIntentStatus;)V

    new-instance p1, Lje1;

    invoke-direct {p1, v1}, Lje1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->C(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lie1$m;->g:Lie1;

    invoke-static {v0}, Lie1;->access$getUi$p(Lie1;)Lpe1;

    move-result-object v0

    sget-object v2, LjM3;->d:LjM3;

    invoke-interface {v0, v2, v1, v1}, LH31;->birdDialog(LNy;ZZ)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, Lie1$m$b;

    invoke-direct {v1, p1}, Lie1$m$b;-><init>(Lco/bird/android/model/SetupIntentStatus;)V

    new-instance p1, Lke1;

    invoke-direct {p1, v1}, Lke1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->j0()Lio/reactivex/p;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/SetupIntentStatus;

    invoke-virtual {p0, p1}, Lie1$m;->c(Lco/bird/android/model/SetupIntentStatus;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
