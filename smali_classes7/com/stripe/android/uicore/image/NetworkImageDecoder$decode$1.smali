.class final Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/image/NetworkImageDecoder;->decode(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.stripe.android.uicore.image.NetworkImageDecoder"
    f = "NetworkImageDecoder.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x1c,
        0x21
    }
    m = "decode"
    n = {
        "this",
        "url",
        "$this$decode_u24lambda_u240",
        "width",
        "height"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "I$0",
        "I$1"
    }
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/stripe/android/uicore/image/NetworkImageDecoder;


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/image/NetworkImageDecoder;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/image/NetworkImageDecoder;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->this$0:Lcom/stripe/android/uicore/image/NetworkImageDecoder;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->label:I

    iget-object p1, p0, Lcom/stripe/android/uicore/image/NetworkImageDecoder$decode$1;->this$0:Lcom/stripe/android/uicore/image/NetworkImageDecoder;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v1, p0}, Lcom/stripe/android/uicore/image/NetworkImageDecoder;->decode(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
