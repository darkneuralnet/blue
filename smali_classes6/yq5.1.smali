.class public final synthetic Lyq5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVt6$e;


# instance fields
.field public final synthetic a:Lcom/google/android/material/search/SearchView;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/search/SearchView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyq5;->a:Lcom/google/android/material/search/SearchView;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;LDB6;LVt6$f;)LDB6;
    .locals 1

    iget-object v0, p0, Lyq5;->a:Lcom/google/android/material/search/SearchView;

    invoke-static {v0, p1, p2, p3}, Lcom/google/android/material/search/SearchView;->b(Lcom/google/android/material/search/SearchView;Landroid/view/View;LDB6;LVt6$f;)LDB6;

    move-result-object p1

    return-object p1
.end method
