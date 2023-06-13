.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0014R\u001b\u0010\r\u001a\u00020\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "Landroid/os/Bundle;",
        "result",
        "",
        "handleResult",
        "savedInstanceState",
        "onCreate",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;",
        "args$delegate",
        "Lkotlin/Lazy;",
        "getArgs",
        "()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;",
        "args",
        "Lwy1;",
        "listener",
        "Lwy1;",
        "<init>",
        "()V",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final args$delegate:Lkotlin/Lazy;

.field private final listener:Lwy1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity$args$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity$args$2;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->args$delegate:Lkotlin/Lazy;

    new-instance v0, LzX3;

    invoke-direct {v0, p0}, LzX3;-><init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;)V

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->listener:Lwy1;

    return-void
.end method

.method private final getArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->args$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;

    return-object v0
.end method

.method private final handleResult(Landroid/os/Bundle;)V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    sget p1, Lcom/stripe/android/paymentsheet/R$anim;->slide_down:I

    invoke-virtual {p0, v1, p1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method private static final listener$lambda$0(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "result"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->handleResult(Landroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic v(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->listener$lambda$0(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-string v1, "KEY_FRAGMENT_RESULT_PollingFragment"

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->listener:Lwy1;

    invoke-virtual {v0, v1, p0, v2}, Landroidx/fragment/app/FragmentManager;->B1(Ljava/lang/String;LLifecycleOwner;Lwy1;)V

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->getArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;->getStatusBarColor()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    :cond_0
    if-nez p1, :cond_1

    sget-object p1, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;->Companion:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$Companion;

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingActivity;->getArgs()Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment$Companion;->newInstance(Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;)Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingFragment;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/c;->setCancelable(Z)V

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getTag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/c;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    :cond_1
    return-void
.end method
