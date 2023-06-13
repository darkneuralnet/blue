.class public final LTK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000\u00a8\u0006\u0005"
    }
    d2 = {
        "Lco/bird/android/model/Vehicle;",
        "",
        "scanRecord",
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


# direct methods
.method public static final declared-synchronized a(Lco/bird/android/model/Vehicle;[B)Z
    .locals 18

    move-object/from16 v0, p0

    const-class v1, LTK;

    monitor-enter v1

    :try_start_0
    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v2

    invoke-static {v2}, Lco/bird/android/model/wire/WireBirdKt;->isBdCompatible(Lco/bird/android/model/wire/WireBird;)Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v0, v4}, Lco/bird/android/model/Vehicle;->setBattery(I)V

    invoke-virtual {v0, v4}, Lco/bird/android/model/Vehicle;->setDistance(I)V

    sget-object v2, Lco/bird/android/model/constant/EnergyMode;->NORMAL:Lco/bird/android/model/constant/EnergyMode;

    invoke-virtual {v0, v2}, Lco/bird/android/model/Vehicle;->setEnergyMode(Lco/bird/android/model/constant/EnergyMode;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return v3

    :cond_0
    :try_start_1
    invoke-static {}, Lf;->c()Lf;

    move-result-object v2

    move-object/from16 v5, p1

    invoke-virtual {v2, v5}, Lf;->d([B)Ljava/util/List;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_1

    monitor-exit v1

    return v4

    :cond_1
    :try_start_2
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg;

    instance-of v6, v5, Ld;

    if-eqz v6, :cond_2

    check-cast v5, Ld;

    invoke-virtual {v5}, Lg;->a()[B

    move-result-object v5

    invoke-static {v5}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v5

    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v15

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->get()B

    move-result v14

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v6

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->get()B

    move-result v7

    invoke-static {v6, v7}, LBd1;->b(Lco/bird/android/model/wire/WireBird;B)Lco/bird/android/model/constant/EnergyMode;

    move-result-object v13

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v5

    invoke-static {v5}, LHY;->c(I)I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/model/Vehicle;->getVehicleVersion()Lco/bird/android/model/persistence/VehicleVersion;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x37

    const/16 v17, 0x0

    move v10, v15

    move-object v3, v13

    move/from16 v13, v16

    move v4, v14

    move-object/from16 v14, v17

    invoke-static/range {v6 .. v14}, Lco/bird/android/model/persistence/VehicleVersion;->copy$default(Lco/bird/android/model/persistence/VehicleVersion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/persistence/VehicleVersion;

    move-result-object v6

    invoke-virtual {v0, v6}, Lco/bird/android/model/Vehicle;->setVehicleVersion(Lco/bird/android/model/persistence/VehicleVersion;)V

    invoke-virtual {v0, v4}, Lco/bird/android/model/Vehicle;->setBattery(I)V

    invoke-virtual {v0, v5}, Lco/bird/android/model/Vehicle;->setDistance(I)V

    invoke-virtual {v0, v3}, Lco/bird/android/model/Vehicle;->setEnergyMode(Lco/bird/android/model/constant/EnergyMode;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "parse: version="

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", battery="

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", distance="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v3, v5}, Lg46;->m(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v3, 0x1

    goto/16 :goto_0

    :cond_3
    monitor-exit v1

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method
