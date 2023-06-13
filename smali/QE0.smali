.class public abstract LQE0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQE0$a;,
        LQE0$b;,
        LQE0$c;,
        LQE0$d;,
        LQE0$e;,
        LQE0$f;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u0000 \t2\u00020\u0001:\u0006\t\u000b\u000e\u0013\u0014\u0015B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J/\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002H \u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0010\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0010\u001a\u00020\r8PX\u0090\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u0082\u0001\u0005\u0016\u0017\u0018\u0019\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "LQE0;",
        "",
        "",
        "size",
        "Lpm2;",
        "layoutDirection",
        "LOU3;",
        "placeable",
        "beforeCrossAxisAlignmentLine",
        "a",
        "(ILpm2;LOU3;I)I",
        "b",
        "(LOU3;)Ljava/lang/Integer;",
        "",
        "c",
        "()Z",
        "isRelative",
        "<init>",
        "()V",
        "d",
        "e",
        "f",
        "LQE0$a;",
        "LQE0$c;",
        "LQE0$d;",
        "LQE0$e;",
        "LQE0$f;",
        "foundation-layout_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LQE0$b;

.field public static final b:LQE0;

.field public static final c:LQE0;

.field public static final d:LQE0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LQE0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LQE0$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LQE0;->a:LQE0$b;

    sget-object v0, LQE0$a;->e:LQE0$a;

    sput-object v0, LQE0;->b:LQE0;

    sget-object v0, LQE0$e;->e:LQE0$e;

    sput-object v0, LQE0;->c:LQE0;

    sget-object v0, LQE0$c;->e:LQE0$c;

    sput-object v0, LQE0;->d:LQE0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, LQE0;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(ILpm2;LOU3;I)I
.end method

.method public b(LOU3;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "placeable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
