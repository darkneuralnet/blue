.class public final synthetic LSX1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/camera/core/j;

.field public final synthetic c:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/j;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSX1;->b:Landroidx/camera/core/j;

    iput-object p2, p0, LSX1;->c:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LSX1;->b:Landroidx/camera/core/j;

    iget-object v1, p0, LSX1;->c:Ljava/io/File;

    invoke-static {v0, v1}, Landroidx/camera/core/j;->b(Landroidx/camera/core/j;Ljava/io/File;)V

    return-void
.end method
