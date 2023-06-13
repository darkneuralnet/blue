.class public final LAT1$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAT1;->i(Lco/bird/android/model/identification/IdentificationRequestIdentifier;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lio/reactivex/disposables/c;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lio/reactivex/disposables/c;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lio/reactivex/disposables/c;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LAT1;

.field public final synthetic h:Lco/bird/android/model/identification/IdentificationRequestIdentifier;


# direct methods
.method public constructor <init>(LAT1;Lco/bird/android/model/identification/IdentificationRequestIdentifier;)V
    .locals 0

    iput-object p1, p0, LAT1$d;->g:LAT1;

    iput-object p2, p0, LAT1$d;->h:Lco/bird/android/model/identification/IdentificationRequestIdentifier;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lio/reactivex/disposables/c;)V
    .locals 2

    iget-object p1, p0, LAT1$d;->g:LAT1;

    invoke-static {p1}, LAT1;->access$getSessionLock$p(LAT1;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LAT1$d;->g:LAT1;

    iget-object v1, p0, LAT1$d;->h:Lco/bird/android/model/identification/IdentificationRequestIdentifier;

    monitor-enter p1

    :try_start_0
    invoke-static {v0, v1}, LAT1;->access$setMutableCurrentSessionIdentifier$p(LAT1;Lco/bird/android/model/identification/IdentificationRequestIdentifier;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1

    throw v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio/reactivex/disposables/c;

    invoke-virtual {p0, p1}, LAT1$d;->a(Lio/reactivex/disposables/c;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
