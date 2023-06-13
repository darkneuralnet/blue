.class public final synthetic LHY1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroid/view/inputmethod/InputMethodManager;

.field public final synthetic c:LIY1;


# direct methods
.method public synthetic constructor <init>(Landroid/view/inputmethod/InputMethodManager;LIY1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHY1;->b:Landroid/view/inputmethod/InputMethodManager;

    iput-object p2, p0, LHY1;->c:LIY1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LHY1;->b:Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, LHY1;->c:LIY1;

    invoke-static {v0, v1}, LIY1;->c(Landroid/view/inputmethod/InputMethodManager;LIY1;)V

    return-void
.end method
