.class public final LKN4$d;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKN4;->b(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.chuckerteam.chucker.api.RetentionManager"
    f = "RetentionManager.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x71,
        0x34
    }
    m = "doMaintenance$com_github_ChuckerTeam_Chucker_library"
    n = {
        "this",
        "$this$withLock_u24default$iv",
        "this",
        "$this$withLock_u24default$iv",
        "now"
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "J$0"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:J

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:LKN4;

.field public m:I


# direct methods
.method public constructor <init>(LKN4;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LKN4;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LKN4$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LKN4$d;->l:LKN4;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LKN4$d;->k:Ljava/lang/Object;

    iget p1, p0, LKN4$d;->m:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LKN4$d;->m:I

    iget-object p1, p0, LKN4$d;->l:LKN4;

    invoke-virtual {p1, p0}, LKN4;->b(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
