.class public final LIs5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LHs5;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/hardware/SensorManager;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Ldr4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/hardware/SensorManager;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIs5;->a:LY94;

    iput-object p2, p0, LIs5;->b:LY94;

    return-void
.end method

.method public static a(LY94;LY94;)LIs5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/hardware/SensorManager;",
            ">;",
            "LY94<",
            "Ldr4;",
            ">;)",
            "LIs5;"
        }
    .end annotation

    new-instance v0, LIs5;

    invoke-direct {v0, p0, p1}, LIs5;-><init>(LY94;LY94;)V

    return-object v0
.end method

.method public static c(Landroid/hardware/SensorManager;Ldr4;)LHs5;
    .locals 1

    new-instance v0, LHs5;

    invoke-direct {v0, p0, p1}, LHs5;-><init>(Landroid/hardware/SensorManager;Ldr4;)V

    return-object v0
.end method


# virtual methods
.method public b()LHs5;
    .locals 2

    iget-object v0, p0, LIs5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    iget-object v1, p0, LIs5;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldr4;

    invoke-static {v0, v1}, LIs5;->c(Landroid/hardware/SensorManager;Ldr4;)LHs5;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LIs5;->b()LHs5;

    move-result-object v0

    return-object v0
.end method
