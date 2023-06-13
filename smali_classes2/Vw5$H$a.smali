.class public final LVw5$H$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVw5$H;->c(Lkotlin/Unit;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/DialogResponse;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/DialogResponse;",
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LVw5;


# direct methods
.method public constructor <init>(LVw5;)V
    .locals 0

    iput-object p1, p0, LVw5$H$a;->g:LVw5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LVw5$H$a;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/h;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/h;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/DialogResponse;)Lio/reactivex/h;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/model/DialogResponse;->OK:Lco/bird/android/model/DialogResponse;

    if-eq p1, v0, :cond_0

    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, "user confirmed delete request, calling API now and waiting for success"

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, LVw5$H$a;->g:LVw5;

    invoke-static {p1}, LVw5;->access$getUserManager$p(LVw5;)Llh6;

    move-result-object p1

    invoke-interface {p1}, Llh6;->p()Lio/reactivex/F;

    move-result-object p1

    const-wide/16 v1, 0x3c

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v1, v2, v3}, Lio/reactivex/F;->a0(JLjava/util/concurrent/TimeUnit;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {p1, v1}, Lio/reactivex/F;->N(Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    const-string v1, "userManager.deleteUser()\u2026dSchedulers.mainThread())"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LVw5$H$a;->g:LVw5;

    invoke-static {v1}, LVw5;->access$getUi$p(LVw5;)Lex5;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v1, v0, v2, v3}, LsD;->progress$default(Lio/reactivex/F;LS74;IILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, LVw5$H$a$a;

    iget-object v1, p0, LVw5$H$a;->g:LVw5;

    invoke-direct {v0, v1}, LVw5$H$a$a;-><init>(LVw5;)V

    new-instance v1, Lax5;

    invoke-direct {v1, v0}, Lax5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->B(Lio/reactivex/functions/o;)Lio/reactivex/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/DialogResponse;

    invoke-virtual {p0, p1}, LVw5$H$a;->b(Lco/bird/android/model/DialogResponse;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
