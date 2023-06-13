.class public final synthetic LFW1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/camera/core/g;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFW1;->b:Landroidx/camera/core/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LFW1;->b:Landroidx/camera/core/g;

    invoke-static {v0}, Landroidx/camera/core/g$b;->d(Landroidx/camera/core/g;)V

    return-void
.end method
