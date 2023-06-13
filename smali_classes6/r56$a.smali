.class public Lr56$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/BackgroundDetector$BackgroundStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr56;-><init>(Landroid/content/Context;LSY0;LYk0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LSY0;

.field public final synthetic b:LYk0;

.field public final synthetic c:Lr56;


# direct methods
.method public constructor <init>(Lr56;LSY0;LYk0;)V
    .locals 0

    iput-object p1, p0, Lr56$a;->c:Lr56;

    iput-object p2, p0, Lr56$a;->a:LSY0;

    iput-object p3, p0, Lr56$a;->b:LYk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBackgroundStateChanged(Z)V
    .locals 4

    iget-object v0, p0, Lr56$a;->c:Lr56;

    invoke-static {v0, p1}, Lr56;->a(Lr56;Z)Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lr56$a;->a:LSY0;

    invoke-virtual {p1}, LSY0;->c()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lr56$a;->c:Lr56;

    invoke-static {p1}, Lr56;->b(Lr56;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lr56$a;->a:LSY0;

    iget-object v0, p0, Lr56$a;->c:Lr56;

    invoke-static {v0}, Lr56;->c(Lr56;)J

    move-result-wide v0

    iget-object v2, p0, Lr56$a;->b:LYk0;

    invoke-interface {v2}, LYk0;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, LSY0;->g(J)V

    :cond_1
    :goto_0
    return-void
.end method
