.class public final synthetic LV14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/camera/core/l$c;

.field public final synthetic c:Landroidx/camera/core/o;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/l$c;Landroidx/camera/core/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV14;->b:Landroidx/camera/core/l$c;

    iput-object p2, p0, LV14;->c:Landroidx/camera/core/o;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LV14;->b:Landroidx/camera/core/l$c;

    iget-object v1, p0, LV14;->c:Landroidx/camera/core/o;

    invoke-static {v0, v1}, Landroidx/camera/core/l;->W(Landroidx/camera/core/l$c;Landroidx/camera/core/o;)V

    return-void
.end method
