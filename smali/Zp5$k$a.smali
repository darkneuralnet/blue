.class public final LZp5$k$a;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZp5$k;->a(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1"
    f = "Scrollable.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x204
    }
    m = "onPostFling-RZ2iAVY"
    n = {
        "this",
        "available"
    }
    s = {
        "L$0",
        "J$0"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:J

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:LZp5$k;

.field public l:I


# direct methods
.method public constructor <init>(LZp5$k;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZp5$k;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LZp5$k$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LZp5$k$a;->k:LZp5$k;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, LZp5$k$a;->j:Ljava/lang/Object;

    iget p1, p0, LZp5$k$a;->l:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LZp5$k$a;->l:I

    iget-object v0, p0, LZp5$k$a;->k:LZp5$k;

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, LZp5$k;->a(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
