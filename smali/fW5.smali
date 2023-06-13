.class public final synthetic LfW5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/camera/core/o;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LfW5;->b:Landroidx/camera/core/o;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LfW5;->b:Landroidx/camera/core/o;

    invoke-static {v0}, Landroidx/camera/core/o;->e(Landroidx/camera/core/o;)V

    return-void
.end method
