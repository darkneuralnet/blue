.class public final LCF2$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCF2;->G()V
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
        "hasFocus",
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
.field public final synthetic g:LCF2;


# direct methods
.method public constructor <init>(LCF2;)V
    .locals 0

    iput-object p1, p0, LCF2$q;->g:LCF2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LCF2$q;->invoke(Ljava/lang/Boolean;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Boolean;)V
    .locals 12

    const-string v0, "hasFocus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    iget-object p1, p0, LCF2$q;->g:LCF2;

    invoke-static {p1}, LCF2;->access$getUi$p(LCF2;)LKF2;

    move-result-object p1

    invoke-interface {p1}, LKF2;->y7()Z

    move-result p1

    if-nez p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    iget-object v2, p0, LCF2$q;->g:LCF2;

    invoke-static {v2}, LCF2;->access$getReactiveConfig$p(LCF2;)LTq4;

    move-result-object v2

    invoke-virtual {v2}, LTq4;->f8()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/Config;->getZendeskConfig()Lco/bird/android/model/wire/configs/ZendeskConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/ZendeskConfig;->getSignInScreenHelpUrl()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    if-eqz p1, :cond_2

    iget-object v3, p0, LCF2$q;->g:LCF2;

    invoke-static {v3}, LCF2;->access$getAnalyticsManager$p(LCF2;)LEa;

    move-result-object v3

    new-instance v11, Lua1;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    iget-object v4, p0, LCF2$q;->g:LCF2;

    invoke-static {v4}, LCF2;->access$getPreference$p(LCF2;)Lgl;

    move-result-object v4

    invoke-virtual {v4}, Lgl;->X0()Z

    move-result v4

    xor-int/2addr v4, v1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    const/4 v9, 0x7

    const/4 v10, 0x0

    move-object v4, v11

    invoke-direct/range {v4 .. v10}, Lua1;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v11}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    iget-object v3, p0, LCF2$q;->g:LCF2;

    invoke-static {v3}, LCF2;->access$getUi$p(LCF2;)LKF2;

    move-result-object v3

    invoke-interface {v3}, LKF2;->l3()V

    :cond_2
    iget-object v3, p0, LCF2$q;->g:LCF2;

    invoke-static {v3}, LCF2;->access$getUi$p(LCF2;)LKF2;

    move-result-object v3

    if-nez p1, :cond_3

    if-eqz v2, :cond_3

    move v0, v1

    :cond_3
    invoke-interface {v3, v0}, LKF2;->df(Z)V

    return-void
.end method
