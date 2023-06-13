.class public final LQm2$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LyO2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQm2$c;->a(LzO2;Ljava/util/List;J)LyO2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\u0006R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Qm2$c$a",
        "LyO2;",
        "",
        "c",
        "",
        "getWidth",
        "()I",
        "width",
        "getHeight",
        "height",
        "",
        "LL9;",
        "d",
        "()Ljava/util/Map;",
        "alignmentLines",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:LyO2;

.field public final synthetic b:LQm2;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(LyO2;LQm2;I)V
    .locals 0

    iput-object p1, p0, LQm2$c$a;->a:LyO2;

    iput-object p2, p0, LQm2$c$a;->b:LQm2;

    iput p3, p0, LQm2$c$a;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    iget-object v0, p0, LQm2$c$a;->b:LQm2;

    iget v1, p0, LQm2$c$a;->c:I

    invoke-static {v0, v1}, LQm2;->h(LQm2;I)V

    iget-object v0, p0, LQm2$c$a;->a:LyO2;

    invoke-interface {v0}, LyO2;->c()V

    iget-object v0, p0, LQm2$c$a;->b:LQm2;

    invoke-static {v0}, LQm2;->a(LQm2;)I

    move-result v1

    invoke-virtual {v0, v1}, LQm2;->n(I)V

    return-void
.end method

.method public d()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "LL9;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LQm2$c$a;->a:LyO2;

    invoke-interface {v0}, LyO2;->d()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, LQm2$c$a;->a:LyO2;

    invoke-interface {v0}, LyO2;->getHeight()I

    move-result v0

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, LQm2$c$a;->a:LyO2;

    invoke-interface {v0}, LyO2;->getWidth()I

    move-result v0

    return v0
.end method
