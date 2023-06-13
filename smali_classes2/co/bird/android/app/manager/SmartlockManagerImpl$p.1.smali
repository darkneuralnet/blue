.class public final Lco/bird/android/app/manager/SmartlockManagerImpl$p;
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
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/NokelockResponse;",
        "kotlin.jvm.PlatformType",
        "nokelockResponse",
        "",
        "a",
        "(Lco/bird/api/response/NokelockResponse;)V"
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


# direct methods
.method public constructor <init>(Lco/bird/android/app/manager/SmartlockManagerImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$p;->g:Lco/bird/android/app/manager/SmartlockManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/NokelockResponse;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "nokelock response received: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v0, "nokelockResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lco/bird/api/response/NokelockResponseKt;->isUnlockedOrLocking(Lco/bird/api/response/NokelockResponse;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "response was unlocked or locking type"

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$p;->g:Lco/bird/android/app/manager/SmartlockManagerImpl;

    invoke-static {v0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->access$getUnlockOrLockingRelay$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lma4;

    move-result-object v0

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v2}, Lma4;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string v0, "response type unknown"

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    invoke-static {p1}, Lco/bird/api/response/NokelockResponseKt;->isUnlocked(Lco/bird/api/response/NokelockResponse;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "response was unlocked type"

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$p;->g:Lco/bird/android/app/manager/SmartlockManagerImpl;

    invoke-static {v0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->access$onLockUnlocked(Lco/bird/android/app/manager/SmartlockManagerImpl;)V

    :cond_1
    invoke-static {p1}, Lco/bird/api/response/NokelockResponseKt;->isLocked(Lco/bird/api/response/NokelockResponse;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "response was locked type"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$p;->g:Lco/bird/android/app/manager/SmartlockManagerImpl;

    invoke-static {p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->access$onLockLocked(Lco/bird/android/app/manager/SmartlockManagerImpl;)V

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/NokelockResponse;

    invoke-virtual {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl$p;->a(Lco/bird/api/response/NokelockResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
