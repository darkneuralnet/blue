.class public final synthetic LBs4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LHs4;

.field public final synthetic c:Landroidx/camera/core/o;

.field public final synthetic d:Lr46;


# direct methods
.method public synthetic constructor <init>(LHs4;Landroidx/camera/core/o;Lr46;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBs4;->b:LHs4;

    iput-object p2, p0, LBs4;->c:Landroidx/camera/core/o;

    iput-object p3, p0, LBs4;->d:Lr46;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LBs4;->b:LHs4;

    iget-object v1, p0, LBs4;->c:Landroidx/camera/core/o;

    iget-object v2, p0, LBs4;->d:Lr46;

    invoke-static {v0, v1, v2}, LHs4;->f(LHs4;Landroidx/camera/core/o;Lr46;)V

    return-void
.end method
