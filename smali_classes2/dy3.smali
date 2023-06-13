.class public final Ldy3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcy3;


# instance fields
.field public final a:Ley3;


# direct methods
.method public constructor <init>(Ley3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldy3;->a:Ley3;

    return-void
.end method

.method public static b(Ley3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ley3;",
            ")",
            "LY94<",
            "Lcy3;",
            ">;"
        }
    .end annotation

    new-instance v0, Ldy3;

    invoke-direct {v0, p0}, Ldy3;-><init>(Ley3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/app/feature/map/ui/MapZoneMarkerUi;)LZx3;
    .locals 1

    iget-object v0, p0, Ldy3;->a:Ley3;

    invoke-virtual {v0, p1, p2}, Ley3;->b(Lco/bird/android/app/feature/map/ui/MapUi;Lco/bird/android/app/feature/map/ui/MapZoneMarkerUi;)LZx3;

    move-result-object p1

    return-object p1
.end method
