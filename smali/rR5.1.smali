.class public LrR5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LpR5$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LrR5$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/hardware/camera2/params/StreamConfigurationMap;


# direct methods
.method public constructor <init>(Landroid/hardware/camera2/params/StreamConfigurationMap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LrR5;->a:Landroid/hardware/camera2/params/StreamConfigurationMap;

    return-void
.end method


# virtual methods
.method public a()Landroid/hardware/camera2/params/StreamConfigurationMap;
    .locals 1

    iget-object v0, p0, LrR5;->a:Landroid/hardware/camera2/params/StreamConfigurationMap;

    return-object v0
.end method

.method public c(I)[Landroid/util/Size;
    .locals 1

    iget-object v0, p0, LrR5;->a:Landroid/hardware/camera2/params/StreamConfigurationMap;

    invoke-static {v0, p1}, LrR5$a;->a(Landroid/hardware/camera2/params/StreamConfigurationMap;I)[Landroid/util/Size;

    move-result-object p1

    return-object p1
.end method
