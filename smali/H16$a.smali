.class public final LH16$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH16;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u000e"
    }
    d2 = {
        "LH16$a;",
        "",
        "Lpm0;",
        "color",
        "LH16;",
        "b",
        "(J)LH16;",
        "La30;",
        "brush",
        "",
        "alpha",
        "a",
        "<init>",
        "()V",
        "ui-text_release"
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
        "SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,148:1\n646#2:149\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/TextForegroundStyle$Companion\n*L\n77#1:149\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic a:LH16$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LH16$a;

    invoke-direct {v0}, LH16$a;-><init>()V

    sput-object v0, LH16$a;->a:LH16$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(La30;F)LH16;
    .locals 2

    if-nez p1, :cond_0

    sget-object p1, LH16$b;->b:LH16$b;

    goto :goto_0

    :cond_0
    instance-of v0, p1, LpN5;

    if-eqz v0, :cond_1

    check-cast p1, LpN5;

    invoke-virtual {p1}, LpN5;->b()J

    move-result-wide v0

    invoke-static {v0, v1, p2}, La16;->c(JF)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, LH16$a;->b(J)LH16;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, LLx5;

    if-eqz v0, :cond_2

    new-instance v0, Lc30;

    check-cast p1, LLx5;

    invoke-direct {v0, p1, p2}, Lc30;-><init>(LLx5;F)V

    move-object p1, v0

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final b(J)LH16;
    .locals 2

    sget-object v0, Lpm0;->b:Lpm0$a;

    invoke-virtual {v0}, Lpm0$a;->g()J

    move-result-wide v0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    new-instance v0, LHm0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, LHm0;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    sget-object v0, LH16$b;->b:LH16$b;

    :goto_1
    return-object v0
.end method
