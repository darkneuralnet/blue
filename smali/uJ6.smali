.class public final synthetic LuJ6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/camera/core/n;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LuJ6;->b:Landroidx/camera/core/n;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LuJ6;->b:Landroidx/camera/core/n;

    invoke-virtual {v0}, Landroidx/camera/core/n;->m()V

    return-void
.end method
