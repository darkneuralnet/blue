.class Lzendesk/support/request/ComponentInputForm$EmailFieldFocusListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/support/request/ComponentInputForm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "EmailFieldFocusListener"
.end annotation


# instance fields
.field private final componentInputForm:Lzendesk/support/request/ComponentInputForm;

.field private final editText:Landroid/widget/EditText;


# direct methods
.method private constructor <init>(Lzendesk/support/request/ComponentInputForm;Landroid/widget/EditText;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/request/ComponentInputForm$EmailFieldFocusListener;->componentInputForm:Lzendesk/support/request/ComponentInputForm;

    iput-object p2, p0, Lzendesk/support/request/ComponentInputForm$EmailFieldFocusListener;->editText:Landroid/widget/EditText;

    return-void
.end method

.method public static install(Lzendesk/support/request/ComponentInputForm;Landroid/widget/EditText;)V
    .locals 1

    new-instance v0, Lzendesk/support/request/ComponentInputForm$EmailFieldFocusListener;

    invoke-direct {v0, p0, p1}, Lzendesk/support/request/ComponentInputForm$EmailFieldFocusListener;-><init>(Lzendesk/support/request/ComponentInputForm;Landroid/widget/EditText;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 0

    if-nez p2, :cond_0

    iget-object p1, p0, Lzendesk/support/request/ComponentInputForm$EmailFieldFocusListener;->editText:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LlS5;->b(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lzendesk/support/request/ComponentInputForm$EmailFieldFocusListener;->componentInputForm:Lzendesk/support/request/ComponentInputForm;

    invoke-static {p1}, Lzendesk/support/request/ComponentInputForm;->access$100(Lzendesk/support/request/ComponentInputForm;)V

    iget-object p1, p0, Lzendesk/support/request/ComponentInputForm$EmailFieldFocusListener;->componentInputForm:Lzendesk/support/request/ComponentInputForm;

    invoke-static {p1}, Lzendesk/support/request/ComponentInputForm;->access$200(Lzendesk/support/request/ComponentInputForm;)V

    :cond_0
    return-void
.end method
