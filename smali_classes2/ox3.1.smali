.class public final Lox3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnx3;


# instance fields
.field public final a:Lpx3;


# direct methods
.method public constructor <init>(Lpx3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lox3;->a:Lpx3;

    return-void
.end method

.method public static b(Lpx3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpx3;",
            ")",
            "LY94<",
            "Lnx3;",
            ">;"
        }
    .end annotation

    new-instance v0, Lox3;

    invoke-direct {v0, p0}, Lox3;-><init>(Lpx3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/app/feature/map/ui/MapWarehouseMarkerUi;)Lmx3;
    .locals 1

    iget-object v0, p0, Lox3;->a:Lpx3;

    invoke-virtual {v0, p1, p2}, Lpx3;->b(Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/app/feature/map/ui/MapWarehouseMarkerUi;)Lmx3;

    move-result-object p1

    return-object p1
.end method
