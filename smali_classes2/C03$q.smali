.class public final LC03$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LC03;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/configs/Config;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/Config;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/wire/configs/Config;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LC03;


# direct methods
.method public constructor <init>(LC03;)V
    .locals 0

    iput-object p1, p0, LC03$q;->g:LC03;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/configs/Config;)V
    .locals 2

    iget-object v0, p0, LC03$q;->g:LC03;

    invoke-static {v0}, LC03;->access$getUi$p(LC03;)LN03;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getEnableSafetyMenu()Z

    move-result v1

    invoke-interface {v0, v1}, LN03;->Mh(Z)V

    iget-object v0, p0, LC03$q;->g:LC03;

    invoke-static {v0}, LC03;->access$getUi$p(LC03;)LN03;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getComplianceConfig()Lco/bird/android/model/wire/configs/ComplianceConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/ComplianceConfig;->getInsuranceArticle()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, LN03;->f2(Z)V

    iget-object v0, p0, LC03$q;->g:LC03;

    invoke-static {v0}, LC03;->access$getUi$p(LC03;)LN03;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getPromoConfig()Lco/bird/android/model/wire/configs/PromoConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/PromoConfig;->getEnablePromos()Z

    move-result v1

    invoke-interface {v0, v1}, LN03;->d5(Z)V

    iget-object v0, p0, LC03$q;->g:LC03;

    invoke-static {v0}, LC03;->access$getUi$p(LC03;)LN03;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RideConfig;->getCurrency()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LWE0;->a(Ljava/lang/String;)I

    move-result p1

    invoke-interface {v0, p1}, LN03;->K2(I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {p0, p1}, LC03$q;->a(Lco/bird/android/model/wire/configs/Config;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
