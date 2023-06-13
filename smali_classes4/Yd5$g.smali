.class public final LYd5$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYd5;->d(Lco/bird/android/model/VehicleDescriptor;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/VehicleConnection;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/VehicleConnection;",
        "kotlin.jvm.PlatformType",
        "_connection",
        "",
        "a",
        "(Lco/bird/android/model/VehicleConnection;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LYd5;

.field public final synthetic h:Lco/bird/android/model/VehicleDescriptor;


# direct methods
.method public constructor <init>(LYd5;Lco/bird/android/model/VehicleDescriptor;)V
    .locals 0

    iput-object p1, p0, LYd5$g;->g:LYd5;

    iput-object p2, p0, LYd5$g;->h:Lco/bird/android/model/VehicleDescriptor;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/VehicleConnection;)V
    .locals 2

    iget-object v0, p0, LYd5$g;->g:LYd5;

    invoke-static {v0}, LYd5;->access$getVehicleConnectionCache$p(LYd5;)Landroid/util/LruCache;

    move-result-object v0

    iget-object v1, p0, LYd5$g;->h:Lco/bird/android/model/VehicleDescriptor;

    invoke-virtual {v0, v1, p1}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/VehicleConnection;

    invoke-virtual {p0, p1}, LYd5$g;->a(Lco/bird/android/model/VehicleConnection;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
