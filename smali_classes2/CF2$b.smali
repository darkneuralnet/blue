.class public final LCF2$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCF2;->C(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lqa1;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lqa1;",
        "kotlin.jvm.PlatformType",
        "result",
        "",
        "a",
        "(Lqa1;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:LCF2;


# direct methods
.method public constructor <init>(Ljava/lang/String;LCF2;)V
    .locals 0

    iput-object p1, p0, LCF2$b;->g:Ljava/lang/String;

    iput-object p2, p0, LCF2$b;->h:LCF2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lqa1;)V
    .locals 9

    iget-object v0, p0, LCF2$b;->g:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, LCF2$b;->h:LCF2;

    invoke-static {v0}, LCF2;->access$getAnalyticsManager$p(LCF2;)LEa;

    move-result-object v0

    new-instance v7, LDD1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, LDD1;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v7}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    iget-object v0, p0, LCF2$b;->h:LCF2;

    const-string v1, "result"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lqa1;->unbox-impl()Z

    move-result p1

    iget-object v1, p0, LCF2$b;->g:Ljava/lang/String;

    invoke-static {v0, p1, v1}, LCF2;->access$navigateBasedOnValidation(LCF2;ZLjava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v6, "Validation required from Google log in and user has no email."

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {v6, p1}, Lg46;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, LCF2$b;->h:LCF2;

    invoke-static {p1}, LCF2;->access$getAnalyticsManager$p(LCF2;)LEa;

    move-result-object p1

    new-instance v0, LCD1;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, LCD1;-><init>(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, LEa;->y(Lco/bird/android/model/analytics/AnalyticsEvent;)V

    iget-object p1, p0, LCF2$b;->h:LCF2;

    invoke-static {p1}, LCF2;->access$getUi$p(LCF2;)LKF2;

    move-result-object p1

    sget v0, Lnl4;->login_google_error:I

    invoke-interface {p1, v0}, LaM5;->error(I)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lqa1;

    invoke-virtual {p0, p1}, LCF2$b;->a(Lqa1;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
