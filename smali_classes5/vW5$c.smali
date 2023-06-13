.class public final LvW5$c;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LvW5;->r(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0086@"
    }
    d2 = {
        "Lkotlin/coroutines/Continuation;",
        "LFM4;",
        "continuation",
        "",
        "await"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.github.kittinunf.fuel.core.requests.SuspendableRequest"
    f = "SuspendableRequest.kt"
    i = {
        0x0
    }
    l = {
        0x40
    }
    m = "await"
    n = {
        "this"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field public synthetic h:Ljava/lang/Object;

.field public i:I

.field public final synthetic j:LvW5;

.field public k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LvW5;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, LvW5$c;->j:LvW5;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LvW5$c;->h:Ljava/lang/Object;

    iget p1, p0, LvW5$c;->i:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LvW5$c;->i:I

    iget-object p1, p0, LvW5$c;->j:LvW5;

    invoke-virtual {p1, p0}, LvW5;->r(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
