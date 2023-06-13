.class public final Lco/bird/android/manager/vtbeacon/a$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/vtbeacon/a;->o(Lke5;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lio/reactivex/K<",
        "+",
        "Lke5;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "error",
        "Lio/reactivex/K;",
        "Lke5;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Throwable;)Lio/reactivex/K;",
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
.field public final synthetic g:Lco/bird/android/manager/vtbeacon/a;

.field public final synthetic h:Lke5;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/vtbeacon/a;Lke5;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/vtbeacon/a$b;->g:Lco/bird/android/manager/vtbeacon/a;

    iput-object p2, p0, Lco/bird/android/manager/vtbeacon/a$b;->h:Lke5;

    iput-object p3, p0, Lco/bird/android/manager/vtbeacon/a$b;->i:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Throwable;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lke5;",
            ">;"
        }
    .end annotation

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lco/bird/android/manager/vtbeacon/VTBeaconError$CommandFailed;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lco/bird/android/manager/vtbeacon/a$b;->g:Lco/bird/android/manager/vtbeacon/a;

    iget-object v0, p0, Lco/bird/android/manager/vtbeacon/a$b;->h:Lke5;

    new-instance v1, LZi6;

    iget-object v2, p0, Lco/bird/android/manager/vtbeacon/a$b;->i:Ljava/lang/String;

    invoke-direct {v1, v2}, LZi6;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0, v1}, Lco/bird/android/manager/vtbeacon/a;->access$write(Lco/bird/android/manager/vtbeacon/a;Lke5;LXi6;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lio/reactivex/F;->x(Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/vtbeacon/a$b;->invoke(Ljava/lang/Throwable;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
