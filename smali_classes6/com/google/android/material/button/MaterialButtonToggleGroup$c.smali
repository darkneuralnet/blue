.class public Lcom/google/android/material/button/MaterialButtonToggleGroup$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/button/MaterialButtonToggleGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field public static final e:LNC0;


# instance fields
.field public a:LNC0;

.field public b:LNC0;

.field public c:LNC0;

.field public d:LNC0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf0;-><init>(F)V

    sput-object v0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->e:LNC0;

    return-void
.end method

.method public constructor <init>(LNC0;LNC0;LNC0;LNC0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->a:LNC0;

    iput-object p3, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->b:LNC0;

    iput-object p4, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->c:LNC0;

    iput-object p2, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->d:LNC0;

    return-void
.end method

.method public static a(Lcom/google/android/material/button/MaterialButtonToggleGroup$c;)Lcom/google/android/material/button/MaterialButtonToggleGroup$c;
    .locals 3

    new-instance v0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;

    sget-object v1, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->e:LNC0;

    iget-object v2, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->d:LNC0;

    iget-object p0, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->c:LNC0;

    invoke-direct {v0, v1, v2, v1, p0}, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;-><init>(LNC0;LNC0;LNC0;LNC0;)V

    return-object v0
.end method

.method public static b(Lcom/google/android/material/button/MaterialButtonToggleGroup$c;Landroid/view/View;)Lcom/google/android/material/button/MaterialButtonToggleGroup$c;
    .locals 0

    invoke-static {p1}, LVt6;->n(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p0}, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->c(Lcom/google/android/material/button/MaterialButtonToggleGroup$c;)Lcom/google/android/material/button/MaterialButtonToggleGroup$c;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->d(Lcom/google/android/material/button/MaterialButtonToggleGroup$c;)Lcom/google/android/material/button/MaterialButtonToggleGroup$c;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static c(Lcom/google/android/material/button/MaterialButtonToggleGroup$c;)Lcom/google/android/material/button/MaterialButtonToggleGroup$c;
    .locals 3

    new-instance v0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;

    iget-object v1, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->a:LNC0;

    iget-object p0, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->d:LNC0;

    sget-object v2, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->e:LNC0;

    invoke-direct {v0, v1, p0, v2, v2}, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;-><init>(LNC0;LNC0;LNC0;LNC0;)V

    return-object v0
.end method

.method public static d(Lcom/google/android/material/button/MaterialButtonToggleGroup$c;)Lcom/google/android/material/button/MaterialButtonToggleGroup$c;
    .locals 3

    new-instance v0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;

    sget-object v1, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->e:LNC0;

    iget-object v2, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->b:LNC0;

    iget-object p0, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->c:LNC0;

    invoke-direct {v0, v1, v1, v2, p0}, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;-><init>(LNC0;LNC0;LNC0;LNC0;)V

    return-object v0
.end method

.method public static e(Lcom/google/android/material/button/MaterialButtonToggleGroup$c;Landroid/view/View;)Lcom/google/android/material/button/MaterialButtonToggleGroup$c;
    .locals 0

    invoke-static {p1}, LVt6;->n(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p0}, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->d(Lcom/google/android/material/button/MaterialButtonToggleGroup$c;)Lcom/google/android/material/button/MaterialButtonToggleGroup$c;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->c(Lcom/google/android/material/button/MaterialButtonToggleGroup$c;)Lcom/google/android/material/button/MaterialButtonToggleGroup$c;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static f(Lcom/google/android/material/button/MaterialButtonToggleGroup$c;)Lcom/google/android/material/button/MaterialButtonToggleGroup$c;
    .locals 3

    new-instance v0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;

    iget-object v1, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->a:LNC0;

    sget-object v2, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->e:LNC0;

    iget-object p0, p0, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;->b:LNC0;

    invoke-direct {v0, v1, v2, p0, v2}, Lcom/google/android/material/button/MaterialButtonToggleGroup$c;-><init>(LNC0;LNC0;LNC0;LNC0;)V

    return-object v0
.end method
