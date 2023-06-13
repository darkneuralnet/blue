.class public final Lco/bird/android/feature/webview/c$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/webview/c;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/Object;",
        ">;",
        "Lio/reactivex/F<",
        "Lco/bird/android/buava/Optional<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/Object;",
        ">;>;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00000\u00050\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "",
        "",
        "",
        "it",
        "Lio/reactivex/F;",
        "Lco/bird/android/buava/Optional;",
        "b",
        "(Ljava/util/Map;)Lio/reactivex/F;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWebViewArchivePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewArchivePresenter.kt\nco/bird/android/feature/webview/WebViewArchivePresenter$configureWebBridge$1$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/webview/c;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/webview/c;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/webview/c$d;->g:Lco/bird/android/feature/webview/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Ljava/util/Map;Lco/bird/android/feature/webview/c;)Lco/bird/android/buava/Optional;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/webview/c$d;->c(Ljava/util/Map;Lco/bird/android/feature/webview/c;)Lco/bird/android/buava/Optional;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljava/util/Map;Lco/bird/android/feature/webview/c;)Lco/bird/android/buava/Optional;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const-string v1, "title"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    instance-of v1, p0, Ljava/lang/String;

    if-eqz v1, :cond_1

    move-object v0, p0

    check-cast v0, Ljava/lang/String;

    :cond_1
    if-eqz v0, :cond_2

    invoke-static {p1}, Lco/bird/android/feature/webview/c;->access$getUi$p(Lco/bird/android/feature/webview/c;)LnA6;

    move-result-object p0

    invoke-virtual {p0, v0}, LnA6;->t(Ljava/lang/String;)V

    :cond_2
    sget-object p0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p0}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/util/Map;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/reactivex/F<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/feature/webview/c$d;->g:Lco/bird/android/feature/webview/c;

    new-instance v1, LkA6;

    invoke-direct {v1, p1, v0}, LkA6;-><init>(Ljava/util/Map;Lco/bird/android/feature/webview/c;)V

    invoke-static {v1}, Lio/reactivex/F;->E(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "fromCallable {\n         \u2026tional.absent()\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/webview/c$d;->b(Ljava/util/Map;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method
