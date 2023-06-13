.class public final LMz3$c;
.super LMz3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMz3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000c\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0013\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0008\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\u000c\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\t\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u000e\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "LMz3$c;",
        "LMz3;",
        "",
        "other",
        "",
        "equals",
        "",
        "hashCode",
        "LWb5;",
        "a",
        "LWb5;",
        "()LWb5;",
        "roundRect",
        "LcJ3;",
        "b",
        "LcJ3;",
        "()LcJ3;",
        "roundRectPath",
        "<init>",
        "(LWb5;)V",
        "ui-graphics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/Outline$Rounded\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,307:1\n1#2:308\n*E\n"
    }
.end annotation


# instance fields
.field public final a:LWb5;

.field public final b:LcJ3;


# direct methods
.method public constructor <init>(LWb5;)V
    .locals 2

    const-string v0, "roundRect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LMz3;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LMz3$c;->a:LWb5;

    invoke-static {p1}, LNz3;->a(LWb5;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Ltd;->a()LcJ3;

    move-result-object v0

    invoke-interface {v0, p1}, LcJ3;->g(LWb5;)V

    :cond_0
    iput-object v0, p0, LMz3$c;->b:LcJ3;

    return-void
.end method


# virtual methods
.method public final a()LWb5;
    .locals 1

    iget-object v0, p0, LMz3$c;->a:LWb5;

    return-object v0
.end method

.method public final b()LcJ3;
    .locals 1

    iget-object v0, p0, LMz3$c;->b:LcJ3;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LMz3$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, LMz3$c;->a:LWb5;

    check-cast p1, LMz3$c;

    iget-object p1, p1, LMz3$c;->a:LWb5;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LMz3$c;->a:LWb5;

    invoke-virtual {v0}, LWb5;->hashCode()I

    move-result v0

    return v0
.end method
