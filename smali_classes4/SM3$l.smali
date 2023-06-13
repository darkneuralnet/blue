.class public final LSM3$l;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSM3;->h()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSM3$l$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/request/DefaultPaymentProviderResponse;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/request/DefaultPaymentProviderResponse;",
        "response",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/request/DefaultPaymentProviderResponse;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LSM3;


# direct methods
.method public constructor <init>(LSM3;)V
    .locals 0

    iput-object p1, p0, LSM3$l;->g:LSM3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/request/DefaultPaymentProviderResponse;)Lio/reactivex/h;
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/api/request/DefaultPaymentProviderResponse;->getKind()Lco/bird/android/model/constant/PaymentProvider;

    move-result-object p1

    sget-object v0, LSM3$l$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LSM3$l;->g:LSM3;

    invoke-static {p1}, LSM3;->access$refreshBrainTreeDefaultPayment(LSM3;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object p1, p0, LSM3$l;->g:LSM3;

    invoke-static {p1}, LSM3;->access$refreshStripeDefaultPayment(LSM3;)Lio/reactivex/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/request/DefaultPaymentProviderResponse;

    invoke-virtual {p0, p1}, LSM3$l;->a(Lco/bird/api/request/DefaultPaymentProviderResponse;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
