.class public final synthetic LP03;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:LT03;


# direct methods
.method public synthetic constructor <init>(LT03;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP03;->b:LT03;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LP03;->b:LT03;

    invoke-static {v0, p1}, LT03;->Zl(LT03;Landroid/view/View;)V

    return-void
.end method
