.class public final synthetic Luq5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUe3;


# instance fields
.field public final synthetic b:Landroid/view/ViewGroup$MarginLayoutParams;

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luq5;->b:Landroid/view/ViewGroup$MarginLayoutParams;

    iput p2, p0, Luq5;->c:I

    iput p3, p0, Luq5;->d:I

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;LDB6;)LDB6;
    .locals 3

    iget-object v0, p0, Luq5;->b:Landroid/view/ViewGroup$MarginLayoutParams;

    iget v1, p0, Luq5;->c:I

    iget v2, p0, Luq5;->d:I

    invoke-static {v0, v1, v2, p1, p2}, Lcom/google/android/material/search/SearchView;->k(Landroid/view/ViewGroup$MarginLayoutParams;IILandroid/view/View;LDB6;)LDB6;

    move-result-object p1

    return-object p1
.end method
