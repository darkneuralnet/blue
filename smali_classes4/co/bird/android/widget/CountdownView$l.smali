.class public final Lco/bird/android/widget/CountdownView$l;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/widget/CountdownView;->I(ILjava/util/concurrent/TimeUnit;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Long;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "kotlin.jvm.PlatformType",
        "seconds",
        "",
        "a",
        "(Ljava/lang/Long;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/widget/CountdownView;


# direct methods
.method public constructor <init>(Lco/bird/android/widget/CountdownView;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/CountdownView$l;->g:Lco/bird/android/widget/CountdownView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)V
    .locals 4

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    iget-object v0, p0, Lco/bird/android/widget/CountdownView$l;->g:Lco/bird/android/widget/CountdownView;

    invoke-virtual {v0}, Lco/bird/android/widget/CountdownView;->q()LR46;

    move-result-object v0

    sget-object v1, LR46;->e:LR46;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lco/bird/android/widget/CountdownView$l;->g:Lco/bird/android/widget/CountdownView;

    invoke-static {v0}, Lco/bird/android/widget/CountdownView;->access$getCountDownEndedSubject$p(Lco/bird/android/widget/CountdownView;)Lio/reactivex/subjects/b;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/subjects/b;->onComplete()V

    :cond_1
    :goto_0
    iget-object v0, p0, Lco/bird/android/widget/CountdownView$l;->g:Lco/bird/android/widget/CountdownView;

    invoke-static {v0}, Lco/bird/android/widget/CountdownView;->access$getRemainingSeconds$p(Lco/bird/android/widget/CountdownView;)Lio/reactivex/subjects/d;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    long-to-int p1, v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lco/bird/android/widget/CountdownView$l;->a(Ljava/lang/Long;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
