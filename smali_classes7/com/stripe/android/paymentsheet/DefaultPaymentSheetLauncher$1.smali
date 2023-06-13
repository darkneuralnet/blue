.class public final Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVX0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;-><init>(LB5;LLifecycleOwner;Landroid/app/Application;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$1",
        "LVX0;",
        "LLifecycleOwner;",
        "owner",
        "",
        "onDestroy",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onCreate(LLifecycleOwner;)V
    .locals 0

    invoke-super {p0, p1}, LVX0;->onCreate(LLifecycleOwner;)V

    return-void
.end method

.method public onDestroy(LLifecycleOwner;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/stripe/android/IntentConfirmationInterceptor;->Companion:Lcom/stripe/android/IntentConfirmationInterceptor$Companion;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/stripe/android/IntentConfirmationInterceptor$Companion;->setCreateIntentCallback(Lcom/stripe/android/AbsCreateIntentCallback;)V

    invoke-super {p0, p1}, LVX0;->onDestroy(LLifecycleOwner;)V

    return-void
.end method

.method public bridge synthetic onPause(LLifecycleOwner;)V
    .locals 0

    invoke-super {p0, p1}, LVX0;->onPause(LLifecycleOwner;)V

    return-void
.end method

.method public bridge synthetic onResume(LLifecycleOwner;)V
    .locals 0

    invoke-super {p0, p1}, LVX0;->onResume(LLifecycleOwner;)V

    return-void
.end method

.method public bridge synthetic onStart(LLifecycleOwner;)V
    .locals 0

    invoke-super {p0, p1}, LVX0;->onStart(LLifecycleOwner;)V

    return-void
.end method

.method public bridge synthetic onStop(LLifecycleOwner;)V
    .locals 0

    invoke-super {p0, p1}, LVX0;->onStop(LLifecycleOwner;)V

    return-void
.end method
