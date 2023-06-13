.class public final Lte8;
.super Lnt8;
.source "SourceFile"


# instance fields
.field public final synthetic a:LcD1$b;


# direct methods
.method public constructor <init>(LcD1;LcD1$b;)V
    .locals 0

    iput-object p2, p0, Lte8;->a:LcD1$b;

    invoke-direct {p0}, Lnt8;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEw9;)LWO1;
    .locals 2

    iget-object v0, p0, Lte8;->a:LcD1$b;

    new-instance v1, LfM2;

    invoke-direct {v1, p1}, LfM2;-><init>(LEw9;)V

    invoke-interface {v0, v1}, LcD1$b;->getInfoContents(LfM2;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object p1

    return-object p1
.end method

.method public final r(LEw9;)LWO1;
    .locals 2

    iget-object v0, p0, Lte8;->a:LcD1$b;

    new-instance v1, LfM2;

    invoke-direct {v1, p1}, LfM2;-><init>(LEw9;)V

    invoke-interface {v0, v1}, LcD1$b;->getInfoWindow(LfM2;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, LVd3;->e5(Ljava/lang/Object;)LWO1;

    move-result-object p1

    return-object p1
.end method
