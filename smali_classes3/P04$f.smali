.class public final LP04$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP04;->C(LQ04;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LG10;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LG10;",
        "kotlin.jvm.PlatformType",
        "braintreeFragment",
        "",
        "a",
        "(LG10;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LP04;


# direct methods
.method public constructor <init>(LP04;)V
    .locals 0

    iput-object p1, p0, LP04$f;->g:LP04;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LG10;)V
    .locals 9

    new-instance v0, Lcom/braintreepayments/api/models/PayPalRequest;

    invoke-direct {v0}, Lcom/braintreepayments/api/models/PayPalRequest;-><init>()V

    iget-object v1, p0, LP04$f;->g:LP04;

    invoke-static {v1}, LP04;->access$getAnalyticsManager$p(LP04;)LEa;

    move-result-object v1

    new-instance v8, LWP3;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x7

    const/4 v7, 0x0

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, LWP3;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v8}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    invoke-static {p1, v0}, LfL3;->t(LG10;Lcom/braintreepayments/api/models/PayPalRequest;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LG10;

    invoke-virtual {p0, p1}, LP04$f;->a(LG10;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
