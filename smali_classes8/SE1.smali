.class public abstract LSE1;
.super LpG2;
.source "SourceFile"

# interfaces
.implements LqZ0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u00012\u00020\u0002B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00008&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u0082\u0001\u0001\u0008\u00a8\u0006\t"
    }
    d2 = {
        "LSE1;",
        "LpG2;",
        "LqZ0;",
        "S",
        "()LSE1;",
        "immediate",
        "<init>",
        "()V",
        "LRE1;",
        "kotlinx-coroutines-android"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, LpG2;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, LSE1;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract S()LSE1;
.end method

.method public t(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lo51;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LqZ0$a;->a(LqZ0;JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lo51;

    move-result-object p1

    return-object p1
.end method
