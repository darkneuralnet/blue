.class public final synthetic LW14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/camera/core/l;

.field public final synthetic c:LMV5;

.field public final synthetic d:LLb0;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/l;LMV5;LLb0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW14;->b:Landroidx/camera/core/l;

    iput-object p2, p0, LW14;->c:LMV5;

    iput-object p3, p0, LW14;->d:LLb0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LW14;->b:Landroidx/camera/core/l;

    iget-object v1, p0, LW14;->c:LMV5;

    iget-object v2, p0, LW14;->d:LLb0;

    invoke-static {v0, v1, v2}, Landroidx/camera/core/l;->U(Landroidx/camera/core/l;LMV5;LLb0;)V

    return-void
.end method
