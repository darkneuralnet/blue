.class public final synthetic LHY5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LJY5;

.field public final synthetic c:Landroidx/camera/core/h$o;


# direct methods
.method public synthetic constructor <init>(LJY5;Landroidx/camera/core/h$o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHY5;->b:LJY5;

    iput-object p2, p0, LHY5;->c:Landroidx/camera/core/h$o;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LHY5;->b:LJY5;

    iget-object v1, p0, LHY5;->c:Landroidx/camera/core/h$o;

    invoke-static {v0, v1}, LJY5;->b(LJY5;Landroidx/camera/core/h$o;)V

    return-void
.end method
