.class public final Lco/bird/android/app/manager/SmartlockManagerImpl$L;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/manager/SmartlockManagerImpl;->c(Lco/bird/android/model/wire/WirePhysicalLock;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lde5$a;",
        "Lio/reactivex/K<",
        "+",
        "LTk5;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lde5$a;",
        "state",
        "Lio/reactivex/K;",
        "LTk5;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lde5$a;)Lio/reactivex/K;"
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

.field public final synthetic h:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:Lco/bird/android/app/manager/SmartlockManagerImpl;

.field public final synthetic j:Lco/bird/android/model/wire/WireSmartlock;

.field public final synthetic k:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lco/bird/android/model/wire/WirePhysicalLock;",
            "Lde5$a;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WirePhysicalLock;Lkotlin/jvm/functions/Function0;Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WirePhysicalLock;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lco/bird/android/app/manager/SmartlockManagerImpl;",
            "Lco/bird/android/model/wire/WireSmartlock;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lco/bird/android/model/wire/WirePhysicalLock;",
            "-",
            "Lde5$a;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$L;->g:Lco/bird/android/model/wire/WirePhysicalLock;

    iput-object p2, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$L;->h:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$L;->i:Lco/bird/android/app/manager/SmartlockManagerImpl;

    iput-object p4, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$L;->j:Lco/bird/android/model/wire/WireSmartlock;

    iput-object p5, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$L;->k:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lde5$a;)Lio/reactivex/K;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde5$a;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "LTk5;",
            ">;"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$L;->g:Lco/bird/android/model/wire/WirePhysicalLock;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WirePhysicalLock;->getId()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lde5$a;->f:Lde5$a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "reported blestate while attempting to listen for lock requests lock id "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " was "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ". Must be "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " to proceed."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v0, v3}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    if-ne p1, v1, :cond_0

    const-string p1, "ble state is set to ready, we\'re scanning now"

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$L;->h:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    iget-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$L;->i:Lco/bird/android/app/manager/SmartlockManagerImpl;

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$L;->j:Lco/bird/android/model/wire/WireSmartlock;

    invoke-static {p1, v0}, Lco/bird/android/app/manager/SmartlockManagerImpl;->access$scan(Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WireSmartlock;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string v0, "ble state is not ready, applying side effects and waiting"

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$L;->k:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$L;->g:Lco/bird/android/model/wire/WirePhysicalLock;

    invoke-interface {v0, v1, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lio/reactivex/F;->M()Lio/reactivex/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lde5$a;

    invoke-virtual {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl$L;->a(Lde5$a;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
