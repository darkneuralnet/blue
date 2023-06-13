.class public final LtC3$d0;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LtC3;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireBird;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireBird;",
        "kotlin.jvm.PlatformType",
        "wireBird",
        "",
        "a",
        "(Lco/bird/android/model/wire/WireBird;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LtC3;


# direct methods
.method public constructor <init>(LtC3;)V
    .locals 0

    iput-object p1, p0, LtC3$d0;->g:LtC3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireBird;)V
    .locals 3

    iget-object v0, p0, LtC3$d0;->g:LtC3;

    invoke-virtual {v0}, LtC3;->G0()LEa;

    move-result-object v0

    const-string v1, "wireBird"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lco/bird/android/model/wire/WireBirdKt;->isAsleep(Lco/bird/android/model/wire/WireBird;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Ldg6;->g:Ldg6;

    goto :goto_0

    :cond_0
    sget-object v1, Ldg6;->f:Ldg6;

    :goto_0
    sget-object v2, Leg6;->c:Leg6;

    invoke-static {v1, v2, p1}, Lfg6;->b(Ldg6;Leg6;Lco/bird/android/model/wire/WireBird;)Lcg6;

    move-result-object p1

    invoke-interface {v0, p1}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p0, p1}, LtC3$d0;->a(Lco/bird/android/model/wire/WireBird;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
