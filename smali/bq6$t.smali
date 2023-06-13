.class public final Lbq6$t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbq6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "t"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/view/View;)[Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LHq6;->a(Landroid/view/View;)[Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/view/View;LmA0;)LmA0;
    .locals 1

    invoke-virtual {p1}, LmA0;->f()Landroid/view/ContentInfo;

    move-result-object v0

    invoke-static {p0, v0}, LGq6;->a(Landroid/view/View;Landroid/view/ContentInfo;)Landroid/view/ContentInfo;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-ne p0, v0, :cond_1

    return-object p1

    :cond_1
    invoke-static {p0}, LmA0;->g(Landroid/view/ContentInfo;)LmA0;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/view/View;[Ljava/lang/String;Leh3;)V
    .locals 1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-static {p0, p1, p2}, LIq6;->a(Landroid/view/View;[Ljava/lang/String;Landroid/view/OnReceiveContentListener;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lbq6$u;

    invoke-direct {v0, p2}, Lbq6$u;-><init>(Leh3;)V

    invoke-static {p0, p1, v0}, LIq6;->a(Landroid/view/View;[Ljava/lang/String;Landroid/view/OnReceiveContentListener;)V

    :goto_0
    return-void
.end method
