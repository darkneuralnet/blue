.class public final LHa6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LHa6$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\n\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\t\u00a8\u0006\r"
    }
    d2 = {
        "LHa6;",
        "",
        "Le13;",
        "navigator",
        "LTq4;",
        "reactiveConfig",
        "LNa6;",
        "a",
        "Lco/bird/android/model/constant/TutorialType;",
        "Lco/bird/android/model/constant/TutorialType;",
        "tutorialType",
        "<init>",
        "(Lco/bird/android/model/constant/TutorialType;)V",
        "co.bird.android.feature.tutorial"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/model/constant/TutorialType;


# direct methods
.method public constructor <init>(Lco/bird/android/model/constant/TutorialType;)V
    .locals 1

    const-string v0, "tutorialType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHa6;->a:Lco/bird/android/model/constant/TutorialType;

    return-void
.end method


# virtual methods
.method public final a(Le13;LTq4;)LNa6;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactiveConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LHa6;->a:Lco/bird/android/model/constant/TutorialType;

    sget-object v1, LHa6$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    new-instance v0, LkE1;

    invoke-direct {v0, p1, p2}, LkE1;-><init>(Le13;LTq4;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance v0, Lgi0;

    invoke-direct {v0, p1}, Lgi0;-><init>(Le13;)V

    goto :goto_0

    :cond_2
    new-instance v0, LIu4;

    invoke-direct {v0, p1}, LIu4;-><init>(Le13;)V

    :goto_0
    return-object v0
.end method
