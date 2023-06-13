.class public final Ly96$a;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly96;->collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "co.bird.android.lib.coroutine.TransformedStateFlow"
    f = "TransformedStateFlow.kt"
    i = {
        0x0
    }
    l = {
        0x1b,
        0x1b,
        0x1d
    }
    m = "collect"
    n = {
        "collector"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ly96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly96<",
            "TT;>;"
        }
    .end annotation
.end field

.field public k:I


# direct methods
.method public constructor <init>(Ly96;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly96<",
            "TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ly96$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ly96$a;->j:Ly96;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ly96$a;->i:Ljava/lang/Object;

    iget p1, p0, Ly96$a;->k:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ly96$a;->k:I

    iget-object p1, p0, Ly96$a;->j:Ly96;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ly96;->collect(LGu1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
