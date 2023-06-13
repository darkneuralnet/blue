.class public final Lco/bird/android/feature/destination/rider/DestinationSearchActivity$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/destination/rider/DestinationSearchActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/location/Address;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "address",
        "Landroid/location/Address;",
        "kotlin.jvm.PlatformType",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/destination/rider/DestinationSearchActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/destination/rider/DestinationSearchActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/destination/rider/DestinationSearchActivity$h;->g:Lco/bird/android/feature/destination/rider/DestinationSearchActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/location/Address;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/destination/rider/DestinationSearchActivity$h;->invoke(Landroid/location/Address;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/location/Address;)V
    .locals 3

    iget-object v0, p0, Lco/bird/android/feature/destination/rider/DestinationSearchActivity$h;->g:Lco/bird/android/feature/destination/rider/DestinationSearchActivity;

    invoke-static {v0}, Lco/bird/android/feature/destination/rider/DestinationSearchActivity;->access$getLogger(Lco/bird/android/feature/destination/rider/DestinationSearchActivity;)Lg46$b;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Closing with a successful result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lg46$b;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/feature/destination/rider/DestinationSearchActivity$h;->g:Lco/bird/android/feature/destination/rider/DestinationSearchActivity;

    invoke-static {v0}, Lco/bird/android/feature/destination/rider/DestinationSearchActivity;->access$hideKeyboard(Lco/bird/android/feature/destination/rider/DestinationSearchActivity;)V

    iget-object v0, p0, Lco/bird/android/feature/destination/rider/DestinationSearchActivity$h;->g:Lco/bird/android/feature/destination/rider/DestinationSearchActivity;

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "null cannot be cast to non-null type android.os.Parcelable"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "key_address"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    const/4 v1, -0x1

    invoke-virtual {v0, v1, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    iget-object p1, p0, Lco/bird/android/feature/destination/rider/DestinationSearchActivity$h;->g:Lco/bird/android/feature/destination/rider/DestinationSearchActivity;

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->supportFinishAfterTransition()V

    return-void
.end method
