.class public final Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000c\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u0013J\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0016"
    }
    d2 = {
        "Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion;",
        "",
        "()V",
        "ASPECT_RATIO_TOLERANCE_PERCENTAGE",
        "",
        "BLUR_VARIANCE_TOLERANCE",
        "ISO_7810_ID_1_ASPECT_RATIO",
        "ISO_7810_ID_2_ASPECT_RATIO",
        "ISO_7810_ID_3_ASPECT_RATIO",
        "QUADRATURE_TOLERANCE_DEGREES",
        "STANDARD_DETECTION_PARAMETERS",
        "Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;",
        "STANDARD_MIN_SIZE",
        "STANDARD_SELFIE_DETECTION_PARAMETERS",
        "UNRESTRICTED_MANUAL_CAPTURE",
        "Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;",
        "getUNRESTRICTED_MANUAL_CAPTURE",
        "()Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;",
        "toStrategy",
        "Lco/bird/android/model/identification/IdentificationDocumentDescriptor;",
        "identificationConfig",
        "Lco/bird/android/model/wire/configs/IdentificationConfig;",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getUNRESTRICTED_MANUAL_CAPTURE()Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;
    .locals 1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getUNRESTRICTED_MANUAL_CAPTURE$cp()Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    move-result-object v0

    return-object v0
.end method

.method public final toStrategy(Lco/bird/android/model/identification/IdentificationDocumentDescriptor;)Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;
    .locals 33

    const-string v0, "<this>"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getEntryMethodType()Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    move-result-object v0

    sget-object v2, Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;->SELFIE_PHOTO:Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    if-eq v0, v2, :cond_30

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getEntryMethodType()Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    move-result-object v0

    sget-object v2, Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;->SELFIE_VIDEO:Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    if-ne v0, v2, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getEntryMethodType()Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    move-result-object v0

    sget-object v2, Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;->BACK_SCAN:Lco/bird/android/model/identification/IdentificationAcceptableMethod$EntryMethodType;

    const-string v3, "IT"

    const-string v4, "CH"

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-ne v0, v2, :cond_3

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getJurisdiction()Lco/bird/android/model/identification/IdentificationJurisdiction;

    move-result-object v0

    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    invoke-direct {v2, v4}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-ne v0, v5, :cond_2

    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v8, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1df

    const/16 v20, 0x0

    invoke-static/range {v9 .. v20}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->copy$default(Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;ZILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v9

    const/4 v11, 0x0

    const/16 v12, 0xc

    move-object v7, v6

    invoke-direct/range {v7 .. v13}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_1
    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    invoke-direct {v2, v3}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-ne v0, v5, :cond_2

    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v8, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1df

    const/16 v20, 0x0

    invoke-static/range {v9 .. v20}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->copy$default(Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;ZILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v9

    const/4 v11, 0x0

    const/16 v12, 0xc

    move-object v7, v6

    invoke-direct/range {v7 .. v13}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_2
    :goto_0
    return-object v6

    :cond_3
    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getJurisdiction()Lco/bird/android/model/identification/IdentificationJurisdiction;

    move-result-object v0

    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    const-string v7, "AT"

    invoke-direct {v2, v7}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v7, 0x2

    if-eqz v2, :cond_6

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v5, :cond_5

    if-eq v0, v7, :cond_4

    goto/16 :goto_1

    :cond_4
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v9, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/4 v14, 0x0

    move-object v8, v6

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_5
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/16 v16, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xc

    const/16 v21, 0x0

    move-object v15, v6

    invoke-direct/range {v15 .. v21}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_6
    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    const-string v8, "AU"

    invoke-direct {v2, v8}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v5, :cond_8

    if-eq v0, v7, :cond_7

    goto/16 :goto_1

    :cond_7
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v9, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/4 v14, 0x0

    move-object v8, v6

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_8
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/16 v16, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xc

    const/16 v21, 0x0

    move-object v15, v6

    invoke-direct/range {v15 .. v21}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_9
    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    const-string v8, "BE"

    invoke-direct {v2, v8}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v5, :cond_b

    if-eq v0, v7, :cond_a

    goto/16 :goto_1

    :cond_a
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v9, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/4 v14, 0x0

    move-object v8, v6

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_b
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/16 v16, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xc

    const/16 v21, 0x0

    move-object v15, v6

    invoke-direct/range {v15 .. v21}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_c
    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    const-string v8, "CA"

    invoke-direct {v2, v8}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v5, :cond_e

    if-eq v0, v7, :cond_d

    goto/16 :goto_1

    :cond_d
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v9, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/4 v14, 0x0

    move-object v8, v6

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_e
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/16 v16, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xc

    const/16 v21, 0x0

    move-object v15, v6

    invoke-direct/range {v15 .. v21}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_f
    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    invoke-direct {v2, v4}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-ne v0, v7, :cond_2f

    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v9, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/4 v14, 0x0

    move-object v8, v6

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_10
    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    invoke-direct {v2, v4}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-ne v0, v5, :cond_2f

    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v8, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xc

    const/4 v13, 0x0

    move-object v7, v6

    invoke-direct/range {v7 .. v13}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_11
    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    const-string v4, "DE"

    invoke-direct {v2, v4}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-wide v8, 0x3ff6b3e5753a3ec0L    # 1.41892

    if-eqz v2, :cond_14

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const-string v1, "Deutschland"

    if-eq v0, v5, :cond_13

    if-eq v0, v7, :cond_12

    goto/16 :goto_1

    :cond_12
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v11, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    new-instance v0, Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;

    const-string v20, "de"

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v21

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x1

    move-object/from16 v19, v0

    invoke-direct/range {v19 .. v24}, Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;-><init>(Ljava/lang/String;Ljava/util/Set;ZLjava/lang/Integer;Z)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v19

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1bf

    invoke-static/range {v12 .. v23}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->copy$default(Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;ZILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v12

    const/4 v14, 0x0

    const/16 v15, 0xc

    move-object v10, v6

    invoke-direct/range {v10 .. v16}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_13
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/16 v18, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v19

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v20

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    new-instance v0, Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;

    const-string v8, "de"

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x1

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;-><init>(Ljava/lang/String;Ljava/util/Set;ZLjava/lang/Integer;Z)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v26

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x1be

    const/16 v30, 0x0

    invoke-static/range {v19 .. v30}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->copy$default(Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;ZILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v19

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0xc

    move-object/from16 v17, v6

    invoke-direct/range {v17 .. v23}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_14
    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    const-string v4, "DK"

    invoke-direct {v2, v4}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-ne v0, v7, :cond_2f

    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v9, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/4 v14, 0x0

    move-object v8, v6

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_15
    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    const-string v4, "ES"

    invoke-direct {v2, v4}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v5, :cond_17

    if-eq v0, v7, :cond_16

    goto/16 :goto_1

    :cond_16
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v9, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/4 v14, 0x0

    move-object v8, v6

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_17
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/16 v16, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xc

    const/16 v21, 0x0

    move-object v15, v6

    invoke-direct/range {v15 .. v21}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_18
    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    const-string v4, "FI"

    invoke-direct {v2, v4}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-ne v0, v7, :cond_2f

    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v9, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/4 v14, 0x0

    move-object v8, v6

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_19
    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    sget-object v4, Ljava/util/Locale;->FRANCE:Ljava/util/Locale;

    invoke-virtual {v4}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4

    const-string v10, "FRANCE.country"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v4}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-wide v10, 0x3ff6ba29c779a6b5L    # 1.42045

    if-eqz v2, :cond_1a

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v13, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v14

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v15

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1fe

    const/16 v25, 0x0

    invoke-static/range {v14 .. v25}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->copy$default(Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;ZILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v14

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0xc

    move-object v12, v6

    invoke-direct/range {v12 .. v18}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :pswitch_1
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/16 v20, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v21

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v22

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x1fe

    const/16 v32, 0x0

    invoke-static/range {v21 .. v32}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->copy$default(Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;ZILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v21

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0xc

    move-object/from16 v19, v6

    invoke-direct/range {v19 .. v25}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :pswitch_2
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v8, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xc

    const/4 v13, 0x0

    move-object v7, v6

    invoke-direct/range {v7 .. v13}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :pswitch_3
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v15, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0xc

    const/16 v20, 0x0

    move-object v14, v6

    invoke-direct/range {v14 .. v20}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :pswitch_4
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v8, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xc

    const/4 v13, 0x0

    move-object v7, v6

    invoke-direct/range {v7 .. v13}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :pswitch_5
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v15, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v16

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x1fe

    const/16 v27, 0x0

    invoke-static/range {v16 .. v27}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->copy$default(Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;ZILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0xc

    move-object v14, v6

    invoke-direct/range {v14 .. v20}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_1a
    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    invoke-direct {v2, v3}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1b

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-ne v0, v5, :cond_2f

    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v8, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xc

    const/4 v13, 0x0

    move-object v7, v6

    invoke-direct/range {v7 .. v13}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_1b
    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v4}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4

    const-string v8, "US.country"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v4}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1c

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-ne v0, v7, :cond_2f

    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v9, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    new-instance v7, Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;

    const-string v1, "en"

    const-string v0, "LICENSE"

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v0, v7

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;-><init>(Ljava/lang/String;Ljava/util/Set;ZLjava/lang/Integer;Z)V

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1bf

    const/16 v21, 0x0

    invoke-static/range {v10 .. v21}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->copy$default(Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;ZILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v10

    const/4 v12, 0x0

    const/16 v13, 0xc

    move-object v8, v6

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_1c
    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    sget-object v4, Ljava/util/Locale;->UK:Ljava/util/Locale;

    invoke-virtual {v4}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4

    const-string v8, "UK.country"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v4}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_22

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v5, :cond_21

    if-eq v0, v7, :cond_20

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1f

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1e

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1d

    goto/16 :goto_1

    :cond_1d
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v13, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v14

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v15

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1fe

    const/16 v25, 0x0

    invoke-static/range {v14 .. v25}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->copy$default(Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;ZILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v14

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0xc

    move-object v12, v6

    invoke-direct/range {v12 .. v18}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_1e
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/16 v20, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v21

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v22

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x1fe

    const/16 v32, 0x0

    invoke-static/range {v21 .. v32}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->copy$default(Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;ZILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v21

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0xc

    move-object/from16 v19, v6

    invoke-direct/range {v19 .. v25}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_1f
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v8, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xc

    const/4 v13, 0x0

    move-object v7, v6

    invoke-direct/range {v7 .. v13}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_20
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v15, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0xc

    const/16 v20, 0x0

    move-object v14, v6

    invoke-direct/range {v14 .. v20}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_21
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v8, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xc

    const/4 v13, 0x0

    move-object v7, v6

    invoke-direct/range {v7 .. v13}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_22
    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    const-string v4, "IL"

    invoke-direct {v2, v4}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_25

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const-string v1, "ISRAEL"

    if-eq v0, v5, :cond_24

    if-eq v0, v7, :cond_23

    goto/16 :goto_1

    :cond_23
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v9, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    new-instance v0, Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;

    const-string v18, "en"

    const-string v2, "LICENCE"

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v19

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x1

    move-object/from16 v17, v0

    invoke-direct/range {v17 .. v22}, Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;-><init>(Ljava/lang/String;Ljava/util/Set;ZLjava/lang/Integer;Z)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1bf

    invoke-static/range {v10 .. v21}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->copy$default(Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;ZILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v10

    const/4 v12, 0x0

    const/16 v13, 0xc

    move-object v8, v6

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_24
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/16 v16, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    new-array v0, v7, [Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;

    new-instance v2, Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;

    const-string v8, "he"

    const-string v3, "\u05d9\u05b4\u05e9\u05b0\u05c2\u05e8\u05b8\u05d0\u05b5\u05dc\u200e"

    const-string v4, "\u05d9\u05e9\u05e8\u05d0\u05dc"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    const/4 v10, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v12, 0x0

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;-><init>(Ljava/lang/String;Ljava/util/Set;ZLjava/lang/Integer;Z)V

    const/4 v3, 0x0

    aput-object v2, v0, v3

    new-instance v2, Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;

    const-string v8, "en"

    invoke-static {v1}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;-><init>(Ljava/lang/String;Ljava/util/Set;ZLjava/lang/Integer;Z)V

    aput-object v2, v0, v5

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v24

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x1bf

    const/16 v28, 0x0

    invoke-static/range {v17 .. v28}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->copy$default(Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;ZILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v17

    const/16 v19, 0x0

    const/16 v20, 0xc

    move-object v15, v6

    invoke-direct/range {v15 .. v21}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_25
    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    invoke-direct {v2, v3}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_26

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-ne v0, v7, :cond_2f

    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v9, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/4 v14, 0x0

    move-object v8, v6

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_26
    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    const-string v3, "NL"

    invoke-direct {v2, v3}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_29

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v5, :cond_28

    if-eq v0, v7, :cond_27

    goto/16 :goto_1

    :cond_27
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v9, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/4 v14, 0x0

    move-object v8, v6

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_28
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/16 v16, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xc

    const/16 v21, 0x0

    move-object v15, v6

    invoke-direct/range {v15 .. v21}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_29
    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    const-string v3, "NO"

    invoke-direct {v2, v3}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2a

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-ne v0, v7, :cond_2f

    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v9, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/4 v14, 0x0

    move-object v8, v6

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_2a
    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    const-string v3, "NZ"

    invoke-direct {v2, v3}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2b

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-ne v0, v7, :cond_2f

    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v9, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/4 v14, 0x0

    move-object v8, v6

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_1

    :cond_2b
    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    const-string v3, "PL"

    invoke-direct {v2, v3}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2e

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v5, :cond_2d

    if-eq v0, v7, :cond_2c

    goto :goto_1

    :cond_2c
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v9, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/4 v14, 0x0

    move-object v8, v6

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_2d
    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/16 v16, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v17

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0xc

    const/16 v21, 0x0

    move-object v15, v6

    invoke-direct/range {v15 .. v21}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_2e
    new-instance v2, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;

    const-string v3, "SE"

    invoke-direct {v2, v3}, Lco/bird/android/model/identification/IdentificationCountryJurisdiction;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2f

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentDescriptor;->getDocumentType()Lco/bird/android/model/identification/IdentificationDocumentType;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-ne v0, v7, :cond_2f

    new-instance v6, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v9, 0x1

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/4 v14, 0x0

    move-object v8, v6

    invoke-direct/range {v8 .. v14}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_2f
    :goto_1
    return-object v6

    :cond_30
    :goto_2
    new-instance v0, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    const/4 v8, 0x0

    invoke-static {}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->access$getSTANDARD_SELFIE_DETECTION_PARAMETERS$cp()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0xc

    const/4 v13, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v13}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;-><init>(ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final toStrategy(Lco/bird/android/model/identification/IdentificationDocumentDescriptor;Lco/bird/android/model/wire/configs/IdentificationConfig;)Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;
    .locals 18

    const-string v0, "<this>"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p1}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy$Companion;->toStrategy(Lco/bird/android/model/identification/IdentificationDocumentDescriptor;)Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    move-result-object v1

    if-eqz v1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual/range {p2 .. p2}, Lco/bird/android/model/wire/configs/IdentificationConfig;->getMinLandmarkWidthRatio()Ljava/lang/Double;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, Lco/bird/android/model/wire/configs/IdentificationConfig;->getEnableManualImageHeuristics()Z

    move-result v5

    invoke-virtual {v1}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->getDetectionParameters()Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Lco/bird/android/model/wire/configs/IdentificationConfig;->getMinLandmarkWidthRatio()Ljava/lang/Double;

    move-result-object v14

    invoke-virtual/range {p2 .. p2}, Lco/bird/android/model/wire/configs/IdentificationConfig;->getEnableManualImageHeuristics()Z

    move-result v15

    invoke-virtual/range {p2 .. p2}, Lco/bird/android/model/wire/configs/IdentificationConfig;->getMinRectangleConfidence()Ljava/lang/Double;

    move-result-object v8

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x7d

    const/16 v17, 0x0

    invoke-static/range {v6 .. v17}, Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;->copy$default(Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;ZILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;

    move-result-object v3

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static/range {v1 .. v7}, Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;->copy$default(Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;ZLco/bird/android/model/identification/IdentificationDocumentDetectionParameters;Ljava/lang/Double;ZILjava/lang/Object;)Lco/bird/android/model/identification/IdentificationDocumentScannerStrategy;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return-object v1
.end method
