.class public Lcom/google/android/material/textfield/a$a;
.super Lb36;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/textfield/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/google/android/material/textfield/a;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/textfield/a$a;->b:Lcom/google/android/material/textfield/a;

    invoke-direct {p0}, Lb36;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/a$a;->b:Lcom/google/android/material/textfield/a;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/a;->o()LVc1;

    move-result-object v0

    invoke-virtual {v0, p1}, LVc1;->a(Landroid/text/Editable;)V

    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/textfield/a$a;->b:Lcom/google/android/material/textfield/a;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/a;->o()LVc1;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, LVc1;->b(Ljava/lang/CharSequence;III)V

    return-void
.end method
