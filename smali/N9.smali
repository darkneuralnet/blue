.class public final LN9;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\u001c\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\"\u0017\u0010\t\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0006\u0010\u0008\"\u0017\u0010\u000b\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0007\u001a\u0004\u0008\n\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "LL9;",
        "",
        "position1",
        "position2",
        "c",
        "LYM1;",
        "a",
        "LYM1;",
        "()LYM1;",
        "FirstBaseline",
        "b",
        "LastBaseline",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LYM1;

.field public static final b:LYM1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LYM1;

    sget-object v1, LN9$a;->b:LN9$a;

    invoke-direct {v0, v1}, LYM1;-><init>(Lkotlin/jvm/functions/Function2;)V

    sput-object v0, LN9;->a:LYM1;

    new-instance v0, LYM1;

    sget-object v1, LN9$b;->b:LN9$b;

    invoke-direct {v0, v1}, LYM1;-><init>(Lkotlin/jvm/functions/Function2;)V

    sput-object v0, LN9;->b:LYM1;

    return-void
.end method

.method public static final a()LYM1;
    .locals 1

    sget-object v0, LN9;->a:LYM1;

    return-object v0
.end method

.method public static final b()LYM1;
    .locals 1

    sget-object v0, LN9;->b:LYM1;

    return-object v0
.end method

.method public static final c(LL9;II)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LL9;->a()Lkotlin/jvm/functions/Function2;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method
