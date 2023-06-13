.class public final Lts3$E$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lts3$E;->d(Lco/bird/android/model/TaskOrderData;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lio/reactivex/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lio/reactivex/c;",
        "invoke",
        "()Lio/reactivex/c;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lts3;


# direct methods
.method public constructor <init>(Lts3;)V
    .locals 0

    iput-object p1, p0, Lts3$E$d;->g:Lts3;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lio/reactivex/c;
    .locals 2

    iget-object v0, p0, Lts3$E$d;->g:Lts3;

    invoke-static {v0}, Lts3;->access$getUi$p(Lts3;)LCw3;

    move-result-object v0

    sget-object v1, LQk3$c;->a:LQk3$c;

    invoke-interface {v0, v1}, LRk3;->xd(LQk3;)V

    iget-object v0, p0, Lts3$E$d;->g:Lts3;

    invoke-static {v0}, Lts3;->access$getTaskOrderManager$p(Lts3;)LtZ5;

    move-result-object v0

    invoke-interface {v0}, LtZ5;->d()Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, Lts3$E$d;->g:Lts3;

    invoke-static {v0, v1}, Lts3$E;->c(Lio/reactivex/c;Lts3;)Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lts3$E$d;->invoke()Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method
