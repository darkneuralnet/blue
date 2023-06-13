.class public final LsC6$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LsC6;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LsC6$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"
    }
    d2 = {
        "Landroid/view/View;",
        "rootView",
        "Lqs4;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final b:LsC6$a$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LsC6$a$a;

    invoke-direct {v0}, LsC6$a$a;-><init>()V

    sput-object v0, LsC6$a$a;->b:LsC6$a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)Lqs4;
    .locals 2

    const-string v0, "rootView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p1, v0, v0, v1, v0}, Landroidx/compose/ui/platform/WindowRecomposer_androidKt;->c(Landroid/view/View;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/f;ILjava/lang/Object;)Lqs4;

    move-result-object p1

    return-object p1
.end method
