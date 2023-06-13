.class public final LLU0$q;
.super LLU0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLU0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "q"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0001\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "LLU0$q;",
        "LLU0;",
        "Le13;",
        "navigator",
        "",
        "vararg",
        "",
        "c",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    const-class v0, Lco/bird/android/app/feature/physicallock/PhysicalLockTutorialActivity;

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, LLU0;-><init>(Ljava/lang/String;ILjava/lang/Class;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public c(Le13;Ljava/lang/Object;)V
    .locals 22

    const-string v0, "navigator"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;

    const-string v2, "A new way to secure your ride"

    const-string v3, "We\'ve added locks to keep sidewalks clear and make Birds easier to find for everyone"

    const-string v4, "https://static.bird.co/physical_lock_tutorial_1_cable.json"

    invoke-direct {v0, v4, v2, v3}, Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x3

    new-array v8, v2, [Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;

    const/4 v2, 0x0

    aput-object v0, v8, v2

    const/4 v3, 0x0

    const-string v4, "Step 2"

    const/4 v5, 0x0

    const/4 v6, 0x5

    const/4 v7, 0x0

    move-object v2, v0

    invoke-static/range {v2 .. v7}, Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;->copy$default(Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v8, v3

    const/4 v3, 0x0

    const-string v4, "Step 3"

    move-object v2, v0

    invoke-static/range {v2 .. v7}, Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;->copy$default(Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;

    move-result-object v0

    const/4 v2, 0x2

    aput-object v0, v8, v2

    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    new-instance v2, Lco/bird/android/model/wire/WirePhysicalLock;

    const-string v10, "physicallock"

    const-string v11, "bird"

    const-string v12, "cable"

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x3b8

    const/16 v21, 0x0

    move-object v9, v2

    invoke-direct/range {v9 .. v21}, Lco/bird/android/model/wire/WirePhysicalLock;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lco/bird/android/model/wire/WireSmartlock;Lco/bird/android/model/constant/PhysicalLockPurpose;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Le13$a;->goToPhysicalLockTutorial$default(Le13;Lco/bird/android/model/wire/WirePhysicalLock;ZLjava/lang/Integer;ILjava/lang/Object;)V

    return-void
.end method
