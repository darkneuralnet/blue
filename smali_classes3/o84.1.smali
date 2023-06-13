.class public final synthetic Lo84;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field public final synthetic b:Lp84;

.field public final synthetic c:Lp84$a;


# direct methods
.method public synthetic constructor <init>(Lp84;Lp84$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo84;->b:Lp84;

    iput-object p2, p0, Lo84;->c:Lp84$a;

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 2

    iget-object v0, p0, Lo84;->b:Lp84;

    iget-object v1, p0, Lo84;->c:Lp84$a;

    invoke-static {v0, v1, p1, p2, p3}, Lp84$a;->a(Lp84;Lp84$a;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
