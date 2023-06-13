.class public final Lco/bird/android/app/manager/SmartlockManagerImpl$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/manager/SmartlockManagerImpl;->m(LTk5;Lco/bird/android/model/wire/WirePhysicalLock;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/NokelockResponse;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lco/bird/api/response/NokelockResponse;",
        "response",
        "",
        "a",
        "(Lco/bird/api/response/NokelockResponse;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/WirePhysicalLock;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WirePhysicalLock;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$q;->g:Lco/bird/android/model/wire/WirePhysicalLock;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/NokelockResponse;)Ljava/lang/Boolean;
    .locals 4

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$q;->g:Lco/bird/android/model/wire/WirePhysicalLock;

    invoke-static {v0}, LAJ5;->a(Lco/bird/android/model/wire/WirePhysicalLock;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lco/bird/api/response/NokelockResponse;->getType()Lco/bird/android/model/constant/NokelockResponseType;

    move-result-object v0

    sget-object v3, Lco/bird/android/model/constant/NokelockResponseType;->STATE_RESPONSE:Lco/bird/android/model/constant/NokelockResponseType;

    if-ne v0, v3, :cond_1

    invoke-virtual {p1}, Lco/bird/api/response/NokelockResponse;->getData()Lco/bird/android/model/wire/WireNokelockResponseData;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type co.bird.android.model.wire.WireNokelockStateData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lco/bird/android/model/wire/WireNokelockStateData;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireNokelockStateData;->isLocked()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/api/response/NokelockResponse;->getType()Lco/bird/android/model/constant/NokelockResponseType;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/constant/NokelockResponseType;->LOCKING_RESPONSE:Lco/bird/android/model/constant/NokelockResponseType;

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "received a update that should trigger disconnection? "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/NokelockResponse;

    invoke-virtual {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl$q;->a(Lco/bird/api/response/NokelockResponse;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
