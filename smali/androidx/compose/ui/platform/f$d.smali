.class public final Landroidx/compose/ui/platform/f$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/platform/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u00c3\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/platform/f$d;",
        "",
        "Lp2;",
        "info",
        "Lis5;",
        "semanticsNode",
        "",
        "a",
        "<init>",
        "()V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Landroidx/compose/ui/platform/f$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/ui/platform/f$d;

    invoke-direct {v0}, Landroidx/compose/ui/platform/f$d;-><init>()V

    sput-object v0, Landroidx/compose/ui/platform/f$d;->a:Landroidx/compose/ui/platform/f$d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Lp2;Lis5;)V
    .locals 4
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "info"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "semanticsNode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/compose/ui/platform/g;->b(Lis5;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lis5;->t()Lbs5;

    move-result-object v0

    sget-object v1, Las5;->a:Las5;

    invoke-virtual {v1}, Las5;->m()Lrs5;

    move-result-object v2

    invoke-static {v0, v2}, Lcs5;->a(Lbs5;Lrs5;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK1;

    if-eqz v0, :cond_0

    new-instance v2, Lp2$a;

    const v3, 0x1020046

    invoke-virtual {v0}, LK1;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lp2$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {p0, v2}, Lp2;->b(Lp2$a;)V

    :cond_0
    invoke-virtual {p1}, Lis5;->t()Lbs5;

    move-result-object v0

    invoke-virtual {v1}, Las5;->j()Lrs5;

    move-result-object v2

    invoke-static {v0, v2}, Lcs5;->a(Lbs5;Lrs5;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK1;

    if-eqz v0, :cond_1

    new-instance v2, Lp2$a;

    const v3, 0x1020047

    invoke-virtual {v0}, LK1;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lp2$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {p0, v2}, Lp2;->b(Lp2$a;)V

    :cond_1
    invoke-virtual {p1}, Lis5;->t()Lbs5;

    move-result-object v0

    invoke-virtual {v1}, Las5;->k()Lrs5;

    move-result-object v2

    invoke-static {v0, v2}, Lcs5;->a(Lbs5;Lrs5;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LK1;

    if-eqz v0, :cond_2

    new-instance v2, Lp2$a;

    const v3, 0x1020048

    invoke-virtual {v0}, LK1;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lp2$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {p0, v2}, Lp2;->b(Lp2$a;)V

    :cond_2
    invoke-virtual {p1}, Lis5;->t()Lbs5;

    move-result-object p1

    invoke-virtual {v1}, Las5;->l()Lrs5;

    move-result-object v0

    invoke-static {p1, v0}, Lcs5;->a(Lbs5;Lrs5;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LK1;

    if-eqz p1, :cond_3

    new-instance v0, Lp2$a;

    const v1, 0x1020049

    invoke-virtual {p1}, LK1;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lp2$a;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {p0, v0}, Lp2;->b(Lp2$a;)V

    :cond_3
    return-void
.end method
