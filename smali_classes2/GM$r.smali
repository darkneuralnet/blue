.class public final LGM$r;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGM;->I0(Landroid/location/Location;Landroid/location/Location;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/Route;",
        "Lco/bird/android/model/Route;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lco/bird/android/model/Route;",
        "result",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/Route;)Lco/bird/android/model/Route;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LGM;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LGM;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LGM$r;->g:LGM;

    iput-object p2, p0, LGM$r;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/Route;)Lco/bird/android/model/Route;
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LGM$r;->g:LGM;

    invoke-static {v0}, LGM;->access$getRouteCache$p(LGM;)Landroid/util/LruCache;

    move-result-object v0

    iget-object v1, p0, LGM$r;->h:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Route;

    invoke-virtual {p0, p1}, LGM$r;->a(Lco/bird/android/model/Route;)Lco/bird/android/model/Route;

    move-result-object p1

    return-object p1
.end method
