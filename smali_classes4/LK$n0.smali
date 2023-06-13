.class public final LLK$n0;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLK;->j(I)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/y<",
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/Vehicle;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lio/reactivex/y;",
        "",
        "Lco/bird/android/model/Vehicle;",
        "emitter",
        "",
        "b",
        "(Lio/reactivex/y;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LLK;

.field public final synthetic h:I


# direct methods
.method public constructor <init>(LLK;I)V
    .locals 0

    iput-object p1, p0, LLK$n0;->g:LLK;

    iput p2, p0, LLK$n0;->h:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LLK;LLK$n0$b;)V
    .locals 0

    invoke-static {p0, p1}, LLK$n0;->c(LLK;LLK$n0$b;)V

    return-void
.end method

.method public static final c(LLK;LLK$n0$b;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$scanCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LLK;->H2(Ljj5;)V

    return-void
.end method


# virtual methods
.method public final b(Lio/reactivex/y;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "Ljava/util/List<",
            "Lco/bird/android/model/Vehicle;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LLK$n0;->g:LLK;

    const-string v1, "scanBatch latest"

    invoke-virtual {v0, v1}, LLK;->J2(Ljava/lang/String;)V

    iget-object v0, p0, LLK$n0;->g:LLK;

    invoke-virtual {v0}, LLK;->R1()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LLK$n0;->g:LLK;

    const-string v1, "scanBatch: bluetooth off"

    invoke-virtual {v0, v1}, LLK;->J2(Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/exception/BluetoothException;

    sget-object v1, Lco/bird/android/model/exception/BluetoothException$Reason;->DISABLED:Lco/bird/android/model/exception/BluetoothException$Reason;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2, v3}, Lco/bird/android/model/exception/BluetoothException;-><init>(Ljava/lang/Throwable;Lco/bird/android/model/exception/BluetoothException$Reason;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lio/reactivex/j;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LLK$n0;->g:LLK;

    invoke-static {v0}, LLK;->access$getScanning$p(LLK;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LLK$n0;->g:LLK;

    const-string v1, "scanBatch: scanning, ignore"

    invoke-virtual {v0, v1}, LLK;->J2(Ljava/lang/String;)V

    invoke-interface {p1}, Lio/reactivex/j;->onComplete()V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    new-instance v7, LLK$n0$b;

    iget-object v1, p0, LLK$n0;->g:LLK;

    invoke-direct {v7, p1, v1, v0}, LLK$n0$b;-><init>(Lio/reactivex/y;LLK;Ljava/util/Set;)V

    iget-object v0, p0, LLK$n0;->g:LLK;

    new-instance v1, LSK;

    invoke-direct {v1, v0, v7}, LSK;-><init>(LLK;LLK$n0$b;)V

    invoke-interface {p1, v1}, Lio/reactivex/y;->a(Lio/reactivex/functions/f;)V

    iget-object v1, p0, LLK$n0;->g:LLK;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v2, v7

    invoke-static/range {v1 .. v6}, LLK;->startScanBle$bluetooth_release$default(LLK;Ljj5;Ljava/util/List;IILjava/lang/Object;)V

    iget-object v0, p0, LLK$n0;->g:LLK;

    invoke-static {v0}, LLK;->access$getScheduler$p(LLK;)LaY;

    move-result-object v0

    new-instance v1, LLK$n0$a;

    iget-object v2, p0, LLK$n0;->g:LLK;

    invoke-direct {v1, v2, v7, p1}, LLK$n0$a;-><init>(LLK;LLK$n0$b;Lio/reactivex/y;)V

    iget p1, p0, LLK$n0;->h:I

    int-to-long v2, p1

    invoke-interface {v0, v1, v2, v3}, LaY;->c(Lkotlin/jvm/functions/Function0;J)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/y;

    invoke-virtual {p0, p1}, LLK$n0;->b(Lio/reactivex/y;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
