.class public final synthetic Le90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr90$c;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:LO80$a;


# direct methods
.method public synthetic constructor <init>(JLO80$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Le90;->a:J

    iput-object p3, p0, Le90;->b:LO80$a;

    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 3

    iget-wide v0, p0, Le90;->a:J

    iget-object v2, p0, Le90;->b:LO80$a;

    invoke-static {v0, v1, v2, p1}, Lr90;->o(JLO80$a;Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    return p1
.end method
