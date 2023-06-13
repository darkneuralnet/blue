.class public final synthetic LIv1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr90$c;


# instance fields
.field public final synthetic a:LLv1;

.field public final synthetic b:Z

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(LLv1;ZJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIv1;->a:LLv1;

    iput-boolean p2, p0, LIv1;->b:Z

    iput-wide p3, p0, LIv1;->c:J

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 4

    iget-object v0, p0, LIv1;->a:LLv1;

    iget-boolean v1, p0, LIv1;->b:Z

    iget-wide v2, p0, LIv1;->c:J

    invoke-static {v0, v1, v2, v3, p1}, LLv1;->g(LLv1;ZJLandroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    return p1
.end method
