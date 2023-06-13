.class public final Ltr$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltr;->i(Lco/bird/android/model/PlanItemModel;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/Balance;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/Balance;",
        "balance",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/Balance;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ltr;


# direct methods
.method public constructor <init>(Ltr;)V
    .locals 0

    iput-object p1, p0, Ltr$c;->g:Ltr;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/Balance;)Lio/reactivex/h;
    .locals 1

    const-string v0, "balance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/Balance;->getIntentId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Ltr$c;->g:Ltr;

    invoke-static {p1}, Ltr;->access$getManager$p(Ltr;)LpM3;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/COMPLETE;->INSTANCE:Lco/bird/android/model/COMPLETE;

    invoke-interface {p1, v0}, LpM3;->g(Lco/bird/android/model/PaymentIntentStatus;)V

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ltr$c;->g:Ltr;

    invoke-static {p1}, Ltr;->access$getManager$p(Ltr;)LpM3;

    move-result-object p1

    invoke-interface {p1}, LpM3;->s()Lio/reactivex/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Balance;

    invoke-virtual {p0, p1}, Ltr$c;->a(Lco/bird/android/model/Balance;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
