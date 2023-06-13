.class public final Lco/bird/api/response/NokelockResponseKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0006"
    }
    d2 = {
        "isLegacyLocking",
        "",
        "Lco/bird/api/response/NokelockResponse;",
        "isLocked",
        "isUnlocked",
        "isUnlockedOrLocking",
        "co.bird.android.api"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final isLegacyLocking(Lco/bird/api/response/NokelockResponse;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/api/response/NokelockResponse;->getType()Lco/bird/android/model/constant/NokelockResponseType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/NokelockResponseType;->LOCKING_RESPONSE:Lco/bird/android/model/constant/NokelockResponseType;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lco/bird/api/response/NokelockResponse;->getData()Lco/bird/android/model/wire/WireNokelockResponseData;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type co.bird.android.model.wire.WireNokelockLockingData"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lco/bird/android/model/wire/WireNokelockLockingData;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNokelockLockingData;->getSuccess()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isLocked(Lco/bird/api/response/NokelockResponse;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/api/response/NokelockResponse;->getType()Lco/bird/android/model/constant/NokelockResponseType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/NokelockResponseType;->STATE_RESPONSE:Lco/bird/android/model/constant/NokelockResponseType;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lco/bird/api/response/NokelockResponse;->getData()Lco/bird/android/model/wire/WireNokelockResponseData;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type co.bird.android.model.wire.WireNokelockStateData"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lco/bird/android/model/wire/WireNokelockStateData;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNokelockStateData;->isLocked()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isUnlocked(Lco/bird/api/response/NokelockResponse;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/api/response/NokelockResponse;->getType()Lco/bird/android/model/constant/NokelockResponseType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/NokelockResponseType;->UNLOCK_RESPONSE:Lco/bird/android/model/constant/NokelockResponseType;

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lco/bird/api/response/NokelockResponse;->getData()Lco/bird/android/model/wire/WireNokelockResponseData;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type co.bird.android.model.wire.WireNokelockUnlockData"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lco/bird/android/model/wire/WireNokelockUnlockData;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireNokelockUnlockData;->getSuccess()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final isUnlockedOrLocking(Lco/bird/api/response/NokelockResponse;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lco/bird/api/response/NokelockResponseKt;->isUnlocked(Lco/bird/api/response/NokelockResponse;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lco/bird/api/response/NokelockResponseKt;->isLocked(Lco/bird/api/response/NokelockResponse;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lco/bird/api/response/NokelockResponseKt;->isLegacyLocking(Lco/bird/api/response/NokelockResponse;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method
