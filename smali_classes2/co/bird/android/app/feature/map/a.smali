.class public final synthetic Lco/bird/android/app/feature/map/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUg3;


# instance fields
.field public final synthetic b:Lio/reactivex/H;


# direct methods
.method public synthetic constructor <init>(Lio/reactivex/H;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/app/feature/map/a;->b:Lio/reactivex/H;

    return-void
.end method


# virtual methods
.method public final onMapReady(LcD1;)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/map/a;->b:Lio/reactivex/H;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/map/GoogleMap_Kt$getMap$1;->a(Lio/reactivex/H;LcD1;)V

    return-void
.end method
