.class public final LqZ0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LqZ0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static a(LqZ0;JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lo51;
    .locals 0

    invoke-static {}, LbX0;->a()LqZ0;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3, p4}, LqZ0;->t(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lo51;

    move-result-object p0

    return-object p0
.end method
