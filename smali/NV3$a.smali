.class public LNV3$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEV3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LNV3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J-\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0008\u0010\u000b\u001a\u00020\u0002H\u0016R\u0017\u0010\u0011\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u001d\u0010\u0014\u001a\u00020\u00128VX\u0096\u0004\u00f8\u0001\u0001\u00f8\u0001\u0000\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u0013\u0082\u0002\u000f\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006\u0017"
    }
    d2 = {
        "LNV3$a;",
        "LEV3;",
        "",
        "c",
        "LCe3;",
        "sourceCenter",
        "magnifierCenter",
        "",
        "zoom",
        "b",
        "(JJF)V",
        "dismiss",
        "Landroid/widget/Magnifier;",
        "a",
        "Landroid/widget/Magnifier;",
        "d",
        "()Landroid/widget/Magnifier;",
        "magnifier",
        "LG52;",
        "()J",
        "size",
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


# instance fields
.field public final a:Landroid/widget/Magnifier;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/widget/Magnifier;)V
    .locals 1

    const-string v0, "magnifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNV3$a;->a:Landroid/widget/Magnifier;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, LNV3$a;->a:Landroid/widget/Magnifier;

    invoke-static {v0}, LIV3;->a(Landroid/widget/Magnifier;)I

    move-result v0

    iget-object v1, p0, LNV3$a;->a:Landroid/widget/Magnifier;

    invoke-static {v1}, LJV3;->a(Landroid/widget/Magnifier;)I

    move-result v1

    invoke-static {v0, v1}, LH52;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public b(JJF)V
    .locals 0

    iget-object p3, p0, LNV3$a;->a:Landroid/widget/Magnifier;

    invoke-static {p1, p2}, LCe3;->o(J)F

    move-result p4

    invoke-static {p1, p2}, LCe3;->p(J)F

    move-result p1

    invoke-static {p3, p4, p1}, LLV3;->a(Landroid/widget/Magnifier;FF)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, LNV3$a;->a:Landroid/widget/Magnifier;

    invoke-static {v0}, LKV3;->a(Landroid/widget/Magnifier;)V

    return-void
.end method

.method public final d()Landroid/widget/Magnifier;
    .locals 1

    iget-object v0, p0, LNV3$a;->a:Landroid/widget/Magnifier;

    return-object v0
.end method

.method public dismiss()V
    .locals 1

    iget-object v0, p0, LNV3$a;->a:Landroid/widget/Magnifier;

    invoke-static {v0}, LMV3;->a(Landroid/widget/Magnifier;)V

    return-void
.end method
