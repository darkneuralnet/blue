.class public final LnP5$a$a$a;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LnP5$a$a;->c(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "kotlinx.coroutines.flow.StartedLazily$command$1$1"
    f = "SharingStarted.kt"
    i = {}
    l = {
        0x9e
    }
    m = "emit"
    n = {}
    s = {}
.end annotation


# instance fields
.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:LnP5$a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LnP5$a$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field public j:I


# direct methods
.method public constructor <init>(LnP5$a$a;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LnP5$a$a<",
            "-TT;>;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LnP5$a$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LnP5$a$a$a;->i:LnP5$a$a;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LnP5$a$a$a;->h:Ljava/lang/Object;

    iget p1, p0, LnP5$a$a$a;->j:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LnP5$a$a$a;->j:I

    iget-object p1, p0, LnP5$a$a$a;->i:LnP5$a$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LnP5$a$a;->c(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
