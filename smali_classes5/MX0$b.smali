.class public LMX0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDW5$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMX0;->t()LDW5$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LMX0;


# direct methods
.method public constructor <init>(LMX0;)V
    .locals 0

    iput-object p1, p0, LMX0$b;->a:LMX0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, LMX0$b;->a:LMX0;

    iget-object p1, p1, LMX0;->b:LwO1;

    const/4 p2, 0x0

    invoke-interface {p1, p2}, LwO1;->K(Z)V

    invoke-static {}, Li20;->s()Li20;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Li20;->t(Z)V

    return-void
.end method

.method public b(Ljava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
