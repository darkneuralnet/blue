.class public final synthetic Lqp6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llb1$b$a;


# instance fields
.field public final synthetic a:Lrp6;

.field public final synthetic b:LO80$a;

.field public final synthetic c:Landroidx/camera/core/o;


# direct methods
.method public synthetic constructor <init>(Lrp6;LO80$a;Landroidx/camera/core/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqp6;->a:Lrp6;

    iput-object p2, p0, Lqp6;->b:LO80$a;

    iput-object p3, p0, Lqp6;->c:Landroidx/camera/core/o;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/Surface;)V
    .locals 3

    iget-object v0, p0, Lqp6;->a:Lrp6;

    iget-object v1, p0, Lqp6;->b:LO80$a;

    iget-object v2, p0, Lqp6;->c:Landroidx/camera/core/o;

    invoke-static {v0, v1, v2, p1}, Lrp6;->e(Lrp6;LO80$a;Landroidx/camera/core/o;Landroid/view/Surface;)V

    return-void
.end method
