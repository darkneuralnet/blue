.class public final Lw96$a;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw96;->collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "co.bird.android.lib.coroutine.TransformedShareFlow"
    f = "TransformedSharedFlow.kt"
    i = {}
    l = {
        0x24,
        0x26
    }
    m = "collect"
    n = {}
    s = {}
.end annotation


# instance fields
.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lw96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw96<",
            "TT;>;"
        }
    .end annotation
.end field

.field public j:I


# direct methods
.method public constructor <init>(Lw96;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw96<",
            "TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lw96$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lw96$a;->i:Lw96;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lw96$a;->h:Ljava/lang/Object;

    iget p1, p0, Lw96$a;->j:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lw96$a;->j:I

    iget-object p1, p0, Lw96$a;->i:Lw96;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lw96;->collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
