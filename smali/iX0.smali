.class public final LiX0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcu1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001f\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u000f\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0017"
    }
    d2 = {
        "LiX0;",
        "Lcu1;",
        "LWp5;",
        "",
        "initialVelocity",
        "a",
        "(LWp5;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "LjV0;",
        "LjV0;",
        "flingDecay",
        "LPV2;",
        "b",
        "LPV2;",
        "motionDurationScale",
        "",
        "c",
        "I",
        "()I",
        "d",
        "(I)V",
        "lastAnimationCycleCount",
        "<init>",
        "(LjV0;LPV2;)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LjV0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LjV0<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LPV2;

.field public c:I


# direct methods
.method public constructor <init>(LjV0;LPV2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LjV0<",
            "Ljava/lang/Float;",
            ">;",
            "LPV2;",
            ")V"
        }
    .end annotation

    const-string v0, "flingDecay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "motionDurationScale"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LiX0;->a:LjV0;

    iput-object p2, p0, LiX0;->b:LPV2;

    return-void
.end method

.method public synthetic constructor <init>(LjV0;LPV2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-static {}, LZp5;->f()LPV2;

    move-result-object p2

    :cond_0
    invoke-direct {p0, p1, p2}, LiX0;-><init>(LjV0;LPV2;)V

    return-void
.end method

.method public static final synthetic b(LiX0;)LjV0;
    .locals 0

    iget-object p0, p0, LiX0;->a:LjV0;

    return-object p0
.end method


# virtual methods
.method public a(LWp5;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LWp5;",
            "F",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Float;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    iput v0, p0, LiX0;->c:I

    iget-object v0, p0, LiX0;->b:LPV2;

    new-instance v1, LiX0$a;

    const/4 v2, 0x0

    invoke-direct {v1, p2, p0, p1, v2}, LiX0$a;-><init>(FLiX0;LWp5;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, p3}, LX30;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c()I
    .locals 1

    iget v0, p0, LiX0;->c:I

    return v0
.end method

.method public final d(I)V
    .locals 0

    iput p1, p0, LiX0;->c:I

    return-void
.end method
