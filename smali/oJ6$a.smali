.class public LoJ6$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr90$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LoJ6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LoJ6;


# direct methods
.method public constructor <init>(LoJ6;)V
    .locals 0

    iput-object p1, p0, LoJ6$a;->a:LoJ6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    iget-object v0, p0, LoJ6$a;->a:LoJ6;

    iget-object v0, v0, LoJ6;->e:LoJ6$b;

    invoke-interface {v0, p1}, LoJ6$b;->a(Landroid/hardware/camera2/TotalCaptureResult;)V

    const/4 p1, 0x0

    return p1
.end method
