.class public final LOB$f;
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
        "Ljava/util/List<",
        "+",
        "Lco/bird/android/model/UserRoleItem;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0006"
    }
    d2 = {
        "<anonymous>",
        "",
        "userRoles",
        "",
        "Lco/bird/android/model/UserRoleItem;",
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
.field public final synthetic g:LOB;


# direct methods
.method public constructor <init>(LOB;)V
    .locals 0

    iput-object p1, p0, LOB$f;->g:LOB;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, LOB$f;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/UserRoleItem;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lco/bird/android/model/constant/UserRole;->MERCHANT:Lco/bird/android/model/constant/UserRole;

    iget-object v1, p0, LOB$f;->g:LOB;

    invoke-static {v1}, LOB;->access$getPreference$p(LOB;)Lgl;

    move-result-object v1

    invoke-virtual {v1}, Lgl;->z1()Lco/bird/android/model/UserRoleItem;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/UserRoleItem;->getUserRole()Lco/bird/android/model/constant/UserRole;

    move-result-object v1

    const-string v2, "userRoles"

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LOB$f;->g:LOB;

    invoke-static {v0}, LOB;->access$getMerchantManager$p(LOB;)LaS2;

    move-result-object v0

    invoke-interface {v0}, LaS2;->l()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    iget-object v0, p0, LOB$f;->g:LOB;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, LOB;->access$configureRoleDropdownSelector(LOB;Ljava/util/List;)V

    return-void

    :cond_0
    iget-object v0, p0, LOB$f;->g:LOB;

    invoke-static {v0}, LOB;->access$getReactiveConfig$p(LOB;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getEnableRolesDropDown()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, LOB;->m:LOB$a;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, LOB$a;->a(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LOB$f;->g:LOB;

    invoke-static {v0, p1}, LOB;->access$configureRoleDropdownSelector(LOB;Ljava/util/List;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LOB$f;->g:LOB;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, LOB;->access$configureRoleSwitch(LOB;Ljava/util/List;)V

    :goto_0
    return-void
.end method
