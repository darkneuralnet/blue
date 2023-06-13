.class public final LgS$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LgS;->c0(Ljava/lang/String;Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanIntention;)Lio/reactivex/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/BirdScan;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/persistence/Bird;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u001e\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u0003 \u0004*\u000e\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/BirdScan;",
        "result",
        "Lio/reactivex/u;",
        "Lco/bird/android/model/persistence/Bird;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/BirdScan;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBirdRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdRepositoryImpl.kt\nco/bird/android/repository/BirdRepositoryImpl$scanOperatorBird$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,296:1\n1#2:297\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LgS;

.field public final synthetic h:Lco/bird/android/model/constant/ScanMode;


# direct methods
.method public constructor <init>(LgS;Lco/bird/android/model/constant/ScanMode;)V
    .locals 0

    iput-object p1, p0, LgS$j;->g:LgS;

    iput-object p2, p0, LgS$j;->h:Lco/bird/android/model/constant/ScanMode;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/model/BirdScan;LgS;Lco/bird/android/model/constant/ScanMode;)Lco/bird/android/model/persistence/Bird;
    .locals 0

    invoke-static {p0, p1, p2}, LgS$j;->c(Lco/bird/android/model/BirdScan;LgS;Lco/bird/android/model/constant/ScanMode;)Lco/bird/android/model/persistence/Bird;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lco/bird/android/model/BirdScan;LgS;Lco/bird/android/model/constant/ScanMode;)Lco/bird/android/model/persistence/Bird;
    .locals 2

    const-string v0, "$result"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$mode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/BirdScan;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LZK;->a(Lco/bird/android/model/wire/WireBird;)Lco/bird/android/model/persistence/Bird;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, LgS;->access$getBirdDao$p(LgS;)LbL;

    move-result-object p0

    const/4 p1, 0x1

    new-array p1, p1, [Lco/bird/android/model/persistence/Bird;

    const/4 p2, 0x0

    aput-object v0, p1, p2

    invoke-virtual {p0, p1}, LbL;->l([Lco/bird/android/model/persistence/Bird;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/BirdScan;->getMessage()Lco/bird/android/model/ScanMessage;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Ldk5;

    invoke-virtual {p1}, Lco/bird/android/model/ScanMessage;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/model/ScanMessage;->getBody()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/model/BirdScan;->getStatus()Lco/bird/android/model/constant/ScanStatus;

    move-result-object p0

    invoke-direct {v0, v1, p1, p0, p2}, Ldk5;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ScanStatus;Lco/bird/android/model/constant/ScanMode;)V

    throw v0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/BirdScan;)Lio/reactivex/u;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/BirdScan;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/persistence/Bird;",
            ">;"
        }
    .end annotation

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LgS$j;->g:LgS;

    iget-object v1, p0, LgS$j;->h:Lco/bird/android/model/constant/ScanMode;

    new-instance v2, LmS;

    invoke-direct {v2, p1, v0, v1}, LmS;-><init>(Lco/bird/android/model/BirdScan;LgS;Lco/bird/android/model/constant/ScanMode;)V

    invoke-static {v2}, Lio/reactivex/p;->D(Ljava/util/concurrent/Callable;)Lio/reactivex/p;

    move-result-object p1

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/p;->T(Lio/reactivex/E;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/BirdScan;

    invoke-virtual {p0, p1}, LgS$j;->b(Lco/bird/android/model/BirdScan;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method
