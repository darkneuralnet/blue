.class public LAa1$a;
.super LAa1$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LAa1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/widget/EditText;

.field public final b:LJa1;


# direct methods
.method public constructor <init>(Landroid/widget/EditText;Z)V
    .locals 1

    invoke-direct {p0}, LAa1$b;-><init>()V

    iput-object p1, p0, LAa1$a;->a:Landroid/widget/EditText;

    new-instance v0, LJa1;

    invoke-direct {v0, p1, p2}, LJa1;-><init>(Landroid/widget/EditText;Z)V

    iput-object v0, p0, LAa1$a;->b:LJa1;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-static {}, LBa1;->getInstance()Landroid/text/Editable$Factory;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setEditableFactory(Landroid/text/Editable$Factory;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;
    .locals 1

    instance-of v0, p1, LFa1;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    instance-of v0, p1, Landroid/text/method/NumberKeyListener;

    if-eqz v0, :cond_2

    return-object p1

    :cond_2
    new-instance v0, LFa1;

    invoke-direct {v0, p1}, LFa1;-><init>(Landroid/text/method/KeyListener;)V

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, LAa1$a;->b:LJa1;

    invoke-virtual {v0}, LJa1;->b()Z

    move-result v0

    return v0
.end method

.method public c(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    instance-of v0, p1, LDa1;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, LDa1;

    iget-object v1, p0, LAa1$a;->a:Landroid/widget/EditText;

    invoke-direct {v0, v1, p1, p2}, LDa1;-><init>(Landroid/widget/TextView;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V

    return-object v0
.end method

.method public d(Z)V
    .locals 1

    iget-object v0, p0, LAa1$a;->b:LJa1;

    invoke-virtual {v0, p1}, LJa1;->d(Z)V

    return-void
.end method
