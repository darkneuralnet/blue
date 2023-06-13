.class public final LvM3$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LvM3;->y(ILandroid/content/Intent;)Lio/reactivex/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/r<",
        "Lcom/stripe/android/model/StripeIntent;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lio/reactivex/r;",
        "Lcom/stripe/android/model/StripeIntent;",
        "emitter",
        "",
        "invoke",
        "(Lio/reactivex/r;)V",
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
.field public final synthetic g:LvM3;

.field public final synthetic h:I

.field public final synthetic i:Landroid/content/Intent;


# direct methods
.method public constructor <init>(LvM3;ILandroid/content/Intent;)V
    .locals 0

    iput-object p1, p0, LvM3$d;->g:LvM3;

    iput p2, p0, LvM3$d;->h:I

    iput-object p3, p0, LvM3$d;->i:Landroid/content/Intent;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/r;

    invoke-virtual {p0, p1}, LvM3$d;->invoke(Lio/reactivex/r;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/reactivex/r;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/r<",
            "Lcom/stripe/android/model/StripeIntent;",
            ">;)V"
        }
    .end annotation

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LvM3$d;->g:LvM3;

    invoke-static {v0}, LvM3;->access$getStripeNonMaster(LvM3;)Lcom/stripe/android/Stripe;

    move-result-object v0

    iget v1, p0, LvM3$d;->h:I

    iget-object v2, p0, LvM3$d;->i:Landroid/content/Intent;

    new-instance v3, LvM3$d$a;

    invoke-direct {v3, p1}, LvM3$d$a;-><init>(Lio/reactivex/r;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/stripe/android/Stripe;->onPaymentResult(ILandroid/content/Intent;Lcom/stripe/android/ApiResultCallback;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lio/reactivex/r;->onComplete()V

    :cond_0
    return-void
.end method
