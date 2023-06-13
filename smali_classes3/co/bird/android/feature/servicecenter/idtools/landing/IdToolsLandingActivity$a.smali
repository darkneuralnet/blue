.class public final Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;->s2()Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/Integer;",
        "LmS1;",
        "Lco/bird/android/model/persistence/BrainSwapRecord;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "idx",
        "LmS1;",
        "state",
        "Lco/bird/android/model/persistence/BrainSwapRecord;",
        "a",
        "(Ljava/lang/Integer;LmS1;)Lco/bird/android/model/persistence/BrainSwapRecord;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$a;

    invoke-direct {v0}, Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$a;-><init>()V

    sput-object v0, Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$a;->g:Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;LmS1;)Lco/bird/android/model/persistence/BrainSwapRecord;
    .locals 2

    const-string v0, "idx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LmS1;->f()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p2}, LmS1;->b()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    sub-int/2addr p1, v1

    invoke-virtual {p2}, LmS1;->c()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    sub-int/2addr p1, p2

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/persistence/BrainSwapRecord;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, LmS1;

    invoke-virtual {p0, p1, p2}, Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$a;->a(Ljava/lang/Integer;LmS1;)Lco/bird/android/model/persistence/BrainSwapRecord;

    move-result-object p1

    return-object p1
.end method
