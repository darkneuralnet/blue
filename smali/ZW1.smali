.class public final synthetic LZW1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/camera/core/h$l;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/h$l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZW1;->b:Landroidx/camera/core/h$l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LZW1;->b:Landroidx/camera/core/h$l;

    invoke-static {v0}, Landroidx/camera/core/h;->W(Landroidx/camera/core/h$l;)V

    return-void
.end method
