.class public final LEc$a;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEc;->d(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect"
    f = "AndroidOverscroll.kt"
    i = {
        0x1,
        0x1
    }
    l = {
        0xdb,
        0xf4
    }
    m = "applyToFling-BMRW4eQ"
    n = {
        "this",
        "remainingVelocity"
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

.field public final synthetic k:LEc;

.field public l:I


# direct methods
.method public constructor <init>(LEc;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEc;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LEc$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LEc$a;->k:LEc;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, LEc$a;->j:Ljava/lang/Object;

    iget p1, p0, LEc$a;->l:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LEc$a;->l:I

    iget-object p1, p0, LEc$a;->k:LEc;

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2, p0}, LEc;->d(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
