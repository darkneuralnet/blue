.class public final synthetic LQo6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LUo6;

.field public final synthetic c:Landroidx/camera/core/impl/DeferrableSurface;


# direct methods
.method public synthetic constructor <init>(LUo6;Landroidx/camera/core/impl/DeferrableSurface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQo6;->b:LUo6;

    iput-object p2, p0, LQo6;->c:Landroidx/camera/core/impl/DeferrableSurface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LQo6;->b:LUo6;

    iget-object v1, p0, LQo6;->c:Landroidx/camera/core/impl/DeferrableSurface;

    invoke-static {v0, v1}, LUo6;->Z(LUo6;Landroidx/camera/core/impl/DeferrableSurface;)V

    return-void
.end method
