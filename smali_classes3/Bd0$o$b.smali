.class public final LBd0$o$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBd0$o;->c(Lkotlin/Pair;)Lio/reactivex/K;
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
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LBd0;


# direct methods
.method public constructor <init>(LBd0;)V
    .locals 0

    iput-object p1, p0, LBd0$o$b;->g:LBd0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LBd0$o$b;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 3

    invoke-static {p1}, Lg46;->e(Ljava/lang/Throwable;)V

    iget-object p1, p0, LBd0$o$b;->g:LBd0;

    invoke-static {p1}, LBd0;->access$getUi$p(LBd0;)LXd0;

    move-result-object p1

    sget v0, Lnl4;->cannot_access_submission_error:I

    invoke-interface {p1, v0}, LaM5;->error(I)V

    iget-object p1, p0, LBd0$o$b;->g:LBd0;

    invoke-static {p1}, LBd0;->access$getUi$p(LBd0;)LXd0;

    move-result-object p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, v2, v0, v1}, LS74$a;->showProgress$default(LS74;ZIILjava/lang/Object;)V

    iget-object p1, p0, LBd0$o$b;->g:LBd0;

    invoke-static {p1}, LBd0;->access$getUi$p(LBd0;)LXd0;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, LXd0;->p(Z)V

    return-void
.end method