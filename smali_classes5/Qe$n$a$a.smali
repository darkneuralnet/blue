.class public final LQe$n$a$a;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQe$n$a;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.google.accompanist.navigation.animation.AnimatedNavHostKt$AnimatedNavHost$lambda$4$$inlined$map$1$2"
    f = "AnimatedNavHost.kt"
    i = {}
    l = {
        0xdf
    }
    m = "emit"
    n = {}
    s = {}
.end annotation


# instance fields
.field public synthetic h:Ljava/lang/Object;

.field public i:I

.field public final synthetic j:LQe$n$a;


# direct methods
.method public constructor <init>(LQe$n$a;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, LQe$n$a$a;->j:LQe$n$a;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LQe$n$a$a;->h:Ljava/lang/Object;

    iget p1, p0, LQe$n$a$a;->i:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LQe$n$a$a;->i:I

    iget-object p1, p0, LQe$n$a$a;->j:LQe$n$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LQe$n$a;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
