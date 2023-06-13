.class public final Lts3$E$e;
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

    iput-object p1, p0, Lts3$E$e;->g:Lts3;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lio/reactivex/c;
    .locals 11

    iget-object v0, p0, Lts3$E$e;->g:Lts3;

    invoke-static {v0}, Lts3;->access$getShowPostConfirmationDialog$p(Lts3;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lts3$E$e;->g:Lts3;

    invoke-static {v0}, Lts3;->access$getUi$p(Lts3;)LCw3;

    move-result-object v1

    sget-object v2, Lb93;->d:Lb93;

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lts3$E$e$a;

    iget-object v0, p0, Lts3$E$e;->g:Lts3;

    invoke-direct {v5, v0}, Lts3$E$e$a;-><init>(Lts3;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0x76

    const/4 v10, 0x0

    invoke-static/range {v1 .. v10}, LH31$a;->showDialog$default(LH31;LNy;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lts3$E$e;->g:Lts3;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lts3;->access$setShowPostConfirmationDialog$p(Lts3;Z)V

    iget-object v0, p0, Lts3$E$e;->g:Lts3;

    invoke-static {v0}, Lts3;->access$getPreference$p(Lts3;)Lgl;

    move-result-object v0

    invoke-virtual {v0}, Lgl;->J2()V

    :cond_0
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object v0

    const-string v1, "complete()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lts3$E$e;->invoke()Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method
