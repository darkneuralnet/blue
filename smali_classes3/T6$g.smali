.class public final LT6$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT6;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/Map<",
        "Lco/bird/android/model/constant/PaymentInfoParams;",
        "+",
        "Ljava/lang/String;",
        ">;",
        "Lio/reactivex/u<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/api/request/BankRedirectOneTimeRefillResponse;",
        "+",
        "Ljava/util/Map<",
        "Lco/bird/android/model/constant/PaymentInfoParams;",
        "+",
        "Ljava/lang/String;",
        ">;>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0008\u001a\u0092\u0001\u0012B\u0008\u0001\u0012>\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000 \u0007*\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000\u0018\u00010\u00050\u0005 \u0007*H\u0012B\u0008\u0001\u0012>\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000 \u0007*\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "",
        "Lco/bird/android/model/constant/PaymentInfoParams;",
        "",
        "paymentInfoMap",
        "Lio/reactivex/u;",
        "Lkotlin/Pair;",
        "Lco/bird/api/request/BankRedirectOneTimeRefillResponse;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Ljava/util/Map;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LT6;


# direct methods
.method public constructor <init>(LT6;)V
    .locals 0

    iput-object p1, p0, LT6$g;->g:LT6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, LT6$g;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/util/Map;)Lio/reactivex/u;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/PaymentInfoParams;",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/u<",
            "+",
            "Lkotlin/Pair<",
            "Lco/bird/api/request/BankRedirectOneTimeRefillResponse;",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/PaymentInfoParams;",
            "Ljava/lang/String;",
            ">;>;>;"
        }
    .end annotation

    const-string v0, "paymentInfoMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LT6$g;->g:LT6;

    invoke-static {v0}, LT6;->access$getUi$p(LT6;)LX6;

    move-result-object v0

    invoke-interface {v0}, LX6;->Qe()Lc04;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LT6$g;->g:LT6;

    invoke-static {v1}, LT6;->access$getPaymentManagerV3$p(LT6;)LVM3;

    move-result-object v2

    invoke-virtual {v0}, Lc04;->b()J

    move-result-wide v3

    invoke-static {v1}, LT6;->access$getPaymentMethod$p(LT6;)Lco/bird/android/model/constant/PaymentMethod;

    move-result-object v0

    invoke-interface {v2, v3, v4, v0}, LVM3;->s(JLco/bird/android/model/constant/PaymentMethod;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/F;->j0()Lio/reactivex/p;

    move-result-object v0

    new-instance v1, LT6$g$a;

    invoke-direct {v1, p1}, LT6$g$a;-><init>(Ljava/util/Map;)V

    new-instance p1, LW6;

    invoke-direct {p1, v1}, LW6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/p;->H(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, LT6$g;->b(Ljava/util/Map;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
