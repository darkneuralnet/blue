.class public final LG73;
.super LZy0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG73$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LZy0<",
        "LP73;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \r2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0015\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\u000f"
    }
    d2 = {
        "LG73;",
        "LZy0;",
        "LP73;",
        "LHG6;",
        "workSpec",
        "",
        "b",
        "value",
        "i",
        "Ldz0;",
        "tracker",
        "<init>",
        "(Ldz0;)V",
        "f",
        "a",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final f:LG73$a;

.field public static final g:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LG73$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LG73$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LG73;->f:LG73$a;

    const-string v0, "NetworkMeteredCtrlr"

    invoke-static {v0}, LBx2;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "tagWithPrefix(\"NetworkMeteredCtrlr\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LG73;->g:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ldz0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldz0<",
            "LP73;",
            ">;)V"
        }
    .end annotation

    const-string v0, "tracker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LZy0;-><init>(Ldz0;)V

    return-void
.end method


# virtual methods
.method public b(LHG6;)Z
    .locals 1

    const-string v0, "workSpec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, LHG6;->j:Llz0;

    invoke-virtual {p1}, Llz0;->d()LS73;

    move-result-object p1

    sget-object v0, LS73;->f:LS73;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LP73;

    invoke-virtual {p0, p1}, LG73;->i(LP73;)Z

    move-result p1

    return p1
.end method

.method public i(LP73;)Z
    .locals 5

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ge v0, v1, :cond_0

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object v0

    sget-object v1, LG73;->g:Ljava/lang/String;

    const-string v4, "Metered network constraint is not supported before API 26, only checking for connected state."

    invoke-virtual {v0, v1, v4}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, LP73;->a()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, LP73;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LP73;->b()Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    :goto_0
    move v2, v3

    :cond_2
    return v2
.end method
