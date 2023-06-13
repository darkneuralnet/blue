.class public final LBg6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0008\u0001\u0012\u00020\u00010\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u000c\u0010\u0006\u001a\u00020\u0001*\u00020\u0005H\u0007\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "Lco/bird/android/model/AgreementRole;",
        "",
        "b",
        "([Lco/bird/android/model/AgreementRole;)Ljava/lang/String;",
        "Lco/bird/android/model/User;",
        "a",
        "agreements_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/User;)Lco/bird/android/model/AgreementRole;
    .locals 1
    .annotation runtime Lkotlin/Deprecated;
        message = "This function only returns a single role in an improper cascading fashion (users can be more than one of these things)."
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/User;->getCanCharge()Ljava/lang/Boolean;

    move-result-object p0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lco/bird/android/model/AgreementRole;->CHARGER:Lco/bird/android/model/AgreementRole;

    goto :goto_0

    :cond_0
    sget-object p0, Lco/bird/android/model/AgreementRole;->RIDER:Lco/bird/android/model/AgreementRole;

    :goto_0
    return-object p0
.end method

.method public static final b([Lco/bird/android/model/AgreementRole;)Ljava/lang/String;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, ","

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x3e

    const/4 v9, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lkotlin/collections/ArraysKt;->joinToString$default([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
