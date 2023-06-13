.class public final LHO4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh62;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\n\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002\u00a8\u0006\r"
    }
    d2 = {
        "LHO4;",
        "Lh62;",
        "Lh62$a;",
        "chain",
        "LM12;",
        "a",
        "Landroid/view/View;",
        "view",
        "Landroid/util/AttributeSet;",
        "attributeSet",
        "b",
        "<init>",
        "()V",
        "reword_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LHO4;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LHO4;

    invoke-direct {v0}, LHO4;-><init>()V

    sput-object v0, LHO4;->a:LHO4;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lh62$a;)LM12;
    .locals 8

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lh62$a;->request()LL12;

    move-result-object v0

    invoke-virtual {v0}, LL12;->d()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lh62$a;->request()LL12;

    move-result-object v1

    invoke-virtual {v1}, LL12;->b()Landroid/content/Context;

    move-result-object v1

    invoke-interface {p1}, Lh62$a;->request()LL12;

    move-result-object v2

    invoke-virtual {v2}, LL12;->a()Landroid/util/AttributeSet;

    move-result-object v2

    sget-object v3, LGO4;->a:LGO4;

    invoke-virtual {v3}, LGO4;->a()LNt6;

    move-result-object v3

    invoke-virtual {v3, v0, v1, v2}, LNt6;->a(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance p1, LM12;

    invoke-virtual {p0, v3, v2}, LHO4;->b(Landroid/view/View;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v3

    invoke-direct {p1, v3, v0, v1, v2}, LM12;-><init>(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object p1

    :cond_0
    invoke-interface {p1}, Lh62$a;->request()LL12;

    move-result-object v0

    invoke-interface {p1, v0}, Lh62$a;->a(LL12;)LM12;

    move-result-object v1

    sget-object p1, LHO4;->a:LHO4;

    invoke-virtual {v1}, LM12;->d()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1}, LM12;->c()Landroid/util/AttributeSet;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, LHO4;->b(Landroid/view/View;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xe

    const/4 v7, 0x0

    invoke-static/range {v1 .. v7}, LM12;->b(LM12;Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/Object;)LM12;

    move-result-object p1

    return-object p1
.end method

.method public final b(Landroid/view/View;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-static {p1, p2}, LIO4;->a(Landroid/view/View;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    :cond_0
    return-object p1
.end method
