.class public final Lco/bird/android/feature/rider/birdpay/confirmation/e$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/rider/birdpay/confirmation/e;->a()V
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
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/rider/birdpay/confirmation/e;

.field public final synthetic h:Lco/bird/android/feature/rider/birdpay/confirmation/e$b;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/rider/birdpay/confirmation/e;Lco/bird/android/feature/rider/birdpay/confirmation/e$b;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$g;->g:Lco/bird/android/feature/rider/birdpay/confirmation/e;

    iput-object p2, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$g;->h:Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/birdpay/confirmation/e$g;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 12

    iget-object p1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$g;->g:Lco/bird/android/feature/rider/birdpay/confirmation/e;

    invoke-static {p1}, Lco/bird/android/feature/rider/birdpay/confirmation/e;->access$getAnalyticsManager$p(Lco/bird/android/feature/rider/birdpay/confirmation/e;)LEa;

    move-result-object p1

    new-instance v11, LPO;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "receipt-screen"

    iget-object v0, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$g;->h:Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    invoke-virtual {v0}, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->i()J

    move-result-wide v5

    iget-object v0, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$g;->h:Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    invoke-virtual {v0}, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->c()Ljava/lang/String;

    move-result-object v7

    iget-object v0, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$g;->h:Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    invoke-virtual {v0}, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->j()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x7

    const/4 v10, 0x0

    move-object v0, v11

    invoke-direct/range {v0 .. v10}, LPO;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v11}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method
