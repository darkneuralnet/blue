.class public final synthetic LQ03;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:LU03;


# direct methods
.method public synthetic constructor <init>(LU03;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ03;->b:LU03;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LQ03;->b:LU03;

    invoke-static {v0, p1}, LU03;->am(LU03;Landroid/view/View;)V

    return-void
.end method
