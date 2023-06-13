.class public final synthetic LfB5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrz0;


# instance fields
.field public final synthetic a:LhB5;


# direct methods
.method public synthetic constructor <init>(LhB5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LfB5;->a:LhB5;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LfB5;->a:LhB5;

    check-cast p1, Landroidx/camera/core/i;

    invoke-static {v0, p1}, LhB5;->b(LhB5;Landroidx/camera/core/i;)V

    return-void
.end method
