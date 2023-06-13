.class public final LhM8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LEM8;


# direct methods
.method public constructor <init>(LEM8;)V
    .locals 0

    iput-object p1, p0, LhM8;->b:LEM8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LhM8;->b:LEM8;

    iget-object v0, v0, LEM8;->d:LQM8;

    new-instance v1, Landroid/content/ComponentName;

    iget-object v2, v0, Lns8;->a:LPn8;

    invoke-virtual {v2}, LPn8;->z()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, LhM8;->b:LEM8;

    iget-object v3, v3, LEM8;->d:LQM8;

    iget-object v3, v3, Lns8;->a:LPn8;

    invoke-virtual {v3}, LPn8;->C()LFg7;

    const-string v3, "com.google.android.gms.measurement.AppMeasurementService"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {v0, v1}, LQM8;->M(LQM8;Landroid/content/ComponentName;)V

    return-void
.end method
