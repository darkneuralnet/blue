.class public final LQL1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u00a8\u0006\u0006"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireHibernationSessionVehicle;",
        "Lco/bird/android/model/persistence/HibernationSessionVehicle;",
        "a",
        "Lco/bird/android/model/wire/WireHibernationMessage;",
        "Lco/bird/android/model/persistence/nestedstructures/HibernationMessage;",
        "b",
        "co.bird.android.repository.hibernation"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/android/model/wire/WireHibernationSessionVehicle;)Lco/bird/android/model/persistence/HibernationSessionVehicle;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/HibernationSessionVehicle;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireHibernationSessionVehicle;->getBirdId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireHibernationSessionVehicle;->getCategory()Lco/bird/android/model/constant/VehicleHibernationCategory;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireHibernationSessionVehicle;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireHibernationSessionVehicle;->getRetryMessage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireHibernationSessionVehicle;->getInfoMessage()Lco/bird/android/model/wire/WireHibernationMessage;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, LQL1;->b(Lco/bird/android/model/wire/WireHibernationMessage;)Lco/bird/android/model/persistence/nestedstructures/HibernationMessage;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    move-object v6, p0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/persistence/HibernationSessionVehicle;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/VehicleHibernationCategory;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/HibernationMessage;)V

    return-object v0
.end method

.method public static final b(Lco/bird/android/model/wire/WireHibernationMessage;)Lco/bird/android/model/persistence/nestedstructures/HibernationMessage;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/persistence/nestedstructures/HibernationMessage;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireHibernationMessage;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireHibernationMessage;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireHibernationMessage;->getUrl()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lco/bird/android/model/persistence/nestedstructures/HibernationMessage;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
