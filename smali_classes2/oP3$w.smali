.class public final LoP3$w;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LoP3;->z0()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LRe4<",
        "+",
        "Lco/bird/android/model/User;",
        "+",
        "Lco/bird/android/model/Balance;",
        "+",
        "Lco/bird/api/response/SavedPaymentMethodResponse;",
        "+",
        "Lkotlin/Unit;",
        "+",
        "Ljava/lang/Boolean;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0008\u001a\u00020\u00052\u009b\u0001\u0010\u0007\u001a\u0096\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006 \u0002*J\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "LRe4;",
        "Lco/bird/android/model/User;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/Balance;",
        "Lco/bird/api/response/SavedPaymentMethodResponse;",
        "",
        "",
        "<name for destructuring parameter 0>",
        "a",
        "(LRe4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LoP3;


# direct methods
.method public constructor <init>(LoP3;)V
    .locals 0

    iput-object p1, p0, LoP3$w;->g:LoP3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LRe4;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LRe4<",
            "Lco/bird/android/model/User;",
            "Lco/bird/android/model/Balance;",
            "Lco/bird/api/response/SavedPaymentMethodResponse;",
            "Lkotlin/Unit;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, LRe4;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    iget-object v0, p0, LoP3$w;->g:LoP3;

    invoke-static {v0}, LoP3;->access$getReloadedData$p(LoP3;)Lio/reactivex/subjects/d;

    move-result-object v0

    new-instance v1, LqY0;

    const-string v2, "googlePayReady"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-direct {v1, p1}, LqY0;-><init>(Z)V

    invoke-virtual {v0, v1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LRe4;

    invoke-virtual {p0, p1}, LoP3$w;->a(LRe4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
