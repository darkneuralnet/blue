.class public final LeW2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMV0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B!\u0008\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\u000c\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0008\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0007R\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0013"
    }
    d2 = {
        "LeW2;",
        "LMV0;",
        "Landroid/content/Intent;",
        "intent",
        "Lio/reactivex/c;",
        "a",
        "LjG2;",
        "LjG2;",
        "mainNavigator",
        "Le13;",
        "b",
        "Le13;",
        "navigator",
        "LAz6;",
        "c",
        "LAz6;",
        "webArchiveManager",
        "<init>",
        "(LjG2;Le13;LAz6;)V",
        "deeplink_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LjG2;

.field public final b:Le13;

.field public final c:LAz6;


# direct methods
.method public constructor <init>(LjG2;Le13;LAz6;)V
    .locals 1

    const-string v0, "mainNavigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webArchiveManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LeW2;->a:LjG2;

    iput-object p2, p0, LeW2;->b:Le13;

    iput-object p3, p0, LeW2;->c:LAz6;

    return-void
.end method

.method public static synthetic b(LeW2;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, LeW2;->f(LeW2;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LeW2;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(LeW2;Ljava/lang/String;)Lio/reactivex/h;
    .locals 0

    invoke-static {p0, p1}, LeW2;->e(LeW2;Ljava/lang/String;)Lio/reactivex/h;

    move-result-object p0

    return-object p0
.end method

.method public static final e(LeW2;Ljava/lang/String;)Lio/reactivex/h;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LeW2;->c:LAz6;

    invoke-interface {v0, p1}, LAz6;->b(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object v0

    new-instance v1, LcW2;

    invoke-direct {v1, p0, p1}, LcW2;-><init>(LeW2;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object p0

    sget-object p1, LeW2$a;->g:LeW2$a;

    new-instance v0, LdW2;

    invoke-direct {v0, p1}, LdW2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v0}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p0

    return-object p0
.end method

.method public static final f(LeW2;Ljava/lang/String;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LeW2;->b:Le13;

    invoke-interface {p0, p1}, Le13;->f0(Ljava/lang/String;)V

    return-void
.end method

.method public static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Intent;)Lio/reactivex/c;
    .locals 2

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "page"

    invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, LeW2;->a:LjG2;

    invoke-virtual {v1, p1}, LjG2;->a(Landroid/content/Intent;)Lio/reactivex/c;

    move-result-object p1

    new-instance v1, LbW2;

    invoke-direct {v1, p0, v0}, LbW2;-><init>(LeW2;Ljava/lang/String;)V

    invoke-static {v1}, Lio/reactivex/c;->t(Ljava/util/concurrent/Callable;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "mainNavigator.navigate(i\u2026inkException() }\n      })"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Motmot deeplink missing \'page\' query string parameter"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/c;->F(Ljava/lang/Throwable;)Lio/reactivex/c;

    move-result-object p1

    const-string v0, "error(NullPointerExcepti\u2026query string parameter\"))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
