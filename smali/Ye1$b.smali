.class public final LYe1$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYe1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ltf;",
        "Landroidx/compose/ui/graphics/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ltf;",
        "it",
        "Landroidx/compose/ui/graphics/f;",
        "a",
        "(Ltf;)J"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LYe1$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LYe1$b;

    invoke-direct {v0}, LYe1$b;-><init>()V

    sput-object v0, LYe1$b;->g:LYe1$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ltf;)J
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ltf;->f()F

    move-result v0

    invoke-virtual {p1}, Ltf;->g()F

    move-result p1

    invoke-static {v0, p1}, Ln96;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ltf;

    invoke-virtual {p0, p1}, LYe1$b;->a(Ltf;)J

    move-result-wide v0

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/f;->b(J)Landroidx/compose/ui/graphics/f;

    move-result-object p1

    return-object p1
.end method