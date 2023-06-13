.class public final synthetic LZ80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr90$c;


# instance fields
.field public final synthetic a:Lc90;


# direct methods
.method public synthetic constructor <init>(Lc90;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ80;->a:Lc90;

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    iget-object v0, p0, LZ80;->a:Lc90;

    invoke-static {v0, p1}, Lc90;->c(Lc90;Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    return p1
.end method
