.class public final synthetic LWb4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic b:LVb4$b;

.field public final synthetic c:LVb4;


# direct methods
.method public synthetic constructor <init>(LVb4$b;LVb4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWb4;->b:LVb4$b;

    iput-object p2, p0, LWb4;->c:LVb4;

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 2

    iget-object v0, p0, LWb4;->b:LVb4$b;

    iget-object v1, p0, LWb4;->c:LVb4;

    invoke-static {v0, v1, p1, p2}, LVb4$b;->b(LVb4$b;LVb4;Landroid/view/View;Z)V

    return-void
.end method
