.class public final synthetic LqW5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrz0;


# instance fields
.field public final synthetic a:Landroidx/camera/view/c$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LqW5;->a:Landroidx/camera/view/c$a;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LqW5;->a:Landroidx/camera/view/c$a;

    check-cast p1, Landroidx/camera/core/o$g;

    invoke-static {v0, p1}, Landroidx/camera/view/d$a;->a(Landroidx/camera/view/c$a;Landroidx/camera/core/o$g;)V

    return-void
.end method
