.class public final Lcom/stripe/android/view/AuthActivityStarterHost$ActivityHost;
.super Lcom/stripe/android/view/AuthActivityStarterHost;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/AuthActivityStarterHost;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ActivityHost"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J$\u0010\t\u001a\u00020\u00082\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/view/AuthActivityStarterHost$ActivityHost;",
        "Lcom/stripe/android/view/AuthActivityStarterHost;",
        "Ljava/lang/Class;",
        "target",
        "Landroid/os/Bundle;",
        "extras",
        "",
        "requestCode",
        "",
        "startActivityForResult",
        "Landroidx/activity/ComponentActivity;",
        "activity",
        "Landroidx/activity/ComponentActivity;",
        "getActivity",
        "()Landroidx/activity/ComponentActivity;",
        "statusBarColor",
        "Ljava/lang/Integer;",
        "getStatusBarColor",
        "()Ljava/lang/Integer;",
        "LLifecycleOwner;",
        "lifecycleOwner",
        "LLifecycleOwner;",
        "getLifecycleOwner",
        "()LLifecycleOwner;",
        "<init>",
        "(Landroidx/activity/ComponentActivity;Ljava/lang/Integer;)V",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final activity:Landroidx/activity/ComponentActivity;

.field private final lifecycleOwner:LLifecycleOwner;

.field private final statusBarColor:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Landroidx/activity/ComponentActivity;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/view/AuthActivityStarterHost;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/stripe/android/view/AuthActivityStarterHost$ActivityHost;->activity:Landroidx/activity/ComponentActivity;

    iput-object p2, p0, Lcom/stripe/android/view/AuthActivityStarterHost$ActivityHost;->statusBarColor:Ljava/lang/Integer;

    iput-object p1, p0, Lcom/stripe/android/view/AuthActivityStarterHost$ActivityHost;->lifecycleOwner:LLifecycleOwner;

    return-void
.end method


# virtual methods
.method public final getActivity()Landroidx/activity/ComponentActivity;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/AuthActivityStarterHost$ActivityHost;->activity:Landroidx/activity/ComponentActivity;

    return-object v0
.end method

.method public getLifecycleOwner()LLifecycleOwner;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/AuthActivityStarterHost$ActivityHost;->lifecycleOwner:LLifecycleOwner;

    return-object v0
.end method

.method public getStatusBarColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/AuthActivityStarterHost$ActivityHost;->statusBarColor:Ljava/lang/Integer;

    return-object v0
.end method

.method public startActivityForResult(Ljava/lang/Class;Landroid/os/Bundle;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Landroid/os/Bundle;",
            "I)V"
        }
    .end annotation

    const-string v0, "target"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/stripe/android/view/AuthActivityStarterHost$ActivityHost;->activity:Landroidx/activity/ComponentActivity;

    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "Intent(activity, target).putExtras(extras)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/view/AuthActivityStarterHost$ActivityHost;->activity:Landroidx/activity/ComponentActivity;

    invoke-virtual {p2, p1, p3}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method
