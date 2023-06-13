.class public final synthetic LJT2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/camera/core/k;

.field public final synthetic c:LKX1$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/k;LKX1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJT2;->b:Landroidx/camera/core/k;

    iput-object p2, p0, LJT2;->c:LKX1$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LJT2;->b:Landroidx/camera/core/k;

    iget-object v1, p0, LJT2;->c:LKX1$a;

    invoke-static {v0, v1}, Landroidx/camera/core/k;->j(Landroidx/camera/core/k;LKX1$a;)V

    return-void
.end method
