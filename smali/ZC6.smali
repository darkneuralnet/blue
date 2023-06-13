.class public abstract LZC6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "AddedAbstractMethod"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZC6$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static h(Landroid/content/Context;)LZC6;
    .locals 0

    invoke-static {p0}, LaD6;->p(Landroid/content/Context;)LaD6;

    move-result-object p0

    return-object p0
.end method

.method public static i(Landroid/content/Context;Landroidx/work/a;)V
    .locals 0

    invoke-static {p0, p1}, LaD6;->i(Landroid/content/Context;Landroidx/work/a;)V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/util/List;)LIC6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LFh3;",
            ">;)",
            "LIC6;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;)LXh3;
.end method

.method public final c(LEG6;)LXh3;
    .locals 0

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, LZC6;->d(Ljava/util/List;)LXh3;

    move-result-object p1

    return-object p1
.end method

.method public abstract d(Ljava/util/List;)LXh3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "LEG6;",
            ">;)",
            "LXh3;"
        }
    .end annotation
.end method

.method public abstract e(Ljava/lang/String;Lei1;LpQ3;)LXh3;
.end method

.method public f(Ljava/lang/String;Lfi1;LFh3;)LXh3;
    .locals 0

    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, LZC6;->g(Ljava/lang/String;Lfi1;Ljava/util/List;)LXh3;

    move-result-object p1

    return-object p1
.end method

.method public abstract g(Ljava/lang/String;Lfi1;Ljava/util/List;)LXh3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lfi1;",
            "Ljava/util/List<",
            "LFh3;",
            ">;)",
            "LXh3;"
        }
    .end annotation
.end method
