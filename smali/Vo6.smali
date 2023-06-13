.class public final synthetic LVo6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LUo6$b;

.field public final synthetic c:Landroidx/camera/core/impl/q$b;


# direct methods
.method public synthetic constructor <init>(LUo6$b;Landroidx/camera/core/impl/q$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVo6;->b:LUo6$b;

    iput-object p2, p0, LVo6;->c:Landroidx/camera/core/impl/q$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LVo6;->b:LUo6$b;

    iget-object v1, p0, LVo6;->c:Landroidx/camera/core/impl/q$b;

    invoke-static {v0, v1}, LUo6$b;->d(LUo6$b;Landroidx/camera/core/impl/q$b;)V

    return-void
.end method
