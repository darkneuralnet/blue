.class final Lcom/stripe/android/link/LinkActivity$onCreate$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/LinkActivity$onCreate$1;->invoke(LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lm51;",
        "Ll51;",
        ">;"
    }
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLinkActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkActivity.kt\ncom/stripe/android/link/LinkActivity$onCreate$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,276:1\n62#2,5:277\n*S KotlinDebug\n*F\n+ 1 LinkActivity.kt\ncom/stripe/android/link/LinkActivity$onCreate$1$1\n*L\n87#1:277,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $coroutineScope:LZC0;

.field final synthetic $sheetState:LGU2;


# direct methods
.method public constructor <init>(LZC0;LGU2;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$1;->$coroutineScope:LZC0;

    iput-object p2, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$1;->$sheetState:LGU2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm51;

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/LinkActivity$onCreate$1$1;->invoke(Lm51;)Ll51;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm51;)Ll51;
    .locals 7

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$1;->$coroutineScope:LZC0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/stripe/android/link/LinkActivity$onCreate$1$1$1;

    iget-object p1, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$1;->$sheetState:LGU2;

    const/4 v0, 0x0

    invoke-direct {v4, p1, v0}, Lcom/stripe/android/link/LinkActivity$onCreate$1$1$1;-><init>(LGU2;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    iget-object p1, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$1;->$coroutineScope:LZC0;

    iget-object v0, p0, Lcom/stripe/android/link/LinkActivity$onCreate$1$1;->$sheetState:LGU2;

    new-instance v1, Lcom/stripe/android/link/LinkActivity$onCreate$1$1$invoke$$inlined$onDispose$1;

    invoke-direct {v1, p1, v0}, Lcom/stripe/android/link/LinkActivity$onCreate$1$1$invoke$$inlined$onDispose$1;-><init>(LZC0;LGU2;)V

    return-object v1
.end method
