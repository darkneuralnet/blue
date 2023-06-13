.class public final LTJ4$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTJ4;->V(Lco/bird/android/model/User;Lco/bird/android/model/wire/configs/RideConfig;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "result",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Boolean;)V"
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
.field public final synthetic g:Lco/bird/android/model/wire/configs/RideConfig;

.field public final synthetic h:LTJ4;

.field public final synthetic i:Lco/bird/android/model/User;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/configs/RideConfig;LTJ4;Lco/bird/android/model/User;)V
    .locals 0

    iput-object p1, p0, LTJ4$k;->g:Lco/bird/android/model/wire/configs/RideConfig;

    iput-object p2, p0, LTJ4$k;->h:LTJ4;

    iput-object p3, p0, LTJ4$k;->i:Lco/bird/android/model/User;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LTJ4$k;->invoke(Ljava/lang/Boolean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Boolean;)V
    .locals 10

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LTJ4$k;->g:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {p1}, Lco/bird/android/model/wire/configs/RideConfig;->getCurrency()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LmS5;->o(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p1

    iget-object v0, p0, LTJ4$k;->h:LTJ4;

    invoke-static {v0}, LTJ4;->access$getGooglePayManager$p(LTJ4;)LiD1;

    move-result-object v0

    iget-object v1, p0, LTJ4$k;->i:Lco/bird/android/model/User;

    iget-object v2, p0, LTJ4$k;->h:LTJ4;

    invoke-static {v2}, LTJ4;->access$getActivity$p(LTJ4;)Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v2

    sget-object v3, LI35;->e:LI35;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    const/4 v5, 0x0

    const/16 v6, 0x10

    const/4 v7, 0x0

    move-object v4, p1

    invoke-static/range {v0 .. v7}, LiD1$a;->performGooglePaymentRequest$default(LiD1;Lco/bird/android/model/User;Landroid/app/Activity;ILjava/util/Currency;Ljava/lang/Long;ILjava/lang/Object;)V

    iget-object v0, p0, LTJ4$k;->h:LTJ4;

    invoke-static {v0}, LTJ4;->access$getAnalyticsManager$p(LTJ4;)LEa;

    move-result-object v0

    new-instance v1, Lco/bird/android/model/analytics/GooglePayAuthSheetPresented;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v1, p1, v3, v2, v3}, Lco/bird/android/model/analytics/GooglePayAuthSheetPresented;-><init>(Ljava/util/Currency;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LTJ4$k;->h:LTJ4;

    invoke-static {p1}, LTJ4;->access$getUi$p(LTJ4;)LAB1;

    move-result-object v0

    sget-object v1, LvN3;->d:LvN3;

    const/4 v2, 0x1

    const/4 v3, 0x0

    new-instance v4, LTJ4$k$a;

    iget-object p1, p0, LTJ4$k;->h:LTJ4;

    invoke-direct {v4, p1}, LTJ4$k$a;-><init>(LTJ4;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x74

    const/4 v9, 0x0

    invoke-static/range {v0 .. v9}, LH31$a;->showDialog$default(LH31;LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method
