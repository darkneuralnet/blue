.class public final Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/stripe3ds2/utils/Factory0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory$ChallengeSubmitDialog;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/stripe/android/stripe3ds2/utils/Factory0<",
        "Landroid/app/Dialog;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0008\u0010\u0008\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;",
        "Lcom/stripe/android/stripe3ds2/utils/Factory0;",
        "Landroid/app/Dialog;",
        "context",
        "Landroid/content/Context;",
        "uiCustomization",
        "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;",
        "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;)V",
        "create",
        "ChallengeSubmitDialog",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final context:Landroid/content/Context;

.field private final uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiCustomization"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;

    return-void
.end method


# virtual methods
.method public create()Landroid/app/Dialog;
    .locals 3

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory$ChallengeSubmitDialog;

    iget-object v1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;->uiCustomization:Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory$ChallengeSubmitDialog;-><init>(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;)V

    return-object v0
.end method

.method public bridge synthetic create()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;->create()Landroid/app/Dialog;

    move-result-object v0

    return-object v0
.end method
