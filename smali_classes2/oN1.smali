.class public final synthetic LoN1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic b:LpN1;


# direct methods
.method public synthetic constructor <init>(LpN1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LoN1;->b:LpN1;

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object v0, p0, LoN1;->b:LpN1;

    invoke-static {v0, p1}, LpN1;->a5(LpN1;Landroid/content/DialogInterface;)V

    return-void
.end method
