.class public final Lco/bird/android/model/itemlease/ItemLeaseValidationKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001\u00a8\u0006\u0004"
    }
    d2 = {
        "toItemLeaseValidation",
        "Lco/bird/android/model/itemlease/ItemLeaseValidation;",
        "Lco/bird/android/model/wire/WireLeaseValidationObjectResponse;",
        "toWire",
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
.method public static final toItemLeaseValidation(Lco/bird/android/model/wire/WireLeaseValidationObjectResponse;)Lco/bird/android/model/itemlease/ItemLeaseValidation;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/itemlease/ItemLeaseValidation;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLeaseValidationObjectResponse;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLeaseValidationObjectResponse;->getLeaseId()Ljava/lang/String;

    move-result-object v3

    sget-object v1, Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;->Companion:Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType$Companion;

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLeaseValidationObjectResponse;->getValidationType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType$Companion;->fromWire(Ljava/lang/String;)Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLeaseValidationObjectResponse;->getValidatorId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    move-object v5, v1

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLeaseValidationObjectResponse;->getCreatedAt()Lorg/joda/time/DateTime;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/wire/WireLeaseValidationObjectResponse;->getResult()Z

    move-result v7

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/itemlease/ItemLeaseValidation;-><init>(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;Ljava/lang/String;Lorg/joda/time/DateTime;Z)V

    return-object v0
.end method

.method public static final toWire(Lco/bird/android/model/itemlease/ItemLeaseValidation;)Lco/bird/android/model/wire/WireLeaseValidationObjectResponse;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireLeaseValidationObjectResponse;

    invoke-virtual {p0}, Lco/bird/android/model/itemlease/ItemLeaseValidation;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lco/bird/android/model/itemlease/ItemLeaseValidation;->getLeaseId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lco/bird/android/model/itemlease/ItemLeaseValidation;->getValidationType()Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/itemlease/enum/ItemLeaseValidationType;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lco/bird/android/model/itemlease/ItemLeaseValidation;->getValidatorId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lco/bird/android/model/itemlease/ItemLeaseValidation;->getCreatedAt()Lorg/joda/time/DateTime;

    move-result-object v6

    invoke-virtual {p0}, Lco/bird/android/model/itemlease/ItemLeaseValidation;->getResult()Z

    move-result v7

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lco/bird/android/model/wire/WireLeaseValidationObjectResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Z)V

    return-object v0
.end method
