.class public final LG71$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG71;->b(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lr71;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lr71;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "a",
        "(Lr71;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDriverLicenseScanV2Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriverLicenseScanV2Presenter.kt\nco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2PresenterImpl$onCreate$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,309:1\n1#2:310\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LG71;


# direct methods
.method public constructor <init>(LG71;)V
    .locals 0

    iput-object p1, p0, LG71$e;->g:LG71;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr71;)V
    .locals 10

    invoke-virtual {p1}, Lr71;->a()LNy;

    move-result-object v1

    iget-object p1, p0, LG71$e;->g:LG71;

    invoke-static {p1}, LG71;->access$getAnalyticsManager$p(LG71;)LEa;

    move-result-object p1

    new-instance v0, Lco/bird/android/model/analytics/IdBackScanned;

    invoke-direct {v0}, Lco/bird/android/model/analytics/IdBackScanned;-><init>()V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    iget-object p1, p0, LG71$e;->g:LG71;

    invoke-static {p1}, LG71;->access$getSoundManager$p(LG71;)LzN5;

    move-result-object p1

    invoke-virtual {p1}, LzN5;->b()V

    if-eqz v1, :cond_0

    iget-object p1, p0, LG71$e;->g:LG71;

    invoke-static {p1}, LG71;->access$getUi$p(LG71;)LM71;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x7e

    const/4 v9, 0x0

    invoke-static/range {v0 .. v9}, LH31$a;->showDialog$default(LH31;LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr71;

    invoke-virtual {p0, p1}, LG71$e;->a(Lr71;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
