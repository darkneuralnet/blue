.class public final synthetic Lkp6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrz0;


# instance fields
.field public final synthetic a:Lrp6;


# direct methods
.method public synthetic constructor <init>(Lrp6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkp6;->a:Lrp6;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lkp6;->a:Lrp6;

    check-cast p1, Landroidx/camera/core/o$g;

    invoke-static {v0, p1}, Lrp6;->b(Lrp6;Landroidx/camera/core/o$g;)V

    return-void
.end method
