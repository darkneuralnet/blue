.class public final synthetic LM90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXa0;


# instance fields
.field public final synthetic a:LWa0;


# direct methods
.method public synthetic constructor <init>(LWa0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM90;->a:LWa0;

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LM90;->a:LWa0;

    invoke-virtual {v0, p1}, LWa0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
