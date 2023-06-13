.class public final Lco/bird/android/app/manager/SmartlockManagerImpl$t;
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
        "Lio/reactivex/k<",
        "Ljava/lang/Throwable;",
        ">;",
        "Lna4<",
        "*>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u0012\u0012\u0002\u0008\u0003 \u0002*\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lio/reactivex/k;",
        "",
        "kotlin.jvm.PlatformType",
        "it",
        "Lna4;",
        "b",
        "(Lio/reactivex/k;)Lna4;"
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

    iput-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$t;->g:Lco/bird/android/app/manager/SmartlockManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lna4;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl$t;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lna4;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lna4;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lna4;

    return-object p0
.end method


# virtual methods
.method public final b(Lio/reactivex/k;)Lna4;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lna4<",
            "*>;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x5

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lio/reactivex/k;->v(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/k;

    move-result-object p1

    new-instance v0, Lco/bird/android/app/manager/SmartlockManagerImpl$t$a;

    iget-object v1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$t;->g:Lco/bird/android/app/manager/SmartlockManagerImpl;

    invoke-direct {v0, v1}, Lco/bird/android/app/manager/SmartlockManagerImpl$t$a;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;)V

    new-instance v1, LpJ5;

    invoke-direct {v1, v0}, LpJ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/k;->W(Lio/reactivex/functions/o;)Lio/reactivex/k;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/k;

    invoke-virtual {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl$t;->b(Lio/reactivex/k;)Lna4;

    move-result-object p1

    return-object p1
.end method
