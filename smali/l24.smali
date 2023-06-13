.class public final synthetic Ll24;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/view/c$a;


# instance fields
.field public final synthetic a:Landroidx/camera/view/PreviewView$a;

.field public final synthetic b:Landroidx/camera/view/a;

.field public final synthetic c:LLb0;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/PreviewView$a;Landroidx/camera/view/a;LLb0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll24;->a:Landroidx/camera/view/PreviewView$a;

    iput-object p2, p0, Ll24;->b:Landroidx/camera/view/a;

    iput-object p3, p0, Ll24;->c:LLb0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Ll24;->a:Landroidx/camera/view/PreviewView$a;

    iget-object v1, p0, Ll24;->b:Landroidx/camera/view/a;

    iget-object v2, p0, Ll24;->c:LLb0;

    invoke-static {v0, v1, v2}, Landroidx/camera/view/PreviewView$a;->b(Landroidx/camera/view/PreviewView$a;Landroidx/camera/view/a;LLb0;)V

    return-void
.end method
