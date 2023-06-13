.class public final synthetic LnN1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:LpN1;


# direct methods
.method public synthetic constructor <init>(LpN1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LnN1;->b:LpN1;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LnN1;->b:LpN1;

    invoke-static {v0, p1}, LpN1;->N6(LpN1;Landroid/view/View;)V

    return-void
.end method
