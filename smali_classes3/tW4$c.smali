.class public final LtW4$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LtW4;->N()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/persistence/RidePassView;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/persistence/RidePassView;",
        "kotlin.jvm.PlatformType",
        "purchasedRidePass",
        "",
        "a",
        "(Lco/bird/android/model/persistence/RidePassView;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LtW4;


# direct methods
.method public constructor <init>(LtW4;)V
    .locals 0

    iput-object p1, p0, LtW4$c;->g:LtW4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/persistence/RidePassView;)V
    .locals 9

    iget-object v0, p0, LtW4$c;->g:LtW4;

    new-instance v1, LJt2;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, LJt2;-><init>(Z)V

    invoke-virtual {v0, v1}, Lf1;->h(Ljava/lang/Object;)V

    iget-object v0, p0, LtW4$c;->g:LtW4;

    invoke-static {v0}, LtW4;->access$getAnalyticsManager$p(LtW4;)LEa;

    move-result-object v0

    new-instance v8, LEV4;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v1, p0, LtW4$c;->g:LtW4;

    invoke-virtual {v1}, LtW4;->p0()Lco/bird/android/model/persistence/RidePassView;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/persistence/RidePassView;->getLinkCode()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, LEV4;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v8}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    iget-object v0, p0, LtW4$c;->g:LtW4;

    new-instance v1, LKE1;

    invoke-virtual {v0}, LtW4;->p0()Lco/bird/android/model/persistence/RidePassView;

    move-result-object v2

    iget-object v3, p0, LtW4$c;->g:LtW4;

    invoke-static {v3}, LtW4;->access$getConverter$p(LtW4;)LRV4;

    move-result-object v3

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v3, p1}, LRV4;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v1, v2, p1}, LKE1;-><init>(Lco/bird/android/model/persistence/RidePassView;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lf1;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/persistence/RidePassView;

    invoke-virtual {p0, p1}, LtW4$c;->a(Lco/bird/android/model/persistence/RidePassView;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
