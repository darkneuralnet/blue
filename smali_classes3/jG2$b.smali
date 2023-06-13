.class public final LjG2$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LjG2;->a(Landroid/content/Intent;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/os/Bundle;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Landroid/os/Bundle;",
        "kotlin.jvm.PlatformType",
        "extras",
        "",
        "a",
        "(Landroid/os/Bundle;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LjG2;


# direct methods
.method public constructor <init>(LjG2;)V
    .locals 0

    iput-object p1, p0, LjG2$b;->g:LjG2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "co.bird.android.force_map_mode"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    const/4 v0, 0x0

    if-ltz p1, :cond_0

    invoke-static {}, Lco/bird/android/model/constant/MapMode;->values()[Lco/bird/android/model/constant/MapMode;

    move-result-object v1

    array-length v1, v1

    if-ge p1, v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    if-eqz v0, :cond_1

    invoke-static {}, Lco/bird/android/model/constant/MapMode;->values()[Lco/bird/android/model/constant/MapMode;

    move-result-object v0

    aget-object p1, v0, p1

    iget-object v0, p0, LjG2$b;->g:LjG2;

    invoke-static {v0}, LjG2;->access$getPreference$p(LjG2;)Lgl;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgl;->z(Lco/bird/android/model/constant/MapMode;)V

    iget-object v0, p0, LjG2$b;->g:LjG2;

    invoke-static {v0}, LjG2;->access$getPreference$p(LjG2;)Lgl;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/constant/MapMode;->toDefaultUserRole()Lco/bird/android/model/constant/UserRole;

    move-result-object p1

    invoke-static {p1}, Lco/bird/android/model/UserRoleItemKt;->toUserRoleItem(Lco/bird/android/model/constant/UserRole;)Lco/bird/android/model/UserRoleItem;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgl;->F2(Lco/bird/android/model/UserRoleItem;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {p0, p1}, LjG2$b;->a(Landroid/os/Bundle;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
