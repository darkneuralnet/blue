.class public final LYV3$a;
.super LNV3$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYV3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ-\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u000e"
    }
    d2 = {
        "LYV3$a;",
        "LNV3$a;",
        "LCe3;",
        "sourceCenter",
        "magnifierCenter",
        "",
        "zoom",
        "",
        "b",
        "(JJF)V",
        "Landroid/widget/Magnifier;",
        "magnifier",
        "<init>",
        "(Landroid/widget/Magnifier;)V",
        "foundation_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/widget/Magnifier;)V
    .locals 1

    const-string v0, "magnifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LNV3$a;-><init>(Landroid/widget/Magnifier;)V

    return-void
.end method


# virtual methods
.method public b(JJF)V
    .locals 1

    invoke-static {p5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LNV3$a;->d()Landroid/widget/Magnifier;

    move-result-object v0

    invoke-static {v0, p5}, LWV3;->a(Landroid/widget/Magnifier;F)V

    :cond_0
    invoke-static {p3, p4}, LGe3;->c(J)Z

    move-result p5

    if-eqz p5, :cond_1

    invoke-virtual {p0}, LNV3$a;->d()Landroid/widget/Magnifier;

    move-result-object p5

    invoke-static {p1, p2}, LCe3;->o(J)F

    move-result v0

    invoke-static {p1, p2}, LCe3;->p(J)F

    move-result p1

    invoke-static {p3, p4}, LCe3;->o(J)F

    move-result p2

    invoke-static {p3, p4}, LCe3;->p(J)F

    move-result p3

    invoke-static {p5, v0, p1, p2, p3}, LXV3;->a(Landroid/widget/Magnifier;FFFF)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LNV3$a;->d()Landroid/widget/Magnifier;

    move-result-object p3

    invoke-static {p1, p2}, LCe3;->o(J)F

    move-result p4

    invoke-static {p1, p2}, LCe3;->p(J)F

    move-result p1

    invoke-static {p3, p4, p1}, LLV3;->a(Landroid/widget/Magnifier;FF)V

    :goto_0
    return-void
.end method
