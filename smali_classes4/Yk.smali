.class public final LYk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LWy6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lhj;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/persistence/warehousemarker/impl/WarehouseMarkerDatabase;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhj;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "Lco/bird/android/persistence/warehousemarker/impl/WarehouseMarkerDatabase;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYk;->a:Lhj;

    iput-object p2, p0, LYk;->b:LY94;

    return-void
.end method

.method public static a(Lhj;LY94;)LYk;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj;",
            "LY94<",
            "Lco/bird/android/persistence/warehousemarker/impl/WarehouseMarkerDatabase;",
            ">;)",
            "LYk;"
        }
    .end annotation

    new-instance v0, LYk;

    invoke-direct {v0, p0, p1}, LYk;-><init>(Lhj;LY94;)V

    return-object v0
.end method

.method public static c(Lhj;Lco/bird/android/persistence/warehousemarker/impl/WarehouseMarkerDatabase;)LWy6;
    .locals 0

    invoke-virtual {p0, p1}, Lhj;->T0(Lco/bird/android/persistence/warehousemarker/impl/WarehouseMarkerDatabase;)LWy6;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LWy6;

    return-object p0
.end method


# virtual methods
.method public b()LWy6;
    .locals 2

    iget-object v0, p0, LYk;->a:Lhj;

    iget-object v1, p0, LYk;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/persistence/warehousemarker/impl/WarehouseMarkerDatabase;

    invoke-static {v0, v1}, LYk;->c(Lhj;Lco/bird/android/persistence/warehousemarker/impl/WarehouseMarkerDatabase;)LWy6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYk;->b()LWy6;

    move-result-object v0

    return-object v0
.end method
