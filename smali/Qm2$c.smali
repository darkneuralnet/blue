.class public final LQm2$c;
.super LJm2$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQm2;->k(Lkotlin/jvm/functions/Function2;)LxO2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\u0008*\u00020\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u000b"
    }
    d2 = {
        "Qm2$c",
        "LJm2$f;",
        "LzO2;",
        "",
        "LvO2;",
        "measurables",
        "Lkz0;",
        "constraints",
        "LyO2;",
        "a",
        "(LzO2;Ljava/util/List;J)LyO2;",
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
.field public final synthetic b:LQm2;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "LaT5;",
            "Lkz0;",
            "LyO2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LQm2;Lkotlin/jvm/functions/Function2;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQm2;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LaT5;",
            "-",
            "Lkz0;",
            "+",
            "LyO2;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LQm2$c;->b:LQm2;

    iput-object p2, p0, LQm2$c;->c:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0, p3}, LJm2$f;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(LzO2;Ljava/util/List;J)LyO2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LzO2;",
            "Ljava/util/List<",
            "+",
            "LvO2;",
            ">;J)",
            "LyO2;"
        }
    .end annotation

    const-string v0, "$this$measure"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurables"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LQm2$c;->b:LQm2;

    invoke-static {p2}, LQm2;->f(LQm2;)LQm2$b;

    move-result-object p2

    invoke-interface {p1}, LZ62;->getLayoutDirection()Lpm2;

    move-result-object v0

    invoke-virtual {p2, v0}, LQm2$b;->e(Lpm2;)V

    iget-object p2, p0, LQm2$c;->b:LQm2;

    invoke-static {p2}, LQm2;->f(LQm2;)LQm2$b;

    move-result-object p2

    invoke-interface {p1}, Lg01;->b()F

    move-result v0

    invoke-virtual {p2, v0}, LQm2$b;->c(F)V

    iget-object p2, p0, LQm2$c;->b:LQm2;

    invoke-static {p2}, LQm2;->f(LQm2;)LQm2$b;

    move-result-object p2

    invoke-interface {p1}, Lg01;->R0()F

    move-result p1

    invoke-virtual {p2, p1}, LQm2$b;->d(F)V

    iget-object p1, p0, LQm2$c;->b:LQm2;

    const/4 p2, 0x0

    invoke-static {p1, p2}, LQm2;->h(LQm2;I)V

    iget-object p1, p0, LQm2$c;->c:Lkotlin/jvm/functions/Function2;

    iget-object p2, p0, LQm2$c;->b:LQm2;

    invoke-static {p2}, LQm2;->f(LQm2;)LQm2$b;

    move-result-object p2

    invoke-static {p3, p4}, Lkz0;->b(J)Lkz0;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LyO2;

    iget-object p2, p0, LQm2$c;->b:LQm2;

    invoke-static {p2}, LQm2;->a(LQm2;)I

    move-result p2

    new-instance p3, LQm2$c$a;

    iget-object p4, p0, LQm2$c;->b:LQm2;

    invoke-direct {p3, p1, p4, p2}, LQm2$c$a;-><init>(LyO2;LQm2;I)V

    return-object p3
.end method
