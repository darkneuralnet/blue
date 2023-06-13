.class public final LRK1$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LRK1;->T(Lco/bird/android/model/wire/WireBird;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LMD$b;",
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
        "LMD$b;",
        "it",
        "Lio/reactivex/K;",
        "LTk5;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LMD$b;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/wire/WireBird;

.field public final synthetic h:Lco/bird/android/model/wire/WirePhysicalLock;

.field public final synthetic i:LRK1;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/WirePhysicalLock;LRK1;)V
    .locals 0

    iput-object p1, p0, LRK1$o;->g:Lco/bird/android/model/wire/WireBird;

    iput-object p2, p0, LRK1$o;->h:Lco/bird/android/model/wire/WirePhysicalLock;

    iput-object p3, p0, LRK1$o;->i:LRK1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LMD$b;)Lio/reactivex/K;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMD$b;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "LTk5;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LMD$b;->f:LMD$b;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_1

    iget-object p1, p0, LRK1$o;->g:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, LRK1$o;->h:Lco/bird/android/model/wire/WirePhysicalLock;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WirePhysicalLock;->getSmartlock()Lco/bird/android/model/wire/WireSmartlock;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireSmartlock;->getMacAddress()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Starting scan for bird "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " with smart lock "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, LRK1$o;->i:LRK1;

    invoke-static {p1}, LRK1;->access$getSmartlockManager$p(LRK1;)LoI5;

    move-result-object v0

    iget-object v1, p0, LRK1$o;->h:Lco/bird/android/model/wire/WirePhysicalLock;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LoI5$b;->startScanning$default(LoI5;Lco/bird/android/model/wire/WirePhysicalLock;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_1

    :cond_1
    const-string p1, "BLE state not ready, not scanning for physical locks"

    new-array v0, v1, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lio/reactivex/F;->M()Lio/reactivex/F;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LMD$b;

    invoke-virtual {p0, p1}, LRK1$o;->a(LMD$b;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
