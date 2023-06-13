.class public final Lco/bird/android/app/manager/SmartlockManagerImpl$t$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/manager/SmartlockManagerImpl$t;->b(Lio/reactivex/k;)Lna4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lna4<",
        "+",
        "Lde5$a;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "it",
        "Lna4;",
        "Lde5$a;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Ljava/lang/Throwable;)Lna4;"
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

    iput-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$t$a;->g:Lco/bird/android/app/manager/SmartlockManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl$t$a;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl$t$a;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Throwable;)Lna4;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            ")",
            "Lna4<",
            "+",
            "Lde5$a;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$t$a;->g:Lco/bird/android/app/manager/SmartlockManagerImpl;

    invoke-static {p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->access$getBleClient$p(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lde5;

    move-result-object p1

    invoke-virtual {p1}, Lde5;->c()Lde5$a;

    move-result-object p1

    sget-object v0, Lde5$a;->f:Lde5$a;

    if-ne p1, v0, :cond_0

    invoke-static {v0}, Lio/reactivex/k;->o0(Ljava/lang/Object;)Lio/reactivex/k;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lco/bird/android/app/manager/SmartlockManagerImpl$t$a;->g:Lco/bird/android/app/manager/SmartlockManagerImpl;

    invoke-static {p1}, Lco/bird/android/app/manager/SmartlockManagerImpl;->access$getBleState(Lco/bird/android/app/manager/SmartlockManagerImpl;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lco/bird/android/app/manager/SmartlockManagerImpl$t$a$a;->g:Lco/bird/android/app/manager/SmartlockManagerImpl$t$a$a;

    new-instance v1, LqJ5;

    invoke-direct {v1, v0}, LqJ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->doOnNext(Lio/reactivex/functions/g;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lco/bird/android/app/manager/SmartlockManagerImpl$t$a$b;->g:Lco/bird/android/app/manager/SmartlockManagerImpl$t$a$b;

    new-instance v1, LrJ5;

    invoke-direct {v1, v0}, LrJ5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/q;)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, Lio/reactivex/b;->f:Lio/reactivex/b;

    invoke-virtual {p1, v0}, Lio/reactivex/Observable;->toFlowable(Lio/reactivex/b;)Lio/reactivex/k;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lco/bird/android/app/manager/SmartlockManagerImpl$t$a;->c(Ljava/lang/Throwable;)Lna4;

    move-result-object p1

    return-object p1
.end method
