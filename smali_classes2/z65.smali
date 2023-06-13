.class public final Lz65;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u00a2\u0006\u0004\u0008!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0008\u001a\u0004\u0018\u00010\u0007*\u0004\u0018\u00010\u0006H\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0018R\u001d\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00160\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\r\u0010\u001f\u00a8\u0006#"
    }
    d2 = {
        "Lz65;",
        "",
        "",
        "c",
        "Lco/bird/android/model/wire/WireBird;",
        "a",
        "",
        "Lco/bird/android/model/ridertutorial/TutorialKind;",
        "d",
        "Lgl;",
        "Lgl;",
        "preference",
        "LYR4;",
        "b",
        "LYR4;",
        "rideManager",
        "Lw65;",
        "Lw65;",
        "riderTutorialPresenterFactory",
        "Lp65;",
        "Lp65;",
        "physicalLockTutorialPresenterFactory",
        "LDi0;",
        "e",
        "LDi0;",
        "rideTutorialNode",
        "f",
        "physicalLockTutorialNode",
        "",
        "g",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "tutorials",
        "<init>",
        "(Lgl;LYR4;Lw65;Lp65;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRideStartedTutorials.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStartedTutorials.kt\nco/bird/android/app/feature/ride/tutorial/RideStartedTutorials\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n1747#2,3:115\n*S KotlinDebug\n*F\n+ 1 RideStartedTutorials.kt\nco/bird/android/app/feature/ride/tutorial/RideStartedTutorials\n*L\n84#1:115,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lgl;

.field public final b:LYR4;

.field public final c:Lw65;

.field public final d:Lp65;

.field public final e:LDi0;

.field public final f:LDi0;

.field public final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LDi0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lgl;LYR4;Lw65;Lp65;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const-string v5, "preference"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "rideManager"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "riderTutorialPresenterFactory"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "physicalLockTutorialPresenterFactory"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lz65;->a:Lgl;

    iput-object v2, v0, Lz65;->b:LYR4;

    iput-object v3, v0, Lz65;->c:Lw65;

    iput-object v4, v0, Lz65;->d:Lp65;

    new-instance v1, LDi0;

    const-string v7, "ride"

    sget-object v8, Lz65$e;->g:Lz65$e;

    new-instance v9, Lz65$f;

    invoke-direct {v9, v0}, Lz65$f;-><init>(Lz65;)V

    const/4 v10, 0x0

    sget-object v11, Lz65$g;->g:Lz65$g;

    new-instance v12, Lz65$h;

    invoke-direct {v12, v0}, Lz65$h;-><init>(Lz65;)V

    const/16 v13, 0x8

    const/4 v14, 0x0

    move-object v6, v1

    invoke-direct/range {v6 .. v14}, LDi0;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v0, Lz65;->e:LDi0;

    new-instance v2, LDi0;

    const-string v16, "lock"

    sget-object v17, Lz65$a;->g:Lz65$a;

    new-instance v3, Lz65$b;

    invoke-direct {v3, v0}, Lz65$b;-><init>(Lz65;)V

    const/16 v19, 0x0

    sget-object v20, Lz65$c;->g:Lz65$c;

    new-instance v4, Lz65$d;

    invoke-direct {v4, v0}, Lz65$d;-><init>(Lz65;)V

    const/16 v22, 0x8

    const/16 v23, 0x0

    move-object v15, v2

    move-object/from16 v18, v3

    move-object/from16 v21, v4

    invoke-direct/range {v15 .. v23}, LDi0;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, v0, Lz65;->f:LDi0;

    const/4 v3, 0x2

    new-array v3, v3, [LDi0;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v2, v3, v1

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lz65;->g:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$currentBird(Lz65;)Lco/bird/android/model/wire/WireBird;
    .locals 0

    invoke-virtual {p0}, Lz65;->a()Lco/bird/android/model/wire/WireBird;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getPhysicalLockTutorialPresenterFactory$p(Lz65;)Lp65;
    .locals 0

    iget-object p0, p0, Lz65;->d:Lp65;

    return-object p0
.end method

.method public static final synthetic access$getPreference$p(Lz65;)Lgl;
    .locals 0

    iget-object p0, p0, Lz65;->a:Lgl;

    return-object p0
.end method

.method public static final synthetic access$getRiderTutorialPresenterFactory$p(Lz65;)Lw65;
    .locals 0

    iget-object p0, p0, Lz65;->c:Lw65;

    return-object p0
.end method

.method public static final synthetic access$toTutorialKind(Lz65;Ljava/lang/String;)Lco/bird/android/model/ridertutorial/TutorialKind;
    .locals 0

    invoke-virtual {p0, p1}, Lz65;->d(Ljava/lang/String;)Lco/bird/android/model/ridertutorial/TutorialKind;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Lco/bird/android/model/wire/WireBird;
    .locals 1

    iget-object v0, p0, Lz65;->b:LYR4;

    invoke-interface {v0}, LYR4;->R()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/RideState;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/RideState;->getRide()Lco/bird/android/model/wire/WireRide;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRide;->getBird()Lco/bird/android/model/wire/WireBird;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LDi0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz65;->g:Ljava/util/List;

    return-object v0
.end method

.method public final c()Z
    .locals 3

    iget-object v0, p0, Lz65;->g:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LDi0;

    invoke-virtual {v1}, LDi0;->f()Lkotlin/jvm/functions/Function0;

    move-result-object v1

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    :cond_2
    :goto_0
    return v2
.end method

.method public final d(Ljava/lang/String;)Lco/bird/android/model/ridertutorial/TutorialKind;
    .locals 2

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0xc10

    if-eq v0, v1, :cond_8

    const/16 v1, 0xc11

    if-eq v0, v1, :cond_6

    const/16 v1, 0xc41

    if-eq v0, v1, :cond_4

    const/16 v1, 0xcae

    if-eq v0, v1, :cond_2

    const v1, 0x3252a5

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "m365"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lco/bird/android/model/ridertutorial/TutorialKind;->CONTEXTUAL_M365:Lco/bird/android/model/ridertutorial/TutorialKind;

    goto :goto_1

    :cond_2
    const-string v0, "es"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    sget-object p1, Lco/bird/android/model/ridertutorial/TutorialKind;->CONTEXTUAL_ES:Lco/bird/android/model/ridertutorial/TutorialKind;

    goto :goto_1

    :cond_4
    const-string v0, "bc"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    sget-object p1, Lco/bird/android/model/ridertutorial/TutorialKind;->CONTEXTUAL_BC:Lco/bird/android/model/ridertutorial/TutorialKind;

    goto :goto_1

    :cond_6
    const-string v0, "b3"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    sget-object p1, Lco/bird/android/model/ridertutorial/TutorialKind;->CONTEXTUAL_B3:Lco/bird/android/model/ridertutorial/TutorialKind;

    goto :goto_1

    :cond_8
    const-string v0, "b2"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_0

    :cond_9
    sget-object p1, Lco/bird/android/model/ridertutorial/TutorialKind;->CONTEXTUAL_B2:Lco/bird/android/model/ridertutorial/TutorialKind;

    goto :goto_1

    :cond_a
    :goto_0
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method
