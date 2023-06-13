.class public final synthetic Llp6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lrp6;

.field public final synthetic c:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Lrp6;Landroid/view/Surface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llp6;->b:Lrp6;

    iput-object p2, p0, Llp6;->c:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Llp6;->b:Lrp6;

    iget-object v1, p0, Llp6;->c:Landroid/view/Surface;

    invoke-static {v0, v1}, Lrp6;->c(Lrp6;Landroid/view/Surface;)V

    return-void
.end method
