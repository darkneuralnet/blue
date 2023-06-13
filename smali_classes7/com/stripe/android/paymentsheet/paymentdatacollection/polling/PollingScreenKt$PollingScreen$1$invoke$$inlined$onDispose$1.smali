.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1$invoke$$inlined$onDispose$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll51;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1;->invoke(Lm51;)Ll51;
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
        "com/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1$invoke$$inlined$onDispose$1",
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
        "SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 PollingScreen.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1\n*L\n1#1,484:1\n61#2,2:485\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $lifecycleOwner$inlined:LLifecycleOwner;

.field final synthetic $observer$inlined:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingLifecycleObserver;


# direct methods
.method public constructor <init>(LLifecycleOwner;Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingLifecycleObserver;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1$invoke$$inlined$onDispose$1;->$lifecycleOwner$inlined:LLifecycleOwner;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1$invoke$$inlined$onDispose$1;->$observer$inlined:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingLifecycleObserver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1$invoke$$inlined$onDispose$1;->$lifecycleOwner$inlined:LLifecycleOwner;

    invoke-interface {v0}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingScreenKt$PollingScreen$1$invoke$$inlined$onDispose$1;->$observer$inlined:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingLifecycleObserver;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/f;->d(LFq2;)V

    return-void
.end method
