.class public final synthetic LUX1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/camera/core/j;

.field public final synthetic c:Landroidx/camera/core/j$c;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/j;Landroidx/camera/core/j$c;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUX1;->b:Landroidx/camera/core/j;

    iput-object p2, p0, LUX1;->c:Landroidx/camera/core/j$c;

    iput-object p3, p0, LUX1;->d:Ljava/lang/String;

    iput-object p4, p0, LUX1;->e:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LUX1;->b:Landroidx/camera/core/j;

    iget-object v1, p0, LUX1;->c:Landroidx/camera/core/j$c;

    iget-object v2, p0, LUX1;->d:Ljava/lang/String;

    iget-object v3, p0, LUX1;->e:Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, v3}, Landroidx/camera/core/j;->c(Landroidx/camera/core/j;Landroidx/camera/core/j$c;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
