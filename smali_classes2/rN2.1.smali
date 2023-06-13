.class public final LrN2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ&\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006J&\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0012R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00048F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001b"
    }
    d2 = {
        "LrN2;",
        "",
        "Landroid/content/Context;",
        "context",
        "LTN2;",
        "viewModelConfigFactory",
        "LQr6;",
        "viewModelDelegateFactory",
        "",
        "b",
        "",
        "debugMode",
        "c",
        "LQr6;",
        "getViewModelDelegateFactory",
        "()LQr6;",
        "setViewModelDelegateFactory",
        "(LQr6;)V",
        "LTN2;",
        "_viewModelConfigFactory",
        "value",
        "a",
        "()LTN2;",
        "setViewModelConfigFactory",
        "(LTN2;)V",
        "<init>",
        "()V",
        "mvrx_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final a:LrN2;

.field public static b:LQr6;

.field public static c:LTN2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LrN2;

    invoke-direct {v0}, LrN2;-><init>()V

    sput-object v0, LrN2;->a:LrN2;

    new-instance v0, LXY0;

    invoke-direct {v0}, LXY0;-><init>()V

    sput-object v0, LrN2;->b:LQr6;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic d(LrN2;Landroid/content/Context;LTN2;LQr6;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, LrN2;->b(Landroid/content/Context;LTN2;LQr6;)V

    return-void
.end method


# virtual methods
.method public final a()LTN2;
    .locals 2

    sget-object v0, LrN2;->c:LTN2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must initialize Mavericks. Add Mavericks.initialize(...) to your Application.onCreate()."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(Landroid/content/Context;LTN2;LQr6;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LUN2;->a(Landroid/content/Context;)Z

    move-result p1

    invoke-virtual {p0, p1, p2, p3}, LrN2;->c(ZLTN2;LQr6;)V

    return-void
.end method

.method public final c(ZLTN2;LQr6;)V
    .locals 7

    if-nez p2, :cond_0

    new-instance p2, LTN2;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xe

    const/4 v6, 0x0

    move-object v0, p2

    move v1, p1

    invoke-direct/range {v0 .. v6}, LTN2;-><init>(ZLkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    sput-object p2, LrN2;->c:LTN2;

    if-nez p3, :cond_1

    sget-object p3, LrN2;->b:LQr6;

    instance-of p1, p3, LXY0;

    if-nez p1, :cond_1

    new-instance p3, LXY0;

    invoke-direct {p3}, LXY0;-><init>()V

    :cond_1
    sput-object p3, LrN2;->b:LQr6;

    return-void
.end method
