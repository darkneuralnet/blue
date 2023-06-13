.class public final synthetic LZb4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:LVb4;


# direct methods
.method public synthetic constructor <init>(LVb4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZb4;->b:LVb4;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LZb4;->b:LVb4;

    invoke-static {v0, p1}, LVb4$g;->a(LVb4;Landroid/view/View;)V

    return-void
.end method
