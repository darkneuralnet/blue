.class public LlP5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public b:LaD6;

.field public c:LiP5;

.field public d:Landroidx/work/WorkerParameters$a;


# direct methods
.method public constructor <init>(LaD6;LiP5;Landroidx/work/WorkerParameters$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LlP5;->b:LaD6;

    iput-object p2, p0, LlP5;->c:LiP5;

    iput-object p3, p0, LlP5;->d:Landroidx/work/WorkerParameters$a;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, LlP5;->b:LaD6;

    invoke-virtual {v0}, LaD6;->r()Li74;

    move-result-object v0

    iget-object v1, p0, LlP5;->c:LiP5;

    iget-object v2, p0, LlP5;->d:Landroidx/work/WorkerParameters$a;

    invoke-virtual {v0, v1, v2}, Li74;->q(LiP5;Landroidx/work/WorkerParameters$a;)Z

    return-void
.end method
