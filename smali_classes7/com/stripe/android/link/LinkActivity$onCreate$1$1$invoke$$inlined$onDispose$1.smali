.class public final Lcom/stripe/android/link/LinkActivity$onCreate$1$1$invoke$$inlined$onDispose$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll51;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/LinkActivity$onCreate$1$1;->invoke(Lm51;)Ll51;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "com/stripe/android/link/LinkActivity$onCreate$1$1$invoke$$inlined$onDispose$1",
        "Ll51;",
        "",
        "dispose",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 LinkActivity.kt\ncom/stripe/android/link/LinkActivity$onCreate$1$1\n*L\n1#1,484:1\n88#2,2:485\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $coroutineScope$inlined:LZC0;

.field final synthetic $sheetState$inlined:LGU2;


# direct methods
.method public constructor <init>(LZC0;LGU2;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$1$invoke$$inlined$onDispose$1;->$coroutineScope$inlined:LZC0;

    iput-object p2, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$1$invoke$$inlined$onDispose$1;->$sheetState$inlined:LGU2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$1$invoke$$inlined$onDispose$1;->$coroutineScope$inlined:LZC0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    new-instance v3, Lcom/stripe/android/link/LinkActivity$onCreate$1$1$2$1;

    iget-object v4, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$1$invoke$$inlined$onDispose$1;->$sheetState$inlined:LGU2;

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Lcom/stripe/android/link/LinkActivity$onCreate$1$1$2$1;-><init>(LGU2;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    invoke-static/range {v0 .. v5}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    return-void
.end method
