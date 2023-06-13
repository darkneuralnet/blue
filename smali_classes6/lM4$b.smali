.class public final LlM4$b;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LlM4;->e(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/coroutines/jvm/internal/ContinuationImpl;"
    }
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
    c = "io.github.sceneview.utils.ResourceLoader"
    f = "ResourceLoader.kt"
    i = {
        0x0,
        0x1
    }
    l = {
        0x20,
        0x21
    }
    m = "useFileBuffer"
    n = {
        "block",
        "buffer"
    }
    s = {
        "L$0",
        "L$0"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:LlM4;

.field public k:I


# direct methods
.method public constructor <init>(LlM4;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlM4;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LlM4$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LlM4$b;->j:LlM4;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LlM4$b;->i:Ljava/lang/Object;

    iget p1, p0, LlM4$b;->k:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LlM4$b;->k:I

    iget-object p1, p0, LlM4$b;->j:LlM4;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, LlM4;->e(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
