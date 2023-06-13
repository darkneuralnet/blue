.class public final Lco/bird/android/model/PermissionStatusKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "toMetadataStr",
        "",
        "Lco/bird/android/model/PermissionStatus;",
        "permission",
        "Lco/bird/android/model/constant/Permission;",
        "model_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toMetadataStr(Lco/bird/android/model/PermissionStatus;Lco/bird/android/model/constant/Permission;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permission"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/model/PermissionStatus;->GRANTED:Lco/bird/android/model/PermissionStatus;

    if-ne p0, v0, :cond_1

    sget-object p0, Lco/bird/android/model/constant/Permission;->ACCESS_FINE_LOCATION:Lco/bird/android/model/constant/Permission;

    if-ne p1, p0, :cond_0

    const-string p0, "authorized_always"

    goto :goto_0

    :cond_0
    const-string p0, "authorized"

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/model/PermissionStatus;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method
