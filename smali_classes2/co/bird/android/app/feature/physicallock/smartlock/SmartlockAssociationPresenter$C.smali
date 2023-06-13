.class public final Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$C;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->M0(Ljava/lang/String;)V
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
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "([B)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$C;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    iput-object p2, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$C;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a([B)V
    .locals 4

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$C;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$isSessionTokenResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;[B)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$C;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    new-instance v1, Lkotlin/ranges/IntRange;

    const/4 v2, 0x3

    const/4 v3, 0x6

    invoke-direct {v1, v2, v3}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-static {p1, v1}, Lkotlin/collections/ArraysKt;->sliceArray([BLkotlin/ranges/IntRange;)[B

    move-result-object p1

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$setSessionToken$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;[B)V

    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$C;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$isAesKeyChangeResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;[B)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$C;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    invoke-static {p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$getUi$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;)LFF5;

    move-result-object p1

    invoke-interface {p1, v1}, LFF5;->P0(Z)V

    iget-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$C;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    invoke-static {p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$getUi$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;)LFF5;

    move-result-object p1

    invoke-interface {p1, v2}, LFF5;->O(Z)V

    iget-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$C;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    invoke-static {p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$getUi$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;)LFF5;

    move-result-object p1

    invoke-interface {p1, v2}, LFF5;->O0(Z)V

    iget-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$C;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    invoke-static {p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$getPreference$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;)Lgl;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$C;->h:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$C;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    invoke-static {v1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$getRevertToFactorySettings$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;)Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Lgl;->V1(Ljava/lang/String;Z)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$C;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$isUnlockResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;[B)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$C;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    invoke-static {v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$getUi$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;)LFF5;

    move-result-object v0

    invoke-interface {v0, v1}, LFF5;->O0(Z)V

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$C;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    invoke-static {v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$getUi$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;)LFF5;

    move-result-object v0

    invoke-interface {v0, v2}, LFF5;->H1(Z)V

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$C;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    invoke-static {v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$getUi$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;)LFF5;

    move-result-object v0

    invoke-interface {v0, v2}, LFF5;->Eh(Z)V

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$C;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    invoke-static {v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$getResetKey$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$C;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    invoke-static {v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$currentAesKey(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;)[B

    move-result-object v1

    invoke-static {v0, p1, v1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$encrypt(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;[B[B)[B

    move-result-object p1

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$decode(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;[B)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$setEncryptedUnlockPayload$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$C;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$isLockStateResponse(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;[B)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$C;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$isLocked(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;[B)Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "got successful lock state response, now promoting provisional..."

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$C;->a([B)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
