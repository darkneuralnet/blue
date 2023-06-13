.class public final Leo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Leo$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a8\u0006\u0005"
    }
    d2 = {
        "Lgl;",
        "Lco/bird/android/model/constant/MapMode;",
        "mode",
        "",
        "a",
        "co.bird.android.repository.area"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lgl;Lco/bird/android/model/constant/MapMode;)Ljava/lang/String;
    .locals 2

    sget-object v0, Leo$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lgl;->s0()Lco/bird/android/model/UserRoleItem;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/android/model/UserRoleItem;->getUserRoleCode()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final synthetic access$role(Lgl;Lco/bird/android/model/constant/MapMode;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Leo;->a(Lgl;Lco/bird/android/model/constant/MapMode;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
