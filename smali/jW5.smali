.class public final synthetic LjW5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lrz0;

.field public final synthetic c:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Lrz0;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LjW5;->b:Lrz0;

    iput-object p2, p0, LjW5;->c:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LjW5;->b:Lrz0;

    iget-object v1, p0, LjW5;->c:Landroid/view/Surface;

    invoke-static {v0, v1}, Landroidx/camera/core/o;->a(Lrz0;Landroid/view/Surface;)V

    return-void
.end method
