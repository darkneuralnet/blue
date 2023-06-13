.class public final synthetic Lk24;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/o$i;


# instance fields
.field public final synthetic a:Landroidx/camera/view/PreviewView$a;

.field public final synthetic b:LLb0;

.field public final synthetic c:Landroidx/camera/core/o;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/PreviewView$a;LLb0;Landroidx/camera/core/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk24;->a:Landroidx/camera/view/PreviewView$a;

    iput-object p2, p0, Lk24;->b:LLb0;

    iput-object p3, p0, Lk24;->c:Landroidx/camera/core/o;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/camera/core/o$h;)V
    .locals 3

    iget-object v0, p0, Lk24;->a:Landroidx/camera/view/PreviewView$a;

    iget-object v1, p0, Lk24;->b:LLb0;

    iget-object v2, p0, Lk24;->c:Landroidx/camera/core/o;

    invoke-static {v0, v1, v2, p1}, Landroidx/camera/view/PreviewView$a;->c(Landroidx/camera/view/PreviewView$a;LLb0;Landroidx/camera/core/o;Landroidx/camera/core/o$h;)V

    return-void
.end method
