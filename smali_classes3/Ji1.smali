.class public final LJi1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJi1$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\n\u0010\u0008\u001a\u00020\u0003*\u00020\u0000\u001a\u001a\u0010\u000f\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c\u001a\u001e\u0010\u0016\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u001a\u001e\u0010\u0017\u001a\u00020\u0015*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u001a\n\u0010\u001a\u001a\u00020\u0019*\u00020\u0018\u001a\n\u0010\u001b\u001a\u00020\u0005*\u00020\u0015\u00a8\u0006\u001d\u00b2\u0006\u000c\u0010\u001c\u001a\u00020\u00198\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationDocumentType;",
        "Landroid/content/Context;",
        "context",
        "",
        "d",
        "",
        "e",
        "(Lco/bird/android/model/identification/IdentificationDocumentType;)Ljava/lang/Integer;",
        "b",
        "Lco/bird/android/model/User;",
        "Lgl;",
        "appPreference",
        "LOh;",
        "appBuildConfig",
        "",
        "c",
        "LUS1$c;",
        "Lco/bird/android/model/identification/IdentificationDocumentDescriptor;",
        "descriptor",
        "Lco/bird/android/model/wire/configs/IdentificationConfig;",
        "identificationConfig",
        "Lco/bird/android/model/RequirementsResult;",
        "f",
        "g",
        "Landroid/graphics/Rect;",
        "",
        "a",
        "i",
        "inverseDetectedRatio",
        "co.bird.android.feature.identification"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\nco/bird/android/feature/identification/ExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,179:1\n1#2:180\n1789#3,2:181\n1789#3,3:183\n1791#3:186\n1477#3:187\n1502#3,3:188\n1505#3,3:198\n1855#3,2:201\n1747#3,3:203\n361#4,7:191\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\nco/bird/android/feature/identification/ExtensionsKt\n*L\n140#1:181,2\n142#1:183,3\n140#1:186\n149#1:187\n149#1:188,3\n149#1:198,3\n153#1:201,2\n159#1:203,3\n149#1:191,7\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(Landroid/graphics/Rect;)D
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-double v0, v0

    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    move-result p0

    int-to-double v2, p0

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public static final b(Lco/bird/android/model/identification/IdentificationDocumentType;)Ljava/lang/String;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "_"

    const-string v3, " "

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    const-string v0, "this as java.lang.String).toLowerCase()"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/text/StringsKt;->capitalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lco/bird/android/model/User;Lgl;LOh;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appPreference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appBuildConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lgl;->O()Luf1;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/model/User;->getAdmin()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lco/bird/android/model/UserKt;->isAdminDomain(Lco/bird/android/model/User;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-nez v0, :cond_2

    invoke-virtual {p0}, Lco/bird/android/model/User;->getTester()Z

    move-result p0

    if-nez p0, :cond_2

    invoke-interface {p2}, LOh;->k()Z

    move-result p0

    if-nez p0, :cond_2

    sget-object p0, Luf1;->k:Luf1;

    if-eq p1, p0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :cond_2
    :goto_1
    return v1
.end method

.method public static final d(Lco/bird/android/model/identification/IdentificationDocumentType;Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LJi1;->e(Lco/bird/android/model/identification/IdentificationDocumentType;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    invoke-static {p0}, LJi1;->b(Lco/bird/android/model/identification/IdentificationDocumentType;)Ljava/lang/String;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public static final e(Lco/bird/android/model/identification/IdentificationDocumentType;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LJi1$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    goto :goto_0

    :pswitch_0
    sget p0, Lnl4;->identification_document_type_unknown:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :pswitch_1
    sget p0, Lnl4;->identification_document_type_emirates_id:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :pswitch_2
    sget p0, Lnl4;->identification_document_type_legacy:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :pswitch_3
    sget p0, Lnl4;->identification_document_type_residence_card:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :pswitch_4
    sget p0, Lnl4;->identification_document_type_visa:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :pswitch_5
    sget p0, Lnl4;->identification_document_type_passport:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :pswitch_6
    sget p0, Lnl4;->identification_document_type_provisional_driver_license:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :pswitch_7
    sget p0, Lnl4;->identification_document_type_driver_license:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :pswitch_8
    sget p0, Lnl4;->identification_document_type_id_card:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    :goto_0
    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final f(LUS1$c;Lco/bird/android/model/identification/IdentificationDocumentDescriptor;Lco/bird/android/model/wire/configs/IdentificationConfig;)Lco/bird/android/model/RequirementsResult;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->Companion:Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion;->toStrategy(Lco/bird/android/model/identification/IdentificationDocumentDescriptor;Lco/bird/android/model/wire/configs/IdentificationConfig;)Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    move-result-object p2

    if-eqz p2, :cond_9

    invoke-virtual {p2}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->getDetectionParameters()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->getEnableManualImageHeuristics()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getEntryMethodType()Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    move-result-object v0

    sget-object v3, Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;->FRONT_SCAN:Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    if-eq v0, v3, :cond_0

    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getEntryMethodType()Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    move-result-object v0

    sget-object v3, Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;->SELFIE_PHOTO:Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    if-ne v0, v3, :cond_1

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    const/4 v3, 0x0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move-object p2, v3

    :goto_1
    if-eqz p2, :cond_9

    invoke-virtual {p2}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->getDetectionParameters()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object p2

    invoke-virtual {p2}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->getMinLandmarkWidthRatio()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getEntryMethodType()Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    move-result-object v4

    sget-object v5, Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;->FRONT_SCAN:Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    if-ne v4, v5, :cond_3

    move v4, v1

    goto :goto_2

    :cond_3
    move v4, v2

    :goto_2
    if-eqz v4, :cond_4

    goto :goto_3

    :cond_4
    move-object v0, v3

    :goto_3
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    invoke-virtual {p0}, LUS1$c;->d()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    float-to-double v6, v0

    cmpl-double v0, v6, v4

    if-ltz v0, :cond_5

    move v0, v1

    goto :goto_4

    :cond_5
    move v0, v2

    :goto_4
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_5

    :cond_6
    move-object v0, v3

    :goto_5
    invoke-virtual {p2}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->getFaceRequired()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getEntryMethodType()Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    move-result-object p1

    sget-object p2, Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;->SELFIE_PHOTO:Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    if-ne p1, p2, :cond_8

    invoke-virtual {p0}, LUS1$c;->b()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_7

    goto :goto_6

    :cond_7
    move v1, v2

    :goto_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    goto :goto_7

    :cond_8
    move-object p0, v3

    :goto_7
    new-instance p1, Lco/bird/android/model/RequirementsResult;

    invoke-direct {p1, v3, v0, p0, v3}, Lco/bird/android/model/RequirementsResult;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object p1

    :cond_9
    new-instance p0, Lco/bird/android/model/RequirementsResult;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xf

    const/4 v10, 0x0

    move-object v4, p0

    invoke-direct/range {v4 .. v10}, Lco/bird/android/model/RequirementsResult;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method public static final g(LUS1$c;Lco/bird/android/model/identification/IdentificationDocumentDescriptor;Lco/bird/android/model/wire/configs/IdentificationConfig;)Lco/bird/android/model/RequirementsResult;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->Companion:Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion;

    invoke-virtual {v0, p1, p2}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion;->toStrategy(Lco/bird/android/model/identification/IdentificationDocumentDescriptor;Lco/bird/android/model/wire/configs/IdentificationConfig;)Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p0, Lco/bird/android/model/RequirementsResult;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lco/bird/android/model/RequirementsResult;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->getEnableAutoDetect()Z

    move-result p2

    if-nez p2, :cond_1

    new-instance p0, Lco/bird/android/model/RequirementsResult;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lco/bird/android/model/RequirementsResult;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_1
    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->getDetectionParameters()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->getAspectRatio()Ljava/lang/Double;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v3

    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->getAspectRatioTolerancePercent()Ljava/lang/Double;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    goto :goto_0

    :cond_2
    const-wide/16 v5, 0x0

    :goto_0
    int-to-double v7, v1

    sub-double v9, v7, v5

    mul-double/2addr v9, v3

    add-double/2addr v7, v5

    mul-double/2addr v3, v7

    invoke-virtual {p0}, LUS1$c;->e()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LU11;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, LU11;->a()Landroid/graphics/Rect;

    move-result-object p2

    if-eqz p2, :cond_4

    const-string v5, "boundingBox"

    invoke-static {p2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, LJi1;->a(Landroid/graphics/Rect;)D

    move-result-wide v5

    new-instance p2, LJi1$a;

    invoke-direct {p2, v5, v6}, LJi1$a;-><init>(D)V

    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p2

    invoke-static {v9, v10, v3, v4}, Lkotlin/ranges/RangesKt;->rangeTo(DD)Lkotlin/ranges/ClosedFloatingPointRange;

    move-result-object v7

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-interface {v7, v5}, Lkotlin/ranges/ClosedFloatingPointRange;->contains(Ljava/lang/Comparable;)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-static {v9, v10, v3, v4}, Lkotlin/ranges/RangesKt;->rangeTo(DD)Lkotlin/ranges/ClosedFloatingPointRange;

    move-result-object v3

    invoke-static {p2}, LJi1;->h(Lkotlin/Lazy;)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-interface {v3, p2}, Lkotlin/ranges/ClosedFloatingPointRange;->contains(Ljava/lang/Comparable;)Z

    move-result p2

    if-eqz p2, :cond_4

    :cond_3
    move p2, v1

    goto :goto_1

    :cond_4
    move p2, v2

    :goto_1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    goto :goto_2

    :cond_5
    move-object p2, v0

    :goto_2
    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->getMinLandmarkWidthRatio()Ljava/lang/Double;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v3

    invoke-virtual {p0}, LUS1$c;->d()Ljava/lang/Float;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    float-to-double v5, v5

    cmpl-double v3, v5, v3

    if-ltz v3, :cond_6

    move v3, v1

    goto :goto_3

    :cond_6
    move v3, v2

    :goto_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_4

    :cond_7
    move-object v3, v0

    :goto_4
    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->getFaceRequired()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual {p0}, LUS1$c;->b()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    xor-int/2addr v4, v1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    goto :goto_5

    :cond_8
    move-object v4, v0

    :goto_5
    invoke-virtual {p1}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->getStringRequirements()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1a

    move-object v5, p1

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    xor-int/2addr v5, v1

    if-eqz v5, :cond_9

    goto :goto_6

    :cond_9
    move-object p1, v0

    :goto_6
    if-eqz p1, :cond_1a

    invoke-virtual {p0}, LUS1$c;->f()Lp06;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lp06;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    const-string v5, "text"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/2addr v0, v1

    if-ne v0, v1, :cond_a

    move v0, v1

    goto :goto_7

    :cond_a
    move v0, v2

    :goto_7
    if-nez v0, :cond_c

    :cond_b
    :goto_8
    move v1, v2

    goto/16 :goto_f

    :cond_c
    invoke-virtual {p0}, LUS1$c;->f()Lp06;

    move-result-object p0

    if-eqz p0, :cond_f

    invoke-virtual {p0}, Lp06;->b()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_f

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp06$e;

    invoke-virtual {v5}, Lp06$e;->d()Ljava/util/List;

    move-result-object v5

    const-string v6, "item.lines"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/LinkedHashSet;

    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lp06$b;

    invoke-virtual {v7}, Lp06$b;->d()Ljava/lang/String;

    move-result-object v7

    const-string v8, "line.text"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v6, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_d
    invoke-interface {v0, v6}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_9

    :cond_e
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    if-nez p0, :cond_10

    :cond_f
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p0

    :cond_10
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_12

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;

    invoke-virtual {v6}, Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;->getMustBeSatisfied()Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_11

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_11
    check-cast v7, Ljava/util/List;

    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_12
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz p1, :cond_14

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_13
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;

    invoke-virtual {v5, p0}, Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;->isSatisfiedBy(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v5

    if-nez v5, :cond_13

    goto/16 :goto_8

    :cond_14
    if-eqz v0, :cond_19

    check-cast v0, Ljava/lang/Iterable;

    instance-of p1, v0, Ljava/util/Collection;

    if-eqz p1, :cond_16

    move-object p1, v0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_16

    :cond_15
    move p0, v2

    goto :goto_d

    :cond_16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_17
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;

    invoke-virtual {v0, p0}, Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;->isSatisfiedBy(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_18

    move v0, v1

    goto :goto_c

    :cond_18
    move v0, v2

    :goto_c
    if-eqz v0, :cond_17

    move p0, v1

    :goto_d
    if-ne p0, v1, :cond_19

    move p0, v1

    goto :goto_e

    :cond_19
    move p0, v2

    :goto_e
    if-nez p0, :cond_b

    :goto_f
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_1a
    new-instance p0, Lco/bird/android/model/RequirementsResult;

    invoke-direct {p0, p2, v3, v4, v0}, Lco/bird/android/model/RequirementsResult;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-object p0
.end method

.method public static final h(Lkotlin/Lazy;)D
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "Ljava/lang/Double;",
            ">;)D"
        }
    .end annotation

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public static final i(Lco/bird/android/model/RequirementsResult;)I
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/model/RequirementsResult;->getRectDetected()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget p0, Lnl4;->identification_scanning_not_found_rect:I

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/model/RequirementsResult;->getFaceDetected()Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget p0, Lnl4;->identification_scanning_not_found_face:I

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lco/bird/android/model/RequirementsResult;->getTextDetected()Ljava/lang/Boolean;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    sget p0, Lnl4;->identification_scanning_not_found_text:I

    goto :goto_0

    :cond_2
    sget p0, Lnl4;->identification_scanning_found_image_detected:I

    :goto_0
    return p0
.end method

.method public static synthetic satisfiesManualRequirements$default(LUS1$c;Lco/bird/android/model/identification/IdentificationDocumentDescriptor;Lco/bird/android/model/wire/configs/IdentificationConfig;ILjava/lang/Object;)Lco/bird/android/model/RequirementsResult;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, LJi1;->f(LUS1$c;Lco/bird/android/model/identification/IdentificationDocumentDescriptor;Lco/bird/android/model/wire/configs/IdentificationConfig;)Lco/bird/android/model/RequirementsResult;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic satisfiesRequirements$default(LUS1$c;Lco/bird/android/model/identification/IdentificationDocumentDescriptor;Lco/bird/android/model/wire/configs/IdentificationConfig;ILjava/lang/Object;)Lco/bird/android/model/RequirementsResult;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, LJi1;->g(LUS1$c;Lco/bird/android/model/identification/IdentificationDocumentDescriptor;Lco/bird/android/model/wire/configs/IdentificationConfig;)Lco/bird/android/model/RequirementsResult;

    move-result-object p0

    return-object p0
.end method
