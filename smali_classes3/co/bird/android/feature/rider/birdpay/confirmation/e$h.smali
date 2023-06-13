.class public final Lco/bird/android/feature/rider/birdpay/confirmation/e$h;
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

    iput-object p1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$h;->g:Lco/bird/android/feature/rider/birdpay/confirmation/e;

    iput-object p2, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$h;->h:Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/birdpay/confirmation/e$h;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 7

    iget-object p1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$h;->g:Lco/bird/android/feature/rider/birdpay/confirmation/e;

    invoke-static {p1}, Lco/bird/android/feature/rider/birdpay/confirmation/e;->access$getMerchantSiteSubject$p(Lco/bird/android/feature/rider/birdpay/confirmation/e;)Lio/reactivex/subjects/a;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/subjects/a;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireMerchantSite;

    iget-object v0, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$h;->g:Lco/bird/android/feature/rider/birdpay/confirmation/e;

    iget-object v1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$h;->h:Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    invoke-virtual {v1}, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->j()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$h;->h:Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    invoke-virtual {v2}, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->e()Ljava/lang/String;

    move-result-object v2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireMerchantSite;->getMerchant()Lco/bird/android/model/wire/WireMerchantDescription;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireMerchantDescription;->getName()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v3, p1

    iget-object p1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$h;->h:Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    invoke-virtual {p1}, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->i()J

    move-result-wide v4

    iget-object p1, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$h;->h:Lco/bird/android/feature/rider/birdpay/confirmation/e$b;

    invoke-virtual {p1}, Lco/bird/android/feature/rider/birdpay/confirmation/e$b;->c()Ljava/lang/String;

    move-result-object v6

    invoke-static/range {v0 .. v6}, Lco/bird/android/feature/rider/birdpay/confirmation/e;->access$buildZendeskTags(Lco/bird/android/feature/rider/birdpay/confirmation/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/feature/rider/birdpay/confirmation/e$h;->g:Lco/bird/android/feature/rider/birdpay/confirmation/e;

    invoke-static {v0}, Lco/bird/android/feature/rider/birdpay/confirmation/e;->access$getNavigator$p(Lco/bird/android/feature/rider/birdpay/confirmation/e;)Le13;

    move-result-object v0

    invoke-interface {v0, p1}, Le13;->W3(Ljava/util/List;)V

    return-void
.end method
