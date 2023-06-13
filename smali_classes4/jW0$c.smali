.class public final LjW0$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LjW0;->e(Landroid/content/Intent;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/H<",
        "LcW0;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lio/reactivex/H;",
        "LcW0;",
        "emitter",
        "",
        "invoke",
        "(Lio/reactivex/H;)V",
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
.field public final synthetic g:LjW0;

.field public final synthetic h:Landroid/content/Intent;

.field public final synthetic i:Landroid/net/Uri;


# direct methods
.method public constructor <init>(LjW0;Landroid/content/Intent;Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, LjW0$c;->g:LjW0;

    iput-object p2, p0, LjW0$c;->h:Landroid/content/Intent;

    iput-object p3, p0, LjW0$c;->i:Landroid/net/Uri;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LjW0;Lio/reactivex/H;Landroid/net/Uri;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LjW0$c;->c(LjW0;Lio/reactivex/H;Landroid/net/Uri;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic b(Lio/reactivex/H;LjW0;Landroid/net/Uri;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LjW0$c;->d(Lio/reactivex/H;LjW0;Landroid/net/Uri;Ljava/lang/Exception;)V

    return-void
.end method

.method public static final c(LjW0;Lio/reactivex/H;Landroid/net/Uri;Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dynamicLinkResult"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p3}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LbQ3;

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    invoke-static {p0}, LjW0;->access$getContext$p(LjW0;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p3, v1}, LbQ3;->d(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    new-instance p3, Lcf6;

    invoke-direct {p3, v1}, Lcf6;-><init>(Landroid/content/Intent;)V

    invoke-interface {p1, p3}, Lio/reactivex/H;->onSuccess(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    if-eqz p3, :cond_2

    invoke-virtual {p3}, LbQ3;->a()Landroid/net/Uri;

    move-result-object v0

    :cond_2
    new-instance p3, LKV0;

    invoke-static {p0, p2, v0}, LjW0;->access$mergeQueryParams(LjW0;Landroid/net/Uri;Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {p3, v1, p2, v0}, LKV0;-><init>(Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;)V

    invoke-interface {p1, p3}, Lio/reactivex/H;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p3

    invoke-static {p3}, Lg46;->e(Ljava/lang/Throwable;)V

    invoke-static {p0, p2}, LjW0;->access$originalIntent(LjW0;Landroid/net/Uri;)LKV0;

    move-result-object p0

    invoke-interface {p1, p0}, Lio/reactivex/H;->onSuccess(Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public static final d(Lio/reactivex/H;LjW0;Landroid/net/Uri;Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "$emitter"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lg46;->e(Ljava/lang/Throwable;)V

    invoke-static {p1, p2}, LjW0;->access$originalIntent(LjW0;Landroid/net/Uri;)LKV0;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/reactivex/H;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/H;

    invoke-virtual {p0, p1}, LjW0$c;->invoke(Lio/reactivex/H;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lio/reactivex/H;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/H<",
            "LcW0;",
            ">;)V"
        }
    .end annotation

    const-string v0, "emitter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LjW0$c;->g:LjW0;

    invoke-static {v0}, LjW0;->access$getFirebaseDynamicLinks$p(LjW0;)LKm1;

    move-result-object v0

    iget-object v1, p0, LjW0$c;->h:Landroid/content/Intent;

    invoke-virtual {v0, v1}, LKm1;->b(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, LjW0$c;->g:LjW0;

    iget-object v2, p0, LjW0$c;->i:Landroid/net/Uri;

    new-instance v3, LkW0;

    invoke-direct {v3, v1, p1, v2}, LkW0;-><init>(LjW0;Lio/reactivex/H;Landroid/net/Uri;)V

    invoke-virtual {v0, v3}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, LjW0$c;->g:LjW0;

    iget-object v2, p0, LjW0$c;->i:Landroid/net/Uri;

    new-instance v3, LlW0;

    invoke-direct {v3, p1, v1, v2}, LlW0;-><init>(Lio/reactivex/H;LjW0;Landroid/net/Uri;)V

    invoke-virtual {v0, v3}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
