.class public Lvs6$b;
.super Lvs6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvs6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public h:[F

.field public i:Landroidx/constraintlayout/widget/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lvs6;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [F

    iput-object v0, p0, Lvs6$b;->h:[F

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroidx/constraintlayout/widget/a;

    iput-object p1, p0, Lvs6$b;->i:Landroidx/constraintlayout/widget/a;

    return-void
.end method

.method public j(Landroid/view/View;F)V
    .locals 2

    iget-object v0, p0, Lvs6$b;->h:[F

    const/4 v1, 0x0

    invoke-virtual {p0, p2}, Lgk2;->a(F)F

    move-result p2

    aput p2, v0, v1

    iget-object p2, p0, Lvs6$b;->i:Landroidx/constraintlayout/widget/a;

    iget-object v0, p0, Lvs6$b;->h:[F

    invoke-static {p2, p1, v0}, LpF0;->b(Landroidx/constraintlayout/widget/a;Landroid/view/View;[F)V

    return-void
.end method
