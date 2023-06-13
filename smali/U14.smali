.class public final synthetic LU14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/camera/core/l;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU14;->b:Landroidx/camera/core/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LU14;->b:Landroidx/camera/core/l;

    invoke-virtual {v0}, Landroidx/camera/core/p;->C()V

    return-void
.end method
