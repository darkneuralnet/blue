.class public final synthetic Lgc1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Llb1$b$a;

.field public final synthetic c:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Llb1$b$a;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgc1;->b:Llb1$b$a;

    iput-object p2, p0, Lgc1;->c:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lgc1;->b:Llb1$b$a;

    iget-object v1, p0, Lgc1;->c:Landroid/view/Surface;

    invoke-static {v0, v1}, LOb1$g;->b(Llb1$b$a;Landroid/view/Surface;)V

    return-void
.end method
