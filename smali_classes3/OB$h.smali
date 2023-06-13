.class public final LOB$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOB;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/UserRoleItem;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/UserRoleItem;",
        "kotlin.jvm.PlatformType",
        "selectedUserRoleItem",
        "",
        "a",
        "(Lco/bird/android/model/UserRoleItem;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LOB;


# direct methods
.method public constructor <init>(LOB;)V
    .locals 0

    iput-object p1, p0, LOB$h;->g:LOB;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/UserRoleItem;)V
    .locals 3

    invoke-virtual {p1}, Lco/bird/android/model/UserRoleItem;->getUserRole()Lco/bird/android/model/constant/UserRole;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/UserRole;->OPERATOR:Lco/bird/android/model/constant/UserRole;

    const-string v2, "selectedUserRoleItem"

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LOB$h;->g:LOB;

    invoke-static {v0}, LOB;->access$getPreference$p(LOB;)Lgl;

    move-result-object v0

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lgl;->E2(Lco/bird/android/model/UserRoleItem;)V

    :cond_0
    iget-object v0, p0, LOB$h;->g:LOB;

    invoke-static {v0}, LOB;->access$getPreference$p(LOB;)Lgl;

    move-result-object v0

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lgl;->F2(Lco/bird/android/model/UserRoleItem;)V

    iget-object v0, p0, LOB$h;->g:LOB;

    invoke-virtual {p1}, Lco/bird/android/model/UserRoleItem;->getUserRole()Lco/bird/android/model/constant/UserRole;

    move-result-object p1

    invoke-static {v0, p1}, LOB;->access$navigateToRole(LOB;Lco/bird/android/model/constant/UserRole;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LOB$h;->g:LOB;

    invoke-static {p1}, LOB;->access$getUi$p(LOB;)LZ03;

    move-result-object p1

    sget v0, Lnl4;->navigation_drawer_switching_role:I

    invoke-interface {p1, v0}, LaM5;->success(I)V

    :cond_1
    iget-object p1, p0, LOB$h;->g:LOB;

    invoke-static {p1}, LOB;->access$getAppContextStream$p(LOB;)LOi;

    move-result-object p1

    if-eqz p1, :cond_2

    sget-object v0, Lct3;->b:Lct3;

    invoke-interface {p1, v0}, LOi;->a(LNi;)V

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/UserRoleItem;

    invoke-virtual {p0, p1}, LOB$h;->a(Lco/bird/android/model/UserRoleItem;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
