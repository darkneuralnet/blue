.class public final synthetic LbX1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/camera/core/h$i;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/h$i;ILjava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LbX1;->b:Landroidx/camera/core/h$i;

    iput p2, p0, LbX1;->c:I

    iput-object p3, p0, LbX1;->d:Ljava/lang/String;

    iput-object p4, p0, LbX1;->e:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LbX1;->b:Landroidx/camera/core/h$i;

    iget v1, p0, LbX1;->c:I

    iget-object v2, p0, LbX1;->d:Ljava/lang/String;

    iget-object v3, p0, LbX1;->e:Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, v3}, Landroidx/camera/core/h$i;->a(Landroidx/camera/core/h$i;ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
