.class public LpR5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LpR5$a;
    }
.end annotation


# instance fields
.field public final a:LpR5$a;

.field public final b:LgA3;


# direct methods
.method public constructor <init>(Landroid/hardware/camera2/params/StreamConfigurationMap;LgA3;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LqR5;

    invoke-direct {v0, p1}, LqR5;-><init>(Landroid/hardware/camera2/params/StreamConfigurationMap;)V

    iput-object v0, p0, LpR5;->a:LpR5$a;

    iput-object p2, p0, LpR5;->b:LgA3;

    return-void
.end method

.method public static d(Landroid/hardware/camera2/params/StreamConfigurationMap;LgA3;)LpR5;
    .locals 1

    new-instance v0, LpR5;

    invoke-direct {v0, p0, p1}, LpR5;-><init>(Landroid/hardware/camera2/params/StreamConfigurationMap;LgA3;)V

    return-object v0
.end method


# virtual methods
.method public a(I)[Landroid/util/Size;
    .locals 1

    iget-object v0, p0, LpR5;->a:LpR5$a;

    invoke-interface {v0, p1}, LpR5$a;->c(I)[Landroid/util/Size;

    move-result-object p1

    return-object p1
.end method

.method public b(I)[Landroid/util/Size;
    .locals 2

    iget-object v0, p0, LpR5;->b:LgA3;

    iget-object v1, p0, LpR5;->a:LpR5$a;

    invoke-interface {v1, p1}, LpR5$a;->b(I)[Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, LgA3;->b([Landroid/util/Size;I)[Landroid/util/Size;

    move-result-object p1

    return-object p1
.end method

.method public c()Landroid/hardware/camera2/params/StreamConfigurationMap;
    .locals 1

    iget-object v0, p0, LpR5;->a:LpR5$a;

    invoke-interface {v0}, LpR5$a;->a()Landroid/hardware/camera2/params/StreamConfigurationMap;

    move-result-object v0

    return-object v0
.end method
