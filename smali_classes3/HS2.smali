.class public final synthetic LHS2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:LJS2;


# direct methods
.method public synthetic constructor <init>(LJS2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHS2;->b:LJS2;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LHS2;->b:LJS2;

    invoke-static {v0, p1}, LJS2;->Zl(LJS2;Landroid/view/View;)V

    return-void
.end method
