.class public final synthetic LdX1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/camera/core/h$j;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/h$j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LdX1;->b:Landroidx/camera/core/h$j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LdX1;->b:Landroidx/camera/core/h$j;

    invoke-virtual {v0}, Landroidx/camera/core/h$j;->b()V

    return-void
.end method
