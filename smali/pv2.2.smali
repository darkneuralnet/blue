.class public final Lpv2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0004R\u001c\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0007R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00028G\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000e"
    }
    d2 = {
        "Lpv2;",
        "",
        "LXr6;",
        "viewModelStoreOwner",
        "LW94;",
        "b",
        "LU94;",
        "LU94;",
        "LocalViewModelStoreOwner",
        "a",
        "(LEt0;I)LXr6;",
        "current",
        "<init>",
        "()V",
        "lifecycle-viewmodel-compose_release"
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
        "SMAP\nLocalViewModelStoreOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalViewModelStoreOwner.kt\nandroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,53:1\n76#2:54\n76#2:55\n*S KotlinDebug\n*F\n+ 1 LocalViewModelStoreOwner.kt\nandroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner\n*L\n41#1:54\n42#1:55\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lpv2;

.field public static final b:LU94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LU94<",
            "LXr6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpv2;

    invoke-direct {v0}, Lpv2;-><init>()V

    sput-object v0, Lpv2;->a:Lpv2;

    sget-object v0, Lpv2$a;->g:Lpv2$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Lgu0;->c(LEM5;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)LU94;

    move-result-object v0

    sput-object v0, Lpv2;->b:LU94;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEt0;I)LXr6;
    .locals 0
    .annotation build Lkotlin/jvm/JvmName;
        name = "getCurrent"
    .end annotation

    const p2, -0x22d19e38

    invoke-interface {p1, p2}, LEt0;->F(I)V

    sget-object p2, Lpv2;->b:LU94;

    invoke-interface {p1, p2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LXr6;

    if-nez p2, :cond_0

    invoke-static {}, Landroidx/compose/ui/platform/h;->k()LU94;

    move-result-object p2

    invoke-interface {p1, p2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    invoke-static {p2}, LUt6;->a(Landroid/view/View;)LXr6;

    move-result-object p2

    :cond_0
    invoke-interface {p1}, LEt0;->Q()V

    return-object p2
.end method

.method public final b(LXr6;)LW94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LXr6;",
            ")",
            "LW94<",
            "LXr6;",
            ">;"
        }
    .end annotation

    const-string v0, "viewModelStoreOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpv2;->b:LU94;

    invoke-virtual {v0, p1}, LU94;->c(Ljava/lang/Object;)LW94;

    move-result-object p1

    return-object p1
.end method
