.class public final Lco/bird/android/lib/webview/bridge/a$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/lib/webview/bridge/a;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/Object;",
        ">;>;+",
        "Lco/bird/android/lib/webview/bridge/b$b<",
        "*>;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u000b\u001a\u00020\u00082V\u0010\u0007\u001aR\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0005 \u0006*(\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u0005\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\t\u0010\n"
    }
    d2 = {
        "Lkotlin/Pair;",
        "Lco/bird/android/buava/Optional;",
        "",
        "",
        "",
        "Lco/bird/android/lib/webview/bridge/b$b;",
        "kotlin.jvm.PlatformType",
        "<name for destructuring parameter 0>",
        "",
        "invoke",
        "(Lkotlin/Pair;)V",
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
.field public final synthetic g:Lco/bird/android/lib/webview/bridge/a;


# direct methods
.method public constructor <init>(Lco/bird/android/lib/webview/bridge/a;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/lib/webview/bridge/a$d;->g:Lco/bird/android/lib/webview/bridge/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco/bird/android/lib/webview/bridge/a$d;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Lco/bird/android/buava/Optional<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;+",
            "Lco/bird/android/lib/webview/bridge/b$b<",
            "*>;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/lib/webview/bridge/b$b;

    invoke-virtual {p1}, Lco/bird/android/lib/webview/bridge/b$b;->a()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lco/bird/android/lib/webview/bridge/a$d;->g:Lco/bird/android/lib/webview/bridge/a;

    invoke-static {v1}, Lco/bird/android/lib/webview/bridge/a;->access$getWebView$p(Lco/bird/android/lib/webview/bridge/a;)Landroid/webkit/WebView;

    move-result-object v2

    new-instance v3, Lco/bird/android/lib/webview/bridge/b$c;

    invoke-virtual {p1}, Lco/bird/android/lib/webview/bridge/b$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-direct {v3, p1, v0}, Lco/bird/android/lib/webview/bridge/b$c;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-static {v1, v2, v3}, Lco/bird/android/lib/webview/bridge/a;->access$sendPayload(Lco/bird/android/lib/webview/bridge/a;Landroid/webkit/WebView;Lco/bird/android/lib/webview/bridge/b;)V

    :cond_0
    return-void
.end method
