.class public final LHc$a;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LHc;->c(Lew1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "androidx.compose.ui.text.font.AndroidFontLoader"
    f = "AndroidFontLoader.android.kt"
    i = {
        0x1,
        0x1
    }
    l = {
        0x3d,
        0x3e
    }
    m = "awaitLoad"
    n = {
        "this",
        "font"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:LHc;

.field public l:I


# direct methods
.method public constructor <init>(LHc;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHc;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "LHc$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LHc$a;->k:LHc;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LHc$a;->j:Ljava/lang/Object;

    iget p1, p0, LHc$a;->l:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LHc$a;->l:I

    iget-object p1, p0, LHc$a;->k:LHc;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, LHc;->c(Lew1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
