.class public final LOI$v;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOI;->j(Lco/bird/android/model/VehicleDescriptor;Ljava/lang/String;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LXn1;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LXn1;",
        "state",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LXn1;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/VehicleDescriptor;

.field public final synthetic h:LOI;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lco/bird/android/model/VehicleDescriptor;LOI;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LOI$v;->g:Lco/bird/android/model/VehicleDescriptor;

    iput-object p2, p0, LOI$v;->h:LOI;

    iput-object p3, p0, LOI$v;->i:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LXn1;)Lio/reactivex/h;
    .locals 2

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LXn1;->s()Lco/bird/android/model/VehicleDescriptor;

    move-result-object p1

    iget-object v0, p0, LOI$v;->g:Lco/bird/android/model/VehicleDescriptor;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "VehicleDescriptor does not match the target VehicleDescriptor"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/c;->F(Ljava/lang/Throwable;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LOI$v;->h:LOI;

    invoke-static {p1}, LOI;->access$getRxBleBirdBluetoothManager$p(LOI;)Lrd5;

    move-result-object p1

    iget-object v0, p0, LOI$v;->g:Lco/bird/android/model/VehicleDescriptor;

    iget-object v1, p0, LOI$v;->i:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lrd5;->x(Lco/bird/android/model/VehicleDescriptor;Ljava/lang/String;)Lio/reactivex/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LXn1;

    invoke-virtual {p0, p1}, LOI$v;->a(LXn1;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
