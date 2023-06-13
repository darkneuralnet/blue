.class public final Leq0$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leq0;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/LocationSelectionModel;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/LocationSelectionModel;",
        "kotlin.jvm.PlatformType",
        "model",
        "",
        "a",
        "(Lco/bird/android/model/LocationSelectionModel;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Leq0;


# direct methods
.method public constructor <init>(Leq0;)V
    .locals 0

    iput-object p1, p0, Leq0$b;->g:Leq0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/LocationSelectionModel;)V
    .locals 8

    iget-object v0, p0, Leq0$b;->g:Leq0;

    invoke-static {v0}, Leq0;->access$getType$p(Leq0;)Lco/bird/android/model/ComplaintType;

    move-result-object v0

    const/4 v1, -0x1

    const-string v2, "location"

    const-string v3, "address"

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Leq0$b;->g:Leq0;

    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1}, Lco/bird/android/model/LocationSelectionModel;->getAddress()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v3, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1}, Lco/bird/android/model/LocationSelectionModel;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v6

    invoke-virtual {v5, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-static {v0}, Leq0;->access$getActivity$p(Leq0;)Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    invoke-virtual {v0, v1, v5}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    move-object v0, v4

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Leq0$b;->g:Leq0;

    invoke-static {v0}, Leq0;->access$getEventStream$p(Leq0;)LVq4;

    move-result-object v0

    new-instance v5, Lco/bird/android/model/LocationSelectionModel;

    invoke-virtual {p1}, Lco/bird/android/model/LocationSelectionModel;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v6

    invoke-virtual {p1}, Lco/bird/android/model/LocationSelectionModel;->getAddress()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Lco/bird/android/model/LocationSelectionModel;-><init>(Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;)V

    invoke-interface {v0, v5}, LVq4;->b(Lco/bird/android/model/LocationSelectionModel;)V

    :cond_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Leq0$b;->g:Leq0;

    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1}, Lco/bird/android/model/LocationSelectionModel;->getAddress()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1}, Lco/bird/android/model/LocationSelectionModel;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object p1

    invoke-virtual {v4, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-static {v0}, Leq0;->access$getNavigator$p(Leq0;)Le13;

    move-result-object p1

    invoke-interface {p1, v1, v4}, Le13;->e4(ILandroid/content/Intent;)V

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_2
    if-nez v4, :cond_3

    iget-object p1, p0, Leq0$b;->g:Leq0;

    invoke-static {p1}, Leq0;->access$getNavigator$p(Leq0;)Le13;

    move-result-object p1

    invoke-interface {p1}, Le13;->close()V

    :cond_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/LocationSelectionModel;

    invoke-virtual {p0, p1}, Leq0$b;->a(Lco/bird/android/model/LocationSelectionModel;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
