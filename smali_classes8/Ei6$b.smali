.class public final LEi6$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LEi6;->e(Landroid/view/View;Ljava/lang/String;JLjava/lang/CharSequence;Landroid/view/View$OnClickListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/view/View$OnClickListener;

.field public final synthetic c:Landroid/view/View;

.field public final synthetic d:Lcom/google/android/material/bottomsheet/a;


# direct methods
.method public constructor <init>(Landroid/view/View$OnClickListener;Landroid/view/View;Lcom/google/android/material/bottomsheet/a;)V
    .locals 0

    iput-object p1, p0, LEi6$b;->b:Landroid/view/View$OnClickListener;

    iput-object p2, p0, LEi6$b;->c:Landroid/view/View;

    iput-object p3, p0, LEi6$b;->d:Lcom/google/android/material/bottomsheet/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, LEi6$b;->b:Landroid/view/View$OnClickListener;

    iget-object v0, p0, LEi6$b;->c:Landroid/view/View;

    invoke-interface {p1, v0}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    iget-object p1, p0, LEi6$b;->d:Lcom/google/android/material/bottomsheet/a;

    invoke-virtual {p1}, Lcom/google/android/material/bottomsheet/a;->cancel()V

    return-void
.end method
