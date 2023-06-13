.class public final synthetic LYn1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic b:LZn1;

.field public final synthetic c:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(LZn1;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYn1;->b:LZn1;

    iput-object p2, p0, LYn1;->c:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 2

    iget-object v0, p0, LYn1;->b:LZn1;

    iget-object v1, p0, LYn1;->c:Landroid/view/View;

    invoke-static {v0, v1}, LZn1;->a(LZn1;Landroid/view/View;)V

    return-void
.end method
