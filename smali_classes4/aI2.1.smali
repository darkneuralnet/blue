.class public final LaI2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Landroid/hardware/SensorManager;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LVH2;

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LVH2;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LaI2;->a:LVH2;

    iput-object p2, p0, LaI2;->b:LY94;

    return-void
.end method

.method public static a(LVH2;LY94;)LaI2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LVH2;",
            "LY94<",
            "Landroid/content/Context;",
            ">;)",
            "LaI2;"
        }
    .end annotation

    new-instance v0, LaI2;

    invoke-direct {v0, p0, p1}, LaI2;-><init>(LVH2;LY94;)V

    return-object v0
.end method

.method public static c(LVH2;Landroid/content/Context;)Landroid/hardware/SensorManager;
    .locals 0

    invoke-virtual {p0, p1}, LVH2;->e(Landroid/content/Context;)Landroid/hardware/SensorManager;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/hardware/SensorManager;

    return-object p0
.end method


# virtual methods
.method public b()Landroid/hardware/SensorManager;
    .locals 2

    iget-object v0, p0, LaI2;->a:LVH2;

    iget-object v1, p0, LaI2;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    invoke-static {v0, v1}, LaI2;->c(LVH2;Landroid/content/Context;)Landroid/hardware/SensorManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LaI2;->b()Landroid/hardware/SensorManager;

    move-result-object v0

    return-object v0
.end method
