.class public final Lco/bird/android/lib/webview/bridge/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOz6;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/lib/webview/bridge/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010%\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010\'\u001a\u00020\"\u00a2\u0006\u0004\u00084\u00105JN\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022<\u0010\t\u001a8\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u00080\u00070\u0004H\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u0002H\u0007J\u0008\u0010\u000e\u001a\u00020\nH\u0002J\u0008\u0010\u000f\u001a\u00020\nH\u0002J.\u0010\u0012\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u00080\u00072\n\u0010\u0011\u001a\u0006\u0012\u0002\u0008\u00030\u0010H\u0002J2\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00022\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0002J \u0010\u001a\u001a\u00020\n\"\u0004\u0008\u0000\u0010\u0017*\u00020\u00182\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0019H\u0002R\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0017\u0010\'\u001a\u00020\"8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&R\u0014\u0010*\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)RX\u0010-\u001aD\u0012\u0004\u0012\u00020\u0002\u0012:\u00128\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u00080\u00070\u00040+8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010,R<\u0010/\u001a(\u0012\u0004\u0012\u00020\u0002\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00050\u00080.0+8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010,R*\u00103\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\u0008\u0003 1*\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00100\u0010008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u00102\u00a8\u00066"
    }
    d2 = {
        "Lco/bird/android/lib/webview/bridge/a;",
        "LOz6;",
        "",
        "commandName",
        "Lkotlin/Function1;",
        "",
        "",
        "Lio/reactivex/F;",
        "Lco/bird/android/buava/Optional;",
        "handler",
        "",
        "a",
        "message",
        "postMessage",
        "h",
        "j",
        "Lco/bird/android/lib/webview/bridge/b$b;",
        "payload",
        "g",
        "callbackId",
        "params",
        "error",
        "f",
        "T",
        "Landroid/webkit/WebView;",
        "Lco/bird/android/lib/webview/bridge/b;",
        "i",
        "b",
        "Landroid/webkit/WebView;",
        "webView",
        "Lwi2;",
        "c",
        "Lwi2;",
        "deserializer",
        "Lcom/uber/autodispose/ScopeProvider;",
        "d",
        "Lcom/uber/autodispose/ScopeProvider;",
        "getScopeProvider",
        "()Lcom/uber/autodispose/ScopeProvider;",
        "scopeProvider",
        "e",
        "Ljava/lang/Object;",
        "lock",
        "",
        "Ljava/util/Map;",
        "registeredHandlers",
        "Lio/reactivex/H;",
        "callbackEmitters",
        "Lio/reactivex/subjects/d;",
        "kotlin.jvm.PlatformType",
        "Lio/reactivex/subjects/d;",
        "commandSubject",
        "<init>",
        "(Landroid/webkit/WebView;Lwi2;Lcom/uber/autodispose/ScopeProvider;)V",
        "bridge_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWebBridgeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebBridgeImpl.kt\nco/bird/android/lib/webview/bridge/WebBridgeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,154:1\n1#2:155\n180#3:156\n*S KotlinDebug\n*F\n+ 1 WebBridgeImpl.kt\nco/bird/android/lib/webview/bridge/WebBridgeImpl\n*L\n109#1:156\n*E\n"
    }
.end annotation


# static fields
.field public static final i:Lco/bird/android/lib/webview/bridge/a$a;


# instance fields
.field public final b:Landroid/webkit/WebView;

.field public final c:Lwi2;

.field public final d:Lcom/uber/autodispose/ScopeProvider;

.field public final e:Ljava/lang/Object;

.field public f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
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
            "Ljava/lang/Object;",
            ">;>;>;>;>;"
        }
    .end annotation
.end field

.field public g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/reactivex/H<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;>;>;"
        }
    .end annotation
.end field

