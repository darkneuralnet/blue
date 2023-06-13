.class public final Lie3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u001a/\u0010\u0006\u001a\u00020\u0004\"\u000c\u0008\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u00002\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "LgV2$c;",
        "Lhe3;",
        "T",
        "Lkotlin/Function0;",
        "",
        "block",
        "a",
        "(LgV2$c;Lkotlin/jvm/functions/Function0;)V",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nObserverNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserverNode.kt\nandroidx/compose/ui/node/ObserverNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"
    }
.end annotation


# direct methods
.method public static final a(LgV2$c;Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "LgV2$c;",
            ":",
            "Lhe3;",
            ">(TT;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LgV2$c;->N()LsV2;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, LsV2;

    move-object v1, p0

    check-cast v1, Lhe3;

    invoke-direct {v0, v1}, LsV2;-><init>(Lhe3;)V

    invoke-virtual {p0, v0}, LgV2$c;->Z(LsV2;)V

    :cond_0
    invoke-static {p0}, LwZ0;->i(LvZ0;)LjD3;

    move-result-object p0

    invoke-interface {p0}, LjD3;->l()LmD3;

    move-result-object p0

    sget-object v1, LsV2;->c:LsV2$b;

    invoke-virtual {v1}, LsV2$b;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, LmD3;->h(LlD3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
