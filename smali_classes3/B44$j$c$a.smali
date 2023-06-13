.class public final LB44$j$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB44$j$c;->invoke(Lkotlin/Pair;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "[B",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "decryptedData",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "([B)Lio/reactivex/h;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LB44;

.field public final synthetic h:Lco/bird/android/model/persistence/Bird;


# direct methods
.method public constructor <init>(LB44;Lco/bird/android/model/persistence/Bird;)V
    .locals 0

    iput-object p1, p0, LB44$j$c$a;->g:LB44;

    iput-object p2, p0, LB44$j$c$a;->h:Lco/bird/android/model/persistence/Bird;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke([B)Lio/reactivex/h;
    .locals 79

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "decryptedData"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "UTF-8"

    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v2

    const-string v3, "forName(\"UTF-8\")"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    new-instance v1, LB44$a;

    invoke-direct {v1, v3}, LB44$a;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "decrypted data response: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v2, v4}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, LB44$a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v4

    const-string v5, "bird"

    const/4 v6, -0x1

    const/4 v7, 0x1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_3

    :sswitch_0
    const-string v4, "OKSCM"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v8, v0, LB44$j$c$a;->h:Lco/bird/android/model/persistence/Bird;

    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-virtual {v1}, LB44$a;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, LB44$j$c$a;->h:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/Bird;->getLocked()Z

    move-result v3

    :cond_1
    move/from16 v23, v3

    goto :goto_0

    :cond_2
    iget-object v1, v0, LB44$j$c$a;->h:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/Bird;->getLocked()Z

    move-result v1

    if-nez v1, :cond_1

    move/from16 v23, v7

    :goto_0
    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, -0x4001

    const v73, 0x7fffffff

    const/16 v74, 0x0

    invoke-static/range {v8 .. v74}, Lco/bird/android/model/persistence/Bird;->copy$default(Lco/bird/android/model/persistence/Bird;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/persistence/nestedstructures/BirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/persistence/nestedstructures/Lifecycle;ZLco/bird/android/model/persistence/nestedstructures/BirdLicenseView;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/persistence/nestedstructures/PrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;IILjava/lang/Object;)Lco/bird/android/model/persistence/Bird;

    move-result-object v1

    goto/16 :goto_4

    :sswitch_1
    const-string v1, "OKLOC"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto/16 :goto_3

    :cond_3
    iget-object v1, v0, LB44$j$c$a;->h:Lco/bird/android/model/persistence/Bird;

    goto/16 :goto_4

    :sswitch_2
    const-string v3, "OKLED"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_3

    :cond_4
    iget-object v2, v0, LB44$j$c$a;->h:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v1}, LB44$a;->e()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, v0, LB44$j$c$a;->h:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/Bird;->getLightOn()Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_2

    :cond_5
    iget-object v1, v0, LB44$j$c$a;->h:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v1}, Lco/bird/android/model/persistence/Bird;->getLightOn()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    goto :goto_1

    :cond_6
    move v1, v7

    :goto_1
    xor-int/2addr v1, v7

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :goto_2
    invoke-virtual {v2, v1}, Lco/bird/android/model/persistence/Bird;->setLightOn(Ljava/lang/Boolean;)V

    iget-object v1, v0, LB44$j$c$a;->h:Lco/bird/android/model/persistence/Bird;

    goto/16 :goto_4

    :sswitch_3
    const-string v1, "OKECO"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto/16 :goto_3

    :cond_7
    iget-object v1, v0, LB44$j$c$a;->h:Lco/bird/android/model/persistence/Bird;

    goto/16 :goto_4

    :sswitch_4
    const-string v4, "OKCCF"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto/16 :goto_3

    :cond_8
    invoke-virtual {v1}, LB44$a;->b()Ljava/util/List;

    move-result-object v1

    const-string v2, "periodic status update received"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v2, "ECU"

    invoke-interface {v1, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    iget-object v3, v0, LB44$j$c$a;->h:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/Bird;->getDistance()I

    move-result v3

    iget-object v4, v0, LB44$j$c$a;->h:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v4}, Lco/bird/android/model/persistence/Bird;->getEstimatedRange()Ljava/lang/Integer;

    move-result-object v4

    iget-object v9, v0, LB44$j$c$a;->h:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v9}, Lco/bird/android/model/persistence/Bird;->getLightOn()Ljava/lang/Boolean;

    move-result-object v9

    iget-object v10, v0, LB44$j$c$a;->h:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v10}, Lco/bird/android/model/persistence/Bird;->getBatteryLevel()I

    move-result v10

    iget-object v11, v0, LB44$j$c$a;->h:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v11}, Lco/bird/android/model/persistence/Bird;->getLocked()Z

    move-result v11

    if-eq v2, v6, :cond_b

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v12

    const/16 v13, 0x8

    if-le v12, v13, :cond_b

    add-int/lit8 v12, v2, 0x5

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-static {v12}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v12

    if-eqz v12, :cond_9

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v3

    mul-int/lit8 v3, v3, 0x64

    :cond_9
    add-int/lit8 v12, v2, 0x3

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-static {v12}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v12

    if-eqz v12, :cond_a

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v4

    mul-int/lit8 v4, v4, 0x64

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :cond_a
    add-int/lit8 v2, v2, 0x7

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    :cond_b
    move/from16 v18, v3

    move-object/from16 v17, v4

    const-string v2, "BMS"

    invoke-interface {v1, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    if-eq v2, v6, :cond_c

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v2, v7

    if-lt v3, v2, :cond_c

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/text/StringsKt;->toFloatOrNull(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    const/high16 v3, 0x41200000    # 10.0f

    div-float/2addr v2, v3

    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v10

    :cond_c
    move/from16 v16, v10

    const-string v2, "Meter"

    invoke-interface {v1, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    if-eq v2, v6, :cond_d

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v2, v2, 0x2

    if-lt v3, v2, :cond_d

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-virtual {v1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    :cond_d
    move/from16 v27, v11

    iget-object v1, v0, LB44$j$c$a;->h:Lco/bird/android/model/persistence/Bird;

    move-object v12, v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const/16 v70, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, -0x4039

    const v77, 0x7fffffff

    const/16 v78, 0x0

    invoke-static/range {v12 .. v78}, Lco/bird/android/model/persistence/Bird;->copy$default(Lco/bird/android/model/persistence/Bird;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/persistence/nestedstructures/BirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/persistence/nestedstructures/Lifecycle;ZLco/bird/android/model/persistence/nestedstructures/BirdLicenseView;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/persistence/nestedstructures/PrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;IILjava/lang/Object;)Lco/bird/android/model/persistence/Bird;

    move-result-object v1

    invoke-virtual {v1, v9}, Lco/bird/android/model/persistence/Bird;->setLightOn(Ljava/lang/Boolean;)V

    goto/16 :goto_4

    :sswitch_5
    const-string v4, "OKALC"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto/16 :goto_3

    :cond_e
    const-string v2, "refresh status response received"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1}, LB44$a;->b()Ljava/util/List;

    move-result-object v2

    const-string v3, "VER"

    invoke-interface {v2, v3}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    if-eq v2, v6, :cond_10

    iget-object v3, v0, LB44$j$c$a;->g:LB44;

    invoke-virtual {v3}, LtC3;->X0()LAG;

    move-result-object v3

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, LB44$a;->b()Ljava/util/List;

    move-result-object v4

    add-int/lit8 v8, v2, 0x1

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v1}, LB44$a;->b()Ljava/util/List;

    move-result-object v4

    add-int/lit8 v8, v2, 0x2

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_f

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    :cond_f
    move v12, v6

    invoke-virtual {v1}, LB44$a;->b()Ljava/util/List;

    move-result-object v4

    add-int/lit8 v6, v2, 0x3

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v13, v4

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v1}, LB44$a;->b()Ljava/util/List;

    move-result-object v1

    add-int/lit8 v2, v2, 0x5

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Ljava/lang/String;

    new-instance v1, Lco/bird/android/model/persistence/VehicleVersion;

    const-string v2, "toString()"

    invoke-static {v9, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v14, 0x0

    const/16 v15, 0x20

    const/16 v16, 0x0

    move-object v8, v1

    invoke-direct/range {v8 .. v16}, Lco/bird/android/model/persistence/VehicleVersion;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v1}, LAG;->accept(Ljava/lang/Object;)V

    :cond_10
    iget-object v1, v0, LB44$j$c$a;->h:Lco/bird/android/model/persistence/Bird;

    goto :goto_4

    :goto_3
    iget-object v1, v0, LB44$j$c$a;->h:Lco/bird/android/model/persistence/Bird;

    :goto_4
    iget-object v2, v0, LB44$j$c$a;->g:LB44;

    iget-object v3, v0, LB44$j$c$a;->h:Lco/bird/android/model/persistence/Bird;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "updatedBird"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v1}, LtC3;->D2(Lco/bird/android/model/persistence/Bird;Lco/bird/android/model/persistence/Bird;)Z

    move-result v2

    xor-int/2addr v2, v7

    if-eqz v2, :cond_11

    iget-object v2, v0, LB44$j$c$a;->g:LB44;

    invoke-virtual {v2}, LtC3;->H0()LAG;

    move-result-object v2

    invoke-virtual {v2, v1}, LAG;->accept(Ljava/lang/Object;)V

    iget-object v2, v0, LB44$j$c$a;->g:LB44;

    invoke-virtual {v2}, LtC3;->Q0()Lq54;

    move-result-object v2

    invoke-interface {v2, v1}, Lq54;->e(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/c;

    move-result-object v1

    goto :goto_5

    :cond_11
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object v1

    :goto_5
    return-object v1

    :sswitch_data_0
    .sparse-switch
        0x47c561c -> :sswitch_5
        0x47c5c8a -> :sswitch_4
        0x47c6415 -> :sswitch_3
        0x47c7e8f -> :sswitch_2
        0x47c7fc4 -> :sswitch_1
        0x47c98a1 -> :sswitch_0
    .end sparse-switch
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, LB44$j$c$a;->invoke([B)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
