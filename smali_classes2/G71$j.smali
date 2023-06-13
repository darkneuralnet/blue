.class public final LG71$j;
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
.field public final synthetic g:LG71;


# direct methods
.method public constructor <init>(LG71;)V
    .locals 0

    iput-object p1, p0, LG71$j;->g:LG71;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LG71$j;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 9

    iget-object p1, p0, LG71$j;->g:LG71;

    invoke-static {p1}, LG71;->access$getAnalyticsManager$p(LG71;)LEa;

    move-result-object p1

    new-instance v8, LUP1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget-object v0, p0, LG71$j;->g:LG71;

    invoke-static {v0}, LG71;->access$getReactiveConfig$p(LG71;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getIdentificationConfig()Lco/bird/android/model/wire/configs/IdentificationConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/IdentificationConfig;->getIdentificationHelpArticle()Ljava/lang/String;

    move-result-object v4

    const-string v5, "barcode"

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, LUP1;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v8}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    iget-object p1, p0, LG71$j;->g:LG71;

    invoke-static {p1}, LG71;->access$getNavigator$p(LG71;)Le13;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/constant/MapMode;->RIDER:Lco/bird/android/model/constant/MapMode;

    iget-object v1, p0, LG71$j;->g:LG71;

    invoke-static {v1}, LG71;->access$getReactiveConfig$p(LG71;)LTq4;

    move-result-object v1

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getIdentificationConfig()Lco/bird/android/model/wire/configs/IdentificationConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/IdentificationConfig;->getIdentificationHelpArticle()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {p1, v0, v1, v2}, Le13;->E(Lco/bird/android/model/constant/MapMode;Ljava/lang/String;Z)V

    return-void
.end method
