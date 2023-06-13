.class public final Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->y0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "[B",
        "Lio/reactivex/u<",
        "+[B>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/u;",
        "kotlin.jvm.PlatformType",
        "b",
        "([B)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method


# virtual methods
.method public final b([B)Lio/reactivex/u;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Lio/reactivex/u<",
            "+[B>;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(this)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "got a response "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$isSessionTokenResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "got a session token"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$getUsedProvisionalAesKeyForTokenRequest$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "provisional aes key was used successfully, we must have already rekeyed, skipping to unlock/promotion step"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$sendUnlockingRequest(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->j0()Lio/reactivex/p;

    move-result-object p1

    goto/16 :goto_0

    :cond_0
    iget-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$getUi$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lco/bird/android/app/feature/physicallock/smartlock/b;

    move-result-object v0

    sget-object v1, LUx0;->d:LUx0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LH31$a;->dialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l$a;

    iget-object v1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-direct {v0, v1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l$a;-><init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V

    new-instance v1, LIH5;

    invoke-direct {v1, v0}, LIH5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->C(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$isPasswordChangeResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "got a password change response"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$setUseProvisionalPassword$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;Z)V

    iget-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$targetAesKey(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)[B

    move-result-object v0

    invoke-static {p1, v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$changeAesKey(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->j0()Lio/reactivex/p;

    move-result-object p1

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$isAesKeyChangeResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p1, "got an aes key change response"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$sendUnlockingRequest(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->j0()Lio/reactivex/p;

    move-result-object p1

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$isUnlockResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    const-string v2, "operator_tool"

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$successful(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z

    move-result v3

    invoke-static {v0, v2, v3}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$trackOpenLockEvent(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;Ljava/lang/String;Z)V

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$successful(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "got an unlock response - successful: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$isLockResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$successful(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "got an lock response - successful: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto/16 :goto_0

    :cond_5
    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$isCableInsertedResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$successful(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "got a cable inserted response - successful: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$isLockStateResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$isLocked(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    const-string v2, "operator_tool_lock_state_response"

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$successful(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z

    move-result p1

    invoke-static {v0, v2, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$trackOpenLockEvent(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;Ljava/lang/String;Z)V

    const-string p1, "got a lock state response but not locked"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$isLockStateResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$isLocked(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;[B)Z

    move-result p1

    if-eqz p1, :cond_8

    const-string p1, "got a lock state response and is locked"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_8
    const-string p1, "received some other kind of response"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$l;->b([B)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
