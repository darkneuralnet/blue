.class public Lcom/google/android/material/datepicker/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/f;->p(I)Landroid/view/View$OnClickListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lcom/google/android/material/datepicker/f;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/f;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/f$a;->c:Lcom/google/android/material/datepicker/f;

    iput p2, p0, Lcom/google/android/material/datepicker/f$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget p1, p0, Lcom/google/android/material/datepicker/f$a;->b:I

    iget-object v0, p0, Lcom/google/android/material/datepicker/f$a;->c:Lcom/google/android/material/datepicker/f;

    invoke-static {v0}, Lcom/google/android/material/datepicker/f;->o(Lcom/google/android/material/datepicker/f;)Lcom/google/android/material/datepicker/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/b;->da()Lcom/google/android/material/datepicker/Month;

    move-result-object v0

    iget v0, v0, Lcom/google/android/material/datepicker/Month;->c:I

    invoke-static {p1, v0}, Lcom/google/android/material/datepicker/Month;->b(II)Lcom/google/android/material/datepicker/Month;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/datepicker/f$a;->c:Lcom/google/android/material/datepicker/f;

    invoke-static {v0}, Lcom/google/android/material/datepicker/f;->o(Lcom/google/android/material/datepicker/f;)Lcom/google/android/material/datepicker/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/b;->S9()Lcom/google/android/material/datepicker/CalendarConstraints;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/CalendarConstraints;->g(Lcom/google/android/material/datepicker/Month;)Lcom/google/android/material/datepicker/Month;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/datepicker/f$a;->c:Lcom/google/android/material/datepicker/f;

    invoke-static {v0}, Lcom/google/android/material/datepicker/f;->o(Lcom/google/android/material/datepicker/f;)Lcom/google/android/material/datepicker/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/b;->oa(Lcom/google/android/material/datepicker/Month;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/f$a;->c:Lcom/google/android/material/datepicker/f;

    invoke-static {p1}, Lcom/google/android/material/datepicker/f;->o(Lcom/google/android/material/datepicker/f;)Lcom/google/android/material/datepicker/b;

    move-result-object p1

    sget-object v0, Lcom/google/android/material/datepicker/b$l;->b:Lcom/google/android/material/datepicker/b$l;

    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/b;->sa(Lcom/google/android/material/datepicker/b$l;)V

    return-void
.end method
