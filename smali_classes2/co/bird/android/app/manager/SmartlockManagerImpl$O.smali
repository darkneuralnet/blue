.class public final Lco/bird/android/app/manager/SmartlockManagerImpl$O;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/manager/SmartlockManagerImpl;->g(LXl5;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/app/manager/SmartlockManagerImpl$O$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LTk5;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LTk5;",
        "scanResult",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "b",
        "(LTk5;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LXl5;

.field public final synthetic h:Lco/bird/android/app/manager/SmartlockManagerImpl;

.field public final synthetic i:Lco/bird/android/model/wire/WirePhysicalLock;


# direct methods
.method public constructor <init>(LXl5;Lco/bird/android/app/manager/SmartlockManagerImpl;Lco/bird/android/model/wire/WirePhysicalLock;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$O;->g:LXl5;

    iput-object p2, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$O;->h:Lco/bird/android/app/manager/SmartlockManagerImpl;

    iput-object p3, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$O;->i:Lco/bird/android/model/wire/WirePhysicalLock;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/app/manager/SmartlockManagerImpl;LXl5;LTk5;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lco/bird/android/app/manager/SmartlockManagerImpl$O;->c(Lco/bird/android/app/manager/SmartlockManagerImpl;LXl5;LTk5;)V

    return-void
.end method

.method public static final c(Lco/bird/android/app/manager/SmartlockManagerImpl;LXl5;LTk5;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$rideLock"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$scanResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lco/bird/android/app/manager/SmartlockManagerImpl;->access$notifyScanResultForLock(Lco/bird/android/app/manager/SmartlockManagerImpl;LXl5;LTk5;)V

    return-void
.end method


# virtual methods
.method public final b(LTk5;)Lio/reactivex/h;
    .locals 4

    const-string v0, "scanResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$O;->g:LXl5;

    invoke-virtual {v0}, LXl5;->c()LUR4;

    move-result-object v0

    sget-object v1, Lco/bird/android/app/manager/SmartlockManagerImpl$O$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 p1, 0x3

    if-ne v0, p1, :cond_0

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$O;->h:Lco/bird/android/app/manager/SmartlockManagerImpl;

    iget-object v2, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$O;->g:LXl5;

    new-instance v3, LzJ5;

    invoke-direct {v3, v1, v2, p1}, LzJ5;-><init>(Lco/bird/android/app/manager/SmartlockManagerImpl;LXl5;LTk5;)V

    invoke-virtual {v0, v3}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "continuing unlocking of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$O;->h:Lco/bird/android/app/manager/SmartlockManagerImpl;

    iget-object v1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$O;->i:Lco/bird/android/model/wire/WirePhysicalLock;

    invoke-virtual {v0, p1, v1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->m(LTk5;Lco/bird/android/model/wire/WirePhysicalLock;)Lio/reactivex/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LTk5;

    invoke-virtual {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl$O;->b(LTk5;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
