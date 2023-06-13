.class public final LVN2$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LVN2;->d(LRN2;LLifecycleOwner;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;La01;Lkotlin/jvm/functions/Function4;)Lzh2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LEu1<",
        "LIN2<",
        "TA;TB;TC;>;>;"
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
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic b:LEu1;

.field public final synthetic c:Lkotlin/reflect/KProperty1;

.field public final synthetic d:Lkotlin/reflect/KProperty1;

.field public final synthetic e:Lkotlin/reflect/KProperty1;


# direct methods
.method public constructor <init>(LEu1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;)V
    .locals 0

    iput-object p1, p0, LVN2$e;->b:LEu1;

    iput-object p2, p0, LVN2$e;->c:Lkotlin/reflect/KProperty1;

    iput-object p3, p0, LVN2$e;->d:Lkotlin/reflect/KProperty1;

    iput-object p4, p0, LVN2$e;->e:Lkotlin/reflect/KProperty1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, LVN2$e;->b:LEu1;

    new-instance v1, LVN2$e$a;

    iget-object v2, p0, LVN2$e;->c:Lkotlin/reflect/KProperty1;

    iget-object v3, p0, LVN2$e;->d:Lkotlin/reflect/KProperty1;

    iget-object v4, p0, LVN2$e;->e:Lkotlin/reflect/KProperty1;

    invoke-direct {v1, p1, v2, v3, v4}, LVN2$e$a;-><init>(LGu1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;)V

    invoke-interface {v0, v1, p2}, LEu1;->collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
