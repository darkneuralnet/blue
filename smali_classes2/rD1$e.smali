.class public final LrD1$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LrD1;->c(ILandroid/content/Intent;ZLco/bird/android/model/PaymentAddSource;)Lio/reactivex/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/model/Token;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lcom/stripe/android/model/Token;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lcom/stripe/android/model/Token;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LrD1;


# direct methods
.method public constructor <init>(LrD1;)V
    .locals 0

    iput-object p1, p0, LrD1$e;->g:LrD1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/stripe/android/model/Token;)V
    .locals 1

    iget-object p1, p0, LrD1$e;->g:LrD1;

    invoke-static {p1}, LrD1;->access$getGooglePayAttachedSubject$p(LrD1;)Lio/reactivex/subjects/a;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lio/reactivex/subjects/a;->onNext(Ljava/lang/Object;)V

    iget-object p1, p0, LrD1$e;->g:LrD1;

    invoke-static {p1}, LrD1;->access$getAnalyticsManager$p(LrD1;)LEa;

    move-result-object p1

    new-instance v0, Lco/bird/android/model/analytics/GooglePayAuthSheetSuccess;

    invoke-direct {v0}, Lco/bird/android/model/analytics/GooglePayAuthSheetSuccess;-><init>()V

    invoke-interface {p1, v0}, LEa;->N(Lco/bird/android/model/analytics/LegacyAnalyticsEvent;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/model/Token;

    invoke-virtual {p0, p1}, LrD1$e;->a(Lcom/stripe/android/model/Token;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
