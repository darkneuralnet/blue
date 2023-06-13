.class public final Lvm3$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvm3;->Z0(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/constant/AlarmCommand;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/location/Location;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/android/model/wire/WireBird;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Landroid/location/Location;",
        "it",
        "Lio/reactivex/B;",
        "Lco/bird/android/model/wire/WireBird;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Landroid/location/Location;)Lio/reactivex/B;",
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
.field public final synthetic g:Lvm3;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;

.field public final synthetic i:Lco/bird/android/model/constant/AlarmCommand;


# direct methods
.method public constructor <init>(Lvm3;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/constant/AlarmCommand;)V
    .locals 0

    iput-object p1, p0, Lvm3$b;->g:Lvm3;

    iput-object p2, p0, Lvm3$b;->h:Lco/bird/android/model/wire/WireBird;

    iput-object p3, p0, Lvm3$b;->i:Lco/bird/android/model/constant/AlarmCommand;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroid/location/Location;)Lio/reactivex/B;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/location/Location;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lvm3$b;->g:Lvm3;

    invoke-static {p1}, Lvm3;->access$getBirdClient$p(Lvm3;)LVK;

    move-result-object p1

    new-instance v6, Lco/bird/api/request/AlarmBirdBody;

    iget-object v0, p0, Lvm3$b;->h:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lvm3$b;->i:Lco/bird/android/model/constant/AlarmCommand;

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lco/bird/api/request/AlarmBirdBody;-><init>(Ljava/lang/String;Lco/bird/android/model/constant/AlarmCommand;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v6}, LVK;->t(Lco/bird/api/request/AlarmBirdBody;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/location/Location;

    invoke-virtual {p0, p1}, Lvm3$b;->invoke(Landroid/location/Location;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method
