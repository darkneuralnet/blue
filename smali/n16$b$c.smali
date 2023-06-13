.class public final Ln16$b$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln16$b;->a(Ls16;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ls16;",
        "LN91;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Ls16;",
        "LN91;",
        "a",
        "(Ls16;)LN91;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Ln16$b$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln16$b$c;

    invoke-direct {v0}, Ln16$b$c;-><init>()V

    sput-object v0, Ln16$b$c;->g:Ln16$b$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ls16;)LN91;
    .locals 3

    const-string v0, "$this$deleteIfSelectedOr"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYZ0;

    invoke-virtual {p1}, LuE;->w()J

    move-result-wide v1

    invoke-static {v1, v2}, Ls26;->i(J)I

    move-result v1

    invoke-virtual {p1}, LuE;->s()I

    move-result p1

    sub-int/2addr v1, p1

    const/4 p1, 0x0

    invoke-direct {v0, v1, p1}, LYZ0;-><init>(II)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ls16;

    invoke-virtual {p0, p1}, Ln16$b$c;->a(Ls16;)LN91;

    move-result-object p1

    return-object p1
.end method
