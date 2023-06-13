.class public final Liv1$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liv1;->b(LEu1;LEu1;LEu1;LEu1;LEu1;Lkotlin/jvm/functions/Function6;)LEu1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LEu1<",
        "TR;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0007"
    }
    d2 = {
        "kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1",
        "LEu1;",
        "LGu1;",
        "collector",
        "",
        "collect",
        "(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic b:[LEu1;

.field public final synthetic c:Lkotlin/jvm/functions/Function6;


# direct methods
.method public constructor <init>([LEu1;Lkotlin/jvm/functions/Function6;)V
    .locals 0

    iput-object p1, p0, Liv1$c;->b:[LEu1;

    iput-object p2, p0, Liv1$c;->c:Lkotlin/jvm/functions/Function6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Liv1$c;->b:[LEu1;

    invoke-static {}, Liv1;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v1

    new-instance v2, Liv1$c$a;

    const/4 v3, 0x0

    iget-object v4, p0, Liv1$c;->c:Lkotlin/jvm/functions/Function6;

    invoke-direct {v2, v3, v4}, Liv1$c$a;-><init>(Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function6;)V

    invoke-static {p1, v0, v1, v2, p2}, LRm0;->a(LGu1;[LEu1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
