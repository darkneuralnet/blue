.class public final Lts3$E$c;
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

    iput-object p1, p0, Lts3$E$c;->g:Lts3;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lts3;)V
    .locals 0

    invoke-static {p0}, Lts3$E$c;->b(Lts3;)V

    return-void
.end method

.method public static final b(Lts3;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lts3;->access$getPreference$p(Lts3;)Lgl;

    move-result-object v0

    invoke-virtual {v0}, Lgl;->X2()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lts3;->access$setShowPostConfirmationDialog$p(Lts3;Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final invoke()Lio/reactivex/c;
    .locals 3

    iget-object v0, p0, Lts3$E$c;->g:Lts3;

    invoke-static {v0}, Lts3;->access$getTaskOrderManager$p(Lts3;)LtZ5;

    move-result-object v0

    invoke-interface {v0}, LtZ5;->a()Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, Lts3$E$c;->g:Lts3;

    invoke-static {v0, v1}, Lts3$E;->c(Lio/reactivex/c;Lts3;)Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, Lts3$E$c;->g:Lts3;

    new-instance v2, LEs3;

    invoke-direct {v2, v1}, LEs3;-><init>(Lts3;)V

    invoke-virtual {v0, v2}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object v0

    const-string v1, "taskOrderManager.accept(\u2026      }\n                }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lts3$E$c;->invoke()Lio/reactivex/c;

    move-result-object v0

    return-object v0
.end method