.field public final h:Lio/reactivex/subjects/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/d<",
            "Lco/bird/android/lib/webview/bridge/b$b<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/lib/webview/bridge/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/lib/webview/bridge/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/lib/webview/bridge/a;->i:Lco/bird/android/lib/webview/bridge/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/webkit/WebView;Lwi2;Lcom/uber/autodispose/ScopeProvider;)V
    .locals 1

    const-string v0, "webView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/lib/webview/bridge/a;->b:Landroid/webkit/WebView;

    iput-object p2, p0, Lco/bird/android/lib/webview/bridge/a;->c:Lwi2;

    iput-object p3, p0, Lco/bird/android/lib/webview/bridge/a;->d:Lcom/uber/autodispose/ScopeProvider;

    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lco/bird/android/lib/webview/bridge/a;->e:Ljava/lang/Object;

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p2, p0, Lco/bird/android/lib/webview/bridge/a;->f:Ljava/util/Map;

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p2, p0, Lco/bird/android/lib/webview/bridge/a;->g:Ljava/util/Map;

    invoke-static {}, Lio/reactivex/subjects/d;->e()Lio/reactivex/subjects/d;

    move-result-object p2

    const-string p3, "create<WebPayload.InvokeCommand<*>>()"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lco/bird/android/lib/webview/bridge/a;->h:Lio/reactivex/subjects/d;

    const-string p2, "android"

    invoke-virtual {p1, p0, p2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/lib/webview/bridge/a;->h()V

    return-void
.end method

.method public static final synthetic access$getHandlerSingle(Lco/bird/android/lib/webview/bridge/a;Lco/bird/android/lib/webview/bridge/b$b;)Lio/reactivex/F;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/lib/webview/bridge/a;->g(Lco/bird/android/lib/webview/bridge/b$b;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getWebView$p(Lco/bird/android/lib/webview/bridge/a;)Landroid/webkit/WebView;
    .locals 0

    iget-object p0, p0, Lco/bird/android/lib/webview/bridge/a;->b:Landroid/webkit/WebView;

    return-object p0
.end method

.method public static final synthetic access$sendPayload(Lco/bird/android/lib/webview/bridge/a;Landroid/webkit/WebView;Lco/bird/android/lib/webview/bridge/b;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lco/bird/android/lib/webview/bridge/a;->i(Landroid/webkit/WebView;Lco/bird/android/lib/webview/bridge/b;)V

    return-void
.end method

.method public static final synthetic access$startCommandStream(Lco/bird/android/lib/webview/bridge/a;)V
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/lib/webview/bridge/a;->j()V

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/lib/webview/bridge/a;->m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/lib/webview/bridge/a;->k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/lib/webview/bridge/a;->l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method

.method public static final l(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;+",
            "Lio/reactivex/F<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;>;>;)V"
        }
    .end annotation

    const-string v0, "commandName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "handler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/lib/webview/bridge/a;->f:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final f(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/lib/webview/bridge/a;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lco/bird/android/lib/webview/bridge/a;->g:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/reactivex/H;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Lio/reactivex/H;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    if-eqz p3, :cond_2

    new-instance p2, Lco/bird/android/lib/webview/bridge/WebError$Callback;

    invoke-direct {p2, p3}, Lco/bird/android/lib/webview/bridge/WebError$Callback;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lio/reactivex/H;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    sget-object p3, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p3, p2}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p2

    invoke-interface {p1, p2}, Lio/reactivex/H;->onSuccess(Ljava/lang/Object;)V

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final g(Lco/bird/android/lib/webview/bridge/b$b;)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/lib/webview/bridge/b$b<",
            "*>;)",
            "Lio/reactivex/F<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;>;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/lib/webview/bridge/a;->f:Ljava/util/Map;

    invoke-virtual {p1}, Lco/bird/android/lib/webview/bridge/b$b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lco/bird/android/lib/webview/bridge/b$b;->d()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/F;

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-virtual {p1}, Lco/bird/android/lib/webview/bridge/b$b;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No handler registered for command: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lio/reactivex/F;->x(Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object v0

    const-string p1, "error(NullPointerExcepti\u2026${payload.commandName}\"))"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-object v0
.end method

.method public final h()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/lib/webview/bridge/a;->b:Landroid/webkit/WebView;

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/lib/webview/bridge/a;->j()V

    return-void

    :cond_0
    iget-object v0, p0, Lco/bird/android/lib/webview/bridge/a;->b:Landroid/webkit/WebView;

    new-instance v1, Lco/bird/android/lib/webview/bridge/a$b;

    invoke-direct {v1, p0}, Lco/bird/android/lib/webview/bridge/a$b;-><init>(Lco/bird/android/lib/webview/bridge/a;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void
.end method

.method public final i(Landroid/webkit/WebView;Lco/bird/android/lib/webview/bridge/b;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/webkit/WebView;",
            "Lco/bird/android/lib/webview/bridge/b<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/lib/webview/bridge/a;->c:Lwi2;

    invoke-virtual {v0, p2}, Lwi2;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "\\"

    const-string v3, "\\\\"

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "\""

    const-string v9, "\\\""

    const/4 v10, 0x0

    const/4 v11, 0x4

    const/4 v12, 0x0

    invoke-static/range {v7 .. v12}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\'"

    const-string v2, "\\\'"

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "\n"

    const-string v8, "\\n"

    const/4 v9, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "\r"

    const-string v2, "\\r"

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "\t"

    const-string v8, "\\t"

    invoke-static/range {v6 .. v11}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sending payload to JS - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "window.motmot._sendMessage(\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\')"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void
.end method

.method public final j()V
    .locals 4

    iget-object v0, p0, Lco/bird/android/lib/webview/bridge/a;->h:Lio/reactivex/subjects/d;

    new-instance v1, Lco/bird/android/lib/webview/bridge/a$c;

    invoke-direct {v1, p0}, Lco/bird/android/lib/webview/bridge/a$c;-><init>(Lco/bird/android/lib/webview/bridge/a;)V

    new-instance v2, LPz6;

    invoke-direct {v2, v1}, LPz6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/Observable;->concatMapSingle(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    const-string v1, "private fun startCommand\u2026      }, (Timber::e))\n  }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/lib/webview/bridge/a;->d:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v1}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->as(Lio/reactivex/x;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/uber/autodispose/ObservableSubscribeProxy;

    new-instance v1, Lco/bird/android/lib/webview/bridge/a$d;

    invoke-direct {v1, p0}, Lco/bird/android/lib/webview/bridge/a$d;-><init>(Lco/bird/android/lib/webview/bridge/a;)V

    new-instance v2, LQz6;

    invoke-direct {v2, v1}, LQz6;-><init>(Lkotlin/jvm/functions/Function1;)V

    sget-object v1, Lco/bird/android/lib/webview/bridge/a$e;->b:Lco/bird/android/lib/webview/bridge/a$e;

    new-instance v3, LRz6;

    invoke-direct {v3, v1}, LRz6;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v2, v3}, Lcom/uber/autodispose/ObservableSubscribeProxy;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public final postMessage(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lco/bird/android/lib/webview/bridge/a;->c:Lwi2;

    const-class v1, Lco/bird/android/lib/webview/bridge/b;

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lwi2;->c(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/lib/webview/bridge/b;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    instance-of v0, p1, Lco/bird/android/lib/webview/bridge/b$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/lib/webview/bridge/a;->h:Lio/reactivex/subjects/d;

    invoke-virtual {v0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    instance-of v0, p1, Lco/bird/android/lib/webview/bridge/b$c;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lco/bird/android/lib/webview/bridge/b$a;

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lco/bird/android/lib/webview/bridge/b;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lco/bird/android/lib/webview/bridge/b;->d()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/android/lib/webview/bridge/b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Lco/bird/android/lib/webview/bridge/a;->f(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unable to notify callbacks of updated status for payload "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_2
    return-void

    :catch_0
    move-exception p1

    invoke-static {p1}, Lg46;->e(Ljava/lang/Throwable;)V

    return-void
.end method
