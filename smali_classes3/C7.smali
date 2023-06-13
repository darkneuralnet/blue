.class public final synthetic LC7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:LB7;


# direct methods
.method public synthetic constructor <init>(LB7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC7;->b:LB7;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LC7;->b:LB7;

    invoke-static {v0, p1}, LB7$b;->a(LB7;Landroid/view/View;)V

    return-void
.end method
