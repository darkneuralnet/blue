.class public Lcom/google/android/material/datepicker/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/datepicker/b$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/b;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/android/material/datepicker/b;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/b$e;->a:Lcom/google/android/material/datepicker/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/b$e;->a:Lcom/google/android/material/datepicker/b;

    invoke-static {v0}, Lcom/google/android/material/datepicker/b;->A9(Lcom/google/android/material/datepicker/b;)Lcom/google/android/material/datepicker/CalendarConstraints;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/CalendarConstraints;->h()Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;->l0(J)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/datepicker/b$e;->a:Lcom/google/android/material/datepicker/b;

    invoke-static {v0}, Lcom/google/android/material/datepicker/b;->B9(Lcom/google/android/material/datepicker/b;)Lcom/google/android/material/datepicker/DateSelector;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/android/material/datepicker/DateSelector;->z1(J)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/b$e;->a:Lcom/google/android/material/datepicker/b;

    iget-object p1, p1, LmT3;->b:Ljava/util/LinkedHashSet;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljh3;

    iget-object v0, p0, Lcom/google/android/material/datepicker/b$e;->a:Lcom/google/android/material/datepicker/b;

    invoke-static {v0}, Lcom/google/android/material/datepicker/b;->B9(Lcom/google/android/material/datepicker/b;)Lcom/google/android/material/datepicker/DateSelector;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/material/datepicker/DateSelector;->t1()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljh3;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/b$e;->a:Lcom/google/android/material/datepicker/b;

    invoke-static {p1}, Lcom/google/android/material/datepicker/b;->t8(Lcom/google/android/material/datepicker/b;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyDataSetChanged()V

    iget-object p1, p0, Lcom/google/android/material/datepicker/b$e;->a:Lcom/google/android/material/datepicker/b;

    invoke-static {p1}, Lcom/google/android/material/datepicker/b;->D9(Lcom/google/android/material/datepicker/b;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/material/datepicker/b$e;->a:Lcom/google/android/material/datepicker/b;

    invoke-static {p1}, Lcom/google/android/material/datepicker/b;->D9(Lcom/google/android/material/datepicker/b;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$h;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$h;->notifyDataSetChanged()V

    :cond_1
    return-void
.end method
