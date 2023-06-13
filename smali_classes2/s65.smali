.class public final synthetic Ls65;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lt65;


# direct methods
.method public synthetic constructor <init>(Lt65;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls65;->b:Lt65;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Ls65;->b:Lt65;

    invoke-static {v0, p1}, Lt65;->a(Lt65;Landroid/view/View;)V

    return-void
.end method
