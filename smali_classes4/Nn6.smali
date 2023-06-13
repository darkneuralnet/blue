.class public final LNn6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LNn6$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u0007H\u0000\u001a\u000c\u0010\u000b\u001a\u00020\n*\u00020\u0003H\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lco/bird/android/model/Vehicle;",
        "Lco/bird/android/model/GattUuid;",
        "uuid",
        "",
        "bytes",
        "",
        "c",
        "Landroid/bluetooth/BluetoothGattCharacteristic;",
        "characteristic",
        "b",
        "",
        "a",
        "bluetooth_release"
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
        "SMAP\nVehicle+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vehicle+.kt\nco/bird/android/manager/bluetooth/internal/Vehicle_Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,128:1\n11345#2:129\n11680#2,3:130\n*S KotlinDebug\n*F\n+ 1 Vehicle+.kt\nco/bird/android/manager/bluetooth/internal/Vehicle_Kt\n*L\n23#1:129\n23#1:130,3\n*E\n"
    }
.end annotation


# direct methods
.method public static final a([B)Ljava/lang/String;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p0

    const-string v0, "copyOf(this, size)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/UByteArray;->constructor-impl([B)[B

    move-result-object p0

    invoke-static {p0}, Lkotlin/UByteArray;->isEmpty-impl([B)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lkotlin/UByteArray;->get-w2LRezQ([BI)B

    move-result v0

    new-instance v1, Lkotlin/ranges/IntRange;

    const/4 v2, 0x1

    invoke-static {p0}, Lkotlin/collections/ArraysKt;->getLastIndex([B)I

    move-result v3

    invoke-direct {v1, v2, v3}, Lkotlin/ranges/IntRange;-><init>(II)V

    invoke-virtual {v1}, Lkotlin/ranges/IntProgression;->iterator()Lkotlin/collections/IntIterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v2

    invoke-static {p0, v2}, Lkotlin/UByteArray;->get-w2LRezQ([BI)B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    mul-int/lit8 v2, v2, 0x8

    shl-int v2, v3, v2

    int-to-byte v2, v2

    invoke-static {v2}, Lkotlin/UByte;->constructor-impl(B)B

    move-result v2

    or-int/2addr v0, v2

    int-to-byte v0, v0

    invoke-static {v0}, Lkotlin/UByte;->constructor-impl(B)B

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lkotlin/UByte;->toString-impl(B)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Empty array can\'t be reduced."

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final declared-synchronized b(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGattCharacteristic;)Z
    .locals 3

    const-class v0, LNn6;

    monitor-enter v0

    :try_start_0
    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "characteristic"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lco/bird/android/model/GattUuid;->Companion:Lco/bird/android/model/GattUuid$Companion;

    invoke-virtual {v1, p1}, Lco/bird/android/model/GattUuid$Companion;->from(Landroid/bluetooth/BluetoothGattCharacteristic;)Lco/bird/android/model/GattUuid;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGattCharacteristic;->getValue()[B

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p0, v1, p1}, LNn6;->c(Lco/bird/android/model/Vehicle;Lco/bird/android/model/GattUuid;[B)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return p0

    :cond_0
    :try_start_1
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "No value to read for "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-array p1, v2, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return v2

    :cond_1
    :try_start_2
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "UUID "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not a GattUuid"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-array p1, v2, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return v2

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static final declared-synchronized c(Lco/bird/android/model/Vehicle;Lco/bird/android/model/GattUuid;[B)Z
    .locals 80

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-class v3, LNn6;

    monitor-enter v3

    :try_start_0
    const-string v4, "<this>"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "uuid"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "bytes"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x0

    :try_start_1
    invoke-static/range {p2 .. p2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v5

    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v5

    new-instance v6, Ljava/util/ArrayList;

    array-length v7, v2

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    array-length v7, v2

    move v8, v4

    :goto_0
    if-ge v8, v7, :cond_0

    aget-byte v9, v2, v8

    int-to-char v9, v9

    invoke-static {v9}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_0
    const-string v7, ""

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    sget-object v12, LNn6$b;->g:LNn6$b;

    const/16 v13, 0x1e

    const/4 v14, 0x0

    invoke-static/range {v6 .. v14}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    sget-object v7, LNn6$a;->$EnumSwitchMapping$0:[I

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v7, v7, v8

    const/4 v8, 0x1

    packed-switch v7, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    goto/16 :goto_4

    :pswitch_0
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getFault()Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x8

    invoke-static {v2, v6}, Ls70;->a([BI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lco/bird/android/model/Vehicle;->setFault(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getFault()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :pswitch_1
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getVehicleVersion()Lco/bird/android/model/persistence/VehicleVersion;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/persistence/VehicleVersion;->getStmVersion()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getVehicleVersion()Lco/bird/android/model/persistence/VehicleVersion;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {p2 .. p2}, LNn6;->a([B)Ljava/lang/String;

    move-result-object v15

    const/16 v16, 0x1f

    const/16 v17, 0x0

    invoke-static/range {v9 .. v17}, Lco/bird/android/model/persistence/VehicleVersion;->copy$default(Lco/bird/android/model/persistence/VehicleVersion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/persistence/VehicleVersion;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getVehicleVersion()Lco/bird/android/model/persistence/VehicleVersion;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/persistence/VehicleVersion;->getStmVersion()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :pswitch_2
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getIccid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v6}, Lco/bird/android/model/Vehicle;->setIccid(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getIccid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :pswitch_3
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getImei()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v6}, Lco/bird/android/model/Vehicle;->setImei(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getImei()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :goto_1
    move v4, v8

    goto/16 :goto_5

    :pswitch_4
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getAuthenticated()Z

    move-result v2

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->get()B

    move-result v5

    if-eqz v5, :cond_1

    move v5, v8

    goto :goto_2

    :cond_1
    move v5, v4

    :goto_2
    invoke-virtual {v0, v5}, Lco/bird/android/model/Vehicle;->setAuthenticated(Z)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getAuthenticated()Z

    move-result v0

    if-eq v2, v0, :cond_3

    goto :goto_1

    :pswitch_5
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getEnergyMode()Lco/bird/android/model/constant/EnergyMode;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v6

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->get()B

    move-result v5

    invoke-static {v6, v5}, LBd1;->b(Lco/bird/android/model/wire/WireBird;B)Lco/bird/android/model/constant/EnergyMode;

    move-result-object v5

    invoke-virtual {v0, v5}, Lco/bird/android/model/Vehicle;->setEnergyMode(Lco/bird/android/model/constant/EnergyMode;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getEnergyMode()Lco/bird/android/model/constant/EnergyMode;

    move-result-object v0

    if-eq v2, v0, :cond_3

    goto :goto_1

    :pswitch_6
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getBattery()I

    move-result v2

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->get()B

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v0, v5}, Lco/bird/android/model/Vehicle;->setBattery(I)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getBattery()I

    move-result v0

    if-eq v2, v0, :cond_3

    goto :goto_1

    :pswitch_7
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getDistance()I

    move-result v2

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v5

    invoke-static {v5}, LHY;->c(I)I

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v0, v5}, Lco/bird/android/model/Vehicle;->setDistance(I)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getDistance()I

    move-result v0

    if-eq v2, v0, :cond_3

    goto :goto_1

    :pswitch_8
    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getLocked()Z

    move-result v2

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->get()B

    move-result v5

    if-eqz v5, :cond_2

    move v5, v8

    goto :goto_3

    :cond_2
    move v5, v4

    :goto_3
    invoke-virtual {v0, v5}, Lco/bird/android/model/Vehicle;->setLocked(Z)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

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

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getLocked()Z

    move-result v24

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

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    const/16 v76, -0x4001

    const/16 v77, -0x1

    const/16 v78, 0x3

    const/16 v79, 0x0

    invoke-static/range {v9 .. v79}, Lco/bird/android/model/wire/WireBird;->copy$default(Lco/bird/android/model/wire/WireBird;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/wire/WireBirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WirePhysicalLock;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/wire/WireLifecycle;ZLco/bird/android/model/wire/WireBirdLicenseView;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/wire/WirePrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;ZLjava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Object;)Lco/bird/android/model/wire/WireBird;

    move-result-object v5

    invoke-virtual {v0, v5}, Lco/bird/android/model/Vehicle;->setBird(Lco/bird/android/model/wire/WireBird;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getLocked()Z

    move-result v0

    if-eq v2, v0, :cond_3

    goto/16 :goto_1

    :goto_4
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Update from unrecognized: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/nio/BufferUnderflowException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    :goto_5
    monitor-exit v3

    return v4

    :catch_0
    move-exception v0

    :try_start_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Vehicle data is corrupted: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v4, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lg46;->f(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v3

    return v4

    :catchall_0
    move-exception v0

    monitor-exit v3

    throw v0

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
