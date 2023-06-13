.class public final Lw36$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw36;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LL36;",
        "Lkotlin/coroutines/CoroutineContext$Element;",
        "LL36;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LL36;",
        "state",
        "Lkotlin/coroutines/CoroutineContext$Element;",
        "element",
        "a",
        "(LL36;Lkotlin/coroutines/CoroutineContext$Element;)LL36;"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lw36$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw36$c;

    invoke-direct {v0}, Lw36$c;-><init>()V

    sput-object v0, Lw36$c;->g:Lw36$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LL36;Lkotlin/coroutines/CoroutineContext$Element;)LL36;
    .locals 1

    instance-of v0, p2, Lv36;

    if-eqz v0, :cond_0

    check-cast p2, Lv36;

    iget-object v0, p1, LL36;->a:Lkotlin/coroutines/CoroutineContext;

    invoke-interface {p2, v0}, Lv36;->R(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, LL36;->a(Lv36;Ljava/lang/Object;)V

    :cond_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LL36;

    check-cast p2, Lkotlin/coroutines/CoroutineContext$Element;

    invoke-virtual {p0, p1, p2}, Lw36$c;->a(LL36;Lkotlin/coroutines/CoroutineContext$Element;)LL36;

    move-result-object p1

    return-object p1
.end method
