.class final Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt;->PollingScreen(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;LgV2;LEt0;II)V
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
        "SMAP\nPollingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollingScreen.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,261:1\n62#2,5:262\n*S KotlinDebug\n*F\n+ 1 PollingScreen.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1\n*L\n60#1:262,5\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $lifecycleOwner:LLifecycleOwner;

.field final synthetic $viewModel:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;LLifecycleOwner;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1;->$viewModel:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1;->$lifecycleOwner:LLifecycleOwner;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm51;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1;->invoke(Lm51;)Ll51;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm51;)Ll51;
    .locals 2

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingLifecycleObserver;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1;->$viewModel:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;

    invoke-direct {p1, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingLifecycleObserver;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingViewModel;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1;->$lifecycleOwner:LLifecycleOwner;

    invoke-interface {v0}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/lifecycle/f;->a(LFq2;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1;->$lifecycleOwner:LLifecycleOwner;

    new-instance v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1$invoke$$inlined$onDispose$1;

    invoke-direct {v1, v0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1$invoke$$inlined$onDispose$1;-><init>(LLifecycleOwner;Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingLifecycleObserver;)V

    return-object v1
.end method
