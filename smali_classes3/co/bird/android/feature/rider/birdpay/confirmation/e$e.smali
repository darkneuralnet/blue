.class public final Lco/bird/android/feature/rider/birdpay/confirmation/e$e;
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
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireMerchantSite;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/wire/WireMerchantSite;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/rider/birdpay/confirmation/e;

.field public final synthetic h:Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

.field public final synthetic i:Z


# direct methods
.method public constructor <init>(Lco/bird/android/feature/rider/birdpay/confirmation/e;Lco/bird/android/feature/rider/birdpay/confirmation/e$b;Z)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$e;->g:Lco/bird/android/feature/rider/birdpay/confirmation/e;

    iput-object p2, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$e;->h:Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    iput-boolean p3, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$e;->i:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireMerchantSite;)V
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/feature/rider/birdpay/confirmation/e$e;->g:Lco/bird/android/feature/rider/birdpay/confirmation/e;

    invoke-static {v1}, Lco/bird/android/feature/rider/birdpay/confirmation/e;->access$getAnalyticsManager$p(Lco/bird/android/feature/rider/birdpay/confirmation/e;)LEa;

    move-result-object v1

    iget-object v2, v0, Lco/bird/android/feature/rider/birdpay/confirmation/e$e;->h:Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    invoke-virtual {v2}, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->k()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "successful_payment"

    goto :goto_0

    :cond_0
    const-string v2, "rider_history"

    :goto_0
    move-object v7, v2

    iget-object v2, v0, Lco/bird/android/feature/rider/birdpay/confirmation/e$e;->h:Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    invoke-virtual {v2}, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->i()J

    move-result-wide v8

    iget-object v2, v0, Lco/bird/android/feature/rider/birdpay/confirmation/e$e;->h:Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    invoke-virtual {v2}, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->h()J

    move-result-wide v2

    iget-object v4, v0, Lco/bird/android/feature/rider/birdpay/confirmation/e$e;->h:Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    invoke-virtual {v4}, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->c()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/wire/WireMerchantSite;->getMerchant()Lco/bird/android/model/wire/WireMerchantDescription;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireMerchantDescription;->getId()Ljava/lang/String;

    move-result-object v12

    iget-object v4, v0, Lco/bird/android/feature/rider/birdpay/confirmation/e$e;->h:Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    invoke-virtual {v4}, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->e()Ljava/lang/String;

    move-result-object v13

    iget-object v4, v0, Lco/bird/android/feature/rider/birdpay/confirmation/e$e;->h:Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    invoke-virtual {v4}, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->f()Ljava/lang/String;

    move-result-object v14

    new-instance v15, LNO;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    iget-boolean v11, v0, Lco/bird/android/feature/rider/birdpay/confirmation/e$e;->i:Z

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    const/16 v16, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/16 v17, 0x407

    const/16 v18, 0x0

    move-object v3, v15

    move-object/from16 v19, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v2

    invoke-direct/range {v3 .. v18}, LNO;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v19

    invoke-interface {v1, v2}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireMerchantSite;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/birdpay/confirmation/e$e;->a(Lco/bird/android/model/wire/WireMerchantSite;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
