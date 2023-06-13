.class public final LzN2$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LzN2;->h(LxN2;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function8;)Lzh2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LEu1<",
        "LMN2<",
        "TA;TB;TC;TD;TE;TF;TG;>;>;"
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

.field public final synthetic f:Lkotlin/reflect/KProperty1;

.field public final synthetic g:Lkotlin/reflect/KProperty1;

.field public final synthetic h:Lkotlin/reflect/KProperty1;

.field public final synthetic i:Lkotlin/reflect/KProperty1;


# direct methods
.method public constructor <init>(LEu1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;)V
    .locals 0

    iput-object p1, p0, LzN2$m;->b:LEu1;

    iput-object p2, p0, LzN2$m;->c:Lkotlin/reflect/KProperty1;

    iput-object p3, p0, LzN2$m;->d:Lkotlin/reflect/KProperty1;

    iput-object p4, p0, LzN2$m;->e:Lkotlin/reflect/KProperty1;

    iput-object p5, p0, LzN2$m;->f:Lkotlin/reflect/KProperty1;

    iput-object p6, p0, LzN2$m;->g:Lkotlin/reflect/KProperty1;

    iput-object p7, p0, LzN2$m;->h:Lkotlin/reflect/KProperty1;

    iput-object p8, p0, LzN2$m;->i:Lkotlin/reflect/KProperty1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, LzN2$m;->b:LEu1;

    new-instance v10, LzN2$m$a;

    iget-object v3, p0, LzN2$m;->c:Lkotlin/reflect/KProperty1;

    iget-object v4, p0, LzN2$m;->d:Lkotlin/reflect/KProperty1;

    iget-object v5, p0, LzN2$m;->e:Lkotlin/reflect/KProperty1;

    iget-object v6, p0, LzN2$m;->f:Lkotlin/reflect/KProperty1;

    iget-object v7, p0, LzN2$m;->g:Lkotlin/reflect/KProperty1;

    iget-object v8, p0, LzN2$m;->h:Lkotlin/reflect/KProperty1;

    iget-object v9, p0, LzN2$m;->i:Lkotlin/reflect/KProperty1;

    move-object v1, v10

    move-object v2, p1

    invoke-direct/range {v1 .. v9}, LzN2$m$a;-><init>(LGu1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KProperty1;)V

    invoke-interface {v0, v10, p2}, LEu1;->collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
