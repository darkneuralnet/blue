.class public final LvA6$b;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LvA6;->c(Landroid/webkit/WebView;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.google.accompanist.web.WebViewNavigator"
    f = "WebView.kt"
    i = {}
    l = {
        0x174
    }
    m = "handleNavigationEvents$web_release"
    n = {}
    s = {}
.end annotation


# instance fields
.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:LvA6;

.field public j:I


# direct methods
.method public constructor <init>(LvA6;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LvA6;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LvA6$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LvA6$b;->i:LvA6;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LvA6$b;->h:Ljava/lang/Object;

    iget p1, p0, LvA6$b;->j:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LvA6$b;->j:I

    iget-object p1, p0, LvA6$b;->i:LvA6;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LvA6;->c(Landroid/webkit/WebView;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
