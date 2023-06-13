.class public final Lco/bird/android/app/manager/SmartlockManagerImpl$r;
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
        "Lio/reactivex/K<",
        "+",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/api/response/NokelockResponse;",
        "response",
        "Lio/reactivex/K;",
        "",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/NokelockResponse;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/app/manager/SmartlockManagerImpl;

.field public final synthetic h:Lco/bird/android/model/wire/WireSmartlock;


# direct methods
.method public constructor <init>(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$r;->g:Lco/bird/android/app/manager/SmartlockManagerImpl;

    iput-object p2, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$r;->h:Lco/bird/android/model/wire/WireSmartlock;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/NokelockResponse;)Lio/reactivex/K;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/response/NokelockResponse;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/api/response/NokelockResponse;->getType()Lco/bird/android/model/constant/NokelockResponseType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/NokelockResponseType;->TOKEN_RESPONSE:Lco/bird/android/model/constant/NokelockResponseType;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const-string v0, "token response received, sending unlock request"

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lco/bird/api/response/NokelockResponse;->getData()Lco/bird/android/model/wire/WireNokelockResponseData;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type co.bird.android.model.wire.WireNokelockTokenResponseData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lco/bird/android/model/wire/WireNokelockTokenResponseData;

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$r;->g:Lco/bird/android/app/manager/SmartlockManagerImpl;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireNokelockTokenResponseData;->getStateRequest()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->access$setStateRequestToken$p(Lco/bird/android/app/manager/SmartlockManagerImpl;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$r;->g:Lco/bird/android/app/manager/SmartlockManagerImpl;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireNokelockTokenResponseData;->getLockingRequest()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->access$setLockingRequestToken$p(Lco/bird/android/app/manager/SmartlockManagerImpl;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$r;->g:Lco/bird/android/app/manager/SmartlockManagerImpl;

    iget-object v1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$r;->h:Lco/bird/android/model/wire/WireSmartlock;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireNokelockTokenResponseData;->getUnlockRequest()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->access$sendPayload(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p1}, Lco/bird/api/response/NokelockResponse;->getType()Lco/bird/android/model/constant/NokelockResponseType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/NokelockResponseType;->INSERTED_NOTIFICATION:Lco/bird/android/model/constant/NokelockResponseType;

    const/4 v3, 0x0

    if-ne v0, v1, :cond_3

    iget-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$r;->g:Lco/bird/android/app/manager/SmartlockManagerImpl;

    invoke-static {p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->access$getStateRequestToken$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "stateRequestToken"

    if-nez p1, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v3

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "inserted notification response received, sending state request token "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p1, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$r;->g:Lco/bird/android/app/manager/SmartlockManagerImpl;

    iget-object v1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$r;->h:Lco/bird/android/model/wire/WireSmartlock;

    invoke-static {p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->access$getStateRequestToken$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v3, v2

    :goto_0
    invoke-static {p1, v1, v3}, Lco/bird/android/app/manager/SmartlockManagerImpl;->access$sendPayload(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    const-wide/16 v0, 0x3

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lio/reactivex/F;->n(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lco/bird/api/response/NokelockResponse;->getType()Lco/bird/android/model/constant/NokelockResponseType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/NokelockResponseType;->STATE_RESPONSE:Lco/bird/android/model/constant/NokelockResponseType;

    if-ne v0, v1, :cond_6

    invoke-static {p1}, Lco/bird/api/response/NokelockResponseKt;->isLocked(Lco/bird/api/response/NokelockResponse;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$r;->g:Lco/bird/android/app/manager/SmartlockManagerImpl;

    invoke-static {p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->access$getLockingRequestToken$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "lockingRequestToken"

    if-nez p1, :cond_4

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v3

    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "state response received and unlocked, sending request to lock "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {p1, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$r;->g:Lco/bird/android/app/manager/SmartlockManagerImpl;

    iget-object v1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$r;->h:Lco/bird/android/model/wire/WireSmartlock;

    invoke-static {p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->access$getLockingRequestToken$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_5

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    move-object v3, v2

    :goto_1
    invoke-static {p1, v1, v3}, Lco/bird/android/app/manager/SmartlockManagerImpl;->access$sendPayload(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_2

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unknown response received, ignoring ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/NokelockResponse;

    invoke-virtual {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl$r;->a(Lco/bird/api/response/NokelockResponse;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
