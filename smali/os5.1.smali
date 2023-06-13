.class public final Los5;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LK1<",
        "Lkotlin/Function<",
        "+",
        "Ljava/lang/Boolean;",
        ">;>;",
        "LK1<",
        "Lkotlin/Function<",
        "+",
        "Ljava/lang/Boolean;",
        ">;>;",
        "LK1<",
        "Lkotlin/Function<",
        "+",
        "Ljava/lang/Boolean;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u000e\u0008\u0000\u0010\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0003H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Function;",
        "",
        "T",
        "LK1;",
        "parentValue",
        "childValue",
        "a",
        "(LK1;LK1;)LK1;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt$ActionPropertyKey$1\n*L\n1#1,1195:1\n*E\n"
    }
.end annotation


# static fields
.field public static final g:Los5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Los5;

    invoke-direct {v0}, Los5;-><init>()V

    sput-object v0, Los5;->g:Los5;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LK1;LK1;)LK1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LK1<",
            "Lkotlin/Function<",
            "+",
            "Ljava/lang/Boolean;",
            ">;>;",
            "LK1<",
            "Lkotlin/Function<",
            "+",
            "Ljava/lang/Boolean;",
            ">;>;)",
            "LK1<",
            "Lkotlin/Function<",
            "+",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    const-string v0, "childValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LK1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LK1;->b()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    invoke-virtual {p2}, LK1;->b()Ljava/lang/String;

    move-result-object v1

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, LK1;->a()Lkotlin/Function;

    move-result-object p1

    if-nez p1, :cond_3

    :cond_2
    invoke-virtual {p2}, LK1;->a()Lkotlin/Function;

    move-result-object p1

    :cond_3
    invoke-direct {v0, v1, p1}, LK1;-><init>(Ljava/lang/String;Lkotlin/Function;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LK1;

    check-cast p2, LK1;

    invoke-virtual {p0, p1, p2}, Los5;->a(LK1;LK1;)LK1;

    move-result-object p1

    return-object p1
.end method
