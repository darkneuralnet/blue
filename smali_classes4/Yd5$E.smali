.class public final LYd5$E;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYd5;->N0(Lco/bird/android/model/VehicleDescriptor;Lco/bird/android/model/LockKind;Z)Lio/reactivex/c;
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
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/VehicleConnection;",
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/h;"
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

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lco/bird/android/model/LockKind;

.field public final synthetic j:Z


# direct methods
.method public constructor <init>(LYd5;Ljava/lang/String;Lco/bird/android/model/LockKind;Z)V
    .locals 0

    iput-object p1, p0, LYd5$E;->g:LYd5;

    iput-object p2, p0, LYd5$E;->h:Ljava/lang/String;

    iput-object p3, p0, LYd5$E;->i:Lco/bird/android/model/LockKind;

    iput-boolean p4, p0, LYd5$E;->j:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/h;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYd5$E;->g:LYd5;

    iget-object v1, p0, LYd5$E;->h:Ljava/lang/String;

    iget-object v2, p0, LYd5$E;->i:Lco/bird/android/model/LockKind;

    iget-boolean v3, p0, LYd5$E;->j:Z

    invoke-static {v0, p1, v1, v2, v3}, LYd5;->access$getTokenAndUnlock(LYd5;Lco/bird/android/model/VehicleConnection;Ljava/lang/String;Lco/bird/android/model/LockKind;Z)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/VehicleConnection;

    invoke-virtual {p0, p1}, LYd5$E;->a(Lco/bird/android/model/VehicleConnection;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method