.class public final LcO3$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LcO3;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/BirdPayment;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/BirdPayment;",
        "paymentToRemove",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Lco/bird/android/model/BirdPayment;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LcO3;


# direct methods
.method public constructor <init>(LcO3;)V
    .locals 0

    iput-object p1, p0, LcO3$h;->g:LcO3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LcO3$h;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LcO3$h;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Lco/bird/android/model/BirdPayment;)Lio/reactivex/h;
    .locals 6

    const-string v0, "paymentToRemove"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LcO3$h;->g:LcO3;

    invoke-static {v0}, LcO3;->access$getRideManager$p(LcO3;)LYR4;

    move-result-object v0

    invoke-interface {v0}, LYR4;->N()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, LcO3$h;->g:LcO3;

    invoke-virtual {p1}, LcO3;->r()LlO3;

    move-result-object v0

    sget-object v1, LuP3;->d:LuP3;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LH31$a;->dialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, LcO3$h$a;->g:LcO3$h$a;

    new-instance v1, LhO3;

    invoke-direct {v1, v0}, LhO3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/BirdPayment;->isPaypal()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LcO3$h;->g:LcO3;

    invoke-static {v0, p1}, LcO3;->access$removePaypal(LcO3;Lco/bird/android/model/BirdPayment;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LcO3$h;->g:LcO3;

    invoke-static {v0, p1}, LcO3;->access$removeCard(LcO3;Lco/bird/android/model/BirdPayment;)Lio/reactivex/c;

    move-result-object p1

    :goto_0
    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->P(Lio/reactivex/E;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "when {\n          rideMan\u2026dSchedulers.mainThread())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LcO3$h;->g:LcO3;

    invoke-virtual {v0}, LcO3;->r()LlO3;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v1, v2}, LsD;->progress$default(Lio/reactivex/c;LS74;IILjava/lang/Object;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, LcO3$h$b;

    iget-object v1, p0, LcO3$h;->g:LcO3;

    invoke-direct {v0, v1}, LcO3$h$b;-><init>(LcO3;)V

    new-instance v1, LiO3;

    invoke-direct {v1, v0}, LiO3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/BirdPayment;

    invoke-virtual {p0, p1}, LcO3$h;->c(Lco/bird/android/model/BirdPayment;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
