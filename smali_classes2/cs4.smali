.class public final Lcs4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBN2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<VM:",
        "LRN2<",
        "TS;>;S::",
        "LAN2;",
        ">",
        "Ljava/lang/Object;",
        "LBN2<",
        "TVM;TS;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000*\u000e\u0008\u0000\u0010\u0002*\u0008\u0012\u0004\u0012\u00028\u00010\u0001*\u0008\u0008\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010JM\u0010\r\u001a\u00028\u00012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000\u00062\u000e\u0010\u0008\u001a\n\u0012\u0006\u0008\u0001\u0012\u00028\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcs4;",
        "LRN2;",
        "VM",
        "LAN2;",
        "S",
        "LBN2;",
        "Ljava/lang/Class;",
        "viewModelClass",
        "stateClass",
        "LPr6;",
        "viewModelContext",
        "LIP5;",
        "stateRestorer",
        "a",
        "(Ljava/lang/Class;Ljava/lang/Class;LPr6;LIP5;)LAN2;",
        "<init>",
        "()V",
        "mvrx_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;Ljava/lang/Class;LPr6;LIP5;)LAN2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+TVM;>;",
            "Ljava/lang/Class<",
            "+TS;>;",
            "LPr6;",
            "LIP5<",
            "TVM;TS;>;)TS;"
        }
    .end annotation

    const-string v0, "viewModelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModelContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p4, :cond_1

    invoke-virtual {p4}, LIP5;->c()Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :cond_1
    :goto_0
    if-eqz p4, :cond_3

    invoke-virtual {p4}, LIP5;->a()Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    move-object p2, v0

    :cond_3
    :goto_1
    invoke-static {p1, p3}, LDN2;->a(Ljava/lang/Class;LPr6;)LAN2;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-virtual {p3}, LPr6;->e()Ljava/lang/Object;

    move-result-object p3

    invoke-static {p1, p2, p3}, LDN2;->b(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Object;)LAN2;

    move-result-object v0

    :cond_4
    if-eqz p4, :cond_6

    invoke-virtual {p4}, LIP5;->b()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LAN2;

    if-nez p1, :cond_5

    goto :goto_2

    :cond_5
    move-object v0, p1

    :cond_6
    :goto_2
    return-object v0
.end method
