.class public final Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/F<",
        "Ljava/util/List<",
        "+",
        "LH6;",
        ">;>;",
        "Lio/reactivex/K<",
        "+",
        "Ljava/util/List<",
        "+",
        "LH6;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0005*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001 \u0005* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0005*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lio/reactivex/F;",
        "",
        "LH6;",
        "it",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lio/reactivex/F;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet$a;

    invoke-direct {v0}, Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet$a;-><init>()V

    sput-object v0, Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet$a;->g:Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lio/reactivex/F;)Lio/reactivex/K;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/F<",
            "Ljava/util/List<",
            "LH6;",
            ">;>;)",
            "Lio/reactivex/K<",
            "+",
            "Ljava/util/List<",
            "LH6;",
            ">;>;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/F;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/rider/bottomsheets/ManageGroupRidesBottomSheet$a;->a(Lio/reactivex/F;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
