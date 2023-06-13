.class public final Lip0$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lip0;->e(Lco/bird/android/model/persistence/Bird;ZZLjava/lang/String;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/Vehicle;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/Vehicle;",
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/Vehicle;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/persistence/Bird;

.field public final synthetic h:Z

.field public final synthetic i:Lip0;


# direct methods
.method public constructor <init>(Lco/bird/android/model/persistence/Bird;ZLip0;)V
    .locals 0

    iput-object p1, p0, Lip0$e;->g:Lco/bird/android/model/persistence/Bird;

    iput-boolean p2, p0, Lip0$e;->h:Z

    iput-object p3, p0, Lip0$e;->i:Lip0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/Vehicle;)Lio/reactivex/h;
    .locals 69

    move-object/from16 v0, p0

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lip0$e;->g:Lco/bird/android/model/persistence/Bird;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

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

    const/16 v23, 0x0

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

    invoke-virtual {v2}, Lco/bird/android/model/persistence/Bird;->getLifecycle()Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    move-result-object v53

    const/16 v54, 0x0

    const/16 v55, 0x0

    iget-boolean v1, v0, Lip0$e;->h:Z

    if-eqz v1, :cond_0

    sget-object v1, Lco/bird/android/model/constant/BrainState;->ASLEEP:Lco/bird/android/model/constant/BrainState;

    goto :goto_0

    :cond_0
    sget-object v1, Lco/bird/android/model/constant/BrainState;->AVAILABLE:Lco/bird/android/model/constant/BrainState;

    :goto_0
    move-object/from16 v56, v1

    const/16 v57, 0x0

    const/16 v58, 0xb

    const/16 v59, 0x0

    invoke-static/range {v53 .. v59}, Lco/bird/android/model/persistence/nestedstructures/Lifecycle;->copy$default(Lco/bird/android/model/persistence/nestedstructures/Lifecycle;Lco/bird/android/model/constant/Condition;Lco/bird/android/model/constant/SpecialCondition;Lco/bird/android/model/constant/BrainState;Lco/bird/android/model/constant/Placement;ILjava/lang/Object;)Lco/bird/android/model/persistence/nestedstructures/Lifecycle;

    move-result-object v53

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v58, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, -0x1

    const v67, 0x7ffbffff

    const/16 v68, 0x0

    invoke-static/range {v2 .. v68}, Lco/bird/android/model/persistence/Bird;->copy$default(Lco/bird/android/model/persistence/Bird;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZZLco/bird/android/model/persistence/nestedstructures/BirdLabel;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLco/bird/android/model/constant/BountyKind;Ljava/lang/String;Lco/bird/android/model/constant/BirdTaskKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;ZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/PhysicalLock;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/PartnerBirdState;ZZLco/bird/android/model/persistence/nestedstructures/Lifecycle;ZLco/bird/android/model/persistence/nestedstructures/BirdLicenseView;Ljava/lang/String;Lco/bird/android/model/constant/NestPurpose;Lco/bird/android/model/persistence/nestedstructures/PrivateBird;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/MapPinBadge;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lorg/joda/time/DateTime;IILjava/lang/Object;)Lco/bird/android/model/persistence/Bird;

    move-result-object v1

    iget-boolean v2, v0, Lip0$e;->h:Z

    if-eqz v2, :cond_1

    iget-object v2, v0, Lip0$e;->i:Lip0;

    invoke-static {v2}, Lip0;->access$getBirdManager$p(Lip0;)LaM;

    move-result-object v2

    iget-object v3, v0, Lip0$e;->g:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, LaM;->m1(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object v2

    goto :goto_1

    :cond_1
    iget-object v2, v0, Lip0$e;->i:Lip0;

    invoke-static {v2}, Lip0;->access$getBirdManager$p(Lip0;)LaM;

    move-result-object v2

    iget-object v3, v0, Lip0$e;->g:Lco/bird/android/model/persistence/Bird;

    invoke-virtual {v3}, Lco/bird/android/model/persistence/Bird;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, LaM;->d1(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object v2

    :goto_1
    iget-object v3, v0, Lip0$e;->i:Lip0;

    invoke-static {v3}, Lip0;->access$getBirdRepo$p(Lip0;)LRR;

    move-result-object v3

    invoke-interface {v3, v1}, LRR;->c1(Lco/bird/android/model/persistence/Bird;)Lio/reactivex/c;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Vehicle;

    invoke-virtual {p0, p1}, Lip0$e;->a(Lco/bird/android/model/Vehicle;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
