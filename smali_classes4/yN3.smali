.class public final LyN3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "Lco/bird/android/model/BirdPayment;",
        "LpN3;",
        "a",
        "model-analytics_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/BirdPayment;)LpN3;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/BirdPayment;->isGooglePay()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, LpN3;->b:LpN3;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/BirdPayment;->isPaypal()Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, LpN3;->c:LpN3;

    goto :goto_0

    :cond_1
    sget-object p0, LpN3;->d:LpN3;

    :goto_0
    return-object p0
.end method
