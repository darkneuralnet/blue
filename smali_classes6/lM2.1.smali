.class public LlM2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LcD1$h;
.implements LcD1$l;
.implements LcD1$m;
.implements LcD1$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LlM2$a;
    }
.end annotation


# instance fields
.field public final a:LcD1;

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "LlM2$a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "LfM2;",
            "LlM2$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LcD1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LlM2;->b:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LlM2;->c:Ljava/util/Map;

    iput-object p1, p0, LlM2;->a:LcD1;

    return-void
.end method

.method public static bridge synthetic a(LlM2;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, LlM2;->c:Ljava/util/Map;

    return-object p0
.end method

.method public static bridge synthetic d(LlM2;)LcD1;
    .locals 0

    iget-object p0, p0, LlM2;->a:LcD1;

    return-object p0
.end method


# virtual methods
.method public b(LfM2;)V
    .locals 2

    iget-object v0, p0, LlM2;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LlM2$a;

    if-eqz v0, :cond_0

    invoke-static {v0}, LlM2$a;->b(LlM2$a;)LcD1$h;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, LlM2$a;->b(LlM2$a;)LcD1$h;

    move-result-object v0

    invoke-interface {v0, p1}, LcD1$h;->b(LfM2;)V

    :cond_0
    return-void
.end method

.method public c(LfM2;)Z
    .locals 2

    iget-object v0, p0, LlM2;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LlM2$a;

    if-eqz v0, :cond_0

    invoke-static {v0}, LlM2$a;->c(LlM2$a;)LcD1$l;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, LlM2$a;->c(LlM2$a;)LcD1$l;

    move-result-object v0

    invoke-interface {v0, p1}, LcD1$l;->c(LfM2;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public e()LlM2$a;
    .locals 1

    new-instance v0, LlM2$a;

    invoke-direct {v0, p0}, LlM2$a;-><init>(LlM2;)V

    return-object v0
.end method

.method public f(LfM2;)Z
    .locals 1

    iget-object v0, p0, LlM2;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LlM2$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LlM2$a;->g(LfM2;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getInfoContents(LfM2;)Landroid/view/View;
    .locals 2

    iget-object v0, p0, LlM2;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LlM2$a;

    if-eqz v0, :cond_0

    invoke-static {v0}, LlM2$a;->a(LlM2$a;)LcD1$b;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, LlM2$a;->a(LlM2$a;)LcD1$b;

    move-result-object v0

    invoke-interface {v0, p1}, LcD1$b;->getInfoContents(LfM2;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getInfoWindow(LfM2;)Landroid/view/View;
    .locals 2

    iget-object v0, p0, LlM2;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LlM2$a;

    if-eqz v0, :cond_0

    invoke-static {v0}, LlM2$a;->a(LlM2$a;)LcD1$b;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, LlM2$a;->a(LlM2$a;)LcD1$b;

    move-result-object v0

    invoke-interface {v0, p1}, LcD1$b;->getInfoWindow(LfM2;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public onMarkerDrag(LfM2;)V
    .locals 2

    iget-object v0, p0, LlM2;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LlM2$a;

    if-eqz v0, :cond_0

    invoke-static {v0}, LlM2$a;->d(LlM2$a;)LcD1$m;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, LlM2$a;->d(LlM2$a;)LcD1$m;

    move-result-object v0

    invoke-interface {v0, p1}, LcD1$m;->onMarkerDrag(LfM2;)V

    :cond_0
    return-void
.end method

.method public onMarkerDragEnd(LfM2;)V
    .locals 2

    iget-object v0, p0, LlM2;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LlM2$a;

    if-eqz v0, :cond_0

    invoke-static {v0}, LlM2$a;->d(LlM2$a;)LcD1$m;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, LlM2$a;->d(LlM2$a;)LcD1$m;

    move-result-object v0

    invoke-interface {v0, p1}, LcD1$m;->onMarkerDragEnd(LfM2;)V

    :cond_0
    return-void
.end method

.method public onMarkerDragStart(LfM2;)V
    .locals 2

    iget-object v0, p0, LlM2;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LlM2$a;

    if-eqz v0, :cond_0

    invoke-static {v0}, LlM2$a;->d(LlM2$a;)LcD1$m;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, LlM2$a;->d(LlM2$a;)LcD1$m;

    move-result-object v0

    invoke-interface {v0, p1}, LcD1$m;->onMarkerDragStart(LfM2;)V

    :cond_0
    return-void
.end method
